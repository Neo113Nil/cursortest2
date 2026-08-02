package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class zf4 {
    public final int a;
    public final kf4 b;
    public final String c;
    public final String d;
    public final boolean e;
    public final jzb f;
    public final boolean g;
    public final String h;

    public zf4(int i, kf4 kf4Var, String str, String str2, boolean z, jzb jzbVar, boolean z2, String str3) {
        str.getClass();
        this.a = i;
        this.b = kf4Var;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = jzbVar;
        this.g = z2;
        this.h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zf4)) {
            return false;
        }
        zf4 zf4Var = (zf4) obj;
        return this.a == zf4Var.a && this.b == zf4Var.b && Intrinsics.d(this.c, zf4Var.c) && Intrinsics.d(this.d, zf4Var.d) && this.e == zf4Var.e && this.f == zf4Var.f && this.g == zf4Var.g && this.h.equals(zf4Var.h);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        kf4 kf4Var = this.b;
        int c = k5r.c((hashCode + (kf4Var == null ? 0 : kf4Var.hashCode())) * 31, 31, this.c);
        String str = this.d;
        int e = k5r.e((c + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        jzb jzbVar = this.f;
        return this.h.hashCode() + k5r.e((e + (jzbVar != null ? jzbVar.hashCode() : 0)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChartTrackUiData(position=");
        sb.append(this.a);
        sb.append(", progress=");
        sb.append(this.b);
        sb.append(", title=");
        su4.v(sb, this.c, ", subtitle=", this.d, ", isExplicit=");
        sb.append(this.e);
        sb.append(", explicitType=");
        sb.append(this.f);
        sb.append(", hasVideoShot=");
        sb.append(this.g);
        sb.append(", coverUrl=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
