package com.squareup.cash.profile.viewmodels;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class ProfileViewEvent {

    public final class GenericProfileElementsViewEventWrapper extends ProfileViewEvent {
        public final GenericProfileElementsViewEvent event;

        public GenericProfileElementsViewEventWrapper(GenericProfileElementsViewEvent genericProfileElementsViewEvent) {
            genericProfileElementsViewEvent.getClass();
            this.event = genericProfileElementsViewEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GenericProfileElementsViewEventWrapper) && Intrinsics.areEqual(this.event, ((GenericProfileElementsViewEventWrapper) obj).event);
        }

        public final int hashCode() {
            return this.event.hashCode();
        }

        public final String toString() {
            return "GenericProfileElementsViewEventWrapper(event=" + this.event + ")";
        }
    }

    public final class NavigationIconClicked extends ProfileViewEvent {
        public static final NavigationIconClicked INSTANCE = new NavigationIconClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigationIconClicked);
        }

        public final int hashCode() {
            return -1953094688;
        }

        public final String toString() {
            return "NavigationIconClicked";
        }
    }

    public final class PrimaryButtonClicked extends ProfileViewEvent {
        public static final PrimaryButtonClicked INSTANCE = new PrimaryButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PrimaryButtonClicked);
        }

        public final int hashCode() {
            return -1975491635;
        }

        public final String toString() {
            return "PrimaryButtonClicked";
        }
    }

    public final class ProfileAvatarClicked extends ProfileViewEvent {
        public static final ProfileAvatarClicked INSTANCE = new ProfileAvatarClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ProfileAvatarClicked);
        }

        public final int hashCode() {
            return -853980289;
        }

        public final String toString() {
            return "ProfileAvatarClicked";
        }
    }

    /* loaded from: classes6.dex */
    public final class RecipientConfirmed extends ProfileViewEvent {
        public static final RecipientConfirmed INSTANCE = new RecipientConfirmed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RecipientConfirmed);
        }

        public final int hashCode() {
            return -1402403360;
        }

        public final String toString() {
            return "RecipientConfirmed";
        }
    }

    public final class SecondaryButtonClicked extends ProfileViewEvent {
        public static final SecondaryButtonClicked INSTANCE = new SecondaryButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SecondaryButtonClicked);
        }

        public final int hashCode() {
            return 2063305499;
        }

        public final String toString() {
            return "SecondaryButtonClicked";
        }
    }
}
