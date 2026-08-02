package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ct5 {
    public final String a;
    public final long b;
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
    public final ru5 n;

    public ct5(String str, long j, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Integer num, String str11, ru5 ru5Var) {
        eta.s(str, str2, str3, str4, str5);
        str6.getClass();
        str7.getClass();
        ru5Var.getClass();
        this.a = str;
        this.b = j;
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
        this.n = ru5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ct5)) {
            return false;
        }
        ct5 ct5Var = (ct5) obj;
        return Intrinsics.d(this.a, ct5Var.a) && d85.c(this.b, ct5Var.b) && Intrinsics.d(this.c, ct5Var.c) && Intrinsics.d(this.d, ct5Var.d) && Intrinsics.d(this.e, ct5Var.e) && Intrinsics.d(this.f, ct5Var.f) && Intrinsics.d(this.g, ct5Var.g) && Intrinsics.d(this.h, ct5Var.h) && Intrinsics.d(this.i, ct5Var.i) && Intrinsics.d(this.j, ct5Var.j) && Intrinsics.d(this.k, ct5Var.k) && Intrinsics.d(this.l, ct5Var.l) && this.m.equals(ct5Var.m) && Intrinsics.d(this.n, ct5Var.n);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = d85.o;
        met metVar = net.b;
        int c = k5r.c(k5r.c(k5r.c(k5r.c(k5r.c(k5r.c(tlm.c(this.b, hashCode, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        String str = this.i;
        int hashCode2 = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.j;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.k;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.l;
        return this.n.a.hashCode() + k5r.e(k5r.c((hashCode4 + (num != null ? num.hashCode() : 0)) * 31, 31, this.m), 31, true);
    }

    public final String toString() {
        StringBuilder m = f1d.m("Loaded(imageUrl=", this.a, ", imageAverageColor=", d85.i(this.b), ", title=");
        su4.v(m, this.c, ", time=", this.d, ", month=");
        su4.v(m, this.e, ", dayOfMonth=", this.f, ", dayOfWeek=");
        su4.v(m, this.g, ", city=", this.h, ", place=");
        su4.v(m, this.i, ", contentRating=", this.j, ", cashbackTitle=");
        m.append(this.k);
        m.append(", cashbackPercentValue=");
        m.append(this.l);
        m.append(", contentDescription=");
        m.append(this.m);
        m.append(", isShimmerOnLoadingImage=true, eventInfo=");
        m.append(this.n);
        m.append(")");
        return m.toString();
    }
}
