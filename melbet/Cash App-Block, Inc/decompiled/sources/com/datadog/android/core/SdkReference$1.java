package com.datadog.android.core;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class SdkReference$1 extends Lambda implements Function1 {
    public static final SdkReference$1 INSTANCE = new SdkReference$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((InternalSdkCore) obj).getClass();
        return Unit.INSTANCE;
    }
}
