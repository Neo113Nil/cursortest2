package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
final class WinterFlowSchedulerDeployment extends WinterFlowDeserializationNetwork {
    public final WinterFlowInvokerConsumer WinterFlowRouterStructure;

    public WinterFlowSchedulerDeployment(WinterFlowInvokerConsumer winterFlowInvokerConsumer) {
        this.WinterFlowRouterStructure = winterFlowInvokerConsumer;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    public final WinterFlowUserManagerController WinterFlowArrayNetwork() {
        WinterFlowViewRouter winterFlowViewRouter = new WinterFlowViewRouter();
        winterFlowViewRouter.WinterFlowVariableBandwidth = this.WinterFlowRouterStructure;
        return winterFlowViewRouter;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    public final void WinterFlowVariableVersionControl(WinterFlowUserManagerController winterFlowUserManagerController) {
        ((WinterFlowViewRouter) winterFlowUserManagerController).WinterFlowVariableBandwidth = this.WinterFlowRouterStructure;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        WinterFlowSchedulerDeployment winterFlowSchedulerDeployment = obj instanceof WinterFlowSchedulerDeployment ? (WinterFlowSchedulerDeployment) obj : null;
        return winterFlowSchedulerDeployment != null && this.WinterFlowRouterStructure.equals(winterFlowSchedulerDeployment.WinterFlowRouterStructure);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.WinterFlowRouterStructure.hashCode() * 31);
    }
}
