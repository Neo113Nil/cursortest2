package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class lk implements defpackage.dc1 {
    public final java.util.concurrent.atomic.AtomicReference ZpBGe2uQfcn8;

    public lk(defpackage.of ofVar) {
        this.ZpBGe2uQfcn8 = new java.util.concurrent.atomic.AtomicReference(ofVar);
    }

    @Override // defpackage.dc1
    public final java.util.Iterator iterator() {
        defpackage.dc1 dc1Var = (defpackage.dc1) this.ZpBGe2uQfcn8.getAndSet(null);
        if (dc1Var != null) {
            return dc1Var.iterator();
        }
        defpackage.h7.P05cfTpS5W5L("This sequence can be consumed only once.");
        return null;
    }
}
