package com.squareup.cash.bitcoin.viewmodels;

/* loaded from: classes5.dex */
public abstract class BitcoinDepositsViewEvent {

    public final class AdjustAmount extends BitcoinDepositsViewEvent {
        public static final AdjustAmount INSTANCE = new AdjustAmount();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AdjustAmount);
        }

        public final int hashCode() {
            return -301314634;
        }

        public final String toString() {
            return "AdjustAmount";
        }
    }

    public final class BackPressed extends BitcoinDepositsViewEvent {
        public static final BackPressed INSTANCE = new BackPressed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackPressed);
        }

        public final int hashCode() {
            return -2027036052;
        }

        public final String toString() {
            return "BackPressed";
        }
    }

    public final class CopyAddress extends BitcoinDepositsViewEvent {
        public static final CopyAddress INSTANCE = new CopyAddress();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CopyAddress);
        }

        public final int hashCode() {
            return 2087767024;
        }

        public final String toString() {
            return "CopyAddress";
        }
    }

    public final class Share extends BitcoinDepositsViewEvent {
        public static final Share INSTANCE = new Share();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Share);
        }

        public final int hashCode() {
            return -395711024;
        }

        public final String toString() {
            return "Share";
        }
    }

    public final class TryAgainClicked extends BitcoinDepositsViewEvent {
        public static final TryAgainClicked INSTANCE = new TryAgainClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TryAgainClicked);
        }

        public final int hashCode() {
            return -1086889293;
        }

        public final String toString() {
            return "TryAgainClicked";
        }
    }
}
