package defpackage;

/* loaded from: classes.dex */
public final class lb {
    public final long F7NU4MC0GW;
    public final long IHQe1A4L2xu;
    public final long oh6vYeIP;
    public final long r1MBDhnF;

    public lb(long j, long j2, long j3, long j4) {
        this.IHQe1A4L2xu = j;
        this.oh6vYeIP = j2;
        this.r1MBDhnF = j3;
        this.F7NU4MC0GW = j4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof defpackage.lb)) {
            return false;
        }
        defpackage.lb lbVar = (defpackage.lb) obj;
        return defpackage.ae.r1MBDhnF(this.IHQe1A4L2xu, lbVar.IHQe1A4L2xu) && defpackage.ae.r1MBDhnF(this.oh6vYeIP, lbVar.oh6vYeIP) && defpackage.ae.r1MBDhnF(this.r1MBDhnF, lbVar.r1MBDhnF) && defpackage.ae.r1MBDhnF(this.F7NU4MC0GW, lbVar.F7NU4MC0GW);
    }

    public final int hashCode() {
        int i = defpackage.ae.AARZUJiTa;
        return java.lang.Long.hashCode(this.F7NU4MC0GW) + defpackage.fx0.r1MBDhnF(defpackage.fx0.r1MBDhnF(java.lang.Long.hashCode(this.IHQe1A4L2xu) * 31, 31, this.oh6vYeIP), 31, this.r1MBDhnF);
    }
}
