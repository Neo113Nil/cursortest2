package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class z2p {
    public final String a;
    public final String b;
    public final c501 c;
    public final String d;
    public final String e;
    public final c3p f;

    public z2p(String str, String str2, c501 c501Var, String str3, String str4, c3p c3pVar) {
        this.a = str;
        this.b = str2;
        this.c = c501Var;
        this.d = str3;
        this.e = str4;
        this.f = c3pVar;
    }

    public static String d(String str) {
        if (str == null || !(!evu0.J(str))) {
            str = null;
        }
        return str == null ? "empty" : str;
    }

    public final MapBuilder a() {
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("id", c());
        String str = this.d;
        if (str != null) {
            mapBuilder.put(Constants.KEY_SERVICE, str);
        }
        String str2 = this.a;
        if (str2 != null) {
            mapBuilder.put("text", str2);
        }
        return mapBuilder.j();
    }

    public final String b() {
        return this.e;
    }

    public final String c() {
        return oyr.q(d(this.d), ":", d(this.b), ":", d(this.a));
    }

    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2p)) {
            return false;
        }
        z2p z2pVar = (z2p) obj;
        return jl40.l(this.a, z2pVar.a) && jl40.l(this.b, z2pVar.b) && jl40.l(this.c, z2pVar.c) && jl40.l(this.d, z2pVar.d) && jl40.l(this.e, z2pVar.e) && jl40.l(this.f, z2pVar.f);
    }

    public final String f() {
        return this.a;
    }

    public final c501 g() {
        return this.c;
    }

    public final String h() {
        return this.b;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        c501 c501Var = this.c;
        int hashCode3 = (hashCode2 + (c501Var == null ? 0 : c501Var.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        c3p c3pVar = this.f;
        return hashCode5 + (c3pVar != null ? c3pVar.hashCode() : 0);
    }

    public final c3p i() {
        return this.f;
    }

    public final String toString() {
        StringBuilder v = b64.v("Button(title=", this.a, ", titleLeadImageTag=", this.b, ", titleLeadImageColors=");
        v.append(this.c);
        v.append(", service=");
        v.append(this.d);
        v.append(", deeplink=");
        v.append(this.e);
        v.append(", webCustomTabsAction=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
