package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes7.dex */
public final class wn71 {
    public static final yk71 Companion = new yk71();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public wn71(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, lh71.b);
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wn71)) {
            return false;
        }
        wn71 wn71Var = (wn71) obj;
        return jl40.l(this.a, wn71Var.a) && jl40.l(this.b, wn71Var.b) && jl40.l(this.c, wn71Var.c) && jl40.l(this.d, wn71Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + z2a1.a(z2a1.a(this.a.hashCode() * 31, this.b), this.c);
    }

    public final String toString() {
        return g8e.r(b64.v("FontUrls(regular=", this.a, ", bold=", this.b, ", light="), this.c, ", medium=", this.d, Extension.C_BRAKE);
    }
}
