package com.squareup.cash.portfolio.graphs.viewmodels;

import com.squareup.protos.franklin.investing.common.HistoricalRange;

/* loaded from: classes6.dex */
public final class InvestingGraphTimeRangeViewModel {
    public final HistoricalRange range;

    public InvestingGraphTimeRangeViewModel(HistoricalRange historicalRange) {
        historicalRange.getClass();
        this.range = historicalRange;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InvestingGraphTimeRangeViewModel) && this.range == ((InvestingGraphTimeRangeViewModel) obj).range;
    }

    public final int hashCode() {
        return this.range.hashCode();
    }

    public final String toString() {
        return "InvestingGraphTimeRangeViewModel(range=" + this.range + ")";
    }
}
