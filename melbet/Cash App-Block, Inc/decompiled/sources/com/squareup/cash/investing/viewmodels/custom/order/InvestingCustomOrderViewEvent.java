package com.squareup.cash.investing.viewmodels.custom.order;

import com.squareup.cash.multiplatform.investing.PriceValue;
import com.squareup.protos.franklin.investing.common.HistoricalRange;

/* loaded from: classes6.dex */
public abstract class InvestingCustomOrderViewEvent {

    public final class BackPressed extends InvestingCustomOrderViewEvent {
        public static final BackPressed INSTANCE = new BackPressed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackPressed);
        }

        public final int hashCode() {
            return 390878689;
        }

        public final String toString() {
            return "BackPressed";
        }
    }

    public final class CloseExplanation extends InvestingCustomOrderViewEvent {
        public static final CloseExplanation INSTANCE = new CloseExplanation();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseExplanation);
        }

        public final int hashCode() {
            return 846335003;
        }

        public final String toString() {
            return "CloseExplanation";
        }
    }

    public final class GraphReset extends InvestingCustomOrderViewEvent {
        public static final GraphReset INSTANCE = new GraphReset();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GraphReset);
        }

        public final int hashCode() {
            return 254625595;
        }

        public final String toString() {
            return "GraphReset";
        }
    }

    public final class KeypadPressed extends InvestingCustomOrderViewEvent {
        public static final KeypadPressed INSTANCE = new KeypadPressed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof KeypadPressed);
        }

        public final int hashCode() {
            return 1491817172;
        }

        public final String toString() {
            return "KeypadPressed";
        }
    }

    public final class MetricPressed extends InvestingCustomOrderViewEvent {
        public final long currentUsdPerShare;
        public final long targetUsdPerShare;

        public MetricPressed(long j, long j2) {
            this.currentUsdPerShare = j;
            this.targetUsdPerShare = j2;
        }
    }

    public final class OverlayPressed extends InvestingCustomOrderViewEvent {
        public static final OverlayPressed INSTANCE = new OverlayPressed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OverlayPressed);
        }

        public final int hashCode() {
            return 651354956;
        }

        public final String toString() {
            return "OverlayPressed";
        }
    }

    public final class PriceSet extends InvestingCustomOrderViewEvent {
        public final long currentUsdPerShare;
        public final long targetUsdPerShare;

        public PriceSet(long j, long j2) {
            this.currentUsdPerShare = j;
            this.targetUsdPerShare = j2;
        }
    }

    public final class SelectedPrice extends InvestingCustomOrderViewEvent {
        public final PriceValue priceValue;

        public SelectedPrice(PriceValue priceValue) {
            this.priceValue = priceValue;
        }
    }

    public final class SelectedRange extends InvestingCustomOrderViewEvent {
        public final HistoricalRange range;

        public SelectedRange(HistoricalRange historicalRange) {
            historicalRange.getClass();
            this.range = historicalRange;
        }
    }
}
