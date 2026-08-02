package com.squareup.cash.payments.viewmodels;

/* loaded from: classes6.dex */
public interface NearbyPayRequestHelpViewEvent {

    public final class CloseClicked implements NearbyPayRequestHelpViewEvent {
        public static final CloseClicked INSTANCE = new CloseClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseClicked);
        }

        public final int hashCode() {
            return -718403457;
        }

        public final String toString() {
            return "CloseClicked";
        }
    }

    public final class MoreInfoClicked implements NearbyPayRequestHelpViewEvent {
        public static final MoreInfoClicked INSTANCE = new MoreInfoClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MoreInfoClicked);
        }

        public final int hashCode() {
            return -1710088812;
        }

        public final String toString() {
            return "MoreInfoClicked";
        }
    }
}
