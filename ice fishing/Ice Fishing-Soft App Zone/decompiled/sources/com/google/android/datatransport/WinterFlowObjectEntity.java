package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowObjectEntity {
    public final WinterFlowDebugUtility WinterFlowArrayNetwork;
    public final WinterFlowDebugUtility WinterFlowCacheManagerAgent;
    public final WinterFlowDebugUtility WinterFlowHookDataSource;
    public final WinterFlowDebugUtility WinterFlowRouterStructure;

    public WinterFlowObjectEntity(WinterFlowDebugUtility winterFlowDebugUtility, WinterFlowDebugUtility winterFlowDebugUtility2, WinterFlowDebugUtility winterFlowDebugUtility3, WinterFlowDebugUtility winterFlowDebugUtility4) {
        this.WinterFlowRouterStructure = winterFlowDebugUtility;
        this.WinterFlowHookDataSource = winterFlowDebugUtility2;
        this.WinterFlowCacheManagerAgent = winterFlowDebugUtility3;
        this.WinterFlowArrayNetwork = winterFlowDebugUtility4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof WinterFlowObjectEntity)) {
            return false;
        }
        WinterFlowObjectEntity winterFlowObjectEntity = (WinterFlowObjectEntity) obj;
        return WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowRouterStructure, winterFlowObjectEntity.WinterFlowRouterStructure) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowHookDataSource, winterFlowObjectEntity.WinterFlowHookDataSource) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowCacheManagerAgent, winterFlowObjectEntity.WinterFlowCacheManagerAgent) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowArrayNetwork, winterFlowObjectEntity.WinterFlowArrayNetwork);
    }

    public final int hashCode() {
        WinterFlowDebugUtility winterFlowDebugUtility = this.WinterFlowRouterStructure;
        int hashCode = (winterFlowDebugUtility != null ? winterFlowDebugUtility.hashCode() : 0) * 31;
        WinterFlowDebugUtility winterFlowDebugUtility2 = this.WinterFlowHookDataSource;
        int hashCode2 = (hashCode + (winterFlowDebugUtility2 != null ? winterFlowDebugUtility2.hashCode() : 0)) * 31;
        WinterFlowDebugUtility winterFlowDebugUtility3 = this.WinterFlowCacheManagerAgent;
        int hashCode3 = (hashCode2 + (winterFlowDebugUtility3 != null ? winterFlowDebugUtility3.hashCode() : 0)) * 31;
        WinterFlowDebugUtility winterFlowDebugUtility4 = this.WinterFlowArrayNetwork;
        return hashCode3 + (winterFlowDebugUtility4 != null ? winterFlowDebugUtility4.hashCode() : 0);
    }
}
