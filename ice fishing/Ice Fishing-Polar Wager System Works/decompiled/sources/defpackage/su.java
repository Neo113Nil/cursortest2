package defpackage;

/* loaded from: classes.dex */
public final class su {
    public static final defpackage.su oh6vYeIP;
    public static final defpackage.su r1MBDhnF;
    public final defpackage.mi1 IHQe1A4L2xu;

    static {
        java.util.LinkedHashMap linkedHashMap = null;
        defpackage.yu yuVar = null;
        defpackage.qb qbVar = null;
        defpackage.e90 e90Var = null;
        oh6vYeIP = new defpackage.su(new defpackage.mi1(yuVar, qbVar, e90Var, linkedHashMap, 127));
        r1MBDhnF = new defpackage.su(new defpackage.mi1(yuVar, qbVar, e90Var, linkedHashMap, 95));
    }

    public su(defpackage.mi1 mi1Var) {
        this.IHQe1A4L2xu = mi1Var;
    }

    public final defpackage.su IHQe1A4L2xu(defpackage.su suVar) {
        defpackage.mi1 mi1Var = suVar.IHQe1A4L2xu;
        defpackage.yu yuVar = mi1Var.IHQe1A4L2xu;
        defpackage.mi1 mi1Var2 = this.IHQe1A4L2xu;
        if (yuVar == null) {
            yuVar = mi1Var2.IHQe1A4L2xu;
        }
        defpackage.qb qbVar = mi1Var.oh6vYeIP;
        if (qbVar == null) {
            qbVar = mi1Var2.oh6vYeIP;
        }
        boolean z = mi1Var.r1MBDhnF || mi1Var2.r1MBDhnF;
        java.util.Map map = mi1Var2.F7NU4MC0GW;
        java.util.Map map2 = mi1Var.F7NU4MC0GW;
        map.getClass();
        map2.getClass();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new defpackage.su(new defpackage.mi1(yuVar, qbVar, (defpackage.e90) null, z, linkedHashMap));
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.su) && ((defpackage.su) obj).IHQe1A4L2xu.equals(this.IHQe1A4L2xu);
    }

    public final int hashCode() {
        return this.IHQe1A4L2xu.hashCode();
    }

    public final java.lang.String toString() {
        if (equals(oh6vYeIP)) {
            return "ExitTransition.None";
        }
        if (equals(r1MBDhnF)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExitTransition: \nFade - ");
        defpackage.mi1 mi1Var = this.IHQe1A4L2xu;
        defpackage.yu yuVar = mi1Var.IHQe1A4L2xu;
        sb.append(yuVar != null ? yuVar.toString() : null);
        sb.append(",\nSlide - null,\nShrink - ");
        defpackage.qb qbVar = mi1Var.oh6vYeIP;
        sb.append(qbVar != null ? qbVar.toString() : null);
        sb.append(",\nScale - ");
        sb.append((java.lang.String) null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(mi1Var.r1MBDhnF);
        return sb.toString();
    }
}
