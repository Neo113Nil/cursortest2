package com.squareup.cash.payments.viewmodels;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface NearbyPeopleOverflowSheetViewEvent {

    public final class OnAvatarClicked implements NearbyPeopleOverflowSheetViewEvent {
        public final NearbyPerson person;

        public OnAvatarClicked(NearbyPerson nearbyPerson) {
            nearbyPerson.getClass();
            this.person = nearbyPerson;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnAvatarClicked) && Intrinsics.areEqual(this.person, ((OnAvatarClicked) obj).person);
        }

        public final int hashCode() {
            return this.person.hashCode();
        }

        public final String toString() {
            return "OnAvatarClicked(person=" + this.person + ")";
        }
    }

    public final class OnDismiss implements NearbyPeopleOverflowSheetViewEvent {
        public static final OnDismiss INSTANCE = new OnDismiss();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnDismiss);
        }

        public final int hashCode() {
            return 1837226291;
        }

        public final String toString() {
            return "OnDismiss";
        }
    }

    public final class OnPersonClicked implements NearbyPeopleOverflowSheetViewEvent {
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
}
