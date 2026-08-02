package com.squareup.cash.profile.devicemanager.viewmodels;

/* loaded from: classes6.dex */
public interface DeviceManagerRemovedSuccessViewEvent {

    public final class Done implements DeviceManagerRemovedSuccessViewEvent {
        public static final Done INSTANCE = new Done();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Done);
        }

        public final int hashCode() {
            return -402829628;
        }

        public final String toString() {
            return "Done";
        }
    }

    public final class EnableSecurityOption implements DeviceManagerRemovedSuccessViewEvent {
        public static final EnableSecurityOption INSTANCE = new EnableSecurityOption();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EnableSecurityOption);
        }

        public final int hashCode() {
            return 788362106;
        }

        public final String toString() {
            return "EnableSecurityOption";
        }
    }

    public final class GoBack implements DeviceManagerRemovedSuccessViewEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return -487639887;
        }

        public final String toString() {
            return "GoBack";
        }
    }
}
