package com.squareup.cash.blockers.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.borrow.screens.BorrowHome;

/* loaded from: classes4.dex */
public final class BusinessDetailsBackConfirmResult$Positive implements Parcelable {
    public static final BusinessDetailsBackConfirmResult$Positive INSTANCE = new BusinessDetailsBackConfirmResult$Positive();
    public static final Parcelable.Creator<BusinessDetailsBackConfirmResult$Positive> CREATOR = new BorrowHome.Creator(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof BusinessDetailsBackConfirmResult$Positive);
    }

    public final int hashCode() {
        return -1312089705;
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
