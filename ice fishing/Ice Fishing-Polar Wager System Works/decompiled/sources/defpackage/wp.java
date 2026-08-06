package defpackage;

/* loaded from: classes.dex */
public final class wp extends defpackage.yp implements defpackage.wj, defpackage.ej {
    public final defpackage.nj EXtogiMhuM;
    public java.lang.Object SH1y5HwkJhh;
    private volatile /* synthetic */ java.lang.Object _reusableCancellableContinuation$volatile;
    public final java.lang.Object ez2rX8ReCYw;
    public final defpackage.fj riuEU0zW4;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater JlrlGoKF = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.wp.class, java.lang.Object.class, "_reusableCancellableContinuation$volatile");
    public static final /* synthetic */ long DFo87pBq1E5 = defpackage.cb.IHQe1A4L2xu.objectFieldOffset(defpackage.wp.class.getDeclaredField("_reusableCancellableContinuation$volatile"));

    public wp(defpackage.nj njVar, defpackage.fj fjVar) {
        super(-1);
        this.EXtogiMhuM = njVar;
        this.riuEU0zW4 = fjVar;
        this.SH1y5HwkJhh = defpackage.fm.AARZUJiTa;
        this.ez2rX8ReCYw = defpackage.x70.QPwENk36pDC(fjVar.xiZrDbcSW0());
    }

    public final boolean G3OKOH3wZRC(java.lang.Throwable th) {
        defpackage.wp wpVar;
        java.lang.Throwable th2;
        sun.misc.Unsafe unsafe;
        while (true) {
            JlrlGoKF.getClass();
            sun.misc.Unsafe unsafe2 = defpackage.cb.IHQe1A4L2xu;
            long j = DFo87pBq1E5;
            java.lang.Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            defpackage.et etVar = defpackage.fm.EXtogiMhuM;
            if (defpackage.x70.QoRHpC4k(objectVolatile, etVar)) {
                while (true) {
                    sun.misc.Unsafe unsafe3 = defpackage.cb.IHQe1A4L2xu;
                    defpackage.wp wpVar2 = this;
                    th2 = th;
                    wpVar = wpVar2;
                    if (unsafe3.compareAndSwapObject(wpVar2, DFo87pBq1E5, etVar, th2)) {
                        return true;
                    }
                    if (unsafe3.getObjectVolatile(wpVar, j) != etVar) {
                        break;
                    }
                    this = wpVar;
                    th = th2;
                }
            } else {
                wpVar = this;
                th2 = th;
                if (objectVolatile instanceof java.lang.Throwable) {
                    return true;
                }
                do {
                    unsafe = defpackage.cb.IHQe1A4L2xu;
                    if (unsafe.compareAndSwapObject(wpVar, DFo87pBq1E5, objectVolatile, (java.lang.Object) null)) {
                        return false;
                    }
                } while (unsafe.getObjectVolatile(wpVar, j) == objectVolatile);
            }
            this = wpVar;
            th = th2;
        }
    }

    public final defpackage.bb JlrlGoKF() {
        defpackage.wp wpVar;
        defpackage.et etVar = defpackage.fm.EXtogiMhuM;
        while (true) {
            JlrlGoKF.getClass();
            sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
            long j = DFo87pBq1E5;
            java.lang.Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(this, j, etVar);
                return null;
            }
            if (objectVolatile instanceof defpackage.bb) {
                while (true) {
                    sun.misc.Unsafe unsafe2 = defpackage.cb.IHQe1A4L2xu;
                    defpackage.wp wpVar2 = this;
                    boolean compareAndSwapObject = unsafe2.compareAndSwapObject(wpVar2, DFo87pBq1E5, objectVolatile, etVar);
                    wpVar = wpVar2;
                    if (compareAndSwapObject) {
                        return (defpackage.bb) objectVolatile;
                    }
                    if (unsafe2.getObjectVolatile(wpVar, j) != objectVolatile) {
                        break;
                    }
                    this = wpVar;
                }
            } else {
                wpVar = this;
                if (objectVolatile != etVar && !(objectVolatile instanceof java.lang.Throwable)) {
                    defpackage.db.xiZrDbcSW0(objectVolatile, "Inconsistent state ");
                    return null;
                }
            }
            this = wpVar;
        }
    }

    @Override // defpackage.ej
    public final void SH1y5HwkJhh(java.lang.Object obj) {
        java.lang.Throwable IHQe1A4L2xu = defpackage.q11.IHQe1A4L2xu(obj);
        java.lang.Object bfVar = IHQe1A4L2xu == null ? obj : new defpackage.bf(IHQe1A4L2xu, false);
        defpackage.fj fjVar = this.riuEU0zW4;
        defpackage.lj xiZrDbcSW0 = fjVar.xiZrDbcSW0();
        defpackage.nj njVar = this.EXtogiMhuM;
        if (njVar.frpfPPIgqM9O(xiZrDbcSW0)) {
            this.SH1y5HwkJhh = bfVar;
            this.AARZUJiTa = 0;
            njVar.v5iciZok(fjVar.xiZrDbcSW0(), this);
            return;
        }
        defpackage.hu IHQe1A4L2xu2 = defpackage.lg1.IHQe1A4L2xu();
        if (IHQe1A4L2xu2.AARZUJiTa >= 4294967296L) {
            this.SH1y5HwkJhh = bfVar;
            this.AARZUJiTa = 0;
            IHQe1A4L2xu2.yIx6ChFVk(this);
            return;
        }
        IHQe1A4L2xu2.wll2JLbTBC2(true);
        try {
            defpackage.lj xiZrDbcSW02 = fjVar.xiZrDbcSW0();
            java.lang.Object nVhUznk1t = defpackage.x70.nVhUznk1t(xiZrDbcSW02, this.ez2rX8ReCYw);
            try {
                fjVar.SH1y5HwkJhh(obj);
                while (IHQe1A4L2xu2.mAr5m2L7gYDP()) {
                }
            } finally {
                defpackage.x70.hkbnNdmy(xiZrDbcSW02, nVhUznk1t);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final defpackage.bb SyNS6RMn() {
        JlrlGoKF.getClass();
        java.lang.Object objectVolatile = defpackage.cb.IHQe1A4L2xu.getObjectVolatile(this, DFo87pBq1E5);
        if (objectVolatile instanceof defpackage.bb) {
            return (defpackage.bb) objectVolatile;
        }
        return null;
    }

    public final boolean cnag84Bm() {
        JlrlGoKF.getClass();
        return defpackage.cb.IHQe1A4L2xu.getObjectVolatile(this, DFo87pBq1E5) != null;
    }

    public final void ez2rX8ReCYw() {
        do {
            JlrlGoKF.getClass();
        } while (defpackage.cb.IHQe1A4L2xu.getObjectVolatile(this, DFo87pBq1E5) == defpackage.fm.EXtogiMhuM);
    }

    public final java.lang.Throwable kd6TUFXn(defpackage.bb bbVar) {
        sun.misc.Unsafe unsafe;
        defpackage.wp wpVar;
        defpackage.bb bbVar2;
        while (true) {
            JlrlGoKF.getClass();
            sun.misc.Unsafe unsafe2 = defpackage.cb.IHQe1A4L2xu;
            long j = DFo87pBq1E5;
            java.lang.Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            defpackage.et etVar = defpackage.fm.EXtogiMhuM;
            if (objectVolatile != etVar) {
                defpackage.wp wpVar2 = this;
                if (!(objectVolatile instanceof java.lang.Throwable)) {
                    defpackage.db.xiZrDbcSW0(objectVolatile, "Inconsistent state ");
                    return null;
                }
                do {
                    unsafe = defpackage.cb.IHQe1A4L2xu;
                    if (unsafe.compareAndSwapObject(wpVar2, DFo87pBq1E5, objectVolatile, (java.lang.Object) null)) {
                        return (java.lang.Throwable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(wpVar2, j) == objectVolatile);
                defpackage.db.fnWB2E7cs("Failed requirement.");
                return null;
            }
            while (true) {
                sun.misc.Unsafe unsafe3 = defpackage.cb.IHQe1A4L2xu;
                wpVar = this;
                bbVar2 = bbVar;
                if (unsafe3.compareAndSwapObject(wpVar, DFo87pBq1E5, etVar, bbVar2)) {
                    return null;
                }
                if (unsafe3.getObjectVolatile(wpVar, j) != etVar) {
                    break;
                }
                this = wpVar;
                bbVar = bbVar2;
            }
            this = wpVar;
            bbVar = bbVar2;
        }
    }

    @Override // defpackage.wj
    public final defpackage.wj r1MBDhnF() {
        return this.riuEU0zW4;
    }

    @Override // defpackage.yp
    public final java.lang.Object riuEU0zW4() {
        java.lang.Object obj = this.SH1y5HwkJhh;
        this.SH1y5HwkJhh = defpackage.fm.AARZUJiTa;
        return obj;
    }

    public final java.lang.String toString() {
        return "DispatchedContinuation[" + this.EXtogiMhuM + ", " + defpackage.fm.TFRaUu83X3E(this.riuEU0zW4) + ']';
    }

    @Override // defpackage.ej
    public final defpackage.lj xiZrDbcSW0() {
        return this.riuEU0zW4.xiZrDbcSW0();
    }

    @Override // defpackage.yp
    public final defpackage.ej F7NU4MC0GW() {
        return this;
    }
}
