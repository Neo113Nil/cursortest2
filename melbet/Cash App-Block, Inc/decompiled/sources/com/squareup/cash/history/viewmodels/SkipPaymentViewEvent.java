package com.squareup.cash.history.viewmodels;

/* loaded from: classes6.dex */
public abstract class SkipPaymentViewEvent {

    public final class Cancel extends SkipPaymentViewEvent {
        public static final Cancel INSTANCE = new Cancel();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancel);
        }

        public final int hashCode() {
            return -227834201;
        }

        public final String toString() {
            return "Cancel";
        }
    }

    public final class Confirm extends SkipPaymentViewEvent {
        public static final Confirm INSTANCE = new Confirm();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Confirm);
        }

        public final int hashCode() {
            return 1927975987;
        }

        public final String toString() {
            return "Confirm";
        }
    }
}
