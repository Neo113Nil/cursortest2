package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ew5 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Integer g;
    public final String h;
    public final ru5 i;

    public ew5(String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, ru5 ru5Var) {
        str.getClass();
        str6.getClass();
        str7.getClass();
        ru5Var.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = num;
        this.h = str7;
        this.i = ru5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ew5)) {
            return false;
        }
        ew5 ew5Var = (ew5) obj;
        return Intrinsics.d(this.a, ew5Var.a) && this.b.equals(ew5Var.b) && Intrinsics.d(this.c, ew5Var.c) && Intrinsics.d(this.d, ew5Var.d) && Intrinsics.d(this.e, ew5Var.e) && Intrinsics.d(this.f, ew5Var.f) && Intrinsics.d(this.g, ew5Var.g) && Intrinsics.d(this.h, ew5Var.h) && Intrinsics.d(this.i, ew5Var.i);
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int c2 = k5r.c((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f);
        Integer num = this.g;
        return this.i.a.hashCode() + k5r.c((c2 + (num != null ? num.hashCode() : 0)) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder m = f1d.m("ConcertInfoUiData(concertId=", this.a, ", descriptionText=", this.b, ", genre=");
        su4.v(m, this.c, ", source=", this.d, ", age=");
        su4.v(m, this.e, ", price=", this.f, ", cashbackPercentValue=");
        m.append(this.g);
        m.append(", dataSessionId=");
        m.append(this.h);
        m.append(", eventInfo=");
        m.append(this.i);
        m.append(")");
        return m.toString();
    }
}
