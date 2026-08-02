package com.squareup.cash.cashsubscriptions.common.v1_0;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes6.dex */
public final class ProductType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ProductType.Companion.getClass();
        if (i == 0) {
            return ProductType.PRODUCT_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return ProductType.CASH_GREEN_SUBSCRIPTION;
        }
        if (i != 2) {
            return null;
        }
        return ProductType.PHONE_PLAN_SUBSCRIPTION;
    }
}
