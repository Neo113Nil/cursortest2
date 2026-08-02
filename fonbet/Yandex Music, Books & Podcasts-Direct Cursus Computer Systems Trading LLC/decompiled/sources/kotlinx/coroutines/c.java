package kotlinx.coroutines;

import defpackage.js3;
import defpackage.nib;
import defpackage.ot3;
import defpackage.pib;
import defpackage.qa8;
import defpackage.qib;
import defpackage.qqg;
import defpackage.rfs;
import defpackage.rib;
import defpackage.sib;
import defpackage.xq0;
import defpackage.xu7;
import defpackage.yfs;
import defpackage.zl7;
import defpackage.zt3;
import defpackage.zx0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public abstract class c extends rib implements xu7 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater j = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    @Override // kotlinx.coroutines.a
    public final void F0(CoroutineContext coroutineContext, Runnable runnable) {
        Q0(runnable);
    }

    @Override // defpackage.rib
    public final long N0() {
        Runnable runnable;
        pib pibVar;
        js3 js3Var = sib.b;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        if (!O0()) {
            R0();
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj == null) {
                    break;
                }
                if (!(obj instanceof qqg)) {
                    if (obj != js3Var) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        runnable = (Runnable) obj;
                        break loop0;
                    }
                    break;
                }
                qqg qqgVar = (qqg) obj;
                Object d = qqgVar.d();
                if (d != qqg.g) {
                    runnable = (Runnable) d;
                    break;
                }
                qqg c = qqgVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            runnable = null;
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            zx0 zx0Var = this.f;
            if (((zx0Var == null || zx0Var.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof qqg) {
                        long j2 = qqg.f.get((qqg) obj2);
                        if (((int) (1073741823 & j2)) != ((int) ((j2 & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == js3Var) {
                        return Long.MAX_VALUE;
                    }
                }
                qib qibVar = (qib) i.get(this);
                if (qibVar != null) {
                    synchronized (qibVar) {
                        pib[] pibVarArr = qibVar.a;
                        pibVar = pibVarArr != null ? pibVarArr[0] : null;
                    }
                    if (pibVar != null) {
                        long nanoTime = pibVar.a - System.nanoTime();
                        if (nanoTime >= 0) {
                            return nanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    @Override // defpackage.xu7
    public final void Q(long j2, zt3 zt3Var) {
        long j3 = j2 > 0 ? j2 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j2 : 0L;
        if (j3 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            nib nibVar = new nib(this, j3 + nanoTime, zt3Var);
            U0(nanoTime, nibVar);
            zt3Var.v(new ot3(2, nibVar));
        }
    }

    public void Q0(Runnable runnable) {
        R0();
        if (!S0(runnable)) {
            b.k.Q0(runnable);
            return;
        }
        Thread L0 = L0();
        if (Thread.currentThread() != L0) {
            LockSupport.unpark(L0);
        }
    }

    public final void R0() {
        pib pibVar;
        qib qibVar = (qib) i.get(this);
        if (qibVar == null || yfs.b.get(qibVar) == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (qibVar) {
                try {
                    pib[] pibVarArr = qibVar.a;
                    pib pibVar2 = pibVarArr != null ? pibVarArr[0] : null;
                    if (pibVar2 != null) {
                        pibVar = ((nanoTime - pibVar2.a) > 0L ? 1 : ((nanoTime - pibVar2.a) == 0L ? 0 : -1)) >= 0 ? S0(pibVar2) : false ? qibVar.b(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (pibVar != null);
    }

    public qa8 S(long j2, Runnable runnable, CoroutineContext coroutineContext) {
        return zl7.a.S(j2, runnable, coroutineContext);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean S0(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (j.get(this) != 1) {
                if (obj != null) {
                    if (!(obj instanceof qqg)) {
                        if (obj != sib.b) {
                            qqg qqgVar = new qqg(8, true);
                            qqgVar.a((Runnable) obj);
                            qqgVar.a(runnable);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, qqgVar)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        return false;
                    }
                    qqg qqgVar2 = (qqg) obj;
                    int a = qqgVar2.a(runnable);
                    if (a == 0) {
                        break;
                    }
                    if (a == 1) {
                        qqg c = qqgVar2.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (a == 2) {
                        return false;
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
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if ((defpackage.yfs.b.get(r0) == 0) == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean T0() {
        zx0 zx0Var = this.f;
        if (zx0Var != null ? zx0Var.isEmpty() : true) {
            qib qibVar = (qib) i.get(this);
            if (qibVar != null) {
            }
            Object obj = h.get(this);
            if (obj != null) {
                if (obj instanceof qqg) {
                    long j2 = qqg.f.get((qqg) obj);
                    return ((int) (1073741823 & j2)) == ((int) ((j2 & 1152921503533105152L) >> 30));
                }
                if (obj == sib.b) {
                }
            }
            return true;
        }
        return false;
    }

    public final void U0(long j2, pib pibVar) {
        int b;
        Thread L0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
        if (j.get(this) == 1) {
            b = 1;
        } else {
            qib qibVar = (qib) atomicReferenceFieldUpdater.get(this);
            if (qibVar == null) {
                qib qibVar2 = new qib();
                qibVar2.c = j2;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, qibVar2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                obj.getClass();
                qibVar = (qib) obj;
            }
            b = pibVar.b(j2, qibVar, this);
        }
        if (b != 0) {
            if (b == 1) {
                P0(j2, pibVar);
                return;
            } else {
                if (b == 2) {
                    return;
                }
                xq0.q("unexpected result");
                return;
            }
        }
        qib qibVar3 = (qib) atomicReferenceFieldUpdater.get(this);
        if (qibVar3 != null) {
            synchronized (qibVar3) {
                pib[] pibVarArr = qibVar3.a;
                r2 = pibVarArr != null ? pibVarArr[0] : null;
            }
        }
        if (r2 != pibVar || Thread.currentThread() == (L0 = L0())) {
            return;
        }
        LockSupport.unpark(L0);
    }

    @Override // defpackage.rib
    public void shutdown() {
        pib b;
        rfs.a.set(null);
        j.set(this, 1);
        js3 js3Var = sib.b;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof qqg)) {
                    if (obj != js3Var) {
                        qqg qqgVar = new qqg(8, true);
                        qqgVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, qqgVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((qqg) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, js3Var)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (N0() <= 0) {
        }
        long nanoTime = System.nanoTime();
        while (true) {
            qib qibVar = (qib) i.get(this);
            if (qibVar == null) {
                return;
            }
            synchronized (qibVar) {
                b = yfs.b.get(qibVar) > 0 ? qibVar.b(0) : null;
            }
            if (b == null) {
                return;
            } else {
                P0(nanoTime, b);
            }
        }
    }
}
