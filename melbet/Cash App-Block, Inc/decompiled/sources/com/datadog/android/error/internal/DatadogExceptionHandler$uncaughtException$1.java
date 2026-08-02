package com.datadog.android.error.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class DatadogExceptionHandler$uncaughtException$1 extends Lambda implements Function0 {
    public static final DatadogExceptionHandler$uncaughtException$1 INSTANCE;
    public static final DatadogExceptionHandler$uncaughtException$1 INSTANCE$1;
    public static final DatadogExceptionHandler$uncaughtException$1 INSTANCE$2;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 0;
        INSTANCE$1 = new DatadogExceptionHandler$uncaughtException$1(i, 1);
        INSTANCE = new DatadogExceptionHandler$uncaughtException$1(i, 0);
        INSTANCE$2 = new DatadogExceptionHandler$uncaughtException$1(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DatadogExceptionHandler$uncaughtException$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return "RUM feature is not registered, won't report crash as RUM event.";
            case 1:
                return "Failed to get all threads dump";
            default:
                return "Datadog SDK is in an unexpected state due to an ongoing crash. Some events could be lost.";
        }
    }
}
