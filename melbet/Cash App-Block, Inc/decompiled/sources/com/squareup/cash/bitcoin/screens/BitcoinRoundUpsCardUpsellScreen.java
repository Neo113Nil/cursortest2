package com.squareup.cash.bitcoin.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.screens.MainScreens;

/* loaded from: classes.dex */
public final class BitcoinRoundUpsCardUpsellScreen extends MainScreens {
    public static final BitcoinRoundUpsCardUpsellScreen INSTANCE = new BitcoinRoundUpsCardUpsellScreen(1);
    public static final Parcelable.Creator<BitcoinRoundUpsCardUpsellScreen> CREATOR = new BitcoinHome.Creator(26);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof BitcoinRoundUpsCardUpsellScreen);
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        return 951036040;
    }

    public final String toString() {
        return "BitcoinRoundUpsCardUpsellScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
