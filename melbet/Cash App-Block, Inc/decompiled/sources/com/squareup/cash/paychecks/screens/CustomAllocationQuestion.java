package com.squareup.cash.paychecks.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Question;
import com.squareup.cash.payments.common.PaymentRecipient;

/* loaded from: classes6.dex */
public final class CustomAllocationQuestion implements Question {
    public static final Parcelable.Creator<CustomAllocationQuestion> CREATOR = new PaymentRecipient.Creator(13);

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
