package com.squareup.cash.profile.viewmodels;

/* loaded from: classes7.dex */
public abstract class ProfileNotificationsViewEvent {

    public final class GoBack extends ProfileNotificationsViewEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return 1840405359;
        }

        public final String toString() {
            return "GoBack";
        }
    }

    public final class OpenSettingsTapped extends ProfileNotificationsViewEvent {
        public static final OpenSettingsTapped INSTANCE = new OpenSettingsTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OpenSettingsTapped);
        }

        public final int hashCode() {
            return -1748967687;
        }

        public final String toString() {
            return "OpenSettingsTapped";
        }
    }
}
