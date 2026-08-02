package com.squareup.cash.offers.presenters;

/* loaded from: classes6.dex */
public interface OfferAddedConfirmationState {

    public final class Dismiss implements OfferAddedConfirmationState {
        public static final Dismiss INSTANCE = new Dismiss();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismiss);
        }

        public final int hashCode() {
            return 1170949238;
        }

        public final String toString() {
            return "Dismiss";
        }
    }

    public final class ShowErrorNotification implements OfferAddedConfirmationState {
        public static final ShowErrorNotification INSTANCE = new ShowErrorNotification();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShowErrorNotification);
        }

        public final int hashCode() {
            return -2051160446;
        }

        public final String toString() {
            return "ShowErrorNotification";
        }
    }
}
