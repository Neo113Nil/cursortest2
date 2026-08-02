package com.datadog.trace.logger;

import com.google.android.gms.auth.api.zbc;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class DatadogCoreTracerLogger$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ zbc f$0;

    public /* synthetic */ DatadogCoreTracerLogger$$ExternalSyntheticLambda0(zbc zbcVar, int i) {
        this.$r8$classId = i;
        this.f$0 = zbcVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        zbc zbcVar = this.f$0;
        switch (i) {
            case 0:
                return zbc.bundleMessageWithTitle((String) zbcVar.zbb, "Error while finalizing DDTracer.");
            default:
                return zbc.bundleMessageWithTitle((String) zbcVar.zbb, "Error closing request context data");
        }
    }
}
