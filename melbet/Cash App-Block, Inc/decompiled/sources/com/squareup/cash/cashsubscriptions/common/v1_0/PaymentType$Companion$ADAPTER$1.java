package com.squareup.cash.cashsubscriptions.common.v1_0;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes6.dex */
public final class PaymentType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PaymentType.Companion.getClass();
        if (i == 0) {
            return PaymentType.PAYMENT_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return PaymentType.RECURRING;
        }
        if (i != 2) {
            return null;
        }
        return PaymentType.ONE_TIME;
    }
}
