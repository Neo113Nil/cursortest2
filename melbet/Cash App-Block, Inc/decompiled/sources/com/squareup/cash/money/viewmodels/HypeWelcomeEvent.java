package com.squareup.cash.money.viewmodels;

/* loaded from: classes6.dex */
public interface HypeWelcomeEvent {

    public final class BackClicked implements HypeWelcomeEvent {
        public static final BackClicked INSTANCE = new BackClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClicked);
        }

        public final int hashCode() {
            return -612162193;
        }

        public final String toString() {
            return "BackClicked";
        }
    }

    public final class DismissHypeClicked implements HypeWelcomeEvent {
        public static final DismissHypeClicked INSTANCE = new DismissHypeClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissHypeClicked);
        }

        public final int hashCode() {
            return -1959848312;
        }

        public final String toString() {
            return "DismissHypeClicked";
        }
    }

    public final class NotifyMeClicked implements HypeWelcomeEvent {
        public static final NotifyMeClicked INSTANCE = new NotifyMeClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NotifyMeClicked);
        }

        public final int hashCode() {
            return -319676715;
        }

        public final String toString() {
            return "NotifyMeClicked";
        }
    }
}
