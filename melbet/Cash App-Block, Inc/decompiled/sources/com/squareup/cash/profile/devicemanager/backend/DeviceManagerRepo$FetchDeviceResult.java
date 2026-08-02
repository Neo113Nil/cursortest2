package com.squareup.cash.profile.devicemanager.backend;

/* loaded from: classes6.dex */
public interface DeviceManagerRepo$FetchDeviceResult {

    public final class DeviceError implements DeviceManagerRepo$FetchDeviceResult {
        public static final DeviceError INSTANCE = new DeviceError();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DeviceError);
        }

        public final int hashCode() {
            return 195393124;
        }

        public final String toString() {
            return "DeviceError";
        }
    }

    public final class DeviceLoaded implements DeviceManagerRepo$FetchDeviceResult {
        public final LoggedInDevice device;

        public DeviceLoaded(LoggedInDevice loggedInDevice) {
            this.device = loggedInDevice;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeviceLoaded) && this.device.equals(((DeviceLoaded) obj).device);
        }

        public final int hashCode() {
            return this.device.hashCode();
        }

        public final String toString() {
            return "DeviceLoaded(device=" + this.device + ")";
        }
    }
}
