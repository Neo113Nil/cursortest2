package defpackage;

import java.util.Set;

/* loaded from: classes2.dex */
public final class xzt {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Set f;
    public final Set g;
    public final String h;

    public xzt(String str, String str2, String str3, String str4, String str5, Set set, Set set2, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = set;
        this.g = set2;
        this.h = str6;
    }

    public final Set a() {
        return this.g;
    }

    public final Set b() {
        return this.f;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xzt)) {
            return false;
        }
        xzt xztVar = (xzt) obj;
        return jl40.l(this.a, xztVar.a) && jl40.l(this.b, xztVar.b) && this.c.equals(xztVar.c) && jl40.l(this.d, xztVar.d) && jl40.l(this.e, xztVar.e) && jl40.l(this.f, xztVar.f) && jl40.l(this.g, xztVar.g) && this.h.equals(xztVar.h);
    }

    public final String f() {
        return this.e;
    }

    public final String g() {
        return this.h;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int b = unr0.b(unr0.b((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c), 31, this.d);
        String str3 = this.e;
        int hashCode2 = (b + (str3 == null ? 0 : str3.hashCode())) * 31;
        Set set = this.f;
        int hashCode3 = (hashCode2 + (set == null ? 0 : set.hashCode())) * 31;
        Set set2 = this.g;
        return this.h.hashCode() + ((hashCode3 + (set2 != null ? set2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OffersCacheKey(puid=");
        sb.append(this.a);
        sb.append(", sessionId=");
        sb.append(this.b);
        sb.append(", reason=");
        sb.append(this.c);
        sb.append(", target=");
        sb.append(this.d);
        sb.append(", tariffId=");
        sb.append(this.e);
        sb.append(", optionsIds=");
        sb.append(this.f);
        sb.append(", features=");
        sb.append(this.g);
        sb.append(", transitionLanguage=");
        return b64.p(sb, this.h, ')');
    }
}
