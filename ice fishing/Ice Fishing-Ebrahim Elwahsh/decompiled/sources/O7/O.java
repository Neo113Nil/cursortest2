package O7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import r7.C4977h;
import v7.InterfaceC5138i;

/* loaded from: classes2.dex */
public abstract class O extends P implements C {
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2566z = AtomicReferenceFieldUpdater.newUpdater(O.class, Object.class, "_queue$volatile");

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2564A = AtomicReferenceFieldUpdater.newUpdater(O.class, Object.class, "_delayed$volatile");

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2565B = AtomicIntegerFieldUpdater.newUpdater(O.class, "_isCompleted$volatile");

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d1, code lost:
    
        if ((((int) (1073741823 & r7)) == ((int) ((r7 & 1152921503533105152L) >> 30))) == false) goto L93;
     */
    @Override // O7.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long E() {
        Runnable runnable;
        M m8;
        M b9;
        if (!F()) {
            N n9 = (N) f2564A.get(this);
            if (n9 != null && T7.y.f3176b.get(n9) != 0) {
                long nanoTime = System.nanoTime();
                do {
                    synchronized (n9) {
                        try {
                            M[] mArr = n9.f3177a;
                            M m9 = mArr != null ? mArr[0] : null;
                            if (m9 == null) {
                                b9 = null;
                            } else {
                                b9 = ((nanoTime - m9.f2561n) > 0L ? 1 : ((nanoTime - m9.f2561n) == 0L ? 0 : -1)) >= 0 ? I(m9) : false ? n9.b(0) : null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } while (b9 != null);
            }
            loop1: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2566z;
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj == null) {
                    break;
                }
                if (!(obj instanceof T7.n)) {
                    if (obj != AbstractC0399y.f2645c) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        runnable = (Runnable) obj;
                        break loop1;
                    }
                    break;
                }
                T7.n nVar = (T7.n) obj;
                Object d2 = nVar.d();
                if (d2 != T7.n.f3157g) {
                    runnable = (Runnable) d2;
                    break;
                }
                T7.n c4 = nVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c4) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            runnable = null;
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            C4977h c4977h = this.f2570x;
            if (((c4977h == null || c4977h.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = f2566z.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof T7.n) {
                        long j9 = T7.n.f3156f.get((T7.n) obj2);
                    } else if (obj2 == AbstractC0399y.f2645c) {
                        return Long.MAX_VALUE;
                    }
                }
                N n10 = (N) f2564A.get(this);
                if (n10 != null) {
                    synchronized (n10) {
                        M[] mArr2 = n10.f3177a;
                        m8 = mArr2 != null ? mArr2[0] : null;
                    }
                    if (m8 != null) {
                        long nanoTime2 = m8.f2561n - System.nanoTime();
                        if (nanoTime2 >= 0) {
                            return nanoTime2;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public void H(Runnable runnable) {
        if (!I(runnable)) {
            RunnableC0400z.f2652C.H(runnable);
            return;
        }
        Thread C7 = C();
        if (Thread.currentThread() != C7) {
            LockSupport.unpark(C7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean I(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2566z;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(f2565B.get(this) != 0)) {
                if (obj != null) {
                    if (!(obj instanceof T7.n)) {
                        if (obj != AbstractC0399y.f2645c) {
                            T7.n nVar = new T7.n(8, true);
                            nVar.a((Runnable) obj);
                            nVar.a(runnable);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    T7.n nVar2 = (T7.n) obj;
                    int a9 = nVar2.a(runnable);
                    if (a9 == 0) {
                        break;
                    }
                    if (a9 == 1) {
                        T7.n c4 = nVar2.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c4) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (a9 == 2) {
                        break;
                    }
                } else {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    }
                    break loop0;
                }
            } else {
                break;
            }
        }
        return false;
    }

    public final boolean J() {
        N n9;
        C4977h c4977h = this.f2570x;
        if (!(c4977h != null ? c4977h.isEmpty() : true) || ((n9 = (N) f2564A.get(this)) != null && T7.y.f3176b.get(n9) != 0)) {
            return false;
        }
        Object obj = f2566z.get(this);
        if (obj != null) {
            if (obj instanceof T7.n) {
                long j9 = T7.n.f3156f.get((T7.n) obj);
                return ((int) (1073741823 & j9)) == ((int) ((j9 & 1152921503533105152L) >> 30));
            }
            if (obj != AbstractC0399y.f2645c) {
                return false;
            }
        }
        return true;
    }

    public final void K(long j9, M m8) {
        int c4;
        Thread C7;
        boolean z8 = f2565B.get(this) != 0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2564A;
        if (z8) {
            c4 = 1;
        } else {
            N n9 = (N) atomicReferenceFieldUpdater.get(this);
            if (n9 == null) {
                N n10 = new N();
                n10.f2563c = j9;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, n10) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                kotlin.jvm.internal.h.b(obj);
                n9 = (N) obj;
            }
            c4 = m8.c(j9, n9, this);
        }
        if (c4 != 0) {
            if (c4 == 1) {
                G(j9, m8);
                return;
            } else {
                if (c4 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        N n11 = (N) atomicReferenceFieldUpdater.get(this);
        if (n11 != null) {
            synchronized (n11) {
                M[] mArr = n11.f3177a;
                r4 = mArr != null ? mArr[0] : null;
            }
        }
        if (r4 != m8 || Thread.currentThread() == (C7 = C())) {
            return;
        }
        LockSupport.unpark(C7);
    }

    @Override // O7.C
    public H b(long j9, t0 t0Var, InterfaceC5138i interfaceC5138i) {
        return A.f2547a.b(j9, t0Var, interfaceC5138i);
    }

    @Override // O7.C
    public final void k(long j9, C0382g c0382g) {
        long j10 = j9 > 0 ? j9 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j9 : 0L;
        if (j10 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            K k6 = new K(this, j10 + nanoTime, c0382g);
            K(nanoTime, k6);
            c0382g.t(new C0380e(1, k6));
        }
    }

    @Override // O7.AbstractC0395u
    public final void p(InterfaceC5138i interfaceC5138i, Runnable runnable) {
        H(runnable);
    }

    @Override // O7.P
    public void shutdown() {
        M b9;
        q0.f2620a.set(null);
        f2565B.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2566z;
            Object obj = atomicReferenceFieldUpdater.get(this);
            T7.v vVar = AbstractC0399y.f2645c;
            if (obj != null) {
                if (!(obj instanceof T7.n)) {
                    if (obj != vVar) {
                        T7.n nVar = new T7.n(8, true);
                        nVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((T7.n) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, vVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (E() <= 0) {
        }
        long nanoTime = System.nanoTime();
        while (true) {
            N n9 = (N) f2564A.get(this);
            if (n9 == null) {
                return;
            }
            synchronized (n9) {
                b9 = T7.y.f3176b.get(n9) > 0 ? n9.b(0) : null;
            }
            if (b9 == null) {
                return;
            } else {
                G(nanoTime, b9);
            }
        }
    }
}
