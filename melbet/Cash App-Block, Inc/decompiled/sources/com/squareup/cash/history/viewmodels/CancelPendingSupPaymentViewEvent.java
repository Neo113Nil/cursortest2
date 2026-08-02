package com.squareup.cash.history.viewmodels;

/* loaded from: classes6.dex */
public abstract class CancelPendingSupPaymentViewEvent {

    public final class PrimaryButtonClicked extends CancelPendingSupPaymentViewEvent {
        public static final PrimaryButtonClicked INSTANCE = new PrimaryButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PrimaryButtonClicked);
        }

        public final int hashCode() {
            return 1763571982;
        }

        public final String toString() {
            return "PrimaryButtonClicked";
        }
    }

    public final class SecondaryButtonClicked extends CancelPendingSupPaymentViewEvent {
        public static final SecondaryButtonClicked INSTANCE = new SecondaryButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SecondaryButtonClicked);
        }

        public final int hashCode() {
            return 415814684;
        }

        public final String toString() {
            return "SecondaryButtonClicked";
        }
    }
}
