package com.google.maps.android.compose;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class MapUpdaterKt$MapUpdater$1$2$1 implements Function2 {
    public static final MapUpdaterKt$MapUpdater$1$2$1 INSTANCE = new MapUpdaterKt$MapUpdater$1$2$1(0);
    public static final MapUpdaterKt$MapUpdater$1$2$1 INSTANCE$1 = new MapUpdaterKt$MapUpdater$1$2$1(1);
    public static final MapUpdaterKt$MapUpdater$1$2$1 INSTANCE$2 = new MapUpdaterKt$MapUpdater$1$2$1(2);
    public static final MapUpdaterKt$MapUpdater$1$2$1 INSTANCE$3 = new MapUpdaterKt$MapUpdater$1$2$1(3);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ MapUpdaterKt$MapUpdater$1$2$1(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                MapPropertiesNode mapPropertiesNode = (MapPropertiesNode) obj;
                Density density = (Density) obj2;
                mapPropertiesNode.getClass();
                density.getClass();
                mapPropertiesNode.density = density;
                break;
            case 1:
                MapPropertiesNode mapPropertiesNode2 = (MapPropertiesNode) obj;
                CameraPositionState cameraPositionState = (CameraPositionState) obj2;
                mapPropertiesNode2.getClass();
                cameraPositionState.getClass();
                if (!Intrinsics.areEqual(cameraPositionState, mapPropertiesNode2.cameraPositionState)) {
                    mapPropertiesNode2.cameraPositionState.setMap$maps_compose_release(null);
                    mapPropertiesNode2.cameraPositionState = cameraPositionState;
                    cameraPositionState.setMap$maps_compose_release(mapPropertiesNode2.map);
                }
                break;
            case 2:
                MapPropertiesNode mapPropertiesNode3 = (MapPropertiesNode) obj;
                LayoutDirection layoutDirection = (LayoutDirection) obj2;
                mapPropertiesNode3.getClass();
                layoutDirection.getClass();
                mapPropertiesNode3.layoutDirection = layoutDirection;
                break;
            default:
                MapPropertiesNode mapPropertiesNode4 = (MapPropertiesNode) obj;
                mapPropertiesNode4.getClass();
                mapPropertiesNode4.map.setContentDescription((String) obj2);
                break;
        }
        return Unit.INSTANCE;
    }
}
