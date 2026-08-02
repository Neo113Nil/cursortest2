package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class quk0 {
    public final ntj0 a;
    public final ntj0 b;

    public quk0(ntj0 ntj0Var, ntj0 ntj0Var2) {
        this.a = ntj0Var;
        this.b = ntj0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof quk0)) {
            return false;
        }
        quk0 quk0Var = (quk0) obj;
        return jl40.l(this.a, quk0Var.a) && jl40.l(this.b, quk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RoadsTariffsInfo(freeRoadCompoundTariffsInfo=" + this.a + ", tollRoadCompoundTariffsInfo=" + this.b + Extension.C_BRAKE;
    }
}
