package android.content.Context;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class FrostHunterTextInputEditTextCosmosInferno2158 extends FrostHunterAdMobBlazeEclipseGamma6684 {
    public static final ReentrantLock FrostHunterAlertDialogAuroraDelta3200;
    public static final FrostHunterNestedScrollViewMaxEpicEpic6844 FrostHunterCameraXPixelTurboCosmos9814;
    public static FrostHunterTextInputEditTextCosmosInferno2158 FrostHunterFlowMaxDragonHero5809;
    public static final long FrostHunterFragmentBetaMegaVortex6025;
    public static final Condition FrostHunterKeyframeGammaGamma1197;
    public static final long FrostHunterServiceConnectionTurboPhoenixOmega6719;
    public int FrostHunterLevelListDrawableFusionDragonHero2232 = -1;
    public int FrostHunterLifecycleBlazeGammaElite2889;
    public long FrostHunterRemoteConfigSpeedSpeed8566;

    static {
        FrostHunterNestedScrollViewMaxEpicEpic6844 frostHunterNestedScrollViewMaxEpicEpic6844 = new FrostHunterNestedScrollViewMaxEpicEpic6844(3);
        frostHunterNestedScrollViewMaxEpicEpic6844.FrostHunterAlertDialogAuroraDelta3200 = new FrostHunterTextInputEditTextCosmosInferno2158[8];
        FrostHunterCameraXPixelTurboCosmos9814 = frostHunterNestedScrollViewMaxEpicEpic6844;
        ReentrantLock reentrantLock = new ReentrantLock();
        FrostHunterAlertDialogAuroraDelta3200 = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        newCondition.getClass();
        FrostHunterKeyframeGammaGamma1197 = newCondition;
        FrostHunterFragmentBetaMegaVortex6025 = 60000L;
        FrostHunterServiceConnectionTurboPhoenixOmega6719 = TimeUnit.MILLISECONDS.toNanos(60000L);
    }

    public final boolean FrostHunterAlertDialogAuroraDelta3200() {
        ReentrantLock reentrantLock = FrostHunterAlertDialogAuroraDelta3200;
        reentrantLock.lock();
        try {
            int i = this.FrostHunterLifecycleBlazeGammaElite2889;
            this.FrostHunterLifecycleBlazeGammaElite2889 = 0;
            if (i != 1) {
                return i == 2;
            }
            FrostHunterCameraXPixelTurboCosmos9814.FrostHunterLifecycleBlazeGammaElite2889(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void FrostHunterFlowMaxDragonHero5809() {
        long j = this.FrostHunterBundlePulseFusionHero2475;
        boolean z = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (j != 0 || z) {
            ReentrantLock reentrantLock = FrostHunterAlertDialogAuroraDelta3200;
            reentrantLock.lock();
            try {
                if (this.FrostHunterLifecycleBlazeGammaElite2889 != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.FrostHunterLifecycleBlazeGammaElite2889 = 1;
                FrostHunterRewardedAdHyperStrike1151.FrostHunterCameraXPixelTurboCosmos9814(this);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public IOException FrostHunterKeyframeGammaGamma1197(IOException iOException) {
        throw null;
    }

    public void FrostHunterFragmentBetaMegaVortex6025() {
    }
}
