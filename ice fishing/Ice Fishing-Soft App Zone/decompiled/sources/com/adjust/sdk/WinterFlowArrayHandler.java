package com.adjust.sdk;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowArrayHandler implements IRunActivityHandler {
    public final /* synthetic */ ActivityHandler WinterFlowRouterStructure;

    public WinterFlowArrayHandler(ActivityHandler activityHandler) {
        this.WinterFlowRouterStructure = activityHandler;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        AdjustConfig adjustConfig;
        adjustConfig = this.WinterFlowRouterStructure.adjustConfig;
        activityHandler.lambda$setEnabled$5(adjustConfig.startEnabled.booleanValue());
    }
}
