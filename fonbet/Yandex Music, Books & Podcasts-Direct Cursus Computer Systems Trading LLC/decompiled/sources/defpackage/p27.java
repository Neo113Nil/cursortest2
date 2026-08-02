package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p27 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final bm2 f;
    public final String g;
    public final boolean h;
    public final String i;
    public final List j;
    public final String k;
    public final String l;

    public p27(String str, String str2, String str3, String str4, String str5, bm2 bm2Var, String str6, boolean z, String str7, List list, String str8, String str9) {
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = bm2Var;
        this.g = str6;
        this.h = z;
        this.i = str7;
        this.j = list;
        this.k = str8;
        this.l = str9;
    }

    public static p27 a(p27 p27Var, String str) {
        String str2 = p27Var.a;
        String str3 = p27Var.b;
        String str4 = p27Var.c;
        String str5 = p27Var.d;
        bm2 bm2Var = p27Var.f;
        String str6 = p27Var.g;
        boolean z = p27Var.h;
        String str7 = p27Var.i;
        List list = p27Var.j;
        String str8 = p27Var.k;
        String str9 = p27Var.l;
        str3.getClass();
        str4.getClass();
        return new p27(str2, str3, str4, str5, str, bm2Var, str6, z, str7, list, str8, str9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p27)) {
            return false;
        }
        p27 p27Var = (p27) obj;
        return this.a.equals(p27Var.a) && Intrinsics.d(this.b, p27Var.b) && Intrinsics.d(this.c, p27Var.c) && Intrinsics.d(this.d, p27Var.d) && this.e.equals(p27Var.e) && Intrinsics.d(this.f, p27Var.f) && Intrinsics.d(this.g, p27Var.g) && this.h == p27Var.h && Intrinsics.d(this.i, p27Var.i) && Intrinsics.d(this.j, p27Var.j) && Intrinsics.d(this.k, p27Var.k) && Intrinsics.d(this.l, p27Var.l);
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int c2 = k5r.c((c + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        bm2 bm2Var = this.f;
        int hashCode = (c2 + (bm2Var == null ? 0 : bm2Var.hashCode())) * 31;
        String str2 = this.g;
        int e = k5r.e((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.h);
        String str3 = this.i;
        int hashCode2 = (e + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.j;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.k;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.l;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = f1d.m("DKPaymentMethod(methodType=", this.a, ", methodBank=", this.b, ", title=");
        su4.v(m, this.c, ", subtitle=", this.d, ", methodIconUrl=");
        m.append(this.e);
        m.append(", amount=");
        m.append(this.f);
        m.append(", memberId=");
        m.append(this.g);
        m.append(", isFamily=");
        m.append(this.h);
        m.append(", titleTrailingIconUrl=");
        m.append(this.i);
        m.append(", restrictions=");
        m.append(this.j);
        m.append(", errorRespCode=");
        return ouj.q(m, this.k, ", payload=", this.l, ")");
    }
}
