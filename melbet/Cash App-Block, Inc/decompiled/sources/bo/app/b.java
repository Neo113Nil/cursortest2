package bo.app;

import com.braze.support.BrazeLogger;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreAndMutexImpl;
import kotlinx.coroutines.sync.SemaphoreImpl;
import kotlinx.coroutines.sync.SemaphoreKt;

/* loaded from: classes3.dex */
public abstract class b {
    public final Semaphore a;

    public b() {
        int i = SemaphoreKt.MAX_SPIN_CYCLES;
        this.a = new SemaphoreImpl(1);
    }

    public static final String b(Object obj, boolean z) {
        return "Tried to confirm outboundObject [" + obj + "] with success [" + z + "], but the cache wasn't locked, so not doing anything.";
    }

    public final synchronized Object a() {
        int i;
        boolean z;
        SemaphoreAndMutexImpl semaphoreAndMutexImpl = (SemaphoreAndMutexImpl) this.a;
        int i2 = semaphoreAndMutexImpl.permits;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = SemaphoreAndMutexImpl._availablePermits$volatile$FU;
        while (true) {
            int i3 = atomicIntegerFieldUpdater.get(semaphoreAndMutexImpl);
            if (i3 > i2) {
                do {
                    i = atomicIntegerFieldUpdater.get(semaphoreAndMutexImpl);
                    if (i > i2) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(semaphoreAndMutexImpl, i, i2));
            } else {
                if (i3 <= 0) {
                    z = false;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(semaphoreAndMutexImpl, i3, i3 - 1)) {
                    z = true;
                    break;
                }
            }
        }
        if (!z) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda3(0), 7, (Object) null);
            return null;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda1(this, 1), 7, (Object) null);
        return c();
    }

    public abstract Object c();

    public abstract void c(Object obj, boolean z);

    public static final String b() {
        return "Received call to export dirty object, but the cache was already locked.";
    }

    public static final String b(b bVar) {
        return "Cache locked successfully for export: " + bVar;
    }

    public final synchronized void a(Object obj, boolean z) {
        SemaphoreAndMutexImpl semaphoreAndMutexImpl = (SemaphoreAndMutexImpl) this.a;
        semaphoreAndMutexImpl.getClass();
        int i = 0;
        if (Math.max(SemaphoreAndMutexImpl._availablePermits$volatile$FU.get(semaphoreAndMutexImpl), 0) != 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda0(obj, z, i), 6, (Object) null);
            return;
        }
        c(obj, z);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda1(this, 0), 6, (Object) null);
        ((SemaphoreAndMutexImpl) this.a).release();
    }

    public static final String a(b bVar) {
        return "Notifying confirmAndUnlock listeners for cache: " + bVar;
    }
}
