package com.squareup.cash.profile.devicemanager.viewmodels;

/* loaded from: classes6.dex */
public interface DeviceManagerDetailsViewEvent {

    public final class DeleteDevice implements DeviceManagerDetailsViewEvent {
        public static final DeleteDevice INSTANCE = new DeleteDevice();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DeleteDevice);
        }

        public final int hashCode() {
            return -1554929002;
        }

        public final String toString() {
            return "DeleteDevice";
        }
    }

    public final class GoBack implements DeviceManagerDetailsViewEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return 1482458212;
        }

        public final String toString() {
            return "GoBack";
        }
    }
}
