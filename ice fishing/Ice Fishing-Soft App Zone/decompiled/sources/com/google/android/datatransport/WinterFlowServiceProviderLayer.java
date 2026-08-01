package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowServiceProviderLayer implements WinterFlowDatabaseCompiler {
    public final String WinterFlowHookDataSource;
    public final int WinterFlowRouterStructure;
    public final WinterFlowResolverSubsystem WinterFlowCacheManagerAgent = WinterFlowDecoratorUI.WinterFlowSerializerStructure(WinterFlowVariableDataSource.WinterFlowVariableVersionControl);
    public final WinterFlowResolverSubsystem WinterFlowArrayNetwork = WinterFlowDecoratorUI.WinterFlowSerializerStructure(Boolean.TRUE);

    public WinterFlowServiceProviderLayer(String str, int i) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = str;
    }

    @Override // com.google.android.datatransport.WinterFlowDatabaseCompiler
    public final int WinterFlowArrayNetwork(WinterFlowInvokerStructure winterFlowInvokerStructure) {
        return WinterFlowVariableVersionControl().WinterFlowArrayNetwork;
    }

    @Override // com.google.android.datatransport.WinterFlowDatabaseCompiler
    public final int WinterFlowCacheManagerAgent(WinterFlowConcurrencyParser winterFlowConcurrencyParser, WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration) {
        return WinterFlowVariableVersionControl().WinterFlowCacheManagerAgent;
    }

    @Override // com.google.android.datatransport.WinterFlowDatabaseCompiler
    public final int WinterFlowHookDataSource(WinterFlowInvokerStructure winterFlowInvokerStructure) {
        return WinterFlowVariableVersionControl().WinterFlowHookDataSource;
    }

    @Override // com.google.android.datatransport.WinterFlowDatabaseCompiler
    public final int WinterFlowRouterStructure(WinterFlowConcurrencyParser winterFlowConcurrencyParser, WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration) {
        return WinterFlowVariableVersionControl().WinterFlowRouterStructure;
    }

    public final void WinterFlowTransactionManagerStrategy(boolean z) {
        this.WinterFlowArrayNetwork.setValue(Boolean.valueOf(z));
    }

    public final void WinterFlowUnitTestResponse(WinterFlowWebsocketInterface winterFlowWebsocketInterface, int i) {
        int i2 = this.WinterFlowRouterStructure;
        if (i == 0 || (i & i2) != 0) {
            this.WinterFlowCacheManagerAgent.setValue(winterFlowWebsocketInterface.WinterFlowRouterStructure.WinterFlowSyntax(i2));
            WinterFlowTransactionManagerStrategy(winterFlowWebsocketInterface.WinterFlowRouterStructure.WinterFlowRouterAdapter(i2));
        }
    }

    public final WinterFlowVariableDataSource WinterFlowVariableVersionControl() {
        return (WinterFlowVariableDataSource) this.WinterFlowCacheManagerAgent.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WinterFlowServiceProviderLayer) {
            return this.WinterFlowRouterStructure == ((WinterFlowServiceProviderLayer) obj).WinterFlowRouterStructure;
        }
        return false;
    }

    public final int hashCode() {
        return this.WinterFlowRouterStructure;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.WinterFlowHookDataSource);
        sb.append('(');
        sb.append(WinterFlowVariableVersionControl().WinterFlowRouterStructure);
        sb.append(", ");
        sb.append(WinterFlowVariableVersionControl().WinterFlowHookDataSource);
        sb.append(", ");
        sb.append(WinterFlowVariableVersionControl().WinterFlowCacheManagerAgent);
        sb.append(", ");
        return WinterFlowResolverBackend.WinterFlowServerProtocol(sb, WinterFlowVariableVersionControl().WinterFlowArrayNetwork, ')');
    }
}
