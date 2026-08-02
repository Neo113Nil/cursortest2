package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class oh5 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final nh5 i;
    public final String j;
    public final String k;
    public final String l;
    public final nh5 m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final String u;
    public final String v;
    public final String w;

    public oh5(boolean z, boolean z2, String str, String str2, boolean z3, String str3, String str4, String str5, nh5 nh5Var, String str6, String str7, String str8, nh5 nh5Var2, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18) {
        eta.s(str, str2, str5, str6, str7);
        dfi.s(str11, str16, str17);
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = z3;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = nh5Var;
        this.j = str6;
        this.k = str7;
        this.l = str8;
        this.m = nh5Var2;
        this.n = str9;
        this.o = str10;
        this.p = str11;
        this.q = str12;
        this.r = str13;
        this.s = str14;
        this.t = str15;
        this.u = str16;
        this.v = str17;
        this.w = str18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oh5)) {
            return false;
        }
        oh5 oh5Var = (oh5) obj;
        return this.a == oh5Var.a && this.b == oh5Var.b && Intrinsics.d(this.c, oh5Var.c) && Intrinsics.d(this.d, oh5Var.d) && this.e == oh5Var.e && Intrinsics.d(this.f, oh5Var.f) && Intrinsics.d(this.g, oh5Var.g) && Intrinsics.d(this.h, oh5Var.h) && this.i.equals(oh5Var.i) && Intrinsics.d(this.j, oh5Var.j) && Intrinsics.d(this.k, oh5Var.k) && Intrinsics.d(this.l, oh5Var.l) && Intrinsics.d(this.m, oh5Var.m) && Intrinsics.d(this.n, oh5Var.n) && Intrinsics.d(this.o, oh5Var.o) && Intrinsics.d(this.p, oh5Var.p) && Intrinsics.d(this.q, oh5Var.q) && Intrinsics.d(this.r, oh5Var.r) && Intrinsics.d(this.s, oh5Var.s) && Intrinsics.d(this.t, oh5Var.t) && Intrinsics.d(this.u, oh5Var.u) && Intrinsics.d(this.v, oh5Var.v) && Intrinsics.d(this.w, oh5Var.w);
    }

    public final int hashCode() {
        int e = k5r.e(k5r.c(k5r.c(k5r.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int c = k5r.c(k5r.c((this.i.hashCode() + k5r.c((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.h)) * 31, 31, this.j), 31, this.k);
        String str3 = this.l;
        int hashCode2 = (c + (str3 == null ? 0 : str3.hashCode())) * 31;
        nh5 nh5Var = this.m;
        int hashCode3 = (hashCode2 + (nh5Var == null ? 0 : nh5Var.hashCode())) * 31;
        String str4 = this.n;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.o;
        int c2 = k5r.c((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.p);
        String str6 = this.q;
        int hashCode5 = (c2 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.r;
        int hashCode6 = (hashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.s;
        int hashCode7 = (hashCode6 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.t;
        int c3 = k5r.c(k5r.c((hashCode7 + (str9 == null ? 0 : str9.hashCode())) * 31, 31, this.u), 31, this.v);
        String str10 = this.w;
        return c3 + (str10 != null ? str10.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder j = eta.j("Data(canBeOpened=", this.a, ", isCenterAlign=", this.b, ", headerText=");
        su4.v(j, this.c, ", headerColor=", this.d, ", bigHeader=");
        j.append(this.e);
        j.append(", subtitleText=");
        j.append(this.f);
        j.append(", subtitleColor=");
        su4.v(j, this.g, ", firstButtonText=", this.h, ", firstButtonAction=");
        j.append(this.i);
        j.append(", firstButtonColor=");
        j.append(this.j);
        j.append(", firstButtonTextColor=");
        su4.v(j, this.k, ", secondButtonText=", this.l, ", secondButtonAction=");
        j.append(this.m);
        j.append(", secondButtonColor=");
        j.append(this.n);
        j.append(", secondButtonTextColor=");
        su4.v(j, this.o, ", closeButtonColor=", this.p, ", eridButtonColor=");
        su4.v(j, this.q, ", advDisclaimer=", this.r, ", disclaimerText=");
        su4.v(j, this.s, ", disclaimerColor=", this.t, ", imageUrl=");
        su4.v(j, this.u, ", backgroundColor=", this.v, ", backgroundImageUrl=");
        return su4.o(j, this.w, ")");
    }
}
