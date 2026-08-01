package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCompilerThread implements WinterFlowDatabaseCompiler {
    public final WinterFlowDatabaseCompiler WinterFlowHookDataSource;
    public final WinterFlowDatabaseCompiler WinterFlowRouterStructure;

    public WinterFlowCompilerThread(WinterFlowDatabaseCompiler winterFlowDatabaseCompiler, WinterFlowDatabaseCompiler winterFlowDatabaseCompiler2) {
        this.WinterFlowRouterStructure = winterFlowDatabaseCompiler;
        this.WinterFlowHookDataSource = winterFlowDatabaseCompiler2;
    }

    @Override // com.google.android.datatransport.WinterFlowDatabaseCompiler
    public final int WinterFlowArrayNetwork(WinterFlowInvokerStructure winterFlowInvokerStructure) {
        return Math.max(this.WinterFlowRouterStructure.WinterFlowArrayNetwork(winterFlowInvokerStructure), this.WinterFlowHookDataSource.WinterFlowArrayNetwork(winterFlowInvokerStructure));
    }

    @Override // com.google.android.datatransport.WinterFlowDatabaseCompiler
    public final int WinterFlowCacheManagerAgent(WinterFlowConcurrencyParser winterFlowConcurrencyParser, WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration) {
        return Math.max(this.WinterFlowRouterStructure.WinterFlowCacheManagerAgent(winterFlowConcurrencyParser, winterFlowCacheManagerConfiguration), this.WinterFlowHookDataSource.WinterFlowCacheManagerAgent(winterFlowConcurrencyParser, winterFlowCacheManagerConfiguration));
    }

    @Override // com.google.android.datatransport.WinterFlowDatabaseCompiler
    public final int WinterFlowHookDataSource(WinterFlowInvokerStructure winterFlowInvokerStructure) {
        return Math.max(this.WinterFlowRouterStructure.WinterFlowHookDataSource(winterFlowInvokerStructure), this.WinterFlowHookDataSource.WinterFlowHookDataSource(winterFlowInvokerStructure));
    }

    @Override // com.google.android.datatransport.WinterFlowDatabaseCompiler
    public final int WinterFlowRouterStructure(WinterFlowConcurrencyParser winterFlowConcurrencyParser, WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration) {
        return Math.max(this.WinterFlowRouterStructure.WinterFlowRouterStructure(winterFlowConcurrencyParser, winterFlowCacheManagerConfiguration), this.WinterFlowHookDataSource.WinterFlowRouterStructure(winterFlowConcurrencyParser, winterFlowCacheManagerConfiguration));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowCompilerThread)) {
            return false;
        }
        WinterFlowCompilerThread winterFlowCompilerThread = (WinterFlowCompilerThread) obj;
        return WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowCompilerThread.WinterFlowRouterStructure, this.WinterFlowRouterStructure) && WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowCompilerThread.WinterFlowHookDataSource, this.WinterFlowHookDataSource);
    }

    public final int hashCode() {
        return (this.WinterFlowHookDataSource.hashCode() * 31) + this.WinterFlowRouterStructure.hashCode();
    }

    public final String toString() {
        return "(" + this.WinterFlowRouterStructure + " ∪ " + this.WinterFlowHookDataSource + ')';
    }
}
