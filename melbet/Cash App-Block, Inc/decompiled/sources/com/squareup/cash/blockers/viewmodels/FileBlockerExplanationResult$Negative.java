package com.squareup.cash.blockers.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.borrow.screens.BorrowHome;

/* loaded from: classes4.dex */
public final class FileBlockerExplanationResult$Negative implements Parcelable {
    public static final FileBlockerExplanationResult$Negative INSTANCE = new FileBlockerExplanationResult$Negative();
    public static final Parcelable.Creator<FileBlockerExplanationResult$Negative> CREATOR = new BorrowHome.Creator(6);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof FileBlockerExplanationResult$Negative);
    }

    public final int hashCode() {
        return -1615713521;
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
