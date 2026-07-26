package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterKaptHyperionCyberCyber7632 extends FrostHunterCoroutineScopeQuantumGamma5505 {
    public final /* synthetic */ Object FrostHunterLevelListDrawableFusionDragonHero2232;
    public final /* synthetic */ int FrostHunterLifecycleBlazeGammaElite2889 = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrostHunterKaptHyperionCyberCyber7632(FrostHunterMagnetometerTitaniumCyber5302 frostHunterMagnetometerTitaniumCyber5302) {
        super(FrostHunterKeyEventNovaXAlpha1220.FrostHunterFragmentBetaMegaVortex6025(new StringBuilder(), frostHunterMagnetometerTitaniumCyber5302.FrostHunterServiceConnectionTurboPhoenixOmega6719, " writer"), true);
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = frostHunterMagnetometerTitaniumCyber5302;
    }

    @Override // android.content.Context.FrostHunterCoroutineScopeQuantumGamma5505
    public final long FrostHunterAlphaAnimationNeoCosmos5761() {
        switch (this.FrostHunterLifecycleBlazeGammaElite2889) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                FrostHunterGuidelineUltraThunderTitanium6483 frostHunterGuidelineUltraThunderTitanium6483 = (FrostHunterGuidelineUltraThunderTitanium6483) this.FrostHunterLevelListDrawableFusionDragonHero2232;
                long nanoTime = System.nanoTime();
                long j = (nanoTime - frostHunterGuidelineUltraThunderTitanium6483.FrostHunterAlphaAnimationNeoCosmos5761) + 1;
                Iterator it = frostHunterGuidelineUltraThunderTitanium6483.FrostHunterServiceEliteCelestialThunder1757.iterator();
                it.getClass();
                FrostHunterButtonBlazeOmegaVortex4430 frostHunterButtonBlazeOmegaVortex4430 = null;
                long j2 = Long.MAX_VALUE;
                int i = 0;
                FrostHunterButtonBlazeOmegaVortex4430 frostHunterButtonBlazeOmegaVortex44302 = null;
                FrostHunterButtonBlazeOmegaVortex4430 frostHunterButtonBlazeOmegaVortex44303 = null;
                int i2 = 0;
                while (it.hasNext()) {
                    FrostHunterButtonBlazeOmegaVortex4430 frostHunterButtonBlazeOmegaVortex44304 = (FrostHunterButtonBlazeOmegaVortex4430) it.next();
                    frostHunterButtonBlazeOmegaVortex44304.getClass();
                    synchronized (frostHunterButtonBlazeOmegaVortex44304) {
                        if (frostHunterGuidelineUltraThunderTitanium6483.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterButtonBlazeOmegaVortex44304, nanoTime) > 0) {
                            i2++;
                        } else {
                            long j3 = frostHunterButtonBlazeOmegaVortex44304.FrostHunterLintTitanVortexQuantum9911;
                            if (j3 < j) {
                                frostHunterButtonBlazeOmegaVortex44302 = frostHunterButtonBlazeOmegaVortex44304;
                                j = j3;
                            }
                            i++;
                            if (j3 < j2) {
                                frostHunterButtonBlazeOmegaVortex44303 = frostHunterButtonBlazeOmegaVortex44304;
                                j2 = j3;
                            }
                        }
                    }
                }
                if (frostHunterButtonBlazeOmegaVortex44302 != null) {
                    frostHunterButtonBlazeOmegaVortex4430 = frostHunterButtonBlazeOmegaVortex44302;
                } else if (i > 5) {
                    j = j2;
                    frostHunterButtonBlazeOmegaVortex4430 = frostHunterButtonBlazeOmegaVortex44303;
                } else {
                    j = -1;
                }
                if (frostHunterButtonBlazeOmegaVortex4430 == null) {
                    if (frostHunterButtonBlazeOmegaVortex44303 != null) {
                        return (j2 + frostHunterGuidelineUltraThunderTitanium6483.FrostHunterAlphaAnimationNeoCosmos5761) - nanoTime;
                    }
                    if (i2 > 0) {
                        return frostHunterGuidelineUltraThunderTitanium6483.FrostHunterAlphaAnimationNeoCosmos5761;
                    }
                    return -1L;
                }
                synchronized (frostHunterButtonBlazeOmegaVortex4430) {
                    if (frostHunterButtonBlazeOmegaVortex4430.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.isEmpty() && frostHunterButtonBlazeOmegaVortex4430.FrostHunterLintTitanVortexQuantum9911 == j) {
                        frostHunterButtonBlazeOmegaVortex4430.FrostHunterAlertDialogAuroraDelta3200 = true;
                        frostHunterGuidelineUltraThunderTitanium6483.FrostHunterServiceEliteCelestialThunder1757.remove(frostHunterButtonBlazeOmegaVortex4430);
                        FrostHunterTextureViewForceEpicQuantum6388.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterButtonBlazeOmegaVortex4430.FrostHunterLifecycleBlazeGammaElite2889);
                        if (frostHunterGuidelineUltraThunderTitanium6483.FrostHunterServiceEliteCelestialThunder1757.isEmpty()) {
                            FrostHunterApplicationInfoUltraInfernoSpectra4401 frostHunterApplicationInfoUltraInfernoSpectra4401 = frostHunterGuidelineUltraThunderTitanium6483.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                            synchronized (frostHunterApplicationInfoUltraInfernoSpectra4401.FrostHunterAlphaAnimationNeoCosmos5761) {
                                if (frostHunterApplicationInfoUltraInfernoSpectra4401.FrostHunterAlphaAnimationNeoCosmos5761()) {
                                    frostHunterApplicationInfoUltraInfernoSpectra4401.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterBundlePulseFusionHero2475(frostHunterApplicationInfoUltraInfernoSpectra4401);
                                }
                            }
                        }
                    }
                }
                return 0L;
            default:
                FrostHunterMagnetometerTitaniumCyber5302 frostHunterMagnetometerTitaniumCyber5302 = (FrostHunterMagnetometerTitaniumCyber5302) this.FrostHunterLevelListDrawableFusionDragonHero2232;
                try {
                } catch (IOException e) {
                    FrostHunterMagnetometerTitaniumCyber5302.FrostHunterBundlePulseFusionHero2475(frostHunterMagnetometerTitaniumCyber5302, e, 2);
                }
                return frostHunterMagnetometerTitaniumCyber5302.FrostHunterLevelListDrawableFusionDragonHero2232() ? 0L : -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrostHunterKaptHyperionCyberCyber7632(FrostHunterGuidelineUltraThunderTitanium6483 frostHunterGuidelineUltraThunderTitanium6483, String str) {
        super(str, true);
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = frostHunterGuidelineUltraThunderTitanium6483;
    }
}
