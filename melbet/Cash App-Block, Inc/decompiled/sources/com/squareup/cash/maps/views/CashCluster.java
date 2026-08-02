package com.squareup.cash.maps.views;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class CashCluster {
    public final Collection items;
    public final double lat;
    public final double lng;

    public CashCluster(Collection collection, double d, double d2) {
        collection.getClass();
        this.items = collection;
        this.lat = d;
        this.lng = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashCluster)) {
            return false;
        }
        CashCluster cashCluster = (CashCluster) obj;
        return Intrinsics.areEqual(this.items, cashCluster.items) && Double.compare(this.lat, cashCluster.lat) == 0 && Double.compare(this.lng, cashCluster.lng) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.lng) + Fragment$5$$ExternalSyntheticOutline0.m(this.lat, this.items.hashCode() * 31, 31);
    }

    public final String toString() {
        return "CashCluster(items=" + this.items + ", lat=" + this.lat + ", lng=" + this.lng + ")";
    }
}
