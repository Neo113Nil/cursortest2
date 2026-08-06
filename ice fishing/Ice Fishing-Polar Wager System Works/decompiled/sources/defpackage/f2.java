package defpackage;

/* loaded from: classes.dex */
public final class f2 {
    public final defpackage.at0 F7NU4MC0GW;
    public final android.content.Context IHQe1A4L2xu;
    public final defpackage.qn oh6vYeIP;
    public final long r1MBDhnF;

    public f2(android.content.Context context, defpackage.qn qnVar, long j, defpackage.at0 at0Var) {
        this.IHQe1A4L2xu = context;
        this.oh6vYeIP = qnVar;
        this.r1MBDhnF = j;
        this.F7NU4MC0GW = at0Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!defpackage.f2.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        defpackage.f2 f2Var = (defpackage.f2) obj;
        return defpackage.x70.QoRHpC4k(this.IHQe1A4L2xu, f2Var.IHQe1A4L2xu) && defpackage.x70.QoRHpC4k(this.oh6vYeIP, f2Var.oh6vYeIP) && defpackage.ae.r1MBDhnF(this.r1MBDhnF, f2Var.r1MBDhnF) && defpackage.x70.QoRHpC4k(this.F7NU4MC0GW, f2Var.F7NU4MC0GW);
    }

    public final int hashCode() {
        int hashCode = (this.oh6vYeIP.hashCode() + (this.IHQe1A4L2xu.hashCode() * 31)) * 31;
        int i = defpackage.ae.AARZUJiTa;
        return this.F7NU4MC0GW.hashCode() + defpackage.fx0.r1MBDhnF(hashCode, 31, this.r1MBDhnF);
    }
}
