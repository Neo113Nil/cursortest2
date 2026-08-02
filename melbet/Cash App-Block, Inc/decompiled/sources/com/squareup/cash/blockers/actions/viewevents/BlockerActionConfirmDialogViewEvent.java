package com.squareup.cash.blockers.actions.viewevents;

/* loaded from: classes4.dex */
public interface BlockerActionConfirmDialogViewEvent {

    public final class Cancel implements BlockerActionConfirmDialogViewEvent {
        public static final Cancel INSTANCE = new Cancel();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancel);
        }

        public final int hashCode() {
            return 1416719975;
        }

        public final String toString() {
            return "Cancel";
        }
    }

    public final class Confirm implements BlockerActionConfirmDialogViewEvent {
        public static final Confirm INSTANCE = new Confirm();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Confirm);
        }

        public final int hashCode() {
            return 1369547891;
        }

        public final String toString() {
            return "Confirm";
        }
    }
}
