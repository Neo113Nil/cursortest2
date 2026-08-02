package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import sun.misc.Unsafe;

/* loaded from: classes9.dex */
public final class z951 {
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(z951.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ long f = wb4.a.objectFieldOffset(z951.class.getDeclaredField("lastScheduledTask$volatile"));
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(z951.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(z951.class, "consumerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(z951.class, "blockingTasksInBuffer$volatile");

    public final xsx0 a(xsx0 xsx0Var, boolean z) {
        if (z) {
            return b(xsx0Var);
        }
        b.getClass();
        xsx0 xsx0Var2 = (xsx0) wb4.a.getAndSetObject(this, f, xsx0Var);
        if (xsx0Var2 == null) {
            return null;
        }
        return b(xsx0Var2);
    }

    public final xsx0 b(xsx0 xsx0Var) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c;
        if (atomicIntegerFieldUpdater.get(this) - d.get(this) == 127) {
            return xsx0Var;
        }
        if (xsx0Var.b) {
            e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & HProv.PP_VERSION_TIMESTAMP;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.a;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, xsx0Var);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final int c() {
        b.getClass();
        Object objectVolatile = wb4.a.getObjectVolatile(this, f);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = c;
        return objectVolatile != null ? (atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this)) + 1 : atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this);
    }

    public final void d(gjt gjtVar) {
        b.getClass();
        xsx0 xsx0Var = (xsx0) wb4.a.getAndSetObject(this, f, (Object) null);
        if (xsx0Var != null) {
            gjtVar.a(xsx0Var);
        }
        while (true) {
            xsx0 f2 = f();
            if (f2 == null) {
                return;
            } else {
                gjtVar.a(f2);
            }
        }
    }

    public final xsx0 e() {
        b.getClass();
        xsx0 xsx0Var = (xsx0) wb4.a.getAndSetObject(this, f, (Object) null);
        return xsx0Var == null ? f() : xsx0Var;
    }

    public final xsx0 f() {
        xsx0 xsx0Var;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - c.get(this) == 0) {
                return null;
            }
            int i2 = i & HProv.PP_VERSION_TIMESTAMP;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (xsx0Var = (xsx0) this.a.getAndSet(i2, null)) != null) {
                if (xsx0Var.b) {
                    e.decrementAndGet(this);
                }
                return xsx0Var;
            }
        }
    }

    public final xsx0 g() {
        z951 z951Var;
        while (true) {
            b.getClass();
            Unsafe unsafe = wb4.a;
            long j = f;
            xsx0 xsx0Var = (xsx0) unsafe.getObjectVolatile(this, j);
            if (xsx0Var != null && xsx0Var.b) {
                while (true) {
                    Unsafe unsafe2 = wb4.a;
                    z951Var = this;
                    if (unsafe2.compareAndSwapObject(z951Var, f, xsx0Var, (Object) null)) {
                        return xsx0Var;
                    }
                    if (unsafe2.getObjectVolatile(z951Var, j) != xsx0Var) {
                        break;
                    }
                    this = z951Var;
                }
            }
            this = z951Var;
        }
        z951 z951Var2 = this;
        int i = d.get(z951Var2);
        int i2 = c.get(z951Var2);
        while (i != i2 && e.get(z951Var2) != 0) {
            i2--;
            xsx0 h = z951Var2.h(i2, true);
            if (h != null) {
                return h;
            }
        }
        return null;
    }

    public final xsx0 h(int i, boolean z) {
        int i2 = i & HProv.PP_VERSION_TIMESTAMP;
        AtomicReferenceArray atomicReferenceArray = this.a;
        xsx0 xsx0Var = (xsx0) atomicReferenceArray.get(i2);
        if (xsx0Var != null && xsx0Var.b == z) {
            while (!atomicReferenceArray.compareAndSet(i2, xsx0Var, null)) {
                if (atomicReferenceArray.get(i2) != xsx0Var) {
                }
            }
            if (z) {
                e.decrementAndGet(this);
            }
            return xsx0Var;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, xsx0] */
    public final long i(int i, Ref$ObjectRef ref$ObjectRef) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ?? r1;
        do {
            atomicReferenceFieldUpdater = b;
            atomicReferenceFieldUpdater.getClass();
            r1 = (xsx0) wb4.a.getObjectVolatile(this, f);
            if (r1 == 0) {
                return -2L;
            }
            if (((r1.b ? 1 : 2) & i) == 0) {
                return -2L;
            }
            otx0.f.getClass();
            long nanoTime = System.nanoTime() - r1.a;
            long j = otx0.b;
            if (nanoTime < j) {
                return j - nanoTime;
            }
        } while (!smw0.C(atomicReferenceFieldUpdater, this, r1));
        ref$ObjectRef.element = r1;
        return -1L;
    }
}
