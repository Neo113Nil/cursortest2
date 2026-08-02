package com.squareup.cash.profile.devicemanager.backend;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface DeviceManagerRepo$FetchDevicesResult {

    public final class DevicesError implements DeviceManagerRepo$FetchDevicesResult {
        public static final DevicesError INSTANCE = new DevicesError();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DevicesError);
        }

        public final int hashCode() {
            return 506665644;
        }

        public final String toString() {
            return "DevicesError";
        }
    }

    public final class DevicesLoaded implements DeviceManagerRepo$FetchDevicesResult {
        public final List devices;

        public DevicesLoaded(List list) {
            list.getClass();
            this.devices = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DevicesLoaded) && Intrinsics.areEqual(this.devices, ((DevicesLoaded) obj).devices);
        }

        public final List getDevices() {
            return this.devices;
        }

        public final int hashCode() {
            return this.devices.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("DevicesLoaded(devices=", ")", this.devices);
        }
    }
}
