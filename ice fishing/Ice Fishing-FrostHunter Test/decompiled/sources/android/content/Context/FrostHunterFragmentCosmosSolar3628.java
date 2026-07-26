package android.content.Context;

import java.util.Iterator;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterFragmentCosmosSolar3628 {
    public final FrostHunterScaleAnimationSparkOmega7484 FrostHunterAlphaAnimationNeoCosmos5761 = new FrostHunterScaleAnimationSparkOmega7484();

    public final void FrostHunterAlphaAnimationNeoCosmos5761(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        FrostHunterScaleAnimationSparkOmega7484 frostHunterScaleAnimationSparkOmega7484 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (frostHunterScaleAnimationSparkOmega7484 != null) {
            if (frostHunterScaleAnimationSparkOmega7484.FrostHunterServiceEliteCelestialThunder1757) {
                FrostHunterScaleAnimationSparkOmega7484.FrostHunterAlphaAnimationNeoCosmos5761(autoCloseable);
                return;
            }
            synchronized (frostHunterScaleAnimationSparkOmega7484.FrostHunterAlphaAnimationNeoCosmos5761) {
                autoCloseable2 = (AutoCloseable) frostHunterScaleAnimationSparkOmega7484.FrostHunterConstraintSetCloneMasterUltraRogue2633.put(str, autoCloseable);
            }
            FrostHunterScaleAnimationSparkOmega7484.FrostHunterAlphaAnimationNeoCosmos5761(autoCloseable2);
        }
    }

    public final AutoCloseable FrostHunterBundlePulseFusionHero2475(String str) {
        AutoCloseable autoCloseable;
        FrostHunterScaleAnimationSparkOmega7484 frostHunterScaleAnimationSparkOmega7484 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (frostHunterScaleAnimationSparkOmega7484 == null) {
            return null;
        }
        synchronized (frostHunterScaleAnimationSparkOmega7484.FrostHunterAlphaAnimationNeoCosmos5761) {
            autoCloseable = (AutoCloseable) frostHunterScaleAnimationSparkOmega7484.FrostHunterConstraintSetCloneMasterUltraRogue2633.get(str);
        }
        return autoCloseable;
    }

    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        FrostHunterScaleAnimationSparkOmega7484 frostHunterScaleAnimationSparkOmega7484 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (frostHunterScaleAnimationSparkOmega7484 != null && !frostHunterScaleAnimationSparkOmega7484.FrostHunterServiceEliteCelestialThunder1757) {
            frostHunterScaleAnimationSparkOmega7484.FrostHunterServiceEliteCelestialThunder1757 = true;
            synchronized (frostHunterScaleAnimationSparkOmega7484.FrostHunterAlphaAnimationNeoCosmos5761) {
                try {
                    Iterator it = frostHunterScaleAnimationSparkOmega7484.FrostHunterConstraintSetCloneMasterUltraRogue2633.values().iterator();
                    while (it.hasNext()) {
                        FrostHunterScaleAnimationSparkOmega7484.FrostHunterAlphaAnimationNeoCosmos5761((AutoCloseable) it.next());
                    }
                    Iterator it2 = frostHunterScaleAnimationSparkOmega7484.FrostHunterBundlePulseFusionHero2475.iterator();
                    while (it2.hasNext()) {
                        FrostHunterScaleAnimationSparkOmega7484.FrostHunterAlphaAnimationNeoCosmos5761((AutoCloseable) it2.next());
                    }
                    frostHunterScaleAnimationSparkOmega7484.FrostHunterBundlePulseFusionHero2475.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        FrostHunterServiceEliteCelestialThunder1757();
    }

    public void FrostHunterServiceEliteCelestialThunder1757() {
    }
}
