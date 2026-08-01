package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowUnitTestThread implements WinterFlowDatabaseCompiler {
    public final WinterFlowResolverSubsystem WinterFlowHookDataSource;
    public final String WinterFlowRouterStructure;

    public WinterFlowUnitTestThread(WinterFlowBackendSessionManager winterFlowBackendSessionManager, String str) {
        this.WinterFlowRouterStructure = str;
        this.WinterFlowHookDataSource = WinterFlowDecoratorUI.WinterFlowSerializerStructure(winterFlowBackendSessionManager);
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

    public final void WinterFlowTransactionManagerStrategy(WinterFlowBackendSessionManager winterFlowBackendSessionManager) {
        this.WinterFlowHookDataSource.setValue(winterFlowBackendSessionManager);
    }

    public final WinterFlowBackendSessionManager WinterFlowVariableVersionControl() {
        return (WinterFlowBackendSessionManager) this.WinterFlowHookDataSource.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof WinterFlowUnitTestThread) {
            return WinterFlowManagerRequest.WinterFlowThreadListener(WinterFlowVariableVersionControl(), ((WinterFlowUnitTestThread) obj).WinterFlowVariableVersionControl());
        }
        return false;
    }

    public final int hashCode() {
        return this.WinterFlowRouterStructure.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.WinterFlowRouterStructure);
        sb.append("(left=");
        sb.append(WinterFlowVariableVersionControl().WinterFlowRouterStructure);
        sb.append(", top=");
        sb.append(WinterFlowVariableVersionControl().WinterFlowHookDataSource);
        sb.append(", right=");
        sb.append(WinterFlowVariableVersionControl().WinterFlowCacheManagerAgent);
        sb.append(", bottom=");
        return WinterFlowResolverBackend.WinterFlowServerProtocol(sb, WinterFlowVariableVersionControl().WinterFlowArrayNetwork, ')');
    }
}
