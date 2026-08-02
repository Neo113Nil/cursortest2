package com.squareup.cash.portfolio.graphs.viewmodels;

import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class InvestingGraphViewEvent {

    public final class ScrubPoint extends InvestingGraphViewEvent {
        public final InvestingGraphContentModel.Point point;

        public ScrubPoint(InvestingGraphContentModel.Point point) {
            this.point = point;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ScrubPoint) && Intrinsics.areEqual(this.point, ((ScrubPoint) obj).point);
        }

        public final int hashCode() {
            InvestingGraphContentModel.Point point = this.point;
            if (point == null) {
                return 0;
            }
            return point.hashCode();
        }

        public final String toString() {
            return "ScrubPoint(point=" + this.point + ")";
        }
    }

    public final class SelectRange extends InvestingGraphViewEvent {
        public final HistoricalRange range;

        public SelectRange(HistoricalRange historicalRange) {
            historicalRange.getClass();
            this.range = historicalRange;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectRange) && this.range == ((SelectRange) obj).range;
        }

        public final int hashCode() {
            return this.range.hashCode();
        }

        public final String toString() {
            return "SelectRange(range=" + this.range + ")";
        }
    }
}
