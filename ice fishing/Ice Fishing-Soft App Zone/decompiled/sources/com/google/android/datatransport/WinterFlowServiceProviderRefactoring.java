package com.google.android.datatransport;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowServiceProviderRefactoring extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public /* synthetic */ Object WinterFlowResponseEngine;
    public final /* synthetic */ WinterFlowJSONRepository WinterFlowServerProtocol;
    public final /* synthetic */ long WinterFlowServiceUtility;
    public int WinterFlowSyntax;
    public final /* synthetic */ WinterFlowInvokerRuntime WinterFlowThreadListener;
    public final /* synthetic */ WinterFlowSyntaxFramework WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowServiceProviderRefactoring(WinterFlowSyntaxFramework winterFlowSyntaxFramework, WinterFlowJSONRepository winterFlowJSONRepository, WinterFlowInvokerRuntime winterFlowInvokerRuntime, long j, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowTransactionAgent = winterFlowSyntaxFramework;
        this.WinterFlowServerProtocol = winterFlowJSONRepository;
        this.WinterFlowThreadListener = winterFlowInvokerRuntime;
        this.WinterFlowServiceUtility = j;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        WinterFlowServiceProviderRefactoring winterFlowServiceProviderRefactoring = new WinterFlowServiceProviderRefactoring(this.WinterFlowTransactionAgent, this.WinterFlowServerProtocol, this.WinterFlowThreadListener, this.WinterFlowServiceUtility, winterFlowTransactionManagerLayer);
        winterFlowServiceProviderRefactoring.WinterFlowResponseEngine = obj;
        return winterFlowServiceProviderRefactoring;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        WinterFlowSyntaxFramework winterFlowSyntaxFramework = this.WinterFlowTransactionAgent;
        WinterFlowRequestController winterFlowRequestController = winterFlowSyntaxFramework.WinterFlowMapperProtocol;
        int i = this.WinterFlowSyntax;
        try {
            try {
                if (i == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowConsumerBandwidth WinterFlowCompilerVariable = WinterFlowInvokerComponent.WinterFlowCompilerVariable(((WinterFlowAdapterResponse) this.WinterFlowResponseEngine).WinterFlowRouterRouter());
                    winterFlowSyntaxFramework.WinterFlowBackendCacheManager = true;
                    WinterFlowTransactionManagerService winterFlowTransactionManagerService = winterFlowSyntaxFramework.WinterFlowBatchUI;
                    WinterFlowExceptionListener winterFlowExceptionListener = WinterFlowExceptionListener.WinterFlowVariableVersionControl;
                    WinterFlowMiddlewareHandler winterFlowMiddlewareHandler = new WinterFlowMiddlewareHandler(this.WinterFlowServerProtocol, winterFlowSyntaxFramework, this.WinterFlowThreadListener, this.WinterFlowServiceUtility, WinterFlowCompilerVariable, null);
                    this.WinterFlowSyntax = 1;
                    Object WinterFlowTransactionManagerStrategy = winterFlowTransactionManagerService.WinterFlowTransactionManagerStrategy(winterFlowExceptionListener, winterFlowMiddlewareHandler, this);
                    WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                    if (WinterFlowTransactionManagerStrategy == winterFlowListenerJava) {
                        return winterFlowListenerJava;
                    }
                } else {
                    if (i != 1) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                }
                winterFlowRequestController.WinterFlowHookDataSource();
                winterFlowSyntaxFramework.WinterFlowBackendCacheManager = false;
                winterFlowRequestController.WinterFlowRouterStructure(null);
                winterFlowSyntaxFramework.WinterFlowResolverController = false;
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th) {
            winterFlowSyntaxFramework.WinterFlowBackendCacheManager = false;
            winterFlowRequestController.WinterFlowRouterStructure(null);
            winterFlowSyntaxFramework.WinterFlowResolverController = false;
            throw th;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        return ((WinterFlowServiceProviderRefactoring) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
    }
}
