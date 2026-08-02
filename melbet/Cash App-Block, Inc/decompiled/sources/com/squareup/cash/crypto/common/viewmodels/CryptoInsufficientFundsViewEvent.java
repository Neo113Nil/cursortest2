package com.squareup.cash.crypto.common.viewmodels;

/* loaded from: classes6.dex */
public interface CryptoInsufficientFundsViewEvent {

    public final class NegativeButtonClicked implements CryptoInsufficientFundsViewEvent {
        public static final NegativeButtonClicked INSTANCE = new NegativeButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NegativeButtonClicked);
        }

        public final int hashCode() {
            return 73704340;
        }

        public final String toString() {
            return "NegativeButtonClicked";
        }
    }

    public final class OnCloseClicked implements CryptoInsufficientFundsViewEvent {
        public static final OnCloseClicked INSTANCE = new OnCloseClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnCloseClicked);
        }

        public final int hashCode() {
            return -268172326;
        }

        public final String toString() {
            return "OnCloseClicked";
        }
    }

    public final class PositiveButtonClicked implements CryptoInsufficientFundsViewEvent {
        public static final PositiveButtonClicked INSTANCE = new PositiveButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PositiveButtonClicked);
        }

        public final int hashCode() {
            return -227240880;
        }

        public final String toString() {
            return "PositiveButtonClicked";
        }
    }
}
