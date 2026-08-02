package S7;

import E2.C0316m;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import v7.C5117h;
import z7.InterfaceC5245i;

/* loaded from: classes2.dex */
public abstract class O extends P implements C {
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3013z = AtomicReferenceFieldUpdater.newUpdater(O.class, Object.class, "_queue$volatile");

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3011A = AtomicReferenceFieldUpdater.newUpdater(O.class, Object.class, "_delayed$volatile");

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3012B = AtomicIntegerFieldUpdater.newUpdater(O.class, "_isCompleted$volatile");

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d1, code lost:
    
        if ((((int) (1073741823 & r7)) == ((int) ((r7 & 1152921503533105152L) >> 30))) == false) goto L93;
     */
    @Override // S7.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long E() {
        Runnable runnable;
        M m9;
        M b9;
        if (!F()) {
            N n9 = (N) f3011A.get(this);
            if (n9 != null && X7.x.f3822b.get(n9) != 0) {
                long nanoTime = System.nanoTime();
                do {
                    synchronized (n9) {
                        try {
                            M[] mArr = n9.f3823a;
                            M m10 = mArr != null ? mArr[0] : null;
                            if (m10 == null) {
                                b9 = null;
                            } else {
                                b9 = ((nanoTime - m10.f3008n) > 0L ? 1 : ((nanoTime - m10.f3008n) == 0L ? 0 : -1)) >= 0 ? I(m10) : false ? n9.b(0) : null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } while (b9 != null);
            }
            loop1: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3013z;
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj == null) {
                    break;
                }
                if (!(obj instanceof X7.n)) {
                    if (obj != AbstractC0410y.f3092c) {
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
                X7.n nVar = (X7.n) obj;
                Object d9 = nVar.d();
                if (d9 != X7.n.f3806g) {
                    runnable = (Runnable) d9;
                    break;
                }
                X7.n c9 = nVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c9) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            runnable = null;
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            C5117h c5117h = this.f3017x;
            if (((c5117h == null || c5117h.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = f3013z.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof X7.n) {
                        long j6 = X7.n.f3805f.get((X7.n) obj2);
                    } else if (obj2 == AbstractC0410y.f3092c) {
                        return Long.MAX_VALUE;
                    }
                }
                N n10 = (N) f3011A.get(this);
                if (n10 != null) {
                    synchronized (n10) {
                        M[] mArr2 = n10.f3823a;
                        m9 = mArr2 != null ? mArr2[0] : null;
                    }
                    if (m9 != null) {
                        long nanoTime2 = m9.f3008n - System.nanoTime();
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
            RunnableC0411z.f3099C.H(runnable);
            return;
        }
        Thread C8 = C();
        if (Thread.currentThread() != C8) {
            LockSupport.unpark(C8);
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
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3013z;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(f3012B.get(this) != 0)) {
                if (obj != null) {
                    if (!(obj instanceof X7.n)) {
                        if (obj != AbstractC0410y.f3092c) {
                            X7.n nVar = new X7.n(8, true);
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
                    X7.n nVar2 = (X7.n) obj;
                    int a9 = nVar2.a(runnable);
                    if (a9 == 0) {
                        break;
                    }
                    if (a9 == 1) {
                        X7.n c9 = nVar2.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c9) && atomicReferenceFieldUpdater.get(this) == obj) {
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
        C5117h c5117h = this.f3017x;
        if (!(c5117h != null ? c5117h.isEmpty() : true) || ((n9 = (N) f3011A.get(this)) != null && X7.x.f3822b.get(n9) != 0)) {
            return false;
        }
        Object obj = f3013z.get(this);
        if (obj != null) {
            if (obj instanceof X7.n) {
                long j6 = X7.n.f3805f.get((X7.n) obj);
                return ((int) (1073741823 & j6)) == ((int) ((j6 & 1152921503533105152L) >> 30));
            }
            if (obj != AbstractC0410y.f3092c) {
                return false;
            }
        }
        return true;
    }

    public final void K(long j6, M m9) {
        int c9;
        Thread C8;
        boolean z6 = f3012B.get(this) != 0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3011A;
        if (z6) {
            c9 = 1;
        } else {
            N n9 = (N) atomicReferenceFieldUpdater.get(this);
            if (n9 == null) {
                N n10 = new N();
                n10.f3010c = j6;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, n10) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                kotlin.jvm.internal.h.b(obj);
                n9 = (N) obj;
            }
            c9 = m9.c(j6, n9, this);
        }
        if (c9 != 0) {
            if (c9 == 1) {
                G(j6, m9);
                return;
            } else {
                if (c9 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        N n11 = (N) atomicReferenceFieldUpdater.get(this);
        if (n11 != null) {
            synchronized (n11) {
                M[] mArr = n11.f3823a;
                r4 = mArr != null ? mArr[0] : null;
            }
        }
        if (r4 != m9 || Thread.currentThread() == (C8 = C())) {
            return;
        }
        LockSupport.unpark(C8);
    }

    @Override // S7.C
    public H b(long j6, t0 t0Var, InterfaceC5245i interfaceC5245i) {
        return A.f2994a.b(j6, t0Var, interfaceC5245i);
    }

    @Override // S7.C
    public final void k(long j6, C0393g c0393g) {
        long j9 = j6 > 0 ? j6 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j6 : 0L;
        if (j9 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            K k9 = new K(this, j9 + nanoTime, c0393g);
            K(nanoTime, k9);
            c0393g.t(new C0391e(1, k9));
        }
    }

    @Override // S7.AbstractC0406u
    public final void p(InterfaceC5245i interfaceC5245i, Runnable runnable) {
        H(runnable);
    }

    @Override // S7.P
    public void shutdown() {
        M b9;
        q0.f3067a.set(null);
        f3012B.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3013z;
            Object obj = atomicReferenceFieldUpdater.get(this);
            C0316m c0316m = AbstractC0410y.f3092c;
            if (obj != null) {
                if (!(obj instanceof X7.n)) {
                    if (obj != c0316m) {
                        X7.n nVar = new X7.n(8, true);
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
                ((X7.n) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c0316m)) {
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
            N n9 = (N) f3011A.get(this);
            if (n9 == null) {
                return;
            }
            synchronized (n9) {
                b9 = X7.x.f3822b.get(n9) > 0 ? n9.b(0) : null;
            }
            if (b9 == null) {
                return;
            } else {
                G(nanoTime, b9);
            }
        }
    }
}
