package com.squareup.cash.blockers.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.borrow.screens.BorrowHome;

/* loaded from: classes5.dex */
public final class SkipVerifyResult$Positive implements Parcelable {
    public static final SkipVerifyResult$Positive INSTANCE = new SkipVerifyResult$Positive();
    public static final Parcelable.Creator<SkipVerifyResult$Positive> CREATOR = new BorrowHome.Creator(18);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof SkipVerifyResult$Positive);
    }

    public final int hashCode() {
        return 1023476918;
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
