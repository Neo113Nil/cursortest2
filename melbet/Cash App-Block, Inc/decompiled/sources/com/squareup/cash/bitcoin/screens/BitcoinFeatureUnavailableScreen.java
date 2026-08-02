package com.squareup.cash.bitcoin.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.screens.MainScreens;

/* loaded from: classes.dex */
public final class BitcoinFeatureUnavailableScreen extends MainScreens {
    public static final BitcoinFeatureUnavailableScreen INSTANCE = new BitcoinFeatureUnavailableScreen(1);
    public static final Parcelable.Creator<BitcoinFeatureUnavailableScreen> CREATOR = new BitcoinHome.Creator(9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof BitcoinFeatureUnavailableScreen);
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        return -1658236485;
    }

    public final String toString() {
        return "BitcoinFeatureUnavailableScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
