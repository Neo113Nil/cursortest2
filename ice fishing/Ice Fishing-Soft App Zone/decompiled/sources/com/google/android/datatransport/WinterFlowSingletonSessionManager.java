package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSingletonSessionManager {
    public final long WinterFlowCacheManagerAgent;
    public final long WinterFlowHookDataSource;
    public final long WinterFlowRouterStructure;

    public WinterFlowSingletonSessionManager(long j, long j2, long j3) {
        this.WinterFlowRouterStructure = j;
        this.WinterFlowHookDataSource = j2;
        this.WinterFlowCacheManagerAgent = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof WinterFlowSingletonSessionManager) {
            WinterFlowSingletonSessionManager winterFlowSingletonSessionManager = (WinterFlowSingletonSessionManager) obj;
            if (this.WinterFlowRouterStructure == winterFlowSingletonSessionManager.WinterFlowRouterStructure && this.WinterFlowHookDataSource == winterFlowSingletonSessionManager.WinterFlowHookDataSource && this.WinterFlowCacheManagerAgent == winterFlowSingletonSessionManager.WinterFlowCacheManagerAgent) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.WinterFlowRouterStructure;
        long j2 = this.WinterFlowHookDataSource;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.WinterFlowCacheManagerAgent;
        return ((int) ((j3 >>> 32) ^ j3)) ^ i;
    }

    public final String toString() {
        return "StartupTime{epochMillis=" + this.WinterFlowRouterStructure + ", elapsedRealtime=" + this.WinterFlowHookDataSource + ", uptimeMillis=" + this.WinterFlowCacheManagerAgent + "}";
    }
}
