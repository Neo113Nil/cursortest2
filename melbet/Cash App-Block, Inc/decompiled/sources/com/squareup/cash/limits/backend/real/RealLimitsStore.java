package com.squareup.cash.limits.backend.real;

import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.protos.cash.cashlimitsxp.api.v1.LimitsHubService;

/* loaded from: classes6.dex */
public final class RealLimitsStore implements HasObservability {
    public final ErrorReporter errorReporter;
    public final LimitsHubService limitsHubService;
    public final SampleStrategy oneErrorPerAppSessionStrategy;

    public RealLimitsStore(LimitsHubService limitsHubService, ErrorReporter errorReporter, SampleStrategy sampleStrategy) {
        this.limitsHubService = limitsHubService;
        this.errorReporter = errorReporter;
        this.oneErrorPerAppSessionStrategy = sampleStrategy;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final SampleStrategy getOneErrorPerAppSessionStrategy() {
        return this.oneErrorPerAppSessionStrategy;
    }
}
