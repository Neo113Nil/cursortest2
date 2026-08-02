package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class rab {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final jzb e;
    public final boolean f;
    public final boolean g;

    public rab(String str, String str2, String str3, String str4, jzb jzbVar, boolean z, boolean z2) {
        dfi.s(str, str2, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = jzbVar;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rab)) {
            return false;
        }
        rab rabVar = (rab) obj;
        return Intrinsics.d(this.a, rabVar.a) && Intrinsics.d(this.b, rabVar.b) && Intrinsics.d(this.c, rabVar.c) && Intrinsics.d(this.d, rabVar.d) && this.e == rabVar.e && this.f == rabVar.f && this.g == rabVar.g;
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int c2 = k5r.c((c + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        jzb jzbVar = this.e;
        return Boolean.hashCode(this.g) + k5r.e((c2 + (jzbVar != null ? jzbVar.hashCode() : 0)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder m = f1d.m("EntityItemUiData(title=", this.a, ", subtitle1=", this.b, ", subtitle2=");
        su4.v(m, this.c, ", imageUrl=", this.d, ", explicitType=");
        m.append(this.e);
        m.append(", hasExplicitMark=");
        m.append(this.f);
        m.append(", hasTrailer=");
        return ouj.r(m, this.g, ")");
    }
}
