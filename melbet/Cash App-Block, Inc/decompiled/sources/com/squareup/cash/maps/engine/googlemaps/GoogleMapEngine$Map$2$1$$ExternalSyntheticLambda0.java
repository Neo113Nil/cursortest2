package com.squareup.cash.maps.engine.googlemaps;

import com.google.maps.android.compose.CameraPositionState;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class GoogleMapEngine$Map$2$1$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CameraPositionState f$0;

    public /* synthetic */ GoogleMapEngine$Map$2$1$$ExternalSyntheticLambda0(CameraPositionState cameraPositionState, int i) {
        this.$r8$classId = i;
        this.f$0 = cameraPositionState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        CameraPositionState cameraPositionState = this.f$0;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) cameraPositionState.isMoving$delegate.getValue();
                bool.booleanValue();
                return bool;
            default:
                Boolean bool2 = (Boolean) cameraPositionState.isMoving$delegate.getValue();
                bool2.booleanValue();
                return bool2;
        }
    }
}
