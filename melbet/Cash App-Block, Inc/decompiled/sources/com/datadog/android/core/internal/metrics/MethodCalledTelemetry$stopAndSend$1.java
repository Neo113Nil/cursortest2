package com.datadog.android.core.internal.metrics;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class MethodCalledTelemetry$stopAndSend$1 extends Lambda implements Function0 {
    public static final MethodCalledTelemetry$stopAndSend$1 INSTANCE;
    public static final MethodCalledTelemetry$stopAndSend$1 INSTANCE$1;
    public static final MethodCalledTelemetry$stopAndSend$1 INSTANCE$2;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 0;
        INSTANCE$1 = new MethodCalledTelemetry$stopAndSend$1(i, 1);
        INSTANCE$2 = new MethodCalledTelemetry$stopAndSend$1(i, 2);
        INSTANCE = new MethodCalledTelemetry$stopAndSend$1(i, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MethodCalledTelemetry$stopAndSend$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return "[Mobile Metric] Method Called";
            case 1:
                return "[Mobile Metric] Batch Closed";
            default:
                return "[Mobile Metric] Batch Deleted";
        }
    }
}
