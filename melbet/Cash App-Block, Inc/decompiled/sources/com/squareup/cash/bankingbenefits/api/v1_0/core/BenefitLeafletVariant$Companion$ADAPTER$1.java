package com.squareup.cash.bankingbenefits.api.v1_0.core;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes5.dex */
public final class BenefitLeafletVariant$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        BenefitLeafletVariant.Companion.getClass();
        if (i == 0) {
            return BenefitLeafletVariant.DO_NOT_USE;
        }
        if (i == 1) {
            return BenefitLeafletVariant.PAYCHECK;
        }
        if (i != 2) {
            return null;
        }
        return BenefitLeafletVariant.CARD_SPEND;
    }
}
