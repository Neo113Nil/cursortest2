package com.squareup.cash.bankingbenefits.api.v1_0.core;

import com.google.mlkit.vision.text.zzd;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes4.dex */
public enum PaycheckDepositStatusActiveBenefitType implements WireEnum {
    UNSPECIFIED(0),
    FREE_OVERDRAFT_COVERAGE(1),
    HIGH_INTEREST_SAVINGS(2),
    PRIORITY_PHONE_SUPPORT(3),
    REIMBURSED_ATM_FEES(4),
    COVERED_PAPER_MONEY_DEPOSIT(5),
    GUARANTEED_ACCESS_TO_BORROW(6),
    FREE_INTERNATIONAL_CARD_TRANSACTION(7),
    INCREASED_BORROW_LIMIT(8),
    CUSTOM_WEEKLY_OFFERS(9);

    public static final PaycheckDepositStatusActiveBenefitType$Companion$ADAPTER$1 ADAPTER;
    public static final zzd Companion;
    public final int value;

    static {
        PaycheckDepositStatusActiveBenefitType paycheckDepositStatusActiveBenefitType = UNSPECIFIED;
        Companion = new zzd(17);
        ADAPTER = new PaycheckDepositStatusActiveBenefitType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PaycheckDepositStatusActiveBenefitType.class), Syntax.PROTO_2, paycheckDepositStatusActiveBenefitType);
    }

    PaycheckDepositStatusActiveBenefitType(int i) {
        this.value = i;
    }

    public static final PaycheckDepositStatusActiveBenefitType fromValue(int i) {
        Companion.getClass();
        return zzd.fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
