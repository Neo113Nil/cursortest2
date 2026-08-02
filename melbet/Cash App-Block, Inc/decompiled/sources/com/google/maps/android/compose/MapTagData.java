package com.google.maps.android.compose;

/* loaded from: classes4.dex */
public final class MapTagData {
    public final GoogleMapKt$GoogleMap$4$1$1$componentCallbacks$1 componentCallbacks;
    public final MapLifecycleEventObserver lifecycleObserver;

    public MapTagData(GoogleMapKt$GoogleMap$4$1$1$componentCallbacks$1 googleMapKt$GoogleMap$4$1$1$componentCallbacks$1, MapLifecycleEventObserver mapLifecycleEventObserver) {
        this.componentCallbacks = googleMapKt$GoogleMap$4$1$1$componentCallbacks$1;
        this.lifecycleObserver = mapLifecycleEventObserver;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapTagData)) {
            return false;
        }
        MapTagData mapTagData = (MapTagData) obj;
        return this.componentCallbacks == mapTagData.componentCallbacks && this.lifecycleObserver == mapTagData.lifecycleObserver;
    }

    public final int hashCode() {
        return this.lifecycleObserver.hashCode() + (hashCode() * 31);
    }

    public final String toString() {
        return "MapTagData(componentCallbacks=" + this.componentCallbacks + ", lifecycleObserver=" + this.lifecycleObserver + ')';
    }
}
