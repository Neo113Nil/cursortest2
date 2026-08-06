package defpackage;

/* loaded from: classes.dex */
public final class gt0 {
    public final float AARZUJiTa;
    public final int F7NU4MC0GW;
    public final defpackage.t2 IHQe1A4L2xu;
    public final int adDC3e2L;
    public final int oh6vYeIP;
    public final int r1MBDhnF;
    public final float xiZrDbcSW0;

    public gt0(defpackage.t2 t2Var, int i, int i2, int i3, int i4, float f, float f2) {
        this.IHQe1A4L2xu = t2Var;
        this.oh6vYeIP = i;
        this.r1MBDhnF = i2;
        this.F7NU4MC0GW = i3;
        this.adDC3e2L = i4;
        this.xiZrDbcSW0 = f;
        this.AARZUJiTa = f2;
    }

    public final int IHQe1A4L2xu(int i) {
        int i2 = this.r1MBDhnF;
        int i3 = this.oh6vYeIP;
        return defpackage.x80.JlrlGoKF(i, i3, i2) - i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.gt0) {
            defpackage.gt0 gt0Var = (defpackage.gt0) obj;
            if (this.IHQe1A4L2xu == gt0Var.IHQe1A4L2xu && this.oh6vYeIP == gt0Var.oh6vYeIP && this.r1MBDhnF == gt0Var.r1MBDhnF && this.F7NU4MC0GW == gt0Var.F7NU4MC0GW && this.adDC3e2L == gt0Var.adDC3e2L && java.lang.Float.compare(this.xiZrDbcSW0, gt0Var.xiZrDbcSW0) == 0 && java.lang.Float.compare(this.AARZUJiTa, gt0Var.AARZUJiTa) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.AARZUJiTa) + defpackage.fx0.IHQe1A4L2xu(this.xiZrDbcSW0, defpackage.fx0.oh6vYeIP(this.adDC3e2L, defpackage.fx0.oh6vYeIP(this.F7NU4MC0GW, defpackage.fx0.oh6vYeIP(this.r1MBDhnF, defpackage.fx0.oh6vYeIP(this.oh6vYeIP, this.IHQe1A4L2xu.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final java.lang.String toString() {
        return "ParagraphInfo(paragraph=" + this.IHQe1A4L2xu + ", startIndex=" + this.oh6vYeIP + ", endIndex=" + this.r1MBDhnF + ", startLineIndex=" + this.F7NU4MC0GW + ", endLineIndex=" + this.adDC3e2L + ", top=" + this.xiZrDbcSW0 + ", bottom=" + this.AARZUJiTa + ')';
    }
}
