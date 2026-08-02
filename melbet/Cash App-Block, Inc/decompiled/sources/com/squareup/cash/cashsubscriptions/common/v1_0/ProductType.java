package com.squareup.cash.cashsubscriptions.common.v1_0;

import com.google.mlkit.vision.text.zzc;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes6.dex */
public enum ProductType implements WireEnum {
    PRODUCT_TYPE_UNKNOWN(0),
    CASH_GREEN_SUBSCRIPTION(1),
    PHONE_PLAN_SUBSCRIPTION(2);

    public static final ProductType$Companion$ADAPTER$1 ADAPTER;
    public static final zzc Companion;
    public final int value;

    static {
        ProductType productType = PRODUCT_TYPE_UNKNOWN;
        Companion = new zzc(19);
        ADAPTER = new ProductType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ProductType.class), Syntax.PROTO_2, productType);
    }

    ProductType(int i) {
        this.value = i;
    }

    public static final ProductType fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return PRODUCT_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return CASH_GREEN_SUBSCRIPTION;
        }
        if (i != 2) {
            return null;
        }
        return PHONE_PLAN_SUBSCRIPTION;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
