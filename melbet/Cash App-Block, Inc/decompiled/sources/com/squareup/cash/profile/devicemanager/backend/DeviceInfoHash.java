package com.squareup.cash.profile.devicemanager.backend;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.pdf.screen.PdfScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class DeviceInfoHash implements Parcelable {
    public static final Parcelable.Creator<DeviceInfoHash> CREATOR = new PdfScreen.Creator(24);
    public final String deviceInfoHash;

    public /* synthetic */ DeviceInfoHash(String str) {
        this.deviceInfoHash = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DeviceInfoHash) {
            return Intrinsics.areEqual(this.deviceInfoHash, ((DeviceInfoHash) obj).deviceInfoHash);
        }
        return false;
    }

    public final int hashCode() {
        return this.deviceInfoHash.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DeviceInfoHash(deviceInfoHash=", this.deviceInfoHash, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.getClass();
        parcel.writeString(this.deviceInfoHash);
    }
}
