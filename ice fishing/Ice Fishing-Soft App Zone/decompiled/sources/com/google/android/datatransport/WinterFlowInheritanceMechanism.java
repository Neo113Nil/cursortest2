package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowInheritanceMechanism extends WinterFlowDebugFramework implements WinterFlowObjectSession {
    public final /* synthetic */ int WinterFlowRouterRouter;
    public final /* synthetic */ int WinterFlowSyntax;
    public final /* synthetic */ WinterFlowViewTesting[] WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowUserManagerSyntax WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowInheritanceMechanism(WinterFlowViewTesting[] winterFlowViewTestingArr, WinterFlowUserManagerSyntax winterFlowUserManagerSyntax, int i, int i2) {
        super(1);
        this.WinterFlowTransactionManagerStrategy = winterFlowViewTestingArr;
        this.WinterFlowUnitTestResponse = winterFlowUserManagerSyntax;
        this.WinterFlowRouterRouter = i;
        this.WinterFlowSyntax = i2;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        WinterFlowDecoratorSessionManager winterFlowDecoratorSessionManager = (WinterFlowDecoratorSessionManager) obj;
        for (WinterFlowViewTesting winterFlowViewTesting : this.WinterFlowTransactionManagerStrategy) {
            if (winterFlowViewTesting != null) {
                long WinterFlowRouterStructure = this.WinterFlowUnitTestResponse.WinterFlowRouterStructure.WinterFlowHookDataSource.WinterFlowRouterStructure((winterFlowViewTesting.WinterFlowVariableVersionControl << 32) | (winterFlowViewTesting.WinterFlowTransactionManagerStrategy & 4294967295L), (this.WinterFlowRouterRouter << 32) | (this.WinterFlowSyntax & 4294967295L), WinterFlowCacheManagerConfiguration.WinterFlowVariableVersionControl);
                WinterFlowDecoratorSessionManager.WinterFlowSyntax(winterFlowDecoratorSessionManager, winterFlowViewTesting, (int) (WinterFlowRouterStructure >> 32), (int) (WinterFlowRouterStructure & 4294967295L));
            }
        }
        return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
    }
}
