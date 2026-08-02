package com.squareup.cash.crypto.amount;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes6.dex */
public final class CryptoCurrency$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CryptoCurrency.Companion.getClass();
        if (i == 0) {
            return CryptoCurrency.UNKNOWN;
        }
        if (i == 1) {
            return CryptoCurrency.BTC;
        }
        if (i != 2) {
            return null;
        }
        return CryptoCurrency.XUS;
    }
}
