package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i31 {
    public final String a;
    public final su5 b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final Integer l;
    public final String m;
    public final String n;

    public i31(String str, su5 su5Var, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Integer num, String str11, String str12) {
        eta.s(str, str4, str5, str6, str8);
        str11.getClass();
        this.a = str;
        this.b = su5Var;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = str10;
        this.l = num;
        this.m = str11;
        this.n = str12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i31)) {
            return false;
        }
        i31 i31Var = (i31) obj;
        return Intrinsics.d(this.a, i31Var.a) && this.b == i31Var.b && Intrinsics.d(this.c, i31Var.c) && this.d.equals(i31Var.d) && Intrinsics.d(this.e, i31Var.e) && Intrinsics.d(this.f, i31Var.f) && Intrinsics.d(this.g, i31Var.g) && Intrinsics.d(this.h, i31Var.h) && Intrinsics.d(this.i, i31Var.i) && this.j.equals(i31Var.j) && Intrinsics.d(this.k, i31Var.k) && Intrinsics.d(this.l, i31Var.l) && Intrinsics.d(this.m, i31Var.m) && this.n.equals(i31Var.n);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int c = k5r.c(k5r.c(k5r.c(k5r.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        String str2 = this.h;
        int c2 = k5r.c(k5r.c((c + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.i), 961, this.j);
        String str3 = this.k;
        int hashCode2 = (c2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.l;
        return this.n.hashCode() + k5r.c((hashCode2 + (num != null ? num.hashCode() : 0)) * 31, 31, this.m);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArtistConcertItemUiState(title=");
        sb.append(this.a);
        sb.append(", eventType=");
        sb.append(this.b);
        sb.append(", contentRating=");
        su4.v(sb, this.c, ", month=", this.d, ", dayOfMonth=");
        su4.v(sb, this.e, ", dayOfWeek=", this.f, ", city=");
        su4.v(sb, this.g, ", place=", this.h, ", time=");
        su4.v(sb, this.i, ", price=", this.j, ", fomoText=null, cashbackText=");
        sb.append(this.k);
        sb.append(", cashbackPercentValue=");
        sb.append(this.l);
        sb.append(", contentDescription=");
        return ouj.q(sb, this.m, ", cashbackDescription=", this.n, ")");
    }
}
