package com.squareup.cash.bitcoin.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.bitcoin.screens.MoveBitcoinScreen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class StablecoinDepositCopyScreen extends BitcoinOverlay {
    public static final Parcelable.Creator<StablecoinDepositCopyScreen> CREATOR = new MoveBitcoinScreen.Creator(11);
    public final String address;
    public final String truncatedAddress;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StablecoinDepositCopyScreen(String str, String str2) {
        super(1);
        str.getClass();
        str2.getClass();
        this.address = str;
        this.truncatedAddress = str2;
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
        if (!(obj instanceof StablecoinDepositCopyScreen)) {
            return false;
        }
        StablecoinDepositCopyScreen stablecoinDepositCopyScreen = (StablecoinDepositCopyScreen) obj;
        return Intrinsics.areEqual(this.address, stablecoinDepositCopyScreen.address) && Intrinsics.areEqual(this.truncatedAddress, stablecoinDepositCopyScreen.truncatedAddress);
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        return this.truncatedAddress.hashCode() + (this.address.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("StablecoinDepositCopyScreen(address=", this.address, ", truncatedAddress=", this.truncatedAddress, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.address);
        parcel.writeString(this.truncatedAddress);
    }
}
