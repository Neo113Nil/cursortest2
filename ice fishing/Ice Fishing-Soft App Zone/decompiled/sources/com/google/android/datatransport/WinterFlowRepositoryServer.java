package com.google.android.datatransport;

import java.util.Set;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRepositoryServer {
    public final Set WinterFlowCacheManagerAgent;
    public final long WinterFlowHookDataSource;
    public final long WinterFlowRouterStructure;

    public WinterFlowRepositoryServer(long j, long j2, Set set) {
        this.WinterFlowRouterStructure = j;
        this.WinterFlowHookDataSource = j2;
        this.WinterFlowCacheManagerAgent = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof WinterFlowRepositoryServer) {
            WinterFlowRepositoryServer winterFlowRepositoryServer = (WinterFlowRepositoryServer) obj;
            if (this.WinterFlowRouterStructure == winterFlowRepositoryServer.WinterFlowRouterStructure && this.WinterFlowHookDataSource == winterFlowRepositoryServer.WinterFlowHookDataSource && this.WinterFlowCacheManagerAgent.equals(winterFlowRepositoryServer.WinterFlowCacheManagerAgent)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.WinterFlowRouterStructure;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.WinterFlowHookDataSource;
        return this.WinterFlowCacheManagerAgent.hashCode() ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.WinterFlowRouterStructure + ", maxAllowedDelay=" + this.WinterFlowHookDataSource + ", flags=" + this.WinterFlowCacheManagerAgent + "}";
    }
}
