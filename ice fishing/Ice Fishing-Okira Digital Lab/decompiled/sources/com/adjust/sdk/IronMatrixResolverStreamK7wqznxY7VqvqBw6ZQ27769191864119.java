package com.adjust.sdk;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class IronMatrixResolverStreamK7wqznxY7VqvqBw6ZQ27769191864119 implements IRunActivityHandler {
    public final /* synthetic */ ActivityHandler ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public IronMatrixResolverStreamK7wqznxY7VqvqBw6ZQ27769191864119(ActivityHandler activityHandler) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = activityHandler;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        AdjustConfig adjustConfig;
        adjustConfig = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.adjustConfig;
        activityHandler.lambda$setEnabled$5(adjustConfig.startEnabled.booleanValue());
    }
}
