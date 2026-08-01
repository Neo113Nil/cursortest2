package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowModuleUtility extends WinterFlowDeserializationNetwork {
    public final /* synthetic */ WinterFlowSyntaxTransactionManager WinterFlowRouterStructure;

    public WinterFlowModuleUtility(WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager) {
        this.WinterFlowRouterStructure = winterFlowSyntaxTransactionManager;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    public final WinterFlowUserManagerController WinterFlowArrayNetwork() {
        return new WinterFlowHandlerEngine(this.WinterFlowRouterStructure);
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    public final void WinterFlowVariableVersionControl(WinterFlowUserManagerController winterFlowUserManagerController) {
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return this.WinterFlowRouterStructure.hashCode();
    }
}
