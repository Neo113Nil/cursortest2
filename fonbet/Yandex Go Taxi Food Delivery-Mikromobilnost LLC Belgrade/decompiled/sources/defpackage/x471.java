package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes7.dex */
public final class x471 {
    public static final s171 Companion = new s171();
    public final long a;
    public final String b;
    public final String c;
    public final String d;

    public x471(int i, long j, String str, String str2, String str3) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, qy61.b);
            throw null;
        }
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x471)) {
            return false;
        }
        x471 x471Var = (x471) obj;
        return this.a == x471Var.a && jl40.l(this.b, x471Var.b) && jl40.l(this.c, x471Var.c) && jl40.l(this.d, x471Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + z2a1.a(z2a1.a(Long.hashCode(this.a) * 31, this.b), this.c);
    }

    public final String toString() {
        StringBuilder k = x4e.k("MobileAdsSdkLog(timestamp=", this.a, ", type=", this.b);
        g8e.D(k, ", tag=", this.c, ", text=", this.d);
        k.append(Extension.C_BRAKE);
        return k.toString();
    }

    public x471(long j, String str, String str2, String str3) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }
}
