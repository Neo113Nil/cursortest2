package com.squareup.cash.bitcoin.presenters.payinusd;

/* loaded from: classes5.dex */
public interface BitcoinPayInUsdPreference {

    public final class Disabled implements BitcoinPayInUsdPreference {
        public static final Disabled INSTANCE = new Disabled();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Disabled);
        }

        public final int hashCode() {
            return -1275160084;
        }

        public final String toString() {
            return "Disabled";
        }
    }

    public final class Enabled implements BitcoinPayInUsdPreference {
        public static final Enabled INSTANCE = new Enabled();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Enabled);
        }

        public final int hashCode() {
            return 418741713;
        }

        public final String toString() {
            return "Enabled";
        }
    }
}
