package com.squareup.cash.qrcodes.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.profile.viewmodels.Alias;
import com.squareup.cash.screens.Back;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class CashQrCodeScanner implements QrScreen {
    public static final Parcelable.Creator<CashQrCodeScanner> CREATOR = new Alias.Creator(27);
    public final Screen exitScreen;
    public final boolean hideSegmentedControl;

    public /* synthetic */ CashQrCodeScanner(Screen screen, boolean z, int i) {
        this((i & 1) != 0 ? Back.INSTANCE : screen, (i & 2) != 0 ? false : z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashQrCodeScanner)) {
            return false;
        }
        CashQrCodeScanner cashQrCodeScanner = (CashQrCodeScanner) obj;
        return Intrinsics.areEqual(this.exitScreen, cashQrCodeScanner.exitScreen) && this.hideSegmentedControl == cashQrCodeScanner.hideSegmentedControl;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.hideSegmentedControl) + (this.exitScreen.hashCode() * 31);
    }

    public final String toString() {
        return "CashQrCodeScanner(exitScreen=" + this.exitScreen + ", hideSegmentedControl=" + this.hideSegmentedControl + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.exitScreen, i);
        parcel.writeInt(this.hideSegmentedControl ? 1 : 0);
    }

    public CashQrCodeScanner(Screen screen, boolean z) {
        screen.getClass();
        this.exitScreen = screen;
        this.hideSegmentedControl = z;
    }
}
