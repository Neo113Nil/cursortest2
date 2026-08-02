package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class u460 {
    public final String a;
    public final f360 b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final Integer f;
    public final List g;
    public final String h;
    public final List i;
    public final CharSequence j;
    public final CharSequence k;
    public final String l;
    public final String m;

    public u460(String str, f360 f360Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Integer num, List list, String str2, List list2, CharSequence charSequence4, CharSequence charSequence5, String str3, String str4) {
        this.a = str;
        this.b = f360Var;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = charSequence3;
        this.f = num;
        this.g = list;
        this.h = str2;
        this.i = list2;
        this.j = charSequence4;
        this.k = charSequence5;
        this.l = str3;
        this.m = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u460)) {
            return false;
        }
        u460 u460Var = (u460) obj;
        return jl40.l(this.a, u460Var.a) && jl40.l(this.b, u460Var.b) && jl40.l(this.c, u460Var.c) && jl40.l(this.d, u460Var.d) && jl40.l(this.e, u460Var.e) && jl40.l(this.f, u460Var.f) && jl40.l(this.g, u460Var.g) && jl40.l(this.h, u460Var.h) && jl40.l(this.i, u460Var.i) && jl40.l(this.j, u460Var.j) && jl40.l(this.k, u460Var.k) && jl40.l(this.l, u460Var.l) && jl40.l(this.m, u460Var.m);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        f360 f360Var = this.b;
        int b = smw0.b((hashCode + (f360Var == null ? 0 : f360Var.hashCode())) * 31, 31, this.c);
        CharSequence charSequence = this.d;
        int hashCode2 = (b + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.e;
        int hashCode3 = (hashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        Integer num = this.f;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.g;
        int b2 = unr0.b((hashCode4 + (list == null ? 0 : list.hashCode())) * 31, 31, this.h);
        List list2 = this.i;
        int b3 = smw0.b((b2 + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.j);
        CharSequence charSequence3 = this.k;
        int hashCode5 = (b3 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        String str = this.l;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.m;
        return hashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NeuroTextInputModel(key=");
        sb.append(this.a);
        sb.append(", image=");
        sb.append(this.b);
        sb.append(", title=");
        vfc.A(sb, this.c, ", subtitle=", this.d, ", maxSymbolsInputMessage=");
        sb.append((Object) this.e);
        sb.append(", inputMaxSymbols=");
        sb.append(this.f);
        sb.append(", prohibitedWords=");
        oyr.D(", placeholder=", this.h, ", hints=", sb, this.g);
        sb.append(this.i);
        sb.append(", buttonTitle=");
        sb.append((Object) this.j);
        sb.append(", buttonSubtitle=");
        sb.append((Object) this.k);
        sb.append(", metricaLabel=");
        sb.append(this.l);
        sb.append(", maxSymbolsInputMetricaLabel=");
        return oyr.t(sb, this.m, Extension.C_BRAKE);
    }
}
