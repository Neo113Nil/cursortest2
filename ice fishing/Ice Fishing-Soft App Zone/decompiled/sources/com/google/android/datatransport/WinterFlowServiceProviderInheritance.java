package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
final class WinterFlowServiceProviderInheritance extends WinterFlowDeserializationNetwork {
    public final boolean WinterFlowArrayNetwork;
    public final WinterFlowBackendBatch WinterFlowCacheManagerAgent;
    public final WinterFlowVersionCacheManager WinterFlowHookDataSource;
    public final WinterFlowObjectUI WinterFlowRouterStructure;

    public WinterFlowServiceProviderInheritance(WinterFlowObjectUI winterFlowObjectUI, WinterFlowVersionCacheManager winterFlowVersionCacheManager, WinterFlowBackendBatch winterFlowBackendBatch, boolean z) {
        this.WinterFlowRouterStructure = winterFlowObjectUI;
        this.WinterFlowHookDataSource = winterFlowVersionCacheManager;
        this.WinterFlowCacheManagerAgent = winterFlowBackendBatch;
        this.WinterFlowArrayNetwork = z;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    public final WinterFlowUserManagerController WinterFlowArrayNetwork() {
        return new WinterFlowStackScript(this.WinterFlowRouterStructure, this.WinterFlowHookDataSource, this.WinterFlowCacheManagerAgent, this.WinterFlowArrayNetwork);
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    public final void WinterFlowVariableVersionControl(WinterFlowUserManagerController winterFlowUserManagerController) {
        WinterFlowStackScript winterFlowStackScript = (WinterFlowStackScript) winterFlowUserManagerController;
        winterFlowStackScript.WinterFlowVariableBandwidth = this.WinterFlowRouterStructure;
        winterFlowStackScript.WinterFlowBatchUI = this.WinterFlowHookDataSource;
        WinterFlowBackendBatch winterFlowBackendBatch = winterFlowStackScript.WinterFlowRouterAdapter;
        WinterFlowBackendBatch winterFlowBackendBatch2 = this.WinterFlowCacheManagerAgent;
        if (winterFlowBackendBatch != winterFlowBackendBatch2) {
            winterFlowStackScript.WinterFlowRouterAdapter = winterFlowBackendBatch2;
            WinterFlowFrameworkMechanism.WinterFlowRouterRouter(winterFlowStackScript);
        }
        boolean z = winterFlowStackScript.WinterFlowSerializerStructure;
        boolean z2 = this.WinterFlowArrayNetwork;
        if (z == z2) {
            return;
        }
        winterFlowStackScript.WinterFlowSerializerStructure = z2;
        winterFlowStackScript.WinterFlowValidatorNetwork();
        WinterFlowFrameworkMechanism.WinterFlowRouterRouter(winterFlowStackScript);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowServiceProviderInheritance)) {
            return false;
        }
        WinterFlowServiceProviderInheritance winterFlowServiceProviderInheritance = (WinterFlowServiceProviderInheritance) obj;
        return this.WinterFlowRouterStructure == winterFlowServiceProviderInheritance.WinterFlowRouterStructure && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowHookDataSource, winterFlowServiceProviderInheritance.WinterFlowHookDataSource) && this.WinterFlowCacheManagerAgent == winterFlowServiceProviderInheritance.WinterFlowCacheManagerAgent && this.WinterFlowArrayNetwork == winterFlowServiceProviderInheritance.WinterFlowArrayNetwork;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + WinterFlowSingletonMapper.WinterFlowRouterStructure((this.WinterFlowCacheManagerAgent.hashCode() + ((this.WinterFlowHookDataSource.hashCode() + (this.WinterFlowRouterStructure.hashCode() * 31)) * 31)) * 31, 31, this.WinterFlowArrayNetwork);
    }
}
