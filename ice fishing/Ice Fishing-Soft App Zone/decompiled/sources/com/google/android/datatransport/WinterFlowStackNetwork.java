package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowStackNetwork implements WinterFlowDatabaseCompiler {
    public final WinterFlowDatabaseCompiler WinterFlowHookDataSource;
    public final WinterFlowDatabaseCompiler WinterFlowRouterStructure;

    public WinterFlowStackNetwork(WinterFlowDatabaseCompiler winterFlowDatabaseCompiler, WinterFlowDatabaseCompiler winterFlowDatabaseCompiler2) {
        this.WinterFlowRouterStructure = winterFlowDatabaseCompiler;
        this.WinterFlowHookDataSource = winterFlowDatabaseCompiler2;
    }

    @Override // com.google.android.datatransport.WinterFlowDatabaseCompiler
    public final int WinterFlowArrayNetwork(WinterFlowInvokerStructure winterFlowInvokerStructure) {
        int WinterFlowArrayNetwork = this.WinterFlowRouterStructure.WinterFlowArrayNetwork(winterFlowInvokerStructure) - this.WinterFlowHookDataSource.WinterFlowArrayNetwork(winterFlowInvokerStructure);
        if (WinterFlowArrayNetwork < 0) {
            return 0;
        }
        return WinterFlowArrayNetwork;
    }

    @Override // com.google.android.datatransport.WinterFlowDatabaseCompiler
    public final int WinterFlowCacheManagerAgent(WinterFlowConcurrencyParser winterFlowConcurrencyParser, WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration) {
        int WinterFlowCacheManagerAgent = this.WinterFlowRouterStructure.WinterFlowCacheManagerAgent(winterFlowConcurrencyParser, winterFlowCacheManagerConfiguration) - this.WinterFlowHookDataSource.WinterFlowCacheManagerAgent(winterFlowConcurrencyParser, winterFlowCacheManagerConfiguration);
        if (WinterFlowCacheManagerAgent < 0) {
            return 0;
        }
        return WinterFlowCacheManagerAgent;
    }

    @Override // com.google.android.datatransport.WinterFlowDatabaseCompiler
    public final int WinterFlowHookDataSource(WinterFlowInvokerStructure winterFlowInvokerStructure) {
        int WinterFlowHookDataSource = this.WinterFlowRouterStructure.WinterFlowHookDataSource(winterFlowInvokerStructure) - this.WinterFlowHookDataSource.WinterFlowHookDataSource(winterFlowInvokerStructure);
        if (WinterFlowHookDataSource < 0) {
            return 0;
        }
        return WinterFlowHookDataSource;
    }

    @Override // com.google.android.datatransport.WinterFlowDatabaseCompiler
    public final int WinterFlowRouterStructure(WinterFlowConcurrencyParser winterFlowConcurrencyParser, WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration) {
        int WinterFlowRouterStructure = this.WinterFlowRouterStructure.WinterFlowRouterStructure(winterFlowConcurrencyParser, winterFlowCacheManagerConfiguration) - this.WinterFlowHookDataSource.WinterFlowRouterStructure(winterFlowConcurrencyParser, winterFlowCacheManagerConfiguration);
        if (WinterFlowRouterStructure < 0) {
            return 0;
        }
        return WinterFlowRouterStructure;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowStackNetwork)) {
            return false;
        }
        WinterFlowStackNetwork winterFlowStackNetwork = (WinterFlowStackNetwork) obj;
        return WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowStackNetwork.WinterFlowRouterStructure, this.WinterFlowRouterStructure) && WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowStackNetwork.WinterFlowHookDataSource, this.WinterFlowHookDataSource);
    }

    public final int hashCode() {
        return this.WinterFlowHookDataSource.hashCode() + (this.WinterFlowRouterStructure.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.WinterFlowRouterStructure + " - " + this.WinterFlowHookDataSource + ')';
    }
}
