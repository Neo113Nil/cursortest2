package com.squareup.cash.blockers.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.borrow.screens.BorrowHome;

/* loaded from: classes4.dex */
public final class CameraPermissionResult$Positive implements Parcelable {
    public static final CameraPermissionResult$Positive INSTANCE = new CameraPermissionResult$Positive();
    public static final Parcelable.Creator<CameraPermissionResult$Positive> CREATOR = new BorrowHome.Creator(5);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof CameraPermissionResult$Positive);
    }

    public final int hashCode() {
        return 57710138;
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
