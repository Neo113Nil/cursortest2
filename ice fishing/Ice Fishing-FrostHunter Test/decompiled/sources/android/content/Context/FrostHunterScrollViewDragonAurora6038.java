package android.content.Context;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterScrollViewDragonAurora6038 extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        FrostHunterTextInputEditTextCosmosInferno2158 FrostHunterKeyframeGammaGamma1197;
        while (true) {
            try {
                FrostHunterNestedScrollViewMaxEpicEpic6844 frostHunterNestedScrollViewMaxEpicEpic6844 = FrostHunterTextInputEditTextCosmosInferno2158.FrostHunterCameraXPixelTurboCosmos9814;
                reentrantLock = FrostHunterTextInputEditTextCosmosInferno2158.FrostHunterAlertDialogAuroraDelta3200;
                reentrantLock.lock();
                try {
                    FrostHunterKeyframeGammaGamma1197 = FrostHunterRewardedAdHyperStrike1151.FrostHunterKeyframeGammaGamma1197();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
                continue;
            }
            if (FrostHunterKeyframeGammaGamma1197 == FrostHunterTextInputEditTextCosmosInferno2158.FrostHunterFlowMaxDragonHero5809) {
                FrostHunterTextInputEditTextCosmosInferno2158.FrostHunterFlowMaxDragonHero5809 = null;
                reentrantLock.unlock();
                return;
            } else {
                reentrantLock.unlock();
                if (FrostHunterKeyframeGammaGamma1197 != null) {
                    FrostHunterKeyframeGammaGamma1197.FrostHunterFragmentBetaMegaVortex6025();
                }
            }
        }
    }
}
