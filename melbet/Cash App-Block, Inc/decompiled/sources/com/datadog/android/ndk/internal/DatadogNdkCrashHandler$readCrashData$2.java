package com.datadog.android.ndk.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class DatadogNdkCrashHandler$readCrashData$2 extends Lambda implements Function0 {
    public static final DatadogNdkCrashHandler$readCrashData$2 INSTANCE;
    public static final DatadogNdkCrashHandler$readCrashData$2 INSTANCE$1;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 0;
        INSTANCE = new DatadogNdkCrashHandler$readCrashData$2(i, 0);
        INSTANCE$1 = new DatadogNdkCrashHandler$readCrashData$2(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DatadogNdkCrashHandler$readCrashData$2(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return "Error while trying to read the NDK crash directory";
            default:
                return "RUM feature is not registered, won't report NDK crash info as RUM error.";
        }
    }
}
