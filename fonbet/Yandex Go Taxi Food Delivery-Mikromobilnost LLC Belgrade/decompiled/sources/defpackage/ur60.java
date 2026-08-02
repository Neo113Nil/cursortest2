package defpackage;

import com.yandex.go.dto.response.q1;
import com.yandex.go.shortcuts.dto.response.Background;
import com.yandex.go.shortcuts.dto.response.Counters;
import com.yandex.go.shortcuts.dto.response.Offer$Animation;
import com.yandex.go.shortcuts.dto.response.Offer$MainScreenOnboarding;
import com.yandex.go.shortcuts.dto.response.TextStyleDto;
import com.yandex.go.shortcuts.dto.response.e0;
import com.yandex.go.shortcuts.dto.response.f0;
import com.yandex.go.shortcuts.models.OfferType;
import java.util.List;
import kotlinx.serialization.json.c;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0(with = e0.class)
/* loaded from: classes13.dex */
public final class ur60 {
    public static final rr60 Companion = new rr60();
    public final String a;
    public final String b;
    public final String c;
    public final FormattedText d;
    public final FormattedText e;
    public final double f;
    public final double g;
    public final List h;
    public final TextStyleDto i;
    public final Background j;
    public final Background k;
    public final Counters l;
    public final f0 m;
    public final OfferType n;
    public final q1 o;
    public final String p;
    public final String q;
    public final String r;
    public final List s;
    public final Offer$MainScreenOnboarding t;
    public final Offer$Animation u;
    public final List v;
    public final di2 w;
    public final cei0 x;
    public c y;

    public ur60(String str, String str2, String str3, FormattedText formattedText, FormattedText formattedText2, double d, double d2, List list, TextStyleDto textStyleDto, Background background, Background background2, Counters counters, f0 f0Var, OfferType offerType, q1 q1Var, String str4, String str5, String str6, List list2, Offer$MainScreenOnboarding offer$MainScreenOnboarding, Offer$Animation offer$Animation, List list3, di2 di2Var, cei0 cei0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = formattedText;
        this.e = formattedText2;
        this.f = d;
        this.g = d2;
        this.h = list;
        this.i = textStyleDto;
        this.j = background;
        this.k = background2;
        this.l = counters;
        this.m = f0Var;
        this.n = offerType;
        this.o = q1Var;
        this.p = str4;
        this.q = str5;
        this.r = str6;
        this.s = list2;
        this.t = offer$MainScreenOnboarding;
        this.u = offer$Animation;
        this.v = list3;
        this.w = di2Var;
        this.x = cei0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ur60)) {
            return false;
        }
        ur60 ur60Var = (ur60) obj;
        return jl40.l(this.a, ur60Var.a) && jl40.l(this.b, ur60Var.b) && jl40.l(this.c, ur60Var.c) && jl40.l(this.d, ur60Var.d) && jl40.l(this.e, ur60Var.e) && Double.compare(this.f, ur60Var.f) == 0 && Double.compare(this.g, ur60Var.g) == 0 && jl40.l(this.h, ur60Var.h) && jl40.l(this.i, ur60Var.i) && jl40.l(this.j, ur60Var.j) && jl40.l(this.k, ur60Var.k) && jl40.l(this.l, ur60Var.l) && jl40.l(this.m, ur60Var.m) && this.n == ur60Var.n && jl40.l(this.o, ur60Var.o) && jl40.l(this.p, ur60Var.p) && jl40.l(this.q, ur60Var.q) && jl40.l(this.r, ur60Var.r) && jl40.l(this.s, ur60Var.s) && jl40.l(this.t, ur60Var.t) && jl40.l(this.u, ur60Var.u) && jl40.l(this.v, ur60Var.v) && jl40.l(this.w, ur60Var.w) && jl40.l(this.x, ur60Var.x);
    }

    public final int hashCode() {
        int c = unr0.c((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + unr0.c(unr0.a(unr0.a(unr0.c(unr0.c(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d.a), 31, this.e.a), 31, this.f), 31, this.g), 31, this.h)) * 31)) * 31)) * 31, 31, this.l.a);
        f0 f0Var = this.m;
        int c2 = unr0.c(unr0.b(unr0.b(unr0.b((this.o.hashCode() + ((this.n.hashCode() + ((c + (f0Var == null ? 0 : f0Var.hashCode())) * 31)) * 31)) * 31, 31, this.p), 31, this.q), 31, this.r), 31, this.s);
        Offer$MainScreenOnboarding offer$MainScreenOnboarding = this.t;
        int c3 = unr0.c((this.u.hashCode() + ((c2 + (offer$MainScreenOnboarding == null ? 0 : offer$MainScreenOnboarding.hashCode())) * 31)) * 31, 31, this.v);
        di2 di2Var = this.w;
        int hashCode = (c3 + (di2Var == null ? 0 : di2Var.hashCode())) * 31;
        cei0 cei0Var = this.x;
        return hashCode + (cei0Var != null ? cei0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("Offer(shortcutId=", this.a, ", title=", this.b, ", subtitle=");
        v.append(this.c);
        v.append(", attributedTitle=");
        v.append(this.d);
        v.append(", attributedSubtitle=");
        v.append(this.e);
        v.append(", width=");
        v.append(this.f);
        nzs.o(v, ", height=", this.g, ", overlays=");
        v.append(this.h);
        v.append(", textStyle=");
        v.append(this.i);
        v.append(", background=");
        v.append(this.j);
        v.append(", thumbBackground=");
        v.append(this.k);
        v.append(", counters=");
        v.append(this.l);
        v.append(", onboarding=");
        v.append(this.m);
        v.append(", type=");
        v.append(this.n);
        v.append(", action=");
        v.append(this.o);
        v.append(", service=");
        g8e.D(v, this.p, ", imageTag=", this.q, ", imageBackground=");
        tse0.x(this.r, ", nestedButtons=", ", screenOnboarding=", v, this.s);
        v.append(this.t);
        v.append(", animation=");
        v.append(this.u);
        v.append(", nestedOfferIds=");
        v.append(this.v);
        v.append(", iconAnimation=");
        v.append(this.w);
        v.append(", realtimeAnalytics=");
        v.append(this.x);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
