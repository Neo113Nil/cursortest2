package defpackage;

import android.net.Uri;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class t0m0 {
    public final Uri a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final List i;
    public final List j;
    public final Boolean k;

    public t0m0(Uri uri, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, Boolean bool) {
        this.a = uri;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = list;
        this.j = list2;
        this.k = bool;
    }

    public final Uri a() {
        return this.a;
    }

    public final String b() {
        return this.g;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.b;
    }

    public final List e() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0m0)) {
            return false;
        }
        t0m0 t0m0Var = (t0m0) obj;
        return jl40.l(this.a, t0m0Var.a) && this.b.equals(t0m0Var.b) && this.c.equals(t0m0Var.c) && this.d.equals(t0m0Var.d) && jl40.l(this.e, t0m0Var.e) && jl40.l(this.f, t0m0Var.f) && jl40.l(this.g, t0m0Var.g) && jl40.l(this.h, t0m0Var.h) && this.i.equals(t0m0Var.i) && this.j.equals(t0m0Var.j) && jl40.l(this.k, t0m0Var.k);
    }

    public final String f() {
        return this.h;
    }

    public final List g() {
        return this.i;
    }

    public final String h() {
        return this.f;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int c = unr0.c(unr0.c((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.i), 31, this.j);
        Boolean bool = this.k;
        return c + (bool != null ? bool.hashCode() : 0);
    }

    public final String i() {
        return this.c;
    }

    public final String j() {
        return this.e;
    }

    public final Boolean k() {
        return this.k;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SaveRideDeeplink(deeplinkUri=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", sourceName=");
        g8e.D(sb, this.c, ", destinationName=", this.d, ", typeId=");
        g8e.D(sb, this.e, ", sourceImage=", this.f, ", destinationImage=");
        g8e.D(sb, this.g, ", rideName=", this.h, ", rideNameRecommendations=");
        nnm.w(sb, this.i, ", requirements=", this.j, ", isEditable=");
        return nzs.d(sb, this.k, Extension.C_BRAKE);
    }
}
