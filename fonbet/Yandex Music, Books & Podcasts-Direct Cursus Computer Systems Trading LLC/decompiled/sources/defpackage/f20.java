package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f20 {
    public final int a;
    public final boolean b;
    public final String c;
    public final String d;
    public final boolean e;
    public final jzb f;
    public final boolean g;

    public f20(int i, boolean z, String str, String str2, boolean z2, jzb jzbVar, boolean z3) {
        str.getClass();
        this.a = i;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = z2;
        this.f = jzbVar;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f20)) {
            return false;
        }
        f20 f20Var = (f20) obj;
        return this.a == f20Var.a && this.b == f20Var.b && Intrinsics.d(this.c, f20Var.c) && Intrinsics.d(this.d, f20Var.d) && this.e == f20Var.e && this.f == f20Var.f && this.g == f20Var.g;
    }

    public final int hashCode() {
        int c = k5r.c(k5r.e(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int e = k5r.e((c + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        jzb jzbVar = this.f;
        return Boolean.hashCode(this.g) + ((e + (jzbVar != null ? jzbVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AlbumTrackUiData(position=");
        sb.append(this.a);
        sb.append(", isPopular=");
        sb.append(this.b);
        sb.append(", title=");
        su4.v(sb, this.c, ", subtitle=", this.d, ", isExplicit=");
        sb.append(this.e);
        sb.append(", explicitType=");
        sb.append(this.f);
        sb.append(", hasVideoShot=");
        return ouj.r(sb, this.g, ")");
    }
}
