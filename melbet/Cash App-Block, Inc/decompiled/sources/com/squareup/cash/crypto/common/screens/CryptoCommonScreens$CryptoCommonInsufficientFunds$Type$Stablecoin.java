package com.squareup.cash.crypto.common.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.composable.adapter.ViewStateId;

/* loaded from: classes6.dex */
public final class CryptoCommonScreens$CryptoCommonInsufficientFunds$Type$Stablecoin implements Parcelable {
    public static final CryptoCommonScreens$CryptoCommonInsufficientFunds$Type$Stablecoin INSTANCE = new CryptoCommonScreens$CryptoCommonInsufficientFunds$Type$Stablecoin();
    public static final Parcelable.Creator<CryptoCommonScreens$CryptoCommonInsufficientFunds$Type$Stablecoin> CREATOR = new ViewStateId.Creator(18);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof CryptoCommonScreens$CryptoCommonInsufficientFunds$Type$Stablecoin);
    }

    public final int hashCode() {
        return 1780764623;
    }

    public final String toString() {
        return "Stablecoin";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
