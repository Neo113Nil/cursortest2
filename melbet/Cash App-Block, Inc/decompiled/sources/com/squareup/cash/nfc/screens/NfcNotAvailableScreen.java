package com.squareup.cash.nfc.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.NeverInBackStackScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.nearby.viewmodels.ListSection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class NfcNotAvailableScreen implements Screen, NeverInBackStackScreen {
    public static final Parcelable.Creator<NfcNotAvailableScreen> CREATOR = new ListSection.Creator(2);
    public final Screen exitScreen;
    public final Screen nextScreen;

    public NfcNotAvailableScreen(Screen screen, Screen screen2) {
        screen.getClass();
        screen2.getClass();
        this.nextScreen = screen;
        this.exitScreen = screen2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NfcNotAvailableScreen)) {
            return false;
        }
        NfcNotAvailableScreen nfcNotAvailableScreen = (NfcNotAvailableScreen) obj;
        return Intrinsics.areEqual(this.nextScreen, nfcNotAvailableScreen.nextScreen) && Intrinsics.areEqual(this.exitScreen, nfcNotAvailableScreen.exitScreen);
    }

    public final int hashCode() {
        return this.exitScreen.hashCode() + (this.nextScreen.hashCode() * 31);
    }

    public final String toString() {
        return "NfcNotAvailableScreen(nextScreen=" + this.nextScreen + ", exitScreen=" + this.exitScreen + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.nextScreen, i);
        parcel.writeParcelable(this.exitScreen, i);
    }
}
