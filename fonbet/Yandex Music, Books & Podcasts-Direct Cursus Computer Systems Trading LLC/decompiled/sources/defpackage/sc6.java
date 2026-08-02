package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class sc6 extends ksw {
    public final String A;
    public final String B;
    public final String C;
    public final boolean D;
    public final t0k E;
    public final float F;
    public final String z;

    public sc6(String str, String str2, String str3, String str4, boolean z, t0k t0kVar, float f) {
        str3.getClass();
        this.z = str;
        this.A = str2;
        this.B = str3;
        this.C = str4;
        this.D = z;
        this.E = t0kVar;
        this.F = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sc6)) {
            return false;
        }
        sc6 sc6Var = (sc6) obj;
        return this.z.equals(sc6Var.z) && this.A.equals(sc6Var.A) && Intrinsics.d(this.B, sc6Var.B) && Intrinsics.d(this.C, sc6Var.C) && this.D == sc6Var.D && this.E.equals(sc6Var.E) && Float.compare(this.F, sc6Var.F) == 0;
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c((((this.z.hashCode() + 98538305) * 31) + 1420720166) * 961, 31, this.A), 31, this.B);
        String str = this.C;
        return Float.hashCode(this.F) + ((this.E.hashCode() + k5r.e((c + (str == null ? 0 : str.hashCode())) * 31, 31, this.D)) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("ContentMethod(saleTitle=, saleVisibility=gone, subtitle=", this.z, ", subtitleColor=@{isLightTheme ? '#80000000' : '#80FFFFFF'}, subtitleGradient=null, subtitleVisibility=", this.A, ", title=");
        su4.v(m, this.B, ", titleTrailingIconUrl=", this.C, ", titleTrailingIconVisibility=");
        m.append(this.D);
        m.append(", paddings=");
        m.append(this.E);
        m.append(", alpha=");
        return su4.m(this.F, ")", m);
    }
}
