package defpackage;

/* loaded from: classes.dex */
public final class wll2JLbTBC2 extends defpackage.s21 {
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater DFo87pBq1E5;
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater G3OKOH3wZRC;
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater QoRHpC4k;
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater SyNS6RMn;
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater cnag84Bm;

    public wll2JLbTBC2(java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.DFo87pBq1E5 = atomicReferenceFieldUpdater;
        this.SyNS6RMn = atomicReferenceFieldUpdater2;
        this.cnag84Bm = atomicReferenceFieldUpdater3;
        this.QoRHpC4k = atomicReferenceFieldUpdater4;
        this.G3OKOH3wZRC = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.s21
    public final boolean EgCjBq0SZwJ(defpackage.hyxIchWRW hyxichwrw, defpackage.yIx6ChFVk yix6chfvk) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.QoRHpC4k;
            if (atomicReferenceFieldUpdater.compareAndSet(hyxichwrw, yix6chfvk, defpackage.yIx6ChFVk.oh6vYeIP)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hyxichwrw) == yix6chfvk);
        return false;
    }

    @Override // defpackage.s21
    public final void EoOhNTTfIN7K(defpackage.mAr5m2L7gYDP mar5m2l7gydp, defpackage.mAr5m2L7gYDP mar5m2l7gydp2) {
        this.SyNS6RMn.lazySet(mar5m2l7gydp, mar5m2l7gydp2);
    }

    @Override // defpackage.s21
    public final boolean fnWB2E7cs(defpackage.hyxIchWRW hyxichwrw, java.lang.Object obj, java.lang.Object obj2) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.G3OKOH3wZRC;
            if (atomicReferenceFieldUpdater.compareAndSet(hyxichwrw, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hyxichwrw) == obj);
        return false;
    }

    @Override // defpackage.s21
    public final boolean kNAkVymC(defpackage.hyxIchWRW hyxichwrw, defpackage.mAr5m2L7gYDP mar5m2l7gydp, defpackage.mAr5m2L7gYDP mar5m2l7gydp2) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.cnag84Bm;
            if (atomicReferenceFieldUpdater.compareAndSet(hyxichwrw, mar5m2l7gydp, mar5m2l7gydp2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hyxichwrw) == mar5m2l7gydp);
        return false;
    }

    @Override // defpackage.s21
    public final void wKlPRKlRnfqr(defpackage.mAr5m2L7gYDP mar5m2l7gydp, java.lang.Thread thread) {
        this.DFo87pBq1E5.lazySet(mar5m2l7gydp, thread);
    }
}
