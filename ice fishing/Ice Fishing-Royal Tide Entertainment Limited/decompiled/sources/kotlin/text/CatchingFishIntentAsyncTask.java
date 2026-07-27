package kotlin.text;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class CatchingFishIntentAsyncTask {
    public final AtomicReferenceArray CatchingFishParcelableFAB = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater CatchingFishSnackbar = AtomicReferenceFieldUpdater.newUpdater(CatchingFishIntentAsyncTask.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater CatchingFishCoroutine = AtomicIntegerFieldUpdater.newUpdater(CatchingFishIntentAsyncTask.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater CatchingFishReduxKtor = AtomicIntegerFieldUpdater.newUpdater(CatchingFishIntentAsyncTask.class, "consumerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater CatchingFishDaggerWebsocket = AtomicIntegerFieldUpdater.newUpdater(CatchingFishIntentAsyncTask.class, "blockingTasksInBuffer$volatile");

    public final CatchingFishServiceMoshiMVP CatchingFishCoroutine(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.CatchingFishParcelableFAB;
        CatchingFishServiceMoshiMVP catchingFishServiceMoshiMVP = (CatchingFishServiceMoshiMVP) atomicReferenceArray.get(i2);
        if (catchingFishServiceMoshiMVP != null && catchingFishServiceMoshiMVP.CatchingFishDaggerWebsocket == z) {
            while (!atomicReferenceArray.compareAndSet(i2, catchingFishServiceMoshiMVP, null)) {
                if (atomicReferenceArray.get(i2) != catchingFishServiceMoshiMVP) {
                }
            }
            if (z) {
                CatchingFishDaggerWebsocket.decrementAndGet(this);
            }
            return catchingFishServiceMoshiMVP;
        }
        return null;
    }

    public final CatchingFishServiceMoshiMVP CatchingFishParcelableFAB(CatchingFishServiceMoshiMVP catchingFishServiceMoshiMVP) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = CatchingFishCoroutine;
        if (atomicIntegerFieldUpdater.get(this) - CatchingFishReduxKtor.get(this) == 127) {
            return catchingFishServiceMoshiMVP;
        }
        if (catchingFishServiceMoshiMVP.CatchingFishDaggerWebsocket) {
            CatchingFishDaggerWebsocket.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.CatchingFishParcelableFAB;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, catchingFishServiceMoshiMVP);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final CatchingFishServiceMoshiMVP CatchingFishSnackbar() {
        CatchingFishServiceMoshiMVP catchingFishServiceMoshiMVP;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = CatchingFishReduxKtor;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - CatchingFishCoroutine.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (catchingFishServiceMoshiMVP = (CatchingFishServiceMoshiMVP) this.CatchingFishParcelableFAB.getAndSet(i2, null)) != null) {
                if (catchingFishServiceMoshiMVP.CatchingFishDaggerWebsocket) {
                    CatchingFishDaggerWebsocket.decrementAndGet(this);
                }
                return catchingFishServiceMoshiMVP;
            }
        }
    }
}
