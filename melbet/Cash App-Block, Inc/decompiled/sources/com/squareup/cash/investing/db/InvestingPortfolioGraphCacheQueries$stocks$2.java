package com.squareup.cash.investing.db;

import com.squareup.protos.cash.portfolios.BalanceHistory;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class InvestingPortfolioGraphCacheQueries$stocks$2 extends FunctionReferenceImpl implements Function2 {
    public static final InvestingPortfolioGraphCacheQueries$stocks$2 INSTANCE = new InvestingPortfolioGraphCacheQueries$stocks$2(2, Investing_stocks_portfolio_graph_cache.class, "<init>", "<init>(Lcom/squareup/protos/franklin/investing/common/HistoricalRange;Lcom/squareup/protos/cash/portfolios/BalanceHistory;)V", 0);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        HistoricalRange historicalRange = (HistoricalRange) obj;
        BalanceHistory balanceHistory = (BalanceHistory) obj2;
        historicalRange.getClass();
        balanceHistory.getClass();
        return new Investing_stocks_portfolio_graph_cache(historicalRange, balanceHistory);
    }
}
