package com.squareup.cash.blockers.viewmodels;

/* loaded from: classes4.dex */
public interface CashtagConfirmationViewEvent {

    public final class Cancel implements CashtagConfirmationViewEvent {
        public static final Cancel INSTANCE = new Cancel();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancel);
        }

        public final int hashCode() {
            return -1149105645;
        }

        public final String toString() {
            return "Cancel";
        }
    }

    public final class Confirm implements CashtagConfirmationViewEvent {
        public static final Confirm INSTANCE = new Confirm();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Confirm);
        }

        public final int hashCode() {
            return -861635001;
        }

        public final String toString() {
            return "Confirm";
        }
    }
}
