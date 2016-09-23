package com.zheng.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by zhenglian on 2016/9/23.
 */
@Configuration
@ImportResource(locations={"classpath:applicationContext-bean.xml"})
public class ConfigClass {
}
