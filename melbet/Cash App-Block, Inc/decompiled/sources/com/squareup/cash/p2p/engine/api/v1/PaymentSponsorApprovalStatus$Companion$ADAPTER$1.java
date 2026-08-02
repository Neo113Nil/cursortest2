package com.squareup.cash.p2p.engine.api.v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes6.dex */
public final class PaymentSponsorApprovalStatus$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PaymentSponsorApprovalStatus.Companion.getClass();
        switch (i) {
            case 0:
                return PaymentSponsorApprovalStatus.PAYMENT_SPONSOR_APPROVAL_STATUS_UNSPECIFIED;
            case 1:
                return PaymentSponsorApprovalStatus.PAYMENT_SPONSOR_APPROVAL_STATUS_NOT_REQUIRED;
            case 2:
                return PaymentSponsorApprovalStatus.PAYMENT_SPONSOR_APPROVAL_STATUS_PENDING_APPROVAL;
            case 3:
                return PaymentSponsorApprovalStatus.PAYMENT_SPONSOR_APPROVAL_STATUS_APPROVED;
            case 4:
                return PaymentSponsorApprovalStatus.PAYMENT_SPONSOR_APPROVAL_STATUS_DECLINED;
            case 5:
                return PaymentSponsorApprovalStatus.PAYMENT_SPONSOR_APPROVAL_STATUS_EXPIRED;
            case 6:
                return PaymentSponsorApprovalStatus.PAYMENT_SPONSOR_APPROVAL_STATUS_VOIDED;
            case 7:
                return PaymentSponsorApprovalStatus.PAYMENT_SPONSOR_APPROVAL_STATUS_PLANNED;
            default:
                return null;
        }
    }
}
