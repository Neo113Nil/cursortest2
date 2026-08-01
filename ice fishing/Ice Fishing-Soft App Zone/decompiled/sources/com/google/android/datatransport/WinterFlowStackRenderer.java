package com.google.android.datatransport;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowStackRenderer extends WinterFlowNodeInheritance implements WinterFlowObjectSession {
    public final /* synthetic */ long WinterFlowBandwidthObject;
    public WinterFlowInterfaceProcessor WinterFlowResponseEngine;
    public final /* synthetic */ WinterFlowRendererRefactoring WinterFlowServerProtocol;
    public final /* synthetic */ WinterFlowServiceProviderService WinterFlowServiceUtility;
    public WinterFlowFunctionSubsystem WinterFlowSyntax;
    public final /* synthetic */ Object WinterFlowThreadListener;
    public int WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowStackRenderer(WinterFlowRendererRefactoring winterFlowRendererRefactoring, Object obj, WinterFlowServiceProviderService winterFlowServiceProviderService, long j, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(1, winterFlowTransactionManagerLayer);
        this.WinterFlowServerProtocol = winterFlowRendererRefactoring;
        this.WinterFlowThreadListener = obj;
        this.WinterFlowServiceUtility = winterFlowServiceProviderService;
        this.WinterFlowBandwidthObject = j;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        WinterFlowFunctionSubsystem winterFlowFunctionSubsystem;
        WinterFlowInterfaceProcessor winterFlowInterfaceProcessor;
        WinterFlowServiceProviderService winterFlowServiceProviderService = this.WinterFlowServiceUtility;
        int i = this.WinterFlowTransactionAgent;
        WinterFlowRendererRefactoring winterFlowRendererRefactoring = this.WinterFlowServerProtocol;
        try {
            if (i == 0) {
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                winterFlowRendererRefactoring.WinterFlowCacheManagerAgent.WinterFlowUnitTestResponse = (WinterFlowConfigurationResponse) ((WinterFlowObjectSession) winterFlowRendererRefactoring.WinterFlowRouterStructure.WinterFlowTransactionManagerStrategy).WinterFlowUnitTestResponse(this.WinterFlowThreadListener);
                winterFlowRendererRefactoring.WinterFlowVariableVersionControl.setValue(winterFlowServiceProviderService.WinterFlowCacheManagerAgent);
                winterFlowRendererRefactoring.WinterFlowArrayNetwork.setValue(Boolean.TRUE);
                WinterFlowFunctionSubsystem winterFlowFunctionSubsystem2 = winterFlowRendererRefactoring.WinterFlowCacheManagerAgent;
                WinterFlowFunctionSubsystem winterFlowFunctionSubsystem3 = new WinterFlowFunctionSubsystem(winterFlowFunctionSubsystem2.WinterFlowVariableVersionControl, winterFlowFunctionSubsystem2.WinterFlowTransactionManagerStrategy.getValue(), WinterFlowSoftwareException.WinterFlowResolverController(winterFlowFunctionSubsystem2.WinterFlowUnitTestResponse), winterFlowFunctionSubsystem2.WinterFlowRouterRouter, Long.MIN_VALUE, winterFlowFunctionSubsystem2.WinterFlowResponseEngine);
                WinterFlowInterfaceProcessor winterFlowInterfaceProcessor2 = new WinterFlowInterfaceProcessor();
                long j = this.WinterFlowBandwidthObject;
                WinterFlowUserManagerModule winterFlowUserManagerModule = new WinterFlowUserManagerModule(winterFlowRendererRefactoring, winterFlowFunctionSubsystem3, winterFlowInterfaceProcessor2, 0);
                this.WinterFlowSyntax = winterFlowFunctionSubsystem3;
                this.WinterFlowResponseEngine = winterFlowInterfaceProcessor2;
                this.WinterFlowTransactionAgent = 1;
                Object WinterFlowCacheManagerAgent = WinterFlowDecoratorUI.WinterFlowCacheManagerAgent(winterFlowFunctionSubsystem3, winterFlowServiceProviderService, j, winterFlowUserManagerModule, this);
                WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                if (WinterFlowCacheManagerAgent == winterFlowListenerJava) {
                    return winterFlowListenerJava;
                }
                winterFlowFunctionSubsystem = winterFlowFunctionSubsystem3;
                winterFlowInterfaceProcessor = winterFlowInterfaceProcessor2;
            } else {
                if (i != 1) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                winterFlowInterfaceProcessor = this.WinterFlowResponseEngine;
                winterFlowFunctionSubsystem = this.WinterFlowSyntax;
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
            }
            WinterFlowParserRenderer winterFlowParserRenderer = winterFlowInterfaceProcessor.WinterFlowVariableVersionControl ? WinterFlowParserRenderer.WinterFlowVariableVersionControl : WinterFlowParserRenderer.WinterFlowTransactionManagerStrategy;
            winterFlowRendererRefactoring.WinterFlowHookDataSource();
            return new WinterFlowAlgorithmArray(1, winterFlowFunctionSubsystem, winterFlowParserRenderer);
        } catch (CancellationException e) {
            winterFlowRendererRefactoring.WinterFlowHookDataSource();
            throw e;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        WinterFlowServiceProviderService winterFlowServiceProviderService = this.WinterFlowServiceUtility;
        long j = this.WinterFlowBandwidthObject;
        return new WinterFlowStackRenderer(this.WinterFlowServerProtocol, this.WinterFlowThreadListener, winterFlowServiceProviderService, j, (WinterFlowTransactionManagerLayer) obj).WinterFlowServiceUtility(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
    }
}
