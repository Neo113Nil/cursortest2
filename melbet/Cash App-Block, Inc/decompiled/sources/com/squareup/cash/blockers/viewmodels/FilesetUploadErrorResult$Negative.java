package com.squareup.cash.blockers.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.borrow.screens.BorrowHome;

/* loaded from: classes4.dex */
public final class FilesetUploadErrorResult$Negative implements Parcelable {
    public static final FilesetUploadErrorResult$Negative INSTANCE = new FilesetUploadErrorResult$Negative();
    public static final Parcelable.Creator<FilesetUploadErrorResult$Negative> CREATOR = new BorrowHome.Creator(8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof FilesetUploadErrorResult$Negative);
    }

    public final int hashCode() {
        return 628227945;
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
