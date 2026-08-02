package com.squareup.cash.bitcoin.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.bitcoin.screens.MoveBitcoinScreen;
import com.squareup.cash.screens.MainScreens;

/* loaded from: classes.dex */
public final class PaidInBitcoinCardUpsellScreen extends MainScreens {
    public static final PaidInBitcoinCardUpsellScreen INSTANCE = new PaidInBitcoinCardUpsellScreen(1);
    public static final Parcelable.Creator<PaidInBitcoinCardUpsellScreen> CREATOR = new MoveBitcoinScreen.Creator(6);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof PaidInBitcoinCardUpsellScreen);
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        return -1106040051;
    }

    public final String toString() {
        return "PaidInBitcoinCardUpsellScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
