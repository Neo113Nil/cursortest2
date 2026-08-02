package com.squareup.cash.instruments.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Question;
import com.squareup.cash.instruments.common.Instrument;

/* loaded from: classes6.dex */
public final class WhichInstrument implements Question {
    public static final WhichInstrument INSTANCE = new WhichInstrument();
    public static final Parcelable.Creator<WhichInstrument> CREATOR = new Instrument.Creator(19);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof WhichInstrument);
    }

    public final int hashCode() {
        return -1875647191;
    }

    public final String toString() {
        return "WhichInstrument";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
