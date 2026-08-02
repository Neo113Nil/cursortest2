package com.squareup.cash.payments.viewmodels;

/* loaded from: classes6.dex */
public abstract class ContactSyncViewEvent {

    public final class Cancel extends ContactSyncViewEvent {
        public static final Cancel INSTANCE = new Cancel();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancel);
        }

        public final int hashCode() {
            return -933698146;
        }

        public final String toString() {
            return "Cancel";
        }
    }

    public final class Confirm extends ContactSyncViewEvent {
        public static final Confirm INSTANCE = new Confirm();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Confirm);
        }

        public final int hashCode() {
            return 1521030172;
        }

        public final String toString() {
            return "Confirm";
        }
    }
}
