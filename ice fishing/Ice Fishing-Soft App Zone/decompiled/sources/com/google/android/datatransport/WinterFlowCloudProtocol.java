package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCloudProtocol extends WinterFlowNodeInheritance implements WinterFlowControllerScript {
    public /* synthetic */ WinterFlowCacheInterface WinterFlowResponseEngine;
    public final /* synthetic */ WinterFlowEventEvent WinterFlowServerProtocol;
    public int WinterFlowSyntax;
    public /* synthetic */ Object WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowCloudProtocol(WinterFlowEventEvent winterFlowEventEvent, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(3, winterFlowTransactionManagerLayer);
        this.WinterFlowServerProtocol = winterFlowEventEvent;
    }

    @Override // com.google.android.datatransport.WinterFlowControllerScript
    public final Object WinterFlowArrayNetwork(Object obj, Object obj2, Object obj3) {
        WinterFlowCloudProtocol winterFlowCloudProtocol = new WinterFlowCloudProtocol(this.WinterFlowServerProtocol, (WinterFlowTransactionManagerLayer) obj3);
        winterFlowCloudProtocol.WinterFlowResponseEngine = (WinterFlowCacheInterface) obj;
        winterFlowCloudProtocol.WinterFlowTransactionAgent = obj2;
        return winterFlowCloudProtocol.WinterFlowServiceUtility(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r0.WinterFlowRouterRouter(r6, r5) == r4) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r6 == r4) goto L15;
     */
    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowServiceUtility(Object obj) {
        WinterFlowCacheInterface winterFlowCacheInterface;
        int i = this.WinterFlowSyntax;
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        if (i == 0) {
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
            winterFlowCacheInterface = this.WinterFlowResponseEngine;
            Object obj2 = this.WinterFlowTransactionAgent;
            this.WinterFlowResponseEngine = winterFlowCacheInterface;
            this.WinterFlowSyntax = 1;
            obj = this.WinterFlowServerProtocol.WinterFlowVariableVersionControl(obj2, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                }
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            winterFlowCacheInterface = this.WinterFlowResponseEngine;
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
        }
        this.WinterFlowResponseEngine = null;
        this.WinterFlowSyntax = 2;
    }
}
