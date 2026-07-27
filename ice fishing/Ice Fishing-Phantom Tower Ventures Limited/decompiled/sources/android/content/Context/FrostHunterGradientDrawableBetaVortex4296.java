package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterGradientDrawableBetaVortex4296 implements Runnable, Comparable, FrostHunterCoroutineScopeNeoMega4482 {
    public long FrostHunterCameraXPixelTurboCosmos9814;
    public int FrostHunterFlowMaxDragonHero5809 = -1;
    private volatile Object _heap;

    public FrostHunterGradientDrawableBetaVortex4296(long j) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = j;
    }

    public final int FrostHunterAlphaAnimationNeoCosmos5761(long j, FrostHunterVectorDrawableNovaAurora3363 frostHunterVectorDrawableNovaAurora3363, FrostHunterViewBindingPrimeTurboSpark2103 frostHunterViewBindingPrimeTurboSpark2103) {
        synchronized (this) {
            if (this._heap == FrostHunterExecutorSolarPhoenix3849.FrostHunterBundlePulseFusionHero2475) {
                return 2;
            }
            synchronized (frostHunterVectorDrawableNovaAurora3363) {
                try {
                    FrostHunterGradientDrawableBetaVortex4296[] frostHunterGradientDrawableBetaVortex4296Arr = frostHunterVectorDrawableNovaAurora3363.FrostHunterAlphaAnimationNeoCosmos5761;
                    FrostHunterGradientDrawableBetaVortex4296 frostHunterGradientDrawableBetaVortex4296 = frostHunterGradientDrawableBetaVortex4296Arr != null ? frostHunterGradientDrawableBetaVortex4296Arr[0] : null;
                    if (FrostHunterViewBindingPrimeTurboSpark2103.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.get(frostHunterViewBindingPrimeTurboSpark2103) == 1) {
                        return 1;
                    }
                    if (frostHunterGradientDrawableBetaVortex4296 == null) {
                        frostHunterVectorDrawableNovaAurora3363.FrostHunterBundlePulseFusionHero2475 = j;
                    } else {
                        long j2 = frostHunterGradientDrawableBetaVortex4296.FrostHunterCameraXPixelTurboCosmos9814;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - frostHunterVectorDrawableNovaAurora3363.FrostHunterBundlePulseFusionHero2475 > 0) {
                            frostHunterVectorDrawableNovaAurora3363.FrostHunterBundlePulseFusionHero2475 = j;
                        }
                    }
                    long j3 = this.FrostHunterCameraXPixelTurboCosmos9814;
                    long j4 = frostHunterVectorDrawableNovaAurora3363.FrostHunterBundlePulseFusionHero2475;
                    if (j3 - j4 < 0) {
                        this.FrostHunterCameraXPixelTurboCosmos9814 = j4;
                    }
                    frostHunterVectorDrawableNovaAurora3363.FrostHunterAlphaAnimationNeoCosmos5761(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.content.Context.FrostHunterCoroutineScopeNeoMega4482
    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                FrostHunterWorkManagerMaxTurbo1858 frostHunterWorkManagerMaxTurbo1858 = FrostHunterExecutorSolarPhoenix3849.FrostHunterBundlePulseFusionHero2475;
                if (obj == frostHunterWorkManagerMaxTurbo1858) {
                    return;
                }
                FrostHunterVectorDrawableNovaAurora3363 frostHunterVectorDrawableNovaAurora3363 = obj instanceof FrostHunterVectorDrawableNovaAurora3363 ? (FrostHunterVectorDrawableNovaAurora3363) obj : null;
                if (frostHunterVectorDrawableNovaAurora3363 != null) {
                    synchronized (frostHunterVectorDrawableNovaAurora3363) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof FrostHunterRunnableFusionInfernoSolar5363 ? (FrostHunterRunnableFusionInfernoSolar5363) obj2 : null) != null) {
                            frostHunterVectorDrawableNovaAurora3363.FrostHunterConstraintSetCloneMasterUltraRogue2633(this.FrostHunterFlowMaxDragonHero5809);
                        }
                    }
                }
                this._heap = frostHunterWorkManagerMaxTurbo1858;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void FrostHunterServiceEliteCelestialThunder1757(FrostHunterVectorDrawableNovaAurora3363 frostHunterVectorDrawableNovaAurora3363) {
        if (this._heap != FrostHunterExecutorSolarPhoenix3849.FrostHunterBundlePulseFusionHero2475) {
            this._heap = frostHunterVectorDrawableNovaAurora3363;
        } else {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("Failed requirement.");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.FrostHunterCameraXPixelTurboCosmos9814 - ((FrostHunterGradientDrawableBetaVortex4296) obj).FrostHunterCameraXPixelTurboCosmos9814;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public String toString() {
        return "Delayed[nanos=" + this.FrostHunterCameraXPixelTurboCosmos9814 + ']';
    }
}
