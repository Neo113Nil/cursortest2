package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowScriptNode extends WinterFlowNodeInheritance implements WinterFlowObjectSession {
    public final /* synthetic */ Object WinterFlowResponseEngine;
    public final /* synthetic */ WinterFlowCacheManagerMicroservice WinterFlowServerProtocol;
    public final /* synthetic */ float WinterFlowServiceUtility;
    public int WinterFlowSyntax;
    public final /* synthetic */ WinterFlowHandlerInvoker WinterFlowThreadListener;
    public final /* synthetic */ Object WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowScriptNode(Object obj, Object obj2, WinterFlowCacheManagerMicroservice winterFlowCacheManagerMicroservice, WinterFlowHandlerInvoker winterFlowHandlerInvoker, float f, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(1, winterFlowTransactionManagerLayer);
        this.WinterFlowResponseEngine = obj;
        this.WinterFlowTransactionAgent = obj2;
        this.WinterFlowServerProtocol = winterFlowCacheManagerMicroservice;
        this.WinterFlowThreadListener = winterFlowHandlerInvoker;
        this.WinterFlowServiceUtility = f;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        int i = this.WinterFlowSyntax;
        if (i == 0) {
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
            WinterFlowValidatorNetwork winterFlowValidatorNetwork = new WinterFlowValidatorNetwork(this.WinterFlowResponseEngine, this.WinterFlowTransactionAgent, this.WinterFlowServerProtocol, this.WinterFlowThreadListener, this.WinterFlowServiceUtility, null);
            this.WinterFlowSyntax = 1;
            Object WinterFlowOrchestrationSubsystem = WinterFlowEncryptionSubsystem.WinterFlowOrchestrationSubsystem(winterFlowValidatorNetwork, this);
            WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
            if (WinterFlowOrchestrationSubsystem == winterFlowListenerJava) {
                return winterFlowListenerJava;
            }
        } else {
            if (i != 1) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
        }
        return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        WinterFlowHandlerInvoker winterFlowHandlerInvoker = this.WinterFlowThreadListener;
        float f = this.WinterFlowServiceUtility;
        return new WinterFlowScriptNode(this.WinterFlowResponseEngine, this.WinterFlowTransactionAgent, this.WinterFlowServerProtocol, winterFlowHandlerInvoker, f, (WinterFlowTransactionManagerLayer) obj).WinterFlowServiceUtility(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
    }
}
