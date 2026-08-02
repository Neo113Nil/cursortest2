package com.datadog.android.rum.internal.metric.networksettled;

import androidx.room.util.DBUtil;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.rum.metric.networksettled.InitialResourceIdentifier;
import com.fillr.n;
import java.util.HashSet;

/* loaded from: classes4.dex */
public final class NetworkSettledMetricResolver {
    public volatile n currentViewDiagnostic;
    public final InitialResourceIdentifier initialResourceIdentifier;
    public final InternalLogger internalLogger;
    public volatile Long lastComputedMetric;
    public volatile Long networkSettleMaxValue;
    public final HashSet resourceStartedTimestamps;
    public volatile Long viewCreatedTimestamp;
    public volatile boolean viewWasStopped;

    public NetworkSettledMetricResolver(InitialResourceIdentifier initialResourceIdentifier, InternalLogger internalLogger) {
        initialResourceIdentifier.getClass();
        internalLogger.getClass();
        this.initialResourceIdentifier = initialResourceIdentifier;
        this.internalLogger = internalLogger;
        this.resourceStartedTimestamps = new HashSet();
        this.currentViewDiagnostic = new n(11);
    }

    public final Long resolveMetric() {
        if (this.viewWasStopped) {
            return this.lastComputedMetric;
        }
        InternalLogger.Target target = InternalLogger.Target.MAINTAINER;
        Long l = null;
        if (this.viewCreatedTimestamp == null) {
            DBUtil.log$default(this.internalLogger, 2, target, NetworkSettledMetricResolver$computeMetric$1.INSTANCE, null, false, 56);
        } else if (this.resourceStartedTimestamps.size() > 0) {
            DBUtil.log$default(this.internalLogger, 2, target, NetworkSettledMetricResolver$computeMetric$1.INSTANCE$1, null, false, 56);
        } else {
            l = this.networkSettleMaxValue;
        }
        this.lastComputedMetric = l;
        return this.lastComputedMetric;
    }
}
