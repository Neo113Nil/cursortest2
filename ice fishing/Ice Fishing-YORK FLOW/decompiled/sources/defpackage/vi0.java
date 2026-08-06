package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class vi0 {
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray JhCgjQRTAOCT;
    public final int ZpBGe2uQfcn8;
    private volatile /* synthetic */ java.lang.Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int fWTAfUmVKrZq;
    public final boolean giKS3J6vZuNy;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater WDYagTQQm9ns = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.vi0.class, java.lang.Object.class, "_next$volatile");
    public static final /* synthetic */ long P05cfTpS5W5L = defpackage.ed.ZpBGe2uQfcn8.objectFieldOffset(defpackage.vi0.class.getDeclaredField("_next$volatile"));
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater oh71FJcDz6S2 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(defpackage.vi0.class, "_state$volatile");
    public static final defpackage.ru QiMR8OkAhezm = new defpackage.ru("REMOVE_FROZEN", 1);

    public vi0(int i, boolean z) {
        this.ZpBGe2uQfcn8 = i;
        this.giKS3J6vZuNy = z;
        int i2 = i - 1;
        this.fWTAfUmVKrZq = i2;
        this.JhCgjQRTAOCT = new java.util.concurrent.atomic.AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            defpackage.h7.P05cfTpS5W5L("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        defpackage.h7.P05cfTpS5W5L("Check failed.");
        throw null;
    }

    public final defpackage.vi0 JhCgjQRTAOCT() {
        long j;
        defpackage.vi0 vi0Var;
        while (true) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = oh71FJcDz6S2;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                vi0Var = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            vi0Var = this;
            if (atomicLongFieldUpdater.compareAndSet(vi0Var, j, j2)) {
                j = j2;
                break;
            }
            this = vi0Var;
        }
        return vi0Var.giKS3J6vZuNy(j);
    }

    public final java.lang.Object WDYagTQQm9ns() {
        defpackage.vi0 vi0Var = this;
        while (true) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = oh71FJcDz6S2;
            long j = atomicLongFieldUpdater.get(vi0Var);
            if ((j & 1152921504606846976L) != 0) {
                return QiMR8OkAhezm;
            }
            int i = (int) (j & 1073741823);
            int i2 = vi0Var.fWTAfUmVKrZq;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == i3) {
                break;
            }
            java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = vi0Var.JhCgjQRTAOCT;
            java.lang.Object obj = atomicReferenceArray.get(i3);
            boolean z = vi0Var.giKS3J6vZuNy;
            if (obj == null) {
                if (z) {
                    break;
                }
            } else {
                if (obj instanceof defpackage.ui0) {
                    break;
                }
                long j2 = (i + 1) & 1073741823;
                if (oh71FJcDz6S2.compareAndSet(vi0Var, j, (j & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i3, null);
                    return obj;
                }
                vi0Var = this;
                if (z) {
                    while (true) {
                        long j3 = atomicLongFieldUpdater.get(vi0Var);
                        int i4 = (int) (j3 & 1073741823);
                        if ((j3 & 1152921504606846976L) != 0) {
                            vi0Var = vi0Var.JhCgjQRTAOCT();
                        } else {
                            defpackage.vi0 vi0Var2 = vi0Var;
                            if (oh71FJcDz6S2.compareAndSet(vi0Var2, j3, (j3 & (-1073741824)) | j2)) {
                                vi0Var2.JhCgjQRTAOCT.set(i4 & vi0Var2.fWTAfUmVKrZq, null);
                                vi0Var = null;
                            } else {
                                vi0Var = vi0Var2;
                            }
                        }
                        if (vi0Var == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }

    public final int ZpBGe2uQfcn8(java.lang.Object obj) {
        while (true) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = oh71FJcDz6S2;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.fWTAfUmVKrZq;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.giKS3J6vZuNy;
            java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.JhCgjQRTAOCT;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                defpackage.vi0 vi0Var = this;
                if (oh71FJcDz6S2.compareAndSet(vi0Var, j, ((-1152921503533105153L) & j) | (((i2 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    defpackage.vi0 vi0Var2 = vi0Var;
                    while ((atomicLongFieldUpdater.get(vi0Var2) & 1152921504606846976L) != 0) {
                        vi0Var2 = vi0Var2.JhCgjQRTAOCT();
                        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray2 = vi0Var2.JhCgjQRTAOCT;
                        int i4 = vi0Var2.fWTAfUmVKrZq & i2;
                        java.lang.Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof defpackage.ui0) && ((defpackage.ui0) obj2).ZpBGe2uQfcn8 == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            vi0Var2 = null;
                        }
                        if (vi0Var2 == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                this = vi0Var;
            } else {
                int i5 = this.ZpBGe2uQfcn8;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean fWTAfUmVKrZq() {
        while (true) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = oh71FJcDz6S2;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
            defpackage.vi0 vi0Var = this;
            if (atomicLongFieldUpdater.compareAndSet(vi0Var, j, 2305843009213693952L | j)) {
                return true;
            }
            this = vi0Var;
        }
    }

    public final defpackage.vi0 giKS3J6vZuNy(long j) {
        defpackage.vi0 vi0Var;
        while (true) {
            WDYagTQQm9ns.getClass();
            sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
            long j2 = P05cfTpS5W5L;
            defpackage.vi0 vi0Var2 = (defpackage.vi0) unsafe.getObjectVolatile(this, j2);
            if (vi0Var2 != null) {
                return vi0Var2;
            }
            defpackage.vi0 vi0Var3 = new defpackage.vi0(this.ZpBGe2uQfcn8 * 2, this.giKS3J6vZuNy);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.fWTAfUmVKrZq;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                java.lang.Object obj = this.JhCgjQRTAOCT.get(i4);
                if (obj == null) {
                    obj = new defpackage.ui0(i);
                }
                vi0Var3.JhCgjQRTAOCT.set(vi0Var3.fWTAfUmVKrZq & i, obj);
                i++;
            }
            oh71FJcDz6S2.set(vi0Var3, (-1152921504606846977L) & j);
            while (true) {
                sun.misc.Unsafe unsafe2 = defpackage.ed.ZpBGe2uQfcn8;
                vi0Var = this;
                if (!unsafe2.compareAndSwapObject(vi0Var, P05cfTpS5W5L, (java.lang.Object) null, vi0Var3) && unsafe2.getObjectVolatile(vi0Var, j2) == null) {
                    this = vi0Var;
                }
            }
            this = vi0Var;
        }
    }
}
