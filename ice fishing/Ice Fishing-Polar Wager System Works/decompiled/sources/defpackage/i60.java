package defpackage;

/* loaded from: classes.dex */
public final class i60 {
    public static final defpackage.i60 adDC3e2L = new defpackage.i60(0, 0, 0, 0);
    public final int F7NU4MC0GW;
    public final int IHQe1A4L2xu;
    public final int oh6vYeIP;
    public final int r1MBDhnF;

    public i60(int i, int i2, int i3, int i4) {
        this.IHQe1A4L2xu = i;
        this.oh6vYeIP = i2;
        this.r1MBDhnF = i3;
        this.F7NU4MC0GW = i4;
    }

    public static defpackage.i60 IHQe1A4L2xu(defpackage.i60 i60Var, defpackage.i60 i60Var2) {
        return oh6vYeIP(java.lang.Math.max(i60Var.IHQe1A4L2xu, i60Var2.IHQe1A4L2xu), java.lang.Math.max(i60Var.oh6vYeIP, i60Var2.oh6vYeIP), java.lang.Math.max(i60Var.r1MBDhnF, i60Var2.r1MBDhnF), java.lang.Math.max(i60Var.F7NU4MC0GW, i60Var2.F7NU4MC0GW));
    }

    public static defpackage.i60 oh6vYeIP(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? adDC3e2L : new defpackage.i60(i, i2, i3, i4);
    }

    public static defpackage.i60 r1MBDhnF(android.graphics.Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return oh6vYeIP(i, i2, i3, i4);
    }

    public final android.graphics.Insets F7NU4MC0GW() {
        return defpackage.ri.EXtogiMhuM(this.IHQe1A4L2xu, this.oh6vYeIP, this.r1MBDhnF, this.F7NU4MC0GW);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || defpackage.i60.class != obj.getClass()) {
            return false;
        }
        defpackage.i60 i60Var = (defpackage.i60) obj;
        return this.F7NU4MC0GW == i60Var.F7NU4MC0GW && this.IHQe1A4L2xu == i60Var.IHQe1A4L2xu && this.r1MBDhnF == i60Var.r1MBDhnF && this.oh6vYeIP == i60Var.oh6vYeIP;
    }

    public final int hashCode() {
        return (((((this.IHQe1A4L2xu * 31) + this.oh6vYeIP) * 31) + this.r1MBDhnF) * 31) + this.F7NU4MC0GW;
    }

    public final java.lang.String toString() {
        return "Insets{left=" + this.IHQe1A4L2xu + ", top=" + this.oh6vYeIP + ", right=" + this.r1MBDhnF + ", bottom=" + this.F7NU4MC0GW + '}';
    }
}
