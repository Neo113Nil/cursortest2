package android.content.Context;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterDrawableTurboPrimeNova5225 implements Executor {
    public static final Logger FrostHunterServiceConnectionTurboPhoenixOmega6719 = Logger.getLogger(FrostHunterDrawableTurboPrimeNova5225.class.getName());
    public final Executor FrostHunterCameraXPixelTurboCosmos9814;
    public final ArrayDeque FrostHunterFlowMaxDragonHero5809 = new ArrayDeque();
    public int FrostHunterAlertDialogAuroraDelta3200 = 1;
    public long FrostHunterKeyframeGammaGamma1197 = 0;
    public final FrostHunterActivityRogueFusionRogue5543 FrostHunterFragmentBetaMegaVortex6025 = new FrostHunterActivityRogueFusionRogue5543(this);

    public FrostHunterDrawableTurboPrimeNova5225(Executor executor) {
        FrostHunterCardViewHyperionAurora3829.FrostHunterScaleAnimationStrikeSpark5059(executor);
        this.FrostHunterCameraXPixelTurboCosmos9814 = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        FrostHunterCardViewHyperionAurora3829.FrostHunterScaleAnimationStrikeSpark5059(runnable);
        synchronized (this.FrostHunterFlowMaxDragonHero5809) {
            int i = this.FrostHunterAlertDialogAuroraDelta3200;
            if (i != 4 && i != 3) {
                long j = this.FrostHunterKeyframeGammaGamma1197;
                boolean z = true;
                FrostHunterContextOlympianElite8027 frostHunterContextOlympianElite8027 = new FrostHunterContextOlympianElite8027(runnable, 1);
                this.FrostHunterFlowMaxDragonHero5809.add(frostHunterContextOlympianElite8027);
                this.FrostHunterAlertDialogAuroraDelta3200 = 2;
                try {
                    this.FrostHunterCameraXPixelTurboCosmos9814.execute(this.FrostHunterFragmentBetaMegaVortex6025);
                    if (this.FrostHunterAlertDialogAuroraDelta3200 != 2) {
                        return;
                    }
                    synchronized (this.FrostHunterFlowMaxDragonHero5809) {
                        try {
                            if (this.FrostHunterKeyframeGammaGamma1197 == j && this.FrostHunterAlertDialogAuroraDelta3200 == 2) {
                                this.FrostHunterAlertDialogAuroraDelta3200 = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.FrostHunterFlowMaxDragonHero5809) {
                        try {
                            int i2 = this.FrostHunterAlertDialogAuroraDelta3200;
                            if ((i2 != 1 && i2 != 2) || !this.FrostHunterFlowMaxDragonHero5809.removeLastOccurrence(frostHunterContextOlympianElite8027)) {
                                z = false;
                            }
                            if (!(e instanceof RejectedExecutionException) || z) {
                                throw e;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.FrostHunterFlowMaxDragonHero5809.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.FrostHunterCameraXPixelTurboCosmos9814 + "}";
    }
}
