package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class y010 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public y010(String str, String str2, String str3, String str4, String str5) {
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
        return this.e;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y010)) {
            return false;
        }
        y010 y010Var = (y010) obj;
        return jl40.l(this.a, y010Var.a) && jl40.l(this.b, y010Var.b) && jl40.l(this.c, y010Var.c) && jl40.l(this.d, y010Var.d) && jl40.l(this.e, y010Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("MassTransitScheduleDeeplink(startingStopId=", this.a, ", destinationStopId=", this.b, ", utmSource=");
        g8e.D(v, this.c, ", utmMedium=", this.d, ", origin=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }

    public y010() {
        this(null, null, null, null, null);
    }
}
