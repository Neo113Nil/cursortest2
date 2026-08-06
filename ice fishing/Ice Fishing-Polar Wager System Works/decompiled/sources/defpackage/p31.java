package defpackage;

/* loaded from: classes.dex */
public final class p31 implements defpackage.eb0, java.io.Serializable {
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater AARZUJiTa = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.p31.class, java.lang.Object.class, "xiZrDbcSW0");
    public volatile defpackage.vz adDC3e2L;
    public volatile java.lang.Object xiZrDbcSW0;

    @Override // defpackage.eb0
    public final java.lang.Object getValue() {
        java.lang.Object obj = this.xiZrDbcSW0;
        defpackage.ad1 ad1Var = defpackage.ad1.riuEU0zW4;
        if (obj != ad1Var) {
            return obj;
        }
        defpackage.vz vzVar = this.adDC3e2L;
        if (vzVar != null) {
            java.lang.Object IHQe1A4L2xu = vzVar.IHQe1A4L2xu();
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AARZUJiTa;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, ad1Var, IHQe1A4L2xu)) {
                if (atomicReferenceFieldUpdater.get(this) != ad1Var) {
                }
            }
            this.adDC3e2L = null;
            return IHQe1A4L2xu;
        }
        return this.xiZrDbcSW0;
    }

    public final java.lang.String toString() {
        return this.xiZrDbcSW0 != defpackage.ad1.riuEU0zW4 ? java.lang.String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
