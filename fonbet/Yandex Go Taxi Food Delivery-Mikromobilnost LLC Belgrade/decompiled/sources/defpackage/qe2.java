package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class qe2 {
    public final String a;
    public final long b;
    public final boolean c;

    public qe2(String str, long j, boolean z) {
        this.a = str;
        this.b = j;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe2)) {
            return false;
        }
        qe2 qe2Var = (qe2) obj;
        return jl40.l(this.a, qe2Var.a) && this.b == qe2Var.b && this.c == qe2Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qv10.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return xra1.a(x4e.l("Icon(imageUrl=", this.a, ", delayToShow=", this.b), ", isDefaultSize=", this.c, Extension.C_BRAKE);
    }
}
