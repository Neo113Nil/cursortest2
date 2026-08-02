package com.datadog.android.telemetry.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class TelemetryEventHandler$canWrite$2 extends Lambda implements Function0 {
    public static final TelemetryEventHandler$canWrite$2 INSTANCE;
    public static final TelemetryEventHandler$canWrite$2 INSTANCE$1;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 0;
        INSTANCE = new TelemetryEventHandler$canWrite$2(i, 0);
        INSTANCE$1 = new TelemetryEventHandler$canWrite$2(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TelemetryEventHandler$canWrite$2(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return "Max number of telemetry events per session reached, rejecting.";
            default:
                return "GlobalDatadogTracer class exists in the runtime classpath, but there is an error invoking isRegistered method";
        }
    }
}
