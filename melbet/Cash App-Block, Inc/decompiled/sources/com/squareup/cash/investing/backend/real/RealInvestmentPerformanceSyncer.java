package com.squareup.cash.investing.backend.real;

import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.investing.components.InvestingHomeView$onScrollFlow$1;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.protos.cash.portfolios.PortfoliosService;
import com.squareup.util.coroutines.Signal;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public final class RealInvestmentPerformanceSyncer {
    public final CoroutineContext ioDispatcher;
    public final GpsConfigQueries queries;
    public final PortfoliosService service;
    public final Signal signOutSignal;

    public RealInvestmentPerformanceSyncer(Signal signal, CoroutineContext coroutineContext, PortfoliosService portfoliosService, CashAccountDatabaseImpl cashAccountDatabaseImpl) {
        this.signOutSignal = signal;
        this.ioDispatcher = coroutineContext;
        this.service = portfoliosService;
        this.queries = cashAccountDatabaseImpl.investmentPerformanceQueries;
    }

    public static Object syncPerformance$default(RealInvestmentPerformanceSyncer realInvestmentPerformanceSyncer, InvestmentEntityToken investmentEntityToken, SuspendLambda suspendLambda) {
        Continuation continuation = null;
        return JobKt.withContext(realInvestmentPerformanceSyncer.ioDispatcher, new InvestingHomeView$onScrollFlow$1(investmentEntityToken, continuation, realInvestmentPerformanceSyncer, continuation, 2), suspendLambda);
    }
}
