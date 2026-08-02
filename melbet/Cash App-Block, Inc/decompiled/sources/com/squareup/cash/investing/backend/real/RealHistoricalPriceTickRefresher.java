package com.squareup.cash.investing.backend.real;

import com.squareup.cash.boost.db.Reward$Adapter;
import com.squareup.cash.investing.backend.api.NetworkStatus;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.portfolios.PortfoliosService;
import java.util.LinkedHashMap;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes6.dex */
public final class RealHistoricalPriceTickRefresher {
    public final AndroidClock clock;
    public final CoroutineContext computationDispatcher;
    public final CoroutineScope scope;
    public final PortfoliosService service;
    public final StateFlowImpl stocksActive;
    public final StateFlowImpl stocksActiveOverride;
    public final StateFlowImpl stocksNetworkStatus = FlowKt.MutableStateFlow(NetworkStatus.Available.INSTANCE);
    public final LinkedHashMap polledStockFlows = new LinkedHashMap();

    public RealHistoricalPriceTickRefresher(PortfoliosService portfoliosService, AndroidClock androidClock, Reward$Adapter reward$Adapter, CoroutineContext coroutineContext, CoroutineScope coroutineScope) {
        this.service = portfoliosService;
        this.clock = androidClock;
        this.computationDispatcher = coroutineContext;
        this.scope = coroutineScope;
        Boolean bool = Boolean.FALSE;
        this.stocksActive = FlowKt.MutableStateFlow(bool);
        FlowKt.MutableStateFlow(bool);
        this.stocksActiveOverride = FlowKt.MutableStateFlow(bool);
    }
}
