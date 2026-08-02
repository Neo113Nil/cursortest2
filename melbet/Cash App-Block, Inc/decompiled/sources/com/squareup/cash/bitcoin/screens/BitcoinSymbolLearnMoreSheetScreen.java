package com.squareup.cash.bitcoin.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.bitcoin.screens.MoveBitcoinScreen;

/* loaded from: classes.dex */
public final class BitcoinSymbolLearnMoreSheetScreen extends BitcoinSheets {
    public static final BitcoinSymbolLearnMoreSheetScreen INSTANCE = new BitcoinSymbolLearnMoreSheetScreen(1);
    public static final Parcelable.Creator<BitcoinSymbolLearnMoreSheetScreen> CREATOR = new MoveBitcoinScreen.Creator(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof BitcoinSymbolLearnMoreSheetScreen);
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        return 644793055;
    }

    public final String toString() {
        return "BitcoinSymbolLearnMoreSheetScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
