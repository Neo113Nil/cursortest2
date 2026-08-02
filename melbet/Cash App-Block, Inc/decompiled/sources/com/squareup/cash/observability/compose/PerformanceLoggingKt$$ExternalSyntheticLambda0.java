package com.squareup.cash.observability.compose;

import com.datadog.android.Datadog;
import com.datadog.android.rum.RumMonitor;
import com.squareup.cash.observability.backend.real.RealDatadogClient;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class PerformanceLoggingKt$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RealObservabilityManager f$0;

    public /* synthetic */ PerformanceLoggingKt$$ExternalSyntheticLambda0(RealObservabilityManager realObservabilityManager, int i) {
        this.$r8$classId = i;
        this.f$0 = realObservabilityManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        RealObservabilityManager realObservabilityManager = this.f$0;
        switch (i) {
            case 0:
                realObservabilityManager.addTiming("layout_finished");
                break;
            case 1:
                realObservabilityManager.addTiming("positioning_finished");
                break;
            default:
                RealDatadogClient realDatadogClient = realObservabilityManager.datadogClient;
                if (Datadog.isInitialized()) {
                    ((RumMonitor) realDatadogClient.rumMonitor.invoke()).addViewLoadingTime();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
