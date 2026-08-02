package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class wwa {
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final fxa e;
    public final vwa f;
    public final boolean g;
    public final int h;
    public final boolean i;

    public wwa(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, fxa fxaVar, vwa vwaVar, boolean z, int i, boolean z2) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = charSequence3;
        this.e = fxaVar;
        this.f = vwaVar;
        this.g = z;
        this.h = i;
        this.i = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wwa)) {
            return false;
        }
        wwa wwaVar = (wwa) obj;
        return jl40.l(this.a, wwaVar.a) && jl40.l(this.b, wwaVar.b) && jl40.l(this.c, wwaVar.c) && jl40.l(this.d, wwaVar.d) && jl40.l(this.e, wwaVar.e) && jl40.l(this.f, wwaVar.f) && this.g == wwaVar.g && this.h == wwaVar.h && this.i == wwaVar.i;
    }

    public final int hashCode() {
        int b = smw0.b(this.a.hashCode() * 31, 31, this.b);
        CharSequence charSequence = this.c;
        int hashCode = (b + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.d;
        int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        fxa fxaVar = this.e;
        int hashCode3 = (hashCode2 + (fxaVar == null ? 0 : fxaVar.hashCode())) * 31;
        vwa vwaVar = this.f;
        return Boolean.hashCode(this.i) + oyr.b(this.h, unr0.e((hashCode3 + (vwaVar != null ? vwaVar.hashCode() : 0)) * 31, 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder t = ly3.t(this.b, "ChargersTariffDetailItem(id=", this.a, ", title=", ", subtitle=");
        vfc.A(t, this.c, ", value=", this.d, ", valueAction=");
        t.append(this.e);
        t.append(", hint=");
        t.append(this.f);
        t.append(", hasTopDivider=");
        t.append(this.g);
        t.append(", bottomPaddingDp=");
        t.append(this.h);
        t.append(", isHidden=");
        return x4e.i(t, this.i, Extension.C_BRAKE);
    }
}
