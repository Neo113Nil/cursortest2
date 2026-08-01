package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowQueueThread implements WinterFlowEventEvent {
    public final /* synthetic */ WinterFlowOrchestrationIDE WinterFlowResponseEngine;
    public final /* synthetic */ Object WinterFlowRouterRouter;
    public final /* synthetic */ Object WinterFlowSyntax;
    public final /* synthetic */ int WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ Object WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowQueueThread(Object obj, Object obj2, Object obj3, WinterFlowOrchestrationIDE winterFlowOrchestrationIDE, int i, int i2) {
        this.WinterFlowVariableVersionControl = i2;
        this.WinterFlowUnitTestResponse = obj;
        this.WinterFlowRouterRouter = obj2;
        this.WinterFlowSyntax = obj3;
        this.WinterFlowResponseEngine = winterFlowOrchestrationIDE;
        this.WinterFlowTransactionManagerStrategy = i;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        int i2 = this.WinterFlowTransactionManagerStrategy;
        WinterFlowOrchestrationIDE winterFlowOrchestrationIDE = this.WinterFlowResponseEngine;
        Object obj3 = this.WinterFlowSyntax;
        Object obj4 = this.WinterFlowUnitTestResponse;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Integer) obj2).getClass();
                int WinterFlowResponseEngine = WinterFlowConfigurationException.WinterFlowResponseEngine(i2 | 1);
                WinterFlowSoftwareException.WinterFlowTransactionManagerStrategy((Boolean) obj4, this.WinterFlowRouterRouter, (WinterFlowDecoratorVersion) obj3, (WinterFlowObjectSession) winterFlowOrchestrationIDE, (WinterFlowResolverLibrary) obj, WinterFlowResponseEngine);
                break;
            default:
                ((Integer) obj2).getClass();
                WinterFlowPipelinePlatform.WinterFlowHookDataSource((WinterFlowServiceView) obj4, (WinterFlowRouterSystem) this.WinterFlowRouterRouter, (WinterFlowUserManagerEntity) obj3, (WinterFlowEventTool) winterFlowOrchestrationIDE, (WinterFlowResolverLibrary) obj, WinterFlowConfigurationException.WinterFlowResponseEngine(i2 | 1));
                break;
        }
        return winterFlowAlgorithmSession;
    }
}
