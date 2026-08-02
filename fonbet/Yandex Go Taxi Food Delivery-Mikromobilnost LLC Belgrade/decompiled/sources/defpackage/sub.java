package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class sub implements pre {
    public final String a;
    public final a1w b;
    public final String c;
    public final hty0 d;
    public final String e;
    public final String f;
    public final List g;
    public final String h;
    public final FormattedText i;
    public final s6b1 j;
    public final r9x0 k;
    public final String l;

    public sub(String str, a1w a1wVar, String str2, hty0 hty0Var, String str3, String str4, List list, String str5, FormattedText formattedText, s6b1 s6b1Var, r9x0 r9x0Var, String str6) {
        this.a = str;
        this.b = a1wVar;
        this.c = str2;
        this.d = hty0Var;
        this.e = str3;
        this.f = str4;
        this.g = list;
        this.h = str5;
        this.i = formattedText;
        this.j = s6b1Var;
        this.k = r9x0Var;
        this.l = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sub)) {
            return false;
        }
        sub subVar = (sub) obj;
        return jl40.l(this.a, subVar.a) && this.b.equals(subVar.b) && jl40.l(this.c, subVar.c) && jl40.l(this.d, subVar.d) && jl40.l(this.e, subVar.e) && jl40.l(this.f, subVar.f) && jl40.l(this.g, subVar.g) && jl40.l(this.h, subVar.h) && jl40.l(this.i, subVar.i) && jl40.l(this.j, subVar.j) && jl40.l(this.k, subVar.k) && jl40.l(this.l, subVar.l);
    }

    @Override // defpackage.pre
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.pre
    public final String getType() {
        return "circle-input";
    }

    public final int hashCode() {
        int b = unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        hty0 hty0Var = this.d;
        int b2 = unr0.b(unr0.c(unr0.b(unr0.b((b + (hty0Var == null ? 0 : hty0Var.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        FormattedText formattedText = this.i;
        int hashCode = (b2 + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31;
        s6b1 s6b1Var = this.j;
        int hashCode2 = (hashCode + (s6b1Var == null ? 0 : s6b1Var.hashCode())) * 31;
        r9x0 r9x0Var = this.k;
        int hashCode3 = (hashCode2 + (r9x0Var == null ? 0 : r9x0Var.hashCode())) * 31;
        String str = this.l;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CircleInputRemoteCoreWidget(id=");
        sb.append(this.a);
        sb.append(", inputValue=");
        sb.append(this.b);
        sb.append(", valueFormater=");
        sb.append(this.c);
        sb.append(", valueTextStyle=");
        sb.append(this.d);
        sb.append(", formaterMask=");
        g8e.D(sb, this.e, ", minValueTitle=", this.f, ", gradientColors=");
        oyr.D(", formStateKey=", this.h, ", subtitle=", sb, this.g);
        sb.append(this.i);
        sb.append(", icon=");
        sb.append(this.j);
        sb.append(", action=");
        sb.append(this.k);
        sb.append(", metricaLabel=");
        sb.append(this.l);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
