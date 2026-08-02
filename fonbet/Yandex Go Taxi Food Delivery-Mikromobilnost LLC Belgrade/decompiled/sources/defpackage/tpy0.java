package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class tpy0 {
    public final String a;
    public final String b;
    public final f360 c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final String g;
    public final List h;
    public final CharSequence i;
    public final CharSequence j;
    public final String k;
    public final String l;

    public tpy0(String str, String str2, f360 f360Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, String str3, List list, CharSequence charSequence4, CharSequence charSequence5, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = f360Var;
        this.d = charSequence;
        this.e = charSequence2;
        this.f = charSequence3;
        this.g = str3;
        this.h = list;
        this.i = charSequence4;
        this.j = charSequence5;
        this.k = str4;
        this.l = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tpy0)) {
            return false;
        }
        tpy0 tpy0Var = (tpy0) obj;
        return jl40.l(this.a, tpy0Var.a) && jl40.l(this.b, tpy0Var.b) && jl40.l(this.c, tpy0Var.c) && jl40.l(this.d, tpy0Var.d) && jl40.l(this.e, tpy0Var.e) && jl40.l(this.f, tpy0Var.f) && jl40.l(this.g, tpy0Var.g) && jl40.l(this.h, tpy0Var.h) && jl40.l(this.i, tpy0Var.i) && jl40.l(this.j, tpy0Var.j) && jl40.l(this.k, tpy0Var.k) && jl40.l(this.l, tpy0Var.l);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        f360 f360Var = this.c;
        int b2 = smw0.b((b + (f360Var == null ? 0 : f360Var.hashCode())) * 31, 31, this.d);
        CharSequence charSequence = this.e;
        int hashCode = (b2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.f;
        int b3 = unr0.b((hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31, 31, this.g);
        List list = this.h;
        int b4 = smw0.b((b3 + (list == null ? 0 : list.hashCode())) * 31, 31, this.i);
        CharSequence charSequence3 = this.j;
        int hashCode2 = (b4 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        String str = this.k;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.l;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("TextInputScreenState(key=", this.a, ", initialText=", this.b, ", image=");
        v.append(this.c);
        v.append(", title=");
        v.append((Object) this.d);
        v.append(", subtitle=");
        vfc.A(v, this.e, ", errorInputMessage=", this.f, ", placeholder=");
        tse0.x(this.g, ", hints=", ", buttonTitle=", v, this.h);
        vfc.A(v, this.i, ", buttonSubtitle=", this.j, ", metricaLabel=");
        return g8e.r(v, this.k, ", errorInputMessageMetricaLabel=", this.l, Extension.C_BRAKE);
    }
}
