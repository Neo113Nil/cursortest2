package com.datadog.android.rum.model;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class ResourceEvent$Path$Companion$fromJsonElement$message$1 extends Lambda implements Function1 {
    public static final ResourceEvent$Path$Companion$fromJsonElement$message$1 INSTANCE = new ResourceEvent$Path$Companion$fromJsonElement$message$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        th.getClass();
        return String.valueOf(th.getMessage());
    }
}
