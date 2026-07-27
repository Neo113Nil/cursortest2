package android.content.Context;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterGuidelineUltraThunderTitanium6483 {
    public final long FrostHunterAlphaAnimationNeoCosmos5761;
    public final FrostHunterKaptHyperionCyberCyber7632 FrostHunterBundlePulseFusionHero2475;
    public final FrostHunterApplicationInfoUltraInfernoSpectra4401 FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final ConcurrentLinkedQueue FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterGuidelineUltraThunderTitanium6483(FrostHunterCoroutineScopeBetaMasterRogue7248 frostHunterCoroutineScopeBetaMasterRogue7248) {
        frostHunterCoroutineScopeBetaMasterRogue7248.getClass();
        TimeUnit.MINUTES.getClass();
        this.FrostHunterAlphaAnimationNeoCosmos5761 = 300000000000L;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterCoroutineScopeBetaMasterRogue7248.FrostHunterServiceEliteCelestialThunder1757();
        this.FrostHunterBundlePulseFusionHero2475 = new FrostHunterKaptHyperionCyberCyber7632(this, FrostHunterKeyEventNovaXAlpha1220.FrostHunterFragmentBetaMegaVortex6025(new StringBuilder(), FrostHunterTextureViewForceEpicQuantum6388.FrostHunterConstraintSetCloneMasterUltraRogue2633, " ConnectionPool connection closer"));
        this.FrostHunterServiceEliteCelestialThunder1757 = new ConcurrentLinkedQueue();
    }

    public final int FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterButtonBlazeOmegaVortex4430 frostHunterButtonBlazeOmegaVortex4430, long j) {
        TimeZone timeZone = FrostHunterTextureViewForceEpicQuantum6388.FrostHunterAlphaAnimationNeoCosmos5761;
        ArrayList arrayList = frostHunterButtonBlazeOmegaVortex4430.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + frostHunterButtonBlazeOmegaVortex4430.FrostHunterBundlePulseFusionHero2475.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterCameraXPixelTurboCosmos9814 + " was leaked. Did you forget to close a response body?";
                FrostHunterJavaBetaCosmos7744 frostHunterJavaBetaCosmos7744 = FrostHunterJavaBetaCosmos7744.FrostHunterAlphaAnimationNeoCosmos5761;
                FrostHunterJavaBetaCosmos7744.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlertDialogAuroraDelta3200(((FrostHunterCoordinatorLayoutDragonQuantumEpic7212) reference).FrostHunterAlphaAnimationNeoCosmos5761, str);
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    frostHunterButtonBlazeOmegaVortex4430.FrostHunterLintTitanVortexQuantum9911 = j - this.FrostHunterAlphaAnimationNeoCosmos5761;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
