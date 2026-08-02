package com.squareup.cash.blockers.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.borrow.screens.BorrowHome;

/* loaded from: classes5.dex */
public final class UpgradeConfirmationResult$Positive implements Parcelable {
    public static final UpgradeConfirmationResult$Positive INSTANCE = new UpgradeConfirmationResult$Positive();
    public static final Parcelable.Creator<UpgradeConfirmationResult$Positive> CREATOR = new BorrowHome.Creator(20);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof UpgradeConfirmationResult$Positive);
    }

    public final int hashCode() {
        return 41087669;
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
