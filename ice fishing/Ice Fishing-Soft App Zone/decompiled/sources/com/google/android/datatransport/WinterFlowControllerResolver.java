package com.google.android.datatransport;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class WinterFlowControllerResolver extends WinterFlowListenerStrategy {
    public static final WinterFlowWebsocketInterface WinterFlowResolverController;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        WinterFlowResolverController = WinterFlowWebsocketInterface.WinterFlowCacheManagerAgent(windowInsets, null);
    }

    public WinterFlowControllerResolver(WinterFlowWebsocketInterface winterFlowWebsocketInterface, WindowInsets windowInsets) {
        super(winterFlowWebsocketInterface, windowInsets);
    }

    @Override // com.google.android.datatransport.WinterFlowBatchSystem, com.google.android.datatransport.WinterFlowInheritanceBatch, com.google.android.datatransport.WinterFlowWidgetEntity
    public WinterFlowVariableDataSource WinterFlowResponseEngine(int i) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.WinterFlowCacheManagerAgent.getInsetsIgnoringVisibility(WinterFlowEventEmitterCloud.WinterFlowRouterStructure(i));
        return WinterFlowVariableDataSource.WinterFlowCacheManagerAgent(insetsIgnoringVisibility);
    }

    @Override // com.google.android.datatransport.WinterFlowBatchSystem, com.google.android.datatransport.WinterFlowInheritanceBatch, com.google.android.datatransport.WinterFlowWidgetEntity
    public boolean WinterFlowRouterAdapter(int i) {
        boolean isVisible;
        isVisible = this.WinterFlowCacheManagerAgent.isVisible(WinterFlowEventEmitterCloud.WinterFlowRouterStructure(i));
        return isVisible;
    }

    @Override // com.google.android.datatransport.WinterFlowBatchSystem, com.google.android.datatransport.WinterFlowInheritanceBatch, com.google.android.datatransport.WinterFlowWidgetEntity
    public WinterFlowVariableDataSource WinterFlowSyntax(int i) {
        Insets insets;
        insets = this.WinterFlowCacheManagerAgent.getInsets(WinterFlowEventEmitterCloud.WinterFlowRouterStructure(i));
        return WinterFlowVariableDataSource.WinterFlowCacheManagerAgent(insets);
    }

    public WinterFlowControllerResolver(WinterFlowWebsocketInterface winterFlowWebsocketInterface, WinterFlowControllerResolver winterFlowControllerResolver) {
        super(winterFlowWebsocketInterface, winterFlowControllerResolver);
    }

    @Override // com.google.android.datatransport.WinterFlowInheritanceBatch, com.google.android.datatransport.WinterFlowWidgetEntity
    public void WinterFlowOrchestrationSubsystem(View view) {
    }
}
