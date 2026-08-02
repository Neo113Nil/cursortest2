package com.squareup.cash.bitcoin.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Question;
import com.squareup.cash.appmessages.SheetAppMessage;

/* loaded from: classes5.dex */
public final class BitcoinAmountPickerQuestion implements Question {
    public static final BitcoinAmountPickerQuestion INSTANCE = new BitcoinAmountPickerQuestion();
    public static final Parcelable.Creator<BitcoinAmountPickerQuestion> CREATOR = new SheetAppMessage.Creator(29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof BitcoinAmountPickerQuestion);
    }

    public final int hashCode() {
        return -67913535;
    }

    public final String toString() {
        return "BitcoinAmountPickerQuestion";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
