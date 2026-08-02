package com.squareup.cash.cryptonauts.api;

import com.squareup.cash.cryptonauts.api.CryptoExchangeCustomerControl;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes6.dex */
public final class CryptoExchangeCustomerControl$CryptoExchangeLimit$Frequency$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CryptoExchangeCustomerControl.CryptoExchangeLimit.Frequency.Companion.getClass();
        if (i == 0) {
            return CryptoExchangeCustomerControl.CryptoExchangeLimit.Frequency.UNSPECIFIED;
        }
        if (i == 1) {
            return CryptoExchangeCustomerControl.CryptoExchangeLimit.Frequency.WEEKLY;
        }
        if (i != 2) {
            return null;
        }
        return CryptoExchangeCustomerControl.CryptoExchangeLimit.Frequency.MONTHLY;
    }
}
