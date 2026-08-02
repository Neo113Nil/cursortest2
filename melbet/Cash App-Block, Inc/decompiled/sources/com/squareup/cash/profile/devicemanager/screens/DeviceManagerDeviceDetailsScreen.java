package com.squareup.cash.profile.devicemanager.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import app.cash.broadway.screen.BottomSheetScreen;
import com.squareup.cash.pdf.screen.PdfScreen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class DeviceManagerDeviceDetailsScreen implements BottomSheetScreen {
    public static final Parcelable.Creator<DeviceManagerDeviceDetailsScreen> CREATOR = new PdfScreen.Creator(28);
    public final String deviceAppToken;
    public final int removeAttemptCount;

    public DeviceManagerDeviceDetailsScreen(String str, int i) {
        str.getClass();
        this.deviceAppToken = str;
        this.removeAttemptCount = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceManagerDeviceDetailsScreen)) {
            return false;
        }
        DeviceManagerDeviceDetailsScreen deviceManagerDeviceDetailsScreen = (DeviceManagerDeviceDetailsScreen) obj;
        return Intrinsics.areEqual(this.deviceAppToken, deviceManagerDeviceDetailsScreen.deviceAppToken) && this.removeAttemptCount == deviceManagerDeviceDetailsScreen.removeAttemptCount;
    }

    public final int hashCode() {
        return Integer.hashCode(this.removeAttemptCount) + (this.deviceAppToken.hashCode() * 31);
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline1.m("DeviceManagerDeviceDetailsScreen(deviceAppToken=", this.removeAttemptCount, this.deviceAppToken, ", removeAttemptCount=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.deviceAppToken);
        parcel.writeInt(this.removeAttemptCount);
    }
}
