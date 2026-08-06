package defpackage;

/* loaded from: classes.dex */
public final class mi1 {
    public final java.util.Map F7NU4MC0GW;
    public final defpackage.yu IHQe1A4L2xu;
    public final defpackage.qb oh6vYeIP;
    public final boolean r1MBDhnF;

    public /* synthetic */ mi1(defpackage.yu yuVar, defpackage.qb qbVar, defpackage.e90 e90Var, java.util.LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : yuVar, (i & 4) != 0 ? null : qbVar, (i & 8) != 0 ? null : e90Var, (i & 32) == 0, (i & 64) != 0 ? defpackage.ot.adDC3e2L : linkedHashMap);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.mi1)) {
            return false;
        }
        defpackage.mi1 mi1Var = (defpackage.mi1) obj;
        return defpackage.x70.QoRHpC4k(this.IHQe1A4L2xu, mi1Var.IHQe1A4L2xu) && defpackage.x70.QoRHpC4k(this.oh6vYeIP, mi1Var.oh6vYeIP) && defpackage.x70.QoRHpC4k(null, null) && this.r1MBDhnF == mi1Var.r1MBDhnF && defpackage.x70.QoRHpC4k(this.F7NU4MC0GW, mi1Var.F7NU4MC0GW);
    }

    public final int hashCode() {
        defpackage.yu yuVar = this.IHQe1A4L2xu;
        int hashCode = (yuVar == null ? 0 : yuVar.hashCode()) * 961;
        defpackage.qb qbVar = this.oh6vYeIP;
        return this.F7NU4MC0GW.hashCode() + defpackage.fx0.adDC3e2L((((hashCode + (qbVar == null ? 0 : qbVar.hashCode())) * 31) + 0) * 961, 31, this.r1MBDhnF);
    }

    public final java.lang.String toString() {
        return "TransitionData(fade=" + this.IHQe1A4L2xu + ", slide=null, changeSize=" + this.oh6vYeIP + ", scale=" + ((java.lang.Object) null) + ", veil=null, hold=" + this.r1MBDhnF + ", effectsMap=" + this.F7NU4MC0GW + ')';
    }

    public mi1(defpackage.yu yuVar, defpackage.qb qbVar, defpackage.e90 e90Var, boolean z, java.util.Map map) {
        this.IHQe1A4L2xu = yuVar;
        this.oh6vYeIP = qbVar;
        this.r1MBDhnF = z;
        this.F7NU4MC0GW = map;
    }
}
