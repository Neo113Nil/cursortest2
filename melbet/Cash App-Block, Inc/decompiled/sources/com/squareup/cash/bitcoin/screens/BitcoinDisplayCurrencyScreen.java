package com.squareup.cash.bitcoin.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.screens.MainScreens;

/* loaded from: classes.dex */
public final class BitcoinDisplayCurrencyScreen extends MainScreens {
    public static final BitcoinDisplayCurrencyScreen INSTANCE = new BitcoinDisplayCurrencyScreen(1);
    public static final Parcelable.Creator<BitcoinDisplayCurrencyScreen> CREATOR = new BitcoinHome.Creator(7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof BitcoinDisplayCurrencyScreen);
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        return 1929220138;
    }

    public final String toString() {
        return "BitcoinDisplayCurrencyScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
