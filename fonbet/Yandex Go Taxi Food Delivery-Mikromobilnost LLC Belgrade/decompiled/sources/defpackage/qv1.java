package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class qv1 implements sv1 {
    public final r901 a;
    public final pv1 b;

    public qv1(r901 r901Var, pv1 pv1Var) {
        this.a = r901Var;
        this.b = pv1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qv1)) {
            return false;
        }
        qv1 qv1Var = (qv1) obj;
        return jl40.l(this.a, qv1Var.a) && this.b.equals(qv1Var.b);
    }

    @Override // defpackage.sv1
    public final pv1 getContent() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LoadingError(trafficState=" + this.a + ", content=" + this.b + Extension.C_BRAKE;
    }
}
