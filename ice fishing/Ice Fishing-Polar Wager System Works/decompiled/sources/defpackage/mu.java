package defpackage;

/* loaded from: classes.dex */
public abstract class mu extends defpackage.hu implements defpackage.jn {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater DFo87pBq1E5;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater JlrlGoKF;
    public static final /* synthetic */ long SyNS6RMn;
    public static final /* synthetic */ long cnag84Bm;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater ez2rX8ReCYw = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.mu.class, java.lang.Object.class, "_queue$volatile");
    private volatile /* synthetic */ java.lang.Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ java.lang.Object _queue$volatile;

    static {
        sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
        cnag84Bm = unsafe.objectFieldOffset(defpackage.mu.class.getDeclaredField("_queue$volatile"));
        JlrlGoKF = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.mu.class, java.lang.Object.class, "_delayed$volatile");
        SyNS6RMn = unsafe.objectFieldOffset(defpackage.mu.class.getDeclaredField("_delayed$volatile"));
        DFo87pBq1E5 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(defpackage.mu.class, "_isCompleted$volatile");
    }

    @Override // defpackage.jn
    public defpackage.kq AARZUJiTa(long j, defpackage.zg1 zg1Var, defpackage.lj ljVar) {
        return defpackage.om.IHQe1A4L2xu.AARZUJiTa(j, zg1Var, ljVar);
    }

    public final void AsxAYCCkb3Hi() {
        ez2rX8ReCYw.getClass();
        sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
        unsafe.putObjectVolatile(this, cnag84Bm, (java.lang.Object) null);
        JlrlGoKF.getClass();
        unsafe.putObjectVolatile(this, SyNS6RMn, (java.lang.Object) null);
    }

    public void EoOhNTTfIN7K(long j, defpackage.ku kuVar) {
        defpackage.nm.QoRHpC4k.RmCzwkUxICV(j, kuVar);
    }

    public abstract java.lang.Thread QPwENk36pDC();

    public final int QUKZkWRtw6(long j, defpackage.ku kuVar) {
        defpackage.mu muVar;
        sun.misc.Unsafe unsafe;
        if (DFo87pBq1E5.get(this) != 0) {
            return 1;
        }
        JlrlGoKF.getClass();
        sun.misc.Unsafe unsafe2 = defpackage.cb.IHQe1A4L2xu;
        long j2 = SyNS6RMn;
        defpackage.lu luVar = (defpackage.lu) unsafe2.getObjectVolatile(this, j2);
        if (luVar == null) {
            defpackage.lu luVar2 = new defpackage.lu();
            luVar2.r1MBDhnF = j;
            while (true) {
                unsafe = defpackage.cb.IHQe1A4L2xu;
                muVar = this;
                if (!unsafe.compareAndSwapObject(muVar, SyNS6RMn, (java.lang.Object) null, luVar2) && unsafe.getObjectVolatile(muVar, j2) == null) {
                    this = muVar;
                }
            }
            java.lang.Object objectVolatile = unsafe.getObjectVolatile(muVar, j2);
            objectVolatile.getClass();
            luVar = (defpackage.lu) objectVolatile;
        } else {
            muVar = this;
        }
        return kuVar.oh6vYeIP(j, luVar, muVar);
    }

    public final void RmCzwkUxICV(long j, defpackage.ku kuVar) {
        java.lang.Thread QPwENk36pDC;
        int QUKZkWRtw6 = QUKZkWRtw6(j, kuVar);
        if (QUKZkWRtw6 == 0) {
            if (!nVhUznk1t(kuVar) || java.lang.Thread.currentThread() == (QPwENk36pDC = QPwENk36pDC())) {
                return;
            }
            java.util.concurrent.locks.LockSupport.unpark(QPwENk36pDC);
            return;
        }
        if (QUKZkWRtw6 == 1) {
            EoOhNTTfIN7K(j, kuVar);
        } else {
            if (QUKZkWRtw6 == 2) {
                return;
            }
            defpackage.db.AARZUJiTa("unexpected result");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean TFRaUu83X3E(java.lang.Runnable runnable) {
        defpackage.mu muVar;
        java.lang.Runnable runnable2;
        sun.misc.Unsafe unsafe;
        sun.misc.Unsafe unsafe2;
        loop0: while (true) {
            ez2rX8ReCYw.getClass();
            sun.misc.Unsafe unsafe3 = defpackage.cb.IHQe1A4L2xu;
            long j = cnag84Bm;
            java.lang.Object objectVolatile = unsafe3.getObjectVolatile(this, j);
            if (DFo87pBq1E5.get(this) != 0) {
                return false;
            }
            if (objectVolatile == null) {
                while (true) {
                    sun.misc.Unsafe unsafe4 = defpackage.cb.IHQe1A4L2xu;
                    defpackage.mu muVar2 = this;
                    runnable2 = runnable;
                    muVar = muVar2;
                    if (unsafe4.compareAndSwapObject(muVar2, cnag84Bm, (java.lang.Object) null, runnable2)) {
                        break loop0;
                    }
                    if (unsafe4.getObjectVolatile(muVar, j) != null) {
                        break;
                    }
                    this = muVar;
                    runnable = runnable2;
                }
                this = muVar;
                runnable = runnable2;
            } else {
                muVar = this;
                runnable2 = runnable;
                if (objectVolatile instanceof defpackage.mf0) {
                    defpackage.mf0 mf0Var = (defpackage.mf0) objectVolatile;
                    int IHQe1A4L2xu = mf0Var.IHQe1A4L2xu(runnable2);
                    if (IHQe1A4L2xu == 0) {
                        break;
                    }
                    if (IHQe1A4L2xu == 1) {
                        defpackage.mf0 F7NU4MC0GW = mf0Var.F7NU4MC0GW();
                        do {
                            unsafe2 = defpackage.cb.IHQe1A4L2xu;
                            if (unsafe2.compareAndSwapObject(muVar, cnag84Bm, objectVolatile, F7NU4MC0GW)) {
                                break;
                            }
                        } while (unsafe2.getObjectVolatile(muVar, j) == objectVolatile);
                    } else if (IHQe1A4L2xu == 2) {
                        break;
                    }
                    this = muVar;
                    runnable = runnable2;
                } else {
                    if (objectVolatile == defpackage.gq1.F7NU4MC0GW) {
                        break;
                    }
                    defpackage.mf0 mf0Var2 = new defpackage.mf0(8, true);
                    mf0Var2.IHQe1A4L2xu((java.lang.Runnable) objectVolatile);
                    mf0Var2.IHQe1A4L2xu(runnable2);
                    do {
                        unsafe = defpackage.cb.IHQe1A4L2xu;
                        if (unsafe.compareAndSwapObject(muVar, cnag84Bm, objectVolatile, mf0Var2)) {
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(muVar, j) == objectVolatile);
                    this = muVar;
                    runnable = runnable2;
                }
            }
        }
        return true;
    }

    public final java.lang.Runnable Uv8CGu3G() {
        defpackage.mu muVar;
        sun.misc.Unsafe unsafe;
        while (true) {
            ez2rX8ReCYw.getClass();
            sun.misc.Unsafe unsafe2 = defpackage.cb.IHQe1A4L2xu;
            long j = cnag84Bm;
            java.lang.Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                return null;
            }
            if (objectVolatile instanceof defpackage.mf0) {
                defpackage.mf0 mf0Var = (defpackage.mf0) objectVolatile;
                java.lang.Object adDC3e2L = mf0Var.adDC3e2L();
                if (adDC3e2L != defpackage.mf0.AARZUJiTa) {
                    return (java.lang.Runnable) adDC3e2L;
                }
                defpackage.mf0 F7NU4MC0GW = mf0Var.F7NU4MC0GW();
                while (true) {
                    sun.misc.Unsafe unsafe3 = defpackage.cb.IHQe1A4L2xu;
                    muVar = this;
                    if (!unsafe3.compareAndSwapObject(muVar, cnag84Bm, objectVolatile, F7NU4MC0GW) && unsafe3.getObjectVolatile(muVar, j) == objectVolatile) {
                        this = muVar;
                    }
                }
            } else {
                muVar = this;
                if (objectVolatile == defpackage.gq1.F7NU4MC0GW) {
                    return null;
                }
                do {
                    unsafe = defpackage.cb.IHQe1A4L2xu;
                    if (unsafe.compareAndSwapObject(muVar, cnag84Bm, objectVolatile, (java.lang.Object) null)) {
                        return (java.lang.Runnable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(muVar, j) == objectVolatile);
            }
            this = muVar;
        }
    }

    public final long WLpAkxCo() {
        defpackage.ku kuVar;
        defpackage.l6 l6Var = this.riuEU0zW4;
        if (((l6Var == null || l6Var.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
            ez2rX8ReCYw.getClass();
            sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
            java.lang.Object objectVolatile = unsafe.getObjectVolatile(this, cnag84Bm);
            if (objectVolatile != null) {
                if (objectVolatile instanceof defpackage.mf0) {
                    long j = defpackage.mf0.xiZrDbcSW0.get((defpackage.mf0) objectVolatile);
                    if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                        return 0L;
                    }
                } else if (objectVolatile == defpackage.gq1.F7NU4MC0GW) {
                    return Long.MAX_VALUE;
                }
            }
            JlrlGoKF.getClass();
            defpackage.lu luVar = (defpackage.lu) unsafe.getObjectVolatile(this, SyNS6RMn);
            if (luVar != null) {
                synchronized (luVar) {
                    defpackage.ku[] kuVarArr = luVar.IHQe1A4L2xu;
                    kuVar = kuVarArr != null ? kuVarArr[0] : null;
                }
                if (kuVar != null) {
                    long nanoTime = kuVar.adDC3e2L - java.lang.System.nanoTime();
                    if (nanoTime >= 0) {
                        return nanoTime;
                    }
                }
            }
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    @Override // defpackage.hu
    public final long XZx205DYe() {
        if (mAr5m2L7gYDP()) {
            return 0L;
        }
        hkbnNdmy();
        java.lang.Runnable Uv8CGu3G = Uv8CGu3G();
        if (Uv8CGu3G == null) {
            return WLpAkxCo();
        }
        Uv8CGu3G.run();
        return 0L;
    }

    public final boolean Ye0N2xE9Hc() {
        defpackage.l6 l6Var = this.riuEU0zW4;
        if (l6Var != null ? l6Var.isEmpty() : true) {
            JlrlGoKF.getClass();
            sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
            defpackage.lu luVar = (defpackage.lu) unsafe.getObjectVolatile(this, SyNS6RMn);
            if (luVar != null && defpackage.og1.oh6vYeIP.get(luVar) != 0) {
                return false;
            }
            ez2rX8ReCYw.getClass();
            java.lang.Object objectVolatile = unsafe.getObjectVolatile(this, cnag84Bm);
            if (objectVolatile != null) {
                if (objectVolatile instanceof defpackage.mf0) {
                    long j = defpackage.mf0.xiZrDbcSW0.get((defpackage.mf0) objectVolatile);
                    return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == defpackage.gq1.F7NU4MC0GW) {
                }
            }
            return true;
        }
        return false;
    }

    public final void hkbnNdmy() {
        defpackage.ku kuVar;
        JlrlGoKF.getClass();
        defpackage.lu luVar = (defpackage.lu) defpackage.cb.IHQe1A4L2xu.getObjectVolatile(this, SyNS6RMn);
        if (luVar == null || defpackage.og1.oh6vYeIP.get(luVar) == 0) {
            return;
        }
        long nanoTime = java.lang.System.nanoTime();
        do {
            synchronized (luVar) {
                try {
                    defpackage.ku[] kuVarArr = luVar.IHQe1A4L2xu;
                    defpackage.ku kuVar2 = kuVarArr != null ? kuVarArr[0] : null;
                    if (kuVar2 != null) {
                        kuVar = ((nanoTime - kuVar2.adDC3e2L) > 0L ? 1 : ((nanoTime - kuVar2.adDC3e2L) == 0L ? 0 : -1)) >= 0 ? TFRaUu83X3E(kuVar2) : false ? luVar.oh6vYeIP(0) : null;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        } while (kuVar != null);
    }

    public final void hyxIchWRW() {
        defpackage.mu muVar;
        sun.misc.Unsafe unsafe;
        defpackage.et etVar = defpackage.gq1.F7NU4MC0GW;
        while (true) {
            ez2rX8ReCYw.getClass();
            sun.misc.Unsafe unsafe2 = defpackage.cb.IHQe1A4L2xu;
            long j = cnag84Bm;
            java.lang.Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                while (true) {
                    sun.misc.Unsafe unsafe3 = defpackage.cb.IHQe1A4L2xu;
                    muVar = this;
                    if (unsafe3.compareAndSwapObject(muVar, cnag84Bm, (java.lang.Object) null, etVar)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(muVar, j) != null) {
                        break;
                    } else {
                        this = muVar;
                    }
                }
            } else {
                muVar = this;
                if (objectVolatile instanceof defpackage.mf0) {
                    ((defpackage.mf0) objectVolatile).r1MBDhnF();
                    return;
                }
                if (objectVolatile == etVar) {
                    return;
                }
                defpackage.mf0 mf0Var = new defpackage.mf0(8, true);
                mf0Var.IHQe1A4L2xu((java.lang.Runnable) objectVolatile);
                do {
                    unsafe = defpackage.cb.IHQe1A4L2xu;
                    if (unsafe.compareAndSwapObject(muVar, cnag84Bm, objectVolatile, mf0Var)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(muVar, j) == objectVolatile);
            }
            this = muVar;
        }
    }

    public void lpprD5VAS(java.lang.Runnable runnable) {
        hkbnNdmy();
        if (!TFRaUu83X3E(runnable)) {
            defpackage.nm.QoRHpC4k.lpprD5VAS(runnable);
            return;
        }
        java.lang.Thread QPwENk36pDC = QPwENk36pDC();
        if (java.lang.Thread.currentThread() != QPwENk36pDC) {
            java.util.concurrent.locks.LockSupport.unpark(QPwENk36pDC);
        }
    }

    public final boolean nVhUznk1t(defpackage.ku kuVar) {
        JlrlGoKF.getClass();
        defpackage.lu luVar = (defpackage.lu) defpackage.cb.IHQe1A4L2xu.getObjectVolatile(this, SyNS6RMn);
        if (luVar != null) {
            synchronized (luVar) {
                defpackage.ku[] kuVarArr = luVar.IHQe1A4L2xu;
                r0 = kuVarArr != null ? kuVarArr[0] : null;
            }
        }
        return r0 == kuVar;
    }

    @Override // defpackage.jn
    public final void riuEU0zW4(long j, defpackage.bb bbVar) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 < 4611686018427387903L) {
            long nanoTime = java.lang.System.nanoTime();
            defpackage.iu iuVar = new defpackage.iu(this, j2 + nanoTime, bbVar);
            RmCzwkUxICV(nanoTime, iuVar);
            bbVar.C0U8sNJm(new defpackage.ya(2, iuVar));
        }
    }

    @Override // defpackage.hu
    public void shutdown() {
        defpackage.lg1.IHQe1A4L2xu.set(null);
        DFo87pBq1E5.set(this, 1);
        hyxIchWRW();
        while (XZx205DYe() <= 0) {
        }
        wKlPRKlRnfqr();
    }

    @Override // defpackage.nj
    public final void v5iciZok(defpackage.lj ljVar, java.lang.Runnable runnable) {
        lpprD5VAS(runnable);
    }

    public final void wKlPRKlRnfqr() {
        defpackage.ku oh6vYeIP;
        long nanoTime = java.lang.System.nanoTime();
        while (true) {
            JlrlGoKF.getClass();
            defpackage.lu luVar = (defpackage.lu) defpackage.cb.IHQe1A4L2xu.getObjectVolatile(this, SyNS6RMn);
            if (luVar == null) {
                return;
            }
            synchronized (luVar) {
                oh6vYeIP = defpackage.og1.oh6vYeIP.get(luVar) > 0 ? luVar.oh6vYeIP(0) : null;
            }
            if (oh6vYeIP == null) {
                return;
            } else {
                EoOhNTTfIN7K(nanoTime, oh6vYeIP);
            }
        }
    }
}
