package com.squareup.cash.payments.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class PaymentClaimViewModel {

    public final class Initial extends PaymentClaimViewModel {
        public final String messageText;

        public Initial(String str) {
            str.getClass();
            this.messageText = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Initial) && Intrinsics.areEqual(this.messageText, ((Initial) obj).messageText);
        }

        public final int hashCode() {
            return this.messageText.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Initial(messageText=", this.messageText, ")");
        }
    }

    public final class Loading extends PaymentClaimViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1502334572;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
