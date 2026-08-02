package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class rn90 implements tn90 {
    public final long a;
    public final String b;

    public rn90(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rn90)) {
            return false;
        }
        rn90 rn90Var = (rn90) obj;
        return this.a == rn90Var.a && this.b.equals(rn90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder k = x4e.k("Authenticated(uid=", this.a, ", token=", oyr.p("PassportToken(value=", this.b, Extension.C_BRAKE));
        k.append(Extension.C_BRAKE);
        return k.toString();
    }
}
