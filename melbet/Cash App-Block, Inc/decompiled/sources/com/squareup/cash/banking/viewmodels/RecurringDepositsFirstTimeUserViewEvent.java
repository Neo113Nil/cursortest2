package com.squareup.cash.banking.viewmodels;

/* loaded from: classes5.dex */
public interface RecurringDepositsFirstTimeUserViewEvent {

    public final class CloseClick implements RecurringDepositsFirstTimeUserViewEvent {
        public static final CloseClick INSTANCE = new CloseClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseClick);
        }

        public final int hashCode() {
            return -1323996924;
        }

        public final String toString() {
            return "CloseClick";
        }
    }

    public final class ContinueButtonClick implements RecurringDepositsFirstTimeUserViewEvent {
        public static final ContinueButtonClick INSTANCE = new ContinueButtonClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ContinueButtonClick);
        }

        public final int hashCode() {
            return 1796270651;
        }

        public final String toString() {
            return "ContinueButtonClick";
        }
    }
}
