package android.content.Context;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterConfigurationOmegaHero2730 extends FrostHunterCoroutineEclipseNovaShadow7878 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater FrostHunterLightSensorForceFusion4241 = AtomicIntegerFieldUpdater.newUpdater(FrostHunterConfigurationOmegaHero2730.class, "_state$volatile");
    public final Thread FrostHunterFragmentBetaMegaVortex6025 = Thread.currentThread();
    public FrostHunterCoroutineScopeNeoMega4482 FrostHunterServiceConnectionTurboPhoenixOmega6719;
    private volatile /* synthetic */ int _state$volatile;

    public static void FrostHunterLightSensorForceFusion4241(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    @Override // android.content.Context.FrostHunterCoroutineEclipseNovaShadow7878
    public final void FrostHunterFragmentBetaMegaVortex6025(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = FrostHunterLightSensorForceFusion4241;
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1 || i == 2 || i == 3) {
                    return;
                }
                FrostHunterLightSensorForceFusion4241(i);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 2));
        this.FrostHunterFragmentBetaMegaVortex6025.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    @Override // android.content.Context.FrostHunterCoroutineEclipseNovaShadow7878
    public final boolean FrostHunterKeyframeGammaGamma1197() {
        return true;
    }

    public final void FrostHunterServiceConnectionTurboPhoenixOmega6719() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = FrostHunterLightSensorForceFusion4241;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        FrostHunterLightSensorForceFusion4241(i);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i, 1)) {
                FrostHunterCoroutineScopeNeoMega4482 frostHunterCoroutineScopeNeoMega4482 = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                if (frostHunterCoroutineScopeNeoMega4482 != null) {
                    frostHunterCoroutineScopeNeoMega4482.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                    return;
                }
                return;
            }
        }
    }
}
