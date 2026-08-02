package com.squareup.cash.investing.db;

import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.common.PriceHistory;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class InvestingPortfolioGraphCacheQueries$bitcoin$2 extends FunctionReferenceImpl implements Function3 {
    public static final InvestingPortfolioGraphCacheQueries$bitcoin$2 INSTANCE = new InvestingPortfolioGraphCacheQueries$bitcoin$2(3, Investing_bitcoin_portfolio_graph_cache.class, "<init>", "<init>(Lcom/squareup/protos/common/CurrencyCode;Lcom/squareup/protos/franklin/investing/common/HistoricalRange;Lcom/squareup/protos/franklin/common/PriceHistory;)V", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CurrencyCode currencyCode = (CurrencyCode) obj;
        HistoricalRange historicalRange = (HistoricalRange) obj2;
        PriceHistory priceHistory = (PriceHistory) obj3;
        currencyCode.getClass();
        historicalRange.getClass();
        priceHistory.getClass();
        return new Investing_bitcoin_portfolio_graph_cache(currencyCode, historicalRange, priceHistory);
    }
}
