package com.google.maps.android.compose;

import androidx.compose.runtime.CompositionContext;
import com.google.android.gms.maps.model.Marker;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes4.dex */
public final class MarkerNode implements MapNode {
    public final CompositionContext compositionContext;
    public Function3 infoContent;
    public Function3 infoWindow;
    public final Marker marker;
    public final MarkerState markerState;
    public Function1 onInfoWindowClick;
    public Function1 onInfoWindowClose;
    public Function1 onInfoWindowLongClick;
    public Function1 onMarkerClick;

    public MarkerNode(CompositionContext compositionContext, Marker marker, MarkerState markerState, Function1 function1, Function1 function12, Function1 function13, Function1 function14) {
        compositionContext.getClass();
        function1.getClass();
        function12.getClass();
        function13.getClass();
        function14.getClass();
        this.compositionContext = compositionContext;
        this.marker = marker;
        this.markerState = markerState;
        this.onMarkerClick = function1;
        this.onInfoWindowClick = function12;
        this.onInfoWindowClose = function13;
        this.onInfoWindowLongClick = function14;
        this.infoWindow = null;
        this.infoContent = null;
    }

    @Override // com.google.maps.android.compose.MapNode
    public final void onAttached() {
        this.markerState.setMarker$maps_compose_release(this.marker);
    }

    @Override // com.google.maps.android.compose.MapNode
    public final void onCleared() {
        this.markerState.setMarker$maps_compose_release(null);
        this.marker.remove();
    }

    @Override // com.google.maps.android.compose.MapNode
    public final void onRemoved() {
        this.markerState.setMarker$maps_compose_release(null);
        this.marker.remove();
    }
}
