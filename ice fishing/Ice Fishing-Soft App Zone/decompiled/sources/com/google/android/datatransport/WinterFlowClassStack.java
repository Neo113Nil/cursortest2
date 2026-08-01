package com.google.android.datatransport;

import android.view.WindowInsets;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class WinterFlowClassStack extends WinterFlowInheritanceBatch {
    public WinterFlowVariableDataSource WinterFlowVariableBandwidth;

    public WinterFlowClassStack(WinterFlowWebsocketInterface winterFlowWebsocketInterface, WinterFlowClassStack winterFlowClassStack) {
        super(winterFlowWebsocketInterface, winterFlowClassStack);
        this.WinterFlowVariableBandwidth = null;
        this.WinterFlowVariableBandwidth = winterFlowClassStack.WinterFlowVariableBandwidth;
    }

    @Override // com.google.android.datatransport.WinterFlowWidgetEntity
    public void WinterFlowBackendCacheManager(WinterFlowVariableDataSource winterFlowVariableDataSource) {
        this.WinterFlowVariableBandwidth = winterFlowVariableDataSource;
    }

    @Override // com.google.android.datatransport.WinterFlowWidgetEntity
    public WinterFlowWebsocketInterface WinterFlowCacheManagerAgent() {
        return WinterFlowWebsocketInterface.WinterFlowCacheManagerAgent(this.WinterFlowCacheManagerAgent.consumeSystemWindowInsets(), null);
    }

    @Override // com.google.android.datatransport.WinterFlowWidgetEntity
    public WinterFlowWebsocketInterface WinterFlowHookDataSource() {
        return WinterFlowWebsocketInterface.WinterFlowCacheManagerAgent(this.WinterFlowCacheManagerAgent.consumeStableInsets(), null);
    }

    @Override // com.google.android.datatransport.WinterFlowWidgetEntity
    public final WinterFlowVariableDataSource WinterFlowServerProtocol() {
        WinterFlowVariableDataSource winterFlowVariableDataSource = this.WinterFlowVariableBandwidth;
        if (winterFlowVariableDataSource != null) {
            return winterFlowVariableDataSource;
        }
        WindowInsets windowInsets = this.WinterFlowCacheManagerAgent;
        WinterFlowVariableDataSource WinterFlowHookDataSource = WinterFlowVariableDataSource.WinterFlowHookDataSource(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        this.WinterFlowVariableBandwidth = WinterFlowHookDataSource;
        return WinterFlowHookDataSource;
    }

    @Override // com.google.android.datatransport.WinterFlowWidgetEntity
    public boolean WinterFlowVariableBandwidth() {
        return this.WinterFlowCacheManagerAgent.isConsumed();
    }

    public WinterFlowClassStack(WinterFlowWebsocketInterface winterFlowWebsocketInterface, WindowInsets windowInsets) {
        super(winterFlowWebsocketInterface, windowInsets);
        this.WinterFlowVariableBandwidth = null;
    }
}
