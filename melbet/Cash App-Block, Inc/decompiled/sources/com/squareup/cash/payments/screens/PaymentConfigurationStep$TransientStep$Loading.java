package com.squareup.cash.payments.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.payments.screens.NearbyPayer;

/* loaded from: classes6.dex */
public final class PaymentConfigurationStep$TransientStep$Loading implements PaymentConfigurationStep {
    public static final PaymentConfigurationStep$TransientStep$Loading INSTANCE = new PaymentConfigurationStep$TransientStep$Loading();
    public static final Parcelable.Creator<PaymentConfigurationStep$TransientStep$Loading> CREATOR = new NearbyPayer.Creator(12);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof PaymentConfigurationStep$TransientStep$Loading);
    }

    public final int hashCode() {
        return -1941733080;
    }

    public final String toString() {
        return "Loading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
