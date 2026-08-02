package com.squareup.cash.paymentpad.presenters;

import com.squareup.cash.exchangedata.api.FxExchangeRate;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class FxExchangeRates {
    public final FxExchangeRate current;
    public final FxExchangeRate lastAvailable;

    public FxExchangeRates(FxExchangeRate fxExchangeRate, FxExchangeRate fxExchangeRate2) {
        this.current = fxExchangeRate;
        this.lastAvailable = fxExchangeRate2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FxExchangeRates)) {
            return false;
        }
        FxExchangeRates fxExchangeRates = (FxExchangeRates) obj;
        return Intrinsics.areEqual(this.current, fxExchangeRates.current) && Intrinsics.areEqual(this.lastAvailable, fxExchangeRates.lastAvailable);
    }

    public final int hashCode() {
        FxExchangeRate fxExchangeRate = this.current;
        int hashCode = (fxExchangeRate == null ? 0 : fxExchangeRate.hashCode()) * 31;
        FxExchangeRate fxExchangeRate2 = this.lastAvailable;
        return hashCode + (fxExchangeRate2 != null ? fxExchangeRate2.hashCode() : 0);
    }

    public final String toString() {
        return "FxExchangeRates(current=" + this.current + ", lastAvailable=" + this.lastAvailable + ")";
    }
}
