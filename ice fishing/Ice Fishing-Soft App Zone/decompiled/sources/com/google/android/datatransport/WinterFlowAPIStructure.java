package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowAPIStructure {
    public final WinterFlowCacheManagerListener WinterFlowHookDataSource;
    public final String WinterFlowRouterStructure;

    public WinterFlowAPIStructure(String str, WinterFlowCacheManagerListener winterFlowCacheManagerListener) {
        this.WinterFlowRouterStructure = str;
        this.WinterFlowHookDataSource = winterFlowCacheManagerListener;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowAPIStructure)) {
            return false;
        }
        WinterFlowAPIStructure winterFlowAPIStructure = (WinterFlowAPIStructure) obj;
        return this.WinterFlowRouterStructure.equals(winterFlowAPIStructure.WinterFlowRouterStructure) && this.WinterFlowHookDataSource.equals(winterFlowAPIStructure.WinterFlowHookDataSource);
    }

    public final int hashCode() {
        return this.WinterFlowHookDataSource.hashCode() + (this.WinterFlowRouterStructure.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.WinterFlowRouterStructure + ", range=" + this.WinterFlowHookDataSource + ')';
    }
}
