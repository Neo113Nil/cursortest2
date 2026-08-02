package com.squareup.cash.moneta.core.model;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes6.dex */
public final class DigitalWalletType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        DigitalWalletType.Companion.getClass();
        if (i == 0) {
            return DigitalWalletType.APPLE_PAY;
        }
        if (i != 1) {
            return null;
        }
        return DigitalWalletType.GOOGLE_PAY;
    }
}
