package defpackage;

import j$.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h06 {
    public final String a;
    public final String b;
    public final Integer c;
    public final String d;
    public final String e;
    public final ZonedDateTime f;
    public final String g;
    public final String h;
    public final String i;
    public final int j;
    public final String k;
    public final Integer l;
    public final ru5 m;

    public h06(String str, String str2, Integer num, String str3, String str4, ZonedDateTime zonedDateTime, String str5, String str6, String str7, int i, String str8, Integer num2, ru5 ru5Var) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        zonedDateTime.getClass();
        str7.getClass();
        ru5Var.getClass();
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = str3;
        this.e = str4;
        this.f = zonedDateTime;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = i;
        this.k = str8;
        this.l = num2;
        this.m = ru5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h06)) {
            return false;
        }
        h06 h06Var = (h06) obj;
        return Intrinsics.d(this.a, h06Var.a) && Intrinsics.d(this.b, h06Var.b) && Intrinsics.d(this.c, h06Var.c) && Intrinsics.d(this.d, h06Var.d) && Intrinsics.d(this.e, h06Var.e) && Intrinsics.d(this.f, h06Var.f) && Intrinsics.d(this.g, h06Var.g) && Intrinsics.d(this.h, h06Var.h) && Intrinsics.d(this.i, h06Var.i) && this.j == h06Var.j && Intrinsics.d(this.k, h06Var.k) && Intrinsics.d(this.l, h06Var.l) && Intrinsics.d(this.m, h06Var.m);
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        int c2 = k5r.c((c + (num == null ? 0 : num.hashCode())) * 31, 31, this.d);
        String str = this.e;
        int hashCode = (this.f.hashCode() + ((c2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.g;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int a = f1d.a(this.j, k5r.c((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.i), 31);
        String str4 = this.k;
        int hashCode3 = (a + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.l;
        return this.m.a.hashCode() + ((hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("ConcertShort(id=", this.a, ", concertTitle=", this.b, ", rank=");
        m.append(this.c);
        m.append(", city=");
        m.append(this.d);
        m.append(", place=");
        m.append(this.e);
        m.append(", datetime=");
        m.append(this.f);
        m.append(", contentRating=");
        su4.v(m, this.g, ", dataSessionId=", this.h, ", coverUri=");
        m.append(this.i);
        m.append(", coverColor=");
        m.append(this.j);
        m.append(", cashbackTitle=");
        m.append(this.k);
        m.append(", cashbackPercentValue=");
        m.append(this.l);
        m.append(", eventInfo=");
        m.append(this.m);
        m.append(")");
        return m.toString();
    }
}
