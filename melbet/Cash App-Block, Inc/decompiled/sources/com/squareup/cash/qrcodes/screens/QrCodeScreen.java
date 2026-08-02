package com.squareup.cash.qrcodes.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.recipients.data.Recipient;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class QrCodeScreen implements QrScreen {
    public static final Parcelable.Creator<QrCodeScreen> CREATOR = new Recipient.Creator(3);
    public final Screen exitScreen;

    public QrCodeScreen(Screen screen) {
        screen.getClass();
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
        return (obj instanceof QrCodeScreen) && Intrinsics.areEqual(this.exitScreen, ((QrCodeScreen) obj).exitScreen);
    }

    public final int hashCode() {
        return this.exitScreen.hashCode();
    }

    public final String toString() {
        return re$$ExternalSyntheticOutline0.m(this.exitScreen, "QrCodeScreen(exitScreen=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.exitScreen, i);
    }
}
