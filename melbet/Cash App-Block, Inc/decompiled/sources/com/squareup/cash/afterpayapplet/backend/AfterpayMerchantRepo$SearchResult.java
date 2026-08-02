package com.squareup.cash.afterpayapplet.backend;

import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletSearchResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface AfterpayMerchantRepo$SearchResult {

    public final class Failure implements AfterpayMerchantRepo$SearchResult {
        public static final Failure INSTANCE = new Failure();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Failure);
        }

        public final int hashCode() {
            return 1848235225;
        }

        public final String toString() {
            return "Failure";
        }
    }

    public final class Success implements AfterpayMerchantRepo$SearchResult {
        public final AfterpayAppletSearchResponse response;

        public Success(AfterpayAppletSearchResponse afterpayAppletSearchResponse) {
            afterpayAppletSearchResponse.getClass();
            this.response = afterpayAppletSearchResponse;
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
