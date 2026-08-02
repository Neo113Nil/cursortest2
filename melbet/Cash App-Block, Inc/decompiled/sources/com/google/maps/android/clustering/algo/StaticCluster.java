package com.google.maps.android.clustering.algo;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.Cluster;
import java.util.Collection;
import java.util.LinkedHashSet;

/* loaded from: classes4.dex */
public final class StaticCluster implements Cluster {
    public final LatLng mCenter;
    public final LinkedHashSet mItems = new LinkedHashSet();

    public StaticCluster(LatLng latLng) {
        this.mCenter = latLng;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof StaticCluster)) {
            return false;
        }
        StaticCluster staticCluster = (StaticCluster) obj;
        return staticCluster.mCenter.equals(this.mCenter) && staticCluster.mItems.equals(this.mItems);
    }

    @Override // com.google.maps.android.clustering.Cluster
    public final Collection getItems() {
        return this.mItems;
    }

    @Override // com.google.maps.android.clustering.Cluster
    public final LatLng getPosition() {
        return this.mCenter;
    }

    @Override // com.google.maps.android.clustering.Cluster
    public final int getSize() {
        return this.mItems.size();
    }

    public final int hashCode() {
        return this.mItems.hashCode() + this.mCenter.hashCode();
    }

    public final String toString() {
        return "StaticCluster{mCenter=" + this.mCenter + ", mItems.size=" + this.mItems.size() + '}';
    }
}
