package com.squareup.cash.bitcoin.views.map;

import com.squareup.cash.bitcoin.viewmodels.map.BitcoinSellerMarkerLocation;
import com.squareup.cash.maps.views.CashClusterItem;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BitcoinClusterItem extends CashClusterItem {
    public final BitcoinSellerMarkerLocation location;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitcoinClusterItem(BitcoinSellerMarkerLocation bitcoinSellerMarkerLocation) {
        super(bitcoinSellerMarkerLocation);
        bitcoinSellerMarkerLocation.getClass();
        this.location = bitcoinSellerMarkerLocation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BitcoinClusterItem) && Intrinsics.areEqual(this.location, ((BitcoinClusterItem) obj).location);
    }

    @Override // com.squareup.cash.maps.views.CashClusterItem
    public final double getLatitude() {
        return this.location.latitude;
    }

    @Override // com.squareup.cash.maps.views.CashClusterItem
    public final double getLongitude() {
        return this.location.longitude;
    }

    public final int hashCode() {
        return this.location.bitcoinSellerLocation.hashCode();
    }

    public final String toString() {
        return "BitcoinClusterItem(location=" + this.location + ")";
    }
}
