package defpackage;

/* loaded from: classes.dex */
public final class je0 {
    public static final defpackage.je0 F7NU4MC0GW = new defpackage.je0(defpackage.ge0.r1MBDhnF, 17, 0);
    public final float IHQe1A4L2xu;
    public final int oh6vYeIP;
    public final int r1MBDhnF;

    public je0(float f, int i, int i2) {
        this.IHQe1A4L2xu = f;
        this.oh6vYeIP = i;
        this.r1MBDhnF = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.je0)) {
            return false;
        }
        defpackage.je0 je0Var = (defpackage.je0) obj;
        float f = je0Var.IHQe1A4L2xu;
        float f2 = defpackage.ge0.oh6vYeIP;
        return java.lang.Float.compare(this.IHQe1A4L2xu, f) == 0 && this.oh6vYeIP == je0Var.oh6vYeIP && this.r1MBDhnF == je0Var.r1MBDhnF;
    }

    public final int hashCode() {
        float f = defpackage.ge0.oh6vYeIP;
        return java.lang.Integer.hashCode(this.r1MBDhnF) + defpackage.fx0.oh6vYeIP(this.oh6vYeIP, java.lang.Float.hashCode(this.IHQe1A4L2xu) * 31, 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LineHeightStyle(alignment=");
        sb.append((java.lang.Object) defpackage.ge0.oh6vYeIP(this.IHQe1A4L2xu));
        sb.append(", trim=");
        java.lang.String str = "Invalid";
        int i = this.oh6vYeIP;
        sb.append((java.lang.Object) (i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb.append(",mode=");
        int i2 = this.r1MBDhnF;
        if (i2 == 0) {
            str = "LineHeightStyle.Mode.Fixed";
        } else if (i2 == 1) {
            str = "LineHeightStyle.Mode.Minimum";
        } else if (i2 == 2) {
            str = "LineHeightStyle.Mode.Tight";
        }
        sb.append((java.lang.Object) str);
        sb.append(')');
        return sb.toString();
    }
}
