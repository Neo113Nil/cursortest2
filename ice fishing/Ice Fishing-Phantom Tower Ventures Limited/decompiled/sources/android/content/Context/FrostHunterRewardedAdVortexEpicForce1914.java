package android.content.Context;

import java.util.Arrays;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterRewardedAdVortexEpicForce1914 {
    public int FrostHunterBundlePulseFusionHero2475;
    public int FrostHunterServiceEliteCelestialThunder1757;
    public final boolean FrostHunterAlphaAnimationNeoCosmos5761 = true;
    public final int FrostHunterConstraintSetCloneMasterUltraRogue2633 = 65536;
    public int FrostHunterLifecycleBlazeGammaElite2889 = 0;
    public FrostHunterVectorDrawableCompatSparkNeoNebula6539[] FrostHunterLevelListDrawableFusionDragonHero2232 = new FrostHunterVectorDrawableCompatSparkNeoNebula6539[100];

    public final synchronized FrostHunterVectorDrawableCompatSparkNeoNebula6539 FrostHunterAlphaAnimationNeoCosmos5761() {
        FrostHunterVectorDrawableCompatSparkNeoNebula6539 frostHunterVectorDrawableCompatSparkNeoNebula6539;
        try {
            int i = this.FrostHunterServiceEliteCelestialThunder1757 + 1;
            this.FrostHunterServiceEliteCelestialThunder1757 = i;
            int i2 = this.FrostHunterLifecycleBlazeGammaElite2889;
            if (i2 > 0) {
                FrostHunterVectorDrawableCompatSparkNeoNebula6539[] frostHunterVectorDrawableCompatSparkNeoNebula6539Arr = this.FrostHunterLevelListDrawableFusionDragonHero2232;
                int i3 = i2 - 1;
                this.FrostHunterLifecycleBlazeGammaElite2889 = i3;
                frostHunterVectorDrawableCompatSparkNeoNebula6539 = frostHunterVectorDrawableCompatSparkNeoNebula6539Arr[i3];
                frostHunterVectorDrawableCompatSparkNeoNebula6539.getClass();
                this.FrostHunterLevelListDrawableFusionDragonHero2232[this.FrostHunterLifecycleBlazeGammaElite2889] = null;
            } else {
                FrostHunterVectorDrawableCompatSparkNeoNebula6539 frostHunterVectorDrawableCompatSparkNeoNebula65392 = new FrostHunterVectorDrawableCompatSparkNeoNebula6539(new byte[this.FrostHunterConstraintSetCloneMasterUltraRogue2633], 0);
                FrostHunterVectorDrawableCompatSparkNeoNebula6539[] frostHunterVectorDrawableCompatSparkNeoNebula6539Arr2 = this.FrostHunterLevelListDrawableFusionDragonHero2232;
                if (i > frostHunterVectorDrawableCompatSparkNeoNebula6539Arr2.length) {
                    this.FrostHunterLevelListDrawableFusionDragonHero2232 = (FrostHunterVectorDrawableCompatSparkNeoNebula6539[]) Arrays.copyOf(frostHunterVectorDrawableCompatSparkNeoNebula6539Arr2, frostHunterVectorDrawableCompatSparkNeoNebula6539Arr2.length * 2);
                }
                frostHunterVectorDrawableCompatSparkNeoNebula6539 = frostHunterVectorDrawableCompatSparkNeoNebula65392;
            }
        } catch (Throwable th) {
            throw th;
        }
        return frostHunterVectorDrawableCompatSparkNeoNebula6539;
    }

    public final synchronized void FrostHunterBundlePulseFusionHero2475(int i) {
        boolean z = i < this.FrostHunterBundlePulseFusionHero2475;
        this.FrostHunterBundlePulseFusionHero2475 = i;
        if (z) {
            FrostHunterServiceEliteCelestialThunder1757();
        }
    }

    public final synchronized void FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterRewardedAdPrimeTurboEclipse6283 frostHunterRewardedAdPrimeTurboEclipse6283) {
        while (frostHunterRewardedAdPrimeTurboEclipse6283 != null) {
            FrostHunterVectorDrawableCompatSparkNeoNebula6539[] frostHunterVectorDrawableCompatSparkNeoNebula6539Arr = this.FrostHunterLevelListDrawableFusionDragonHero2232;
            int i = this.FrostHunterLifecycleBlazeGammaElite2889;
            this.FrostHunterLifecycleBlazeGammaElite2889 = i + 1;
            FrostHunterVectorDrawableCompatSparkNeoNebula6539 frostHunterVectorDrawableCompatSparkNeoNebula6539 = (FrostHunterVectorDrawableCompatSparkNeoNebula6539) frostHunterRewardedAdPrimeTurboEclipse6283.FrostHunterAlertDialogAuroraDelta3200;
            frostHunterVectorDrawableCompatSparkNeoNebula6539.getClass();
            frostHunterVectorDrawableCompatSparkNeoNebula6539Arr[i] = frostHunterVectorDrawableCompatSparkNeoNebula6539;
            this.FrostHunterServiceEliteCelestialThunder1757--;
            frostHunterRewardedAdPrimeTurboEclipse6283 = (FrostHunterRewardedAdPrimeTurboEclipse6283) frostHunterRewardedAdPrimeTurboEclipse6283.FrostHunterKeyframeGammaGamma1197;
            if (frostHunterRewardedAdPrimeTurboEclipse6283 == null || ((FrostHunterVectorDrawableCompatSparkNeoNebula6539) frostHunterRewardedAdPrimeTurboEclipse6283.FrostHunterAlertDialogAuroraDelta3200) == null) {
                frostHunterRewardedAdPrimeTurboEclipse6283 = null;
            }
        }
    }

    public final synchronized void FrostHunterServiceEliteCelestialThunder1757() {
        int max = Math.max(0, FrostHunterGyroscopeHeroAlpha1995.FrostHunterLifecycleBlazeGammaElite2889(this.FrostHunterBundlePulseFusionHero2475, this.FrostHunterConstraintSetCloneMasterUltraRogue2633) - this.FrostHunterServiceEliteCelestialThunder1757);
        int i = this.FrostHunterLifecycleBlazeGammaElite2889;
        if (max >= i) {
            return;
        }
        Arrays.fill(this.FrostHunterLevelListDrawableFusionDragonHero2232, max, i, (Object) null);
        this.FrostHunterLifecycleBlazeGammaElite2889 = max;
    }
}
