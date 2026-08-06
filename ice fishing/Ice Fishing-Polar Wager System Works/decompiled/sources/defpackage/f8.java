package defpackage;

/* loaded from: classes.dex */
public final class f8 {
    public final android.graphics.ColorFilter IHQe1A4L2xu;
    public final long oh6vYeIP;
    public final int r1MBDhnF;

    public f8(long j) {
        android.graphics.ColorFilter porterDuffColorFilter;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            defpackage.b0.adDC3e2L();
            porterDuffColorFilter = defpackage.b0.r1MBDhnF(defpackage.w70.yIx6ChFVk(j), defpackage.w70.p4kuH6PDtgom(5));
        } else {
            porterDuffColorFilter = new android.graphics.PorterDuffColorFilter(defpackage.w70.yIx6ChFVk(j), defpackage.w70.wll2JLbTBC2(5));
        }
        this.IHQe1A4L2xu = porterDuffColorFilter;
        this.oh6vYeIP = j;
        this.r1MBDhnF = 5;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.f8)) {
            return false;
        }
        defpackage.f8 f8Var = (defpackage.f8) obj;
        return defpackage.ae.r1MBDhnF(this.oh6vYeIP, f8Var.oh6vYeIP) && this.r1MBDhnF == f8Var.r1MBDhnF;
    }

    public final int hashCode() {
        int i = defpackage.ae.AARZUJiTa;
        return java.lang.Integer.hashCode(this.r1MBDhnF) + (java.lang.Long.hashCode(this.oh6vYeIP) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BlendModeColorFilter(color=");
        defpackage.fx0.cnag84Bm(this.oh6vYeIP, sb, ", blendMode=");
        sb.append((java.lang.Object) defpackage.s21.gG5uWf3dqScO(this.r1MBDhnF));
        sb.append(')');
        return sb.toString();
    }
}
