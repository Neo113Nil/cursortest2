package com.nimbusds.jose.shaded.gson.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes5.dex */
public @interface SerializedName {
    String[] alternate() default {};

    String value();
}
