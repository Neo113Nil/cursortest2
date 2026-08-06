package defpackage;

/* loaded from: classes.dex */
public final class cu {
    public static final defpackage.cu oh6vYeIP = new defpackage.cu(new defpackage.mi1((defpackage.yu) null, (defpackage.qb) null, (defpackage.e90) null, (java.util.LinkedHashMap) null, 127));
    public final defpackage.mi1 IHQe1A4L2xu;

    public cu(defpackage.mi1 mi1Var) {
        this.IHQe1A4L2xu = mi1Var;
    }

    public final defpackage.cu IHQe1A4L2xu(defpackage.cu cuVar) {
        defpackage.mi1 mi1Var = cuVar.IHQe1A4L2xu;
        defpackage.yu yuVar = mi1Var.IHQe1A4L2xu;
        defpackage.mi1 mi1Var2 = this.IHQe1A4L2xu;
        if (yuVar == null) {
            yuVar = mi1Var2.IHQe1A4L2xu;
        }
        defpackage.qb qbVar = mi1Var.oh6vYeIP;
        if (qbVar == null) {
            qbVar = mi1Var2.oh6vYeIP;
        }
        java.util.Map map = mi1Var2.F7NU4MC0GW;
        java.util.Map map2 = mi1Var.F7NU4MC0GW;
        map.getClass();
        map2.getClass();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new defpackage.cu(new defpackage.mi1(yuVar, qbVar, (defpackage.e90) null, linkedHashMap, 32));
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.cu) && ((defpackage.cu) obj).IHQe1A4L2xu.equals(this.IHQe1A4L2xu);
    }

    public final int hashCode() {
        return this.IHQe1A4L2xu.hashCode();
    }

    public final java.lang.String toString() {
        if (equals(oh6vYeIP)) {
            return "EnterTransition.None";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EnterTransition: \nFade - ");
        defpackage.mi1 mi1Var = this.IHQe1A4L2xu;
        defpackage.yu yuVar = mi1Var.IHQe1A4L2xu;
        sb.append(yuVar != null ? yuVar.toString() : null);
        sb.append(",\nSlide - null,\nShrink - ");
        defpackage.qb qbVar = mi1Var.oh6vYeIP;
        sb.append(qbVar != null ? qbVar.toString() : null);
        sb.append(",\nScale - ");
        sb.append((java.lang.String) null);
        return sb.toString();
    }
}
