package com.squareup.cash.crypto.address;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.composable.adapter.ViewStateId;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CryptoAddress$BitcoinAddress implements Parcelable {
    public static final Parcelable.Creator<CryptoAddress$BitcoinAddress> CREATOR = new ViewStateId.Creator(11);
    public final String address;

    public CryptoAddress$BitcoinAddress(String str) {
        str.getClass();
        this.address = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CryptoAddress$BitcoinAddress) && Intrinsics.areEqual(this.address, ((CryptoAddress$BitcoinAddress) obj).address);
    }

    public final int hashCode() {
        return this.address.hashCode();
    }

    public final String toString() {
        return "BitcoinAddress(address=██)";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.address);
    }
}
