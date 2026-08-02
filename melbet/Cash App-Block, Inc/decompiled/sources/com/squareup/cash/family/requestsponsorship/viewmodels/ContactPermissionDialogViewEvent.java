package com.squareup.cash.family.requestsponsorship.viewmodels;

/* loaded from: classes6.dex */
public interface ContactPermissionDialogViewEvent {

    public final class Cancel implements ContactPermissionDialogViewEvent {
        public static final Cancel INSTANCE = new Cancel();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancel);
        }

        public final int hashCode() {
            return -1965327462;
        }

        public final String toString() {
            return "Cancel";
        }
    }

    public final class Confirm implements ContactPermissionDialogViewEvent {
        public static final Confirm INSTANCE = new Confirm();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Confirm);
        }

        public final int hashCode() {
            return -394707552;
        }

        public final String toString() {
            return "Confirm";
        }
    }
}
