package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes13.dex */
public final class x9p0 {
    public final FormattedText a;
    public final FormattedText b;
    public final String c;
    public final List d;
    public final FormattedText e;
    public final FormattedText f;
    public final FormattedText g;

    public x9p0(FormattedText formattedText, FormattedText formattedText2, String str, ArrayList arrayList, FormattedText formattedText3, FormattedText formattedText4, FormattedText formattedText5) {
        this.a = formattedText;
        this.b = formattedText2;
        this.c = str;
        this.d = arrayList;
        this.e = formattedText3;
        this.f = formattedText4;
        this.g = formattedText5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9p0)) {
            return false;
        }
        x9p0 x9p0Var = (x9p0) obj;
        return jl40.l(this.a, x9p0Var.a) && jl40.l(this.b, x9p0Var.b) && jl40.l(this.c, x9p0Var.c) && jl40.l(this.d, x9p0Var.d) && jl40.l(this.e, x9p0Var.e) && jl40.l(this.f, x9p0Var.f) && jl40.l(this.g, x9p0Var.g);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        FormattedText formattedText = this.b;
        int b = unr0.b((hashCode + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31, 31, this.c);
        List list = this.d;
        int hashCode2 = (b + (list == null ? 0 : list.hashCode())) * 31;
        FormattedText formattedText2 = this.e;
        int hashCode3 = (hashCode2 + (formattedText2 == null ? 0 : formattedText2.a.hashCode())) * 31;
        FormattedText formattedText3 = this.f;
        return this.g.a.hashCode() + ((hashCode3 + (formattedText3 != null ? formattedText3.a.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder r = n.r("ScootersZonesInfoScreen(title=", this.a, ", description=", this.b, ", iconTag=");
        tse0.x(this.c, ", items=", ", detailsTitle=", r, this.d);
        n.C(r, this.e, ", detailsSubtitle=", this.f, ", button=");
        return tse0.m(r, this.g, Extension.C_BRAKE);
    }
}
