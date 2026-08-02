package com.squareup.cash.pools.viewmodels;

import com.knotapi.knot.utilities.Constants;

/* loaded from: classes6.dex */
public interface PoolDetailsViewEvent {

    public final class AdditionalOptionsTapped implements PoolDetailsViewEvent {
        public static final AdditionalOptionsTapped INSTANCE = new AdditionalOptionsTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AdditionalOptionsTapped);
        }

        public final int hashCode() {
            return 1702571002;
        }

        public final String toString() {
            return "AdditionalOptionsTapped";
        }
    }

    public final class Close implements PoolDetailsViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 1181488079;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class ClosePoolTapped implements PoolDetailsViewEvent {
        public static final ClosePoolTapped INSTANCE = new ClosePoolTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ClosePoolTapped);
        }

        public final int hashCode() {
            return 518152951;
        }

        public final String toString() {
            return "ClosePoolTapped";
        }
    }

    public final class ContributeTapped implements PoolDetailsViewEvent {
        public static final ContributeTapped INSTANCE = new ContributeTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ContributeTapped);
        }

        public final int hashCode() {
            return -2094183134;
        }

        public final String toString() {
            return "ContributeTapped";
        }
    }

    public final class ContributionAnimationShown implements PoolDetailsViewEvent {
        public static final ContributionAnimationShown INSTANCE = new ContributionAnimationShown();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ContributionAnimationShown);
        }

        public final int hashCode() {
            return 1825490598;
        }

        public final String toString() {
            return "ContributionAnimationShown";
        }
    }

    public final class CurrentMembersTapped implements PoolDetailsViewEvent {
        public static final CurrentMembersTapped INSTANCE = new CurrentMembersTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CurrentMembersTapped);
        }

        public final int hashCode() {
            return -1025521323;
        }

        public final String toString() {
            return "CurrentMembersTapped";
        }
    }

    public final class GoalMetAnimationShown implements PoolDetailsViewEvent {
        public static final GoalMetAnimationShown INSTANCE = new GoalMetAnimationShown();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoalMetAnimationShown);
        }

        public final int hashCode() {
            return -1600250387;
        }

        public final String toString() {
            return "GoalMetAnimationShown";
        }
    }

    public final class InvitePeopleTapped implements PoolDetailsViewEvent {
        public static final InvitePeopleTapped INSTANCE = new InvitePeopleTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InvitePeopleTapped);
        }

        public final int hashCode() {
            return 309911341;
        }

        public final String toString() {
            return "InvitePeopleTapped";
        }
    }

    public final class Refresh implements PoolDetailsViewEvent {
        public static final Refresh INSTANCE = new Refresh();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Refresh);
        }

        public final int hashCode() {
            return 1757589234;
        }

        public final String toString() {
            return "Refresh";
        }
    }

    public final class ShareTapped implements PoolDetailsViewEvent {
        public static final ShareTapped INSTANCE = new ShareTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShareTapped);
        }

        public final int hashCode() {
            return 811891682;
        }

        public final String toString() {
            return "ShareTapped";
        }
    }
}
