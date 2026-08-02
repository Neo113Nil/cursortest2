package com.google.maps.android.collections;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.stats.zza;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* loaded from: classes4.dex */
public final class MarkerManager implements GoogleMap.OnInfoWindowClickListener, GoogleMap.OnMarkerClickListener, GoogleMap.OnMarkerDragListener, GoogleMap.InfoWindowAdapter, GoogleMap.OnInfoWindowLongClickListener {
    public final HashMap mAllObjects;
    public final GoogleMap mMap;

    public final class Collection {
        public GoogleMap.OnInfoWindowClickListener mInfoWindowClickListener;
        public GoogleMap.OnInfoWindowLongClickListener mInfoWindowLongClickListener;
        public GoogleMap.OnMarkerClickListener mMarkerClickListener;
        public final LinkedHashSet mObjects = new LinkedHashSet();
        public final /* synthetic */ MarkerManager this$0$1;

        public Collection() {
            this.this$0$1 = MarkerManager.this;
        }

        public final void clear() {
            LinkedHashSet linkedHashSet = this.mObjects;
            for (Object obj : linkedHashSet) {
                ((Marker) obj).remove();
                this.this$0$1.mAllObjects.remove(obj);
            }
            linkedHashSet.clear();
        }
    }

    public MarkerManager(GoogleMap googleMap) {
        new HashMap();
        this.mAllObjects = new HashMap();
        this.mMap = googleMap;
        new Handler(Looper.getMainLooper()).post(new zza(this, 14));
    }

    @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
    public final View getInfoContents(Marker marker) {
        return null;
    }

    @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
    public final View getInfoWindow(Marker marker) {
        return null;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
    public final void onInfoWindowClick(Marker marker) {
        GoogleMap.OnInfoWindowClickListener onInfoWindowClickListener;
        Collection collection = (Collection) this.mAllObjects.get(marker);
        if (collection == null || (onInfoWindowClickListener = collection.mInfoWindowClickListener) == null) {
            return;
        }
        onInfoWindowClickListener.onInfoWindowClick(marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener
    public final void onInfoWindowLongClick(Marker marker) {
        GoogleMap.OnInfoWindowLongClickListener onInfoWindowLongClickListener;
        Collection collection = (Collection) this.mAllObjects.get(marker);
        if (collection == null || (onInfoWindowLongClickListener = collection.mInfoWindowLongClickListener) == null) {
            return;
        }
        onInfoWindowLongClickListener.onInfoWindowLongClick(marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
    public final boolean onMarkerClick(Marker marker) {
        GoogleMap.OnMarkerClickListener onMarkerClickListener;
        Collection collection = (Collection) this.mAllObjects.get(marker);
        if (collection == null || (onMarkerClickListener = collection.mMarkerClickListener) == null) {
            return false;
        }
        return onMarkerClickListener.onMarkerClick(marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
    public final void onMarkerDrag(Marker marker) {
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
    public final void onMarkerDragEnd(Marker marker) {
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
    public final void onMarkerDragStart(Marker marker) {
    }

    public final void remove(Object obj) {
        Collection collection = (Collection) this.mAllObjects.get(obj);
        if (collection != null) {
            MarkerManager markerManager = collection.this$0$1;
            if (collection.mObjects.remove(obj)) {
                markerManager.mAllObjects.remove(obj);
                ((Marker) obj).remove();
            }
        }
    }
}
