package com.squareup.cash.bitcoin.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.bitcoin.screens.MoveBitcoinScreen;
import com.squareup.cash.screens.MainScreens;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class PaidInBitcoinLandingScreen extends MainScreens {
    public static final Parcelable.Creator<PaidInBitcoinLandingScreen> CREATOR = new MoveBitcoinScreen.Creator(7);
    public final Screen exitScreen;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaidInBitcoinLandingScreen(Screen screen) {
        super(1);
        screen.getClass();
        this.exitScreen = screen;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaidInBitcoinLandingScreen) && Intrinsics.areEqual(this.exitScreen, ((PaidInBitcoinLandingScreen) obj).exitScreen);
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        return this.exitScreen.hashCode();
    }

    public final String toString() {
        return re$$ExternalSyntheticOutline0.m(this.exitScreen, "PaidInBitcoinLandingScreen(exitScreen=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.exitScreen, i);
    }
}
