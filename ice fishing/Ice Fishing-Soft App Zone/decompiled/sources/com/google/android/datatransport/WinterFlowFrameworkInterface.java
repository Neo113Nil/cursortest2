package com.google.android.datatransport;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowFrameworkInterface extends WinterFlowControllerResolver {
    public WinterFlowFrameworkInterface(WinterFlowWebsocketInterface winterFlowWebsocketInterface, WindowInsets windowInsets) {
        super(winterFlowWebsocketInterface, windowInsets);
    }

    @Override // com.google.android.datatransport.WinterFlowInheritanceBatch, com.google.android.datatransport.WinterFlowWidgetEntity
    public List<Rect> WinterFlowTransactionManagerStrategy(int i) {
        List<Rect> boundingRects;
        boundingRects = this.WinterFlowCacheManagerAgent.getBoundingRects(WinterFlowEventEmitterCloud.WinterFlowRouterStructure(i));
        return boundingRects;
    }

    @Override // com.google.android.datatransport.WinterFlowInheritanceBatch, com.google.android.datatransport.WinterFlowWidgetEntity
    public List<Rect> WinterFlowUnitTestResponse(int i) {
        List<Rect> boundingRectsIgnoringVisibility;
        boundingRectsIgnoringVisibility = this.WinterFlowCacheManagerAgent.getBoundingRectsIgnoringVisibility(WinterFlowEventEmitterCloud.WinterFlowRouterStructure(i));
        return boundingRectsIgnoringVisibility;
    }

    public WinterFlowFrameworkInterface(WinterFlowWebsocketInterface winterFlowWebsocketInterface, WinterFlowFrameworkInterface winterFlowFrameworkInterface) {
        super(winterFlowWebsocketInterface, winterFlowFrameworkInterface);
    }

    @Override // com.google.android.datatransport.WinterFlowInheritanceBatch, com.google.android.datatransport.WinterFlowWidgetEntity
    public void WinterFlowConcurrencyThread() {
    }
}
