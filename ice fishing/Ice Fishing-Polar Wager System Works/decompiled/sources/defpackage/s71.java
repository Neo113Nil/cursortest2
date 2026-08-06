package defpackage;

/* loaded from: classes.dex */
public class s71 {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater AARZUJiTa = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.s71.class, java.lang.Object.class, "head$volatile");
    public static final /* synthetic */ long DFo87pBq1E5;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater EXtogiMhuM;
    public static final /* synthetic */ long JlrlGoKF;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater SH1y5HwkJhh;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater ez2rX8ReCYw;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater riuEU0zW4;
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final int adDC3e2L;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ java.lang.Object head$volatile;
    private volatile /* synthetic */ java.lang.Object tail$volatile;
    public final defpackage.dm1 xiZrDbcSW0;

    static {
        sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
        JlrlGoKF = unsafe.objectFieldOffset(defpackage.s71.class.getDeclaredField("head$volatile"));
        EXtogiMhuM = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(defpackage.s71.class, "deqIdx$volatile");
        riuEU0zW4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.s71.class, java.lang.Object.class, "tail$volatile");
        DFo87pBq1E5 = unsafe.objectFieldOffset(defpackage.s71.class.getDeclaredField("tail$volatile"));
        SH1y5HwkJhh = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(defpackage.s71.class, "enqIdx$volatile");
        ez2rX8ReCYw = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(defpackage.s71.class, "_availablePermits$volatile");
    }

    public s71(int i) {
        this.adDC3e2L = i;
        if (i <= 0) {
            defpackage.db.adDC3e2L(defpackage.fx0.SH1y5HwkJhh("Semaphore should have at least 1 permit, but had ", i));
            throw null;
        }
        if (i < 0) {
            defpackage.db.adDC3e2L(defpackage.fx0.SH1y5HwkJhh("The number of acquired permits should be in 0..", i));
            throw null;
        }
        defpackage.v71 v71Var = new defpackage.v71(0L, null, 2);
        this.head$volatile = v71Var;
        this.tail$volatile = v71Var;
        this._availablePermits$volatile = i;
        this.xiZrDbcSW0 = new defpackage.dm1(4, this);
    }

    public final boolean IHQe1A4L2xu(defpackage.fn1 fn1Var) {
        java.lang.Object PAEGRtP0bX;
        sun.misc.Unsafe unsafe;
        defpackage.s71 s71Var = this;
        riuEU0zW4.getClass();
        sun.misc.Unsafe unsafe2 = defpackage.cb.IHQe1A4L2xu;
        long j = DFo87pBq1E5;
        defpackage.v71 v71Var = (defpackage.v71) unsafe2.getObjectVolatile(s71Var, j);
        long andIncrement = SH1y5HwkJhh.getAndIncrement(s71Var);
        defpackage.q71 q71Var = defpackage.q71.JlrlGoKF;
        long j2 = andIncrement / defpackage.u71.xiZrDbcSW0;
        loop0: while (true) {
            PAEGRtP0bX = defpackage.ci0.PAEGRtP0bX(v71Var, j2, q71Var);
            if (defpackage.s70.SiPhmbmu(PAEGRtP0bX)) {
                break;
            }
            defpackage.t61 UsuH8pd5P = defpackage.s70.UsuH8pd5P(PAEGRtP0bX);
            while (true) {
                defpackage.t61 t61Var = (defpackage.t61) defpackage.cb.IHQe1A4L2xu.getObjectVolatile(s71Var, j);
                if (t61Var.adDC3e2L >= UsuH8pd5P.adDC3e2L) {
                    s71Var = this;
                    break loop0;
                }
                if (!UsuH8pd5P.SyNS6RMn()) {
                    break;
                }
                do {
                    unsafe = defpackage.cb.IHQe1A4L2xu;
                    s71Var = this;
                    if (unsafe.compareAndSwapObject(s71Var, DFo87pBq1E5, t61Var, UsuH8pd5P)) {
                        if (t61Var.SH1y5HwkJhh()) {
                            t61Var.EXtogiMhuM();
                        }
                    }
                } while (unsafe.getObjectVolatile(s71Var, j) == t61Var);
                if (UsuH8pd5P.SH1y5HwkJhh()) {
                    UsuH8pd5P.EXtogiMhuM();
                }
            }
            s71Var = this;
        }
        defpackage.v71 v71Var2 = (defpackage.v71) defpackage.s70.UsuH8pd5P(PAEGRtP0bX);
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = v71Var2.AARZUJiTa;
        int i = (int) (andIncrement % defpackage.u71.xiZrDbcSW0);
        while (!atomicReferenceArray.compareAndSet(i, null, fn1Var)) {
            if (atomicReferenceArray.get(i) != null) {
                defpackage.et etVar = defpackage.u71.oh6vYeIP;
                defpackage.et etVar2 = defpackage.u71.r1MBDhnF;
                while (!atomicReferenceArray.compareAndSet(i, etVar, etVar2)) {
                    if (atomicReferenceArray.get(i) != etVar) {
                        return false;
                    }
                }
                ((defpackage.ab) fn1Var).DFo87pBq1E5(defpackage.ok1.IHQe1A4L2xu, s71Var.xiZrDbcSW0);
                return true;
            }
        }
        fn1Var.IHQe1A4L2xu(v71Var2, i);
        return true;
    }

    public final boolean adDC3e2L() {
        java.lang.Object PAEGRtP0bX;
        sun.misc.Unsafe unsafe;
        AARZUJiTa.getClass();
        sun.misc.Unsafe unsafe2 = defpackage.cb.IHQe1A4L2xu;
        long j = JlrlGoKF;
        defpackage.v71 v71Var = (defpackage.v71) unsafe2.getObjectVolatile(this, j);
        long andIncrement = EXtogiMhuM.getAndIncrement(this);
        long j2 = andIncrement / defpackage.u71.xiZrDbcSW0;
        defpackage.r71 r71Var = defpackage.r71.JlrlGoKF;
        loop0: while (true) {
            PAEGRtP0bX = defpackage.ci0.PAEGRtP0bX(v71Var, j2, r71Var);
            if (defpackage.s70.SiPhmbmu(PAEGRtP0bX)) {
                break;
            }
            defpackage.t61 UsuH8pd5P = defpackage.s70.UsuH8pd5P(PAEGRtP0bX);
            while (true) {
                defpackage.t61 t61Var = (defpackage.t61) defpackage.cb.IHQe1A4L2xu.getObjectVolatile(this, j);
                if (t61Var.adDC3e2L >= UsuH8pd5P.adDC3e2L) {
                    break loop0;
                }
                if (!UsuH8pd5P.SyNS6RMn()) {
                    break;
                }
                do {
                    unsafe = defpackage.cb.IHQe1A4L2xu;
                    if (unsafe.compareAndSwapObject(this, JlrlGoKF, t61Var, UsuH8pd5P)) {
                        if (t61Var.SH1y5HwkJhh()) {
                            t61Var.EXtogiMhuM();
                        }
                    }
                } while (unsafe.getObjectVolatile(this, j) == t61Var);
                if (UsuH8pd5P.SH1y5HwkJhh()) {
                    UsuH8pd5P.EXtogiMhuM();
                }
            }
        }
        defpackage.v71 v71Var2 = (defpackage.v71) defpackage.s70.UsuH8pd5P(PAEGRtP0bX);
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = v71Var2.AARZUJiTa;
        v71Var2.IHQe1A4L2xu();
        boolean z = false;
        if (v71Var2.adDC3e2L <= j2) {
            int i = (int) (andIncrement % defpackage.u71.xiZrDbcSW0);
            java.lang.Object andSet = atomicReferenceArray.getAndSet(i, defpackage.u71.oh6vYeIP);
            if (andSet == null) {
                int i2 = defpackage.u71.IHQe1A4L2xu;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (atomicReferenceArray.get(i) == defpackage.u71.r1MBDhnF) {
                        return true;
                    }
                }
                defpackage.et etVar = defpackage.u71.oh6vYeIP;
                defpackage.et etVar2 = defpackage.u71.F7NU4MC0GW;
                while (true) {
                    if (atomicReferenceArray.compareAndSet(i, etVar, etVar2)) {
                        z = true;
                        break;
                    }
                    if (atomicReferenceArray.get(i) != etVar) {
                        break;
                    }
                }
                return !z;
            }
            if (andSet != defpackage.u71.adDC3e2L) {
                if (!(andSet instanceof defpackage.ab)) {
                    defpackage.db.xiZrDbcSW0(andSet, "unexpected: ");
                    return false;
                }
                defpackage.ab abVar = (defpackage.ab) andSet;
                defpackage.et QoRHpC4k = abVar.QoRHpC4k(defpackage.ok1.IHQe1A4L2xu, this.xiZrDbcSW0);
                if (QoRHpC4k != null) {
                    abVar.abhbClRa(QoRHpC4k);
                    return true;
                }
            }
        }
        return false;
    }

    public final void r1MBDhnF() {
        int i;
        do {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ez2rX8ReCYw;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.adDC3e2L;
            if (andIncrement >= i2) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i2) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                throw new java.lang.IllegalStateException(("The number of released permits cannot be greater than " + i2).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!adDC3e2L());
    }
}
