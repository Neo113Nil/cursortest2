package com.squareup.cash.card.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.card.onboarding.StampResult;

/* loaded from: classes6.dex */
public final class ConfirmExitDisclosureResult$Negative implements Parcelable {
    public static final ConfirmExitDisclosureResult$Negative INSTANCE = new ConfirmExitDisclosureResult$Negative();
    public static final Parcelable.Creator<ConfirmExitDisclosureResult$Negative> CREATOR = new StampResult.Creator(8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ConfirmExitDisclosureResult$Negative);
    }

    public final int hashCode() {
        return -1954923102;
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
