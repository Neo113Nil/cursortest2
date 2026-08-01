package com.google.android.datatransport;

import android.graphics.Insets;
import android.view.WindowInsets;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class WinterFlowAlgorithmMapper extends WinterFlowDatabase {
    public WinterFlowVariableDataSource WinterFlowBatchUI;
    public WinterFlowVariableDataSource WinterFlowRouterAdapter;
    public WinterFlowVariableDataSource WinterFlowSerializerStructure;

    public WinterFlowAlgorithmMapper(WinterFlowWebsocketInterface winterFlowWebsocketInterface, WindowInsets windowInsets) {
        super(winterFlowWebsocketInterface, windowInsets);
        this.WinterFlowBatchUI = null;
        this.WinterFlowRouterAdapter = null;
        this.WinterFlowSerializerStructure = null;
    }

    @Override // com.google.android.datatransport.WinterFlowWidgetEntity
    public WinterFlowVariableDataSource WinterFlowBandwidthObject() {
        Insets tappableElementInsets;
        WinterFlowVariableDataSource winterFlowVariableDataSource = this.WinterFlowSerializerStructure;
        if (winterFlowVariableDataSource != null) {
            return winterFlowVariableDataSource;
        }
        tappableElementInsets = this.WinterFlowCacheManagerAgent.getTappableElementInsets();
        WinterFlowVariableDataSource WinterFlowCacheManagerAgent = WinterFlowVariableDataSource.WinterFlowCacheManagerAgent(tappableElementInsets);
        this.WinterFlowSerializerStructure = WinterFlowCacheManagerAgent;
        return WinterFlowCacheManagerAgent;
    }

    @Override // com.google.android.datatransport.WinterFlowInheritanceBatch, com.google.android.datatransport.WinterFlowWidgetEntity
    public WinterFlowWebsocketInterface WinterFlowSingletonPlatform(int i, int i2, int i3, int i4) {
        WindowInsets inset;
        inset = this.WinterFlowCacheManagerAgent.inset(i, i2, i3, i4);
        return WinterFlowWebsocketInterface.WinterFlowCacheManagerAgent(inset, null);
    }

    @Override // com.google.android.datatransport.WinterFlowWidgetEntity
    public WinterFlowVariableDataSource WinterFlowThreadListener() {
        Insets systemGestureInsets;
        WinterFlowVariableDataSource winterFlowVariableDataSource = this.WinterFlowBatchUI;
        if (winterFlowVariableDataSource != null) {
            return winterFlowVariableDataSource;
        }
        systemGestureInsets = this.WinterFlowCacheManagerAgent.getSystemGestureInsets();
        WinterFlowVariableDataSource WinterFlowCacheManagerAgent = WinterFlowVariableDataSource.WinterFlowCacheManagerAgent(systemGestureInsets);
        this.WinterFlowBatchUI = WinterFlowCacheManagerAgent;
        return WinterFlowCacheManagerAgent;
    }

    @Override // com.google.android.datatransport.WinterFlowWidgetEntity
    public WinterFlowVariableDataSource WinterFlowTransactionAgent() {
        Insets mandatorySystemGestureInsets;
        WinterFlowVariableDataSource winterFlowVariableDataSource = this.WinterFlowRouterAdapter;
        if (winterFlowVariableDataSource != null) {
            return winterFlowVariableDataSource;
        }
        mandatorySystemGestureInsets = this.WinterFlowCacheManagerAgent.getMandatorySystemGestureInsets();
        WinterFlowVariableDataSource WinterFlowCacheManagerAgent = WinterFlowVariableDataSource.WinterFlowCacheManagerAgent(mandatorySystemGestureInsets);
        this.WinterFlowRouterAdapter = WinterFlowCacheManagerAgent;
        return WinterFlowCacheManagerAgent;
    }

    public WinterFlowAlgorithmMapper(WinterFlowWebsocketInterface winterFlowWebsocketInterface, WinterFlowAlgorithmMapper winterFlowAlgorithmMapper) {
        super(winterFlowWebsocketInterface, winterFlowAlgorithmMapper);
        this.WinterFlowBatchUI = null;
        this.WinterFlowRouterAdapter = null;
        this.WinterFlowSerializerStructure = null;
    }

    @Override // com.google.android.datatransport.WinterFlowClassStack, com.google.android.datatransport.WinterFlowWidgetEntity
    public void WinterFlowBackendCacheManager(WinterFlowVariableDataSource winterFlowVariableDataSource) {
    }
}
