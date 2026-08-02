package com.squareup.cash.p2p.engine.api.v1;

import com.squareup.cash.work.service.real.WorkCookieJar;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes6.dex */
public enum PaymentStateCode implements WireEnum {
    PAYMENT_STATE_CODE_UNSPECIFIED(0),
    PAYMENT_STATE_CODE_VALIDATING(2),
    PAYMENT_STATE_CODE_VALIDATED(3),
    PAYMENT_STATE_CODE_SCHEDULED(1),
    PAYMENT_STATE_CODE_WAITING_ON_SENDER(4),
    PAYMENT_STATE_CODE_CAPTURING(5),
    PAYMENT_STATE_CODE_CAPTURED(6),
    PAYMENT_STATE_CODE_WAITING_ON_RECIPIENT(7),
    PAYMENT_STATE_CODE_WAITING_ON_RISK(8),
    PAYMENT_STATE_CODE_PAYING_OUT(9),
    PAYMENT_STATE_CODE_PAID_OUT(10),
    PAYMENT_STATE_CODE_REFUNDING(11),
    PAYMENT_STATE_CODE_PULLING_REFUND(12),
    PAYMENT_STATE_CODE_WAITING_TO_REFUND(13),
    PAYMENT_STATE_CODE_FAILED(14),
    PAYMENT_STATE_CODE_CREATED(15),
    PAYMENT_STATE_CODE_WAITING_ON_COMPLIANCE_REVIEW(16),
    PAYMENT_STATE_CODE_FREEZING(17),
    PAYMENT_STATE_CODE_WAITING_ON_INTERNAL(18),
    PAYMENT_STATE_CODE_WAITING_ON_SPONSOR(19);

    public static final PaymentStateCode$Companion$ADAPTER$1 ADAPTER;
    public static final WorkCookieJar Companion;
    public final int value;

    static {
        PaymentStateCode paymentStateCode = PAYMENT_STATE_CODE_UNSPECIFIED;
        Companion = new WorkCookieJar(7);
        ADAPTER = new PaymentStateCode$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PaymentStateCode.class), Syntax.PROTO_3, paymentStateCode);
    }

    PaymentStateCode(int i) {
        this.value = i;
    }

    public static final PaymentStateCode fromValue(int i) {
        Companion.getClass();
        return WorkCookieJar.m3795fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
