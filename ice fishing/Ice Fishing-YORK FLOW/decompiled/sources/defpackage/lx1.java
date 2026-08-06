package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class lx1 {
    public final java.util.concurrent.atomic.AtomicReferenceArray ZpBGe2uQfcn8 = new java.util.concurrent.atomic.AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ java.lang.Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater giKS3J6vZuNy = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.lx1.class, java.lang.Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ long oh71FJcDz6S2 = defpackage.ed.ZpBGe2uQfcn8.objectFieldOffset(defpackage.lx1.class.getDeclaredField("lastScheduledTask$volatile"));
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater fWTAfUmVKrZq = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(defpackage.lx1.class, "producerIndex$volatile");
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater JhCgjQRTAOCT = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(defpackage.lx1.class, "consumerIndex$volatile");
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater WDYagTQQm9ns = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(defpackage.lx1.class, "blockingTasksInBuffer$volatile");

    public final void JhCgjQRTAOCT(defpackage.r30 r30Var) {
        giKS3J6vZuNy.getClass();
        defpackage.qj1 qj1Var = (defpackage.qj1) defpackage.ed.ZpBGe2uQfcn8.getAndSetObject(this, oh71FJcDz6S2, (java.lang.Object) null);
        if (qj1Var != null) {
            r30Var.ZpBGe2uQfcn8(qj1Var);
        }
        while (true) {
            defpackage.qj1 oh71FJcDz6S22 = oh71FJcDz6S2();
            if (oh71FJcDz6S22 == null) {
                return;
            } else {
                r30Var.ZpBGe2uQfcn8(oh71FJcDz6S22);
            }
        }
    }

    public final defpackage.qj1 P05cfTpS5W5L(int i, boolean z) {
        int i2 = i & 127;
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.ZpBGe2uQfcn8;
        defpackage.qj1 qj1Var = (defpackage.qj1) atomicReferenceArray.get(i2);
        if (qj1Var != null && qj1Var.oh71FJcDz6S2 == z) {
            while (!atomicReferenceArray.compareAndSet(i2, qj1Var, null)) {
                if (atomicReferenceArray.get(i2) != qj1Var) {
                }
            }
            if (z) {
                WDYagTQQm9ns.decrementAndGet(this);
            }
            return qj1Var;
        }
        return null;
    }

    public final defpackage.qj1 QiMR8OkAhezm() {
        defpackage.lx1 lx1Var;
        while (true) {
            giKS3J6vZuNy.getClass();
            sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
            long j = oh71FJcDz6S2;
            defpackage.qj1 qj1Var = (defpackage.qj1) unsafe.getObjectVolatile(this, j);
            if (qj1Var != null && qj1Var.oh71FJcDz6S2) {
                while (true) {
                    sun.misc.Unsafe unsafe2 = defpackage.ed.ZpBGe2uQfcn8;
                    lx1Var = this;
                    if (unsafe2.compareAndSwapObject(lx1Var, oh71FJcDz6S2, qj1Var, (java.lang.Object) null)) {
                        return qj1Var;
                    }
                    if (unsafe2.getObjectVolatile(lx1Var, j) != qj1Var) {
                        break;
                    }
                    this = lx1Var;
                }
            }
            this = lx1Var;
        }
        defpackage.lx1 lx1Var2 = this;
        int i = JhCgjQRTAOCT.get(lx1Var2);
        int i2 = fWTAfUmVKrZq.get(lx1Var2);
        while (i != i2 && WDYagTQQm9ns.get(lx1Var2) != 0) {
            i2--;
            defpackage.qj1 P05cfTpS5W5L = lx1Var2.P05cfTpS5W5L(i2, true);
            if (P05cfTpS5W5L != null) {
                return P05cfTpS5W5L;
            }
        }
        return null;
    }

    public final defpackage.qj1 WDYagTQQm9ns() {
        giKS3J6vZuNy.getClass();
        defpackage.qj1 qj1Var = (defpackage.qj1) defpackage.ed.ZpBGe2uQfcn8.getAndSetObject(this, oh71FJcDz6S2, (java.lang.Object) null);
        return qj1Var == null ? oh71FJcDz6S2() : qj1Var;
    }

    public final defpackage.qj1 ZpBGe2uQfcn8(defpackage.qj1 qj1Var, boolean z) {
        if (z) {
            return giKS3J6vZuNy(qj1Var);
        }
        giKS3J6vZuNy.getClass();
        defpackage.qj1 qj1Var2 = (defpackage.qj1) defpackage.ed.ZpBGe2uQfcn8.getAndSetObject(this, oh71FJcDz6S2, qj1Var);
        if (qj1Var2 == null) {
            return null;
        }
        return giKS3J6vZuNy(qj1Var2);
    }

    public final long e6mdH7fiFuta(int i, defpackage.z31 z31Var) {
        defpackage.lx1 lx1Var;
        while (true) {
            giKS3J6vZuNy.getClass();
            sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
            long j = oh71FJcDz6S2;
            defpackage.qj1 qj1Var = (defpackage.qj1) unsafe.getObjectVolatile(this, j);
            if (qj1Var == null) {
                return -2L;
            }
            if (((qj1Var.oh71FJcDz6S2 ? 1 : 2) & i) == 0) {
                return -2L;
            }
            defpackage.sj1.oh71FJcDz6S2.getClass();
            long nanoTime = java.lang.System.nanoTime() - qj1Var.WDYagTQQm9ns;
            long j2 = defpackage.sj1.giKS3J6vZuNy;
            if (nanoTime < j2) {
                return j2 - nanoTime;
            }
            while (true) {
                sun.misc.Unsafe unsafe2 = defpackage.ed.ZpBGe2uQfcn8;
                lx1Var = this;
                if (unsafe2.compareAndSwapObject(lx1Var, oh71FJcDz6S2, qj1Var, (java.lang.Object) null)) {
                    z31Var.WDYagTQQm9ns = qj1Var;
                    return -1L;
                }
                if (unsafe2.getObjectVolatile(lx1Var, j) != qj1Var) {
                    break;
                }
                this = lx1Var;
            }
            this = lx1Var;
        }
    }

    public final int fWTAfUmVKrZq() {
        giKS3J6vZuNy.getClass();
        java.lang.Object objectVolatile = defpackage.ed.ZpBGe2uQfcn8.getObjectVolatile(this, oh71FJcDz6S2);
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = JhCgjQRTAOCT;
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = fWTAfUmVKrZq;
        return objectVolatile != null ? (atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this)) + 1 : atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this);
    }

    public final defpackage.qj1 giKS3J6vZuNy(defpackage.qj1 qj1Var) {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = fWTAfUmVKrZq;
        if (atomicIntegerFieldUpdater.get(this) - JhCgjQRTAOCT.get(this) == 127) {
            return qj1Var;
        }
        if (qj1Var.oh71FJcDz6S2) {
            WDYagTQQm9ns.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.ZpBGe2uQfcn8;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, qj1Var);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            java.lang.Thread.yield();
        }
    }

    public final defpackage.qj1 oh71FJcDz6S2() {
        defpackage.qj1 qj1Var;
        while (true) {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = JhCgjQRTAOCT;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - fWTAfUmVKrZq.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (qj1Var = (defpackage.qj1) this.ZpBGe2uQfcn8.getAndSet(i2, null)) != null) {
                if (qj1Var.oh71FJcDz6S2) {
                    WDYagTQQm9ns.decrementAndGet(this);
                }
                return qj1Var;
            }
        }
    }
}
