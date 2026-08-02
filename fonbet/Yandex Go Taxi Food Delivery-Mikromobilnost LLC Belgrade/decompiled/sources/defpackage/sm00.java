package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class sm00 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final zzs i;
    public final boolean j;
    public final String k;
    public final String l;
    public final Boolean m;

    public /* synthetic */ sm00(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, zzs zzsVar, String str9, String str10, Boolean bool, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : zzsVar, false, (i & 1024) != 0 ? null : str9, (i & 2048) != 0 ? null : str10, (i & 4096) != 0 ? null : bool);
    }

    public static sm00 a(sm00 sm00Var, boolean z) {
        return new sm00(sm00Var.a, sm00Var.b, sm00Var.c, sm00Var.d, sm00Var.e, sm00Var.f, sm00Var.g, sm00Var.h, sm00Var.i, z, sm00Var.k, sm00Var.l, sm00Var.m);
    }

    public final String b() {
        return this.g;
    }

    public final String c() {
        return this.e;
    }

    public final boolean d() {
        return this.j;
    }

    public final zzs e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sm00)) {
            return false;
        }
        sm00 sm00Var = (sm00) obj;
        return jl40.l(this.a, sm00Var.a) && jl40.l(this.b, sm00Var.b) && jl40.l(this.c, sm00Var.c) && jl40.l(this.d, sm00Var.d) && jl40.l(this.e, sm00Var.e) && jl40.l(this.f, sm00Var.f) && jl40.l(this.g, sm00Var.g) && jl40.l(this.h, sm00Var.h) && jl40.l(this.i, sm00Var.i) && this.j == sm00Var.j && jl40.l(this.k, sm00Var.k) && jl40.l(this.l, sm00Var.l) && jl40.l(this.m, sm00Var.m);
    }

    public final String f() {
        return this.k;
    }

    public final String g() {
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
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.g;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.h;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        zzs zzsVar = this.i;
        int e = unr0.e((hashCode8 + (zzsVar == null ? 0 : zzsVar.hashCode())) * 31, 31, this.j);
        String str9 = this.k;
        int hashCode9 = (e + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.l;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool = this.m;
        return hashCode10 + (bool != null ? bool.hashCode() : 0);
    }

    public final String i() {
        return this.h;
    }

    public final String j() {
        return this.a;
    }

    public final String k() {
        return this.l;
    }

    public final String l() {
        return this.f;
    }

    public final String m() {
        return this.d;
    }

    public final Boolean n() {
        return this.m;
    }

    public final String toString() {
        StringBuilder v = b64.v("MapObjectAnalyticsPayload(pointType=", this.a, ", iconType=", this.b, ", icon=");
        g8e.D(v, this.c, ", title=", this.d, ", formattedTitle=");
        g8e.D(v, this.e, ", subtitle=", this.f, ", formattedSubtitle=");
        g8e.D(v, this.g, ", permalink=", this.h, ", geoPoint=");
        v.append(this.i);
        v.append(", fullMode=");
        v.append(this.j);
        v.append(", hitlog=");
        g8e.D(v, this.k, ", source=", this.l, ", isPaid=");
        return nzs.d(v, this.m, Extension.C_BRAKE);
    }

    public sm00() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (zzs) null, (String) null, (String) null, (Boolean) null, 8191);
    }

    public sm00(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, zzs zzsVar, boolean z, String str9, String str10, Boolean bool) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = zzsVar;
        this.j = z;
        this.k = str9;
        this.l = str10;
        this.m = bool;
    }
}
