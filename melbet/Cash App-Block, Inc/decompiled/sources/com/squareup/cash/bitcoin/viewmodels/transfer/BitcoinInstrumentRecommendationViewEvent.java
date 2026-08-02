package com.squareup.cash.bitcoin.viewmodels.transfer;

/* loaded from: classes5.dex */
public interface BitcoinInstrumentRecommendationViewEvent {

    public final class CloseClicked implements BitcoinInstrumentRecommendationViewEvent {
        public static final CloseClicked INSTANCE = new CloseClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseClicked);
        }

        public final int hashCode() {
            return 111700864;
        }

        public final String toString() {
            return "CloseClicked";
        }
    }

    public final class PrimaryButtonClicked implements BitcoinInstrumentRecommendationViewEvent {
        public static final PrimaryButtonClicked INSTANCE = new PrimaryButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PrimaryButtonClicked);
        }

        public final int hashCode() {
            return 2070782244;
        }

        public final String toString() {
            return "PrimaryButtonClicked";
        }
    }

    public final class SecondaryButtonClicked implements BitcoinInstrumentRecommendationViewEvent {
        public static final SecondaryButtonClicked INSTANCE = new SecondaryButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SecondaryButtonClicked);
        }

        public final int hashCode() {
            return -707866958;
        }

        public final String toString() {
            return "SecondaryButtonClicked";
        }
    }
}
