package com.squareup.cash.blockers.viewmodels;

/* loaded from: classes4.dex */
public abstract class InviteFriendsViewEvent {

    /* loaded from: classes5.dex */
    public final class CloseClick extends InviteFriendsViewEvent {
        public static final CloseClick INSTANCE = new CloseClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseClick);
        }

        public final int hashCode() {
            return 173310329;
        }

        public final String toString() {
            return "CloseClick";
        }
    }

    /* loaded from: classes5.dex */
    public final class GoBack extends InviteFriendsViewEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return -1762833032;
        }

        public final String toString() {
            return "GoBack";
        }
    }

    public final class HowWeUseContactsClick extends InviteFriendsViewEvent {
        public static final HowWeUseContactsClick INSTANCE = new HowWeUseContactsClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HowWeUseContactsClick);
        }

        public final int hashCode() {
            return -504741021;
        }

        public final String toString() {
            return "HowWeUseContactsClick";
        }
    }

    public final class InviteClick extends InviteFriendsViewEvent {
        public static final InviteClick INSTANCE = new InviteClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InviteClick);
        }

        public final int hashCode() {
            return -159386090;
        }

        public final String toString() {
            return "InviteClick";
        }
    }

    public final class SkipClick extends InviteFriendsViewEvent {
        public static final SkipClick INSTANCE = new SkipClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SkipClick);
        }

        public final int hashCode() {
            return 63271712;
        }

        public final String toString() {
            return "SkipClick";
        }
    }
}
