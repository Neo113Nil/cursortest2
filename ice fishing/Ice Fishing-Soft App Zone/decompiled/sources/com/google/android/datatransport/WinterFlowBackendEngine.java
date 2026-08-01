package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowBackendEngine {
    public final WinterFlowObjectFrontend WinterFlowCacheManagerAgent;
    public final WinterFlowViewNode WinterFlowHookDataSource;
    public final long WinterFlowRouterStructure;

    public WinterFlowBackendEngine(long j, WinterFlowViewNode winterFlowViewNode, WinterFlowObjectFrontend winterFlowObjectFrontend) {
        this.WinterFlowRouterStructure = j;
        this.WinterFlowHookDataSource = winterFlowViewNode;
        this.WinterFlowCacheManagerAgent = winterFlowObjectFrontend;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WinterFlowBackendEngine)) {
            return false;
        }
        WinterFlowBackendEngine winterFlowBackendEngine = (WinterFlowBackendEngine) obj;
        return this.WinterFlowRouterStructure == winterFlowBackendEngine.WinterFlowRouterStructure && this.WinterFlowHookDataSource.equals(winterFlowBackendEngine.WinterFlowHookDataSource) && this.WinterFlowCacheManagerAgent.equals(winterFlowBackendEngine.WinterFlowCacheManagerAgent);
    }

    public final int hashCode() {
        long j = this.WinterFlowRouterStructure;
        return this.WinterFlowCacheManagerAgent.hashCode() ^ ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.WinterFlowHookDataSource.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.WinterFlowRouterStructure + ", transportContext=" + this.WinterFlowHookDataSource + ", event=" + this.WinterFlowCacheManagerAgent + "}";
    }
}
