package com.squareup.cash.bitcoin.viewmodels.map;

import com.squareup.cash.maps.viewmodels.MarkerLocation;
import com.squareup.protos.cash.btcnetwork.external.BitcoinSellerLocation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BitcoinSellerMarkerLocation extends MarkerLocation {
    public final BitcoinSellerLocation bitcoinSellerLocation;
    public final double latitude;
    public final double longitude;
    public final BitcoinLocationViewModel viewModel;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BitcoinSellerMarkerLocation(BitcoinSellerLocation bitcoinSellerLocation) {
        super(null, null, r0, r1);
        bitcoinSellerLocation.getClass();
        String str = bitcoinSellerLocation.id;
        String str2 = bitcoinSellerLocation.name;
        str2.getClass();
        this.bitcoinSellerLocation = bitcoinSellerLocation;
        BitcoinLocationViewModel viewModel = BitcoinMapViewModelKt.toViewModel(bitcoinSellerLocation, false);
        this.viewModel = viewModel;
        this.latitude = viewModel.latitude;
        this.longitude = viewModel.longitude;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BitcoinSellerMarkerLocation) && Intrinsics.areEqual(this.bitcoinSellerLocation, ((BitcoinSellerMarkerLocation) obj).bitcoinSellerLocation);
    }

    public final int hashCode() {
        return this.bitcoinSellerLocation.hashCode();
    }

    public final String toString() {
        return "BitcoinSellerMarkerLocation(bitcoinSellerLocation=" + this.bitcoinSellerLocation + ")";
    }
}
