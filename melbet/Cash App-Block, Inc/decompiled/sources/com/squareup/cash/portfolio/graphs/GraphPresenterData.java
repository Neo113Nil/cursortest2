package com.squareup.cash.portfolio.graphs;

import androidx.collection.SparseArrayCompat;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import kotlin.ranges.LongRange;

/* loaded from: classes6.dex */
public final class GraphPresenterData {
    public final InvestingGraphContentModel contentModel;
    public final HistoricalRange range;
    public final SparseArrayCompat ticks;
    public final LongRange timeRangeMilliseconds;

    public GraphPresenterData(SparseArrayCompat sparseArrayCompat, HistoricalRange historicalRange, InvestingGraphContentModel investingGraphContentModel, LongRange longRange) {
        historicalRange.getClass();
        this.ticks = sparseArrayCompat;
        this.range = historicalRange;
        this.contentModel = investingGraphContentModel;
        this.timeRangeMilliseconds = longRange;
    }

    public static GraphPresenterData copy$default(GraphPresenterData graphPresenterData, SparseArrayCompat sparseArrayCompat, InvestingGraphContentModel investingGraphContentModel, int i) {
        if ((i & 1) != 0) {
            sparseArrayCompat = graphPresenterData.ticks;
        }
        HistoricalRange historicalRange = graphPresenterData.range;
        LongRange longRange = graphPresenterData.timeRangeMilliseconds;
        graphPresenterData.getClass();
        historicalRange.getClass();
        return new GraphPresenterData(sparseArrayCompat, historicalRange, investingGraphContentModel, longRange);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GraphPresenterData) {
            GraphPresenterData graphPresenterData = (GraphPresenterData) obj;
            if (this.ticks == graphPresenterData.ticks && this.range == graphPresenterData.range && this.contentModel.equals(graphPresenterData.contentModel) && this.timeRangeMilliseconds.equals(graphPresenterData.timeRangeMilliseconds)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.timeRangeMilliseconds.hashCode() + ((this.contentModel.hashCode() + ((this.range.hashCode() + (this.ticks.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "GraphPresenterData(ticks=" + this.ticks + ", range=" + this.range + ", contentModel=" + this.contentModel + ", timeRangeMilliseconds=" + this.timeRangeMilliseconds + ")";
    }
}
