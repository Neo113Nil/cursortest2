package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class pw5 {
    public final String a;
    public final ru5 b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final Integer m;
    public final String n;
    public final String o;

    public pw5(String str, ru5 ru5Var, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, String str12, String str13) {
        str.getClass();
        ru5Var.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        dfi.s(str8, str9, str12);
        this.a = str;
        this.b = ru5Var;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = str10;
        this.l = str11;
        this.m = num;
        this.n = str12;
        this.o = str13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pw5)) {
            return false;
        }
        pw5 pw5Var = (pw5) obj;
        return Intrinsics.d(this.a, pw5Var.a) && Intrinsics.d(this.b, pw5Var.b) && Intrinsics.d(this.c, pw5Var.c) && this.d.equals(pw5Var.d) && Intrinsics.d(this.e, pw5Var.e) && Intrinsics.d(this.f, pw5Var.f) && Intrinsics.d(this.g, pw5Var.g) && Intrinsics.d(this.h, pw5Var.h) && Intrinsics.d(this.i, pw5Var.i) && Intrinsics.d(this.j, pw5Var.j) && Intrinsics.d(this.k, pw5Var.k) && Intrinsics.d(this.l, pw5Var.l) && Intrinsics.d(this.m, pw5Var.m) && Intrinsics.d(this.n, pw5Var.n) && this.o.equals(pw5Var.o);
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b.a);
        String str = this.c;
        int c2 = k5r.c(k5r.c(k5r.c(k5r.c((c + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        String str2 = this.h;
        int c3 = k5r.c(k5r.c((c2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.i), 31, this.j);
        String str3 = this.k;
        int hashCode = (c3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.l;
        int hashCode2 = (hashCode + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.m;
        return this.o.hashCode() + k5r.c((hashCode2 + (num != null ? num.hashCode() : 0)) * 31, 31, this.n);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConcertItemState(title=");
        sb.append(this.a);
        sb.append(", eventInfo=");
        sb.append(this.b);
        sb.append(", contentRating=");
        su4.v(sb, this.c, ", month=", this.d, ", dayOfMonth=");
        su4.v(sb, this.e, ", dayOfWeek=", this.f, ", city=");
        su4.v(sb, this.g, ", place=", this.h, ", time=");
        su4.v(sb, this.i, ", price=", this.j, ", fomoText=");
        su4.v(sb, this.k, ", cashbackText=", this.l, ", cashbackPercentValue=");
        sb.append(this.m);
        sb.append(", contentDescription=");
        sb.append(this.n);
        sb.append(", cashbackDescription=");
        return su4.o(sb, this.o, ")");
    }
}
