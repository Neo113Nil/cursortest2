package defpackage;

/* loaded from: classes.dex */
public final class ht0 {
    public final defpackage.x2 IHQe1A4L2xu;
    public final int oh6vYeIP;
    public final int r1MBDhnF;

    public ht0(defpackage.x2 x2Var, int i, int i2) {
        this.IHQe1A4L2xu = x2Var;
        this.oh6vYeIP = i;
        this.r1MBDhnF = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ht0) {
            defpackage.ht0 ht0Var = (defpackage.ht0) obj;
            if (this.IHQe1A4L2xu == ht0Var.IHQe1A4L2xu && this.oh6vYeIP == ht0Var.oh6vYeIP && this.r1MBDhnF == ht0Var.r1MBDhnF) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.r1MBDhnF) + defpackage.fx0.oh6vYeIP(this.oh6vYeIP, this.IHQe1A4L2xu.hashCode() * 31, 31);
    }

    public final java.lang.String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.IHQe1A4L2xu + ", startIndex=" + this.oh6vYeIP + ", endIndex=" + this.r1MBDhnF + ')';
    }
}
