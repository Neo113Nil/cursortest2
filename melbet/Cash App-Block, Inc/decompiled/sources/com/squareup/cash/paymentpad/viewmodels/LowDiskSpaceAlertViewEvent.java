package com.squareup.cash.paymentpad.viewmodels;

/* loaded from: classes6.dex */
public interface LowDiskSpaceAlertViewEvent {

    public final class NegativeButtonClick implements LowDiskSpaceAlertViewEvent {
        public static final NegativeButtonClick INSTANCE = new NegativeButtonClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NegativeButtonClick);
        }

        public final int hashCode() {
            return 1953625841;
        }

        public final String toString() {
            return "NegativeButtonClick";
        }
    }

    public final class PositiveButtonClick implements LowDiskSpaceAlertViewEvent {
        public static final PositiveButtonClick INSTANCE = new PositiveButtonClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PositiveButtonClick);
        }

        public final int hashCode() {
            return -1845565779;
        }

        public final String toString() {
            return "PositiveButtonClick";
        }
    }
}
