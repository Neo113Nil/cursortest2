package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowJSONMapper implements WinterFlowEventEvent {
    public final /* synthetic */ int WinterFlowResponseEngine;
    public final /* synthetic */ Object WinterFlowRouterRouter;
    public final /* synthetic */ WinterFlowOrchestrationIDE WinterFlowSyntax;
    public final /* synthetic */ Object WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowJSONMapper(WinterFlowMapperManager winterFlowMapperManager, String str, WinterFlowObjectUI winterFlowObjectUI, int i, int i2) {
        this.WinterFlowVariableVersionControl = 0;
        this.WinterFlowTransactionManagerStrategy = winterFlowMapperManager;
        this.WinterFlowRouterRouter = str;
        this.WinterFlowSyntax = winterFlowObjectUI;
        this.WinterFlowUnitTestResponse = i;
        this.WinterFlowResponseEngine = i2;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        int i = this.WinterFlowVariableVersionControl;
        Object obj3 = this.WinterFlowTransactionManagerStrategy;
        int i2 = this.WinterFlowResponseEngine;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        WinterFlowOrchestrationIDE winterFlowOrchestrationIDE = this.WinterFlowSyntax;
        Object obj4 = this.WinterFlowRouterRouter;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                String str = (String) obj4;
                ((Integer) obj2).getClass();
                int WinterFlowResponseEngine = WinterFlowConfigurationException.WinterFlowResponseEngine(this.WinterFlowUnitTestResponse | 1);
                int i3 = this.WinterFlowResponseEngine;
                WinterFlowSoftwareException.WinterFlowServerProtocol(WinterFlowResponseEngine, i3, (WinterFlowObjectUI) winterFlowOrchestrationIDE, (WinterFlowResolverLibrary) obj, (WinterFlowMapperManager) obj3, str);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int WinterFlowResponseEngine2 = WinterFlowConfigurationException.WinterFlowResponseEngine(i2 | 1);
                int i4 = this.WinterFlowUnitTestResponse;
                WinterFlowSoftwareException.WinterFlowThreadListener(i4, WinterFlowResponseEngine2, (WinterFlowObjectUI) winterFlowOrchestrationIDE, (WinterFlowResolverLibrary) obj, (WinterFlowMapperManager) obj3, (String) obj4);
                break;
            default:
                ((Integer) obj2).getClass();
                int WinterFlowResponseEngine3 = WinterFlowConfigurationException.WinterFlowResponseEngine(i2 | 1);
                WinterFlowManagerRequest.WinterFlowSyntax(this.WinterFlowTransactionManagerStrategy, this.WinterFlowUnitTestResponse, (WinterFlowServiceFrontend) obj4, (WinterFlowEventTool) winterFlowOrchestrationIDE, (WinterFlowResolverLibrary) obj, WinterFlowResponseEngine3);
                break;
        }
        return winterFlowAlgorithmSession;
    }

    public /* synthetic */ WinterFlowJSONMapper(Object obj, int i, Object obj2, WinterFlowOrchestrationIDE winterFlowOrchestrationIDE, int i2, int i3) {
        this.WinterFlowVariableVersionControl = i3;
        this.WinterFlowTransactionManagerStrategy = obj;
        this.WinterFlowUnitTestResponse = i;
        this.WinterFlowRouterRouter = obj2;
        this.WinterFlowSyntax = winterFlowOrchestrationIDE;
        this.WinterFlowResponseEngine = i2;
    }
}
