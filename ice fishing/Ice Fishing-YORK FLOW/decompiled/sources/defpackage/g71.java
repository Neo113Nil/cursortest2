package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class g71 implements defpackage.be0, java.io.Serializable {
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater QiMR8OkAhezm = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.g71.class, java.lang.Object.class, "oh71FJcDz6S2");
    public volatile defpackage.n10 WDYagTQQm9ns;
    public volatile java.lang.Object oh71FJcDz6S2;

    @Override // defpackage.be0
    public final java.lang.Object getValue() {
        java.lang.Object obj = this.oh71FJcDz6S2;
        defpackage.pa1 pa1Var = defpackage.pa1.WmetiUbpKU9I;
        if (obj != pa1Var) {
            return obj;
        }
        defpackage.n10 n10Var = this.WDYagTQQm9ns;
        if (n10Var != null) {
            java.lang.Object ZpBGe2uQfcn8 = n10Var.ZpBGe2uQfcn8();
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = QiMR8OkAhezm;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, pa1Var, ZpBGe2uQfcn8)) {
                if (atomicReferenceFieldUpdater.get(this) != pa1Var) {
                }
            }
            this.WDYagTQQm9ns = null;
            return ZpBGe2uQfcn8;
        }
        return this.oh71FJcDz6S2;
    }

    public final java.lang.String toString() {
        return this.oh71FJcDz6S2 != defpackage.pa1.WmetiUbpKU9I ? java.lang.String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
