package com.squareup.cash.card.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.card.onboarding.StampResult;

/* loaded from: classes6.dex */
public final class ConfirmExitDisclosureResult$Positive implements Parcelable {
    public static final ConfirmExitDisclosureResult$Positive INSTANCE = new ConfirmExitDisclosureResult$Positive();
    public static final Parcelable.Creator<ConfirmExitDisclosureResult$Positive> CREATOR = new StampResult.Creator(9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ConfirmExitDisclosureResult$Positive);
    }

    public final int hashCode() {
        return -2128229530;
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
