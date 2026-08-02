package com.squareup.cash.bitcoin.viewmodels.map;

import com.knotapi.knot.utilities.Constants;

/* loaded from: classes5.dex */
public interface BitcoinLocationViewEvent {

    public final class Close implements BitcoinLocationViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -142689765;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class OpenDirections implements BitcoinLocationViewEvent {
        public static final OpenDirections INSTANCE = new OpenDirections();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OpenDirections);
        }

        public final int hashCode() {
            return -193711621;
        }

        public final String toString() {
            return "OpenDirections";
        }
    }

    public final class Pay implements BitcoinLocationViewEvent {
        public static final Pay INSTANCE = new Pay();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Pay);
        }

        public final int hashCode() {
            return -107398773;
        }

        public final String toString() {
            return "Pay";
        }
    }
}
