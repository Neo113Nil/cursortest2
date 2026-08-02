package com.squareup.cash.payments.viewmodels;

/* loaded from: classes6.dex */
public interface NearbyPaymentsInfoViewEvent {

    public final class OnBackClicked implements NearbyPaymentsInfoViewEvent {
        public static final OnBackClicked INSTANCE = new OnBackClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnBackClicked);
        }

        public final int hashCode() {
            return -1288259458;
        }

        public final String toString() {
            return "OnBackClicked";
        }
    }

    public final class OnNavigationItemClicked implements NearbyPaymentsInfoViewEvent {
        public final NearbyPaymentsInfoItem item;

        public OnNavigationItemClicked(NearbyPaymentsInfoItem nearbyPaymentsInfoItem) {
            this.item = nearbyPaymentsInfoItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnNavigationItemClicked) && this.item == ((OnNavigationItemClicked) obj).item;
        }

        public final int hashCode() {
            return this.item.hashCode();
        }

        public final String toString() {
            return "OnNavigationItemClicked(item=" + this.item + ")";
        }
    }
}
