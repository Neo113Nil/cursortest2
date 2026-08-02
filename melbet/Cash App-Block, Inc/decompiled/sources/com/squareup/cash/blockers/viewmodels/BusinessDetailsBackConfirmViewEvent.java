package com.squareup.cash.blockers.viewmodels;

/* loaded from: classes4.dex */
public interface BusinessDetailsBackConfirmViewEvent {

    public final class Cancel implements BusinessDetailsBackConfirmViewEvent {
        public static final Cancel INSTANCE = new Cancel();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancel);
        }

        public final int hashCode() {
            return 1429062790;
        }

        public final String toString() {
            return "Cancel";
        }
    }

    public final class Confirm implements BusinessDetailsBackConfirmViewEvent {
        public static final Confirm INSTANCE = new Confirm();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Confirm);
        }

        public final int hashCode() {
            return 1752175156;
        }

        public final String toString() {
            return "Confirm";
        }
    }
}
