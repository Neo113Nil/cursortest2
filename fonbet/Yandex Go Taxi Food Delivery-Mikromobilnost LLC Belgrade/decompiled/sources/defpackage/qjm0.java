package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class qjm0 {
    public final l1o a;
    public final g0c b;

    public qjm0(l1o l1oVar, g0c g0cVar) {
        this.a = l1oVar;
        this.b = g0cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qjm0)) {
            return false;
        }
        qjm0 qjm0Var = (qjm0) obj;
        return jl40.l(this.a, qjm0Var.a) && this.b.equals(qjm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CacheKey(context=" + this.a + ", contentType=" + this.b + Extension.C_BRAKE;
    }
}
