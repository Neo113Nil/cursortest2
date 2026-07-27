package com.adjust.sdk;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterAdapterDelegateNebulaRogue3354 implements IRunActivityHandler {
    public final /* synthetic */ ActivityHandler FrostHunterAlphaAnimationNeoCosmos5761;

    public FrostHunterAdapterDelegateNebulaRogue3354(ActivityHandler activityHandler) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = activityHandler;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        AdjustConfig adjustConfig;
        adjustConfig = this.FrostHunterAlphaAnimationNeoCosmos5761.adjustConfig;
        activityHandler.lambda$setEnabled$5(adjustConfig.startEnabled.booleanValue());
    }
}
