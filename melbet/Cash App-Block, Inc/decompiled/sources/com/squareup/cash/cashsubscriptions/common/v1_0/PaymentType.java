package com.squareup.cash.cashsubscriptions.common.v1_0;

import com.google.mlkit.vision.text.zzb;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes6.dex */
public enum PaymentType implements WireEnum {
    PAYMENT_TYPE_UNKNOWN(0),
    RECURRING(1),
    ONE_TIME(2);

    public static final PaymentType$Companion$ADAPTER$1 ADAPTER;
    public static final zzb Companion;
    public final int value;

    static {
        PaymentType paymentType = PAYMENT_TYPE_UNKNOWN;
        Companion = new zzb(19);
        ADAPTER = new PaymentType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PaymentType.class), Syntax.PROTO_2, paymentType);
    }

    PaymentType(int i) {
        this.value = i;
    }

    public static final PaymentType fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return PAYMENT_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return RECURRING;
        }
        if (i != 2) {
            return null;
        }
        return ONE_TIME;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
