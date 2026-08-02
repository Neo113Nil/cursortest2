package com.squareup.cash.history.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.fileupload.api.UriString;

/* loaded from: classes6.dex */
public final class CancelPaymentResult$Positive implements Parcelable {
    public static final CancelPaymentResult$Positive INSTANCE = new CancelPaymentResult$Positive();
    public static final Parcelable.Creator<CancelPaymentResult$Positive> CREATOR = new UriString.Creator(21);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof CancelPaymentResult$Positive);
    }

    public final int hashCode() {
        return -1357995695;
    }

    public final String toString() {
        return "Positive";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
