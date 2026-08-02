package com.squareup.cash.bitcoin.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Question;
import com.squareup.cash.bitcoin.screens.BitcoinHome;

/* loaded from: classes5.dex */
public final class BitcoinMapErrorQuestion implements Question {
    public static final BitcoinMapErrorQuestion INSTANCE = new BitcoinMapErrorQuestion();
    public static final Parcelable.Creator<BitcoinMapErrorQuestion> CREATOR = new BitcoinHome.Creator(17);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof BitcoinMapErrorQuestion);
    }

    public final int hashCode() {
        return -1896871865;
    }

    public final String toString() {
        return "BitcoinMapErrorQuestion";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
