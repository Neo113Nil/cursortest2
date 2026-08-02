package com.squareup.cash.bitcoin.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.protos.cash.btcnetwork.external.BitcoinSellerLocation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class BitcoinLocationScreen extends BitcoinOverlay {
    public static final Parcelable.Creator<BitcoinLocationScreen> CREATOR = new BitcoinHome.Creator(16);
    public final BitcoinSellerLocation location;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitcoinLocationScreen(BitcoinSellerLocation bitcoinSellerLocation) {
        super(1);
        bitcoinSellerLocation.getClass();
        this.location = bitcoinSellerLocation;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BitcoinLocationScreen) && Intrinsics.areEqual(this.location, ((BitcoinLocationScreen) obj).location);
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        return this.location.hashCode();
    }

    public final String toString() {
        return "BitcoinLocationScreen(location=" + this.location + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.location, i);
    }
}
