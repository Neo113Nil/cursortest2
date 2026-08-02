package com.squareup.cash.investing.db;

import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.common.PriceHistory;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Investing_bitcoin_portfolio_graph_cache {
    public final PriceHistory data_;
    public final CurrencyCode profileCurrency;
    public final HistoricalRange range;

    public Investing_bitcoin_portfolio_graph_cache(CurrencyCode currencyCode, HistoricalRange historicalRange, PriceHistory priceHistory) {
        currencyCode.getClass();
        historicalRange.getClass();
        priceHistory.getClass();
        this.profileCurrency = currencyCode;
        this.range = historicalRange;
        this.data_ = priceHistory;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Investing_bitcoin_portfolio_graph_cache)) {
            return false;
        }
        Investing_bitcoin_portfolio_graph_cache investing_bitcoin_portfolio_graph_cache = (Investing_bitcoin_portfolio_graph_cache) obj;
        return this.profileCurrency == investing_bitcoin_portfolio_graph_cache.profileCurrency && this.range == investing_bitcoin_portfolio_graph_cache.range && Intrinsics.areEqual(this.data_, investing_bitcoin_portfolio_graph_cache.data_);
    }

    public final int hashCode() {
        return this.data_.hashCode() + ((this.range.hashCode() + (this.profileCurrency.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Investing_bitcoin_portfolio_graph_cache(profileCurrency=" + this.profileCurrency + ", range=" + this.range + ", data_=" + this.data_ + ")";
    }
}
