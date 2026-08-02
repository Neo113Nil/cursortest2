package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class hg5 {
    public final String a;
    public final String b;
    public final boolean c;
    public final jzb d;
    public final boolean e;

    public hg5(String str, String str2, boolean z, jzb jzbVar, boolean z2) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = jzbVar;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hg5)) {
            return false;
        }
        hg5 hg5Var = (hg5) obj;
        return Intrinsics.d(this.a, hg5Var.a) && Intrinsics.d(this.b, hg5Var.b) && this.c == hg5Var.c && this.d == hg5Var.d && this.e == hg5Var.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int e = k5r.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        jzb jzbVar = this.d;
        return Boolean.hashCode(this.e) + ((e + (jzbVar != null ? jzbVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("CommonTrackUiData(title=", this.a, ", subtitle=", this.b, ", isExplicit=");
        m.append(this.c);
        m.append(", explicitType=");
        m.append(this.d);
        m.append(", hasVideoShot=");
        return ouj.r(m, this.e, ")");
    }
}
