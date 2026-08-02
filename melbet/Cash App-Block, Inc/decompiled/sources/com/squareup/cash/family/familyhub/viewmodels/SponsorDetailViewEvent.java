package com.squareup.cash.family.familyhub.viewmodels;

/* loaded from: classes6.dex */
public abstract class SponsorDetailViewEvent {

    public final class TapBack extends SponsorDetailViewEvent {
        public static final TapBack INSTANCE = new TapBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapBack);
        }

        public final int hashCode() {
            return 1636525232;
        }

        public final String toString() {
            return "TapBack";
        }
    }

    public final class TapInviteFriends extends SponsorDetailViewEvent {
        public static final TapInviteFriends INSTANCE = new TapInviteFriends();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapInviteFriends);
        }

        public final int hashCode() {
            return 1171306659;
        }

        public final String toString() {
            return "TapInviteFriends";
        }
    }

    public final class TapRequestCash extends SponsorDetailViewEvent {
        public static final TapRequestCash INSTANCE = new TapRequestCash();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapRequestCash);
        }

        public final int hashCode() {
            return 804978297;
        }

        public final String toString() {
            return "TapRequestCash";
        }
    }

    public final class TapStartGraduation extends SponsorDetailViewEvent {
        public static final TapStartGraduation INSTANCE = new TapStartGraduation();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapStartGraduation);
        }

        public final int hashCode() {
            return -1642366457;
        }

        public final String toString() {
            return "TapStartGraduation";
        }
    }
}
