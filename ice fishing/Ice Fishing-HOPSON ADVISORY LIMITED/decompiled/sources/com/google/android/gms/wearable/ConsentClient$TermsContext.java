package com.google.android.gms.wearable;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
@Target({ElementType.TYPE_USE, ElementType.PARAMETER})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface ConsentClient$TermsContext {
    public static final int DEFAULT_V1 = 0;
    public static final int SUPERVISED_CHILD_V1 = 1;
    public static final int SUPERVISED_CHILD_V2 = 2;
}
