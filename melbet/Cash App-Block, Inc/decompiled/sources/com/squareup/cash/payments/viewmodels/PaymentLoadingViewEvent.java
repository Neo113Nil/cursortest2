package com.squareup.cash.payments.viewmodels;

import com.knotapi.knot.utilities.Constants;

/* loaded from: classes6.dex */
public abstract class PaymentLoadingViewEvent {

    public final class Back extends PaymentLoadingViewEvent {
        public static final Back INSTANCE = new Back();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Back);
        }

        public final int hashCode() {
            return -1266941082;
        }

        public final String toString() {
            return Constants.META_BACK_BUTTON;
        }
    }

    public final class InitiatePayment extends PaymentLoadingViewEvent {
        public static final InitiatePayment INSTANCE = new InitiatePayment();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InitiatePayment);
        }

        public final int hashCode() {
            return -702606002;
        }

        public final String toString() {
            return "InitiatePayment";
        }
    }
}
