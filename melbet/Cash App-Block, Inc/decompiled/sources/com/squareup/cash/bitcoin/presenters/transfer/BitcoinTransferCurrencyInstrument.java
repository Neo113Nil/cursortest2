package com.squareup.cash.bitcoin.presenters.transfer;

import com.squareup.protos.common.CurrencyCode;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BitcoinTransferCurrencyInstrument {
    public final CurrencyCode currencyCode;
    public final String token;

    public BitcoinTransferCurrencyInstrument(String str, CurrencyCode currencyCode) {
        str.getClass();
        this.token = str;
        this.currencyCode = currencyCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitcoinTransferCurrencyInstrument)) {
            return false;
        }
        BitcoinTransferCurrencyInstrument bitcoinTransferCurrencyInstrument = (BitcoinTransferCurrencyInstrument) obj;
        return Intrinsics.areEqual(this.token, bitcoinTransferCurrencyInstrument.token) && this.currencyCode == bitcoinTransferCurrencyInstrument.currencyCode;
    }

    public final int hashCode() {
        int hashCode = this.token.hashCode() * 31;
        CurrencyCode currencyCode = this.currencyCode;
        return hashCode + (currencyCode == null ? 0 : currencyCode.hashCode());
    }

    public final String toString() {
        return "BitcoinTransferCurrencyInstrument(token=" + this.token + ", currencyCode=" + this.currencyCode + ")";
    }
}
