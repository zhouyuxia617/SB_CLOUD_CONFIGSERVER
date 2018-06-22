package cn.et;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 配置中心
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServer {

	/**
	 * 分布式的配置中心，一处修改多处生效
	 */
	public static void main(String[] args) {
		SpringApplication.run(ConfigServer.class,args);
	}
}
