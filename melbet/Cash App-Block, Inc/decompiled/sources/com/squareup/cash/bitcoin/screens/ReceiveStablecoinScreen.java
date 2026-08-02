package com.squareup.cash.bitcoin.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.bitcoin.screens.MoveBitcoinScreen;
import com.squareup.cash.screens.MainScreens;

/* loaded from: classes.dex */
public final class ReceiveStablecoinScreen extends MainScreens {
    public static final ReceiveStablecoinScreen INSTANCE = new ReceiveStablecoinScreen(1);
    public static final Parcelable.Creator<ReceiveStablecoinScreen> CREATOR = new MoveBitcoinScreen.Creator(8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ReceiveStablecoinScreen);
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        return 1597886930;
    }

    public final String toString() {
        return "ReceiveStablecoinScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
