package com.squareup.cash.bitcoin.presenters.stablecoin;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class LegacyStablecoinDepositPresenter$DepositAddress {
    public final String address;
    public final String truncatedAddress;

    public LegacyStablecoinDepositPresenter$DepositAddress(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.address = str;
        this.truncatedAddress = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyStablecoinDepositPresenter$DepositAddress)) {
            return false;
        }
        LegacyStablecoinDepositPresenter$DepositAddress legacyStablecoinDepositPresenter$DepositAddress = (LegacyStablecoinDepositPresenter$DepositAddress) obj;
        return Intrinsics.areEqual(this.address, legacyStablecoinDepositPresenter$DepositAddress.address) && Intrinsics.areEqual(this.truncatedAddress, legacyStablecoinDepositPresenter$DepositAddress.truncatedAddress);
    }

    public final int hashCode() {
        return this.truncatedAddress.hashCode() + (this.address.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("DepositAddress(address=", this.address, ", truncatedAddress=", this.truncatedAddress, ")");
    }
}
