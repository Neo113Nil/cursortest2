package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class r031 implements v031 {
    public final v031 a;
    public final xvz0 b;
    public final rr51 c;

    public r031(v031 v031Var, xvz0 xvz0Var, rr51 rr51Var) {
        this.a = v031Var;
        this.b = xvz0Var;
        this.c = rr51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r031)) {
            return false;
        }
        r031 r031Var = (r031) obj;
        return jl40.l(this.a, r031Var.a) && jl40.l(this.b, r031Var.b) && jl40.l(this.c, r031Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        xvz0 xvz0Var = this.b;
        int hashCode2 = (hashCode + (xvz0Var == null ? 0 : xvz0Var.hashCode())) * 31;
        rr51 rr51Var = this.c;
        return hashCode2 + (rr51Var != null ? rr51Var.hashCode() : 0);
    }

    public final String toString() {
        return "Processing(previous=" + this.a + ", tooltip=" + this.b + ", divkitWidget=" + this.c + Extension.C_BRAKE;
    }
}
