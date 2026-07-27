package kotlin.text;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class CatchingFishMVPMockk extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        CatchingFishToastLifecycle CatchingFishReduxKtor;
        while (true) {
            try {
                reentrantLock = CatchingFishToastLifecycle.CatchingFishViewModelFAB;
                reentrantLock.lock();
                try {
                    CatchingFishReduxKtor = CatchingFishBiometricBundle.CatchingFishReduxKtor();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
                continue;
            }
            if (CatchingFishReduxKtor == CatchingFishToastLifecycle.CatchingFishEspressoTesting) {
                CatchingFishToastLifecycle.CatchingFishEspressoTesting = null;
                reentrantLock.unlock();
                return;
            } else {
                reentrantLock.unlock();
                if (CatchingFishReduxKtor != null) {
                    CatchingFishReduxKtor.CatchingFishCloudMessaging();
                }
            }
        }
    }
}
