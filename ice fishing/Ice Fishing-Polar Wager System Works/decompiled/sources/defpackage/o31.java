package defpackage;

/* loaded from: classes.dex */
public final class o31 implements defpackage.ej, defpackage.wj {
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater xiZrDbcSW0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.o31.class, java.lang.Object.class, "result");
    public final defpackage.ej adDC3e2L;
    private volatile java.lang.Object result;

    public o31(defpackage.ej ejVar) {
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        this.adDC3e2L = ejVar;
        this.result = vjVar;
    }

    @Override // defpackage.ej
    public final void SH1y5HwkJhh(java.lang.Object obj) {
        while (true) {
            java.lang.Object obj2 = this.result;
            defpackage.vj vjVar = defpackage.vj.xiZrDbcSW0;
            if (obj2 == vjVar) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = xiZrDbcSW0;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, vjVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != vjVar) {
                        break;
                    }
                }
                return;
            }
            defpackage.vj vjVar2 = defpackage.vj.adDC3e2L;
            if (obj2 != vjVar2) {
                defpackage.db.AARZUJiTa("Already resumed");
                return;
            }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = xiZrDbcSW0;
            defpackage.vj vjVar3 = defpackage.vj.AARZUJiTa;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, vjVar2, vjVar3)) {
                if (atomicReferenceFieldUpdater2.get(this) != vjVar2) {
                    break;
                }
            }
            this.adDC3e2L.SH1y5HwkJhh(obj);
            return;
        }
    }

    @Override // defpackage.wj
    public final defpackage.wj r1MBDhnF() {
        defpackage.ej ejVar = this.adDC3e2L;
        if (ejVar instanceof defpackage.wj) {
            return (defpackage.wj) ejVar;
        }
        return null;
    }

    public final java.lang.String toString() {
        return "SafeContinuation for " + this.adDC3e2L;
    }

    @Override // defpackage.ej
    public final defpackage.lj xiZrDbcSW0() {
        return this.adDC3e2L.xiZrDbcSW0();
    }
}
