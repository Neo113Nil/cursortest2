package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class xn extends nr {
    public final String a;
    public final bdj b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;

    public xn(String str, bdj bdjVar, String str2, String str3, boolean z, String str4) {
        this.a = str;
        this.b = bdjVar;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = str4;
    }

    @Override // defpackage.nr
    public final String a() {
        return this.d;
    }

    @Override // defpackage.nr
    public final String b() {
        return this.f;
    }

    @Override // defpackage.nr
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xn)) {
            return false;
        }
        xn xnVar = (xn) obj;
        return jl40.l(this.a, xnVar.a) && jl40.l(this.b, xnVar.b) && jl40.l(this.c, xnVar.c) && jl40.l(this.d, xnVar.d) && this.e == xnVar.e && jl40.l(this.f, xnVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        bdj bdjVar = this.b;
        int e = unr0.e(unr0.b(unr0.b((hashCode + (bdjVar == null ? 0 : bdjVar.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        return e + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionOpenUniversalLink(title=");
        sb.append(this.a);
        sb.append(", dialog=");
        sb.append(this.b);
        sb.append(", url=");
        g8e.D(sb, this.c, ", imageTag=", this.d, ", shouldAuthorize=");
        return n.m(", metricaLabel=", this.f, Extension.C_BRAKE, sb, this.e);
    }
}
