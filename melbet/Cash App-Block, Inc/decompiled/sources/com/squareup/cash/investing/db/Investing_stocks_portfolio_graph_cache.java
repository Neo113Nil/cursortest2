package com.squareup.cash.investing.db;

import com.squareup.protos.cash.portfolios.BalanceHistory;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Investing_stocks_portfolio_graph_cache {
    public final BalanceHistory data_;
    public final HistoricalRange range;

    public Investing_stocks_portfolio_graph_cache(HistoricalRange historicalRange, BalanceHistory balanceHistory) {
        historicalRange.getClass();
        balanceHistory.getClass();
        this.range = historicalRange;
        this.data_ = balanceHistory;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Investing_stocks_portfolio_graph_cache)) {
            return false;
        }
        Investing_stocks_portfolio_graph_cache investing_stocks_portfolio_graph_cache = (Investing_stocks_portfolio_graph_cache) obj;
        return this.range == investing_stocks_portfolio_graph_cache.range && Intrinsics.areEqual(this.data_, investing_stocks_portfolio_graph_cache.data_);
    }

    public final int hashCode() {
        return this.data_.hashCode() + (this.range.hashCode() * 31);
    }

    public final String toString() {
        return "Investing_stocks_portfolio_graph_cache(range=" + this.range + ", data_=" + this.data_ + ")";
    }
}
