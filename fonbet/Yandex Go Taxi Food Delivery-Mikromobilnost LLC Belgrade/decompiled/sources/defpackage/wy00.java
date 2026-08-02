package defpackage;

import android.net.Uri;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class wy00 {
    public final Uri a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public wy00(Uri uri, String str, String str2, String str3, String str4, String str5) {
        this.a = uri;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final String a() {
        return this.f;
    }

    public final Uri b() {
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
        if (!(obj instanceof wy00)) {
            return false;
        }
        wy00 wy00Var = (wy00) obj;
        return jl40.l(this.a, wy00Var.a) && jl40.l(this.b, wy00Var.b) && jl40.l(this.c, wy00Var.c) && jl40.l(this.d, wy00Var.d) && jl40.l(this.e, wy00Var.e) && jl40.l(this.f, wy00Var.f);
    }

    public final String f() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MassTransitCheckoutDeeplink(deeplinkUri=");
        sb.append(this.a);
        sb.append(", vehicleId=");
        sb.append(this.b);
        sb.append(", qrUrl=");
        g8e.D(sb, this.c, ", utmSource=", this.d, ", utmMedium=");
        return g8e.r(sb, this.e, ", cardLinkStatus=", this.f, Extension.C_BRAKE);
    }
}
