package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ti1 implements defpackage.be0, java.io.Serializable {
    public final java.lang.Object QiMR8OkAhezm;
    public defpackage.n10 WDYagTQQm9ns;
    public volatile java.lang.Object oh71FJcDz6S2;

    public ti1(defpackage.n10 n10Var) {
        n10Var.getClass();
        this.WDYagTQQm9ns = n10Var;
        this.oh71FJcDz6S2 = defpackage.pa1.WmetiUbpKU9I;
        this.QiMR8OkAhezm = this;
    }

    @Override // defpackage.be0
    public final java.lang.Object getValue() {
        java.lang.Object obj;
        java.lang.Object obj2 = this.oh71FJcDz6S2;
        defpackage.pa1 pa1Var = defpackage.pa1.WmetiUbpKU9I;
        if (obj2 != pa1Var) {
            return obj2;
        }
        synchronized (this.QiMR8OkAhezm) {
            obj = this.oh71FJcDz6S2;
            if (obj == pa1Var) {
                defpackage.n10 n10Var = this.WDYagTQQm9ns;
                n10Var.getClass();
                obj = n10Var.ZpBGe2uQfcn8();
                this.oh71FJcDz6S2 = obj;
                this.WDYagTQQm9ns = null;
            }
        }
        return obj;
    }

    public final java.lang.String toString() {
        return this.oh71FJcDz6S2 != defpackage.pa1.WmetiUbpKU9I ? java.lang.String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
