package com.squareup.cash.bitcoin.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.bitcoin.screens.MoveBitcoinScreen;

/* loaded from: classes.dex */
public final class SatoshiLearnMoreSheetScreen extends BitcoinSheets {
    public static final SatoshiLearnMoreSheetScreen INSTANCE = new SatoshiLearnMoreSheetScreen(1);
    public static final Parcelable.Creator<SatoshiLearnMoreSheetScreen> CREATOR = new MoveBitcoinScreen.Creator(9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof SatoshiLearnMoreSheetScreen);
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        return 134301204;
    }

    public final String toString() {
        return "SatoshiLearnMoreSheetScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
