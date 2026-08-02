package com.squareup.cash.db2.payment;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.transfers.data.TransferType;
import com.squareup.protos.franklin.common.TransferFundsRequest;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class PendingTransfer {
    public final long created_at;
    public final String external_id;
    public final Long first_error_request_created_at;
    public final Long first_error_response_created_at;
    public final String first_error_response_reason;
    public final Boolean ready_for_removal;
    public final TransferFundsRequest request;
    public final long retry_at;
    public final long retry_count;
    public final boolean succeeded;

    /* renamed from: type, reason: collision with root package name */
    public final TransferType f1125type;

    public PendingTransfer(String str, long j, long j2, long j3, TransferFundsRequest transferFundsRequest, boolean z, TransferType transferType, Boolean bool, Long l, Long l2, String str2) {
        str.getClass();
        transferFundsRequest.getClass();
        this.external_id = str;
        this.created_at = j;
        this.retry_at = j2;
        this.retry_count = j3;
        this.request = transferFundsRequest;
        this.succeeded = z;
        this.f1125type = transferType;
        this.ready_for_removal = bool;
        this.first_error_request_created_at = l;
        this.first_error_response_created_at = l2;
        this.first_error_response_reason = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PendingTransfer)) {
            return false;
        }
        PendingTransfer pendingTransfer = (PendingTransfer) obj;
        return Intrinsics.areEqual(this.external_id, pendingTransfer.external_id) && this.created_at == pendingTransfer.created_at && this.retry_at == pendingTransfer.retry_at && this.retry_count == pendingTransfer.retry_count && Intrinsics.areEqual(this.request, pendingTransfer.request) && this.succeeded == pendingTransfer.succeeded && this.f1125type == pendingTransfer.f1125type && Intrinsics.areEqual(this.ready_for_removal, pendingTransfer.ready_for_removal) && Intrinsics.areEqual(this.first_error_request_created_at, pendingTransfer.first_error_request_created_at) && Intrinsics.areEqual(this.first_error_response_created_at, pendingTransfer.first_error_response_created_at) && Intrinsics.areEqual(this.first_error_response_reason, pendingTransfer.first_error_response_reason);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.request.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(this.external_id.hashCode() * 31, 31, this.created_at), 31, this.retry_at), 31, this.retry_count)) * 31, 31, this.succeeded);
        TransferType transferType = this.f1125type;
        int hashCode = (m + (transferType == null ? 0 : transferType.hashCode())) * 31;
        Boolean bool = this.ready_for_removal;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.first_error_request_created_at;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.first_error_response_created_at;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.first_error_response_reason;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("PendingTransfer(external_id=", this.external_id, ", created_at=", this.created_at);
        Boxes$$ExternalSyntheticOutline1.m1151m(this.retry_at, ", retry_at=", ", retry_count=", m);
        m.append(this.retry_count);
        m.append(", request=");
        m.append(this.request);
        m.append(", succeeded=");
        m.append(this.succeeded);
        m.append(", type=");
        m.append(this.f1125type);
        m.append(", ready_for_removal=");
        m.append(this.ready_for_removal);
        m.append(", first_error_request_created_at=");
        m.append(this.first_error_request_created_at);
        m.append(", first_error_response_created_at=");
        m.append(this.first_error_response_created_at);
        m.append(", first_error_response_reason=");
        m.append(this.first_error_response_reason);
        m.append(")");
        return m.toString();
    }
}
