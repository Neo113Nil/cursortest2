package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class rv1 implements sv1 {
    public final r901 a;
    public final pv1 b;

    public rv1(r901 r901Var, pv1 pv1Var) {
        this.a = r901Var;
        this.b = pv1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rv1)) {
            return false;
        }
        rv1 rv1Var = (rv1) obj;
        return jl40.l(this.a, rv1Var.a) && this.b.equals(rv1Var.b);
    }

    @Override // defpackage.sv1
    public final pv1 getContent() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NoRoutes(trafficState=" + this.a + ", content=" + this.b + Extension.C_BRAKE;
    }
}
