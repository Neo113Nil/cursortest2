package com.squareup.cash.deposits.physical.db;

import com.squareup.protos.cash.papermate.app.GetPaperCashDepositBarcodeResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PaperDepositBarcodeInfo {
    public final Long expires_at;
    public final GetPaperCashDepositBarcodeResponse.Failure failure;
    public final GetPaperCashDepositBarcodeResponse.Success success;
    public final Long updated_at;

    public PaperDepositBarcodeInfo(Long l, Long l2, GetPaperCashDepositBarcodeResponse.Success success, GetPaperCashDepositBarcodeResponse.Failure failure) {
        this.updated_at = l;
        this.expires_at = l2;
        this.success = success;
        this.failure = failure;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaperDepositBarcodeInfo)) {
            return false;
        }
        PaperDepositBarcodeInfo paperDepositBarcodeInfo = (PaperDepositBarcodeInfo) obj;
        return Intrinsics.areEqual(this.updated_at, paperDepositBarcodeInfo.updated_at) && Intrinsics.areEqual(this.expires_at, paperDepositBarcodeInfo.expires_at) && Intrinsics.areEqual(this.success, paperDepositBarcodeInfo.success) && Intrinsics.areEqual(this.failure, paperDepositBarcodeInfo.failure);
    }

    public final int hashCode() {
        Long l = this.updated_at;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.expires_at;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        GetPaperCashDepositBarcodeResponse.Success success = this.success;
        int hashCode3 = (hashCode2 + (success == null ? 0 : success.hashCode())) * 31;
        GetPaperCashDepositBarcodeResponse.Failure failure = this.failure;
        return hashCode3 + (failure != null ? failure.hashCode() : 0);
    }

    public final String toString() {
        return "PaperDepositBarcodeInfo(updated_at=" + this.updated_at + ", expires_at=" + this.expires_at + ", success=" + this.success + ", failure=" + this.failure + ")";
    }
}
