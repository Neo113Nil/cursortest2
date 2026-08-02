package com.squareup.cash.limits.viewmodels;

/* loaded from: classes6.dex */
public interface LimitsInlineMessageViewEvent {

    public final class PrimaryButtonClicked implements LimitsInlineMessageViewEvent {
        public static final PrimaryButtonClicked INSTANCE = new PrimaryButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PrimaryButtonClicked);
        }

        public final int hashCode() {
            return 1806677543;
        }

        public final String toString() {
            return "PrimaryButtonClicked";
        }
    }

    public final class SecondaryButtonClicked implements LimitsInlineMessageViewEvent {
        public static final SecondaryButtonClicked INSTANCE = new SecondaryButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SecondaryButtonClicked);
        }

        public final int hashCode() {
            return -1109414155;
        }

        public final String toString() {
            return "SecondaryButtonClicked";
        }
    }
}
