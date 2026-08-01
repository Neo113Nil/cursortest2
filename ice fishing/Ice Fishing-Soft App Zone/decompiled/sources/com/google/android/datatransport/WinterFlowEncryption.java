package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowEncryption extends WinterFlowDebugFramework implements WinterFlowObjectUI {
    public final /* synthetic */ String WinterFlowRouterRouter;
    public final /* synthetic */ boolean WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowAlgorithmArray WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowEncryption(boolean z, WinterFlowAlgorithmArray winterFlowAlgorithmArray, String str) {
        super(0);
        this.WinterFlowTransactionManagerStrategy = z;
        this.WinterFlowUnitTestResponse = winterFlowAlgorithmArray;
        this.WinterFlowRouterRouter = str;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectUI
    public final Object WinterFlowRouterStructure() {
        if (this.WinterFlowTransactionManagerStrategy) {
            WinterFlowAlgorithmArray winterFlowAlgorithmArray = this.WinterFlowUnitTestResponse;
            String str = this.WinterFlowRouterRouter;
            WinterFlowNodeGateway winterFlowNodeGateway = (WinterFlowNodeGateway) winterFlowAlgorithmArray.WinterFlowTransactionManagerStrategy;
            synchronized (winterFlowNodeGateway.WinterFlowCacheManagerAgent) {
            }
        }
        return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
    }
}
