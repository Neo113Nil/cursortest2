package com.squareup.cash.db2.profile;

import com.squareup.protos.common.CurrencyCode;

/* loaded from: classes6.dex */
public final class BitcoinAmountEntryCurrencyPreference {
    public final CurrencyCode bitcoin_amount_entry_currency_preference;

    public BitcoinAmountEntryCurrencyPreference(CurrencyCode currencyCode) {
        this.bitcoin_amount_entry_currency_preference = currencyCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BitcoinAmountEntryCurrencyPreference) && this.bitcoin_amount_entry_currency_preference == ((BitcoinAmountEntryCurrencyPreference) obj).bitcoin_amount_entry_currency_preference;
    }

    public final CurrencyCode getBitcoin_amount_entry_currency_preference() {
        return this.bitcoin_amount_entry_currency_preference;
    }

    public final int hashCode() {
        CurrencyCode currencyCode = this.bitcoin_amount_entry_currency_preference;
        if (currencyCode == null) {
            return 0;
        }
        return currencyCode.hashCode();
    }

    public final String toString() {
        return "BitcoinAmountEntryCurrencyPreference(bitcoin_amount_entry_currency_preference=" + this.bitcoin_amount_entry_currency_preference + ")";
    }
}
