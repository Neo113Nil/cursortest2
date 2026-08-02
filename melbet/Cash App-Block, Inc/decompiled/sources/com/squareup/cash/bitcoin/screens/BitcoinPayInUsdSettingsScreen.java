package com.squareup.cash.bitcoin.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.screens.MainScreens;

/* loaded from: classes.dex */
public final class BitcoinPayInUsdSettingsScreen extends MainScreens {
    public static final BitcoinPayInUsdSettingsScreen INSTANCE = new BitcoinPayInUsdSettingsScreen(1);
    public static final Parcelable.Creator<BitcoinPayInUsdSettingsScreen> CREATOR = new BitcoinHome.Creator(22);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof BitcoinPayInUsdSettingsScreen);
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        return 1964571549;
    }

    public final String toString() {
        return "BitcoinPayInUsdSettingsScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
