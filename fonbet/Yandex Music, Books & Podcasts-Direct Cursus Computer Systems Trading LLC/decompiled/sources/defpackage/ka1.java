package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ka1 {
    public final u51 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;
    public final String g;
    public final String h;
    public final te i;
    public final String j;
    public final boolean k;

    public ka1(u51 u51Var, String str, String str2, String str3, String str4, List list, String str5, String str6, te teVar, String str7, boolean z) {
        u51Var.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        this.a = u51Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = list;
        this.g = str5;
        this.h = str6;
        this.i = teVar;
        this.j = str7;
        this.k = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka1)) {
            return false;
        }
        ka1 ka1Var = (ka1) obj;
        return Intrinsics.d(this.a, ka1Var.a) && Intrinsics.d(this.b, ka1Var.b) && Intrinsics.d(this.c, ka1Var.c) && Intrinsics.d(this.d, ka1Var.d) && Intrinsics.d(this.e, ka1Var.e) && Intrinsics.d(this.f, ka1Var.f) && Intrinsics.d(this.g, ka1Var.g) && Intrinsics.d(this.h, ka1Var.h) && Intrinsics.d(this.i, ka1Var.i) && Intrinsics.d(this.j, ka1Var.j) && this.k == ka1Var.k;
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int d = k5r.d((c + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
        String str2 = this.g;
        int hashCode = (d + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        te teVar = this.i;
        int hashCode3 = (hashCode2 + (teVar == null ? 0 : teVar.hashCode())) * 31;
        String str4 = this.j;
        return Boolean.hashCode(this.k) + ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArtistHeaderUiData(artist=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", coverUrl=");
        su4.v(sb, this.c, ", bgImageUrl=", this.d, ", videoUrl=");
        sb.append(this.e);
        sb.append(", covers=");
        sb.append(this.f);
        sb.append(", listenersCount=");
        su4.v(sb, this.g, ", donationUrl=", this.h, ", brandedButton=");
        sb.append(this.i);
        sb.append(", foreignAgentText=");
        sb.append(this.j);
        sb.append(", hasTrailer=");
        return ouj.r(sb, this.k, ")");
    }
}
