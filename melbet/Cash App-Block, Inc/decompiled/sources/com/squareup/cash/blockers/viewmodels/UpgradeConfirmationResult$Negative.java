package com.squareup.cash.blockers.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.borrow.screens.BorrowHome;

/* loaded from: classes5.dex */
public final class UpgradeConfirmationResult$Negative implements Parcelable {
    public static final UpgradeConfirmationResult$Negative INSTANCE = new UpgradeConfirmationResult$Negative();
    public static final Parcelable.Creator<UpgradeConfirmationResult$Negative> CREATOR = new BorrowHome.Creator(19);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof UpgradeConfirmationResult$Negative);
    }

    public final int hashCode() {
        return 214394097;
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
