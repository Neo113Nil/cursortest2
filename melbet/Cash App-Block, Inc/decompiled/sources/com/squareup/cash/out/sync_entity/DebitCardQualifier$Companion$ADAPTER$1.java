package com.squareup.cash.out.sync_entity;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes6.dex */
public final class DebitCardQualifier$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        DebitCardQualifier.Companion.getClass();
        if (i == 0) {
            return DebitCardQualifier.NO_DEBIT_QUALIFIER;
        }
        if (i == 1) {
            return DebitCardQualifier.CARD_BRAND_VISA;
        }
        if (i != 2) {
            return null;
        }
        return DebitCardQualifier.DEFAULT_CARD;
    }
}
