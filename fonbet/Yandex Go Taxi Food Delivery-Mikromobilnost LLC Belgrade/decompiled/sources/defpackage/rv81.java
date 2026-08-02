package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.rq1;

/* loaded from: classes7.dex */
public final class rv81 {
    public final String a;
    public final rq1 b;
    public final List c;

    public rv81(String str, rq1 rq1Var, List list) {
        this.a = str;
        this.b = rq1Var;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rv81)) {
            return false;
        }
        rv81 rv81Var = (rv81) obj;
        return jl40.l(this.a, rv81Var.a) && this.b == rv81Var.b && this.c.equals(rv81Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediationNetwork(name=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", adapters=");
        return ly3.s(sb, this.c, Extension.C_BRAKE);
    }
}
