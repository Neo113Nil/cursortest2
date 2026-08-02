package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class z9u {
    public final CharSequence a;
    public final CharSequence b;
    public final String c;
    public final String d;
    public final String e;
    public final lcu f;
    public final ibu g;
    public final nbu h;
    public final boolean i;
    public final boolean j;
    public final idu k;

    public z9u(CharSequence charSequence, CharSequence charSequence2, String str, String str2, String str3, lcu lcuVar, ibu ibuVar, nbu nbuVar, boolean z, boolean z2, idu iduVar) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = lcuVar;
        this.g = ibuVar;
        this.h = nbuVar;
        this.i = z;
        this.j = z2;
        this.k = iduVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z9u)) {
            return false;
        }
        z9u z9uVar = (z9u) obj;
        return jl40.l(this.a, z9uVar.a) && jl40.l(this.b, z9uVar.b) && jl40.l(this.c, z9uVar.c) && jl40.l(this.d, z9uVar.d) && jl40.l(this.e, z9uVar.e) && jl40.l(this.f, z9uVar.f) && jl40.l(this.g, z9uVar.g) && jl40.l(this.h, z9uVar.h) && this.i == z9uVar.i && this.j == z9uVar.j && jl40.l(this.k, z9uVar.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + unr0.e(unr0.e((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + unr0.b(unr0.b(unr0.b(smw0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31)) * 31)) * 31, 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "HeaderInfo(sourceAddress=", ", destinationAddress=", ", addressesContentDescription=");
        g8e.D(r, this.c, ", tariffName=", this.d, ", tariffClass=");
        r.append(this.e);
        r.append(", tariffDescription=");
        r.append(this.f);
        r.append(", price=");
        r.append(this.g);
        r.append(", priceDetails=");
        r.append(this.h);
        r.append(", tariffInfoVisible=");
        nnm.v(", tariffCardInfoIconVisible=", ", headerUiConfig=", r, this.i, this.j);
        r.append(this.k);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
