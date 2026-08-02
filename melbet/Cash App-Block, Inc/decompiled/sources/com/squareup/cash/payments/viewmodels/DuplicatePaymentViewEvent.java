package com.squareup.cash.payments.viewmodels;

/* loaded from: classes6.dex */
public interface DuplicatePaymentViewEvent {

    public final class Continue implements DuplicatePaymentViewEvent {
        public static final Continue INSTANCE = new Continue();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Continue);
        }

        public final int hashCode() {
            return -1105844597;
        }

        public final String toString() {
            return "Continue";
        }
    }

    public final class GoBack implements DuplicatePaymentViewEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return 98628819;
        }

        public final String toString() {
            return "GoBack";
        }
    }
}
