package defpackage;

import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class hg extends cg implements ub {
    public static final /* synthetic */ long Qr9iLBAD;
    public static final /* synthetic */ long eVhOlqcC;
    public static final /* synthetic */ long jb9XjC4I;
    public static final /* synthetic */ int k3x7lurq = 0;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        Unsafe unsafe = b1.qoPGr6Ce;
        eVhOlqcC = unsafe.objectFieldOffset(hg.class.getDeclaredField("_queue$volatile"));
        Qr9iLBAD = unsafe.objectFieldOffset(hg.class.getDeclaredField("_delayed$volatile"));
        jb9XjC4I = unsafe.objectFieldOffset(hg.class.getDeclaredField("_isCompleted$volatile"));
    }

    @Override // defpackage.ub
    public final void P7K7Inc8(long j, m3 m3Var) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            dg dgVar = new dg(this, j2 + nanoTime, m3Var);
            aZz0PFXp(nanoTime, dgVar);
            m3Var.FySoLYna(new i3(2, dgVar));
        }
    }

    @Override // defpackage.n9
    public final void RXQxj5Oe(l9 l9Var, Runnable runnable) {
        euDDoUNr(runnable);
    }

    public final void SgZGMMPL() {
        fg fgVar;
        gg ggVar = (gg) b1.qoPGr6Ce.getObjectVolatile(this, Qr9iLBAD);
        if (ggVar == null || ggVar.NCTxEWno() == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (ggVar) {
                try {
                    fg[] fgVarArr = ggVar.qoPGr6Ce;
                    fg fgVar2 = fgVarArr != null ? fgVarArr[0] : null;
                    if (fgVar2 != null) {
                        fgVar = ((nanoTime - fgVar2.NCTxEWno) > 0L ? 1 : ((nanoTime - fgVar2.NCTxEWno) == 0L ? 0 : -1)) >= 0 ? ytu5o6f4(fgVar2) : false ? ggVar.MdtA4re8(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (fgVar != null);
    }

    @Override // defpackage.ub
    public kd VgvYg0wo(long j, pc0 pc0Var, l9 l9Var) {
        return va.qoPGr6Ce.VgvYg0wo(j, pc0Var, l9Var);
    }

    public void VhgXwMj9(long j, fg fgVar) {
        ua.ow5vqvCr.aZz0PFXp(j, fgVar);
    }

    public final void aZz0PFXp(long j, fg fgVar) {
        hg hgVar;
        int NCTxEWno;
        Unsafe unsafe;
        Thread eIA6dogk;
        long j2 = Qr9iLBAD;
        Unsafe unsafe2 = b1.qoPGr6Ce;
        if (unsafe2.getIntVolatile(this, jb9XjC4I) != 0) {
            hgVar = this;
            NCTxEWno = 1;
        } else {
            gg ggVar = (gg) unsafe2.getObjectVolatile(this, j2);
            if (ggVar == null) {
                gg ggVar2 = new gg();
                ggVar2.MdtA4re8 = j;
                while (true) {
                    unsafe = b1.qoPGr6Ce;
                    hgVar = this;
                    if (!unsafe.compareAndSwapObject(hgVar, Qr9iLBAD, (Object) null, ggVar2) && unsafe.getObjectVolatile(hgVar, j2) == null) {
                        this = hgVar;
                    }
                }
                Object objectVolatile = unsafe.getObjectVolatile(hgVar, j2);
                objectVolatile.getClass();
                ggVar = (gg) objectVolatile;
                unsafe2 = unsafe;
            } else {
                hgVar = this;
            }
            NCTxEWno = fgVar.NCTxEWno(j, ggVar, hgVar);
        }
        if (NCTxEWno != 0) {
            if (NCTxEWno == 1) {
                hgVar.VhgXwMj9(j, fgVar);
                return;
            } else {
                if (NCTxEWno == 2) {
                    return;
                }
                m1.Ey6iv0m0("unexpected result");
                return;
            }
        }
        gg ggVar3 = (gg) unsafe2.getObjectVolatile(hgVar, j2);
        if (ggVar3 != null) {
            synchronized (ggVar3) {
                fg[] fgVarArr = ggVar3.qoPGr6Ce;
                r12 = fgVarArr != null ? fgVarArr[0] : null;
            }
        }
        if (r12 != fgVar || Thread.currentThread() == (eIA6dogk = hgVar.eIA6dogk())) {
            return;
        }
        LockSupport.unpark(eIA6dogk);
    }

    public abstract Thread eIA6dogk();

    public void euDDoUNr(Runnable runnable) {
        SgZGMMPL();
        if (!ytu5o6f4(runnable)) {
            ua.ow5vqvCr.euDDoUNr(runnable);
            return;
        }
        Thread eIA6dogk = eIA6dogk();
        if (Thread.currentThread() != eIA6dogk) {
            LockSupport.unpark(eIA6dogk);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x001b, code lost:
    
        r6 = r3;
        r13 = null;
     */
    @Override // defpackage.cg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long i7xS8jrb() {
        Unsafe unsafe;
        hg hgVar;
        Unsafe unsafe2;
        Runnable runnable;
        fg fgVar;
        lf lfVar = ej0.b2ZJblxo;
        long j = eVhOlqcC;
        if (!Mq3SeTnW()) {
            SgZGMMPL();
            loop0: while (true) {
                unsafe = b1.qoPGr6Ce;
                Object objectVolatile = unsafe.getObjectVolatile(this, j);
                if (objectVolatile == null) {
                    hgVar = this;
                    break;
                }
                if (objectVolatile instanceof jq) {
                    jq jqVar = (jq) objectVolatile;
                    Object wxUZMvaN = jqVar.wxUZMvaN();
                    if (wxUZMvaN != jq.VgvYg0wo) {
                        Runnable runnable2 = (Runnable) wxUZMvaN;
                        hgVar = this;
                        runnable = runnable2;
                        unsafe2 = unsafe;
                        break;
                    }
                    jq MdtA4re8 = jqVar.MdtA4re8();
                    while (true) {
                        Unsafe unsafe3 = b1.qoPGr6Ce;
                        hgVar = this;
                        if (!unsafe3.compareAndSwapObject(hgVar, eVhOlqcC, objectVolatile, MdtA4re8) && unsafe3.getObjectVolatile(hgVar, j) == objectVolatile) {
                            this = hgVar;
                        }
                    }
                    this = hgVar;
                } else {
                    hgVar = this;
                    if (objectVolatile == lfVar) {
                        break;
                    }
                    do {
                        unsafe2 = b1.qoPGr6Ce;
                        if (unsafe2.compareAndSwapObject(hgVar, eVhOlqcC, objectVolatile, (Object) null)) {
                            runnable = (Runnable) objectVolatile;
                            unsafe = unsafe2;
                            break loop0;
                        }
                    } while (unsafe2.getObjectVolatile(hgVar, j) == objectVolatile);
                    this = hgVar;
                }
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            q0 q0Var = hgVar.P7K7Inc8;
            if (((q0Var == null || q0Var.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object objectVolatile2 = unsafe.getObjectVolatile(hgVar, j);
                if (objectVolatile2 != null) {
                    if (objectVolatile2 instanceof jq) {
                        long longVolatile = unsafe2.getLongVolatile((jq) objectVolatile2, jq.b2ZJblxo);
                        if (((int) (1073741823 & longVolatile)) != ((int) ((longVolatile & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (objectVolatile2 == lfVar) {
                        return Long.MAX_VALUE;
                    }
                }
                gg ggVar = (gg) unsafe.getObjectVolatile(hgVar, Qr9iLBAD);
                if (ggVar != null) {
                    synchronized (ggVar) {
                        fg[] fgVarArr = ggVar.qoPGr6Ce;
                        fgVar = fgVarArr != null ? fgVarArr[0] : null;
                    }
                    if (fgVar != null) {
                        long nanoTime = fgVar.NCTxEWno - System.nanoTime();
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

    public final boolean pRiPUEwG() {
        q0 q0Var = this.P7K7Inc8;
        if (q0Var != null ? q0Var.isEmpty() : true) {
            Unsafe unsafe = b1.qoPGr6Ce;
            gg ggVar = (gg) unsafe.getObjectVolatile(this, Qr9iLBAD);
            if (ggVar != null && ggVar.NCTxEWno() != 0) {
                return false;
            }
            Object objectVolatile = unsafe.getObjectVolatile(this, eVhOlqcC);
            if (objectVolatile != null) {
                if (objectVolatile instanceof jq) {
                    long longVolatile = unsafe.getLongVolatile((jq) objectVolatile, jq.b2ZJblxo);
                    return ((int) (1073741823 & longVolatile)) == ((int) ((longVolatile & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == ej0.b2ZJblxo) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.cg
    public void shutdown() {
        lf lfVar;
        Unsafe unsafe;
        fg MdtA4re8;
        kc0.qoPGr6Ce.set(null);
        b1.qoPGr6Ce.putIntVolatile(this, jb9XjC4I, 1);
        lf lfVar2 = ej0.b2ZJblxo;
        long j = eVhOlqcC;
        loop0: while (true) {
            Object objectVolatile = b1.qoPGr6Ce.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe2 = b1.qoPGr6Ce;
                    lfVar = lfVar2;
                    if (unsafe2.compareAndSwapObject(this, eVhOlqcC, (Object) null, lfVar2)) {
                        break loop0;
                    } else if (unsafe2.getObjectVolatile(this, j) != null) {
                        break;
                    } else {
                        lfVar2 = lfVar;
                    }
                }
                lfVar2 = lfVar;
            } else {
                lfVar = lfVar2;
                if (objectVolatile instanceof jq) {
                    ((jq) objectVolatile).NCTxEWno();
                    break;
                }
                if (objectVolatile == lfVar) {
                    break;
                }
                jq jqVar = new jq(8, true);
                jqVar.qoPGr6Ce((Runnable) objectVolatile);
                do {
                    unsafe = b1.qoPGr6Ce;
                    if (unsafe.compareAndSwapObject(this, eVhOlqcC, objectVolatile, jqVar)) {
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(this, j) == objectVolatile);
                lfVar2 = lfVar;
            }
        }
        while (i7xS8jrb() <= 0) {
        }
        long nanoTime = System.nanoTime();
        while (true) {
            gg ggVar = (gg) b1.qoPGr6Ce.getObjectVolatile(this, Qr9iLBAD);
            if (ggVar == null) {
                return;
            }
            synchronized (ggVar) {
                MdtA4re8 = ggVar.NCTxEWno() > 0 ? ggVar.MdtA4re8(0) : null;
            }
            if (MdtA4re8 == null) {
                return;
            } else {
                VhgXwMj9(nanoTime, MdtA4re8);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean ytu5o6f4(Runnable runnable) {
        hg hgVar;
        Runnable runnable2;
        Unsafe unsafe;
        Unsafe unsafe2;
        loop0: while (true) {
            Unsafe unsafe3 = b1.qoPGr6Ce;
            long j = eVhOlqcC;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j);
            if (unsafe3.getIntVolatile(this, jb9XjC4I) != 0) {
                return false;
            }
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe4 = b1.qoPGr6Ce;
                    hg hgVar2 = this;
                    runnable2 = runnable;
                    hgVar = hgVar2;
                    if (unsafe4.compareAndSwapObject(hgVar2, eVhOlqcC, (Object) null, runnable2)) {
                        break loop0;
                    }
                    if (unsafe4.getObjectVolatile(hgVar, j) != null) {
                        break;
                    }
                    this = hgVar;
                    runnable = runnable2;
                }
                this = hgVar;
                runnable = runnable2;
            } else {
                hgVar = this;
                runnable2 = runnable;
                if (objectVolatile instanceof jq) {
                    jq jqVar = (jq) objectVolatile;
                    int qoPGr6Ce = jqVar.qoPGr6Ce(runnable2);
                    if (qoPGr6Ce == 0) {
                        break;
                    }
                    if (qoPGr6Ce == 1) {
                        jq MdtA4re8 = jqVar.MdtA4re8();
                        do {
                            unsafe2 = b1.qoPGr6Ce;
                            if (unsafe2.compareAndSwapObject(hgVar, eVhOlqcC, objectVolatile, MdtA4re8)) {
                                break;
                            }
                        } while (unsafe2.getObjectVolatile(hgVar, j) == objectVolatile);
                    } else if (qoPGr6Ce == 2) {
                        break;
                    }
                    this = hgVar;
                    runnable = runnable2;
                } else {
                    if (objectVolatile == ej0.b2ZJblxo) {
                        break;
                    }
                    jq jqVar2 = new jq(8, true);
                    jqVar2.qoPGr6Ce((Runnable) objectVolatile);
                    jqVar2.qoPGr6Ce(runnable2);
                    do {
                        unsafe = b1.qoPGr6Ce;
                        if (unsafe.compareAndSwapObject(hgVar, eVhOlqcC, objectVolatile, jqVar2)) {
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(hgVar, j) == objectVolatile);
                    this = hgVar;
                    runnable = runnable2;
                }
            }
        }
        return true;
    }
}
