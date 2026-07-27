package android.content.Context;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class FrostHunterAdMobBlazeEclipseGamma6684 {
    public static final FrostHunterPropertyValuesHolderHeroShadowSpark7339 FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterPropertyValuesHolderHeroShadowSpark7339();
    public boolean FrostHunterAlphaAnimationNeoCosmos5761;
    public long FrostHunterBundlePulseFusionHero2475;
    public long FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterAdMobBlazeEclipseGamma6684 FrostHunterAlphaAnimationNeoCosmos5761() {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = false;
        return this;
    }

    public long FrostHunterBundlePulseFusionHero2475() {
        if (this.FrostHunterAlphaAnimationNeoCosmos5761) {
            return this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("No deadline");
        return 0L;
    }

    public long FrostHunterCameraXPixelTurboCosmos9814() {
        return this.FrostHunterBundlePulseFusionHero2475;
    }

    public FrostHunterAdMobBlazeEclipseGamma6684 FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        this.FrostHunterBundlePulseFusionHero2475 = 0L;
        return this;
    }

    public void FrostHunterLevelListDrawableFusionDragonHero2232() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.FrostHunterAlphaAnimationNeoCosmos5761 && this.FrostHunterConstraintSetCloneMasterUltraRogue2633 - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public boolean FrostHunterLifecycleBlazeGammaElite2889() {
        return this.FrostHunterAlphaAnimationNeoCosmos5761;
    }

    public FrostHunterAdMobBlazeEclipseGamma6684 FrostHunterRemoteConfigSpeedSpeed8566(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (j >= 0) {
            this.FrostHunterBundlePulseFusionHero2475 = timeUnit.toNanos(j);
            return this;
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterKeyEventNovaXAlpha1220.FrostHunterAlertDialogAuroraDelta3200("timeout < 0: ", j));
        return null;
    }

    public FrostHunterAdMobBlazeEclipseGamma6684 FrostHunterServiceEliteCelestialThunder1757(long j) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = true;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = j;
        return this;
    }
}
