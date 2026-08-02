package com.squareup.cash.payments.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zza;

/* loaded from: classes.dex */
public final class PaymentScreens$HomeScreens$PaymentPad extends PaymentScreens {
    public static final PaymentScreens$HomeScreens$PaymentPad INSTANCE = new PaymentScreens$HomeScreens$PaymentPad(0);
    public static final Parcelable.Creator<PaymentScreens$HomeScreens$PaymentPad> CREATOR = new zza(27);

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
