package com.squareup.cash.maps.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class CashMapViewEvent {

    public final class CenterOnUserLocationClick extends CashMapViewEvent {
        public static final CenterOnUserLocationClick INSTANCE = new CenterOnUserLocationClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CenterOnUserLocationClick);
        }

        public final int hashCode() {
            return 1038199884;
        }

        public final String toString() {
            return "CenterOnUserLocationClick";
        }
    }

    public final class ClearSelectedLocation extends CashMapViewEvent {
        public static final ClearSelectedLocation INSTANCE = new ClearSelectedLocation();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ClearSelectedLocation);
        }

        public final int hashCode() {
            return 1911044629;
        }

        public final String toString() {
            return "ClearSelectedLocation";
        }
    }

    public final class ClusterClicked extends CashMapViewEvent {
        public final ArrayList items;
        public final double lat;
        public final double lng;
        public final Float targetZoom;

        public ClusterClicked(double d, double d2, ArrayList arrayList, Float f) {
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
            return Double.compare(this.lat, clusterClicked.lat) == 0 && Double.compare(this.lng, clusterClicked.lng) == 0 && this.items.equals(clusterClicked.items) && this.targetZoom.equals(clusterClicked.targetZoom);
        }

        public final int hashCode() {
            return this.targetZoom.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.items, Fragment$5$$ExternalSyntheticOutline0.m(this.lng, Double.hashCode(this.lat) * 31, 31), 31);
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

    public final class MapMovementFinished extends CashMapViewEvent {
        public final MapBoundary boundary;
        public final boolean isUserGesture;
        public final double lat;
        public final double lng;
        public final float zoom;
        public final double zoomRadiusInMeters;

        public MapMovementFinished(double d, double d2, float f, double d3, MapBoundary mapBoundary, boolean z) {
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
            if (!(obj instanceof MapMovementFinished)) {
                return false;
            }
            MapMovementFinished mapMovementFinished = (MapMovementFinished) obj;
            return Double.compare(this.lat, mapMovementFinished.lat) == 0 && Double.compare(this.lng, mapMovementFinished.lng) == 0 && Float.compare(this.zoom, mapMovementFinished.zoom) == 0 && Double.compare(this.zoomRadiusInMeters, mapMovementFinished.zoomRadiusInMeters) == 0 && this.boundary.equals(mapMovementFinished.boundary) && this.isUserGesture == mapMovementFinished.isUserGesture;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isUserGesture) + ((this.boundary.hashCode() + Fragment$5$$ExternalSyntheticOutline0.m(this.zoomRadiusInMeters, CameraState$Type$EnumUnboxingLocalUtility.m(this.zoom, Fragment$5$$ExternalSyntheticOutline0.m(this.lng, Double.hashCode(this.lat) * 31, 31), 31), 31)) * 31);
        }

        public final String toString() {
            StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("MapMovementFinished(lat=", ", lng=", this.lat);
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

    public final class MarkerClicked extends CashMapViewEvent {
        public final String locationToken;

        public MarkerClicked(String str) {
            str.getClass();
            this.locationToken = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MarkerClicked) && Intrinsics.areEqual(this.locationToken, ((MarkerClicked) obj).locationToken);
        }

        public final int hashCode() {
            return this.locationToken.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MarkerClicked(locationToken=", this.locationToken, ")");
        }
    }
}
