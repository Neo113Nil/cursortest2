package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class xpi {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final qa91 g;
    public final String h;

    public xpi(String str, String str2, String str3, String str4, String str5, String str6, qa91 qa91Var, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = qa91Var;
        this.h = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xpi)) {
            return false;
        }
        xpi xpiVar = (xpi) obj;
        return jl40.l(this.a, xpiVar.a) && jl40.l(this.b, xpiVar.b) && jl40.l(this.c, xpiVar.c) && jl40.l(this.d, xpiVar.d) && jl40.l(this.e, xpiVar.e) && jl40.l(this.f, xpiVar.f) && this.g.equals(xpiVar.g) && jl40.l(this.h, xpiVar.h);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int b2 = unr0.b((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        String str2 = this.f;
        int hashCode = (this.g.hashCode() + ((b2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.h;
        return hashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("AccentButton(backgroundColor=", this.a, ", title=", this.b, ", titleColor=");
        g8e.D(v, this.c, ", subtitle=", this.d, ", subtitleColor=");
        g8e.D(v, this.e, ", iconTag=", this.f, ", action=");
        v.append(this.g);
        v.append(", metricaLabel=");
        v.append(this.h);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
