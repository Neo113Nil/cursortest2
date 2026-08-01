package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowInheritanceDataSource {
    public String WinterFlowHookDataSource;
    public final String WinterFlowRouterStructure;
    public boolean WinterFlowCacheManagerAgent = false;
    public WinterFlowFrameworkRequest WinterFlowArrayNetwork = null;

    public WinterFlowInheritanceDataSource(String str, String str2) {
        this.WinterFlowRouterStructure = str;
        this.WinterFlowHookDataSource = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowInheritanceDataSource)) {
            return false;
        }
        WinterFlowInheritanceDataSource winterFlowInheritanceDataSource = (WinterFlowInheritanceDataSource) obj;
        return WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowRouterStructure, winterFlowInheritanceDataSource.WinterFlowRouterStructure) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowHookDataSource, winterFlowInheritanceDataSource.WinterFlowHookDataSource) && this.WinterFlowCacheManagerAgent == winterFlowInheritanceDataSource.WinterFlowCacheManagerAgent && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowArrayNetwork, winterFlowInheritanceDataSource.WinterFlowArrayNetwork);
    }

    public final int hashCode() {
        int WinterFlowRouterStructure = WinterFlowSingletonMapper.WinterFlowRouterStructure((this.WinterFlowHookDataSource.hashCode() + (this.WinterFlowRouterStructure.hashCode() * 31)) * 31, 31, this.WinterFlowCacheManagerAgent);
        WinterFlowFrameworkRequest winterFlowFrameworkRequest = this.WinterFlowArrayNetwork;
        return WinterFlowRouterStructure + (winterFlowFrameworkRequest == null ? 0 : winterFlowFrameworkRequest.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.WinterFlowArrayNetwork + ", isShowingSubstitution=" + this.WinterFlowCacheManagerAgent + ')';
    }
}
