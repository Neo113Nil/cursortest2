package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSchedulerGateway extends WinterFlowDebugFramework implements WinterFlowObjectUI {
    public final /* synthetic */ long WinterFlowRouterRouter;
    public final /* synthetic */ WinterFlowCacheManagerInvoker WinterFlowSyntax;
    public final /* synthetic */ WinterFlowRequestUtility WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ long WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowSchedulerGateway(WinterFlowRequestUtility winterFlowRequestUtility, long j, long j2, WinterFlowCacheManagerInvoker winterFlowCacheManagerInvoker) {
        super(0);
        this.WinterFlowTransactionManagerStrategy = winterFlowRequestUtility;
        this.WinterFlowUnitTestResponse = j;
        this.WinterFlowRouterRouter = j2;
        this.WinterFlowSyntax = winterFlowCacheManagerInvoker;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectUI
    public final Object WinterFlowRouterStructure() {
        WinterFlowRequestUtility winterFlowRequestUtility = this.WinterFlowTransactionManagerStrategy;
        winterFlowRequestUtility.WinterFlowTestingTransactionManager().WinterFlowVariableVersionControl = false;
        winterFlowRequestUtility.WinterFlowTestingTransactionManager().WinterFlowTransactionManagerStrategy = this.WinterFlowUnitTestResponse;
        winterFlowRequestUtility.WinterFlowTestingTransactionManager().WinterFlowUnitTestResponse = this.WinterFlowRouterRouter;
        WinterFlowObjectSession WinterFlowArrayNetwork = this.WinterFlowSyntax.WinterFlowVariableVersionControl.WinterFlowArrayNetwork();
        if (WinterFlowArrayNetwork != null) {
            WinterFlowArrayNetwork.WinterFlowUnitTestResponse(winterFlowRequestUtility.WinterFlowTestingTransactionManager());
        }
        return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
    }
}
