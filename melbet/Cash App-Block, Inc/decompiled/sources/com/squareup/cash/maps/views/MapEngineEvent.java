package com.squareup.cash.maps.views;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.maps.viewmodels.MapBoundary;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public interface MapEngineEvent {

    public final class ClusterClicked implements MapEngineEvent {
        public final ArrayList items;
        public final double lat;
        public final double lng;
        public final float targetZoom;

        public ClusterClicked(double d, double d2, ArrayList arrayList, float f) {
            this.lat = d;
            this.lng = d2;
            this.items = arrayList;
            this.targetZoom = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClusterClicked)) {
                return false;
            }
            ClusterClicked clusterClicked = (ClusterClicked) obj;
            return Double.compare(this.lat, clusterClicked.lat) == 0 && Double.compare(this.lng, clusterClicked.lng) == 0 && this.items.equals(clusterClicked.items) && Float.compare(this.targetZoom, clusterClicked.targetZoom) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.targetZoom) + CameraState$Type$EnumUnboxingLocalUtility.m(this.items, Fragment$5$$ExternalSyntheticOutline0.m(this.lng, Double.hashCode(this.lat) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("ClusterClicked(lat=", ", lng=", this.lat);
            m.append(this.lng);
            m.append(", items=");
            m.append(this.items);
            m.append(", targetZoom=");
            m.append(this.targetZoom);
            m.append(")");
            return m.toString();
        }
    }

    public final class MapClicked implements MapEngineEvent {
        public static final MapClicked INSTANCE = new MapClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MapClicked);
        }

        public final int hashCode() {
            return -1105982344;
        }

        public final String toString() {
            return "MapClicked";
        }
    }

    public final class MarkerClicked implements MapEngineEvent {
        public final String token;

        public MarkerClicked(String str) {
            this.token = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MarkerClicked) && this.token.equals(((MarkerClicked) obj).token);
        }

        public final int hashCode() {
            return this.token.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MarkerClicked(token=", this.token, ")");
        }
    }

    public final class MaxZoomClusterClicked implements MapEngineEvent {
        public final ArrayList items;

        public MaxZoomClusterClicked(ArrayList arrayList) {
            this.items = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MaxZoomClusterClicked) && this.items.equals(((MaxZoomClusterClicked) obj).items);
        }

        public final int hashCode() {
            return this.items.hashCode();
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("MaxZoomClusterClicked(items=", ")", this.items);
        }
    }

    public final class MovementFinished implements MapEngineEvent {
        public final MapBoundary boundary;
        public final boolean isUserGesture;
        public final double lat;
        public final double lng;
        public final float zoom;
        public final double zoomRadiusInMeters;

        public MovementFinished(double d, double d2, float f, double d3, MapBoundary mapBoundary, boolean z) {
            this.lat = d;
            this.lng = d2;
            this.zoom = f;
            this.zoomRadiusInMeters = d3;
            this.boundary = mapBoundary;
            this.isUserGesture = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MovementFinished)) {
                return false;
            }
            MovementFinished movementFinished = (MovementFinished) obj;
            return Double.compare(this.lat, movementFinished.lat) == 0 && Double.compare(this.lng, movementFinished.lng) == 0 && Float.compare(this.zoom, movementFinished.zoom) == 0 && Double.compare(this.zoomRadiusInMeters, movementFinished.zoomRadiusInMeters) == 0 && this.boundary.equals(movementFinished.boundary) && this.isUserGesture == movementFinished.isUserGesture;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isUserGesture) + ((this.boundary.hashCode() + Fragment$5$$ExternalSyntheticOutline0.m(this.zoomRadiusInMeters, CameraState$Type$EnumUnboxingLocalUtility.m(this.zoom, Fragment$5$$ExternalSyntheticOutline0.m(this.lng, Double.hashCode(this.lat) * 31, 31), 31), 31)) * 31);
        }

        public final String toString() {
            StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("MovementFinished(lat=", ", lng=", this.lat);
            m.append(this.lng);
            m.append(", zoom=");
            m.append(this.zoom);
            m.append(", zoomRadiusInMeters=");
            m.append(this.zoomRadiusInMeters);
            m.append(", boundary=");
            m.append(this.boundary);
            m.append(", isUserGesture=");
            m.append(this.isUserGesture);
            m.append(")");
            return m.toString();
        }
    }
}
