package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class eua {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final dua e;
    public final dua f;
    public final bua g;
    public final cua h;

    public eua(String str, String str2, String str3, String str4, dua duaVar, dua duaVar2, bua buaVar, cua cuaVar) {
        dfi.s(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = duaVar;
        this.f = duaVar2;
        this.g = buaVar;
        this.h = cuaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eua)) {
            return false;
        }
        eua euaVar = (eua) obj;
        return Intrinsics.d(this.a, euaVar.a) && Intrinsics.d(this.b, euaVar.b) && Intrinsics.d(this.c, euaVar.c) && this.d.equals(euaVar.d) && Intrinsics.d(this.e, euaVar.e) && Intrinsics.d(this.f, euaVar.f) && Intrinsics.d(this.g, euaVar.g) && Intrinsics.d(this.h, euaVar.h);
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        dua duaVar = this.e;
        int hashCode = (c + (duaVar == null ? 0 : duaVar.hashCode())) * 31;
        dua duaVar2 = this.f;
        int hashCode2 = (hashCode + (duaVar2 == null ? 0 : duaVar2.hashCode())) * 31;
        bua buaVar = this.g;
        int hashCode3 = (hashCode2 + (buaVar == null ? 0 : buaVar.hashCode())) * 31;
        cua cuaVar = this.h;
        return hashCode3 + (cuaVar != null ? cuaVar.a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = f1d.m("DynamicBannerUi(feedbackToken=", this.a, ", title=", this.b, ", subtitle=");
        su4.v(m, this.c, ", imageUrl=", this.d, ", lightTheme=");
        m.append(this.e);
        m.append(", darkTheme=");
        m.append(this.f);
        m.append(", action=");
        m.append(this.g);
        m.append(", adv=");
        m.append(this.h);
        m.append(")");
        return m.toString();
    }
}
