package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class xta implements aua {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final wta e;
    public final wta f;
    public final uta g;
    public final vta h;

    public xta(String str, String str2, String str3, String str4, wta wtaVar, wta wtaVar2, uta utaVar, vta vtaVar) {
        dfi.s(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = wtaVar;
        this.f = wtaVar2;
        this.g = utaVar;
        this.h = vtaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xta)) {
            return false;
        }
        xta xtaVar = (xta) obj;
        return Intrinsics.d(this.a, xtaVar.a) && Intrinsics.d(this.b, xtaVar.b) && Intrinsics.d(this.c, xtaVar.c) && this.d.equals(xtaVar.d) && Intrinsics.d(this.e, xtaVar.e) && Intrinsics.d(this.f, xtaVar.f) && Intrinsics.d(this.g, xtaVar.g) && Intrinsics.d(this.h, xtaVar.h);
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        wta wtaVar = this.e;
        int hashCode = (c + (wtaVar == null ? 0 : wtaVar.hashCode())) * 31;
        wta wtaVar2 = this.f;
        int hashCode2 = (hashCode + (wtaVar2 == null ? 0 : wtaVar2.hashCode())) * 31;
        uta utaVar = this.g;
        int hashCode3 = (hashCode2 + (utaVar == null ? 0 : utaVar.hashCode())) * 31;
        vta vtaVar = this.h;
        return hashCode3 + (vtaVar != null ? vtaVar.a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = f1d.m("DynamicBannerEntity(feedbackToken=", this.a, ", title=", this.b, ", subtitle=");
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
