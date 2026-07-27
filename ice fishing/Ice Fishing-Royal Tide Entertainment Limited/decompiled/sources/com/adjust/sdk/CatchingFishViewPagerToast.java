package com.adjust.sdk;

/* loaded from: classes.dex */
public final class CatchingFishViewPagerToast implements IRunActivityHandler {
    public final /* synthetic */ ActivityHandler CatchingFishParcelableFAB;

    public CatchingFishViewPagerToast(ActivityHandler activityHandler) {
        this.CatchingFishParcelableFAB = activityHandler;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        AdjustConfig adjustConfig;
        adjustConfig = this.CatchingFishParcelableFAB.adjustConfig;
        activityHandler.lambda$setEnabled$5(adjustConfig.startEnabled.booleanValue());
    }
}
