package com.squareup.cash.family.requestsponsorship.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.family.familyhub.screens.FamilyHome;

/* loaded from: classes6.dex */
public final class ContactPermissionResult$Negative implements Parcelable {
    public static final ContactPermissionResult$Negative INSTANCE = new ContactPermissionResult$Negative();
    public static final Parcelable.Creator<ContactPermissionResult$Negative> CREATOR = new FamilyHome.Creator(29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ContactPermissionResult$Negative);
    }

    public final int hashCode() {
        return -1752421017;
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
