package com.squareup.cash.bitcoin.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.bitcoin.screens.BitcoinHome;

/* loaded from: classes.dex */
public final class BitcoinSendReceiveBottomSheetScreen extends BitcoinSheets {
    public static final BitcoinSendReceiveBottomSheetScreen INSTANCE = new BitcoinSendReceiveBottomSheetScreen(1);
    public static final Parcelable.Creator<BitcoinSendReceiveBottomSheetScreen> CREATOR = new BitcoinHome.Creator(27);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof BitcoinSendReceiveBottomSheetScreen);
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        return -388063942;
    }

    public final String toString() {
        return "BitcoinSendReceiveBottomSheetScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
