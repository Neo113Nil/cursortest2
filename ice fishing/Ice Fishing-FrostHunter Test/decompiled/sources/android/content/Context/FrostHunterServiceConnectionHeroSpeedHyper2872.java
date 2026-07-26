package android.content.Context;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterServiceConnectionHeroSpeedHyper2872 {
    public static final String FrostHunterAlphaAnimationNeoCosmos5761;
    public static final int FrostHunterBundlePulseFusionHero2475;
    public static final long FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public static final FrostHunterChipSpeedTitan5326 FrostHunterLevelListDrawableFusionDragonHero2232;
    public static final long FrostHunterLifecycleBlazeGammaElite2889;
    public static final int FrostHunterServiceEliteCelestialThunder1757;

    static {
        String str;
        int i = FrostHunterCanvasPhantomEclipse9142.FrostHunterAlphaAnimationNeoCosmos5761;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        FrostHunterAlphaAnimationNeoCosmos5761 = str;
        FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterCoroutineScopeNovaVortexMega5640.FrostHunterFlowMaxDragonHero5809("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = FrostHunterCanvasPhantomEclipse9142.FrostHunterAlphaAnimationNeoCosmos5761;
        if (i2 < 2) {
            i2 = 2;
        }
        FrostHunterBundlePulseFusionHero2475 = FrostHunterCoroutineScopeNovaVortexMega5640.FrostHunterAlertDialogAuroraDelta3200("kotlinx.coroutines.scheduler.core.pool.size", i2, 8);
        FrostHunterServiceEliteCelestialThunder1757 = FrostHunterCoroutineScopeNovaVortexMega5640.FrostHunterAlertDialogAuroraDelta3200("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 4);
        FrostHunterLifecycleBlazeGammaElite2889 = TimeUnit.SECONDS.toNanos(FrostHunterCoroutineScopeNovaVortexMega5640.FrostHunterFlowMaxDragonHero5809("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterChipSpeedTitan5326.FrostHunterLooperThreadBetaHyperionMax1000;
    }
}
