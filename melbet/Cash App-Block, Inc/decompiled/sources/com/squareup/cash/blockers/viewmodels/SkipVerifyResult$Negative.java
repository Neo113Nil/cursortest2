package com.squareup.cash.blockers.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.borrow.screens.BorrowHome;

/* loaded from: classes5.dex */
public final class SkipVerifyResult$Negative implements Parcelable {
    public static final SkipVerifyResult$Negative INSTANCE = new SkipVerifyResult$Negative();
    public static final Parcelable.Creator<SkipVerifyResult$Negative> CREATOR = new BorrowHome.Creator(17);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof SkipVerifyResult$Negative);
    }

    public final int hashCode() {
        return 1196783346;
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
