package defpackage;

/* loaded from: classes.dex */
public final class c91 {
    public static final defpackage.c91 F7NU4MC0GW = new defpackage.c91(defpackage.w70.adDC3e2L(4278190080L), 0, 0.0f);
    public final long IHQe1A4L2xu;
    public final long oh6vYeIP;
    public final float r1MBDhnF;

    public c91(long j, long j2, float f) {
        this.IHQe1A4L2xu = j;
        this.oh6vYeIP = j2;
        this.r1MBDhnF = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.c91)) {
            return false;
        }
        defpackage.c91 c91Var = (defpackage.c91) obj;
        return defpackage.ae.r1MBDhnF(this.IHQe1A4L2xu, c91Var.IHQe1A4L2xu) && defpackage.gq0.oh6vYeIP(this.oh6vYeIP, c91Var.oh6vYeIP) && this.r1MBDhnF == c91Var.r1MBDhnF;
    }

    public final int hashCode() {
        int i = defpackage.ae.AARZUJiTa;
        return java.lang.Float.hashCode(this.r1MBDhnF) + defpackage.fx0.r1MBDhnF(java.lang.Long.hashCode(this.IHQe1A4L2xu) * 31, 31, this.oh6vYeIP);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Shadow(color=");
        defpackage.fx0.cnag84Bm(this.IHQe1A4L2xu, sb, ", offset=");
        sb.append((java.lang.Object) defpackage.gq0.AARZUJiTa(this.oh6vYeIP));
        sb.append(", blurRadius=");
        sb.append(this.r1MBDhnF);
        sb.append(')');
        return sb.toString();
    }
}
