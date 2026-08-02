package com.squareup.cash.clientsync.telemetry;

import com.squareup.cash.observability.backend.api.SpanTracking;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;

/* loaded from: classes.dex */
public final class RealClientSyncTracer {
    public final RealObservabilityManager observabilityManager;

    public RealClientSyncTracer(RealObservabilityManager realObservabilityManager) {
        this.observabilityManager = realObservabilityManager;
    }

    public final RealClientSyncSpan start(String str, RealClientSyncSpan realClientSyncSpan) {
        return new RealClientSyncSpan(realClientSyncSpan == null ? RealObservabilityManager.startTrackingSpan$default(this.observabilityManager, null, str, null, null, 12) : SpanTracking.childSpanStarted$default(realClientSyncSpan.getSpanTracking$real(), null, str, null, 12));
    }
}
