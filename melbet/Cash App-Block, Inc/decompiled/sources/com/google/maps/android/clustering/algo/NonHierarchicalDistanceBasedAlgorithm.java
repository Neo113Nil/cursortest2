package com.google.maps.android.clustering.algo;

import androidx.credentials.Credential;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.geometry.Bounds;
import com.google.maps.android.projection.Point;
import com.google.maps.android.quadtree.PointQuadTree;
import com.squareup.cash.maps.engine.googlemaps.GoogleMapEngine;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public final class NonHierarchicalDistanceBasedAlgorithm extends Credential {
    public final LinkedHashSet mItems;
    public final int mMaxDistance;
    public final PointQuadTree mQuadTree;

    public final class QuadItem implements Cluster {
        public final GoogleMapEngine.GoogleClusterItemAdapter mClusterItem;
        public final Point mPoint;
        public final LatLng mPosition;
        public final Set singletonSet;

        public QuadItem(GoogleMapEngine.GoogleClusterItemAdapter googleClusterItemAdapter) {
            this.mClusterItem = googleClusterItemAdapter;
            LatLng position = googleClusterItemAdapter.getPosition();
            this.mPosition = position;
            double d = (position.longitude / 360.0d) + 0.5d;
            double sin = Math.sin(Math.toRadians(position.latitude));
            this.mPoint = new Point(d * 1.0d, (((Math.log((sin + 1.0d) / (1.0d - sin)) * 0.5d) / (-6.283185307179586d)) + 0.5d) * 1.0d);
            this.singletonSet = Collections.singleton(googleClusterItemAdapter);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof QuadItem) {
                return ((QuadItem) obj).mClusterItem.equals(this.mClusterItem);
            }
            return false;
        }

        @Override // com.google.maps.android.clustering.Cluster
        public final Collection getItems() {
            return this.singletonSet;
        }

        @Override // com.google.maps.android.clustering.Cluster
        public final LatLng getPosition() {
            return this.mPosition;
        }

        @Override // com.google.maps.android.clustering.Cluster
        public final int getSize() {
            return 1;
        }

        public final int hashCode() {
            return this.mClusterItem.hashCode();
        }
    }

    public NonHierarchicalDistanceBasedAlgorithm() {
        super(8);
        this.mMaxDistance = 100;
        this.mItems = new LinkedHashSet();
        this.mQuadTree = new PointQuadTree(new Bounds(0.0d, 1.0d, 0.0d, 1.0d), 0);
    }
}
