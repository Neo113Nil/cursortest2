package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowTestingCache {
    public final long WinterFlowHookDataSource;
    public final long WinterFlowRouterStructure;

    public WinterFlowTestingCache(long j, long j2) {
        this.WinterFlowRouterStructure = j;
        this.WinterFlowHookDataSource = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowTestingCache)) {
            return false;
        }
        WinterFlowTestingCache winterFlowTestingCache = (WinterFlowTestingCache) obj;
        return WinterFlowJavaEntity.WinterFlowRouterStructure(this.WinterFlowRouterStructure, winterFlowTestingCache.WinterFlowRouterStructure) && this.WinterFlowHookDataSource == winterFlowTestingCache.WinterFlowHookDataSource;
    }

    public final int hashCode() {
        return Long.hashCode(this.WinterFlowHookDataSource) + (Long.hashCode(this.WinterFlowRouterStructure) * 31);
    }
}
