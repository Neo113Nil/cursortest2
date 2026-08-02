package com.squareup.cash.payments.backend.api;

import com.squareup.protos.franklin.app.GetFlowResponse;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface PaymentLinkRepository$CreatePaymentLinkResult {

    public final class Failed implements PaymentLinkRepository$CreatePaymentLinkResult {
        public static final Failed INSTANCE = new Failed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public final int hashCode() {
            return -1832361173;
        }

        public final String toString() {
            return "Failed";
        }
    }

    public final class HasBlockers implements PaymentLinkRepository$CreatePaymentLinkResult {
        public final GetFlowResponse response;

        public HasBlockers(GetFlowResponse getFlowResponse) {
            getFlowResponse.getClass();
            this.response = getFlowResponse;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HasBlockers) && Intrinsics.areEqual(this.response, ((HasBlockers) obj).response);
        }

        public final int hashCode() {
            return this.response.hashCode();
        }

        public final String toString() {
            return "HasBlockers(response=" + this.response + ")";
        }
    }

    public final class LinkCreated implements PaymentLinkRepository$CreatePaymentLinkResult {
        public final String link;

        public LinkCreated(String str) {
            this.link = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LinkCreated) && this.link.equals(((LinkCreated) obj).link);
        }

        public final int hashCode() {
            return this.link.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LinkCreated(link=", this.link, ")");
        }
    }
}
