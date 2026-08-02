package com.squareup.cash.beacondetection.api;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public final class IBeaconDevice {
    public final int major;
    public final int minor;
    public final int rssi;
    public final int txPower;
    public final String uuid;

    public IBeaconDevice(int i, int i2, int i3, int i4, String str) {
        this.uuid = str;
        this.major = i;
        this.minor = i2;
        this.rssi = i3;
        this.txPower = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IBeaconDevice)) {
            return false;
        }
        IBeaconDevice iBeaconDevice = (IBeaconDevice) obj;
        return this.uuid.equals(iBeaconDevice.uuid) && this.major == iBeaconDevice.major && this.minor == iBeaconDevice.minor && this.rssi == iBeaconDevice.rssi && this.txPower == iBeaconDevice.txPower;
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final int getRssi() {
        return this.rssi;
    }

    public final int getTxPower() {
        return this.txPower;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final int hashCode() {
        return Integer.hashCode(this.txPower) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.rssi, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.minor, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.major, this.uuid.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder m = Recorder$$ExternalSyntheticOutline2.m("IBeaconDevice(uuid=", this.major, this.uuid, ", major=", ", minor=");
        Recorder$$ExternalSyntheticOutline1.m105m(this.minor, this.rssi, ", rssi=", ", txPower=", m);
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.txPower, ")", m);
    }
}
