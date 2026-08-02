package com.squareup.cash.blockers.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.borrow.screens.BorrowHome;

/* loaded from: classes5.dex */
public final class ReadContactsPermissionResult$Positive implements Parcelable {
    public static final ReadContactsPermissionResult$Positive INSTANCE = new ReadContactsPermissionResult$Positive();
    public static final Parcelable.Creator<ReadContactsPermissionResult$Positive> CREATOR = new BorrowHome.Creator(16);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ReadContactsPermissionResult$Positive);
    }

    public final int hashCode() {
        return 708771542;
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
