package com.squareup.cash.investing.viewmodels.metrics;

/* loaded from: classes6.dex */
public abstract class InvestingFinancialViewEvent {

    public final class MoreInfoClicked extends InvestingFinancialViewEvent {
        public static final MoreInfoClicked INSTANCE = new MoreInfoClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MoreInfoClicked);
        }

        public final int hashCode() {
            return -106504488;
        }

        public final String toString() {
            return "MoreInfoClicked";
        }
    }

    public final class SelectRange extends InvestingFinancialViewEvent {
        public final Range selectedButton;

        public SelectRange(Range range) {
            this.selectedButton = range;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectRange) && this.selectedButton == ((SelectRange) obj).selectedButton;
        }

        public final int hashCode() {
            return this.selectedButton.hashCode();
        }

        public final String toString() {
            return "SelectRange(selectedButton=" + this.selectedButton + ")";
        }
    }
}
