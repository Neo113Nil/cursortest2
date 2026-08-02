package com.squareup.cash.p2p.engine.api.v1;

import com.squareup.protos.cash.api.Error;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes6.dex */
public enum PaymentSponsorApprovalStatus implements WireEnum {
    PAYMENT_SPONSOR_APPROVAL_STATUS_UNSPECIFIED(0),
    PAYMENT_SPONSOR_APPROVAL_STATUS_NOT_REQUIRED(1),
    PAYMENT_SPONSOR_APPROVAL_STATUS_PENDING_APPROVAL(2),
    PAYMENT_SPONSOR_APPROVAL_STATUS_APPROVED(3),
    PAYMENT_SPONSOR_APPROVAL_STATUS_DECLINED(4),
    PAYMENT_SPONSOR_APPROVAL_STATUS_EXPIRED(5),
    PAYMENT_SPONSOR_APPROVAL_STATUS_VOIDED(6),
    PAYMENT_SPONSOR_APPROVAL_STATUS_PLANNED(7);

    public static final PaymentSponsorApprovalStatus$Companion$ADAPTER$1 ADAPTER;
    public static final Error.Code.Companion Companion;
    public final int value;

    static {
        PaymentSponsorApprovalStatus paymentSponsorApprovalStatus = PAYMENT_SPONSOR_APPROVAL_STATUS_UNSPECIFIED;
        Companion = new Error.Code.Companion(7);
        ADAPTER = new PaymentSponsorApprovalStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PaymentSponsorApprovalStatus.class), Syntax.PROTO_3, paymentSponsorApprovalStatus);
    }

    PaymentSponsorApprovalStatus(int i) {
        this.value = i;
    }

    public static final PaymentSponsorApprovalStatus fromValue(int i) {
        Companion.getClass();
        switch (i) {
            case 0:
                return PAYMENT_SPONSOR_APPROVAL_STATUS_UNSPECIFIED;
            case 1:
                return PAYMENT_SPONSOR_APPROVAL_STATUS_NOT_REQUIRED;
            case 2:
                return PAYMENT_SPONSOR_APPROVAL_STATUS_PENDING_APPROVAL;
            case 3:
                return PAYMENT_SPONSOR_APPROVAL_STATUS_APPROVED;
            case 4:
                return PAYMENT_SPONSOR_APPROVAL_STATUS_DECLINED;
            case 5:
                return PAYMENT_SPONSOR_APPROVAL_STATUS_EXPIRED;
            case 6:
                return PAYMENT_SPONSOR_APPROVAL_STATUS_VOIDED;
            case 7:
                return PAYMENT_SPONSOR_APPROVAL_STATUS_PLANNED;
            default:
                return null;
        }
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
