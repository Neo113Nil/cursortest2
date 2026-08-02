package com.squareup.cash.cashsubscriptions.common.v1_0;

import com.google.mlkit.vision.text.zza;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes6.dex */
public enum CashGreenTierType implements WireEnum {
    CASH_GREEN_TIER_UNKNOWN(0),
    CASH_GREEN_BASIC(1);

    public static final CashGreenTierType$Companion$ADAPTER$1 ADAPTER;
    public static final zza Companion;
    public final int value;

    static {
        CashGreenTierType cashGreenTierType = CASH_GREEN_TIER_UNKNOWN;
        Companion = new zza(19);
        ADAPTER = new CashGreenTierType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(CashGreenTierType.class), Syntax.PROTO_2, cashGreenTierType);
    }

    CashGreenTierType(int i) {
        this.value = i;
    }

    public static final CashGreenTierType fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return CASH_GREEN_TIER_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return CASH_GREEN_BASIC;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
