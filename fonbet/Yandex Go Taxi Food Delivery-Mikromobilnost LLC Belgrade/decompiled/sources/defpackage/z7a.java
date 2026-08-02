package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class z7a implements e6v {
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final String d;

    public z7a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = charSequence3;
        String obj = charSequence != null ? charSequence.toString() : null;
        this.d = obj == null ? "" : obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7a)) {
            return false;
        }
        z7a z7aVar = (z7a) obj;
        return jl40.l(this.a, z7aVar.a) && jl40.l(this.b, z7aVar.b) && jl40.l(this.c, z7aVar.c);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.d;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.b;
        int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.c;
        return hashCode2 + (charSequence3 != null ? charSequence3.hashCode() : 0);
    }

    public final String toString() {
        return xvz.n(vfc.r(this.a, this.b, "Pricing(name=", ", value=", ", hint="), this.c, Extension.C_BRAKE);
    }
}
