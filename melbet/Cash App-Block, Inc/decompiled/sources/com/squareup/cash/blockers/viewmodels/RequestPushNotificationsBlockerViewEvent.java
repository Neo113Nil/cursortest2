package com.squareup.cash.blockers.viewmodels;

import com.squareup.protos.franklin.api.NotificationCategory;

/* loaded from: classes4.dex */
public interface RequestPushNotificationsBlockerViewEvent {

    public final class OnContinue implements RequestPushNotificationsBlockerViewEvent {
        public static final OnContinue INSTANCE = new OnContinue();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnContinue);
        }

        public final int hashCode() {
            return 1643210174;
        }

        public final String toString() {
            return "OnContinue";
        }
    }

    public final class OnDismiss implements RequestPushNotificationsBlockerViewEvent {
        public static final OnDismiss INSTANCE = new OnDismiss();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnDismiss);
        }

        public final int hashCode() {
            return -889423213;
        }

        public final String toString() {
            return "OnDismiss";
        }
    }

    public final class OnToggleChanged implements RequestPushNotificationsBlockerViewEvent {
        public final NotificationCategory category;
        public final boolean enabled;

        public OnToggleChanged(NotificationCategory notificationCategory, boolean z) {
            this.category = notificationCategory;
            this.enabled = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnToggleChanged)) {
                return false;
            }
            OnToggleChanged onToggleChanged = (OnToggleChanged) obj;
            return this.category == onToggleChanged.category && this.enabled == onToggleChanged.enabled;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.enabled) + (this.category.hashCode() * 31);
        }

        public final String toString() {
            return "OnToggleChanged(category=" + this.category + ", enabled=" + this.enabled + ")";
        }
    }
}
