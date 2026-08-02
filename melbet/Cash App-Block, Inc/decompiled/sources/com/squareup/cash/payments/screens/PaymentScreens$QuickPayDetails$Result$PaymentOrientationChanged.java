package com.squareup.cash.payments.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.payments.screens.ScenarioInitiator;
import com.squareup.protos.franklin.common.Orientation;

/* loaded from: classes6.dex */
public final class PaymentScreens$QuickPayDetails$Result$PaymentOrientationChanged implements Parcelable {
    public static final Parcelable.Creator<PaymentScreens$QuickPayDetails$Result$PaymentOrientationChanged> CREATOR = new ScenarioInitiator.Creator(16);
    public final Orientation newOrientation;

    public PaymentScreens$QuickPayDetails$Result$PaymentOrientationChanged(Orientation orientation) {
        orientation.getClass();
        this.newOrientation = orientation;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaymentScreens$QuickPayDetails$Result$PaymentOrientationChanged) && this.newOrientation == ((PaymentScreens$QuickPayDetails$Result$PaymentOrientationChanged) obj).newOrientation;
    }

    public final int hashCode() {
        return this.newOrientation.hashCode();
    }

    public final String toString() {
        return "PaymentOrientationChanged(newOrientation=" + this.newOrientation + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.newOrientation.name());
    }
}
