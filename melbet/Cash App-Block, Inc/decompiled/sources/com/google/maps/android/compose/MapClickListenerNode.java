package com.google.maps.android.compose;

import com.google.android.gms.maps.GoogleMap;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class MapClickListenerNode implements MapNode {
    public final Object listener;
    public final GoogleMap map;
    public final Function2 setter;

    public MapClickListenerNode(GoogleMap googleMap, Function2 function2, Object obj) {
        googleMap.getClass();
        function2.getClass();
        obj.getClass();
        this.map = googleMap;
        this.setter = function2;
        this.listener = obj;
    }

    @Override // com.google.maps.android.compose.MapNode
    public final void onAttached() {
        this.setter.invoke(this.map, this.listener);
    }

    @Override // com.google.maps.android.compose.MapNode
    public final void onCleared() {
        this.setter.invoke(this.map, null);
    }

    @Override // com.google.maps.android.compose.MapNode
    public final void onRemoved() {
        this.setter.invoke(this.map, null);
    }
}
