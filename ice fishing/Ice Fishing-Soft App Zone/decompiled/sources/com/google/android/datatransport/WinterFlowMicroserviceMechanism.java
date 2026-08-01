package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
final class WinterFlowMicroserviceMechanism extends WinterFlowDeserializationNetwork {
    public final float WinterFlowHookDataSource;
    public final WinterFlowObjectService WinterFlowRouterStructure;

    public WinterFlowMicroserviceMechanism(WinterFlowObjectService winterFlowObjectService, float f) {
        this.WinterFlowRouterStructure = winterFlowObjectService;
        this.WinterFlowHookDataSource = f;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    public final WinterFlowUserManagerController WinterFlowArrayNetwork() {
        WinterFlowRouterMapper winterFlowRouterMapper = new WinterFlowRouterMapper();
        winterFlowRouterMapper.WinterFlowVariableBandwidth = this.WinterFlowRouterStructure;
        winterFlowRouterMapper.WinterFlowBatchUI = this.WinterFlowHookDataSource;
        return winterFlowRouterMapper;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    public final void WinterFlowVariableVersionControl(WinterFlowUserManagerController winterFlowUserManagerController) {
        WinterFlowRouterMapper winterFlowRouterMapper = (WinterFlowRouterMapper) winterFlowUserManagerController;
        winterFlowRouterMapper.WinterFlowVariableBandwidth = this.WinterFlowRouterStructure;
        winterFlowRouterMapper.WinterFlowBatchUI = this.WinterFlowHookDataSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowMicroserviceMechanism)) {
            return false;
        }
        WinterFlowMicroserviceMechanism winterFlowMicroserviceMechanism = (WinterFlowMicroserviceMechanism) obj;
        return this.WinterFlowRouterStructure == winterFlowMicroserviceMechanism.WinterFlowRouterStructure && this.WinterFlowHookDataSource == winterFlowMicroserviceMechanism.WinterFlowHookDataSource;
    }

    public final int hashCode() {
        return Float.hashCode(this.WinterFlowHookDataSource) + (this.WinterFlowRouterStructure.hashCode() * 31);
    }
}
