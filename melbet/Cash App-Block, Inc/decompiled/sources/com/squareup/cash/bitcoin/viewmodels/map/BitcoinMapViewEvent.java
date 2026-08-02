package com.squareup.cash.bitcoin.viewmodels.map;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface BitcoinMapViewEvent {

    public final class GoBack implements BitcoinMapViewEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return 976268821;
        }

        public final String toString() {
            return "GoBack";
        }
    }

    public final class Pay implements BitcoinMapViewEvent {
        public static final Pay INSTANCE = new Pay();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Pay);
        }

        public final int hashCode() {
            return 1343993410;
        }

        public final String toString() {
            return "Pay";
        }
    }

    public final class SearchLocations implements BitcoinMapViewEvent {
        public static final SearchLocations INSTANCE = new SearchLocations();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SearchLocations);
        }

        public final int hashCode() {
            return 1279024432;
        }

        public final String toString() {
            return "SearchLocations";
        }
    }

    public final class UpdateLocationFilter implements BitcoinMapViewEvent {
        public final BitcoinLocationFilter locationFilter;

        public UpdateLocationFilter(BitcoinLocationFilter bitcoinLocationFilter) {
            bitcoinLocationFilter.getClass();
            this.locationFilter = bitcoinLocationFilter;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateLocationFilter) && Intrinsics.areEqual(this.locationFilter, ((UpdateLocationFilter) obj).locationFilter);
        }

        public final int hashCode() {
            return Boolean.hashCode(this.locationFilter.squareSellersOnly);
        }

        public final String toString() {
            return "UpdateLocationFilter(locationFilter=" + this.locationFilter + ")";
        }
    }
}
