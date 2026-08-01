package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
final class WinterFlowEventHook extends WinterFlowDeserializationNetwork {
    public final WinterFlowObjectSession WinterFlowRouterStructure;

    public WinterFlowEventHook(WinterFlowObjectSession winterFlowObjectSession) {
        this.WinterFlowRouterStructure = winterFlowObjectSession;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    public final WinterFlowUserManagerController WinterFlowArrayNetwork() {
        WinterFlowProtocolInheritance winterFlowProtocolInheritance = new WinterFlowProtocolInheritance();
        winterFlowProtocolInheritance.WinterFlowVariableBandwidth = this.WinterFlowRouterStructure;
        winterFlowProtocolInheritance.WinterFlowBatchUI = true;
        return winterFlowProtocolInheritance;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    public final void WinterFlowVariableVersionControl(WinterFlowUserManagerController winterFlowUserManagerController) {
        WinterFlowProtocolInheritance winterFlowProtocolInheritance = (WinterFlowProtocolInheritance) winterFlowUserManagerController;
        WinterFlowObjectSession winterFlowObjectSession = winterFlowProtocolInheritance.WinterFlowVariableBandwidth;
        WinterFlowObjectSession winterFlowObjectSession2 = this.WinterFlowRouterStructure;
        if (winterFlowObjectSession != winterFlowObjectSession2 || !winterFlowProtocolInheritance.WinterFlowBatchUI) {
            WinterFlowCloudStack.WinterFlowSyntaxSubsystem(winterFlowProtocolInheritance).WinterFlowProxyStructure(false);
        }
        winterFlowProtocolInheritance.WinterFlowVariableBandwidth = winterFlowObjectSession2;
        winterFlowProtocolInheritance.WinterFlowBatchUI = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        WinterFlowEventHook winterFlowEventHook = obj instanceof WinterFlowEventHook ? (WinterFlowEventHook) obj : null;
        return winterFlowEventHook != null && this.WinterFlowRouterStructure == winterFlowEventHook.WinterFlowRouterStructure;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.WinterFlowRouterStructure.hashCode() * 31);
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.WinterFlowRouterStructure + ", rtlAware=true)";
    }
}
