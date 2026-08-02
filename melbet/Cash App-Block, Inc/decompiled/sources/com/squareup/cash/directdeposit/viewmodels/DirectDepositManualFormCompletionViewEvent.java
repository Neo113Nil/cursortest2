package com.squareup.cash.directdeposit.viewmodels;

/* loaded from: classes6.dex */
public interface DirectDepositManualFormCompletionViewEvent {

    public final class Exit implements DirectDepositManualFormCompletionViewEvent {
        public static final Exit INSTANCE = new Exit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Exit);
        }

        public final int hashCode() {
            return -18937506;
        }

        public final String toString() {
            return "Exit";
        }
    }

    public final class RetryFormSubmission implements DirectDepositManualFormCompletionViewEvent {
        public static final RetryFormSubmission INSTANCE = new RetryFormSubmission();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RetryFormSubmission);
        }

        public final int hashCode() {
            return 2118602680;
        }

        public final String toString() {
            return "RetryFormSubmission";
        }
    }

    public final class SendEmail implements DirectDepositManualFormCompletionViewEvent {
        public static final SendEmail INSTANCE = new SendEmail();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SendEmail);
        }

        public final int hashCode() {
            return -943793996;
        }

        public final String toString() {
            return "SendEmail";
        }
    }

    public final class ViewForm implements DirectDepositManualFormCompletionViewEvent {
        public static final ViewForm INSTANCE = new ViewForm();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ViewForm);
        }

        public final int hashCode() {
            return -1051848375;
        }

        public final String toString() {
            return "ViewForm";
        }
    }
}
