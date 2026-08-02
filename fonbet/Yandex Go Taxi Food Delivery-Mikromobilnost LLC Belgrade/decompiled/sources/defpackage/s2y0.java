package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class s2y0 {
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final r2y0 d;
    public final String e;

    public s2y0(String str, CharSequence charSequence, CharSequence charSequence2, r2y0 r2y0Var, String str2) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = r2y0Var;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2y0)) {
            return false;
        }
        s2y0 s2y0Var = (s2y0) obj;
        return jl40.l(this.a, s2y0Var.a) && jl40.l(this.b, s2y0Var.b) && jl40.l(this.c, s2y0Var.c) && jl40.l(this.d, s2y0Var.d) && jl40.l(this.e, s2y0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + smw0.b(smw0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder t = ly3.t(this.b, "TaxiOrderInfoSharingModel(id=", this.a, ", title=", ", text=");
        t.append((Object) this.c);
        t.append(", button=");
        t.append(this.d);
        t.append(", iconTag=");
        return oyr.t(t, this.e, Extension.C_BRAKE);
    }
}
