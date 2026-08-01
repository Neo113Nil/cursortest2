package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowPipelineResolver implements WinterFlowEventEvent {
    public final /* synthetic */ WinterFlowObjectSession WinterFlowResponseEngine;
    public final /* synthetic */ WinterFlowMapperManager WinterFlowRouterRouter;
    public final /* synthetic */ WinterFlowObjectSession WinterFlowServerProtocol;
    public final /* synthetic */ int WinterFlowServiceUtility;
    public final /* synthetic */ WinterFlowInvokerConsumer WinterFlowSyntax;
    public final /* synthetic */ WinterFlowObjectSession WinterFlowThreadListener;
    public final /* synthetic */ WinterFlowObjectSession WinterFlowTransactionAgent;
    public final /* synthetic */ WinterFlowProtocolManager WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ Object WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowPipelineResolver(WinterFlowProtocolManager winterFlowProtocolManager, WinterFlowMapperManager winterFlowMapperManager, WinterFlowInvokerConsumer winterFlowInvokerConsumer, WinterFlowObjectSession winterFlowObjectSession, WinterFlowObjectSession winterFlowObjectSession2, WinterFlowObjectSession winterFlowObjectSession3, WinterFlowObjectSession winterFlowObjectSession4, WinterFlowObjectSession winterFlowObjectSession5, int i) {
        this.WinterFlowVariableVersionControl = 3;
        this.WinterFlowTransactionManagerStrategy = winterFlowProtocolManager;
        this.WinterFlowRouterRouter = winterFlowMapperManager;
        this.WinterFlowSyntax = winterFlowInvokerConsumer;
        this.WinterFlowResponseEngine = winterFlowObjectSession;
        this.WinterFlowTransactionAgent = winterFlowObjectSession2;
        this.WinterFlowServerProtocol = winterFlowObjectSession3;
        this.WinterFlowThreadListener = winterFlowObjectSession4;
        this.WinterFlowUnitTestResponse = winterFlowObjectSession5;
        this.WinterFlowServiceUtility = i;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        int i2 = this.WinterFlowServiceUtility;
        Object obj3 = this.WinterFlowUnitTestResponse;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Integer) obj2).getClass();
                int WinterFlowResponseEngine = WinterFlowConfigurationException.WinterFlowResponseEngine(i2 | 1);
                WinterFlowServerManager.WinterFlowTransactionManagerStrategy(this.WinterFlowTransactionManagerStrategy, (WinterFlowSerializerMicroservice) obj3, this.WinterFlowRouterRouter, this.WinterFlowSyntax, this.WinterFlowResponseEngine, this.WinterFlowTransactionAgent, this.WinterFlowServerProtocol, this.WinterFlowThreadListener, (WinterFlowResolverLibrary) obj, WinterFlowResponseEngine);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int WinterFlowResponseEngine2 = WinterFlowConfigurationException.WinterFlowResponseEngine(i2 | 1);
                WinterFlowServerManager.WinterFlowTransactionManagerStrategy(this.WinterFlowTransactionManagerStrategy, (WinterFlowSerializerMicroservice) obj3, this.WinterFlowRouterRouter, this.WinterFlowSyntax, this.WinterFlowResponseEngine, this.WinterFlowTransactionAgent, this.WinterFlowServerProtocol, this.WinterFlowThreadListener, (WinterFlowResolverLibrary) obj, WinterFlowResponseEngine2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int WinterFlowResponseEngine3 = WinterFlowConfigurationException.WinterFlowResponseEngine(i2 | 1);
                WinterFlowServerManager.WinterFlowTransactionManagerStrategy(this.WinterFlowTransactionManagerStrategy, (WinterFlowSerializerMicroservice) obj3, this.WinterFlowRouterRouter, this.WinterFlowSyntax, this.WinterFlowResponseEngine, this.WinterFlowTransactionAgent, this.WinterFlowServerProtocol, this.WinterFlowThreadListener, (WinterFlowResolverLibrary) obj, WinterFlowResponseEngine3);
                break;
            default:
                ((Integer) obj2).getClass();
                int WinterFlowResponseEngine4 = WinterFlowConfigurationException.WinterFlowResponseEngine(i2 | 1);
                WinterFlowServerManager.WinterFlowVariableVersionControl(this.WinterFlowTransactionManagerStrategy, this.WinterFlowRouterRouter, this.WinterFlowSyntax, this.WinterFlowResponseEngine, this.WinterFlowTransactionAgent, this.WinterFlowServerProtocol, this.WinterFlowThreadListener, (WinterFlowObjectSession) obj3, (WinterFlowResolverLibrary) obj, WinterFlowResponseEngine4);
                break;
        }
        return winterFlowAlgorithmSession;
    }

    public /* synthetic */ WinterFlowPipelineResolver(WinterFlowProtocolManager winterFlowProtocolManager, WinterFlowSerializerMicroservice winterFlowSerializerMicroservice, WinterFlowMapperManager winterFlowMapperManager, WinterFlowInvokerConsumer winterFlowInvokerConsumer, WinterFlowObjectSession winterFlowObjectSession, WinterFlowObjectSession winterFlowObjectSession2, WinterFlowObjectSession winterFlowObjectSession3, WinterFlowObjectSession winterFlowObjectSession4, int i, int i2) {
        this.WinterFlowVariableVersionControl = i2;
        this.WinterFlowTransactionManagerStrategy = winterFlowProtocolManager;
        this.WinterFlowUnitTestResponse = winterFlowSerializerMicroservice;
        this.WinterFlowRouterRouter = winterFlowMapperManager;
        this.WinterFlowSyntax = winterFlowInvokerConsumer;
        this.WinterFlowResponseEngine = winterFlowObjectSession;
        this.WinterFlowTransactionAgent = winterFlowObjectSession2;
        this.WinterFlowServerProtocol = winterFlowObjectSession3;
        this.WinterFlowThreadListener = winterFlowObjectSession4;
        this.WinterFlowServiceUtility = i;
    }
}
