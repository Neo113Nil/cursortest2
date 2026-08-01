package com.google.android.datatransport;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class WinterFlowBatchSystem extends WinterFlowAlgorithmMapper {
    public static final WinterFlowWebsocketInterface WinterFlowMapperProtocol;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        WinterFlowMapperProtocol = WinterFlowWebsocketInterface.WinterFlowCacheManagerAgent(windowInsets, null);
    }

    public WinterFlowBatchSystem(WinterFlowWebsocketInterface winterFlowWebsocketInterface, WindowInsets windowInsets) {
        super(winterFlowWebsocketInterface, windowInsets);
    }

    @Override // com.google.android.datatransport.WinterFlowInheritanceBatch, com.google.android.datatransport.WinterFlowWidgetEntity
    public WinterFlowVariableDataSource WinterFlowResponseEngine(int i) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.WinterFlowCacheManagerAgent.getInsetsIgnoringVisibility(WinterFlowSoftwareLoader.WinterFlowRouterStructure(i));
        return WinterFlowVariableDataSource.WinterFlowCacheManagerAgent(insetsIgnoringVisibility);
    }

    @Override // com.google.android.datatransport.WinterFlowInheritanceBatch, com.google.android.datatransport.WinterFlowWidgetEntity
    public boolean WinterFlowRouterAdapter(int i) {
        boolean isVisible;
        isVisible = this.WinterFlowCacheManagerAgent.isVisible(WinterFlowSoftwareLoader.WinterFlowRouterStructure(i));
        return isVisible;
    }

    @Override // com.google.android.datatransport.WinterFlowInheritanceBatch, com.google.android.datatransport.WinterFlowWidgetEntity
    public WinterFlowVariableDataSource WinterFlowSyntax(int i) {
        Insets insets;
        insets = this.WinterFlowCacheManagerAgent.getInsets(WinterFlowSoftwareLoader.WinterFlowRouterStructure(i));
        return WinterFlowVariableDataSource.WinterFlowCacheManagerAgent(insets);
    }

    public WinterFlowBatchSystem(WinterFlowWebsocketInterface winterFlowWebsocketInterface, WinterFlowBatchSystem winterFlowBatchSystem) {
        super(winterFlowWebsocketInterface, winterFlowBatchSystem);
    }

    @Override // com.google.android.datatransport.WinterFlowInheritanceBatch, com.google.android.datatransport.WinterFlowWidgetEntity
    public final void WinterFlowArrayNetwork(View view) {
    }
}
