package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
final class WinterFlowModuleProtocol extends WinterFlowDeserializationNetwork {
    public final WinterFlowRefactoringManager WinterFlowRouterStructure;

    public WinterFlowModuleProtocol(WinterFlowRefactoringManager winterFlowRefactoringManager) {
        this.WinterFlowRouterStructure = winterFlowRefactoringManager;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    public final WinterFlowUserManagerController WinterFlowArrayNetwork() {
        WinterFlowDecoratorController winterFlowDecoratorController = new WinterFlowDecoratorController();
        winterFlowDecoratorController.WinterFlowVariableBandwidth = this.WinterFlowRouterStructure;
        return winterFlowDecoratorController;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    public final void WinterFlowVariableVersionControl(WinterFlowUserManagerController winterFlowUserManagerController) {
        ((WinterFlowDecoratorController) winterFlowUserManagerController).WinterFlowVariableBandwidth = this.WinterFlowRouterStructure;
    }

    public final boolean equals(Object obj) {
        WinterFlowModuleProtocol winterFlowModuleProtocol = obj instanceof WinterFlowModuleProtocol ? (WinterFlowModuleProtocol) obj : null;
        if (winterFlowModuleProtocol == null) {
            return false;
        }
        return this.WinterFlowRouterStructure.equals(winterFlowModuleProtocol.WinterFlowRouterStructure);
    }

    public final int hashCode() {
        return this.WinterFlowRouterStructure.hashCode();
    }
}
