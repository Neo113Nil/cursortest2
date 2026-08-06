package defpackage;

/* loaded from: classes.dex */
public abstract class uh {
    public static final /* synthetic */ long F7NU4MC0GW;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater IHQe1A4L2xu = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.uh.class, java.lang.Object.class, "_next$volatile");
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater oh6vYeIP;
    public static final /* synthetic */ long r1MBDhnF;
    private volatile /* synthetic */ java.lang.Object _next$volatile;
    private volatile /* synthetic */ java.lang.Object _prev$volatile;

    static {
        sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
        r1MBDhnF = unsafe.objectFieldOffset(defpackage.uh.class.getDeclaredField("_next$volatile"));
        oh6vYeIP = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.uh.class, java.lang.Object.class, "_prev$volatile");
        F7NU4MC0GW = unsafe.objectFieldOffset(defpackage.uh.class.getDeclaredField("_prev$volatile"));
    }

    public uh(defpackage.t61 t61Var) {
        this._prev$volatile = t61Var;
    }

    public final boolean AARZUJiTa() {
        defpackage.et etVar = defpackage.ci0.oh6vYeIP;
        while (true) {
            IHQe1A4L2xu.getClass();
            sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
            long j = r1MBDhnF;
            defpackage.uh uhVar = this;
            if (unsafe.compareAndSwapObject(uhVar, j, (java.lang.Object) null, etVar)) {
                return true;
            }
            if (unsafe.getObjectVolatile(uhVar, j) != null) {
                return false;
            }
            this = uhVar;
        }
    }

    public final void EXtogiMhuM() {
        defpackage.uh uhVar;
        sun.misc.Unsafe unsafe;
        if (r1MBDhnF() == null) {
            return;
        }
        while (true) {
            defpackage.uh oh6vYeIP2 = oh6vYeIP();
            defpackage.uh r1MBDhnF2 = r1MBDhnF();
            r1MBDhnF2.getClass();
            do {
                uhVar = r1MBDhnF2;
                if (!uhVar.xiZrDbcSW0()) {
                    break;
                } else {
                    r1MBDhnF2 = uhVar.r1MBDhnF();
                }
            } while (r1MBDhnF2 != null);
            while (true) {
                oh6vYeIP.getClass();
                sun.misc.Unsafe unsafe2 = defpackage.cb.IHQe1A4L2xu;
                long j = F7NU4MC0GW;
                java.lang.Object objectVolatile = unsafe2.getObjectVolatile(uhVar, j);
                defpackage.uh uhVar2 = ((defpackage.uh) objectVolatile) == null ? null : oh6vYeIP2;
                do {
                    unsafe = defpackage.cb.IHQe1A4L2xu;
                    if (unsafe.compareAndSwapObject(uhVar, F7NU4MC0GW, objectVolatile, uhVar2)) {
                        break;
                    }
                } while (unsafe.getObjectVolatile(uhVar, j) == objectVolatile);
            }
            if (oh6vYeIP2 != null) {
                IHQe1A4L2xu.getClass();
                unsafe.putObjectVolatile(oh6vYeIP2, r1MBDhnF, uhVar);
            }
            if (!uhVar.xiZrDbcSW0() || uhVar.r1MBDhnF() == null) {
                if (oh6vYeIP2 == null || !oh6vYeIP2.xiZrDbcSW0()) {
                    return;
                }
            }
        }
    }

    public final java.lang.Object F7NU4MC0GW() {
        IHQe1A4L2xu.getClass();
        return defpackage.cb.IHQe1A4L2xu.getObjectVolatile(this, r1MBDhnF);
    }

    public final void IHQe1A4L2xu() {
        oh6vYeIP.getClass();
        defpackage.cb.IHQe1A4L2xu.putObjectVolatile(this, F7NU4MC0GW, (java.lang.Object) null);
    }

    public final defpackage.uh adDC3e2L() {
        oh6vYeIP.getClass();
        return (defpackage.uh) defpackage.cb.IHQe1A4L2xu.getObjectVolatile(this, F7NU4MC0GW);
    }

    public final defpackage.uh oh6vYeIP() {
        defpackage.uh adDC3e2L = adDC3e2L();
        while (adDC3e2L != null && adDC3e2L.xiZrDbcSW0()) {
            oh6vYeIP.getClass();
            adDC3e2L = (defpackage.uh) defpackage.cb.IHQe1A4L2xu.getObjectVolatile(adDC3e2L, F7NU4MC0GW);
        }
        return adDC3e2L;
    }

    public final defpackage.uh r1MBDhnF() {
        java.lang.Object F7NU4MC0GW2 = F7NU4MC0GW();
        if (F7NU4MC0GW2 == defpackage.ci0.oh6vYeIP) {
            return null;
        }
        return (defpackage.uh) F7NU4MC0GW2;
    }

    public final boolean riuEU0zW4(defpackage.t61 t61Var) {
        while (true) {
            IHQe1A4L2xu.getClass();
            sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
            long j = r1MBDhnF;
            defpackage.uh uhVar = this;
            defpackage.t61 t61Var2 = t61Var;
            if (unsafe.compareAndSwapObject(uhVar, j, (java.lang.Object) null, t61Var2)) {
                return true;
            }
            if (unsafe.getObjectVolatile(uhVar, j) != null) {
                return false;
            }
            this = uhVar;
            t61Var = t61Var2;
        }
    }

    public abstract boolean xiZrDbcSW0();
}
