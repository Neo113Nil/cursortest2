package defpackage;

import com.yandex.go.shortcuts.dto.response.PromoMode;
import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.eatskit.dto.ServiceHeaderMode;
import ru.yandex.taxi.eatskit.dto.ServicePromo;
import ru.yandex.taxi.shortcuts.dto.response.AuthType;
import ru.yandex.taxi.shortcuts.dto.response.RequiredAccount;
import ru.yandex.taxi.themes.dto.WebViewThemeChangeMode;

/* loaded from: classes5.dex */
public final class x6w0 {
    public final boolean A;
    public final boolean B;
    public final WebViewThemeChangeMode C;
    public final Set D;
    public final h1p a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final PromoMode h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final ServicePromo n;
    public final fen o;
    public final ServiceHeaderMode p;
    public final String q;
    public final AuthType r;
    public final boolean s;
    public final boolean t;
    public final RequiredAccount u;
    public final String v;
    public final boolean w;
    public final String x;
    public final String y;
    public final boolean z;

    public x6w0(h1p h1pVar, boolean z, String str, String str2, String str3, String str4, String str5, PromoMode promoMode, String str6, String str7, String str8, String str9, String str10, ServicePromo servicePromo, fen fenVar, ServiceHeaderMode serviceHeaderMode, String str11, AuthType authType, boolean z2, boolean z3, RequiredAccount requiredAccount, String str12, boolean z4, String str13, String str14, boolean z5, boolean z6, boolean z7, WebViewThemeChangeMode webViewThemeChangeMode, Set set) {
        this.a = h1pVar;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = promoMode;
        this.i = str6;
        this.j = str7;
        this.k = str8;
        this.l = str9;
        this.m = str10;
        this.n = servicePromo;
        this.o = fenVar;
        this.p = serviceHeaderMode;
        this.q = str11;
        this.r = authType;
        this.s = z2;
        this.t = z3;
        this.u = requiredAccount;
        this.v = str12;
        this.w = z4;
        this.x = str13;
        this.y = str14;
        this.z = z5;
        this.A = z6;
        this.B = z7;
        this.C = webViewThemeChangeMode;
        this.D = set;
    }

    public final cvq0 a() {
        qgn0 qgn0Var = new qgn0(this.c, this.d);
        String value = this.h.getValue();
        if (value.length() <= 0) {
            value = null;
        }
        return new cvq0(this.f, this.g, this.e, qgn0Var, this.n, value, this.p, this.v, this.w, this.x, this.y, this.r != AuthType.COOKIES, this.A, this.B, this.D, HProv.ALG_CLASS_DATA_ENCRYPT);
    }

    public final h1p b() {
        return this.a;
    }

    public final String c() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6w0)) {
            return false;
        }
        x6w0 x6w0Var = (x6w0) obj;
        return this.a.equals(x6w0Var.a) && this.b == x6w0Var.b && this.c.equals(x6w0Var.c) && this.d.equals(x6w0Var.d) && this.e.equals(x6w0Var.e) && jl40.l(this.f, x6w0Var.f) && jl40.l(this.g, x6w0Var.g) && this.h == x6w0Var.h && jl40.l(this.i, x6w0Var.i) && this.j.equals(x6w0Var.j) && this.k.equals(x6w0Var.k) && this.l.equals(x6w0Var.l) && this.m.equals(x6w0Var.m) && this.n == x6w0Var.n && jl40.l(this.o, x6w0Var.o) && this.p == x6w0Var.p && jl40.l(this.q, x6w0Var.q) && this.r == x6w0Var.r && this.s == x6w0Var.s && this.t == x6w0Var.t && this.u == x6w0Var.u && jl40.l(this.v, x6w0Var.v) && this.w == x6w0Var.w && jl40.l(this.x, x6w0Var.x) && jl40.l(this.y, x6w0Var.y) && this.z == x6w0Var.z && this.A == x6w0Var.A && this.B == x6w0Var.B && this.C == x6w0Var.C && this.D.equals(x6w0Var.D);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(unr0.b(unr0.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        int b2 = unr0.b(unr0.b(unr0.b(unr0.b(unr0.b((this.h.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m);
        ServicePromo servicePromo = this.n;
        int hashCode = (this.p.hashCode() + ((this.o.hashCode() + ((b2 + (servicePromo == null ? 0 : servicePromo.hashCode())) * 31)) * 31)) * 31;
        String str2 = this.q;
        return this.D.hashCode() + ((this.C.hashCode() + unr0.e(unr0.e(unr0.e(unr0.b(unr0.b(unr0.e(unr0.b((this.u.hashCode() + unr0.e(unr0.e((this.r.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31, 31, this.s), 31, this.t)) * 31, 31, this.v), 31, this.w), 31, this.x), 31, this.y), 31, this.z), 31, this.A), 31, this.B)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppServiceModel(service=");
        sb.append(this.a);
        sb.append(", isEnabled=");
        sb.append(this.b);
        sb.append(", title=");
        g8e.D(sb, this.c, ", subtitle=", this.d, ", serviceName=");
        g8e.D(sb, this.e, ", url=", this.f, ", userAgentAddition=");
        sb.append(this.g);
        sb.append(", promoMode=");
        sb.append(this.h);
        sb.append(", mode=");
        g8e.D(sb, this.i, ", addressControlTitle=", this.j, ", addressControlSubtitle=");
        g8e.D(sb, this.k, ", addressSearchOnMapHeader=", this.l, ", addressInputPlaceholder=");
        sb.append(this.m);
        sb.append(", servicePromo=");
        sb.append(this.n);
        sb.append(", splashType=");
        sb.append(this.o);
        sb.append(", serviceHeaderMode=");
        sb.append(this.p);
        sb.append(", serviceIconUrl=");
        sb.append(this.q);
        sb.append(", authType=");
        sb.append(this.r);
        sb.append(", injectCookies=");
        nnm.v(", allowCachingCookie=", ", requiredAccount=", sb, this.s, this.t);
        sb.append(this.u);
        sb.append(", allowedUrlPattern=");
        sb.append(this.v);
        sb.append(", applyAllowedUrlPatternForIFrame=");
        unr0.A(", captchaUrlPattern=", this.x, ", extensionsWhitelist=", sb, this.w);
        tse0.y(this.y, ", shouldShowCloseButton=", ", isFullScreenModeEnabled=", sb, this.z);
        nnm.v(", isForceLoginEnabled=", ", themeChangeMode=", sb, this.A, this.B);
        sb.append(this.C);
        sb.append(", trustedUrls=");
        sb.append(this.D);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
