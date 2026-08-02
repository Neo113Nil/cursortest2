package com.squareup.cash.cryptonauts.api;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SetCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl {
    public final CryptoExchangeCustomerControl value;

    public SetCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl(CryptoExchangeCustomerControl cryptoExchangeCustomerControl) {
        cryptoExchangeCustomerControl.getClass();
        this.value = cryptoExchangeCustomerControl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SetCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl) && Intrinsics.areEqual(this.value, ((SetCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CryptoExchangeCustomerControl(value=" + this.value + ")";
    }
}
