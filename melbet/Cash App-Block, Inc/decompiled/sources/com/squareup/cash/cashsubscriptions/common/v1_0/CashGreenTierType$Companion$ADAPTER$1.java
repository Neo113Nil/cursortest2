package com.squareup.cash.cashsubscriptions.common.v1_0;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes6.dex */
public final class CashGreenTierType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CashGreenTierType.Companion.getClass();
        if (i == 0) {
            return CashGreenTierType.CASH_GREEN_TIER_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return CashGreenTierType.CASH_GREEN_BASIC;
    }
}
