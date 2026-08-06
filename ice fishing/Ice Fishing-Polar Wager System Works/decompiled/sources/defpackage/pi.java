package defpackage;

/* loaded from: classes.dex */
public final class pi {
    public final defpackage.sa1 F7NU4MC0GW;
    public final int IHQe1A4L2xu;
    public final long oh6vYeIP;
    public final defpackage.qi r1MBDhnF;

    public pi(int i, long j, defpackage.qi qiVar, defpackage.sa1 sa1Var) {
        this.IHQe1A4L2xu = i;
        this.oh6vYeIP = j;
        this.r1MBDhnF = qiVar;
        this.F7NU4MC0GW = sa1Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.pi)) {
            return false;
        }
        defpackage.pi piVar = (defpackage.pi) obj;
        return this.IHQe1A4L2xu == piVar.IHQe1A4L2xu && this.oh6vYeIP == piVar.oh6vYeIP && this.r1MBDhnF == piVar.r1MBDhnF && defpackage.x70.QoRHpC4k(this.F7NU4MC0GW, piVar.F7NU4MC0GW);
    }

    public final int hashCode() {
        int hashCode = (this.r1MBDhnF.hashCode() + defpackage.fx0.r1MBDhnF(java.lang.Integer.hashCode(this.IHQe1A4L2xu) * 31, 31, this.oh6vYeIP)) * 31;
        defpackage.sa1 sa1Var = this.F7NU4MC0GW;
        return hashCode + (sa1Var == null ? 0 : sa1Var.hashCode());
    }

    public final java.lang.String toString() {
        return "ContentCaptureEvent(id=" + this.IHQe1A4L2xu + ", timestamp=" + this.oh6vYeIP + ", type=" + this.r1MBDhnF + ", structureCompat=" + this.F7NU4MC0GW + ')';
    }
}
