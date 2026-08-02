package com.squareup.cash.bitcoin.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.screens.MainScreens;

/* loaded from: classes.dex */
public final class BitcoinLimitsLoadingScreen extends MainScreens {
    public static final BitcoinLimitsLoadingScreen INSTANCE = new BitcoinLimitsLoadingScreen(1);
    public static final Parcelable.Creator<BitcoinLimitsLoadingScreen> CREATOR = new BitcoinHome.Creator(15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof BitcoinLimitsLoadingScreen);
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        return 1476949307;
    }

    public final String toString() {
        return "BitcoinLimitsLoadingScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
