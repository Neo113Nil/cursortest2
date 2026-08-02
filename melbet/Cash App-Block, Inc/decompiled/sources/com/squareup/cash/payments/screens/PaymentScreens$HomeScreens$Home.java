package com.squareup.cash.payments.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zza;

/* loaded from: classes.dex */
public final class PaymentScreens$HomeScreens$Home extends PaymentScreens {
    public static final PaymentScreens$HomeScreens$Home INSTANCE = new PaymentScreens$HomeScreens$Home(0);
    public static final Parcelable.Creator<PaymentScreens$HomeScreens$Home> CREATOR = new zza(26);

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
