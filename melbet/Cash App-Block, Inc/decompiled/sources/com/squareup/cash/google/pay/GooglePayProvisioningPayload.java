package com.squareup.cash.google.pay;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface GooglePayProvisioningPayload {

    public final class Error implements GooglePayProvisioningPayload {
        public static final Error INSTANCE = new Error();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return -2116932107;
        }

        public final String toString() {
            return "Error";
        }
    }

    public final class Success implements GooglePayProvisioningPayload {
        public final String lastFour;
        public final String opaquePaymentCard;

        public Success(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.opaquePaymentCard = str;
            this.lastFour = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return Intrinsics.areEqual(this.opaquePaymentCard, success.opaquePaymentCard) && Intrinsics.areEqual(this.lastFour, success.lastFour);
        }

        public final int hashCode() {
            return this.lastFour.hashCode() + (this.opaquePaymentCard.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Success(opaquePaymentCard=", this.opaquePaymentCard, ", lastFour=", this.lastFour, ")");
        }
    }
}
