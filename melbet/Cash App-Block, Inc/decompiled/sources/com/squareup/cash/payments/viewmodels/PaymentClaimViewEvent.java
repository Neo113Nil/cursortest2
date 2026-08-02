package com.squareup.cash.payments.viewmodels;

/* loaded from: classes6.dex */
public abstract class PaymentClaimViewEvent {

    public final class CancelClick extends PaymentClaimViewEvent {
        public static final CancelClick INSTANCE = new CancelClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CancelClick);
        }

        public final int hashCode() {
            return 202591823;
        }

        public final String toString() {
            return "CancelClick";
        }
    }

    public final class DepositClick extends PaymentClaimViewEvent {
        public static final DepositClick INSTANCE = new DepositClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DepositClick);
        }

        public final int hashCode() {
            return 241035913;
        }

        public final String toString() {
            return "DepositClick";
        }
    }
}
