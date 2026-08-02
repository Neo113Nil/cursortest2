package com.squareup.cash.multiplatform.bitcoin.parsers.ethereum;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.music.screens.MusicScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class EthereumAddress implements Parcelable {
    public static final Parcelable.Creator<EthereumAddress> CREATOR = new MusicScreen.Creator(26);
    public final String address;
    public final String data;
    public final boolean isUri;
    public final String value;

    public EthereumAddress(String str, String str2, String str3, boolean z) {
        str.getClass();
        str2.getClass();
        this.address = str;
        this.data = str2;
        this.value = str3;
        this.isUri = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EthereumAddress)) {
            return false;
        }
        EthereumAddress ethereumAddress = (EthereumAddress) obj;
        return Intrinsics.areEqual(this.address, ethereumAddress.address) && Intrinsics.areEqual(this.data, ethereumAddress.data) && Intrinsics.areEqual(this.value, ethereumAddress.value) && this.isUri == ethereumAddress.isUri;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.address.hashCode() * 31, 31, this.data);
        String str = this.value;
        return Boolean.hashCode(this.isUri) + ((m + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return re$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("EthereumAddress(address=", this.address, ", data=", this.data, ", value="), this.value, ", isUri=", this.isUri, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.address);
        parcel.writeString(this.data);
        parcel.writeString(this.value);
        parcel.writeInt(this.isUri ? 1 : 0);
    }
}
