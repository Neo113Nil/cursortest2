package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class v401 {
    public final p401 a;
    public final q401 b;
    public final q401 c;
    public final t401 d;

    public v401(p401 p401Var, q401 q401Var, q401 q401Var2, t401 t401Var) {
        this.a = p401Var;
        this.b = q401Var;
        this.c = q401Var2;
        this.d = t401Var;
    }

    public final p401 a() {
        return this.a;
    }

    public final q401 b() {
        return this.c;
    }

    public final q401 c() {
        return this.b;
    }

    public final t401 d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v401)) {
            return false;
        }
        v401 v401Var = (v401) obj;
        return jl40.l(this.a, v401Var.a) && jl40.l(this.b, v401Var.b) && jl40.l(this.c, v401Var.c) && jl40.l(this.d, v401Var.d);
    }

    public final int hashCode() {
        p401 p401Var = this.a;
        int hashCode = (p401Var == null ? 0 : p401Var.hashCode()) * 31;
        q401 q401Var = this.b;
        int hashCode2 = (hashCode + (q401Var == null ? 0 : q401Var.hashCode())) * 31;
        q401 q401Var2 = this.c;
        int hashCode3 = (hashCode2 + (q401Var2 == null ? 0 : q401Var2.hashCode())) * 31;
        t401 t401Var = this.d;
        return hashCode3 + (t401Var != null ? t401Var.hashCode() : 0);
    }

    public final String toString() {
        return "TrackingCardStatus(lead=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", trail=" + this.d + Extension.C_BRAKE;
    }
}
