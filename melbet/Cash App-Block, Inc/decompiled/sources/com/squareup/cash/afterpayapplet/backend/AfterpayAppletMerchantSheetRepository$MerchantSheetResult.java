package com.squareup.cash.afterpayapplet.backend;

import com.squareup.protos.cash.cashsuggest.api.AfterpayMerchantSheet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface AfterpayAppletMerchantSheetRepository$MerchantSheetResult {

    public final class Failure implements AfterpayAppletMerchantSheetRepository$MerchantSheetResult {
        public static final Failure INSTANCE = new Failure();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Failure);
        }

        public final int hashCode() {
            return 589060365;
        }

        public final String toString() {
            return "Failure";
        }
    }

    public final class Success implements AfterpayAppletMerchantSheetRepository$MerchantSheetResult {
        public final AfterpayMerchantSheet response;

        public Success(AfterpayMerchantSheet afterpayMerchantSheet) {
            afterpayMerchantSheet.getClass();
            this.response = afterpayMerchantSheet;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.response, ((Success) obj).response);
        }

        public final int hashCode() {
            return this.response.hashCode();
        }

        public final String toString() {
            return "Success(response=" + this.response + ")";
        }
    }
}
