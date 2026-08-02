package com.squareup.cash.instruments.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Question;
import com.squareup.cash.instruments.common.Instrument;

/* loaded from: classes6.dex */
public final class TransferOptionPickerQuestion implements Question {
    public static final TransferOptionPickerQuestion INSTANCE = new TransferOptionPickerQuestion();
    public static final Parcelable.Creator<TransferOptionPickerQuestion> CREATOR = new Instrument.Creator(15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof TransferOptionPickerQuestion);
    }

    public final int hashCode() {
        return -916978737;
    }

    public final String toString() {
        return "TransferOptionPickerQuestion";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
