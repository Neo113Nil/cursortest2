package com.squareup.cash.investing.viewmodels.custom.order;

/* loaded from: classes6.dex */
public interface CancelOrderViewEvent {

    public final class Cancel implements CancelOrderViewEvent {
        public static final Cancel INSTANCE = new Cancel();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancel);
        }

        public final int hashCode() {
            return -1244734538;
        }

        public final String toString() {
            return "Cancel";
        }
    }

    public final class Confirm implements CancelOrderViewEvent {
        public final String flowToken;
        public final String paymentToken;

        public Confirm(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.flowToken = str;
            this.paymentToken = str2;
        }
    }
}
