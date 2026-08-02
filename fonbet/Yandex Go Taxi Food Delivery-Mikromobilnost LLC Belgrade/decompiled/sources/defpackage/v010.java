package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class v010 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public v010(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.e;
    }

    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v010)) {
            return false;
        }
        v010 v010Var = (v010) obj;
        return this.a.equals(v010Var.a) && this.b.equals(v010Var.b) && this.c.equals(v010Var.c) && jl40.l(this.d, v010Var.d) && jl40.l(this.e, v010Var.e);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("MassTransitRouteDeeplink(stopId=", this.a, ", lineId=", this.b, ", threadId=");
        g8e.D(v, this.c, ", utmSource=", this.d, ", utmMedium=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }
}
