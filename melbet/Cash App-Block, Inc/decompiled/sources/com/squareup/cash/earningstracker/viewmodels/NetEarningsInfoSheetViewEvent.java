package com.squareup.cash.earningstracker.viewmodels;

/* loaded from: classes6.dex */
public interface NetEarningsInfoSheetViewEvent {

    public final class ActionButtonClick implements NetEarningsInfoSheetViewEvent {
        public static final ActionButtonClick INSTANCE = new ActionButtonClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ActionButtonClick);
        }

        public final int hashCode() {
            return 1227822350;
        }

        public final String toString() {
            return "ActionButtonClick";
        }
    }

    public final class ProcessingFeeClick implements NetEarningsInfoSheetViewEvent {
        public static final ProcessingFeeClick INSTANCE = new ProcessingFeeClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ProcessingFeeClick);
        }

        public final int hashCode() {
            return 1674405863;
        }

        public final String toString() {
            return "ProcessingFeeClick";
        }
    }

    public final class SheetDismissed implements NetEarningsInfoSheetViewEvent {
        public static final SheetDismissed INSTANCE = new SheetDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SheetDismissed);
        }

        public final int hashCode() {
            return 77432092;
        }

        public final String toString() {
            return "SheetDismissed";
        }
    }
}
