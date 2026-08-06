package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class vq extends qq implements wk {
    public static final /* synthetic */ AtomicReferenceFieldUpdater E7jCp8Ls;
    public static final /* synthetic */ AtomicIntegerFieldUpdater XnEVoBF0td1l;
    public static final /* synthetic */ long iwATDS1i01k;
    public static final /* synthetic */ AtomicReferenceFieldUpdater rQPn8YBR = AtomicReferenceFieldUpdater.newUpdater(vq.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ long uFEq9NpZ;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        Unsafe unsafe = o9.GWasM1elztuh;
        iwATDS1i01k = unsafe.objectFieldOffset(vq.class.getDeclaredField("_queue$volatile"));
        E7jCp8Ls = AtomicReferenceFieldUpdater.newUpdater(vq.class, Object.class, "_delayed$volatile");
        uFEq9NpZ = unsafe.objectFieldOffset(vq.class.getDeclaredField("_delayed$volatile"));
        XnEVoBF0td1l = AtomicIntegerFieldUpdater.newUpdater(vq.class, "_isCompleted$volatile");
    }

    public final void A1EKNP6CxJ(long j, tq tqVar) {
        Thread EXrPz3p7hFb;
        int MZhzXH72 = MZhzXH72(j, tqVar);
        if (MZhzXH72 == 0) {
            if (!DmJncFq5(tqVar) || Thread.currentThread() == (EXrPz3p7hFb = EXrPz3p7hFb())) {
                return;
            }
            LockSupport.unpark(EXrPz3p7hFb);
            return;
        }
        if (MZhzXH72 == 1) {
            AEn1Rrio(j, tqVar);
        } else {
            if (MZhzXH72 == 2) {
                return;
            }
            o4.jivtDDk9H("unexpected result");
        }
    }

    public void AEn1Rrio(long j, tq tqVar) {
        bk.WIEu4Ya2g8.A1EKNP6CxJ(j, tqVar);
    }

    public final boolean DmJncFq5(tq tqVar) {
        E7jCp8Ls.getClass();
        uq uqVar = (uq) o9.GWasM1elztuh.getObjectVolatile(this, uFEq9NpZ);
        if (uqVar != null) {
            synchronized (uqVar) {
                tq[] tqVarArr = uqVar.GWasM1elztuh;
                r0 = tqVarArr != null ? tqVarArr[0] : null;
            }
        }
        return r0 == tqVar;
    }

    public abstract Thread EXrPz3p7hFb();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean M3K9sHhK(Runnable runnable) {
        vq vqVar;
        Runnable runnable2;
        Unsafe unsafe;
        Unsafe unsafe2;
        loop0: while (true) {
            rQPn8YBR.getClass();
            Unsafe unsafe3 = o9.GWasM1elztuh;
            long j = iwATDS1i01k;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j);
            if (XnEVoBF0td1l.get(this) != 0) {
                return false;
            }
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe4 = o9.GWasM1elztuh;
                    vq vqVar2 = this;
                    runnable2 = runnable;
                    vqVar = vqVar2;
                    if (unsafe4.compareAndSwapObject(vqVar2, iwATDS1i01k, (Object) null, runnable2)) {
                        break loop0;
                    }
                    if (unsafe4.getObjectVolatile(vqVar, j) != null) {
                        break;
                    }
                    this = vqVar;
                    runnable = runnable2;
                }
                this = vqVar;
                runnable = runnable2;
            } else {
                vqVar = this;
                runnable2 = runnable;
                if (objectVolatile instanceof nb0) {
                    nb0 nb0Var = (nb0) objectVolatile;
                    int GWasM1elztuh = nb0Var.GWasM1elztuh(runnable2);
                    if (GWasM1elztuh == 0) {
                        break;
                    }
                    if (GWasM1elztuh == 1) {
                        nb0 xqGvceK5x = nb0Var.xqGvceK5x();
                        do {
                            unsafe2 = o9.GWasM1elztuh;
                            if (unsafe2.compareAndSwapObject(vqVar, iwATDS1i01k, objectVolatile, xqGvceK5x)) {
                                break;
                            }
                        } while (unsafe2.getObjectVolatile(vqVar, j) == objectVolatile);
                    } else if (GWasM1elztuh == 2) {
                        break;
                    }
                    this = vqVar;
                    runnable = runnable2;
                } else {
                    if (objectVolatile == qj.uFEq9NpZ) {
                        break;
                    }
                    nb0 nb0Var2 = new nb0(8, true);
                    nb0Var2.GWasM1elztuh((Runnable) objectVolatile);
                    nb0Var2.GWasM1elztuh(runnable2);
                    do {
                        unsafe = o9.GWasM1elztuh;
                        if (unsafe.compareAndSwapObject(vqVar, iwATDS1i01k, objectVolatile, nb0Var2)) {
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(vqVar, j) == objectVolatile);
                    this = vqVar;
                    runnable = runnable2;
                }
            }
        }
        return true;
    }

    public final int MZhzXH72(long j, tq tqVar) {
        vq vqVar;
        Unsafe unsafe;
        if (XnEVoBF0td1l.get(this) != 0) {
            return 1;
        }
        E7jCp8Ls.getClass();
        Unsafe unsafe2 = o9.GWasM1elztuh;
        long j2 = uFEq9NpZ;
        uq uqVar = (uq) unsafe2.getObjectVolatile(this, j2);
        if (uqVar == null) {
            uq uqVar2 = new uq();
            uqVar2.X1lG3V04pd = j;
            while (true) {
                unsafe = o9.GWasM1elztuh;
                vqVar = this;
                if (!unsafe.compareAndSwapObject(vqVar, uFEq9NpZ, (Object) null, uqVar2) && unsafe.getObjectVolatile(vqVar, j2) == null) {
                    this = vqVar;
                }
            }
            Object objectVolatile = unsafe.getObjectVolatile(vqVar, j2);
            objectVolatile.getClass();
            uqVar = (uq) objectVolatile;
        } else {
            vqVar = this;
        }
        return tqVar.Yi7zF1RB1(j, uqVar, vqVar);
    }

    @Override // defpackage.ih
    public final void OOA6hdeuvCS(gh ghVar, Runnable runnable) {
        arNh8D4Z5gB(runnable);
    }

    public final Runnable WRKkgoJXwDn() {
        vq vqVar;
        Unsafe unsafe;
        while (true) {
            rQPn8YBR.getClass();
            Unsafe unsafe2 = o9.GWasM1elztuh;
            long j = iwATDS1i01k;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                return null;
            }
            if (objectVolatile instanceof nb0) {
                nb0 nb0Var = (nb0) objectVolatile;
                Object OOA6hdeuvCS = nb0Var.OOA6hdeuvCS();
                if (OOA6hdeuvCS != nb0.AvO7iQsrTN) {
                    return (Runnable) OOA6hdeuvCS;
                }
                nb0 xqGvceK5x = nb0Var.xqGvceK5x();
                while (true) {
                    Unsafe unsafe3 = o9.GWasM1elztuh;
                    vqVar = this;
                    if (!unsafe3.compareAndSwapObject(vqVar, iwATDS1i01k, objectVolatile, xqGvceK5x) && unsafe3.getObjectVolatile(vqVar, j) == objectVolatile) {
                        this = vqVar;
                    }
                }
            } else {
                vqVar = this;
                if (objectVolatile == qj.uFEq9NpZ) {
                    return null;
                }
                do {
                    unsafe = o9.GWasM1elztuh;
                    if (unsafe.compareAndSwapObject(vqVar, iwATDS1i01k, objectVolatile, (Object) null)) {
                        return (Runnable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(vqVar, j) == objectVolatile);
            }
            this = vqVar;
        }
    }

    public final void WdrkLMV3xh() {
        vq vqVar;
        Unsafe unsafe;
        pp ppVar = qj.uFEq9NpZ;
        while (true) {
            rQPn8YBR.getClass();
            Unsafe unsafe2 = o9.GWasM1elztuh;
            long j = iwATDS1i01k;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe3 = o9.GWasM1elztuh;
                    vqVar = this;
                    if (unsafe3.compareAndSwapObject(vqVar, iwATDS1i01k, (Object) null, ppVar)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(vqVar, j) != null) {
                        break;
                    } else {
                        this = vqVar;
                    }
                }
            } else {
                vqVar = this;
                if (objectVolatile instanceof nb0) {
                    ((nb0) objectVolatile).X1lG3V04pd();
                    return;
                }
                if (objectVolatile == ppVar) {
                    return;
                }
                nb0 nb0Var = new nb0(8, true);
                nb0Var.GWasM1elztuh((Runnable) objectVolatile);
                do {
                    unsafe = o9.GWasM1elztuh;
                    if (unsafe.compareAndSwapObject(vqVar, iwATDS1i01k, objectVolatile, nb0Var)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(vqVar, j) == objectVolatile);
            }
            this = vqVar;
        }
    }

    public um X1lG3V04pd(long j, r91 r91Var, gh ghVar) {
        return ck.GWasM1elztuh.X1lG3V04pd(j, r91Var, ghVar);
    }

    public final void YZjbz8VdP5() {
        tq Yi7zF1RB1;
        long nanoTime = System.nanoTime();
        while (true) {
            E7jCp8Ls.getClass();
            uq uqVar = (uq) o9.GWasM1elztuh.getObjectVolatile(this, uFEq9NpZ);
            if (uqVar == null) {
                return;
            }
            synchronized (uqVar) {
                Yi7zF1RB1 = f91.Yi7zF1RB1.get(uqVar) > 0 ? uqVar.Yi7zF1RB1(0) : null;
            }
            if (Yi7zF1RB1 == null) {
                return;
            } else {
                AEn1Rrio(nanoTime, Yi7zF1RB1);
            }
        }
    }

    @Override // defpackage.qq
    public final long YmKjaVtbfp5Z() {
        if (mE4lRynR()) {
            return 0L;
        }
        pog2g9KITJA();
        Runnable WRKkgoJXwDn = WRKkgoJXwDn();
        if (WRKkgoJXwDn == null) {
            return k8h8IjolWQ();
        }
        WRKkgoJXwDn.run();
        return 0L;
    }

    public void arNh8D4Z5gB(Runnable runnable) {
        pog2g9KITJA();
        if (!M3K9sHhK(runnable)) {
            bk.WIEu4Ya2g8.arNh8D4Z5gB(runnable);
            return;
        }
        Thread EXrPz3p7hFb = EXrPz3p7hFb();
        if (Thread.currentThread() != EXrPz3p7hFb) {
            LockSupport.unpark(EXrPz3p7hFb);
        }
    }

    public final void eUH21U3apd() {
        rQPn8YBR.getClass();
        Unsafe unsafe = o9.GWasM1elztuh;
        unsafe.putObjectVolatile(this, iwATDS1i01k, (Object) null);
        E7jCp8Ls.getClass();
        unsafe.putObjectVolatile(this, uFEq9NpZ, (Object) null);
    }

    public final long k8h8IjolWQ() {
        tq tqVar;
        v4 v4Var = this.mOu10nynGul;
        if (((v4Var == null || v4Var.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
            rQPn8YBR.getClass();
            Unsafe unsafe = o9.GWasM1elztuh;
            Object objectVolatile = unsafe.getObjectVolatile(this, iwATDS1i01k);
            if (objectVolatile != null) {
                if (objectVolatile instanceof nb0) {
                    long j = nb0.EljAMC1QTz.get((nb0) objectVolatile);
                    if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                        return 0L;
                    }
                } else if (objectVolatile == qj.uFEq9NpZ) {
                    return Long.MAX_VALUE;
                }
            }
            E7jCp8Ls.getClass();
            uq uqVar = (uq) unsafe.getObjectVolatile(this, uFEq9NpZ);
            if (uqVar != null) {
                synchronized (uqVar) {
                    tq[] tqVarArr = uqVar.GWasM1elztuh;
                    tqVar = tqVarArr != null ? tqVarArr[0] : null;
                }
                if (tqVar != null) {
                    long nanoTime = tqVar.OOA6hdeuvCS - System.nanoTime();
                    if (nanoTime >= 0) {
                        return nanoTime;
                    }
                }
            }
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    public final boolean ozMwhSAI() {
        v4 v4Var = this.mOu10nynGul;
        if (v4Var != null ? v4Var.isEmpty() : true) {
            E7jCp8Ls.getClass();
            Unsafe unsafe = o9.GWasM1elztuh;
            uq uqVar = (uq) unsafe.getObjectVolatile(this, uFEq9NpZ);
            if (uqVar != null && f91.Yi7zF1RB1.get(uqVar) != 0) {
                return false;
            }
            rQPn8YBR.getClass();
            Object objectVolatile = unsafe.getObjectVolatile(this, iwATDS1i01k);
            if (objectVolatile != null) {
                if (objectVolatile instanceof nb0) {
                    long j = nb0.EljAMC1QTz.get((nb0) objectVolatile);
                    return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == qj.uFEq9NpZ) {
                }
            }
            return true;
        }
        return false;
    }

    public final void pog2g9KITJA() {
        tq tqVar;
        E7jCp8Ls.getClass();
        uq uqVar = (uq) o9.GWasM1elztuh.getObjectVolatile(this, uFEq9NpZ);
        if (uqVar == null || f91.Yi7zF1RB1.get(uqVar) == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (uqVar) {
                try {
                    tq[] tqVarArr = uqVar.GWasM1elztuh;
                    tq tqVar2 = tqVarArr != null ? tqVarArr[0] : null;
                    if (tqVar2 != null) {
                        tqVar = ((nanoTime - tqVar2.OOA6hdeuvCS) > 0L ? 1 : ((nanoTime - tqVar2.OOA6hdeuvCS) == 0L ? 0 : -1)) >= 0 ? M3K9sHhK(tqVar2) : false ? uqVar.Yi7zF1RB1(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (tqVar != null);
    }

    @Override // defpackage.qq
    public void shutdown() {
        d91.GWasM1elztuh.set(null);
        XnEVoBF0td1l.set(this, 1);
        WdrkLMV3xh();
        while (YmKjaVtbfp5Z() <= 0) {
        }
        YZjbz8VdP5();
    }

    @Override // defpackage.wk
    public final void xqGvceK5x(long j, n9 n9Var) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            rq rqVar = new rq(this, j2 + nanoTime, n9Var);
            A1EKNP6CxJ(nanoTime, rqVar);
            n9Var.arNh8D4Z5gB(new j9(1, rqVar));
        }
    }
}
