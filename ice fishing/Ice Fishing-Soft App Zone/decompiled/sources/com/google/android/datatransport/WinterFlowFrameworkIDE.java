package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowFrameworkIDE extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public final /* synthetic */ WinterFlowBandwidthInterface WinterFlowBandwidthObject;
    public final /* synthetic */ long WinterFlowOrchestrationSubsystem;
    public WinterFlowBandwidthInterface WinterFlowResponseEngine;
    public int WinterFlowServerProtocol;
    public final /* synthetic */ WinterFlowTransactionManagerService WinterFlowServiceUtility;
    public WinterFlowTransactionManagerService WinterFlowSyntax;
    public /* synthetic */ Object WinterFlowThreadListener;
    public long WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowFrameworkIDE(WinterFlowTransactionManagerService winterFlowTransactionManagerService, WinterFlowBandwidthInterface winterFlowBandwidthInterface, long j, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowServiceUtility = winterFlowTransactionManagerService;
        this.WinterFlowBandwidthObject = winterFlowBandwidthInterface;
        this.WinterFlowOrchestrationSubsystem = j;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        WinterFlowFrameworkIDE winterFlowFrameworkIDE = new WinterFlowFrameworkIDE(this.WinterFlowServiceUtility, this.WinterFlowBandwidthObject, this.WinterFlowOrchestrationSubsystem, winterFlowTransactionManagerLayer);
        winterFlowFrameworkIDE.WinterFlowThreadListener = obj;
        return winterFlowFrameworkIDE;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        WinterFlowTransactionManagerService winterFlowTransactionManagerService;
        WinterFlowBandwidthInterface winterFlowBandwidthInterface;
        WinterFlowTransactionManagerService winterFlowTransactionManagerService2;
        long j;
        int i = this.WinterFlowServerProtocol;
        WinterFlowBackendBatch winterFlowBackendBatch = WinterFlowBackendBatch.WinterFlowTransactionManagerStrategy;
        if (i == 0) {
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
            WinterFlowRendererClass winterFlowRendererClass = (WinterFlowRendererClass) this.WinterFlowThreadListener;
            winterFlowTransactionManagerService = this.WinterFlowServiceUtility;
            WinterFlowInterface winterFlowInterface = new WinterFlowInterface(winterFlowTransactionManagerService, winterFlowRendererClass);
            WinterFlowNetworkWidget winterFlowNetworkWidget = winterFlowTransactionManagerService.WinterFlowCacheManagerAgent;
            winterFlowBandwidthInterface = this.WinterFlowBandwidthObject;
            long j2 = winterFlowBandwidthInterface.WinterFlowVariableVersionControl;
            WinterFlowBackendBatch winterFlowBackendBatch2 = winterFlowTransactionManagerService.WinterFlowArrayNetwork;
            long j3 = this.WinterFlowOrchestrationSubsystem;
            float WinterFlowArrayNetwork = winterFlowTransactionManagerService.WinterFlowArrayNetwork(winterFlowBackendBatch2 == winterFlowBackendBatch ? WinterFlowXMLNetwork.WinterFlowHookDataSource(j3) : WinterFlowXMLNetwork.WinterFlowCacheManagerAgent(j3));
            this.WinterFlowThreadListener = winterFlowTransactionManagerService;
            this.WinterFlowSyntax = winterFlowTransactionManagerService;
            this.WinterFlowResponseEngine = winterFlowBandwidthInterface;
            this.WinterFlowTransactionAgent = j2;
            this.WinterFlowServerProtocol = 1;
            winterFlowNetworkWidget.getClass();
            obj = WinterFlowCacheRuntime.WinterFlowModuleAgent(winterFlowNetworkWidget.WinterFlowHookDataSource, new WinterFlowQueueEventEmitter(WinterFlowArrayNetwork, winterFlowNetworkWidget, winterFlowInterface, null), this);
            WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
            if (obj == winterFlowListenerJava) {
                return winterFlowListenerJava;
            }
            winterFlowTransactionManagerService2 = winterFlowTransactionManagerService;
            j = j2;
        } else {
            if (i != 1) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.WinterFlowTransactionAgent;
            winterFlowBandwidthInterface = this.WinterFlowResponseEngine;
            winterFlowTransactionManagerService = this.WinterFlowSyntax;
            winterFlowTransactionManagerService2 = (WinterFlowTransactionManagerService) this.WinterFlowThreadListener;
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
        }
        float WinterFlowArrayNetwork2 = winterFlowTransactionManagerService2.WinterFlowArrayNetwork(((Number) obj).floatValue());
        winterFlowBandwidthInterface.WinterFlowVariableVersionControl = winterFlowTransactionManagerService.WinterFlowArrayNetwork == winterFlowBackendBatch ? WinterFlowXMLNetwork.WinterFlowRouterStructure(j, WinterFlowArrayNetwork2, 0.0f, 2) : WinterFlowXMLNetwork.WinterFlowRouterStructure(j, 0.0f, WinterFlowArrayNetwork2, 1);
        return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        return ((WinterFlowFrameworkIDE) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowRendererClass) obj)).WinterFlowServiceUtility(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
    }
}
