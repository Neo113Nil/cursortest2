package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowFrontend extends WinterFlowDebugFramework implements WinterFlowEventEvent {
    public final /* synthetic */ Object WinterFlowRouterRouter;
    public final /* synthetic */ WinterFlowOrchestrationIDE WinterFlowSyntax;
    public final /* synthetic */ int WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ Object WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowFrontend(WinterFlowAlgorithmSyntax winterFlowAlgorithmSyntax, WinterFlowTransactionManagerEncryption winterFlowTransactionManagerEncryption, WinterFlowEventTool winterFlowEventTool) {
        super(2);
        this.WinterFlowTransactionManagerStrategy = 3;
        this.WinterFlowUnitTestResponse = winterFlowAlgorithmSyntax;
        this.WinterFlowRouterRouter = winterFlowTransactionManagerEncryption;
        this.WinterFlowSyntax = winterFlowEventTool;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        int i = this.WinterFlowTransactionManagerStrategy;
        int i2 = 1;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        WinterFlowOrchestrationIDE winterFlowOrchestrationIDE = this.WinterFlowSyntax;
        Object obj3 = this.WinterFlowRouterRouter;
        Object obj4 = this.WinterFlowUnitTestResponse;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Number) obj2).intValue();
                WinterFlowInvokerComponent.WinterFlowUnitTestResponse((WinterFlowObjectUI) obj4, (WinterFlowSchedulerEngine) obj3, (WinterFlowEventTool) winterFlowOrchestrationIDE, (WinterFlowResolverLibrary) obj, WinterFlowConfigurationException.WinterFlowResponseEngine(385));
                break;
            case 1:
                ((Number) obj2).intValue();
                WinterFlowCacheRuntime.WinterFlowHookDataSource((WinterFlowObjectSession) obj4, (WinterFlowMapperManager) obj3, (WinterFlowObjectSession) winterFlowOrchestrationIDE, (WinterFlowResolverLibrary) obj, WinterFlowConfigurationException.WinterFlowResponseEngine(49));
                break;
            case 2:
                ((Number) obj2).intValue();
                WinterFlowBackendTransactionManager.WinterFlowRouterStructure((WinterFlowListenerService) obj4, (WinterFlowCacheUtility) obj3, (WinterFlowEventTool) winterFlowOrchestrationIDE, (WinterFlowResolverLibrary) obj, WinterFlowConfigurationException.WinterFlowResponseEngine(1));
                break;
            default:
                WinterFlowResolverLibrary winterFlowResolverLibrary = (WinterFlowResolverLibrary) obj;
                int intValue = ((Number) obj2).intValue();
                WinterFlowAlgorithmSyntax winterFlowAlgorithmSyntax = (WinterFlowAlgorithmSyntax) obj4;
                int i3 = 0;
                if (!winterFlowResolverLibrary.WinterFlowFrontendBackend(intValue & 1, (intValue & 3) != 2)) {
                    winterFlowResolverLibrary.WinterFlowQueueService();
                    break;
                } else {
                    WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager = winterFlowAlgorithmSyntax.WinterFlowVariableVersionControl;
                    boolean WinterFlowUnitTestResponse = winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowAlgorithmSyntax);
                    Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                    WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer = null;
                    WinterFlowThreadPoolProcess winterFlowThreadPoolProcess = WinterFlowModuleModule.WinterFlowRouterStructure;
                    if (WinterFlowUnitTestResponse || WinterFlowSyntaxSubsystem == winterFlowThreadPoolProcess) {
                        WinterFlowSyntaxSubsystem = new WinterFlowInheritanceService(winterFlowAlgorithmSyntax, winterFlowTransactionManagerLayer, i3);
                        winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
                    }
                    WinterFlowSoftwareException.WinterFlowArrayNetwork((WinterFlowEventEvent) WinterFlowSyntaxSubsystem, winterFlowResolverLibrary, winterFlowSyntaxTransactionManager);
                    boolean WinterFlowUnitTestResponse2 = winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowAlgorithmSyntax);
                    Object WinterFlowSyntaxSubsystem2 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                    if (WinterFlowUnitTestResponse2 || WinterFlowSyntaxSubsystem2 == winterFlowThreadPoolProcess) {
                        WinterFlowSyntaxSubsystem2 = new WinterFlowInheritanceService(winterFlowAlgorithmSyntax, winterFlowTransactionManagerLayer, i2);
                        winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem2);
                    }
                    WinterFlowSoftwareException.WinterFlowArrayNetwork((WinterFlowEventEvent) WinterFlowSyntaxSubsystem2, winterFlowResolverLibrary, winterFlowSyntaxTransactionManager);
                    ((WinterFlowTransactionManagerEncryption) obj3).WinterFlowRouterStructure(winterFlowSyntaxTransactionManager, (WinterFlowEventTool) winterFlowOrchestrationIDE, winterFlowResolverLibrary, 0);
                    break;
                }
        }
        return winterFlowAlgorithmSession;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowFrontend(Object obj, Object obj2, WinterFlowOrchestrationIDE winterFlowOrchestrationIDE, int i, int i2) {
        super(2);
        this.WinterFlowTransactionManagerStrategy = i2;
        this.WinterFlowUnitTestResponse = obj;
        this.WinterFlowRouterRouter = obj2;
        this.WinterFlowSyntax = winterFlowOrchestrationIDE;
    }
}
