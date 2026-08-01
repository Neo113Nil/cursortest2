package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowValidatorNetwork extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public final /* synthetic */ float WinterFlowBandwidthObject;
    public /* synthetic */ Object WinterFlowResponseEngine;
    public final /* synthetic */ Object WinterFlowServerProtocol;
    public final /* synthetic */ WinterFlowHandlerInvoker WinterFlowServiceUtility;
    public int WinterFlowSyntax;
    public final /* synthetic */ WinterFlowCacheManagerMicroservice WinterFlowThreadListener;
    public final /* synthetic */ Object WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowValidatorNetwork(Object obj, Object obj2, WinterFlowCacheManagerMicroservice winterFlowCacheManagerMicroservice, WinterFlowHandlerInvoker winterFlowHandlerInvoker, float f, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowTransactionAgent = obj;
        this.WinterFlowServerProtocol = obj2;
        this.WinterFlowThreadListener = winterFlowCacheManagerMicroservice;
        this.WinterFlowServiceUtility = winterFlowHandlerInvoker;
        this.WinterFlowBandwidthObject = f;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        WinterFlowValidatorNetwork winterFlowValidatorNetwork = new WinterFlowValidatorNetwork(this.WinterFlowTransactionAgent, this.WinterFlowServerProtocol, this.WinterFlowThreadListener, this.WinterFlowServiceUtility, this.WinterFlowBandwidthObject, winterFlowTransactionManagerLayer);
        winterFlowValidatorNetwork.WinterFlowResponseEngine = obj;
        return winterFlowValidatorNetwork;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        int i = this.WinterFlowSyntax;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer = null;
        WinterFlowCacheManagerMicroservice winterFlowCacheManagerMicroservice = this.WinterFlowThreadListener;
        if (i == 0) {
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
            WinterFlowAdapterResponse winterFlowAdapterResponse = (WinterFlowAdapterResponse) this.WinterFlowResponseEngine;
            Object obj2 = this.WinterFlowTransactionAgent;
            Object obj3 = this.WinterFlowServerProtocol;
            if (WinterFlowManagerRequest.WinterFlowThreadListener(obj2, obj3)) {
                winterFlowCacheManagerMicroservice.WinterFlowBandwidthObject = null;
                if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowCacheManagerMicroservice.WinterFlowCacheManagerAgent.getValue(), obj2)) {
                    return winterFlowAlgorithmSession;
                }
            } else {
                winterFlowCacheManagerMicroservice.WinterFlowArrayHelper();
            }
            boolean WinterFlowThreadListener = WinterFlowManagerRequest.WinterFlowThreadListener(obj2, obj3);
            float f = this.WinterFlowBandwidthObject;
            if (!WinterFlowThreadListener) {
                WinterFlowHandlerInvoker winterFlowHandlerInvoker = this.WinterFlowServiceUtility;
                winterFlowHandlerInvoker.WinterFlowOrchestrationSubsystem(obj2);
                winterFlowHandlerInvoker.WinterFlowServiceUtility(0L);
                winterFlowCacheManagerMicroservice.WinterFlowHookDataSource.setValue(obj2);
                winterFlowHandlerInvoker.WinterFlowResponseEngine(f);
            }
            winterFlowCacheManagerMicroservice.WinterFlowPackageIDE(f);
            if (winterFlowCacheManagerMicroservice.WinterFlowServiceUtility.WinterFlowSyntax()) {
                WinterFlowCacheRuntime.WinterFlowStrategyTool(winterFlowAdapterResponse, null, new WinterFlowGatewayWorker(winterFlowCacheManagerMicroservice, winterFlowTransactionManagerLayer, 11), 3);
            } else {
                winterFlowCacheManagerMicroservice.WinterFlowThreadListener = Long.MIN_VALUE;
            }
            this.WinterFlowSyntax = 1;
            Object WinterFlowSoftwareEngine = winterFlowCacheManagerMicroservice.WinterFlowSoftwareEngine(this);
            WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
            if (WinterFlowSoftwareEngine == winterFlowListenerJava) {
                return winterFlowListenerJava;
            }
        } else {
            if (i != 1) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
        }
        winterFlowCacheManagerMicroservice.WinterFlowCacheManagerListener();
        return winterFlowAlgorithmSession;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        return ((WinterFlowValidatorNetwork) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
    }
}
