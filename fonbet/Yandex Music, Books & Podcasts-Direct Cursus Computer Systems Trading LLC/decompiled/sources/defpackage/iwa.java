package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class iwa implements kwa {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final String g;
    public final wua h;
    public final wua i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;

    public iwa(boolean z, boolean z2, String str, String str2, boolean z3, String str3, String str4, wua wuaVar, wua wuaVar2, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        eta.s(str, str2, str5, str10, str11);
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = z3;
        this.f = str3;
        this.g = str4;
        this.h = wuaVar;
        this.i = wuaVar2;
        this.j = str5;
        this.k = str6;
        this.l = str7;
        this.m = str8;
        this.n = str9;
        this.o = str10;
        this.p = str11;
        this.q = str12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwa)) {
            return false;
        }
        iwa iwaVar = (iwa) obj;
        return this.a == iwaVar.a && this.b == iwaVar.b && Intrinsics.d(this.c, iwaVar.c) && Intrinsics.d(this.d, iwaVar.d) && this.e == iwaVar.e && Intrinsics.d(this.f, iwaVar.f) && Intrinsics.d(this.g, iwaVar.g) && this.h.equals(iwaVar.h) && Intrinsics.d(this.i, iwaVar.i) && Intrinsics.d(this.j, iwaVar.j) && Intrinsics.d(this.k, iwaVar.k) && Intrinsics.d(this.l, iwaVar.l) && Intrinsics.d(this.m, iwaVar.m) && Intrinsics.d(this.n, iwaVar.n) && Intrinsics.d(this.o, iwaVar.o) && Intrinsics.d(this.p, iwaVar.p) && Intrinsics.d(this.q, iwaVar.q);
    }

    public final int hashCode() {
        int e = k5r.e(k5r.c(k5r.c(k5r.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int hashCode2 = (this.h.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        wua wuaVar = this.i;
        int c = k5r.c((hashCode2 + (wuaVar == null ? 0 : wuaVar.hashCode())) * 31, 31, this.j);
        String str3 = this.k;
        int hashCode3 = (c + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.l;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.m;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.n;
        int c2 = k5r.c(k5r.c((hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.o), 31, this.p);
        String str7 = this.q;
        return c2 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder j = eta.j("Data(canBeOpened=", this.a, ", isCenterAlign=", this.b, ", headerText=");
        su4.v(j, this.c, ", headerColor=", this.d, ", bigHeader=");
        j.append(this.e);
        j.append(", subtitleText=");
        j.append(this.f);
        j.append(", subtitleColor=");
        j.append(this.g);
        j.append(", firstButton=");
        j.append(this.h);
        j.append(", secondButton=");
        j.append(this.i);
        j.append(", closeButtonColor=");
        j.append(this.j);
        j.append(", advButtonColor=");
        su4.v(j, this.k, ", advDisclaimer=", this.l, ", disclaimerText=");
        su4.v(j, this.m, ", disclaimerColor=", this.n, ", imageUrl=");
        su4.v(j, this.o, ", backgroundColor=", this.p, ", backgroundImageUrl=");
        return su4.o(j, this.q, ")");
    }
}
