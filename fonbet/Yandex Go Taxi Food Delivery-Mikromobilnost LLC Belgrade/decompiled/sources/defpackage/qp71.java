package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class qp71 {
    public final sd81 a;
    public final Object b;
    public final long c;

    public qp71(sd81 sd81Var, Object obj, long j) {
        this.a = sd81Var;
        this.b = obj;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qp71)) {
            return false;
        }
        qp71 qp71Var = (qp71) obj;
        return jl40.l(this.a, qp71Var.a) && jl40.l(this.b, qp71Var.b) && this.c == qp71Var.c;
    }

    public final int hashCode() {
        sd81 sd81Var = this.a;
        int hashCode = (sd81Var == null ? 0 : sd81Var.hashCode()) * 31;
        Object obj = this.b;
        return Long.hashCode(this.c) + ((hashCode + (obj != null ? obj.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CachedItem(params=");
        sb.append(this.a);
        sb.append(", item=");
        sb.append(this.b);
        sb.append(", expiresAtTimestampMillis=");
        return oyr.n(this.c, Extension.C_BRAKE, sb);
    }
}
