package com.squareup.cash.paychecks.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.RestoringScreen;
import com.squareup.cash.payments.common.PaymentRecipient;

/* loaded from: classes.dex */
public final class PaychecksHomeScreen implements PaychecksScreen, RestoringScreen {
    public static final PaychecksHomeScreen INSTANCE = new PaychecksHomeScreen();
    public static final Parcelable.Creator<PaychecksHomeScreen> CREATOR = new PaymentRecipient.Creator(24);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof PaychecksHomeScreen);
    }

    public final int hashCode() {
        return 921149194;
    }

    public final String toString() {
        return "PaychecksHomeScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
