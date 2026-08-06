package defpackage;

/* loaded from: classes.dex */
public final class op {
    public final java.util.List F7NU4MC0GW;
    public final java.lang.String IHQe1A4L2xu;
    public final boolean adDC3e2L;
    public final long oh6vYeIP;
    public final int r1MBDhnF;

    public op(java.lang.String str, long j, int i, java.util.List list, boolean z) {
        str.getClass();
        this.IHQe1A4L2xu = str;
        this.oh6vYeIP = j;
        this.r1MBDhnF = i;
        this.F7NU4MC0GW = list;
        this.adDC3e2L = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.op)) {
            return false;
        }
        defpackage.op opVar = (defpackage.op) obj;
        return defpackage.x70.QoRHpC4k(this.IHQe1A4L2xu, opVar.IHQe1A4L2xu) && this.oh6vYeIP == opVar.oh6vYeIP && this.r1MBDhnF == opVar.r1MBDhnF && this.F7NU4MC0GW.equals(opVar.F7NU4MC0GW) && this.adDC3e2L == opVar.adDC3e2L;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.adDC3e2L) + ((this.F7NU4MC0GW.hashCode() + defpackage.fx0.oh6vYeIP(this.r1MBDhnF, defpackage.fx0.r1MBDhnF(this.IHQe1A4L2xu.hashCode() * 31, 31, this.oh6vYeIP), 31)) * 31);
    }

    public final java.lang.String toString() {
        return "DigSession(islandId=" + this.IHQe1A4L2xu + ", seed=" + this.oh6vYeIP + ", movesLeft=" + this.r1MBDhnF + ", revealed=" + this.F7NU4MC0GW + ", finished=" + this.adDC3e2L + ")";
    }
}
