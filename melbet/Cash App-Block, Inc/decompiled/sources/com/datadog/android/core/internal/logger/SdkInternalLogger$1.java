package com.datadog.android.core.internal.logger;

import androidx.collection.internal.Lock;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class SdkInternalLogger$1 extends Lambda implements Function0 {
    public static final SdkInternalLogger$1 INSTANCE = new SdkInternalLogger$1(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new Lock(10);
    }
}
