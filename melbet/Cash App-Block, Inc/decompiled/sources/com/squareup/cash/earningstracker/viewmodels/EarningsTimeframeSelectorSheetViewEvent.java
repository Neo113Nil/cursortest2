package com.squareup.cash.earningstracker.viewmodels;

/* loaded from: classes6.dex */
public interface EarningsTimeframeSelectorSheetViewEvent {

    public final class DoneButtonClicked implements EarningsTimeframeSelectorSheetViewEvent {
        public static final DoneButtonClicked INSTANCE = new DoneButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DoneButtonClicked);
        }

        public final int hashCode() {
            return 1448789827;
        }

        public final String toString() {
            return "DoneButtonClicked";
        }
    }

    public final class SheetDismissed implements EarningsTimeframeSelectorSheetViewEvent {
        public static final SheetDismissed INSTANCE = new SheetDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SheetDismissed);
        }

        public final int hashCode() {
            return -212899590;
        }

        public final String toString() {
            return "SheetDismissed";
        }
    }

    public final class TimeframeClicked implements EarningsTimeframeSelectorSheetViewEvent {
        public final Timeframe timeframe;

        public TimeframeClicked(Timeframe timeframe) {
            this.timeframe = timeframe;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TimeframeClicked) && this.timeframe == ((TimeframeClicked) obj).timeframe;
        }

        public final int hashCode() {
            return this.timeframe.hashCode();
        }

        public final String toString() {
            return "TimeframeClicked(timeframe=" + this.timeframe + ")";
        }
    }
}
