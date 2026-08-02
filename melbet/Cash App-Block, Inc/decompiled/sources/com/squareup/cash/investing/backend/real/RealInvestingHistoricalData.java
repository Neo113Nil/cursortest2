package com.squareup.cash.investing.backend.real;

import com.squareup.cash.CashApp$onCreate$4$1$1;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.investing.backend.api.InvestingDataRefresher;
import com.squareup.cash.investing.backend.api.NetworkStatus;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.marketprices.service.MarketPricesAppService;
import com.squareup.protos.cash.portfolios.PortfoliosService;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.util.coroutines.Signal;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes.dex */
public final class RealInvestingHistoricalData implements InvestingDataRefresher {
    public final AppService appService;
    public final StateFlowImpl bitcoinNetworkStatus;
    public final PersistentHistoricalDataCache cache;
    public final AndroidClock clock;
    public final CoroutineContext computationDispatcher;
    public final StateFlowImpl entityNetworkStatus;
    public final RealInvestmentEntities investmentEntities;
    public final RealInvestmentPerformanceSyncer investmentPerformanceSyncer;
    public final MarketPricesAppService marketPricesService;
    public final StateFlowImpl portfolioNetworkStatus;
    public final PortfoliosService portfoliosService;
    public final RealProfileManager profileManager;
    public final Signal signOut;
    public final SharedFlowImpl tickerFlow;

    public RealInvestingHistoricalData(AppService appService, MarketPricesAppService marketPricesAppService, PortfoliosService portfoliosService, RealProfileManager realProfileManager, PersistentHistoricalDataCache persistentHistoricalDataCache, AndroidClock androidClock, RealInvestmentPerformanceSyncer realInvestmentPerformanceSyncer, RealInvestmentEntities realInvestmentEntities, Signal signal, CoroutineContext coroutineContext, CoroutineScope coroutineScope) {
        this.appService = appService;
        this.marketPricesService = marketPricesAppService;
        this.portfoliosService = portfoliosService;
        this.profileManager = realProfileManager;
        this.cache = persistentHistoricalDataCache;
        this.clock = androidClock;
        this.investmentPerformanceSyncer = realInvestmentPerformanceSyncer;
        this.investmentEntities = realInvestmentEntities;
        this.signOut = signal;
        this.computationDispatcher = coroutineContext;
        NetworkStatus.Available available = NetworkStatus.Available.INSTANCE;
        this.portfolioNetworkStatus = FlowKt.MutableStateFlow(available);
        this.bitcoinNetworkStatus = FlowKt.MutableStateFlow(available);
        this.entityNetworkStatus = FlowKt.MutableStateFlow(available);
        this.tickerFlow = FlowKt.MutableSharedFlow$default(1, 0, null, 6);
        JobKt.launch$default(coroutineScope, null, null, new CashApp$onCreate$4$1$1(this, null, 25), 3);
    }

    @Override // com.squareup.cash.investing.backend.api.InvestingDataRefresher
    public final Object refresh(InvestingTaskModule$Companion$provideInvestingLiveIntervalRepeatTask$1 investingTaskModule$Companion$provideInvestingLiveIntervalRepeatTask$1) {
        Unit unit = Unit.INSTANCE;
        Object emit = this.tickerFlow.emit(unit, investingTaskModule$Companion$provideInvestingLiveIntervalRepeatTask$1);
        return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : unit;
    }
}
