package com.squareup.cash.bitcoin.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.bitcoin.screens.MoveBitcoinScreen;

/* loaded from: classes.dex */
public final class WalletAddressOptionsSheet extends BitcoinSheets {
    public static final WalletAddressOptionsSheet INSTANCE = new WalletAddressOptionsSheet(1);
    public static final Parcelable.Creator<WalletAddressOptionsSheet> CREATOR = new MoveBitcoinScreen.Creator(15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof WalletAddressOptionsSheet);
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        return 57117171;
    }

    public final String toString() {
        return "WalletAddressOptionsSheet";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
