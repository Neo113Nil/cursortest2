package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class yyp0 {
    public final tg2 a;
    public final tg2 b;

    public yyp0(tg2 tg2Var, tg2 tg2Var2) {
        this.a = tg2Var;
        this.b = tg2Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!yyp0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        yyp0 yyp0Var = (yyp0) obj;
        return jl40.l(this.a, yyp0Var.a) && jl40.l(this.b, yyp0Var.b);
    }

    public final int hashCode() {
        tg2 tg2Var = this.a;
        int hashCode = (tg2Var != null ? tg2Var.hashCode() : 0) * 31;
        tg2 tg2Var2 = this.b;
        return hashCode + (tg2Var2 != null ? tg2Var2.hashCode() : 0);
    }

    public final String toString() {
        return "Animations(onShow=" + this.a + ", onRefresh=" + this.b + Extension.C_BRAKE;
    }
}
