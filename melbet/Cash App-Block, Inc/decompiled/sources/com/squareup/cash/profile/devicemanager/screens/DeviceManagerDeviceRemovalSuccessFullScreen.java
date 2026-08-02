package com.squareup.cash.profile.devicemanager.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.profile.screens.OpenSourceScreen;
import com.squareup.cash.screens.Redacted;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class DeviceManagerDeviceRemovalSuccessFullScreen implements DeviceManagerDeviceRemovalSuccessScreen {
    public static final Parcelable.Creator<DeviceManagerDeviceRemovalSuccessFullScreen> CREATOR = new OpenSourceScreen.Creator(3);
    public final Redacted deviceName;

    public DeviceManagerDeviceRemovalSuccessFullScreen(Redacted redacted) {
        this.deviceName = redacted;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeviceManagerDeviceRemovalSuccessFullScreen) && Intrinsics.areEqual(this.deviceName, ((DeviceManagerDeviceRemovalSuccessFullScreen) obj).deviceName);
    }

    @Override // com.squareup.cash.profile.devicemanager.screens.DeviceManagerDeviceRemovalSuccessScreen
    public final Redacted getDeviceName() {
        return this.deviceName;
    }

    public final int hashCode() {
        Redacted redacted = this.deviceName;
        if (redacted == null) {
            return 0;
        }
        return redacted.hashCode();
    }

    public final String toString() {
        return "DeviceManagerDeviceRemovalSuccessFullScreen(deviceName=" + this.deviceName + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.deviceName, i);
    }
}
