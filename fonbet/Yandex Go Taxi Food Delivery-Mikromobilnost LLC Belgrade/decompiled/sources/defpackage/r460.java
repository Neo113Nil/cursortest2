package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class r460 {
    public final e360 a;
    public final FormattedText b;
    public final FormattedText c;
    public final FormattedText d;
    public final Integer e;
    public final List f;
    public final String g;
    public final List h;
    public final FormattedText i;
    public final FormattedText j;
    public final String k;
    public final String l;

    public r460(e360 e360Var, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3, Integer num, ArrayList arrayList, String str, ArrayList arrayList2, FormattedText formattedText4, FormattedText formattedText5, String str2, String str3) {
        this.a = e360Var;
        this.b = formattedText;
        this.c = formattedText2;
        this.d = formattedText3;
        this.e = num;
        this.f = arrayList;
        this.g = str;
        this.h = arrayList2;
        this.i = formattedText4;
        this.j = formattedText5;
        this.k = str2;
        this.l = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r460)) {
            return false;
        }
        r460 r460Var = (r460) obj;
        return jl40.l(this.a, r460Var.a) && this.b.equals(r460Var.b) && jl40.l(this.c, r460Var.c) && jl40.l(this.d, r460Var.d) && jl40.l(this.e, r460Var.e) && jl40.l(this.f, r460Var.f) && jl40.l(this.g, r460Var.g) && jl40.l(this.h, r460Var.h) && this.i.equals(r460Var.i) && jl40.l(this.j, r460Var.j) && jl40.l(this.k, r460Var.k) && jl40.l(this.l, r460Var.l);
    }

    public final int hashCode() {
        e360 e360Var = this.a;
        int c = unr0.c((e360Var == null ? 0 : e360Var.hashCode()) * 31, 31, this.b.a);
        FormattedText formattedText = this.c;
        int hashCode = (c + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31;
        FormattedText formattedText2 = this.d;
        int hashCode2 = (hashCode + (formattedText2 == null ? 0 : formattedText2.a.hashCode())) * 31;
        Integer num = this.e;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.f;
        int b = unr0.b((hashCode3 + (list == null ? 0 : list.hashCode())) * 31, 31, this.g);
        List list2 = this.h;
        int c2 = unr0.c((b + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.i.a);
        FormattedText formattedText3 = this.j;
        int hashCode4 = (c2 + (formattedText3 == null ? 0 : formattedText3.a.hashCode())) * 31;
        String str = this.k;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.l;
        return hashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NeuroTextInput(image=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append(this.c);
        sb.append(", maxSymbolsInputMessage=");
        sb.append(this.d);
        sb.append(", inputMaxSymbols=");
        sb.append(this.e);
        sb.append(", prohibitedWords=");
        sb.append(this.f);
        sb.append(", placeholder=");
        tse0.x(this.g, ", hints=", ", buttonTitle=", sb, this.h);
        sb.append(this.i);
        sb.append(", buttonSubtitle=");
        sb.append(this.j);
        sb.append(", maxSymbolsInputMetricaLabel=");
        return g8e.r(sb, this.k, ", metricaLabel=", this.l, Extension.C_BRAKE);
    }
}
