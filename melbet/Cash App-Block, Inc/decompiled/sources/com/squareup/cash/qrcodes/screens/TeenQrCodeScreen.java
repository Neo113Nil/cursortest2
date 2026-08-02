package com.squareup.cash.qrcodes.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.protos.franklin.api.Region;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class TeenQrCodeScreen implements QrScreen {
    public static final Parcelable.Creator<TeenQrCodeScreen> CREATOR = new Recipient.Creator(4);
    public final String dependentCashtag;
    public final String dependentName;
    public final String dependentToken;
    public final Screen exitScreen;
    public final Region region;

    public TeenQrCodeScreen(String str, String str2, String str3, Region region, Screen screen) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        screen.getClass();
        this.dependentToken = str;
        this.dependentName = str2;
        this.dependentCashtag = str3;
        this.region = region;
        this.exitScreen = screen;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeenQrCodeScreen)) {
            return false;
        }
        TeenQrCodeScreen teenQrCodeScreen = (TeenQrCodeScreen) obj;
        return Intrinsics.areEqual(this.dependentToken, teenQrCodeScreen.dependentToken) && Intrinsics.areEqual(this.dependentName, teenQrCodeScreen.dependentName) && Intrinsics.areEqual(this.dependentCashtag, teenQrCodeScreen.dependentCashtag) && this.region == teenQrCodeScreen.region && Intrinsics.areEqual(this.exitScreen, teenQrCodeScreen.exitScreen);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.dependentToken.hashCode() * 31, 31, this.dependentName), 31, this.dependentCashtag);
        Region region = this.region;
        return this.exitScreen.hashCode() + ((m + (region == null ? 0 : region.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TeenQrCodeScreen(dependentToken=", this.dependentToken, ", dependentName=", this.dependentName, ", dependentCashtag=");
        m.append(this.dependentCashtag);
        m.append(", region=");
        m.append(this.region);
        m.append(", exitScreen=");
        m.append(this.exitScreen);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.dependentToken);
        parcel.writeString(this.dependentName);
        parcel.writeString(this.dependentCashtag);
        Region region = this.region;
        if (region == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(region.name());
        }
        parcel.writeParcelable(this.exitScreen, i);
    }
}
