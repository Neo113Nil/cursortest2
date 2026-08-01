package R1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1051b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1052c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1053d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex");
    public static final AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer");

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f1054a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    public final h a(h hVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1052c;
        if (atomicIntegerFieldUpdater.get(this) - f1053d.get(this) == 127) {
            return hVar;
        }
        if (hVar.f1040b.f1041a == 1) {
            e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f1054a;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, hVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final h b() {
        h hVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1053d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - f1052c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (hVar = (h) this.f1054a.getAndSet(i2, null)) != null) {
                if (hVar.f1040b.f1041a == 1) {
                    e.decrementAndGet(this);
                }
                return hVar;
            }
        }
    }

    public final h c(int i, boolean z2) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.f1054a;
        h hVar = (h) atomicReferenceArray.get(i2);
        if (hVar != null) {
            if ((hVar.f1040b.f1041a == 1) == z2) {
                while (!atomicReferenceArray.compareAndSet(i2, hVar, null)) {
                    if (atomicReferenceArray.get(i2) != hVar) {
                    }
                }
                if (z2) {
                    e.decrementAndGet(this);
                }
                return hVar;
            }
        }
        return null;
    }
}
