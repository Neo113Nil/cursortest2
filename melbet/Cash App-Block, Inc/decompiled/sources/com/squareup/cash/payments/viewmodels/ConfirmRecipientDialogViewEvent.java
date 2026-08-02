package com.squareup.cash.payments.viewmodels;

/* loaded from: classes6.dex */
public abstract class ConfirmRecipientDialogViewEvent {

    public final class Cancel extends ConfirmRecipientDialogViewEvent {
        public static final Cancel INSTANCE = new Cancel();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancel);
        }

        public final int hashCode() {
            return -1541927740;
        }

        public final String toString() {
            return "Cancel";
        }
    }

    public final class Confirm extends ConfirmRecipientDialogViewEvent {
        public static final Confirm INSTANCE = new Confirm();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Confirm);
        }

        public final int hashCode() {
            return -154218058;
        }

        public final String toString() {
            return "Confirm";
        }
    }

    public final class ViewProfile extends ConfirmRecipientDialogViewEvent {
        public static final ViewProfile INSTANCE = new ViewProfile();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ViewProfile);
        }

        public final int hashCode() {
            return 1134564154;
        }

        public final String toString() {
            return "ViewProfile";
        }
    }
}
