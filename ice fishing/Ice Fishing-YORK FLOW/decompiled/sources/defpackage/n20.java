package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public class n20 extends defpackage.uc implements defpackage.m20, defpackage.lb0, defpackage.k20 {
    public final int Ns0WNyEWdPsk;

    public n20(int i, java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i2, int i3) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.Ns0WNyEWdPsk = i;
    }

    @Override // defpackage.uc
    public final defpackage.lb0 WDYagTQQm9ns() {
        defpackage.b41.ZpBGe2uQfcn8.getClass();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [lb0] */
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.n20) {
            defpackage.n20 n20Var = (defpackage.n20) obj;
            return this.P05cfTpS5W5L.equals(n20Var.P05cfTpS5W5L) && this.e6mdH7fiFuta.equals(n20Var.e6mdH7fiFuta) && defpackage.ma0.QiMR8OkAhezm(this.oh71FJcDz6S2, n20Var.oh71FJcDz6S2) && oh71FJcDz6S2().equals(n20Var.oh71FJcDz6S2());
        }
        if (!(obj instanceof defpackage.n20)) {
            return false;
        }
        ?? r0 = this.WDYagTQQm9ns;
        if (r0 == 0) {
            WDYagTQQm9ns();
            this.WDYagTQQm9ns = this;
        } else {
            this = r0;
        }
        return obj.equals(this);
    }

    @Override // defpackage.m20
    public final int fWTAfUmVKrZq() {
        return this.Ns0WNyEWdPsk;
    }

    public final int hashCode() {
        oh71FJcDz6S2();
        return this.e6mdH7fiFuta.hashCode() + ((this.P05cfTpS5W5L.hashCode() + (oh71FJcDz6S2().hashCode() * 31)) * 31);
    }

    public final java.lang.String toString() {
        defpackage.lb0 lb0Var = this.WDYagTQQm9ns;
        if (lb0Var == null) {
            WDYagTQQm9ns();
            this.WDYagTQQm9ns = this;
            lb0Var = this;
        }
        if (lb0Var != this) {
            return lb0Var.toString();
        }
        java.lang.String str = this.P05cfTpS5W5L;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + str + " (Kotlin reflection is not available)";
    }

    public n20(int i, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i2) {
        this(i, defpackage.tc.WDYagTQQm9ns, cls, str, str2, i2, 0);
    }
}
