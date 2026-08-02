package com.squareup.cash.deposits.physical.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Question;
import com.squareup.cash.db.contacts.Recipient;

/* loaded from: classes6.dex */
public final class AddressSearchQuestion implements Question {
    public static final Parcelable.Creator<AddressSearchQuestion> CREATOR = new Recipient.Creator(12);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
