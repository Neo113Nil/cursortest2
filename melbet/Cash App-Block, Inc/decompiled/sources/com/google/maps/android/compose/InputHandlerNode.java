package com.google.maps.android.compose;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class InputHandlerNode implements MapNode {
    public final ParcelableSnapshotMutableState onInfoWindowClick$delegate;
    public final ParcelableSnapshotMutableState onInfoWindowLongClick$delegate;
    public final ParcelableSnapshotMutableState onMarkerClick$delegate;
    public final ParcelableSnapshotMutableState onMarkerDrag$delegate;
    public final ParcelableSnapshotMutableState onMarkerDragEnd$delegate;
    public final ParcelableSnapshotMutableState onMarkerDragStart$delegate;
    public final ParcelableSnapshotMutableState onCircleClick$delegate = Updater.mutableStateOf$default(null);
    public final ParcelableSnapshotMutableState onGroundOverlayClick$delegate = Updater.mutableStateOf$default(null);
    public final ParcelableSnapshotMutableState onPolygonClick$delegate = Updater.mutableStateOf$default(null);
    public final ParcelableSnapshotMutableState onPolylineClick$delegate = Updater.mutableStateOf$default(null);
    public final ParcelableSnapshotMutableState onInfoWindowClose$delegate = Updater.mutableStateOf$default(null);

    public InputHandlerNode(Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16) {
        this.onMarkerClick$delegate = Updater.mutableStateOf$default(function1);
        this.onInfoWindowClick$delegate = Updater.mutableStateOf$default(function12);
        this.onInfoWindowLongClick$delegate = Updater.mutableStateOf$default(function13);
        this.onMarkerDrag$delegate = Updater.mutableStateOf$default(function14);
        this.onMarkerDragEnd$delegate = Updater.mutableStateOf$default(function15);
        this.onMarkerDragStart$delegate = Updater.mutableStateOf$default(function16);
    }
}
