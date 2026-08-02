package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class w9z0 {
    public final int a;
    public final int b;
    public final v4v c;
    public final String d;
    public final s9z0 e;
    public final ldc f;

    public w9z0(int i, int i2, lvi0 lvi0Var, String str, s9z0 s9z0Var, ldc ldcVar) {
        this.a = i;
        this.b = i2;
        this.c = lvi0Var;
        this.d = str;
        this.e = s9z0Var;
        this.f = ldcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9z0)) {
            return false;
        }
        w9z0 w9z0Var = (w9z0) obj;
        return this.a == w9z0Var.a && this.b == w9z0Var.b && jl40.l(this.c, w9z0Var.c) && jl40.l(this.d, w9z0Var.d) && jl40.l(this.e, w9z0Var.e) && jl40.l(this.f, w9z0Var.f);
    }

    public final int hashCode() {
        int b = oyr.b(this.b, Integer.hashCode(this.a) * 31, 31);
        v4v v4vVar = this.c;
        int b2 = unr0.b((b + (v4vVar == null ? 0 : v4vVar.hashCode())) * 31, 31, this.d);
        s9z0 s9z0Var = this.e;
        int hashCode = (b2 + (s9z0Var == null ? 0 : s9z0Var.hashCode())) * 31;
        ldc ldcVar = this.f;
        return hashCode + (ldcVar != null ? Long.hashCode(ldcVar.a) : 0);
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "TimelineBubbleState(pointCount=", ", currentPointIndex=", ", icon=");
        s.append(this.c);
        s.append(", title=");
        s.append(this.d);
        s.append(", button=");
        s.append(this.e);
        s.append(", background=");
        s.append(this.f);
        s.append(Extension.C_BRAKE);
        return s.toString();
    }
}
