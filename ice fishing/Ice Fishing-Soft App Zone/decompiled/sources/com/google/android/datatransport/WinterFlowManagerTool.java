package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowManagerTool extends WinterFlowDebugFramework implements WinterFlowEventEvent {
    public final /* synthetic */ int WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowLibraryAgent WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowManagerTool(WinterFlowLibraryAgent winterFlowLibraryAgent, int i) {
        super(2);
        this.WinterFlowTransactionManagerStrategy = i;
        this.WinterFlowUnitTestResponse = winterFlowLibraryAgent;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        int i = this.WinterFlowTransactionManagerStrategy;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        WinterFlowLibraryAgent winterFlowLibraryAgent = this.WinterFlowUnitTestResponse;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                winterFlowLibraryAgent.WinterFlowRouterStructure().WinterFlowTransactionManagerStrategy = (WinterFlowExceptionScheduler) obj2;
                break;
            case 1:
                ((WinterFlowSchedulerStructure) obj).WinterFlowVariableInterface(new WinterFlowRequestProtocol(winterFlowLibraryAgent.WinterFlowRouterStructure(), (WinterFlowEventEvent) obj2));
                break;
            default:
                WinterFlowSchedulerStructure winterFlowSchedulerStructure = (WinterFlowSchedulerStructure) obj;
                WinterFlowAPIRefactoring winterFlowAPIRefactoring = winterFlowLibraryAgent.WinterFlowRouterStructure;
                WinterFlowSessionUI winterFlowSessionUI = winterFlowSchedulerStructure.WinterFlowSyntaxSubsystem;
                if (winterFlowSessionUI == null) {
                    winterFlowSessionUI = new WinterFlowSessionUI(winterFlowSchedulerStructure, winterFlowAPIRefactoring);
                    winterFlowSchedulerStructure.WinterFlowSyntaxSubsystem = winterFlowSessionUI;
                }
                winterFlowLibraryAgent.WinterFlowHookDataSource = winterFlowSessionUI;
                winterFlowLibraryAgent.WinterFlowRouterStructure().WinterFlowRouterRouter();
                WinterFlowSessionUI WinterFlowRouterStructure = winterFlowLibraryAgent.WinterFlowRouterStructure();
                if (WinterFlowRouterStructure.WinterFlowUnitTestResponse != winterFlowAPIRefactoring) {
                    WinterFlowRouterStructure.WinterFlowUnitTestResponse = winterFlowAPIRefactoring;
                    WinterFlowRouterStructure.WinterFlowSyntax(false);
                    WinterFlowSchedulerStructure.WinterFlowConfiguration(WinterFlowRouterStructure.WinterFlowVariableVersionControl, false, 7);
                    break;
                }
                break;
        }
        return winterFlowAlgorithmSession;
    }
}
