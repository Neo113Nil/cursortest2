package android.content.Context;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterTimerMegaOlympian7464 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater FrostHunterAlphaAnimationNeoCosmos5761 = AtomicReferenceFieldUpdater.newUpdater(FrostHunterTimerMegaOlympian7464.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater FrostHunterConstraintSetCloneMasterUltraRogue2633 = AtomicReferenceFieldUpdater.newUpdater(FrostHunterTimerMegaOlympian7464.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public FrostHunterTimerMegaOlympian7464(FrostHunterAdapterSpectraVisionThunder5171 frostHunterAdapterSpectraVisionThunder5171) {
        this._prev$volatile = frostHunterAdapterSpectraVisionThunder5171;
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761() {
        FrostHunterConstraintSetCloneMasterUltraRogue2633.set(this, null);
    }

    public abstract boolean FrostHunterBundlePulseFusionHero2475();

    public final FrostHunterTimerMegaOlympian7464 FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        Object obj = FrostHunterAlphaAnimationNeoCosmos5761.get(this);
        if (obj == FrostHunterRemoteConfigPhantomDelta1739.FrostHunterConstraintSetCloneMasterUltraRogue2633) {
            return null;
        }
        return (FrostHunterTimerMegaOlympian7464) obj;
    }

    public final void FrostHunterServiceEliteCelestialThunder1757() {
        FrostHunterTimerMegaOlympian7464 FrostHunterConstraintSetCloneMasterUltraRogue26332;
        if (FrostHunterConstraintSetCloneMasterUltraRogue2633() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = FrostHunterConstraintSetCloneMasterUltraRogue2633;
            FrostHunterTimerMegaOlympian7464 frostHunterTimerMegaOlympian7464 = (FrostHunterTimerMegaOlympian7464) atomicReferenceFieldUpdater.get(this);
            while (frostHunterTimerMegaOlympian7464 != null && frostHunterTimerMegaOlympian7464.FrostHunterBundlePulseFusionHero2475()) {
                frostHunterTimerMegaOlympian7464 = (FrostHunterTimerMegaOlympian7464) atomicReferenceFieldUpdater.get(frostHunterTimerMegaOlympian7464);
            }
            FrostHunterTimerMegaOlympian7464 FrostHunterConstraintSetCloneMasterUltraRogue26333 = FrostHunterConstraintSetCloneMasterUltraRogue2633();
            FrostHunterConstraintSetCloneMasterUltraRogue26333.getClass();
            while (FrostHunterConstraintSetCloneMasterUltraRogue26333.FrostHunterBundlePulseFusionHero2475() && (FrostHunterConstraintSetCloneMasterUltraRogue26332 = FrostHunterConstraintSetCloneMasterUltraRogue26333.FrostHunterConstraintSetCloneMasterUltraRogue2633()) != null) {
                FrostHunterConstraintSetCloneMasterUltraRogue26333 = FrostHunterConstraintSetCloneMasterUltraRogue26332;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(FrostHunterConstraintSetCloneMasterUltraRogue26333);
                FrostHunterTimerMegaOlympian7464 frostHunterTimerMegaOlympian74642 = ((FrostHunterTimerMegaOlympian7464) obj) == null ? null : frostHunterTimerMegaOlympian7464;
                while (!atomicReferenceFieldUpdater.compareAndSet(FrostHunterConstraintSetCloneMasterUltraRogue26333, obj, frostHunterTimerMegaOlympian74642)) {
                    if (atomicReferenceFieldUpdater.get(FrostHunterConstraintSetCloneMasterUltraRogue26333) != obj) {
                        break;
                    }
                }
            }
            if (frostHunterTimerMegaOlympian7464 != null) {
                FrostHunterAlphaAnimationNeoCosmos5761.set(frostHunterTimerMegaOlympian7464, FrostHunterConstraintSetCloneMasterUltraRogue26333);
            }
            if (!FrostHunterConstraintSetCloneMasterUltraRogue26333.FrostHunterBundlePulseFusionHero2475() || FrostHunterConstraintSetCloneMasterUltraRogue26333.FrostHunterConstraintSetCloneMasterUltraRogue2633() == null) {
                if (frostHunterTimerMegaOlympian7464 == null || !frostHunterTimerMegaOlympian7464.FrostHunterBundlePulseFusionHero2475()) {
                    return;
                }
            }
        }
    }
}
