package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowMiddlewareHandler extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public final /* synthetic */ WinterFlowConsumerBandwidth WinterFlowBandwidthObject;
    public /* synthetic */ Object WinterFlowResponseEngine;
    public final /* synthetic */ WinterFlowSyntaxFramework WinterFlowServerProtocol;
    public final /* synthetic */ long WinterFlowServiceUtility;
    public int WinterFlowSyntax;
    public final /* synthetic */ WinterFlowInvokerRuntime WinterFlowThreadListener;
    public final /* synthetic */ WinterFlowJSONRepository WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowMiddlewareHandler(WinterFlowJSONRepository winterFlowJSONRepository, WinterFlowSyntaxFramework winterFlowSyntaxFramework, WinterFlowInvokerRuntime winterFlowInvokerRuntime, long j, WinterFlowConsumerBandwidth winterFlowConsumerBandwidth, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowTransactionAgent = winterFlowJSONRepository;
        this.WinterFlowServerProtocol = winterFlowSyntaxFramework;
        this.WinterFlowThreadListener = winterFlowInvokerRuntime;
        this.WinterFlowServiceUtility = j;
        this.WinterFlowBandwidthObject = winterFlowConsumerBandwidth;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        WinterFlowMiddlewareHandler winterFlowMiddlewareHandler = new WinterFlowMiddlewareHandler(this.WinterFlowTransactionAgent, this.WinterFlowServerProtocol, this.WinterFlowThreadListener, this.WinterFlowServiceUtility, this.WinterFlowBandwidthObject, winterFlowTransactionManagerLayer);
        winterFlowMiddlewareHandler.WinterFlowResponseEngine = obj;
        return winterFlowMiddlewareHandler;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        int i = this.WinterFlowSyntax;
        if (i == 0) {
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
            WinterFlowRendererClass winterFlowRendererClass = (WinterFlowRendererClass) this.WinterFlowResponseEngine;
            long j = this.WinterFlowServiceUtility;
            WinterFlowSyntaxFramework winterFlowSyntaxFramework = this.WinterFlowServerProtocol;
            WinterFlowInvokerRuntime winterFlowInvokerRuntime = this.WinterFlowThreadListener;
            float WinterFlowValidatorNetwork = winterFlowSyntaxFramework.WinterFlowValidatorNetwork(winterFlowInvokerRuntime, j);
            WinterFlowJSONRepository winterFlowJSONRepository = this.WinterFlowTransactionAgent;
            winterFlowJSONRepository.WinterFlowVariableVersionControl = WinterFlowValidatorNetwork;
            WinterFlowUserManagerModule winterFlowUserManagerModule = new WinterFlowUserManagerModule(winterFlowSyntaxFramework, winterFlowJSONRepository, this.WinterFlowBandwidthObject, winterFlowRendererClass);
            WinterFlowRouterHelper winterFlowRouterHelper = new WinterFlowRouterHelper(winterFlowSyntaxFramework, winterFlowJSONRepository, winterFlowInvokerRuntime, 2);
            this.WinterFlowSyntax = 1;
            Object WinterFlowRouterStructure = winterFlowJSONRepository.WinterFlowRouterStructure(winterFlowUserManagerModule, winterFlowRouterHelper, this);
            WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
            if (WinterFlowRouterStructure == winterFlowListenerJava) {
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

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        return ((WinterFlowMiddlewareHandler) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowRendererClass) obj)).WinterFlowServiceUtility(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
    }
}
