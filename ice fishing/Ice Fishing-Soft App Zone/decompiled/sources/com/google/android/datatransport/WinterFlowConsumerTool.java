package com.google.android.datatransport;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowConsumerTool implements GestureDetector.OnGestureListener {
    public final /* synthetic */ WinterFlowStrategyVersionControl WinterFlowRouterStructure;

    public WinterFlowConsumerTool(WinterFlowStrategyVersionControl winterFlowStrategyVersionControl) {
        this.WinterFlowRouterStructure = winterFlowStrategyVersionControl;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        WinterFlowStrategyVersionControl winterFlowStrategyVersionControl = this.WinterFlowRouterStructure;
        WinterFlowCacheManagerDatabase winterFlowCacheManagerDatabase = (WinterFlowCacheManagerDatabase) winterFlowStrategyVersionControl.WinterFlowCacheManagerAgent;
        if (!winterFlowStrategyVersionControl.WinterFlowRouterStructure) {
            int i = winterFlowStrategyVersionControl.WinterFlowHookDataSource;
            if (i == 1) {
                if (Math.abs(f) > Math.abs(f2)) {
                    winterFlowCacheManagerDatabase.WinterFlowUnitTestResponse(new WinterFlowDeserializationEventEmitter(f > 0.0f ? 1 : 2));
                    return true;
                }
            } else if (i == 2 && Math.abs(f2) > Math.abs(f)) {
                winterFlowCacheManagerDatabase.WinterFlowUnitTestResponse(new WinterFlowDeserializationEventEmitter(f2 > 0.0f ? 1 : 2));
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
