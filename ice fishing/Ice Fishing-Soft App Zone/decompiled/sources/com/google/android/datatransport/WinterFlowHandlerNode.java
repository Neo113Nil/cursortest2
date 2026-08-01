package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
final class WinterFlowHandlerNode extends WinterFlowDeserializationNetwork {
    public final WinterFlowObjectSession WinterFlowRouterStructure;

    public WinterFlowHandlerNode(WinterFlowObjectSession winterFlowObjectSession) {
        this.WinterFlowRouterStructure = winterFlowObjectSession;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    public final WinterFlowUserManagerController WinterFlowArrayNetwork() {
        WinterFlowDecoratorNetwork winterFlowDecoratorNetwork = new WinterFlowDecoratorNetwork();
        winterFlowDecoratorNetwork.WinterFlowVariableBandwidth = this.WinterFlowRouterStructure;
        return winterFlowDecoratorNetwork;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    public final void WinterFlowVariableVersionControl(WinterFlowUserManagerController winterFlowUserManagerController) {
        ((WinterFlowDecoratorNetwork) winterFlowUserManagerController).WinterFlowVariableBandwidth = this.WinterFlowRouterStructure;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WinterFlowHandlerNode) {
            return this.WinterFlowRouterStructure == ((WinterFlowHandlerNode) obj).WinterFlowRouterStructure;
        }
        return false;
    }

    public final int hashCode() {
        return this.WinterFlowRouterStructure.hashCode();
    }
}
