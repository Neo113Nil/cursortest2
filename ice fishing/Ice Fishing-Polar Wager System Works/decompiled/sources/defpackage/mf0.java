package defpackage;

/* loaded from: classes.dex */
public final class mf0 {
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray F7NU4MC0GW;
    public final int IHQe1A4L2xu;
    private volatile /* synthetic */ java.lang.Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final boolean oh6vYeIP;
    public final int r1MBDhnF;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater adDC3e2L = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.mf0.class, java.lang.Object.class, "_next$volatile");
    public static final /* synthetic */ long EXtogiMhuM = defpackage.cb.IHQe1A4L2xu.objectFieldOffset(defpackage.mf0.class.getDeclaredField("_next$volatile"));
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater xiZrDbcSW0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(defpackage.mf0.class, "_state$volatile");
    public static final defpackage.et AARZUJiTa = new defpackage.et("REMOVE_FROZEN", 1);

    public mf0(int i, boolean z) {
        this.IHQe1A4L2xu = i;
        this.oh6vYeIP = z;
        int i2 = i - 1;
        this.r1MBDhnF = i2;
        this.F7NU4MC0GW = new java.util.concurrent.atomic.AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            defpackage.db.AARZUJiTa("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        defpackage.db.AARZUJiTa("Check failed.");
        throw null;
    }

    public final defpackage.mf0 F7NU4MC0GW() {
        long j;
        defpackage.mf0 mf0Var;
        while (true) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = xiZrDbcSW0;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                mf0Var = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            mf0Var = this;
            if (atomicLongFieldUpdater.compareAndSet(mf0Var, j, j2)) {
                j = j2;
                break;
            }
            this = mf0Var;
        }
        return mf0Var.oh6vYeIP(j);
    }

    public final int IHQe1A4L2xu(java.lang.Object obj) {
        while (true) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = xiZrDbcSW0;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.r1MBDhnF;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.oh6vYeIP;
            java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.F7NU4MC0GW;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                defpackage.mf0 mf0Var = this;
                if (xiZrDbcSW0.compareAndSet(mf0Var, j, ((-1152921503533105153L) & j) | (((i2 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    defpackage.mf0 mf0Var2 = mf0Var;
                    while ((atomicLongFieldUpdater.get(mf0Var2) & 1152921504606846976L) != 0) {
                        mf0Var2 = mf0Var2.F7NU4MC0GW();
                        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray2 = mf0Var2.F7NU4MC0GW;
                        int i4 = mf0Var2.r1MBDhnF & i2;
                        java.lang.Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof defpackage.lf0) && ((defpackage.lf0) obj2).IHQe1A4L2xu == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            mf0Var2 = null;
                        }
                        if (mf0Var2 == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                this = mf0Var;
            } else {
                int i5 = this.IHQe1A4L2xu;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final java.lang.Object adDC3e2L() {
        defpackage.mf0 mf0Var = this;
        while (true) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = xiZrDbcSW0;
            long j = atomicLongFieldUpdater.get(mf0Var);
            if ((j & 1152921504606846976L) != 0) {
                return AARZUJiTa;
            }
            int i = (int) (j & 1073741823);
            int i2 = mf0Var.r1MBDhnF;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == i3) {
                break;
            }
            java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = mf0Var.F7NU4MC0GW;
            java.lang.Object obj = atomicReferenceArray.get(i3);
            boolean z = mf0Var.oh6vYeIP;
            if (obj == null) {
                if (z) {
                    break;
                }
            } else {
                if (obj instanceof defpackage.lf0) {
                    break;
                }
                long j2 = (i + 1) & 1073741823;
                if (xiZrDbcSW0.compareAndSet(mf0Var, j, (j & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i3, null);
                    return obj;
                }
                mf0Var = this;
                if (z) {
                    while (true) {
                        long j3 = atomicLongFieldUpdater.get(mf0Var);
                        int i4 = (int) (j3 & 1073741823);
                        if ((j3 & 1152921504606846976L) != 0) {
                            mf0Var = mf0Var.F7NU4MC0GW();
                        } else {
                            defpackage.mf0 mf0Var2 = mf0Var;
                            if (xiZrDbcSW0.compareAndSet(mf0Var2, j3, (j3 & (-1073741824)) | j2)) {
                                mf0Var2.F7NU4MC0GW.set(i4 & mf0Var2.r1MBDhnF, null);
                                mf0Var = null;
                            } else {
                                mf0Var = mf0Var2;
                            }
                        }
                        if (mf0Var == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }

    public final defpackage.mf0 oh6vYeIP(long j) {
        defpackage.mf0 mf0Var;
        while (true) {
            adDC3e2L.getClass();
            sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
            long j2 = EXtogiMhuM;
            defpackage.mf0 mf0Var2 = (defpackage.mf0) unsafe.getObjectVolatile(this, j2);
            if (mf0Var2 != null) {
                return mf0Var2;
            }
            defpackage.mf0 mf0Var3 = new defpackage.mf0(this.IHQe1A4L2xu * 2, this.oh6vYeIP);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.r1MBDhnF;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                java.lang.Object obj = this.F7NU4MC0GW.get(i4);
                if (obj == null) {
                    obj = new defpackage.lf0(i);
                }
                mf0Var3.F7NU4MC0GW.set(mf0Var3.r1MBDhnF & i, obj);
                i++;
            }
            xiZrDbcSW0.set(mf0Var3, (-1152921504606846977L) & j);
            while (true) {
                sun.misc.Unsafe unsafe2 = defpackage.cb.IHQe1A4L2xu;
                mf0Var = this;
                if (!unsafe2.compareAndSwapObject(mf0Var, EXtogiMhuM, (java.lang.Object) null, mf0Var3) && unsafe2.getObjectVolatile(mf0Var, j2) == null) {
                    this = mf0Var;
                }
            }
            this = mf0Var;
        }
    }

    public final boolean r1MBDhnF() {
        while (true) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = xiZrDbcSW0;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
            defpackage.mf0 mf0Var = this;
            if (atomicLongFieldUpdater.compareAndSet(mf0Var, j, 2305843009213693952L | j)) {
                return true;
            }
            this = mf0Var;
        }
    }
}
