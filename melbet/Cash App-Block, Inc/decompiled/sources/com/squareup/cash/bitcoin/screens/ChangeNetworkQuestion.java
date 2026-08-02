package com.squareup.cash.bitcoin.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Question;
import com.squareup.cash.bitcoin.screens.MoveBitcoinScreen;

/* loaded from: classes5.dex */
public final class ChangeNetworkQuestion implements Question {
    public static final ChangeNetworkQuestion INSTANCE = new ChangeNetworkQuestion();
    public static final Parcelable.Creator<ChangeNetworkQuestion> CREATOR = new MoveBitcoinScreen.Creator(5);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ChangeNetworkQuestion);
    }

    public final int hashCode() {
        return -1225824997;
    }

    public final String toString() {
        return "ChangeNetworkQuestion";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
