package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
final class WinterFlowDataSourceView<S> extends WinterFlowDeserializationNetwork {
    public final WinterFlowSessionManagerRequest WinterFlowCacheManagerAgent;
    public final WinterFlowThreadPoolGateway WinterFlowHookDataSource;
    public final WinterFlowListenerSyntax WinterFlowRouterStructure;

    public WinterFlowDataSourceView(WinterFlowListenerSyntax winterFlowListenerSyntax, WinterFlowThreadPoolGateway winterFlowThreadPoolGateway, WinterFlowSessionManagerRequest winterFlowSessionManagerRequest) {
        this.WinterFlowRouterStructure = winterFlowListenerSyntax;
        this.WinterFlowHookDataSource = winterFlowThreadPoolGateway;
        this.WinterFlowCacheManagerAgent = winterFlowSessionManagerRequest;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    public final WinterFlowUserManagerController WinterFlowArrayNetwork() {
        WinterFlowWidgetArray winterFlowWidgetArray = new WinterFlowWidgetArray();
        winterFlowWidgetArray.WinterFlowVariableBandwidth = this.WinterFlowRouterStructure;
        winterFlowWidgetArray.WinterFlowBatchUI = this.WinterFlowHookDataSource;
        winterFlowWidgetArray.WinterFlowRouterAdapter = this.WinterFlowCacheManagerAgent;
        winterFlowWidgetArray.WinterFlowSerializerStructure = -9223372034707292160L;
        return winterFlowWidgetArray;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    public final void WinterFlowVariableVersionControl(WinterFlowUserManagerController winterFlowUserManagerController) {
        WinterFlowWidgetArray winterFlowWidgetArray = (WinterFlowWidgetArray) winterFlowUserManagerController;
        winterFlowWidgetArray.WinterFlowVariableBandwidth = this.WinterFlowRouterStructure;
        winterFlowWidgetArray.WinterFlowBatchUI = this.WinterFlowHookDataSource;
        winterFlowWidgetArray.WinterFlowRouterAdapter = this.WinterFlowCacheManagerAgent;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WinterFlowDataSourceView)) {
            return false;
        }
        WinterFlowDataSourceView winterFlowDataSourceView = (WinterFlowDataSourceView) obj;
        return WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowDataSourceView.WinterFlowRouterStructure, this.WinterFlowRouterStructure) && winterFlowDataSourceView.WinterFlowHookDataSource.equals(this.WinterFlowHookDataSource);
    }

    public final int hashCode() {
        int hashCode = this.WinterFlowCacheManagerAgent.hashCode() * 31;
        WinterFlowListenerSyntax winterFlowListenerSyntax = this.WinterFlowRouterStructure;
        return this.WinterFlowHookDataSource.hashCode() + ((hashCode + (winterFlowListenerSyntax != null ? winterFlowListenerSyntax.hashCode() : 0)) * 31);
    }
}
