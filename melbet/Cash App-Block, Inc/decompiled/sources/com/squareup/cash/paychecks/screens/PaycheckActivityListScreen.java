package com.squareup.cash.paychecks.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.payments.common.PaymentRecipient;

/* loaded from: classes.dex */
public final class PaycheckActivityListScreen implements PaychecksScreen {
    public static final PaycheckActivityListScreen INSTANCE = new PaycheckActivityListScreen();
    public static final Parcelable.Creator<PaycheckActivityListScreen> CREATOR = new PaymentRecipient.Creator(20);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof PaycheckActivityListScreen);
    }

    public final int hashCode() {
        return -1414654547;
    }

    public final String toString() {
        return "PaycheckActivityListScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
