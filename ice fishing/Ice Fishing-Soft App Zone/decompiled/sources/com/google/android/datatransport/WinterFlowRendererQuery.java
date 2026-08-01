package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRendererQuery extends WinterFlowDebugFramework implements WinterFlowEventEvent {
    public final /* synthetic */ int WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ Object WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowRendererQuery(int i, Object obj) {
        super(2);
        this.WinterFlowTransactionManagerStrategy = i;
        this.WinterFlowUnitTestResponse = obj;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        int i = this.WinterFlowTransactionManagerStrategy;
        boolean z = false;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        Object obj3 = this.WinterFlowUnitTestResponse;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowResolverLibrary winterFlowResolverLibrary = (WinterFlowResolverLibrary) obj;
                int intValue = ((Number) obj2).intValue();
                if (!winterFlowResolverLibrary.WinterFlowFrontendBackend(intValue & 1, (intValue & 3) != 2)) {
                    winterFlowResolverLibrary.WinterFlowQueueService();
                    break;
                } else {
                    ((WinterFlowLoaderFramework) obj3).WinterFlowHookDataSource(winterFlowResolverLibrary, 0);
                    break;
                }
            case 1:
                WinterFlowResolverLibrary winterFlowResolverLibrary2 = (WinterFlowResolverLibrary) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (!winterFlowResolverLibrary2.WinterFlowFrontendBackend(intValue2 & 1, (intValue2 & 3) != 2)) {
                    winterFlowResolverLibrary2.WinterFlowQueueService();
                    break;
                } else {
                    Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary2.WinterFlowSyntaxSubsystem();
                    if (WinterFlowSyntaxSubsystem == WinterFlowModuleModule.WinterFlowRouterStructure) {
                        WinterFlowSyntaxSubsystem = WinterFlowServiceProviderBatch.WinterFlowTransactionAgent;
                        winterFlowResolverLibrary2.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
                    }
                    WinterFlowInvokerComponent.WinterFlowRouterRouter(WinterFlowWebsocketDeployment.WinterFlowRouterStructure(WinterFlowValidatorComponent.WinterFlowRouterStructure, false, (WinterFlowObjectSession) WinterFlowSyntaxSubsystem), (WinterFlowEventEvent) ((WinterFlowThreadPoolGateway) obj3).getValue(), winterFlowResolverLibrary2, 0);
                    break;
                }
            case 2:
                WinterFlowTransactionRequest winterFlowTransactionRequest = (WinterFlowTransactionRequest) obj;
                WinterFlowTransactionRequest winterFlowTransactionRequest2 = (WinterFlowTransactionRequest) obj2;
                WinterFlowTransactionRequest winterFlowTransactionRequest3 = WinterFlowTransactionRequest.WinterFlowUnitTestResponse;
                if (winterFlowTransactionRequest == winterFlowTransactionRequest3 && winterFlowTransactionRequest2 == winterFlowTransactionRequest3 && !((WinterFlowInvokerOrchestration) obj3).WinterFlowRouterStructure.WinterFlowHookDataSource) {
                    z = true;
                }
                break;
            case 3:
                ((Number) obj2).intValue();
                ((WinterFlowNodeMiddleware) obj3).WinterFlowHookDataSource((WinterFlowResolverLibrary) obj, WinterFlowConfigurationException.WinterFlowResponseEngine(1));
                break;
            default:
                ((Number) obj2).intValue();
                ((WinterFlowSessionManagerModule) obj3).WinterFlowHookDataSource((WinterFlowResolverLibrary) obj, WinterFlowConfigurationException.WinterFlowResponseEngine(1));
                break;
        }
        return winterFlowAlgorithmSession;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowRendererQuery(WinterFlowLoaderFramework winterFlowLoaderFramework, int i, int i2) {
        super(2);
        this.WinterFlowTransactionManagerStrategy = i2;
        this.WinterFlowUnitTestResponse = winterFlowLoaderFramework;
    }
}
