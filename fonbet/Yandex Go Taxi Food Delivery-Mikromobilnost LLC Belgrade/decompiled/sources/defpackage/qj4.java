package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class qj4 {
    public final String a;
    public final long b;
    public final long c;

    public qj4(String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qj4)) {
            return false;
        }
        qj4 qj4Var = (qj4) obj;
        return jl40.l(this.a, qj4Var.a) && ldc.c(this.b, qj4Var.b) && ldc.c(this.c, qj4Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = ldc.n;
        return Long.hashCode(this.c) + qv10.c(hashCode, 31, this.b);
    }

    public final String toString() {
        String i = ldc.i(this.b);
        return oyr.t(b64.v("Badge(text=", this.a, ", textColor=", i, ", backgroundColor="), ldc.i(this.c), Extension.C_BRAKE);
    }
}
