package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowExceptionThreadPool implements WinterFlowEventEvent {
    public final /* synthetic */ boolean WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowOrchestrationIDE WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowExceptionThreadPool(boolean z, WinterFlowOrchestrationIDE winterFlowOrchestrationIDE, int i, int i2) {
        this.WinterFlowVariableVersionControl = i2;
        this.WinterFlowTransactionManagerStrategy = z;
        this.WinterFlowUnitTestResponse = winterFlowOrchestrationIDE;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        WinterFlowOrchestrationIDE winterFlowOrchestrationIDE = this.WinterFlowUnitTestResponse;
        boolean z = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Integer) obj2).getClass();
                WinterFlowServerManager.WinterFlowHookDataSource(z, (WinterFlowObjectUI) winterFlowOrchestrationIDE, (WinterFlowResolverLibrary) obj, WinterFlowConfigurationException.WinterFlowResponseEngine(1));
                break;
            default:
                ((Integer) obj2).getClass();
                WinterFlowSoftwareException.WinterFlowResponseEngine(z, (WinterFlowEventEvent) winterFlowOrchestrationIDE, (WinterFlowResolverLibrary) obj, WinterFlowConfigurationException.WinterFlowResponseEngine(1));
                break;
        }
        return winterFlowAlgorithmSession;
    }
}
