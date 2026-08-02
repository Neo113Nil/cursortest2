package com.google.maps.android.compose;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class MapApplier$$ExternalSyntheticLambda0 implements GoogleMap.OnMarkerClickListener, GoogleMap.OnInfoWindowClickListener, GoogleMap.OnInfoWindowLongClickListener {
    public final /* synthetic */ MapApplier f$0;

    public /* synthetic */ MapApplier$$ExternalSyntheticLambda0(MapApplier mapApplier) {
        this.f$0 = mapApplier;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
    public void onInfoWindowClick(Marker marker) {
        marker.getClass();
        Iterator it = this.f$0.decorations.iterator();
        while (it.hasNext()) {
            MapNode mapNode = (MapNode) it.next();
            if (mapNode instanceof MarkerNode) {
                MarkerNode markerNode = (MarkerNode) mapNode;
                if (markerNode.marker.equals(marker)) {
                    Function1 function1 = markerNode.onInfoWindowClick;
                    if (function1 != null ? Intrinsics.areEqual(function1.invoke(marker), Boolean.TRUE) : false) {
                        return;
                    }
                }
            }
            if (mapNode instanceof InputHandlerNode) {
                Function1 function12 = (Function1) ((InputHandlerNode) mapNode).onInfoWindowClick$delegate.getValue();
                if (function12 != null ? Intrinsics.areEqual(function12.invoke(marker), Boolean.TRUE) : false) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener
    public void onInfoWindowLongClick(Marker marker) {
        marker.getClass();
        Iterator it = this.f$0.decorations.iterator();
        while (it.hasNext()) {
            MapNode mapNode = (MapNode) it.next();
            if (mapNode instanceof MarkerNode) {
                MarkerNode markerNode = (MarkerNode) mapNode;
                if (markerNode.marker.equals(marker)) {
                    Function1 function1 = markerNode.onInfoWindowLongClick;
                    if (function1 != null ? Intrinsics.areEqual(function1.invoke(marker), Boolean.TRUE) : false) {
                        return;
                    }
                }
            }
            if (mapNode instanceof InputHandlerNode) {
                Function1 function12 = (Function1) ((InputHandlerNode) mapNode).onInfoWindowLongClick$delegate.getValue();
                if (function12 != null ? Intrinsics.areEqual(function12.invoke(marker), Boolean.TRUE) : false) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
    public boolean onMarkerClick(Marker marker) {
        marker.getClass();
        Iterator it = this.f$0.decorations.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            MapNode mapNode = (MapNode) it.next();
            if (mapNode instanceof MarkerNode) {
                MarkerNode markerNode = (MarkerNode) mapNode;
                if (markerNode.marker.equals(marker)) {
                    Function1 function1 = markerNode.onMarkerClick;
                    if (function1 != null ? Intrinsics.areEqual(function1.invoke(marker), Boolean.TRUE) : false) {
                        return true;
                    }
                }
            }
            if (mapNode instanceof InputHandlerNode) {
                Function1 function12 = (Function1) ((InputHandlerNode) mapNode).onMarkerClick$delegate.getValue();
                if (function12 != null ? Intrinsics.areEqual(function12.invoke(marker), Boolean.TRUE) : false) {
                    return true;
                }
            } else {
                continue;
            }
        }
    }
}
