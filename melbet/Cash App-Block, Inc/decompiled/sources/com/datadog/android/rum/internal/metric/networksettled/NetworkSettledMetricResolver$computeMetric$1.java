package com.datadog.android.rum.internal.metric.networksettled;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class NetworkSettledMetricResolver$computeMetric$1 extends Lambda implements Function0 {
    public static final NetworkSettledMetricResolver$computeMetric$1 INSTANCE;
    public static final NetworkSettledMetricResolver$computeMetric$1 INSTANCE$1;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 0;
        INSTANCE = new NetworkSettledMetricResolver$computeMetric$1(i, 0);
        INSTANCE$1 = new NetworkSettledMetricResolver$computeMetric$1(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NetworkSettledMetricResolver$computeMetric$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return "[ViewNetworkSettledMetric] There was no view created yet for this resource";
            default:
                return "[ViewNetworkSettledMetric] Not all the initial resources were stopped for this view";
        }
    }
}
