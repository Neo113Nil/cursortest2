package android.content.Context;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterInstrumentationShadowForce8558 extends WindowInsetsAnimation$Callback {
    public final FrostHunterToastMasterCelestialAurora2505 FrostHunterAlphaAnimationNeoCosmos5761;
    public ArrayList FrostHunterBundlePulseFusionHero2475;
    public List FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final HashMap FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterInstrumentationShadowForce8558(FrostHunterToastMasterCelestialAurora2505 frostHunterToastMasterCelestialAurora2505) {
        super(frostHunterToastMasterCelestialAurora2505.FrostHunterCameraXPixelTurboCosmos9814);
        this.FrostHunterServiceEliteCelestialThunder1757 = new HashMap();
        this.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterToastMasterCelestialAurora2505;
    }

    public final FrostHunterTransitionCelestialOmega6993 FrostHunterAlphaAnimationNeoCosmos5761(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap hashMap = this.FrostHunterServiceEliteCelestialThunder1757;
        FrostHunterTransitionCelestialOmega6993 frostHunterTransitionCelestialOmega6993 = (FrostHunterTransitionCelestialOmega6993) hashMap.get(windowInsetsAnimation);
        if (frostHunterTransitionCelestialOmega6993 != null) {
            return frostHunterTransitionCelestialOmega6993;
        }
        FrostHunterTransitionCelestialOmega6993 frostHunterTransitionCelestialOmega69932 = new FrostHunterTransitionCelestialOmega6993(0, null, 0L);
        frostHunterTransitionCelestialOmega69932.FrostHunterAlphaAnimationNeoCosmos5761 = new FrostHunterFirebaseModelInterpreterSolarPulse4566(windowInsetsAnimation);
        hashMap.put(windowInsetsAnimation, frostHunterTransitionCelestialOmega69932);
        return frostHunterTransitionCelestialOmega69932;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterLifecycleBlazeGammaElite2889(FrostHunterAlphaAnimationNeoCosmos5761(windowInsetsAnimation));
        this.FrostHunterServiceEliteCelestialThunder1757.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterAlphaAnimationNeoCosmos5761(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.FrostHunterBundlePulseFusionHero2475;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.FrostHunterBundlePulseFusionHero2475 = arrayList2;
            this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterTextInputEditTextPixelBeta6691.FrostHunterLevelListDrawableFusionDragonHero2232(list.get(size));
            FrostHunterTransitionCelestialOmega6993 FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterLevelListDrawableFusionDragonHero2232);
            fraction = FrostHunterLevelListDrawableFusionDragonHero2232.getFraction();
            FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterLifecycleBlazeGammaElite2889(fraction);
            this.FrostHunterBundlePulseFusionHero2475.add(FrostHunterAlphaAnimationNeoCosmos5761);
        }
        return this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterServiceInfoAuroraHyperNeo5624.FrostHunterBundlePulseFusionHero2475(null, windowInsets), this.FrostHunterConstraintSetCloneMasterUltraRogue2633).FrostHunterConstraintSetCloneMasterUltraRogue2633();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        FrostHunterProximitySensorEpicSolar3138 FrostHunterCameraXPixelTurboCosmos9814 = this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterCameraXPixelTurboCosmos9814(FrostHunterAlphaAnimationNeoCosmos5761(windowInsetsAnimation), new FrostHunterProximitySensorEpicSolar3138(bounds));
        FrostHunterCameraXPixelTurboCosmos9814.getClass();
        FrostHunterExecutorDragonPhantom9516.FrostHunterCardViewSpectraCyber7714();
        return FrostHunterExecutorDragonPhantom9516.FrostHunterKeyframeGammaGamma1197(((FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995) FrostHunterCameraXPixelTurboCosmos9814.FrostHunterFlowMaxDragonHero5809).FrostHunterServiceEliteCelestialThunder1757(), ((FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995) FrostHunterCameraXPixelTurboCosmos9814.FrostHunterAlertDialogAuroraDelta3200).FrostHunterServiceEliteCelestialThunder1757());
    }
}
