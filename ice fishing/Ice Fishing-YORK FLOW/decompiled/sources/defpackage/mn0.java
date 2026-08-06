package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class mn0 extends defpackage.fk0 {
    public final defpackage.fy0 P05cfTpS5W5L;
    public java.lang.Object e6mdH7fiFuta;

    public mn0(defpackage.fy0 fy0Var, java.lang.Object obj, java.lang.Object obj2) {
        super(0, obj, obj2);
        this.P05cfTpS5W5L = fy0Var;
        this.e6mdH7fiFuta = obj2;
    }

    @Override // defpackage.fk0, java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.e6mdH7fiFuta;
    }

    @Override // defpackage.fk0, java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        java.lang.Object obj2 = this.e6mdH7fiFuta;
        this.e6mdH7fiFuta = obj;
        defpackage.dy0 dy0Var = (defpackage.dy0) this.P05cfTpS5W5L.oh71FJcDz6S2;
        defpackage.zx0 zx0Var = dy0Var.P05cfTpS5W5L;
        java.lang.Object obj3 = this.oh71FJcDz6S2;
        if (!zx0Var.containsKey(obj3)) {
            return obj2;
        }
        boolean z = dy0Var.QiMR8OkAhezm;
        if (!z) {
            zx0Var.put(obj3, obj);
        } else {
            if (!z) {
                defpackage.h7.BHfvd2J71qpO();
                return null;
            }
            defpackage.wp1 wp1Var = dy0Var.WDYagTQQm9ns[dy0Var.oh71FJcDz6S2];
            java.lang.Object obj4 = wp1Var.WDYagTQQm9ns[wp1Var.QiMR8OkAhezm];
            zx0Var.put(obj3, obj);
            dy0Var.fWTAfUmVKrZq(obj4 != null ? obj4.hashCode() : 0, zx0Var.oh71FJcDz6S2, obj4, 0);
        }
        dy0Var.Ns0WNyEWdPsk = zx0Var.P05cfTpS5W5L;
        return obj2;
    }
}
