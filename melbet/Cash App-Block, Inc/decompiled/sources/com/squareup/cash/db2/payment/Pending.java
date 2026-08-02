package com.squareup.cash.db2.payment;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.protos.franklin.app.InitiatePaymentRequest;
import com.squareup.protos.franklin.common.TransferFundsRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Pending {
    public final long created_at;
    public final Long credit_card_fee_bps;
    public final String external_id;
    public final InitiatePaymentRequest payment_request;
    public final String pending_reason;
    public final long recipient_index;
    public final long recipients;
    public final TransferFundsRequest transfer_request;

    public Pending(String str, InitiatePaymentRequest initiatePaymentRequest, TransferFundsRequest transferFundsRequest, long j, Long l, long j2, String str2, long j3) {
        str.getClass();
        this.external_id = str;
        this.payment_request = initiatePaymentRequest;
        this.transfer_request = transferFundsRequest;
        this.created_at = j;
        this.credit_card_fee_bps = l;
        this.recipients = j2;
        this.pending_reason = str2;
        this.recipient_index = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pending)) {
            return false;
        }
        Pending pending = (Pending) obj;
        return Intrinsics.areEqual(this.external_id, pending.external_id) && Intrinsics.areEqual(this.payment_request, pending.payment_request) && Intrinsics.areEqual(this.transfer_request, pending.transfer_request) && this.created_at == pending.created_at && Intrinsics.areEqual(this.credit_card_fee_bps, pending.credit_card_fee_bps) && this.recipients == pending.recipients && Intrinsics.areEqual(this.pending_reason, pending.pending_reason) && this.recipient_index == pending.recipient_index;
    }

    public final int hashCode() {
        int hashCode = this.external_id.hashCode() * 31;
        InitiatePaymentRequest initiatePaymentRequest = this.payment_request;
        int hashCode2 = (hashCode + (initiatePaymentRequest == null ? 0 : initiatePaymentRequest.hashCode())) * 31;
        TransferFundsRequest transferFundsRequest = this.transfer_request;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (transferFundsRequest == null ? 0 : transferFundsRequest.hashCode())) * 31, 31, this.created_at);
        Long l = this.credit_card_fee_bps;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((m + (l == null ? 0 : l.hashCode())) * 31, 31, this.recipients);
        String str = this.pending_reason;
        return Long.hashCode(this.recipient_index) + ((m2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Pending(external_id=");
        sb.append(this.external_id);
        sb.append(", payment_request=");
        sb.append(this.payment_request);
        sb.append(", transfer_request=");
        sb.append(this.transfer_request);
        sb.append(", created_at=");
        sb.append(this.created_at);
        sb.append(", credit_card_fee_bps=");
        sb.append(this.credit_card_fee_bps);
        sb.append(", recipients=");
        Fragment$5$$ExternalSyntheticOutline0.m(this.recipients, ", pending_reason=", this.pending_reason, sb);
        return Boxes$$ExternalSyntheticOutline1.m(this.recipient_index, ", recipient_index=", ")", sb);
    }
}
