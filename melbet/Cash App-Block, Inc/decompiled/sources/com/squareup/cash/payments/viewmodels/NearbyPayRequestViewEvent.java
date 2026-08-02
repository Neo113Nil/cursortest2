package com.squareup.cash.payments.viewmodels;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface NearbyPayRequestViewEvent {

    public final class OnCloseClicked implements NearbyPayRequestViewEvent {
        public static final OnCloseClicked INSTANCE = new OnCloseClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnCloseClicked);
        }

        public final int hashCode() {
            return -1149283683;
        }

        public final String toString() {
            return "OnCloseClicked";
        }
    }

    public final class OnErrorDismissed implements NearbyPayRequestViewEvent {
        public static final OnErrorDismissed INSTANCE = new OnErrorDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnErrorDismissed);
        }

        public final int hashCode() {
            return -577118321;
        }

        public final String toString() {
            return "OnErrorDismissed";
        }
    }

    public final class OnHelpClicked implements NearbyPayRequestViewEvent {
        public static final OnHelpClicked INSTANCE = new OnHelpClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnHelpClicked);
        }

        public final int hashCode() {
            return -572816296;
        }

        public final String toString() {
            return "OnHelpClicked";
        }
    }

    public final class OnMoreInfoClicked implements NearbyPayRequestViewEvent {
        public static final OnMoreInfoClicked INSTANCE = new OnMoreInfoClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnMoreInfoClicked);
        }

        public final int hashCode() {
            return -405653834;
        }

        public final String toString() {
            return "OnMoreInfoClicked";
        }
    }

    public final class OnPermissionsAction implements NearbyPayRequestViewEvent {
        public static final OnPermissionsAction INSTANCE = new OnPermissionsAction();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnPermissionsAction);
        }

        public final int hashCode() {
            return 1546339596;
        }

        public final String toString() {
            return "OnPermissionsAction";
        }
    }

    public final class OnPersonClicked implements NearbyPayRequestViewEvent {
        public final NearbyPerson person;

        public OnPersonClicked(NearbyPerson nearbyPerson) {
            nearbyPerson.getClass();
            this.person = nearbyPerson;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnPersonClicked) && Intrinsics.areEqual(this.person, ((OnPersonClicked) obj).person);
        }

        public final int hashCode() {
            return this.person.hashCode();
        }

        public final String toString() {
            return "OnPersonClicked(person=" + this.person + ")";
        }
    }

    public final class OnSegmentSelected implements NearbyPayRequestViewEvent {
        public final NearbyPayRequestTab tab;

        public OnSegmentSelected(NearbyPayRequestTab nearbyPayRequestTab) {
            nearbyPayRequestTab.getClass();
            this.tab = nearbyPayRequestTab;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnSegmentSelected) && this.tab == ((OnSegmentSelected) obj).tab;
        }

        public final int hashCode() {
            return this.tab.hashCode();
        }

        public final String toString() {
            return "OnSegmentSelected(tab=" + this.tab + ")";
        }
    }

    public final class OnViewAllPayersClicked implements NearbyPayRequestViewEvent {
        public static final OnViewAllPayersClicked INSTANCE = new OnViewAllPayersClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnViewAllPayersClicked);
        }

        public final int hashCode() {
            return -715532101;
        }

        public final String toString() {
            return "OnViewAllPayersClicked";
        }
    }

    public final class OnViewAllPeopleClicked implements NearbyPayRequestViewEvent {
        public static final OnViewAllPeopleClicked INSTANCE = new OnViewAllPeopleClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnViewAllPeopleClicked);
        }

        public final int hashCode() {
            return 2054045898;
        }

        public final String toString() {
            return "OnViewAllPeopleClicked";
        }
    }
}
