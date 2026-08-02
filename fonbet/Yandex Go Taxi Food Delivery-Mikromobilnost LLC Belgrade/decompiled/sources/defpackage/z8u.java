package defpackage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes9.dex */
public @interface z8u {
    boolean allowUnsafeNonAsciiValues() default false;

    String value();
}
