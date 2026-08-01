package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowControllerMicroservice extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public int WinterFlowResponseEngine;
    public final /* synthetic */ WinterFlowTransactionManagerService WinterFlowServerProtocol;
    public long WinterFlowSyntax;
    public /* synthetic */ long WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowControllerMicroservice(WinterFlowTransactionManagerService winterFlowTransactionManagerService, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowServerProtocol = winterFlowTransactionManagerService;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        WinterFlowControllerMicroservice winterFlowControllerMicroservice = new WinterFlowControllerMicroservice(this.WinterFlowServerProtocol, winterFlowTransactionManagerLayer);
        winterFlowControllerMicroservice.WinterFlowTransactionAgent = ((WinterFlowXMLNetwork) obj).WinterFlowRouterStructure;
        return winterFlowControllerMicroservice;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        if (r15 == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowServiceUtility(Object obj) {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.WinterFlowResponseEngine;
        WinterFlowTransactionManagerService winterFlowTransactionManagerService = this.WinterFlowServerProtocol;
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        if (i == 0) {
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
            j = this.WinterFlowTransactionAgent;
            WinterFlowDebugEvent winterFlowDebugEvent = winterFlowTransactionManagerService.WinterFlowTransactionManagerStrategy;
            this.WinterFlowTransactionAgent = j;
            this.WinterFlowResponseEngine = 1;
            obj = winterFlowDebugEvent.WinterFlowHookDataSource(j, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j4 = this.WinterFlowSyntax;
                    j3 = this.WinterFlowTransactionAgent;
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    return new WinterFlowXMLNetwork(WinterFlowXMLNetwork.WinterFlowArrayNetwork(j3, WinterFlowXMLNetwork.WinterFlowArrayNetwork(j4, ((WinterFlowXMLNetwork) obj).WinterFlowRouterStructure)));
                }
                j2 = this.WinterFlowSyntax;
                j = this.WinterFlowTransactionAgent;
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                long j5 = ((WinterFlowXMLNetwork) obj).WinterFlowRouterStructure;
                WinterFlowDebugEvent winterFlowDebugEvent2 = winterFlowTransactionManagerService.WinterFlowTransactionManagerStrategy;
                long WinterFlowArrayNetwork = WinterFlowXMLNetwork.WinterFlowArrayNetwork(j2, j5);
                this.WinterFlowTransactionAgent = j;
                this.WinterFlowSyntax = j5;
                this.WinterFlowResponseEngine = 3;
                obj = winterFlowDebugEvent2.WinterFlowRouterStructure(WinterFlowArrayNetwork, j5, this);
                if (obj != winterFlowListenerJava) {
                    j3 = j;
                    j4 = j5;
                    return new WinterFlowXMLNetwork(WinterFlowXMLNetwork.WinterFlowArrayNetwork(j3, WinterFlowXMLNetwork.WinterFlowArrayNetwork(j4, ((WinterFlowXMLNetwork) obj).WinterFlowRouterStructure)));
                }
                return winterFlowListenerJava;
            }
            j = this.WinterFlowTransactionAgent;
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
        }
        long WinterFlowArrayNetwork2 = WinterFlowXMLNetwork.WinterFlowArrayNetwork(j, ((WinterFlowXMLNetwork) obj).WinterFlowRouterStructure);
        this.WinterFlowTransactionAgent = j;
        this.WinterFlowSyntax = WinterFlowArrayNetwork2;
        this.WinterFlowResponseEngine = 2;
        obj = winterFlowTransactionManagerService.WinterFlowRouterStructure(WinterFlowArrayNetwork2, this);
        if (obj != winterFlowListenerJava) {
            j2 = WinterFlowArrayNetwork2;
            long j52 = ((WinterFlowXMLNetwork) obj).WinterFlowRouterStructure;
            WinterFlowDebugEvent winterFlowDebugEvent22 = winterFlowTransactionManagerService.WinterFlowTransactionManagerStrategy;
            long WinterFlowArrayNetwork3 = WinterFlowXMLNetwork.WinterFlowArrayNetwork(j2, j52);
            this.WinterFlowTransactionAgent = j;
            this.WinterFlowSyntax = j52;
            this.WinterFlowResponseEngine = 3;
            obj = winterFlowDebugEvent22.WinterFlowRouterStructure(WinterFlowArrayNetwork3, j52, this);
            if (obj != winterFlowListenerJava) {
            }
        }
        return winterFlowListenerJava;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        long j = ((WinterFlowXMLNetwork) obj).WinterFlowRouterStructure;
        WinterFlowControllerMicroservice winterFlowControllerMicroservice = new WinterFlowControllerMicroservice(this.WinterFlowServerProtocol, (WinterFlowTransactionManagerLayer) obj2);
        winterFlowControllerMicroservice.WinterFlowTransactionAgent = j;
        return winterFlowControllerMicroservice.WinterFlowServiceUtility(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
    }
}
