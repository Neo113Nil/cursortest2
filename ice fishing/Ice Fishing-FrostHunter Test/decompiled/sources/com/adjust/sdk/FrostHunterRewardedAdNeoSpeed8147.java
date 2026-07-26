package com.adjust.sdk;

import android.content.Context.FrostHunterKeyEventNovaXAlpha1220;
import java.util.ArrayList;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterRewardedAdNeoSpeed8147 {
    public final ActivityHandler FrostHunterAlphaAnimationNeoCosmos5761;
    public final ArrayList FrostHunterConstraintSetCloneMasterUltraRogue2633 = new ArrayList();
    public int FrostHunterBundlePulseFusionHero2475 = 0;

    public FrostHunterRewardedAdNeoSpeed8147(ActivityHandler activityHandler) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = activityHandler;
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761(Runnable runnable, String str) {
        if (this.FrostHunterBundlePulseFusionHero2475 != 3) {
            runnable.run();
        } else {
            this.FrostHunterAlphaAnimationNeoCosmos5761.getAdjustConfig().getLogger().debug(FrostHunterKeyEventNovaXAlpha1220.FrostHunterKeyframeGammaGamma1197("Enqueuing \"", str, "\" action to be executed after first session delay ends"), new Object[0]);
            this.FrostHunterConstraintSetCloneMasterUltraRogue2633.add(runnable);
        }
    }

    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633(String str, IRunActivityHandler iRunActivityHandler) {
        int i = this.FrostHunterBundlePulseFusionHero2475;
        ActivityHandler activityHandler = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (i != 3) {
            iRunActivityHandler.run(activityHandler);
        } else {
            activityHandler.getAdjustConfig().getLogger().debug(FrostHunterKeyEventNovaXAlpha1220.FrostHunterKeyframeGammaGamma1197("Enqueuing \"", str, "\" action to be executed after first session delay ends"), new Object[0]);
            activityHandler.getAdjustConfig().preLaunchActions.preLaunchActionsArray.add(iRunActivityHandler);
        }
    }
}
