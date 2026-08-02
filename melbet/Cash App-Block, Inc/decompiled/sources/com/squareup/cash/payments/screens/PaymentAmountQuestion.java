package com.squareup.cash.payments.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Question;
import com.squareup.cash.payments.screens.NearbyPayer;

/* loaded from: classes6.dex */
public final class PaymentAmountQuestion implements Question {
    public static final PaymentAmountQuestion INSTANCE = new PaymentAmountQuestion();
    public static final Parcelable.Creator<PaymentAmountQuestion> CREATOR = new NearbyPayer.Creator(1);

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
