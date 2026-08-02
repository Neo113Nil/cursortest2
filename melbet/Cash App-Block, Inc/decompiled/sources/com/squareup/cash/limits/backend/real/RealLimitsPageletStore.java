package com.squareup.cash.limits.backend.real;

import com.squareup.protos.cash.cashlimitsxp.api.v1.LimitsHubService;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class RealLimitsPageletStore {
    public final CoroutineContext ioDispatcher;
    public final LimitsHubService limitsHubService;

    public RealLimitsPageletStore(LimitsHubService limitsHubService, CoroutineContext coroutineContext) {
        this.limitsHubService = limitsHubService;
        this.ioDispatcher = coroutineContext;
    }
}
