package com.squareup.cash.bitcoin.viewmodels.map;

/* loaded from: classes5.dex */
public interface BitcoinMapErrorEvent {

    public final class NegativeActionSelected implements BitcoinMapErrorEvent {
        public static final NegativeActionSelected INSTANCE = new NegativeActionSelected();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NegativeActionSelected);
        }

        public final int hashCode() {
            return 1436774229;
        }

        public final String toString() {
            return "NegativeActionSelected";
        }
    }

    public final class PositiveActionSelected implements BitcoinMapErrorEvent {
        public static final PositiveActionSelected INSTANCE = new PositiveActionSelected();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PositiveActionSelected);
        }

        public final int hashCode() {
            return 697407001;
        }

        public final String toString() {
            return "PositiveActionSelected";
        }
    }
}
