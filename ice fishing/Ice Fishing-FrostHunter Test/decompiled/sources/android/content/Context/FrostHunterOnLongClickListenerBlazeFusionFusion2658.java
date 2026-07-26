package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterOnLongClickListenerBlazeFusionFusion2658 extends FrostHunterResourceThunderSolarForce1212 {
    public static final /* synthetic */ int FrostHunterServiceConnectionTurboPhoenixOmega6719 = 0;
    public long FrostHunterAlertDialogAuroraDelta3200;
    public FrostHunterAccelerometerNeoAurora1913 FrostHunterFragmentBetaMegaVortex6025;
    public boolean FrostHunterKeyframeGammaGamma1197;

    public final boolean FrostHunterFCMDeltaQuantumHero8364() {
        FrostHunterAccelerometerNeoAurora1913 frostHunterAccelerometerNeoAurora1913 = this.FrostHunterFragmentBetaMegaVortex6025;
        if (frostHunterAccelerometerNeoAurora1913 == null) {
            return false;
        }
        FrostHunterInputFilterOmegaBeta3718 frostHunterInputFilterOmegaBeta3718 = (FrostHunterInputFilterOmegaBeta3718) (frostHunterAccelerometerNeoAurora1913.isEmpty() ? null : frostHunterAccelerometerNeoAurora1913.removeFirst());
        if (frostHunterInputFilterOmegaBeta3718 == null) {
            return false;
        }
        frostHunterInputFilterOmegaBeta3718.run();
        return true;
    }

    public final void FrostHunterMagnetometerFusionTitanium8202(FrostHunterInputFilterOmegaBeta3718 frostHunterInputFilterOmegaBeta3718) {
        FrostHunterAccelerometerNeoAurora1913 frostHunterAccelerometerNeoAurora1913 = this.FrostHunterFragmentBetaMegaVortex6025;
        if (frostHunterAccelerometerNeoAurora1913 == null) {
            frostHunterAccelerometerNeoAurora1913 = new FrostHunterAccelerometerNeoAurora1913();
            this.FrostHunterFragmentBetaMegaVortex6025 = frostHunterAccelerometerNeoAurora1913;
        }
        frostHunterAccelerometerNeoAurora1913.addLast(frostHunterInputFilterOmegaBeta3718);
    }

    public final void FrostHunterPagingDataTurboTitanium7332(boolean z) {
        this.FrostHunterAlertDialogAuroraDelta3200 = (z ? 4294967296L : 1L) + this.FrostHunterAlertDialogAuroraDelta3200;
        if (z) {
            return;
        }
        this.FrostHunterKeyframeGammaGamma1197 = true;
    }

    public abstract long FrostHunterR8MasterNebulaSpark7247();

    public final void FrostHunterStateCelestialNovaPixel8414(boolean z) {
        long j = this.FrostHunterAlertDialogAuroraDelta3200 - (z ? 4294967296L : 1L);
        this.FrostHunterAlertDialogAuroraDelta3200 = j;
        if (j <= 0 && this.FrostHunterKeyframeGammaGamma1197) {
            shutdown();
        }
    }

    @Override // android.content.Context.FrostHunterResourceThunderSolarForce1212
    public final FrostHunterResourceThunderSolarForce1212 FrostHunterTranslateAnimationCyberSolarUltra7101(int i) {
        FrostHunterExecutorSolarPhoenix3849.FrostHunterKeyframeGammaGamma1197(i);
        return this;
    }

    public abstract void shutdown();
}
