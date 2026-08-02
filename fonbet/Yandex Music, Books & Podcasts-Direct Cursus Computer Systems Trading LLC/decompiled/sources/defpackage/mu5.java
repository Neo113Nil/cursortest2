package defpackage;

import j$.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class mu5 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final String g;
    public final String h;
    public final Integer i;
    public final ZonedDateTime j;
    public final String k;
    public final ru5 l;

    public mu5(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, Integer num, ZonedDateTime zonedDateTime, String str8, ru5 ru5Var) {
        str.getClass();
        str3.getClass();
        str4.getClass();
        zonedDateTime.getClass();
        str8.getClass();
        ru5Var.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = num;
        this.j = zonedDateTime;
        this.k = str8;
        this.l = ru5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mu5)) {
            return false;
        }
        mu5 mu5Var = (mu5) obj;
        return Intrinsics.d(this.a, mu5Var.a) && Intrinsics.d(this.b, mu5Var.b) && Intrinsics.d(this.c, mu5Var.c) && Intrinsics.d(this.d, mu5Var.d) && this.e == mu5Var.e && Intrinsics.d(this.f, mu5Var.f) && Intrinsics.d(this.g, mu5Var.g) && Intrinsics.d(this.h, mu5Var.h) && Intrinsics.d(this.i, mu5Var.i) && Intrinsics.d(this.j, mu5Var.j) && Intrinsics.d(this.k, mu5Var.k) && Intrinsics.d(this.l, mu5Var.l);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int a = f1d.a(this.e, k5r.c(k5r.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31);
        String str2 = this.f;
        int hashCode2 = (a + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.i;
        return this.l.a.hashCode() + k5r.c((this.j.hashCode() + ((hashCode4 + (num != null ? num.hashCode() : 0)) * 31)) * 31, 31, this.k);
    }

    public final String toString() {
        StringBuilder m = f1d.m("ConcertDomainItem(id=", this.a, ", dataSessionId=", this.b, ", concertTitle=");
        su4.v(m, this.c, ", imageUrl=", this.d, ", coverColor=");
        m.append(this.e);
        m.append(", place=");
        m.append(this.f);
        m.append(", contentRating=");
        su4.v(m, this.g, ", cashbackTitle=", this.h, ", cashbackPercentValue=");
        m.append(this.i);
        m.append(", datetime=");
        m.append(this.j);
        m.append(", city=");
        m.append(this.k);
        m.append(", eventInfo=");
        m.append(this.l);
        m.append(")");
        return m.toString();
    }
}
