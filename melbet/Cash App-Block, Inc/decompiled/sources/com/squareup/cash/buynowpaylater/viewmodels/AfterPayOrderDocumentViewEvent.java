package com.squareup.cash.buynowpaylater.viewmodels;

/* loaded from: classes5.dex */
public abstract class AfterPayOrderDocumentViewEvent {

    public final class GoBack extends AfterPayOrderDocumentViewEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return 704722190;
        }

        public final String toString() {
            return "GoBack";
        }
    }

    public final class TryAgainClicked extends AfterPayOrderDocumentViewEvent {
        public static final TryAgainClicked INSTANCE = new TryAgainClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TryAgainClicked);
        }

        public final int hashCode() {
            return 1732799939;
        }

        public final String toString() {
            return "TryAgainClicked";
        }
    }
}
