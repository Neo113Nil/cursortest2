package com.squareup.cash.blockers.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.borrow.screens.BorrowHome;

/* loaded from: classes4.dex */
public final class FilesetUploadErrorResult$Positive implements Parcelable {
    public static final FilesetUploadErrorResult$Positive INSTANCE = new FilesetUploadErrorResult$Positive();
    public static final Parcelable.Creator<FilesetUploadErrorResult$Positive> CREATOR = new BorrowHome.Creator(9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof FilesetUploadErrorResult$Positive);
    }

    public final int hashCode() {
        return 454921517;
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
