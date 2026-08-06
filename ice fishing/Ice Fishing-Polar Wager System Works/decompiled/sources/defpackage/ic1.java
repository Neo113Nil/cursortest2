package defpackage;

/* loaded from: classes.dex */
public final class ic1 extends defpackage.hkbnNdmy {
    public final java.util.concurrent.atomic.AtomicReference IHQe1A4L2xu = new java.util.concurrent.atomic.AtomicReference(null);

    @Override // defpackage.hkbnNdmy
    public final boolean IHQe1A4L2xu(defpackage.lpprD5VAS lpprd5vas) {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.IHQe1A4L2xu;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(defpackage.gq1.SyNS6RMn);
        return true;
    }

    @Override // defpackage.hkbnNdmy
    public final defpackage.ej[] oh6vYeIP(defpackage.lpprD5VAS lpprd5vas) {
        this.IHQe1A4L2xu.set(null);
        return defpackage.h1.IHQe1A4L2xu;
    }
}
