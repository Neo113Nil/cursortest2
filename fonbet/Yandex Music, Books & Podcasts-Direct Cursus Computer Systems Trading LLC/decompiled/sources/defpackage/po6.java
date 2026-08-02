package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class po6 implements ed5 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final jzb e;
    public final boolean f;
    public final boolean g;

    public po6(String str, String str2, String str3, boolean z, jzb jzbVar, boolean z2, boolean z3) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = jzbVar;
        this.f = z2;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof po6)) {
            return false;
        }
        po6 po6Var = (po6) obj;
        return this.a.equals(po6Var.a) && Intrinsics.d(this.b, po6Var.b) && Intrinsics.d(this.c, po6Var.c) && this.d == po6Var.d && this.e == po6Var.e && this.f == po6Var.f && this.g == po6Var.g;
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int e = k5r.e((c + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        jzb jzbVar = this.e;
        return Boolean.hashCode(this.g) + k5r.e((e + (jzbVar != null ? jzbVar.hashCode() : 0)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder m = f1d.m("CoverTrackUiData(coverUrl=", this.a, ", title=", this.b, ", subtitle=");
        m.append(this.c);
        m.append(", isExplicit=");
        m.append(this.d);
        m.append(", explicitType=");
        m.append(this.e);
        m.append(", hasVideoShot=");
        m.append(this.f);
        m.append(", hasOverflow=");
        return ouj.r(m, this.g, ")");
    }
}
