package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class zm30 implements bn30 {
    public final igu0 a;
    public final pj40 b;

    public zm30(igu0 igu0Var, pj40 pj40Var) {
        this.a = igu0Var;
        this.b = pj40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zm30)) {
            return false;
        }
        zm30 zm30Var = (zm30) obj;
        return this.a.equals(zm30Var.a) && jl40.l(this.b, zm30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StopModal(stopModel=" + this.a + ", utmParams=" + this.b + Extension.C_BRAKE;
    }
}
