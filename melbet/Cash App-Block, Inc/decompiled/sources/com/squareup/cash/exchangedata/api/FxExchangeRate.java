package com.squareup.cash.exchangedata.api;

import com.squareup.protos.common.CurrencyCode;
import java.math.BigDecimal;

/* loaded from: classes8.dex */
public final class FxExchangeRate {
    public final CurrencyCode fromCurrency;
    public final BigDecimal rate;
    public final CurrencyCode toCurrency;

    public FxExchangeRate(CurrencyCode currencyCode, CurrencyCode currencyCode2, BigDecimal bigDecimal) {
        currencyCode2.getClass();
        this.fromCurrency = currencyCode;
        this.toCurrency = currencyCode2;
        this.rate = bigDecimal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FxExchangeRate)) {
            return false;
        }
        FxExchangeRate fxExchangeRate = (FxExchangeRate) obj;
        return this.fromCurrency == fxExchangeRate.fromCurrency && this.toCurrency == fxExchangeRate.toCurrency && this.rate.equals(fxExchangeRate.rate);
    }

    public final int hashCode() {
        return this.rate.hashCode() + ((this.toCurrency.hashCode() + (this.fromCurrency.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "FxExchangeRate(fromCurrency=" + this.fromCurrency + ", toCurrency=" + this.toCurrency + ", rate=" + this.rate + ")";
    }
}
