package com.squareup.cash.deposits.physical.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.db.contacts.Recipient;

/* loaded from: classes6.dex */
public final class NoAddressResult implements AddressResult {
    public static final NoAddressResult INSTANCE = new NoAddressResult();
    public static final Parcelable.Creator<NoAddressResult> CREATOR = new Recipient.Creator(17);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof NoAddressResult);
    }

    public final int hashCode() {
        return 153271641;
    }

    public final String toString() {
        return "NoAddressResult";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
