package com.squareup.cash.offers.viewmodels.viewevents;

/* loaded from: classes6.dex */
public interface OffersFullscreenCollectionViewEvent {

    public final class GoBack implements OffersFullscreenCollectionViewEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return 1668302766;
        }

        public final String toString() {
            return "GoBack";
        }
    }
}
