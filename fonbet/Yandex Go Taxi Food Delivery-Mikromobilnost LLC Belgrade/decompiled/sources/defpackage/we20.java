package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class we20 {
    public final qoc0 a;
    public final String b;
    public final soc0 c;

    public we20(qoc0 qoc0Var, String str, soc0 soc0Var) {
        this.a = qoc0Var;
        this.b = str;
        this.c = soc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we20)) {
            return false;
        }
        we20 we20Var = (we20) obj;
        return jl40.l(this.a, we20Var.a) && jl40.l(this.b, we20Var.b) && jl40.l(this.c, we20Var.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        soc0 soc0Var = this.c;
        return b + (soc0Var == null ? 0 : soc0Var.hashCode());
    }

    public final String toString() {
        return "ShownBadgeModel(plaque=" + this.a + ", screen=" + this.b + ", payload=" + this.c + Extension.C_BRAKE;
    }
}
