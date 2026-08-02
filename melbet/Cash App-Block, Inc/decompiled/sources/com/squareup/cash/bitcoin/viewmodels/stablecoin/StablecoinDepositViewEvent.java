package com.squareup.cash.bitcoin.viewmodels.stablecoin;

/* loaded from: classes5.dex */
public interface StablecoinDepositViewEvent {

    public final class BackPressed implements StablecoinDepositViewEvent {
        public static final BackPressed INSTANCE = new BackPressed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackPressed);
        }

        public final int hashCode() {
            return 1331663733;
        }

        public final String toString() {
            return "BackPressed";
        }
    }

    public final class ChangeNetwork implements StablecoinDepositViewEvent {
        public static final ChangeNetwork INSTANCE = new ChangeNetwork();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ChangeNetwork);
        }

        public final int hashCode() {
            return 7604248;
        }

        public final String toString() {
            return "ChangeNetwork";
        }
    }

    public final class CopyAddress implements StablecoinDepositViewEvent {
        public static final CopyAddress INSTANCE = new CopyAddress();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CopyAddress);
        }

        public final int hashCode() {
            return 1151499513;
        }

        public final String toString() {
            return "CopyAddress";
        }
    }

    public final class HelpClicked implements StablecoinDepositViewEvent {
        public static final HelpClicked INSTANCE = new HelpClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HelpClicked);
        }

        public final int hashCode() {
            return 569521120;
        }

        public final String toString() {
            return "HelpClicked";
        }
    }

    public final class Share implements StablecoinDepositViewEvent {
        public static final Share INSTANCE = new Share();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Share);
        }

        public final int hashCode() {
            return -539797095;
        }

        public final String toString() {
            return "Share";
        }
    }

    public final class TryAgainClicked implements StablecoinDepositViewEvent {
        public static final TryAgainClicked INSTANCE = new TryAgainClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TryAgainClicked);
        }

        public final int hashCode() {
            return -978884804;
        }

        public final String toString() {
            return "TryAgainClicked";
        }
    }
}
