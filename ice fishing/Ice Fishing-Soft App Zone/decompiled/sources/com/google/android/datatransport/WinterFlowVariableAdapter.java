package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowVariableAdapter extends WinterFlowNodeInheritance implements WinterFlowControllerScript {
    public /* synthetic */ WinterFlowCacheInterface WinterFlowResponseEngine;
    public final /* synthetic */ WinterFlowLibraryAdapter WinterFlowServerProtocol;
    public int WinterFlowSyntax;
    public /* synthetic */ int WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowVariableAdapter(WinterFlowLibraryAdapter winterFlowLibraryAdapter, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(3, winterFlowTransactionManagerLayer);
        this.WinterFlowServerProtocol = winterFlowLibraryAdapter;
    }

    @Override // com.google.android.datatransport.WinterFlowControllerScript
    public final Object WinterFlowArrayNetwork(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        WinterFlowVariableAdapter winterFlowVariableAdapter = new WinterFlowVariableAdapter(this.WinterFlowServerProtocol, (WinterFlowTransactionManagerLayer) obj3);
        winterFlowVariableAdapter.WinterFlowResponseEngine = (WinterFlowCacheInterface) obj;
        winterFlowVariableAdapter.WinterFlowTransactionAgent = intValue;
        return winterFlowVariableAdapter.WinterFlowServiceUtility(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x007b, code lost:
    
        if (r0.WinterFlowRouterRouter(com.google.android.datatransport.WinterFlowTransactionManagerXML.WinterFlowUnitTestResponse, r8) == r7) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        if (com.google.android.datatransport.WinterFlowManagerRequest.WinterFlowSerializerStructure(Long.MAX_VALUE, r8) == r7) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r0.WinterFlowRouterRouter(com.google.android.datatransport.WinterFlowTransactionManagerXML.WinterFlowTransactionManagerStrategy, r8) == r7) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
    
        if (r0.WinterFlowRouterRouter(com.google.android.datatransport.WinterFlowTransactionManagerXML.WinterFlowVariableVersionControl, r8) == r7) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
    
        if (com.google.android.datatransport.WinterFlowManagerRequest.WinterFlowSerializerStructure(0, r8) == r7) goto L32;
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
            if (this.WinterFlowTransactionAgent > 0) {
                this.WinterFlowSyntax = 1;
            } else {
                this.WinterFlowResponseEngine = winterFlowCacheInterface;
                this.WinterFlowSyntax = 2;
            }
            return winterFlowListenerJava;
        }
        if (i != 1) {
            if (i == 2) {
                winterFlowCacheInterface = this.WinterFlowResponseEngine;
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                this.WinterFlowResponseEngine = winterFlowCacheInterface;
                this.WinterFlowSyntax = 3;
            } else if (i == 3) {
                winterFlowCacheInterface = this.WinterFlowResponseEngine;
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                this.WinterFlowResponseEngine = winterFlowCacheInterface;
                this.WinterFlowSyntax = 4;
            } else if (i == 4) {
                winterFlowCacheInterface = this.WinterFlowResponseEngine;
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                this.WinterFlowResponseEngine = null;
                this.WinterFlowSyntax = 5;
            } else if (i != 5) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
        return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
    }
}
