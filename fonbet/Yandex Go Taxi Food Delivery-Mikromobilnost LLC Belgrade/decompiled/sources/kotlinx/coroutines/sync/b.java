package kotlinx.coroutines.sync;

import defpackage.b64;
import defpackage.cma1;
import defpackage.cvw;
import defpackage.dvw;
import defpackage.fcq0;
import defpackage.i18;
import defpackage.iq6;
import defpackage.j18;
import defpackage.jb20;
import defpackage.k041;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.qnq0;
import defpackage.qv10;
import defpackage.rnq0;
import defpackage.rzo;
import defpackage.s7q0;
import defpackage.w511;
import defpackage.wb4;
import defpackage.zy11;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import sun.misc.Unsafe;

/* loaded from: classes9.dex */
public class b {
    public static final /* synthetic */ long A;
    public static final /* synthetic */ long B;
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater w;
    public static final /* synthetic */ AtomicReferenceFieldUpdater x;
    public static final /* synthetic */ AtomicLongFieldUpdater y;
    public static final /* synthetic */ AtomicIntegerFieldUpdater z;
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final int a;
    public final iq6 b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Unsafe unsafe = wb4.a;
        A = unsafe.objectFieldOffset(b.class.getDeclaredField("head$volatile"));
        w = AtomicLongFieldUpdater.newUpdater(b.class, "deqIdx$volatile");
        x = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "tail$volatile");
        B = unsafe.objectFieldOffset(b.class.getDeclaredField("tail$volatile"));
        y = AtomicLongFieldUpdater.newUpdater(b.class, "enqIdx$volatile");
        z = AtomicIntegerFieldUpdater.newUpdater(b.class, "_availablePermits$volatile");
    }

    public b(int i, int i2) {
        this.a = i;
        if (i <= 0) {
            w511.f(oyr.i(i, "Semaphore should have at least 1 permit, but had "));
            throw null;
        }
        if (i2 < 0 || i2 > i) {
            w511.f(oyr.i(i, "The number of acquired permits should be in 0.."));
            throw null;
        }
        rnq0 rnq0Var = new rnq0(0L, null, 2);
        this.head$volatile = rnq0Var;
        this.tail$volatile = rnq0Var;
        this._availablePermits$volatile = i - i2;
        this.b = new iq6(3, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0025, code lost:
    
        r5.q(r3, r4.b);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i;
        do {
            atomicIntegerFieldUpdater = z;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i = this.a;
        } while (andDecrement > i);
        zy11 zy11Var = zy11.a;
        if (andDecrement <= 0) {
            j18 V = cma1.V(dvw.b(continuationImpl));
            try {
                if (!e(V)) {
                    while (true) {
                        int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                        if (andDecrement2 <= i) {
                            if (andDecrement2 > 0) {
                                break;
                            }
                            if (e(V)) {
                                break;
                            }
                        }
                    }
                }
                Object s = V.s();
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (s != coroutineSingletons) {
                    s = zy11Var;
                }
                if (s == coroutineSingletons) {
                    return s;
                }
            } catch (Throwable th) {
                V.C();
                throw th;
            }
        }
        return zy11Var;
    }

    public final boolean e(k041 k041Var) {
        Object y2;
        Unsafe unsafe;
        b bVar = this;
        x.getClass();
        Unsafe unsafe2 = wb4.a;
        long j = B;
        rnq0 rnq0Var = (rnq0) unsafe2.getObjectVolatile(bVar, j);
        long andIncrement = y.getAndIncrement(bVar);
        SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 = SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1.b;
        long j2 = andIncrement / qnq0.f;
        loop0: while (true) {
            y2 = rzo.y(rnq0Var, j2, semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1);
            if (cvw.O(y2)) {
                break;
            }
            s7q0 H = cvw.H(y2);
            while (true) {
                s7q0 s7q0Var = (s7q0) wb4.a.getObjectVolatile(bVar, j);
                if (s7q0Var.x >= H.x) {
                    bVar = this;
                    break loop0;
                }
                if (!H.o()) {
                    break;
                }
                do {
                    unsafe = wb4.a;
                    bVar = this;
                    if (unsafe.compareAndSwapObject(bVar, B, s7q0Var, H)) {
                        if (s7q0Var.k()) {
                            s7q0Var.i();
                        }
                    }
                } while (unsafe.getObjectVolatile(bVar, j) == s7q0Var);
                if (H.k()) {
                    H.i();
                }
            }
            bVar = this;
        }
        rnq0 rnq0Var2 = (rnq0) cvw.H(y2);
        AtomicReferenceArray atomicReferenceArray = rnq0Var2.z;
        int i = (int) (andIncrement % qnq0.f);
        while (!atomicReferenceArray.compareAndSet(i, null, k041Var)) {
            if (atomicReferenceArray.get(i) != null) {
                jb20 jb20Var = qnq0.b;
                jb20 jb20Var2 = qnq0.c;
                while (!atomicReferenceArray.compareAndSet(i, jb20Var, jb20Var2)) {
                    if (atomicReferenceArray.get(i) != jb20Var) {
                        return false;
                    }
                }
                ((i18) k041Var).q(zy11.a, bVar.b);
                return true;
            }
        }
        k041Var.c(rnq0Var2, i);
        return true;
    }

    public final void f() {
        int i;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = z;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.a;
            if (andIncrement >= i2) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i2) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                ny61.r(qv10.g(i2, "The number of released permits cannot be greater than "));
                return;
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!g());
    }

    public final boolean g() {
        Object y2;
        Unsafe unsafe;
        c.getClass();
        Unsafe unsafe2 = wb4.a;
        long j = A;
        rnq0 rnq0Var = (rnq0) unsafe2.getObjectVolatile(this, j);
        long andIncrement = w.getAndIncrement(this);
        long j2 = andIncrement / qnq0.f;
        SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 = SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1.b;
        loop0: while (true) {
            y2 = rzo.y(rnq0Var, j2, semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1);
            if (cvw.O(y2)) {
                break;
            }
            s7q0 H = cvw.H(y2);
            while (true) {
                s7q0 s7q0Var = (s7q0) wb4.a.getObjectVolatile(this, j);
                if (s7q0Var.x >= H.x) {
                    break loop0;
                }
                if (!H.o()) {
                    break;
                }
                do {
                    unsafe = wb4.a;
                    if (unsafe.compareAndSwapObject(this, A, s7q0Var, H)) {
                        if (s7q0Var.k()) {
                            s7q0Var.i();
                        }
                    }
                } while (unsafe.getObjectVolatile(this, j) == s7q0Var);
                if (H.k()) {
                    H.i();
                }
            }
        }
        rnq0 rnq0Var2 = (rnq0) cvw.H(y2);
        AtomicReferenceArray atomicReferenceArray = rnq0Var2.z;
        rnq0Var2.b();
        boolean z2 = false;
        if (rnq0Var2.x <= j2) {
            int i = (int) (andIncrement % qnq0.f);
            Object andSet = atomicReferenceArray.getAndSet(i, qnq0.b);
            if (andSet == null) {
                int i2 = qnq0.a;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (atomicReferenceArray.get(i) == qnq0.c) {
                        return true;
                    }
                }
                jb20 jb20Var = qnq0.b;
                jb20 jb20Var2 = qnq0.d;
                while (true) {
                    if (atomicReferenceArray.compareAndSet(i, jb20Var, jb20Var2)) {
                        z2 = true;
                        break;
                    }
                    if (atomicReferenceArray.get(i) != jb20Var) {
                        break;
                    }
                }
                return !z2;
            }
            if (andSet != qnq0.e) {
                boolean z3 = andSet instanceof i18;
                zy11 zy11Var = zy11.a;
                if (!z3) {
                    if (andSet instanceof fcq0) {
                        return ((kotlinx.coroutines.selects.b) ((fcq0) andSet)).k(this, zy11Var);
                    }
                    ny61.r(b64.i("unexpected: ", andSet));
                    return false;
                }
                i18 i18Var = (i18) andSet;
                jb20 m = i18Var.m(zy11Var, this.b);
                if (m != null) {
                    i18Var.j(m);
                    return true;
                }
            }
        }
        return false;
    }
}
