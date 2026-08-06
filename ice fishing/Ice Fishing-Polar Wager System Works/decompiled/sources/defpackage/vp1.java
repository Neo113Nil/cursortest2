package defpackage;

/* loaded from: classes.dex */
public final class vp1 {
    public final java.util.concurrent.atomic.AtomicReferenceArray IHQe1A4L2xu = new java.util.concurrent.atomic.AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ java.lang.Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater oh6vYeIP = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.vp1.class, java.lang.Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ long xiZrDbcSW0 = defpackage.cb.IHQe1A4L2xu.objectFieldOffset(defpackage.vp1.class.getDeclaredField("lastScheduledTask$volatile"));
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1MBDhnF = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(defpackage.vp1.class, "producerIndex$volatile");
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater F7NU4MC0GW = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(defpackage.vp1.class, "consumerIndex$volatile");
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater adDC3e2L = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(defpackage.vp1.class, "blockingTasksInBuffer$volatile");

    public final defpackage.ze1 AARZUJiTa() {
        defpackage.vp1 vp1Var;
        while (true) {
            oh6vYeIP.getClass();
            sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
            long j = xiZrDbcSW0;
            defpackage.ze1 ze1Var = (defpackage.ze1) unsafe.getObjectVolatile(this, j);
            if (ze1Var != null && ze1Var.xiZrDbcSW0) {
                while (true) {
                    sun.misc.Unsafe unsafe2 = defpackage.cb.IHQe1A4L2xu;
                    vp1Var = this;
                    if (unsafe2.compareAndSwapObject(vp1Var, xiZrDbcSW0, ze1Var, (java.lang.Object) null)) {
                        return ze1Var;
                    }
                    if (unsafe2.getObjectVolatile(vp1Var, j) != ze1Var) {
                        break;
                    }
                    this = vp1Var;
                }
            }
            this = vp1Var;
        }
        defpackage.vp1 vp1Var2 = this;
        int i = F7NU4MC0GW.get(vp1Var2);
        int i2 = r1MBDhnF.get(vp1Var2);
        while (i != i2 && adDC3e2L.get(vp1Var2) != 0) {
            i2--;
            defpackage.ze1 EXtogiMhuM = vp1Var2.EXtogiMhuM(i2, true);
            if (EXtogiMhuM != null) {
                return EXtogiMhuM;
            }
        }
        return null;
    }

    public final defpackage.ze1 EXtogiMhuM(int i, boolean z) {
        int i2 = i & 127;
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.IHQe1A4L2xu;
        defpackage.ze1 ze1Var = (defpackage.ze1) atomicReferenceArray.get(i2);
        if (ze1Var != null && ze1Var.xiZrDbcSW0 == z) {
            while (!atomicReferenceArray.compareAndSet(i2, ze1Var, null)) {
                if (atomicReferenceArray.get(i2) != ze1Var) {
                }
            }
            if (z) {
                adDC3e2L.decrementAndGet(this);
            }
            return ze1Var;
        }
        return null;
    }

    public final void F7NU4MC0GW(defpackage.i20 i20Var) {
        oh6vYeIP.getClass();
        defpackage.ze1 ze1Var = (defpackage.ze1) defpackage.cb.IHQe1A4L2xu.getAndSetObject(this, xiZrDbcSW0, (java.lang.Object) null);
        if (ze1Var != null) {
            i20Var.IHQe1A4L2xu(ze1Var);
        }
        while (true) {
            defpackage.ze1 xiZrDbcSW02 = xiZrDbcSW0();
            if (xiZrDbcSW02 == null) {
                return;
            } else {
                i20Var.IHQe1A4L2xu(xiZrDbcSW02);
            }
        }
    }

    public final defpackage.ze1 IHQe1A4L2xu(defpackage.ze1 ze1Var, boolean z) {
        if (z) {
            return oh6vYeIP(ze1Var);
        }
        oh6vYeIP.getClass();
        defpackage.ze1 ze1Var2 = (defpackage.ze1) defpackage.cb.IHQe1A4L2xu.getAndSetObject(this, xiZrDbcSW0, ze1Var);
        if (ze1Var2 == null) {
            return null;
        }
        return oh6vYeIP(ze1Var2);
    }

    public final defpackage.ze1 adDC3e2L() {
        oh6vYeIP.getClass();
        defpackage.ze1 ze1Var = (defpackage.ze1) defpackage.cb.IHQe1A4L2xu.getAndSetObject(this, xiZrDbcSW0, (java.lang.Object) null);
        return ze1Var == null ? xiZrDbcSW0() : ze1Var;
    }

    public final defpackage.ze1 oh6vYeIP(defpackage.ze1 ze1Var) {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = r1MBDhnF;
        if (atomicIntegerFieldUpdater.get(this) - F7NU4MC0GW.get(this) == 127) {
            return ze1Var;
        }
        if (ze1Var.xiZrDbcSW0) {
            adDC3e2L.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.IHQe1A4L2xu;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, ze1Var);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            java.lang.Thread.yield();
        }
    }

    public final int r1MBDhnF() {
        oh6vYeIP.getClass();
        java.lang.Object objectVolatile = defpackage.cb.IHQe1A4L2xu.getObjectVolatile(this, xiZrDbcSW0);
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = F7NU4MC0GW;
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = r1MBDhnF;
        return objectVolatile != null ? (atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this)) + 1 : atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this);
    }

    public final long riuEU0zW4(int i, defpackage.rz0 rz0Var) {
        defpackage.vp1 vp1Var;
        while (true) {
            oh6vYeIP.getClass();
            sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
            long j = xiZrDbcSW0;
            defpackage.ze1 ze1Var = (defpackage.ze1) unsafe.getObjectVolatile(this, j);
            if (ze1Var == null) {
                return -2L;
            }
            if (((ze1Var.xiZrDbcSW0 ? 1 : 2) & i) == 0) {
                return -2L;
            }
            defpackage.bf1.xiZrDbcSW0.getClass();
            long nanoTime = java.lang.System.nanoTime() - ze1Var.adDC3e2L;
            long j2 = defpackage.bf1.oh6vYeIP;
            if (nanoTime < j2) {
                return j2 - nanoTime;
            }
            while (true) {
                sun.misc.Unsafe unsafe2 = defpackage.cb.IHQe1A4L2xu;
                vp1Var = this;
                if (unsafe2.compareAndSwapObject(vp1Var, xiZrDbcSW0, ze1Var, (java.lang.Object) null)) {
                    rz0Var.adDC3e2L = ze1Var;
                    return -1L;
                }
                if (unsafe2.getObjectVolatile(vp1Var, j) != ze1Var) {
                    break;
                }
                this = vp1Var;
            }
            this = vp1Var;
        }
    }

    public final defpackage.ze1 xiZrDbcSW0() {
        defpackage.ze1 ze1Var;
        while (true) {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = F7NU4MC0GW;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - r1MBDhnF.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (ze1Var = (defpackage.ze1) this.IHQe1A4L2xu.getAndSet(i2, null)) != null) {
                if (ze1Var.xiZrDbcSW0) {
                    adDC3e2L.decrementAndGet(this);
                }
                return ze1Var;
            }
        }
    }
}
