package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class w7q0 {
    public final String a;
    public final long b;
    public final long c;

    public w7q0(String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7q0)) {
            return false;
        }
        w7q0 w7q0Var = (w7q0) obj;
        return jl40.l(this.a, w7q0Var.a) && ldc.c(this.b, w7q0Var.b) && ldc.c(this.c, w7q0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = ldc.n;
        return Long.hashCode(this.c) + qv10.c(hashCode, 31, this.b);
    }

    public final String toString() {
        String i = ldc.i(this.b);
        return oyr.t(b64.v("SegmentBadgeState(text=", this.a, ", textColor=", i, ", backgroundColor="), ldc.i(this.c), Extension.C_BRAKE);
    }
}
