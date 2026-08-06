package defpackage;

/* loaded from: classes.dex */
public final class ze {
    public final java.lang.Object F7NU4MC0GW;
    public final java.lang.Object IHQe1A4L2xu;
    public final java.lang.Throwable adDC3e2L;
    public final defpackage.ya oh6vYeIP;
    public final defpackage.l00 r1MBDhnF;

    public /* synthetic */ ze(java.lang.Object obj, defpackage.ya yaVar, defpackage.l00 l00Var, java.lang.Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : yaVar, (i & 4) != 0 ? null : l00Var, (java.lang.Object) null, (i & 16) != 0 ? null : th);
    }

    public static defpackage.ze IHQe1A4L2xu(defpackage.ze zeVar, defpackage.ya yaVar, java.lang.Throwable th, int i) {
        java.lang.Object obj = zeVar.IHQe1A4L2xu;
        if ((i & 2) != 0) {
            yaVar = zeVar.oh6vYeIP;
        }
        defpackage.ya yaVar2 = yaVar;
        defpackage.l00 l00Var = zeVar.r1MBDhnF;
        java.lang.Object obj2 = zeVar.F7NU4MC0GW;
        if ((i & 16) != 0) {
            th = zeVar.adDC3e2L;
        }
        return new defpackage.ze(obj, yaVar2, l00Var, obj2, th);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ze)) {
            return false;
        }
        defpackage.ze zeVar = (defpackage.ze) obj;
        return defpackage.x70.QoRHpC4k(this.IHQe1A4L2xu, zeVar.IHQe1A4L2xu) && defpackage.x70.QoRHpC4k(this.oh6vYeIP, zeVar.oh6vYeIP) && defpackage.x70.QoRHpC4k(this.r1MBDhnF, zeVar.r1MBDhnF) && defpackage.x70.QoRHpC4k(this.F7NU4MC0GW, zeVar.F7NU4MC0GW) && defpackage.x70.QoRHpC4k(this.adDC3e2L, zeVar.adDC3e2L);
    }

    public final int hashCode() {
        java.lang.Object obj = this.IHQe1A4L2xu;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        defpackage.ya yaVar = this.oh6vYeIP;
        int hashCode2 = (hashCode + (yaVar == null ? 0 : yaVar.hashCode())) * 31;
        defpackage.l00 l00Var = this.r1MBDhnF;
        int hashCode3 = (hashCode2 + (l00Var == null ? 0 : l00Var.hashCode())) * 31;
        java.lang.Object obj2 = this.F7NU4MC0GW;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        java.lang.Throwable th = this.adDC3e2L;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "CompletedContinuation(result=" + this.IHQe1A4L2xu + ", cancelHandler=" + this.oh6vYeIP + ", onCancellation=" + this.r1MBDhnF + ", idempotentResume=" + this.F7NU4MC0GW + ", cancelCause=" + this.adDC3e2L + ')';
    }

    public ze(java.lang.Object obj, defpackage.ya yaVar, defpackage.l00 l00Var, java.lang.Object obj2, java.lang.Throwable th) {
        this.IHQe1A4L2xu = obj;
        this.oh6vYeIP = yaVar;
        this.r1MBDhnF = l00Var;
        this.F7NU4MC0GW = obj2;
        this.adDC3e2L = th;
    }
}
