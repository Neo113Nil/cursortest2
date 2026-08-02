package com.squareup.cash.payments.viewmodels;

/* loaded from: classes6.dex */
public interface ConfirmDuplicateDialogViewEvent {

    public final class Cancel implements ConfirmDuplicateDialogViewEvent {
        public static final Cancel INSTANCE = new Cancel();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancel);
        }

        public final int hashCode() {
            return 1471825462;
        }

        public final String toString() {
            return "Cancel";
        }
    }

    public final class Confirm implements ConfirmDuplicateDialogViewEvent {
        public static final Confirm INSTANCE = new Confirm();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Confirm);
        }

        public final int hashCode() {
            return -1217149308;
        }

        public final String toString() {
            return "Confirm";
        }
    }
}
