package com.squareup.cash.profile.viewmodels;

/* loaded from: classes7.dex */
public abstract class ContactMethodDetailsViewEvent {

    public final class GoBack extends ContactMethodDetailsViewEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return -1354249327;
        }

        public final String toString() {
            return "GoBack";
        }
    }

    public final class NotificationToggled extends ContactMethodDetailsViewEvent {
        public final Alias alias;
        public final boolean checkedValue;

        public NotificationToggled(Alias alias, boolean z) {
            this.alias = alias;
            this.checkedValue = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationToggled)) {
                return false;
            }
            NotificationToggled notificationToggled = (NotificationToggled) obj;
            return this.alias.equals(notificationToggled.alias) && this.checkedValue == notificationToggled.checkedValue;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.checkedValue) + (this.alias.hashCode() * 31);
        }

        public final String toString() {
            return "NotificationToggled(alias=" + this.alias + ", checkedValue=" + this.checkedValue + ")";
        }
    }
}
