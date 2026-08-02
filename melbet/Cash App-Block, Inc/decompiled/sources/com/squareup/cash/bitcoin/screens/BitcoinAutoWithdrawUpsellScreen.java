package com.squareup.cash.bitcoin.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.screens.MainScreens;

/* loaded from: classes.dex */
public final class BitcoinAutoWithdrawUpsellScreen extends MainScreens {
    public static final BitcoinAutoWithdrawUpsellScreen INSTANCE = new BitcoinAutoWithdrawUpsellScreen(1);
    public static final Parcelable.Creator<BitcoinAutoWithdrawUpsellScreen> CREATOR = new BitcoinHome.Creator(2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof BitcoinAutoWithdrawUpsellScreen);
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        return 1749253351;
    }

    public final String toString() {
        return "BitcoinAutoWithdrawUpsellScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
