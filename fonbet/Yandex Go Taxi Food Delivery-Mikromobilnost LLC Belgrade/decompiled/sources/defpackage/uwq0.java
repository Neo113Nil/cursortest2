package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.eatskit.dto.ServicePromo;
import ru.yandex.taxi.shortcuts.dto.response.AuthType;
import ru.yandex.taxi.shortcuts.dto.response.RequiredAccount;
import ru.yandex.taxi.shortcuts.dto.response.superapp.ServiceManifest;
import ru.yandex.taxi.themes.dto.WebViewThemeChangeMode;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Luwq0;", "", "Companion", "twq0", "swq0", "multiorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class uwq0 {
    public static final twq0 Companion = new twq0();
    public static final i3y[] K;
    public static final uwq0 L;
    public final boolean A;
    public final String B;
    public final RequiredAccount C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final WebViewThemeChangeMode H;
    public final la1 I;
    public final ServiceManifest J;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final drt0 f;
    public final String g;
    public final String h;
    public final boolean i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final ServicePromo q;
    public final String r;
    public final String s;
    public final String t;
    public final String u;
    public final AuthType v;
    public final boolean w;
    public final boolean x;
    public final String y;
    public final String z;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        K = new i3y[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, a.b(lazyThreadSafetyMode, new dwq0(4)), null, null, null, null, a.b(lazyThreadSafetyMode, new dwq0(5)), null, null, null, null, null, null, a.b(lazyThreadSafetyMode, new dwq0(6)), null, null, null, null, a.b(lazyThreadSafetyMode, new dwq0(7)), null, null};
        L = new uwq0(0);
    }

    public /* synthetic */ uwq0(int i, int i2, String str, String str2, String str3, String str4, String str5, drt0 drt0Var, String str6, String str7, boolean z, String str8, String str9, String str10, String str11, String str12, String str13, String str14, ServicePromo servicePromo, String str15, String str16, String str17, String str18, AuthType authType, boolean z2, boolean z3, String str19, String str20, boolean z4, String str21, RequiredAccount requiredAccount, boolean z5, boolean z6, boolean z7, boolean z8, WebViewThemeChangeMode webViewThemeChangeMode, la1 la1Var, ServiceManifest serviceManifest) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = "https://localhost";
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = crt0.INSTANCE;
        } else {
            this.f = drt0Var;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str6;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str7;
        }
        if ((i & 256) == 0) {
            this.i = false;
        } else {
            this.i = z;
        }
        if ((i & 512) == 0) {
            this.j = "";
        } else {
            this.j = str8;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str9;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str10;
        }
        if ((i & 4096) == 0) {
            this.m = "";
        } else {
            this.m = str11;
        }
        if ((i & 8192) == 0) {
            this.n = "";
        } else {
            this.n = str12;
        }
        if ((i & 16384) == 0) {
            this.o = "";
        } else {
            this.o = str13;
        }
        if ((32768 & i) == 0) {
            this.p = "";
        } else {
            this.p = str14;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = servicePromo;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = str15;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = str16;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = str17;
        }
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = str18;
        }
        this.v = (2097152 & i) == 0 ? AuthType.OAUTH : authType;
        if ((4194304 & i) == 0) {
            this.w = false;
        } else {
            this.w = z2;
        }
        if ((8388608 & i) == 0) {
            this.x = false;
        } else {
            this.x = z3;
        }
        if ((16777216 & i) == 0) {
            this.y = "";
        } else {
            this.y = str19;
        }
        if ((33554432 & i) == 0) {
            this.z = "";
        } else {
            this.z = str20;
        }
        if ((67108864 & i) == 0) {
            this.A = false;
        } else {
            this.A = z4;
        }
        if ((134217728 & i) == 0) {
            this.B = "";
        } else {
            this.B = str21;
        }
        this.C = (268435456 & i) == 0 ? RequiredAccount.NOT_REQUIRED : requiredAccount;
        if ((536870912 & i) == 0) {
            this.D = false;
        } else {
            this.D = z5;
        }
        if ((1073741824 & i) == 0) {
            this.E = false;
        } else {
            this.E = z6;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.F = false;
        } else {
            this.F = z7;
        }
        if ((i2 & 1) == 0) {
            this.G = false;
        } else {
            this.G = z8;
        }
        this.H = (i2 & 2) == 0 ? WebViewThemeChangeMode.PREFERS_COLOR_SCHEME : webViewThemeChangeMode;
        this.I = (i2 & 4) == 0 ? new la1(EmptyList.a) : la1Var;
        if ((i2 & 8) == 0) {
            this.J = null;
        } else {
            this.J = serviceManifest;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uwq0)) {
            return false;
        }
        uwq0 uwq0Var = (uwq0) obj;
        return jl40.l(this.a, uwq0Var.a) && jl40.l(this.b, uwq0Var.b) && jl40.l(this.c, uwq0Var.c) && jl40.l(this.d, uwq0Var.d) && jl40.l(this.e, uwq0Var.e) && jl40.l(this.f, uwq0Var.f) && jl40.l(this.g, uwq0Var.g) && jl40.l(this.h, uwq0Var.h) && this.i == uwq0Var.i && jl40.l(this.j, uwq0Var.j) && jl40.l(this.k, uwq0Var.k) && jl40.l(this.l, uwq0Var.l) && jl40.l(this.m, uwq0Var.m) && jl40.l(this.n, uwq0Var.n) && jl40.l(this.o, uwq0Var.o) && jl40.l(this.p, uwq0Var.p) && this.q == uwq0Var.q && jl40.l(this.r, uwq0Var.r) && jl40.l(this.s, uwq0Var.s) && jl40.l(this.t, uwq0Var.t) && jl40.l(this.u, uwq0Var.u) && this.v == uwq0Var.v && this.w == uwq0Var.w && this.x == uwq0Var.x && jl40.l(this.y, uwq0Var.y) && jl40.l(this.z, uwq0Var.z) && this.A == uwq0Var.A && jl40.l(this.B, uwq0Var.B) && this.C == uwq0Var.C && this.D == uwq0Var.D && this.E == uwq0Var.E && this.F == uwq0Var.F && this.G == uwq0Var.G && this.H == uwq0Var.H && jl40.l(this.I, uwq0Var.I) && jl40.l(this.J, uwq0Var.J);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (this.f.hashCode() + unr0.b((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e)) * 31;
        String str3 = this.g;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int b2 = unr0.b(unr0.e((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.i), 31, this.j);
        String str5 = this.k;
        int hashCode4 = (b2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.l;
        int b3 = unr0.b(unr0.b(unr0.b(unr0.b((hashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.p);
        ServicePromo servicePromo = this.q;
        int hashCode5 = (b3 + (servicePromo == null ? 0 : servicePromo.hashCode())) * 31;
        String str7 = this.r;
        int hashCode6 = (hashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.s;
        int hashCode7 = (hashCode6 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.t;
        int hashCode8 = (hashCode7 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.u;
        int c = unr0.c((this.H.hashCode() + unr0.e(unr0.e(unr0.e(unr0.e((this.C.hashCode() + unr0.b(unr0.e(unr0.b(unr0.b(unr0.e(unr0.e((this.v.hashCode() + ((hashCode8 + (str10 == null ? 0 : str10.hashCode())) * 31)) * 31, 31, this.w), 31, this.x), 31, this.y), 31, this.z), 31, this.A), 31, this.B)) * 31, 31, this.D), 31, this.E), 31, this.F), 31, this.G)) * 31, 31, this.I.a);
        ServiceManifest serviceManifest = this.J;
        return c + (serviceManifest != null ? serviceManifest.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("ServiceParams(titleId=", this.a, ", subtitleId=", this.b, ", serviceNameId=");
        g8e.D(v, this.c, ", shortcutServiceNameId=", this.d, ", url=");
        v.append(this.e);
        v.append(", splashType=");
        v.append(this.f);
        v.append(", supportChatUrl=");
        g8e.D(v, this.g, ", service=", this.h, ", isEnabled=");
        unr0.A(", mode=", this.j, ", userAgentAddition=", v, this.i);
        g8e.D(v, this.k, ", courierImageTag=", this.l, ", addressControlTitleId=");
        g8e.D(v, this.m, ", addressControlSubtitleId=", this.n, ", addressInputPlaceholderId=");
        g8e.D(v, this.o, ", addressSearchOnMapHeaderId=", this.p, ", promo=");
        v.append(this.q);
        v.append(", serviceIconTag=");
        v.append(this.r);
        v.append(", multiorderIconTag=");
        g8e.D(v, this.s, ", pinFromIconTag=", this.t, ", pinToIconTag=");
        v.append(this.u);
        v.append(", authType=");
        v.append(this.v);
        v.append(", injectedCookies=");
        nnm.v(", allowCachingCookie=", ", allowedUrlPattern=", v, this.w, this.x);
        g8e.D(v, this.y, ", captchaUrlPattern=", this.z, ", applyAllowedUrlPatternForIFrame=");
        unr0.A(", extensionsWhitelist=", this.B, ", requiredAccount=", v, this.A);
        v.append(this.C);
        v.append(", openRelativePathDirectly=");
        v.append(this.D);
        v.append(", openRelativePathOnlyWithSignals=");
        nnm.v(", shouldShowCloseButton=", ", isForceLoginEnabled=", v, this.E, this.F);
        v.append(this.G);
        v.append(", themeChangingMode=");
        v.append(this.H);
        v.append(", adjustConfiguration=");
        v.append(this.I);
        v.append(", manifest=");
        v.append(this.J);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public uwq0() {
        this(0);
    }

    public uwq0(int i) {
        crt0 crt0Var = crt0.INSTANCE;
        AuthType authType = AuthType.OAUTH;
        RequiredAccount requiredAccount = RequiredAccount.NOT_REQUIRED;
        WebViewThemeChangeMode webViewThemeChangeMode = WebViewThemeChangeMode.PREFERS_COLOR_SCHEME;
        la1 la1Var = new la1(EmptyList.a);
        this.a = "";
        this.b = "";
        this.c = null;
        this.d = null;
        this.e = "https://localhost";
        this.f = crt0Var;
        this.g = null;
        this.h = null;
        this.i = false;
        this.j = "";
        this.k = null;
        this.l = null;
        this.m = "";
        this.n = "";
        this.o = "";
        this.p = "";
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = authType;
        this.w = false;
        this.x = false;
        this.y = "";
        this.z = "";
        this.A = false;
        this.B = "";
        this.C = requiredAccount;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = webViewThemeChangeMode;
        this.I = la1Var;
        this.J = null;
    }
}
