package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowInvokerRepository {
    public float WinterFlowRouterStructure = 0.0f;
    public boolean WinterFlowHookDataSource = true;
    public WinterFlowInheritanceProxy WinterFlowCacheManagerAgent = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowInvokerRepository)) {
            return false;
        }
        WinterFlowInvokerRepository winterFlowInvokerRepository = (WinterFlowInvokerRepository) obj;
        return Float.compare(this.WinterFlowRouterStructure, winterFlowInvokerRepository.WinterFlowRouterStructure) == 0 && this.WinterFlowHookDataSource == winterFlowInvokerRepository.WinterFlowHookDataSource && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowCacheManagerAgent, winterFlowInvokerRepository.WinterFlowCacheManagerAgent);
    }

    public final int hashCode() {
        int WinterFlowRouterStructure = WinterFlowSingletonMapper.WinterFlowRouterStructure(Float.hashCode(this.WinterFlowRouterStructure) * 31, 31, this.WinterFlowHookDataSource);
        WinterFlowInheritanceProxy winterFlowInheritanceProxy = this.WinterFlowCacheManagerAgent;
        return (WinterFlowRouterStructure + (winterFlowInheritanceProxy == null ? 0 : winterFlowInheritanceProxy.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.WinterFlowRouterStructure + ", fill=" + this.WinterFlowHookDataSource + ", crossAxisAlignment=" + this.WinterFlowCacheManagerAgent + ", flowLayoutData=null)";
    }
}
