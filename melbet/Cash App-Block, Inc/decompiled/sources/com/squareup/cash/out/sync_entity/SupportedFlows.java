package com.squareup.cash.out.sync_entity;

import com.squareup.protos.binfo.api.CardProduct;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes6.dex */
public enum SupportedFlows implements WireEnum {
    INSTANT_CASH_OUT(0),
    STANDARD_CASH_OUT(1);

    public static final SupportedFlows$Companion$ADAPTER$1 ADAPTER;
    public static final CardProduct.Companion Companion;
    public final int value;

    static {
        SupportedFlows supportedFlows = INSTANT_CASH_OUT;
        Companion = new CardProduct.Companion(7);
        ADAPTER = new SupportedFlows$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(SupportedFlows.class), Syntax.PROTO_2, supportedFlows);
    }

    SupportedFlows(int i) {
        this.value = i;
    }

    public static final SupportedFlows fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return INSTANT_CASH_OUT;
        }
        if (i != 1) {
            return null;
        }
        return STANDARD_CASH_OUT;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
