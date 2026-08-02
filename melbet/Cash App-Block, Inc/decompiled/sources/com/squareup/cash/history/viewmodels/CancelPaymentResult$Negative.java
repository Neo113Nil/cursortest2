package com.squareup.cash.history.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.fileupload.api.UriString;

/* loaded from: classes6.dex */
public final class CancelPaymentResult$Negative implements Parcelable {
    public static final CancelPaymentResult$Negative INSTANCE = new CancelPaymentResult$Negative();
    public static final Parcelable.Creator<CancelPaymentResult$Negative> CREATOR = new UriString.Creator(20);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof CancelPaymentResult$Negative);
    }

    public final int hashCode() {
        return -1184689267;
    }

    public final String toString() {
        return "Negative";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
