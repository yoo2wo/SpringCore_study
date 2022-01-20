package hello.core.filter;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

public class ComponentFileterAppConfigTest {

    @Test
    void filterScan(){
        new AnnotationConfigApplicationContext();
    }

    @Configuration
    @ComponentScan (includeFilters = @ComponentScan.Filter(type = FilterType.ANN))
}
