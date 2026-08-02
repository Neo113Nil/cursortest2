package com.squareup.cash.deposits.physical.backend.api.barcode;

import com.squareup.protos.cash.papermate.app.GetPaperCashDepositBarcodeResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class BarcodeInfo {

    public final class Failure extends BarcodeInfo {
        public final GetPaperCashDepositBarcodeResponse.Failure response;

        public Failure(GetPaperCashDepositBarcodeResponse.Failure failure) {
            this.response = failure;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && Intrinsics.areEqual(this.response, ((Failure) obj).response);
        }

        public final int hashCode() {
            GetPaperCashDepositBarcodeResponse.Failure failure = this.response;
            if (failure == null) {
                return 0;
            }
            return failure.hashCode();
        }

        public final String toString() {
            return "Failure(response=" + this.response + ")";
        }
    }

    public final class Success extends BarcodeInfo {
        public final long expiresAt;
        public final GetPaperCashDepositBarcodeResponse.Success response;

        public Success(long j, GetPaperCashDepositBarcodeResponse.Success success) {
            success.getClass();
            this.expiresAt = j;
            this.response = success;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return this.expiresAt == success.expiresAt && Intrinsics.areEqual(this.response, success.response);
        }

        public final int hashCode() {
            return this.response.hashCode() + (Long.hashCode(this.expiresAt) * 31);
        }

        public final String toString() {
            return "Success(expiresAt=" + this.expiresAt + ", response=" + this.response + ")";
        }
    }
}
