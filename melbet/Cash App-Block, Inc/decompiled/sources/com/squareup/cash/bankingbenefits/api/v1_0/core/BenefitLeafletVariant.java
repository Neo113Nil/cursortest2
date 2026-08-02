package com.squareup.cash.bankingbenefits.api.v1_0.core;

import com.google.mlkit.vision.text.zzc;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes5.dex */
public enum BenefitLeafletVariant implements WireEnum {
    DO_NOT_USE(0),
    PAYCHECK(1),
    CARD_SPEND(2);

    public static final BenefitLeafletVariant$Companion$ADAPTER$1 ADAPTER;
    public static final zzc Companion;
    public final int value;

    static {
        BenefitLeafletVariant benefitLeafletVariant = DO_NOT_USE;
        Companion = new zzc(16);
        ADAPTER = new BenefitLeafletVariant$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(BenefitLeafletVariant.class), Syntax.PROTO_2, benefitLeafletVariant);
    }

    BenefitLeafletVariant(int i) {
        this.value = i;
    }

    public static final BenefitLeafletVariant fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return DO_NOT_USE;
        }
        if (i == 1) {
            return PAYCHECK;
        }
        if (i != 2) {
            return null;
        }
        return CARD_SPEND;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
