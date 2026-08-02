package com.squareup.cash.blockers.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.borrow.screens.BorrowHome;

/* loaded from: classes4.dex */
public final class CameraErrorResult$Cancel implements Parcelable {
    public static final CameraErrorResult$Cancel INSTANCE = new CameraErrorResult$Cancel();
    public static final Parcelable.Creator<CameraErrorResult$Cancel> CREATOR = new BorrowHome.Creator(2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof CameraErrorResult$Cancel);
    }

    public final int hashCode() {
        return -762270204;
    }

    public final String toString() {
        return "Cancel";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
