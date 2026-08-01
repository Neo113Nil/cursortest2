package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowInterface implements WinterFlowServiceProviderStructure {
    public final /* synthetic */ WinterFlowRendererClass WinterFlowHookDataSource;
    public final /* synthetic */ WinterFlowTransactionManagerService WinterFlowRouterStructure;

    public WinterFlowInterface(WinterFlowTransactionManagerService winterFlowTransactionManagerService, WinterFlowRendererClass winterFlowRendererClass) {
        this.WinterFlowRouterStructure = winterFlowTransactionManagerService;
        this.WinterFlowHookDataSource = winterFlowRendererClass;
    }

    @Override // com.google.android.datatransport.WinterFlowServiceProviderStructure
    public final float WinterFlowRouterStructure(float f) {
        float abs = Math.abs(f);
        WinterFlowTransactionManagerService winterFlowTransactionManagerService = this.WinterFlowRouterStructure;
        if (abs != 0.0f && !((Boolean) winterFlowTransactionManagerService.WinterFlowRouterRouter.WinterFlowRouterStructure()).booleanValue()) {
            throw new WinterFlowMicroserviceCacheManager("The fling animation was cancelled", 0);
        }
        return winterFlowTransactionManagerService.WinterFlowArrayNetwork(winterFlowTransactionManagerService.WinterFlowUnitTestResponse(this.WinterFlowHookDataSource.WinterFlowRouterStructure(2, winterFlowTransactionManagerService.WinterFlowVariableVersionControl(winterFlowTransactionManagerService.WinterFlowRouterRouter(f)))));
    }
}
