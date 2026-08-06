package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class s21 extends defpackage.uc implements defpackage.qb0 {
    public final boolean Ns0WNyEWdPsk;

    public s21(java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.Ns0WNyEWdPsk = false;
    }

    public final defpackage.lb0 e6mdH7fiFuta() {
        if (this.Ns0WNyEWdPsk) {
            return this;
        }
        defpackage.lb0 lb0Var = this.WDYagTQQm9ns;
        if (lb0Var != null) {
            return lb0Var;
        }
        defpackage.lb0 WDYagTQQm9ns = WDYagTQQm9ns();
        this.WDYagTQQm9ns = WDYagTQQm9ns;
        return WDYagTQQm9ns;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.s21) {
            defpackage.s21 s21Var = (defpackage.s21) obj;
            return oh71FJcDz6S2().equals(s21Var.oh71FJcDz6S2()) && this.P05cfTpS5W5L.equals(s21Var.P05cfTpS5W5L) && this.e6mdH7fiFuta.equals(s21Var.e6mdH7fiFuta) && defpackage.ma0.QiMR8OkAhezm(this.oh71FJcDz6S2, s21Var.oh71FJcDz6S2);
        }
        if (obj instanceof defpackage.qb0) {
            return obj.equals(e6mdH7fiFuta());
        }
        return false;
    }

    public final int hashCode() {
        return this.e6mdH7fiFuta.hashCode() + ((this.P05cfTpS5W5L.hashCode() + (oh71FJcDz6S2().hashCode() * 31)) * 31);
    }

    public final java.lang.String toString() {
        defpackage.lb0 e6mdH7fiFuta = e6mdH7fiFuta();
        if (e6mdH7fiFuta != this) {
            return e6mdH7fiFuta.toString();
        }
        return "property " + this.P05cfTpS5W5L + " (Kotlin reflection is not available)";
    }
}
