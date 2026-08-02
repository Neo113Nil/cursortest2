package com.squareup.cash.blockers.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.borrow.screens.BorrowHome;

/* loaded from: classes4.dex */
public final class CameraErrorResult$Retry implements Parcelable {
    public static final CameraErrorResult$Retry INSTANCE = new CameraErrorResult$Retry();
    public static final Parcelable.Creator<CameraErrorResult$Retry> CREATOR = new BorrowHome.Creator(3);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof CameraErrorResult$Retry);
    }

    public final int hashCode() {
        return 959220190;
    }

    public final String toString() {
        return "Retry";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
