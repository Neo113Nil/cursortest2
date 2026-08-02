package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final class su1 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final FormattedText f;
    public final qu1 g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final ru1 l;
    public final String m;

    public su1(int i, String str, String str2, String str3, String str4, FormattedText formattedText, qu1 qu1Var, String str5, String str6, String str7, String str8, ru1 ru1Var, String str9) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = formattedText;
        this.g = qu1Var;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = str8;
        this.l = ru1Var;
        this.m = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof su1)) {
            return false;
        }
        su1 su1Var = (su1) obj;
        return this.a == su1Var.a && jl40.l(this.b, su1Var.b) && jl40.l(this.c, su1Var.c) && jl40.l(this.d, su1Var.d) && jl40.l(this.e, su1Var.e) && jl40.l(this.f, su1Var.f) && jl40.l(this.g, su1Var.g) && jl40.l(this.h, su1Var.h) && jl40.l(this.i, su1Var.i) && jl40.l(this.j, su1Var.j) && jl40.l(this.k, su1Var.k) && jl40.l(this.l, su1Var.l) && jl40.l(this.m, su1Var.m);
    }

    public final int hashCode() {
        int b = unr0.b(Integer.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        FormattedText formattedText = this.f;
        int hashCode4 = (hashCode3 + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31;
        qu1 qu1Var = this.g;
        int hashCode5 = (hashCode4 + (qu1Var == null ? 0 : qu1Var.hashCode())) * 31;
        String str4 = this.h;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.j;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.k;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        ru1 ru1Var = this.l;
        int hashCode10 = (hashCode9 + (ru1Var == null ? 0 : ru1Var.hashCode())) * 31;
        String str8 = this.m;
        return hashCode10 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = unr0.v(this.a, "AltChoiceListItem(orderPriority=", ", title=", this.b, ", subtitle=");
        g8e.D(v, this.c, ", trailTitle=", this.d, ", trailSubtitle=");
        v.append(this.e);
        v.append(", trailSubtitleFormatted=");
        v.append(this.f);
        v.append(", badge=");
        v.append(this.g);
        v.append(", imageUrl=");
        v.append(this.h);
        v.append(", imageTag=");
        g8e.D(v, this.i, ", trailImageUrl=", this.j, ", trailImageTag=");
        v.append(this.k);
        v.append(", redirect=");
        v.append(this.l);
        v.append(", deeplink=");
        return oyr.t(v, this.m, Extension.C_BRAKE);
    }
}
