package defpackage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes11.dex */
public @interface ysq0 {
    String[] alternate() default {};

    String value();
}
