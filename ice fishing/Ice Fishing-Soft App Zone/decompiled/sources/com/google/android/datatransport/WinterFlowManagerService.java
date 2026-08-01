package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowManagerService implements WinterFlowProviderView {
    public final WinterFlowObjectNode WinterFlowCacheManagerAgent;
    public final int WinterFlowHookDataSource;
    public final int WinterFlowRouterStructure;

    public WinterFlowManagerService(int i, int i2, WinterFlowObjectNode winterFlowObjectNode) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = i2;
        this.WinterFlowCacheManagerAgent = winterFlowObjectNode;
    }

    @Override // com.google.android.datatransport.WinterFlowModuleSingleton
    public final WinterFlowFrontendAgent WinterFlowRouterStructure(WinterFlowCacheManagerVersionControl winterFlowCacheManagerVersionControl) {
        return new WinterFlowFrontendTesting(this.WinterFlowRouterStructure, this.WinterFlowHookDataSource, this.WinterFlowCacheManagerAgent);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WinterFlowManagerService) {
            WinterFlowManagerService winterFlowManagerService = (WinterFlowManagerService) obj;
            if (winterFlowManagerService.WinterFlowRouterStructure == this.WinterFlowRouterStructure && winterFlowManagerService.WinterFlowHookDataSource == this.WinterFlowHookDataSource && WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowManagerService.WinterFlowCacheManagerAgent, this.WinterFlowCacheManagerAgent)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.WinterFlowCacheManagerAgent.hashCode() + (this.WinterFlowRouterStructure * 31)) * 31) + this.WinterFlowHookDataSource;
    }
}
