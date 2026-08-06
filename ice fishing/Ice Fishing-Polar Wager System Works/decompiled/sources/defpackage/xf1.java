package defpackage;

/* loaded from: classes.dex */
public final class xf1 {
    public final long IHQe1A4L2xu;
    public final long oh6vYeIP;

    public xf1(long j, long j2) {
        this.IHQe1A4L2xu = j;
        this.oh6vYeIP = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.xf1)) {
            return false;
        }
        defpackage.xf1 xf1Var = (defpackage.xf1) obj;
        return defpackage.ae.r1MBDhnF(this.IHQe1A4L2xu, xf1Var.IHQe1A4L2xu) && defpackage.ae.r1MBDhnF(this.oh6vYeIP, xf1Var.oh6vYeIP);
    }

    public final int hashCode() {
        int i = defpackage.ae.AARZUJiTa;
        return java.lang.Long.hashCode(this.oh6vYeIP) + (java.lang.Long.hashCode(this.IHQe1A4L2xu) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectionColors(selectionHandleColor=");
        defpackage.fx0.cnag84Bm(this.IHQe1A4L2xu, sb, ", selectionBackgroundColor=");
        sb.append((java.lang.Object) defpackage.ae.riuEU0zW4(this.oh6vYeIP));
        sb.append(')');
        return sb.toString();
    }
}
