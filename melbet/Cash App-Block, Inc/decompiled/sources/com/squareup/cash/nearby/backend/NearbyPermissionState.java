package com.squareup.cash.nearby.backend;

import com.squareup.cash.nearby.backend.ble.BleDeviceState;

/* loaded from: classes6.dex */
public final class NearbyPermissionState {
    public final PermissionState bluetoothPermission;
    public final BleDeviceState bluetoothState;
    public final PermissionState locationPermission;

    public NearbyPermissionState(BleDeviceState bleDeviceState, PermissionState permissionState, PermissionState permissionState2) {
        bleDeviceState.getClass();
        this.bluetoothState = bleDeviceState;
        this.bluetoothPermission = permissionState;
        this.locationPermission = permissionState2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyPermissionState)) {
            return false;
        }
        NearbyPermissionState nearbyPermissionState = (NearbyPermissionState) obj;
        return this.bluetoothState == nearbyPermissionState.bluetoothState && this.bluetoothPermission.equals(nearbyPermissionState.bluetoothPermission) && this.locationPermission.equals(nearbyPermissionState.locationPermission);
    }

    public final int hashCode() {
        return this.locationPermission.hashCode() + ((this.bluetoothPermission.hashCode() + (this.bluetoothState.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "NearbyPermissionState(bluetoothState=" + this.bluetoothState + ", bluetoothPermission=" + this.bluetoothPermission + ", locationPermission=" + this.locationPermission + ")";
    }
}
