package com.squareup.cash.family.requestsponsorship.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.fileupload.api.UriString;

/* loaded from: classes6.dex */
public final class ContactPermissionResult$Positive implements Parcelable {
    public static final ContactPermissionResult$Positive INSTANCE = new ContactPermissionResult$Positive();
    public static final Parcelable.Creator<ContactPermissionResult$Positive> CREATOR = new UriString.Creator(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ContactPermissionResult$Positive);
    }

    public final int hashCode() {
        return -1925727445;
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
