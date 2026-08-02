package com.squareup.cash.bitcoin.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;

/* loaded from: classes5.dex */
public interface BitcoinDisplayCurrencyViewModel {

    public final class Loaded implements BitcoinDisplayCurrencyViewModel {
        public final String formattedBitcoinValue;
        public final String formattedSatoshisValue;
        public final BitcoinDisplayUnits selectedUnits;
        public final boolean symbolExperimentEnabled;

        public Loaded(BitcoinDisplayUnits bitcoinDisplayUnits, String str, String str2, boolean z) {
            bitcoinDisplayUnits.getClass();
            this.selectedUnits = bitcoinDisplayUnits;
            this.formattedBitcoinValue = str;
            this.formattedSatoshisValue = str2;
            this.symbolExperimentEnabled = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return this.selectedUnits == loaded.selectedUnits && this.formattedBitcoinValue.equals(loaded.formattedBitcoinValue) && this.formattedSatoshisValue.equals(loaded.formattedSatoshisValue) && this.symbolExperimentEnabled == loaded.symbolExperimentEnabled;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.symbolExperimentEnabled) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.selectedUnits.hashCode() * 31, 31, this.formattedBitcoinValue), 31, this.formattedSatoshisValue);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loaded(selectedUnits=");
            sb.append(this.selectedUnits);
            sb.append(", formattedBitcoinValue=");
            sb.append(this.formattedBitcoinValue);
            sb.append(", formattedSatoshisValue=");
            return re$$ExternalSyntheticOutline0.m(sb, this.formattedSatoshisValue, ", symbolExperimentEnabled=", this.symbolExperimentEnabled, ")");
        }
    }

    public final class Loading implements BitcoinDisplayCurrencyViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 919504960;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
