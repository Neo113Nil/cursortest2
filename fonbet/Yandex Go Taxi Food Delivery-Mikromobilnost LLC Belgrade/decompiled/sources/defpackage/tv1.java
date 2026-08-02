package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class tv1 implements wv1 {
    public final qe50 a;
    public final r901 b;

    public tv1(qe50 qe50Var, r901 r901Var) {
        this.a = qe50Var;
        this.b = r901Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tv1)) {
            return false;
        }
        tv1 tv1Var = (tv1) obj;
        return jl40.l(this.a, tv1Var.a) && jl40.l(this.b, tv1Var.b);
    }

    public final int hashCode() {
        qe50 qe50Var = this.a;
        return this.b.hashCode() + ((qe50Var == null ? 0 : qe50Var.hashCode()) * 31);
    }

    public final String toString() {
        return "Loading(route=" + this.a + ", trafficState=" + this.b + Extension.C_BRAKE;
    }
}
