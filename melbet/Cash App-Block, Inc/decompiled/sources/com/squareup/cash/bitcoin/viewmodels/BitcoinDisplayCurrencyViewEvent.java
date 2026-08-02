package com.squareup.cash.bitcoin.viewmodels;

import squareup.cash.cryptocurrency.BitcoinDisplayUnits;

/* loaded from: classes5.dex */
public interface BitcoinDisplayCurrencyViewEvent {

    public final class BackPressed implements BitcoinDisplayCurrencyViewEvent {
        public static final BackPressed INSTANCE = new BackPressed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackPressed);
        }

        public final int hashCode() {
            return -1284663248;
        }

        public final String toString() {
            return "BackPressed";
        }
    }

    public final class BitcoinDisplayUnitsSelected implements BitcoinDisplayCurrencyViewEvent {
        public final BitcoinDisplayUnits units;

        public BitcoinDisplayUnitsSelected(BitcoinDisplayUnits bitcoinDisplayUnits) {
            bitcoinDisplayUnits.getClass();
            this.units = bitcoinDisplayUnits;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BitcoinDisplayUnitsSelected) && this.units == ((BitcoinDisplayUnitsSelected) obj).units;
        }

        public final int hashCode() {
            return this.units.hashCode();
        }

        public final String toString() {
            return "BitcoinDisplayUnitsSelected(units=" + this.units + ")";
        }
    }

    public final class LearnMorePressed implements BitcoinDisplayCurrencyViewEvent {
        public static final LearnMorePressed INSTANCE = new LearnMorePressed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LearnMorePressed);
        }

        public final int hashCode() {
            return -2063119276;
        }

        public final String toString() {
            return "LearnMorePressed";
        }
    }
}
