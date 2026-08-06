package defpackage;

/* loaded from: classes.dex */
public final class ps0 {
    public final long IHQe1A4L2xu;
    public final defpackage.ct0 oh6vYeIP;

    public ps0() {
        long adDC3e2L = defpackage.w70.adDC3e2L(4284900966L);
        defpackage.ct0 riuEU0zW4 = defpackage.s21.riuEU0zW4(3);
        this.IHQe1A4L2xu = adDC3e2L;
        this.oh6vYeIP = riuEU0zW4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!defpackage.ps0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        defpackage.ps0 ps0Var = (defpackage.ps0) obj;
        return defpackage.ae.r1MBDhnF(this.IHQe1A4L2xu, ps0Var.IHQe1A4L2xu) && defpackage.x70.QoRHpC4k(this.oh6vYeIP, ps0Var.oh6vYeIP);
    }

    public final int hashCode() {
        int i = defpackage.ae.AARZUJiTa;
        return this.oh6vYeIP.hashCode() + (java.lang.Long.hashCode(this.IHQe1A4L2xu) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OverscrollConfiguration(glowColor=");
        defpackage.fx0.cnag84Bm(this.IHQe1A4L2xu, sb, ", drawPadding=");
        sb.append(this.oh6vYeIP);
        sb.append(')');
        return sb.toString();
    }
}
