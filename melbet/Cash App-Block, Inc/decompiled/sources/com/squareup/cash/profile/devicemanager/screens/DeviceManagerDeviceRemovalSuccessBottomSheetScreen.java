package com.squareup.cash.profile.devicemanager.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.profile.screens.OpenSourceScreen;
import com.squareup.cash.screens.Redacted;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class DeviceManagerDeviceRemovalSuccessBottomSheetScreen implements DeviceManagerDeviceRemovalSuccessScreen, Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<DeviceManagerDeviceRemovalSuccessBottomSheetScreen> CREATOR = new OpenSourceScreen.Creator(2);
    public final Redacted deviceName;

    public DeviceManagerDeviceRemovalSuccessBottomSheetScreen(Redacted redacted) {
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
        return (obj instanceof DeviceManagerDeviceRemovalSuccessBottomSheetScreen) && Intrinsics.areEqual(this.deviceName, ((DeviceManagerDeviceRemovalSuccessBottomSheetScreen) obj).deviceName);
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
        return "DeviceManagerDeviceRemovalSuccessBottomSheetScreen(deviceName=" + this.deviceName + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.deviceName, i);
    }
}
