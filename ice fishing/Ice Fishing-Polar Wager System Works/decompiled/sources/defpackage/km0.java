package defpackage;

/* loaded from: classes.dex */
public final class km0 extends defpackage.s71 implements defpackage.im0 {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater SyNS6RMn = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.km0.class, java.lang.Object.class, "owner$volatile");
    public static final /* synthetic */ long cnag84Bm = defpackage.cb.IHQe1A4L2xu.objectFieldOffset(defpackage.km0.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ java.lang.Object owner$volatile;

    public km0() {
        super(1);
        this.owner$volatile = defpackage.w70.yIx6ChFVk;
    }

    public final boolean AARZUJiTa() {
        int EXtogiMhuM = EXtogiMhuM();
        if (EXtogiMhuM == 0) {
            return true;
        }
        if (EXtogiMhuM == 1) {
            return false;
        }
        if (EXtogiMhuM == 2) {
            throw new java.lang.IllegalStateException("This mutex is already locked by the specified owner: null".toString());
        }
        defpackage.db.AARZUJiTa("unexpected");
        return false;
    }

    public final int EXtogiMhuM() {
        int i;
        while (true) {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = defpackage.s71.ez2rX8ReCYw;
            int i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = this.adDC3e2L;
            if (i2 > i3) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > i3) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i3));
            } else {
                if (i2 <= 0) {
                    return 1;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    SyNS6RMn.getClass();
                    defpackage.cb.IHQe1A4L2xu.putObjectVolatile(this, cnag84Bm, (java.lang.Object) null);
                    return 0;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0022, code lost:
    
        r5 = defpackage.km0.SyNS6RMn;
        r2 = r0.xiZrDbcSW0;
        r5.set(r2, null);
        r5 = r0.adDC3e2L;
        r5.SiPhmbmu(r1, r5.AARZUJiTa, new defpackage.dm1(1, new defpackage.DFo87pBq1E5(15, r2, r0)));
     */
    @Override // defpackage.im0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object F7NU4MC0GW(defpackage.fj fjVar) {
        boolean AARZUJiTa = AARZUJiTa();
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        if (!AARZUJiTa) {
            defpackage.bb nBH8hAHy = defpackage.ci0.nBH8hAHy(defpackage.c80.V7bD7b8KA(fjVar));
            try {
                defpackage.jm0 jm0Var = new defpackage.jm0(this, nBH8hAHy);
                while (true) {
                    int andDecrement = defpackage.s71.ez2rX8ReCYw.getAndDecrement(this);
                    if (andDecrement <= this.adDC3e2L) {
                        if (andDecrement > 0) {
                            break;
                        }
                        if (IHQe1A4L2xu(jm0Var)) {
                            break;
                        }
                    }
                }
                java.lang.Object kNAkVymC = nBH8hAHy.kNAkVymC();
                defpackage.vj vjVar = defpackage.vj.adDC3e2L;
                if (kNAkVymC != vjVar) {
                    kNAkVymC = ok1Var;
                }
                if (kNAkVymC == vjVar) {
                    return kNAkVymC;
                }
            } catch (java.lang.Throwable th) {
                nBH8hAHy.D2vUnMij();
                throw th;
            }
        }
        return ok1Var;
    }

    @Override // defpackage.im0
    public final void oh6vYeIP(java.lang.Object obj) {
        while (this.xiZrDbcSW0()) {
            SyNS6RMn.getClass();
            sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
            long j = cnag84Bm;
            java.lang.Object objectVolatile = unsafe.getObjectVolatile(this, j);
            defpackage.et etVar = defpackage.w70.yIx6ChFVk;
            if (objectVolatile != etVar) {
                if (objectVolatile != obj && obj != null) {
                    throw new java.lang.IllegalStateException(("This mutex is locked by " + objectVolatile + ", but " + obj + " is expected").toString());
                }
                while (true) {
                    sun.misc.Unsafe unsafe2 = defpackage.cb.IHQe1A4L2xu;
                    defpackage.km0 km0Var = this;
                    if (unsafe2.compareAndSwapObject(km0Var, cnag84Bm, objectVolatile, etVar)) {
                        km0Var.r1MBDhnF();
                        return;
                    } else {
                        if (unsafe2.getObjectVolatile(km0Var, j) != objectVolatile) {
                            this = km0Var;
                            break;
                        }
                        this = km0Var;
                    }
                }
            }
        }
        defpackage.db.AARZUJiTa("This mutex is not locked");
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Mutex@");
        sb.append(defpackage.fm.UsuH8pd5P(this));
        sb.append("[isLocked=");
        sb.append(xiZrDbcSW0());
        sb.append(",owner=");
        SyNS6RMn.getClass();
        sb.append(defpackage.cb.IHQe1A4L2xu.getObjectVolatile(this, cnag84Bm));
        sb.append(']');
        return sb.toString();
    }

    public final boolean xiZrDbcSW0() {
        return java.lang.Math.max(defpackage.s71.ez2rX8ReCYw.get(this), 0) == 0;
    }
}
