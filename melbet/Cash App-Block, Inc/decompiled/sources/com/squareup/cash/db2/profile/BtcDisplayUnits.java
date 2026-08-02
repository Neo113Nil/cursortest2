package com.squareup.cash.db2.profile;

import squareup.cash.cryptocurrency.BitcoinDisplayUnits;

/* loaded from: classes6.dex */
public final class BtcDisplayUnits {
    public final BitcoinDisplayUnits bitcoin_display_units;

    public BtcDisplayUnits(BitcoinDisplayUnits bitcoinDisplayUnits) {
        this.bitcoin_display_units = bitcoinDisplayUnits;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BtcDisplayUnits) && this.bitcoin_display_units == ((BtcDisplayUnits) obj).bitcoin_display_units;
    }

    public final int hashCode() {
        BitcoinDisplayUnits bitcoinDisplayUnits = this.bitcoin_display_units;
        if (bitcoinDisplayUnits == null) {
            return 0;
        }
        return bitcoinDisplayUnits.hashCode();
    }

    public final String toString() {
        return "BtcDisplayUnits(bitcoin_display_units=" + this.bitcoin_display_units + ")";
    }
}
