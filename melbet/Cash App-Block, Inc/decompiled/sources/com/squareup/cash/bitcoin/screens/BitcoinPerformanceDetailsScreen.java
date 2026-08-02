package com.squareup.cash.bitcoin.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.bitcoin.screens.BitcoinHome;

/* loaded from: classes.dex */
public final class BitcoinPerformanceDetailsScreen implements Screen {
    public static final BitcoinPerformanceDetailsScreen INSTANCE = new BitcoinPerformanceDetailsScreen();
    public static final Parcelable.Creator<BitcoinPerformanceDetailsScreen> CREATOR = new BitcoinHome.Creator(23);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof BitcoinPerformanceDetailsScreen);
    }

    public final int hashCode() {
        return 1550928947;
    }

    public final String toString() {
        return "BitcoinPerformanceDetailsScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
