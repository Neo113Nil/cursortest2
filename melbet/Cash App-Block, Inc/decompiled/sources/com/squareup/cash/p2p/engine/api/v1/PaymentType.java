package com.squareup.cash.p2p.engine.api.v1;

import com.squareup.cropview.Edge;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum PaymentType implements WireEnum {
    PAYMENT_TYPE_UNSPECIFIED(0),
    PAYMENT_TYPE_P2P_FIAT(1),
    PAYMENT_TYPE_ALLOWANCE(2),
    PAYMENT_TYPE_INTERNAL_P2P_FIAT(3),
    PAYMENT_TYPE_MARKETING(4),
    PAYMENT_TYPE_SQUARE_PAYROLL(5),
    PAYMENT_TYPE_REFERRAL(6),
    PAYMENT_TYPE_MONEY_POOL_CONTRIBUTION(7),
    PAYMENT_TYPE_OON_MONEY_POOL_CONTRIBUTION(8),
    PAYMENT_TYPE_TIDAL_ARTIST_CONTRIBUTION(9),
    PAYMENT_TYPE_CASH_CARD_PURCHASE(10),
    PAYMENT_TYPE_REIMBURSEMENT(11),
    PAYMENT_TYPE_SPONSOR_DEPOSIT_TO_MANAGED_ACCOUNT(12),
    PAYMENT_TYPE_SPONSOR_WITHDRAWAL_FROM_MANAGED_ACCOUNT(13),
    PAYMENT_TYPE_OON_P2P_FIAT(14),
    PAYMENT_TYPE_PAYMENT(15);

    public static final PaymentType$Companion$ADAPTER$1 ADAPTER;
    public static final Edge.Companion Companion;
    public final int value;

    static {
        PaymentType paymentType = PAYMENT_TYPE_UNSPECIFIED;
        Companion = new Edge.Companion(7);
        ADAPTER = new PaymentType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PaymentType.class), Syntax.PROTO_3, paymentType);
    }

    PaymentType(int i) {
        this.value = i;
    }

    public static final PaymentType fromValue(int i) {
        Companion.getClass();
        return Edge.Companion.m3825fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
