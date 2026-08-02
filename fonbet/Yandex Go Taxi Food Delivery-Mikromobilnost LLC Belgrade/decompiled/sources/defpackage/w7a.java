package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class w7a {
    public final CharSequence a;
    public final CharSequence b;
    public final String c;
    public final lna d;
    public final Integer e;
    public final tn9 f;
    public final uj9 g;

    public w7a(CharSequence charSequence, CharSequence charSequence2, String str, lna lnaVar, Integer num, tn9 tn9Var, uj9 uj9Var) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = str;
        this.d = lnaVar;
        this.e = num;
        this.f = tn9Var;
        this.g = uj9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7a)) {
            return false;
        }
        w7a w7aVar = (w7a) obj;
        return jl40.l(this.a, w7aVar.a) && jl40.l(this.b, w7aVar.b) && jl40.l(this.c, w7aVar.c) && jl40.l(this.d, w7aVar.d) && jl40.l(this.e, w7aVar.e) && jl40.l(this.f, w7aVar.f) && this.g.equals(w7aVar.g);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.b;
        int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        lna lnaVar = this.d;
        int hashCode4 = (hashCode3 + (lnaVar == null ? 0 : lnaVar.hashCode())) * 31;
        Integer num = this.e;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        tn9 tn9Var = this.f;
        return this.g.hashCode() + ((hashCode5 + (tn9Var != null ? tn9Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "Banner(title=", ", subtitle=", ", imageUrl=");
        r.append(this.c);
        r.append(", progressImageParams=");
        r.append(this.d);
        r.append(", backgroundColor=");
        r.append(this.e);
        r.append(", attribute=");
        r.append(this.f);
        r.append(", action=");
        r.append(this.g);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
