package defpackage;

/* loaded from: classes.dex */
public final class ln0 extends defpackage.hn0 {
    public final java.lang.String AARZUJiTa;
    public final java.util.ArrayList EXtogiMhuM;
    public final defpackage.po0 xiZrDbcSW0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ln0(defpackage.po0 po0Var) {
        super(po0Var.oh6vYeIP(defpackage.e90.kd6TUFXn(defpackage.pn0.class)), null);
        po0Var.getClass();
        this.EXtogiMhuM = new java.util.ArrayList();
        this.xiZrDbcSW0 = po0Var;
        this.AARZUJiTa = "menu";
    }

    public final defpackage.kn0 r1MBDhnF() {
        int hashCode;
        defpackage.kn0 kn0Var = (defpackage.kn0) super.IHQe1A4L2xu();
        java.util.ArrayList arrayList = this.EXtogiMhuM;
        arrayList.getClass();
        defpackage.nn0 nn0Var = kn0Var.SH1y5HwkJhh;
        nn0Var.getClass();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            java.lang.Object obj = arrayList.get(i);
            i++;
            defpackage.gn0 gn0Var = (defpackage.gn0) obj;
            if (gn0Var != null) {
                defpackage.qb1 qb1Var = nn0Var.oh6vYeIP;
                defpackage.kn0 kn0Var2 = nn0Var.IHQe1A4L2xu;
                defpackage.jn0 jn0Var = kn0Var2.xiZrDbcSW0;
                defpackage.jn0 jn0Var2 = gn0Var.xiZrDbcSW0;
                int i2 = jn0Var2.IHQe1A4L2xu;
                java.lang.String str = (java.lang.String) jn0Var2.adDC3e2L;
                if (i2 == 0 && str == null) {
                    defpackage.db.fnWB2E7cs("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
                    return null;
                }
                java.lang.String str2 = (java.lang.String) jn0Var.adDC3e2L;
                if (str2 != null && defpackage.x70.QoRHpC4k(str, str2)) {
                    defpackage.db.SH1y5HwkJhh("Destination ", gn0Var, " cannot have the same route as graph ", kn0Var2);
                    return null;
                }
                if (i2 == jn0Var.IHQe1A4L2xu) {
                    defpackage.db.SH1y5HwkJhh("Destination ", gn0Var, " cannot have the same id as graph ", kn0Var2);
                    return null;
                }
                defpackage.gn0 gn0Var2 = (defpackage.gn0) qb1Var.oh6vYeIP(i2);
                if (gn0Var2 == gn0Var) {
                    continue;
                } else {
                    if (gn0Var.AARZUJiTa != null) {
                        defpackage.db.AARZUJiTa("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
                        return null;
                    }
                    if (gn0Var2 != null) {
                        gn0Var2.AARZUJiTa = null;
                    }
                    gn0Var.AARZUJiTa = kn0Var2;
                    qb1Var.F7NU4MC0GW(jn0Var2.IHQe1A4L2xu, gn0Var);
                }
            }
        }
        java.lang.String str3 = this.AARZUJiTa;
        if (str3 == null) {
            if (this.oh6vYeIP != null) {
                defpackage.db.AARZUJiTa("You must set a start destination route");
                return null;
            }
            defpackage.db.AARZUJiTa("You must set a start destination id");
            return null;
        }
        defpackage.kn0 kn0Var3 = nn0Var.IHQe1A4L2xu;
        if (str3 != null) {
            if (str3.equals((java.lang.String) kn0Var3.xiZrDbcSW0.adDC3e2L)) {
                defpackage.db.SH1y5HwkJhh("Start destination ", str3, " cannot use the same route as the graph ", kn0Var3);
            } else if (defpackage.rc1.AQHddgaEX(str3)) {
                defpackage.db.fnWB2E7cs("Cannot have an empty start destination route");
            } else {
                int i3 = defpackage.gn0.riuEU0zW4;
                hashCode = "android-app://androidx.navigation/".concat(str3).hashCode();
            }
            return kn0Var;
        }
        hashCode = 0;
        nn0Var.r1MBDhnF = hashCode;
        nn0Var.adDC3e2L = str3;
        return kn0Var;
    }
}
