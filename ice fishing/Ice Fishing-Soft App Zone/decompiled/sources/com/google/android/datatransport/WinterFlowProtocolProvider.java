package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowProtocolProvider extends WinterFlowCompilerNode {
    public final /* synthetic */ WinterFlowProviderController WinterFlowRouterRouter;
    public final WinterFlowEventCloud WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowProtocolProvider(WinterFlowProviderController winterFlowProviderController, long j, WinterFlowEventCloud winterFlowEventCloud) {
        super(j);
        this.WinterFlowRouterRouter = winterFlowProviderController;
        this.WinterFlowUnitTestResponse = winterFlowEventCloud;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.WinterFlowUnitTestResponse.WinterFlowStrategyTool(this.WinterFlowRouterRouter);
    }

    @Override // com.google.android.datatransport.WinterFlowCompilerNode
    public final String toString() {
        return super.toString() + this.WinterFlowUnitTestResponse;
    }
}
