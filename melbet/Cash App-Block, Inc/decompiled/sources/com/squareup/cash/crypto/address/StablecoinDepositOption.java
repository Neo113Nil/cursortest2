package com.squareup.cash.crypto.address;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.composable.adapter.ViewStateId;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class StablecoinDepositOption implements Parcelable {
    public static final Parcelable.Creator<StablecoinDepositOption> CREATOR = new ViewStateId.Creator(12);
    public final StablecoinNetwork network;
    public final String qrCodeUrl;

    public StablecoinDepositOption(StablecoinNetwork stablecoinNetwork, String str) {
        stablecoinNetwork.getClass();
        str.getClass();
        this.network = stablecoinNetwork;
        this.qrCodeUrl = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StablecoinDepositOption)) {
            return false;
        }
        StablecoinDepositOption stablecoinDepositOption = (StablecoinDepositOption) obj;
        return Intrinsics.areEqual(this.network, stablecoinDepositOption.network) && Intrinsics.areEqual(this.qrCodeUrl, stablecoinDepositOption.qrCodeUrl);
    }

    public final int hashCode() {
        return this.qrCodeUrl.hashCode() + (this.network.hashCode() * 31);
    }

    public final String toString() {
        return "StablecoinDepositOption(network=" + this.network + ", qrCodeUrl=" + this.qrCodeUrl + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.network.writeToParcel(parcel, i);
        parcel.writeString(this.qrCodeUrl);
    }
}
