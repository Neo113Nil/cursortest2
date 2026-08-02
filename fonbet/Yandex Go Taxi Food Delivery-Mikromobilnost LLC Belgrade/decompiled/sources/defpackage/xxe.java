package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class xxe extends n351 {
    public final CharSequence c;
    public final CharSequence d;
    public final dty0 e;
    public final l690 f;
    public final String g;

    public xxe(CharSequence charSequence, CharSequence charSequence2, dty0 dty0Var, l690 l690Var, String str) {
        super("cost-detail", false, 14);
        this.c = charSequence;
        this.d = charSequence2;
        this.e = dty0Var;
        this.f = l690Var;
        this.g = str;
    }

    @Override // defpackage.n351
    public final String a() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxe)) {
            return false;
        }
        xxe xxeVar = (xxe) obj;
        return jl40.l(this.c, xxeVar.c) && jl40.l(this.d, xxeVar.d) && this.e.equals(xxeVar.e) && this.f.equals(xxeVar.f) && jl40.l(this.g, xxeVar.g);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + ((this.e.hashCode() + smw0.b(this.c.hashCode() * 31, 31, this.d)) * 31)) * 31;
        String str = this.g;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.c, this.d, "CostDetailModel(leadText=", ", trailText=", ", dotStyle=");
        r.append(this.e);
        r.append(", paddings=");
        r.append(this.f);
        r.append(", id=");
        return oyr.t(r, this.g, Extension.C_BRAKE);
    }
}
