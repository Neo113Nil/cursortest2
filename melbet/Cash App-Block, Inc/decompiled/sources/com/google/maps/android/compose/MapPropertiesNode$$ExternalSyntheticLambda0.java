package com.google.maps.android.compose;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.CameraPosition;

/* loaded from: classes4.dex */
public final /* synthetic */ class MapPropertiesNode$$ExternalSyntheticLambda0 implements GoogleMap.OnCameraIdleListener {
    public final /* synthetic */ MapPropertiesNode f$0;

    @Override // com.google.android.gms.maps.GoogleMap.OnCameraIdleListener
    public final void onCameraIdle() {
        MapPropertiesNode mapPropertiesNode = this.f$0;
        mapPropertiesNode.cameraPositionState.isMoving$delegate.setValue(Boolean.FALSE);
        CameraPositionState cameraPositionState = mapPropertiesNode.cameraPositionState;
        CameraPosition cameraPosition = mapPropertiesNode.map.getCameraPosition();
        cameraPosition.getClass();
        cameraPositionState.getClass();
        cameraPositionState.rawPosition$delegate.setValue(cameraPosition);
    }
}
