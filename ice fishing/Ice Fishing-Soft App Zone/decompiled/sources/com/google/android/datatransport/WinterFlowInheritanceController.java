package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowInheritanceController extends WinterFlowDeserializationNetwork {
    public final WinterFlowStackQuery WinterFlowRouterStructure;

    public WinterFlowInheritanceController(WinterFlowStackQuery winterFlowStackQuery) {
        this.WinterFlowRouterStructure = winterFlowStackQuery;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    public final WinterFlowUserManagerController WinterFlowArrayNetwork() {
        WinterFlowBandwidthService winterFlowBandwidthService = new WinterFlowBandwidthService();
        winterFlowBandwidthService.WinterFlowVariableBandwidth = this.WinterFlowRouterStructure;
        winterFlowBandwidthService.WinterFlowBatchUI = true;
        return winterFlowBandwidthService;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    public final void WinterFlowVariableVersionControl(WinterFlowUserManagerController winterFlowUserManagerController) {
        WinterFlowBandwidthService winterFlowBandwidthService = (WinterFlowBandwidthService) winterFlowUserManagerController;
        winterFlowBandwidthService.WinterFlowVariableBandwidth = this.WinterFlowRouterStructure;
        winterFlowBandwidthService.WinterFlowBatchUI = true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WinterFlowInheritanceController) {
            return WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowRouterStructure, ((WinterFlowInheritanceController) obj).WinterFlowRouterStructure);
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + WinterFlowSingletonMapper.WinterFlowRouterStructure(this.WinterFlowRouterStructure.hashCode() * 31, 31, false);
    }
}
