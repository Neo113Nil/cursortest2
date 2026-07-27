package android.content.Context;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterColorStateListStormPulseElite7932 extends FrostHunterStateFlowAuroraLegendDelta6548 {
    public static boolean FrostHunterAlertDialogAuroraDelta3200 = false;
    public static boolean FrostHunterCameraXPixelTurboCosmos9814 = false;
    public static Constructor FrostHunterFlowMaxDragonHero5809;
    public static Field FrostHunterRemoteConfigSpeedSpeed8566;
    public FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995 FrostHunterLevelListDrawableFusionDragonHero2232;
    public WindowInsets FrostHunterLifecycleBlazeGammaElite2889;

    public FrostHunterColorStateListStormPulseElite7932() {
        this.FrostHunterLifecycleBlazeGammaElite2889 = FrostHunterAlertDialogAuroraDelta3200();
    }

    private static WindowInsets FrostHunterAlertDialogAuroraDelta3200() {
        if (!FrostHunterCameraXPixelTurboCosmos9814) {
            try {
                FrostHunterRemoteConfigSpeedSpeed8566 = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            FrostHunterCameraXPixelTurboCosmos9814 = true;
        }
        Field field = FrostHunterRemoteConfigSpeedSpeed8566;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!FrostHunterAlertDialogAuroraDelta3200) {
            try {
                FrostHunterFlowMaxDragonHero5809 = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            FrostHunterAlertDialogAuroraDelta3200 = true;
        }
        Constructor constructor = FrostHunterFlowMaxDragonHero5809;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }

    @Override // android.content.Context.FrostHunterStateFlowAuroraLegendDelta6548
    public void FrostHunterCameraXPixelTurboCosmos9814(FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995 frostHunterOnAttachStateChangeListenerNovaXHeroHyper7995) {
        WindowInsets windowInsets = this.FrostHunterLifecycleBlazeGammaElite2889;
        if (windowInsets != null) {
            this.FrostHunterLifecycleBlazeGammaElite2889 = windowInsets.replaceSystemWindowInsets(frostHunterOnAttachStateChangeListenerNovaXHeroHyper7995.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterOnAttachStateChangeListenerNovaXHeroHyper7995.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterOnAttachStateChangeListenerNovaXHeroHyper7995.FrostHunterBundlePulseFusionHero2475, frostHunterOnAttachStateChangeListenerNovaXHeroHyper7995.FrostHunterServiceEliteCelestialThunder1757);
        }
    }

    @Override // android.content.Context.FrostHunterStateFlowAuroraLegendDelta6548
    public FrostHunterServiceInfoAuroraHyperNeo5624 FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        FrostHunterAlphaAnimationNeoCosmos5761();
        FrostHunterServiceInfoAuroraHyperNeo5624 FrostHunterBundlePulseFusionHero2475 = FrostHunterServiceInfoAuroraHyperNeo5624.FrostHunterBundlePulseFusionHero2475(null, this.FrostHunterLifecycleBlazeGammaElite2889);
        FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995[] frostHunterOnAttachStateChangeListenerNovaXHeroHyper7995Arr = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        FrostHunterProfilerTurboMaxTurbo5507 frostHunterProfilerTurboMaxTurbo5507 = FrostHunterBundlePulseFusionHero2475.FrostHunterAlphaAnimationNeoCosmos5761;
        frostHunterProfilerTurboMaxTurbo5507.FrostHunterBitmapTurboDeltaNebula8743(frostHunterOnAttachStateChangeListenerNovaXHeroHyper7995Arr);
        frostHunterProfilerTurboMaxTurbo5507.FrostHunterMeteringPointBetaCyber9571(this.FrostHunterLevelListDrawableFusionDragonHero2232);
        frostHunterProfilerTurboMaxTurbo5507.FrostHunterMotionSceneAuroraMega2271(null);
        frostHunterProfilerTurboMaxTurbo5507.FrostHunterEditTextPulseHyperion1262(this.FrostHunterBundlePulseFusionHero2475);
        frostHunterProfilerTurboMaxTurbo5507.FrostHunterDatabaseEliteShadowUltra2452(this.FrostHunterServiceEliteCelestialThunder1757);
        return FrostHunterBundlePulseFusionHero2475;
    }

    @Override // android.content.Context.FrostHunterStateFlowAuroraLegendDelta6548
    public void FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995 frostHunterOnAttachStateChangeListenerNovaXHeroHyper7995) {
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = frostHunterOnAttachStateChangeListenerNovaXHeroHyper7995;
    }

    public FrostHunterColorStateListStormPulseElite7932(FrostHunterServiceInfoAuroraHyperNeo5624 frostHunterServiceInfoAuroraHyperNeo5624) {
        super(frostHunterServiceInfoAuroraHyperNeo5624);
        this.FrostHunterLifecycleBlazeGammaElite2889 = frostHunterServiceInfoAuroraHyperNeo5624.FrostHunterConstraintSetCloneMasterUltraRogue2633();
    }
}
