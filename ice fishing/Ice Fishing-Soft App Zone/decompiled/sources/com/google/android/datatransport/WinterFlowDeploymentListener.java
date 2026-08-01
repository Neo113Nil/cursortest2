package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDeploymentListener implements WinterFlowModuleSingleton {
    public final long WinterFlowHookDataSource;
    public final WinterFlowModuleSingleton WinterFlowRouterStructure;

    public WinterFlowDeploymentListener(WinterFlowProviderView winterFlowProviderView, long j) {
        this.WinterFlowRouterStructure = winterFlowProviderView;
        this.WinterFlowHookDataSource = j;
    }

    @Override // com.google.android.datatransport.WinterFlowModuleSingleton
    public final WinterFlowFrontendAgent WinterFlowRouterStructure(WinterFlowCacheManagerVersionControl winterFlowCacheManagerVersionControl) {
        return new WinterFlowEventEmitterDeployment(this.WinterFlowRouterStructure.WinterFlowRouterStructure(winterFlowCacheManagerVersionControl), this.WinterFlowHookDataSource);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WinterFlowDeploymentListener)) {
            return false;
        }
        WinterFlowDeploymentListener winterFlowDeploymentListener = (WinterFlowDeploymentListener) obj;
        return winterFlowDeploymentListener.WinterFlowHookDataSource == this.WinterFlowHookDataSource && WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowDeploymentListener.WinterFlowRouterStructure, this.WinterFlowRouterStructure);
    }

    public final int hashCode() {
        return Long.hashCode(this.WinterFlowHookDataSource) + (this.WinterFlowRouterStructure.hashCode() * 31);
    }
}
