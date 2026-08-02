package com.squareup.cash.bankingbenefits.api.v1_0.app;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes5.dex */
public final class Prominence$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Prominence.Companion.getClass();
        if (i == 0) {
            return Prominence.UNSPECIFIED;
        }
        if (i == 1) {
            return Prominence.PROMINENT;
        }
        if (i == 2) {
            return Prominence.STANDARD;
        }
        if (i != 3) {
            return null;
        }
        return Prominence.SUBTLE;
    }
}
