package yc;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class r0 extends s0 implements f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8896m = AtomicReferenceFieldUpdater.newUpdater(r0.class, Object.class, "_queue$volatile");

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8897n = AtomicReferenceFieldUpdater.newUpdater(r0.class, Object.class, "_delayed$volatile");

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8898o = AtomicIntegerFieldUpdater.newUpdater(r0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d1, code lost:
    
        if ((((int) (1073741823 & r7)) == ((int) ((r7 & 1152921503533105152L) >> 30))) == false) goto L97;
     */
    @Override // yc.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long D() {
        Runnable runnable;
        p0 p0Var;
        p0 b2;
        if (!E()) {
            q0 q0Var = (q0) f8897n.get(this);
            if (q0Var != null && dd.z.f1893b.get(q0Var) != 0) {
                long nanoTime = System.nanoTime();
                do {
                    synchronized (q0Var) {
                        try {
                            p0[] p0VarArr = q0Var.f1894a;
                            p0 p0Var2 = p0VarArr != null ? p0VarArr[0] : null;
                            if (p0Var2 == null) {
                                b2 = null;
                            } else {
                                b2 = ((nanoTime - p0Var2.f8890g) > 0L ? 1 : ((nanoTime - p0Var2.f8890g) == 0L ? 0 : -1)) >= 0 ? H(p0Var2) : false ? q0Var.b(0) : null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } while (b2 != null);
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8896m;
            loop1: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj == null) {
                    break;
                }
                if (!(obj instanceof dd.n)) {
                    if (obj != a0.f8820c) {
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
                dd.n nVar = (dd.n) obj;
                Object d10 = nVar.d();
                if (d10 != dd.n.f1875g) {
                    runnable = (Runnable) d10;
                    break;
                }
                dd.n c3 = nVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            runnable = null;
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            bc.k kVar = this.f8903k;
            if (((kVar == null || kVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = f8896m.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof dd.n) {
                        long j3 = dd.n.f1874f.get((dd.n) obj2);
                    } else if (obj2 == a0.f8820c) {
                        return Long.MAX_VALUE;
                    }
                }
                q0 q0Var2 = (q0) f8897n.get(this);
                if (q0Var2 != null) {
                    synchronized (q0Var2) {
                        p0[] p0VarArr2 = q0Var2.f1894a;
                        p0Var = p0VarArr2 != null ? p0VarArr2[0] : null;
                    }
                    if (p0Var != null) {
                        long nanoTime2 = p0Var.f8890g - System.nanoTime();
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

    public void G(Runnable runnable) {
        if (!H(runnable)) {
            b0.f8832p.G(runnable);
            return;
        }
        Thread B = B();
        if (Thread.currentThread() != B) {
            LockSupport.unpark(B);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean H(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8896m;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f8898o.get(this) == 0) {
                if (obj != null) {
                    if (!(obj instanceof dd.n)) {
                        if (obj != a0.f8820c) {
                            dd.n nVar = new dd.n(8, true);
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
                    dd.n nVar2 = (dd.n) obj;
                    int a6 = nVar2.a(runnable);
                    if (a6 == 0) {
                        break;
                    }
                    if (a6 == 1) {
                        dd.n c3 = nVar2.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (a6 == 2) {
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
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if ((dd.z.f1893b.get(r0) == 0) == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean I() {
        bc.k kVar = this.f8903k;
        if (kVar != null ? kVar.isEmpty() : true) {
            q0 q0Var = (q0) f8897n.get(this);
            if (q0Var != null) {
            }
            Object obj = f8896m.get(this);
            if (obj != null) {
                if (obj instanceof dd.n) {
                    long j3 = dd.n.f1874f.get((dd.n) obj);
                    return ((int) (1073741823 & j3)) == ((int) ((j3 & 1152921503533105152L) >> 30));
                }
                if (obj == a0.f8820c) {
                }
            }
            return true;
        }
        return false;
    }

    public final void J(long j3, p0 p0Var) {
        int b2;
        Thread B;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8897n;
        if (f8898o.get(this) != 0) {
            b2 = 1;
        } else {
            q0 q0Var = (q0) atomicReferenceFieldUpdater.get(this);
            if (q0Var == null) {
                q0 q0Var2 = new q0();
                q0Var2.f8892c = j3;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, q0Var2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                pc.j.b(obj);
                q0Var = (q0) obj;
            }
            b2 = p0Var.b(j3, q0Var, this);
        }
        if (b2 != 0) {
            if (b2 == 1) {
                F(j3, p0Var);
                return;
            } else {
                if (b2 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        q0 q0Var3 = (q0) atomicReferenceFieldUpdater.get(this);
        if (q0Var3 != null) {
            synchronized (q0Var3) {
                p0[] p0VarArr = q0Var3.f1894a;
                r2 = p0VarArr != null ? p0VarArr[0] : null;
            }
        }
        if (r2 != p0Var || Thread.currentThread() == (B = B())) {
            return;
        }
        LockSupport.unpark(B);
    }

    public k0 f(long j3, w1 w1Var, fc.i iVar) {
        return c0.f8836a.f(j3, w1Var, iVar);
    }

    @Override // yc.f0
    public final void s(long j3, g gVar) {
        long j6 = j3 > 0 ? j3 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j3 : 0L;
        if (j6 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            n0 n0Var = new n0(this, j6 + nanoTime, gVar);
            J(nanoTime, n0Var);
            gVar.t(new e(2, n0Var));
        }
    }

    @Override // yc.s0
    public void shutdown() {
        p0 b2;
        u1.f8908a.set(null);
        f8898o.set(this, 1);
        dd.w wVar = a0.f8820c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8896m;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof dd.n)) {
                    if (obj != wVar) {
                        dd.n nVar = new dd.n(8, true);
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
                ((dd.n) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, wVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (D() <= 0) {
        }
        long nanoTime = System.nanoTime();
        while (true) {
            q0 q0Var = (q0) f8897n.get(this);
            if (q0Var == null) {
                return;
            }
            synchronized (q0Var) {
                b2 = dd.z.f1893b.get(q0Var) > 0 ? q0Var.b(0) : null;
            }
            if (b2 == null) {
                return;
            } else {
                F(nanoTime, b2);
            }
        }
    }

    @Override // yc.u
    public final void w(fc.i iVar, Runnable runnable) {
        G(runnable);
    }
}
