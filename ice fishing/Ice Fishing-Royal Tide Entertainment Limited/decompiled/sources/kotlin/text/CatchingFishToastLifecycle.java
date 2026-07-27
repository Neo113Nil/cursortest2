package kotlin.text;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class CatchingFishToastLifecycle extends CatchingFishMoshiFirebase {
    public static final long CatchingFishCloudMessaging;
    public static CatchingFishToastLifecycle CatchingFishEspressoTesting;
    public static final long CatchingFishFragmentHandler;
    public static final Condition CatchingFishLayout;
    public static final ReentrantLock CatchingFishViewModelFAB;
    public boolean CatchingFishDaggerWebsocket;
    public long CatchingFishViewModelScope;
    public CatchingFishToastLifecycle CatchingFishWorkManager;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        CatchingFishViewModelFAB = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(newCondition, "lock.newCondition()");
        CatchingFishLayout = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        CatchingFishFragmentHandler = millis;
        CatchingFishCloudMessaging = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final boolean CatchingFishFragmentHandler() {
        ReentrantLock reentrantLock = CatchingFishViewModelFAB;
        reentrantLock.lock();
        try {
            if (!this.CatchingFishDaggerWebsocket) {
                return false;
            }
            this.CatchingFishDaggerWebsocket = false;
            CatchingFishToastLifecycle catchingFishToastLifecycle = CatchingFishEspressoTesting;
            while (catchingFishToastLifecycle != null) {
                CatchingFishToastLifecycle catchingFishToastLifecycle2 = catchingFishToastLifecycle.CatchingFishWorkManager;
                if (catchingFishToastLifecycle2 == this) {
                    catchingFishToastLifecycle.CatchingFishWorkManager = this.CatchingFishWorkManager;
                    this.CatchingFishWorkManager = null;
                    return false;
                }
                catchingFishToastLifecycle = catchingFishToastLifecycle2;
            }
            reentrantLock.unlock();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void CatchingFishLayout() {
        CatchingFishToastLifecycle catchingFishToastLifecycle;
        long j = this.CatchingFishCoroutine;
        boolean z = this.CatchingFishParcelableFAB;
        if (j != 0 || z) {
            ReentrantLock reentrantLock = CatchingFishViewModelFAB;
            reentrantLock.lock();
            try {
                if (this.CatchingFishDaggerWebsocket) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.CatchingFishDaggerWebsocket = true;
                if (CatchingFishEspressoTesting == null) {
                    CatchingFishEspressoTesting = new CatchingFishToastLifecycle();
                    CatchingFishMVPMockk catchingFishMVPMockk = new CatchingFishMVPMockk("Okio Watchdog");
                    catchingFishMVPMockk.setDaemon(true);
                    catchingFishMVPMockk.start();
                }
                long nanoTime = System.nanoTime();
                if (j != 0 && z) {
                    this.CatchingFishViewModelScope = Math.min(j, CatchingFishCoroutine() - nanoTime) + nanoTime;
                } else if (j != 0) {
                    this.CatchingFishViewModelScope = j + nanoTime;
                } else {
                    if (!z) {
                        throw new AssertionError();
                    }
                    this.CatchingFishViewModelScope = CatchingFishCoroutine();
                }
                long j2 = this.CatchingFishViewModelScope - nanoTime;
                CatchingFishToastLifecycle catchingFishToastLifecycle2 = CatchingFishEspressoTesting;
                CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishToastLifecycle2);
                while (true) {
                    catchingFishToastLifecycle = catchingFishToastLifecycle2.CatchingFishWorkManager;
                    if (catchingFishToastLifecycle == null || j2 < catchingFishToastLifecycle.CatchingFishViewModelScope - nanoTime) {
                        break;
                    } else {
                        catchingFishToastLifecycle2 = catchingFishToastLifecycle;
                    }
                }
                this.CatchingFishWorkManager = catchingFishToastLifecycle;
                catchingFishToastLifecycle2.CatchingFishWorkManager = this;
                if (catchingFishToastLifecycle2 == CatchingFishEspressoTesting) {
                    CatchingFishLayout.signal();
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public void CatchingFishCloudMessaging() {
    }
}
