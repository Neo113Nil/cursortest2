package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class s611 implements h711 {
    public final CharSequence a;
    public final CharSequence b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final boolean g;
    public final k911 h;
    public final String i;

    public s611(CharSequence charSequence, CharSequence charSequence2, String str, int i, String str2, String str3, boolean z, k911 k911Var, String str4) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = str;
        this.d = i;
        this.e = str2;
        this.f = str3;
        this.g = z;
        this.h = k911Var;
        this.i = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s611)) {
            return false;
        }
        s611 s611Var = (s611) obj;
        return jl40.l(this.a, s611Var.a) && jl40.l(this.b, s611Var.b) && jl40.l(this.c, s611Var.c) && this.d == s611Var.d && jl40.l(this.e, s611Var.e) && jl40.l(this.f, s611Var.f) && this.g == s611Var.g && jl40.l(this.h, s611Var.h) && this.i.equals(s611Var.i);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.i;
    }

    public final int hashCode() {
        int b = unr0.b(oyr.b(this.d, unr0.b(smw0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e);
        String str = this.f;
        return this.i.hashCode() + smw0.e(this.h, unr0.e((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.g), 31);
    }

    @Override // defpackage.h711
    public final k911 j() {
        return this.h;
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "StopsGroupItem(text=", ", v2Text=", ", time=");
        b64.A(this.d, this.c, ", sectionId=", ", contentDescription=", r);
        g8e.D(r, this.e, ", actionDescription=", this.f, ", noIntermediateStops=");
        r.append(this.g);
        r.append(", transportType=");
        r.append(this.h);
        r.append(", id=");
        return oyr.t(r, this.i, Extension.C_BRAKE);
    }
}
