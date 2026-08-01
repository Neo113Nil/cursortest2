package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
final class WinterFlowOrchestrationSubsystem extends WinterFlowDeserializationNetwork {
    public final WinterFlowObjectSession WinterFlowRouterStructure;

    public WinterFlowOrchestrationSubsystem(WinterFlowObjectSession winterFlowObjectSession) {
        this.WinterFlowRouterStructure = winterFlowObjectSession;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    public final WinterFlowUserManagerController WinterFlowArrayNetwork() {
        WinterFlowTestingConcurrency winterFlowTestingConcurrency = new WinterFlowTestingConcurrency();
        WinterFlowResolverFramework winterFlowResolverFramework = WinterFlowServerManager.WinterFlowThreadListener;
        winterFlowTestingConcurrency.WinterFlowVariableBandwidth = winterFlowResolverFramework;
        winterFlowTestingConcurrency.WinterFlowBatchUI = winterFlowResolverFramework;
        winterFlowTestingConcurrency.WinterFlowRouterAdapter = this.WinterFlowRouterStructure;
        return winterFlowTestingConcurrency;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    public final void WinterFlowVariableVersionControl(WinterFlowUserManagerController winterFlowUserManagerController) {
        WinterFlowTestingConcurrency winterFlowTestingConcurrency = (WinterFlowTestingConcurrency) winterFlowUserManagerController;
        WinterFlowObjectSession winterFlowObjectSession = winterFlowTestingConcurrency.WinterFlowRouterAdapter;
        WinterFlowObjectSession winterFlowObjectSession2 = this.WinterFlowRouterStructure;
        if (winterFlowObjectSession2 != winterFlowObjectSession) {
            winterFlowTestingConcurrency.WinterFlowRouterAdapter = winterFlowObjectSession2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WinterFlowOrchestrationSubsystem) && ((WinterFlowOrchestrationSubsystem) obj).WinterFlowRouterStructure == this.WinterFlowRouterStructure;
    }

    public final int hashCode() {
        return this.WinterFlowRouterStructure.hashCode();
    }
}
