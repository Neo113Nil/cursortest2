package defpackage;

/* loaded from: classes.dex */
public class kf0 {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater IHQe1A4L2xu = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.kf0.class, java.lang.Object.class, "_cur$volatile");
    public static final /* synthetic */ long oh6vYeIP = defpackage.cb.IHQe1A4L2xu.objectFieldOffset(defpackage.kf0.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ java.lang.Object _cur$volatile = new defpackage.mf0(8, false);

    public final java.lang.Object F7NU4MC0GW() {
        defpackage.kf0 kf0Var;
        while (true) {
            IHQe1A4L2xu.getClass();
            sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
            long j = oh6vYeIP;
            defpackage.mf0 mf0Var = (defpackage.mf0) unsafe.getObjectVolatile(this, j);
            java.lang.Object adDC3e2L = mf0Var.adDC3e2L();
            if (adDC3e2L != defpackage.mf0.AARZUJiTa) {
                return adDC3e2L;
            }
            defpackage.mf0 F7NU4MC0GW = mf0Var.F7NU4MC0GW();
            while (true) {
                sun.misc.Unsafe unsafe2 = defpackage.cb.IHQe1A4L2xu;
                kf0Var = this;
                if (!unsafe2.compareAndSwapObject(kf0Var, oh6vYeIP, mf0Var, F7NU4MC0GW) && unsafe2.getObjectVolatile(kf0Var, j) == mf0Var) {
                    this = kf0Var;
                }
            }
            this = kf0Var;
        }
    }

    public final boolean IHQe1A4L2xu(java.lang.Runnable runnable) {
        defpackage.kf0 kf0Var;
        while (true) {
            IHQe1A4L2xu.getClass();
            sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
            long j = oh6vYeIP;
            defpackage.mf0 mf0Var = (defpackage.mf0) unsafe.getObjectVolatile(this, j);
            int IHQe1A4L2xu2 = mf0Var.IHQe1A4L2xu(runnable);
            if (IHQe1A4L2xu2 == 0) {
                return true;
            }
            if (IHQe1A4L2xu2 == 1) {
                defpackage.mf0 F7NU4MC0GW = mf0Var.F7NU4MC0GW();
                while (true) {
                    sun.misc.Unsafe unsafe2 = defpackage.cb.IHQe1A4L2xu;
                    kf0Var = this;
                    if (!unsafe2.compareAndSwapObject(kf0Var, oh6vYeIP, mf0Var, F7NU4MC0GW) && unsafe2.getObjectVolatile(kf0Var, j) == mf0Var) {
                        this = kf0Var;
                    }
                }
            } else {
                if (IHQe1A4L2xu2 == 2) {
                    return false;
                }
                kf0Var = this;
            }
            this = kf0Var;
        }
    }

    public final void oh6vYeIP() {
        defpackage.kf0 kf0Var;
        while (true) {
            IHQe1A4L2xu.getClass();
            sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
            long j = oh6vYeIP;
            defpackage.mf0 mf0Var = (defpackage.mf0) unsafe.getObjectVolatile(this, j);
            if (mf0Var.r1MBDhnF()) {
                return;
            }
            defpackage.mf0 F7NU4MC0GW = mf0Var.F7NU4MC0GW();
            while (true) {
                sun.misc.Unsafe unsafe2 = defpackage.cb.IHQe1A4L2xu;
                kf0Var = this;
                if (!unsafe2.compareAndSwapObject(kf0Var, oh6vYeIP, mf0Var, F7NU4MC0GW) && unsafe2.getObjectVolatile(kf0Var, j) == mf0Var) {
                    this = kf0Var;
                }
            }
            this = kf0Var;
        }
    }

    public final int r1MBDhnF() {
        IHQe1A4L2xu.getClass();
        defpackage.mf0 mf0Var = (defpackage.mf0) defpackage.cb.IHQe1A4L2xu.getObjectVolatile(this, oh6vYeIP);
        mf0Var.getClass();
        long j = defpackage.mf0.xiZrDbcSW0.get(mf0Var);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }
}
