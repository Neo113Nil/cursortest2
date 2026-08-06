package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class sp0 extends defpackage.op0 {
    public final java.lang.Object P05cfTpS5W5L;
    public final defpackage.zq0 QiMR8OkAhezm;
    public final java.util.ArrayList e6mdH7fiFuta;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp0(defpackage.zq0 zq0Var, java.lang.Object obj, java.util.Map map) {
        super(zq0Var.giKS3J6vZuNy(defpackage.t80.maCixPsq4ml2(defpackage.wp0.class)), null, map);
        zq0Var.getClass();
        obj.getClass();
        map.getClass();
        this.e6mdH7fiFuta = new java.util.ArrayList();
        this.QiMR8OkAhezm = zq0Var;
        this.P05cfTpS5W5L = obj;
    }

    public final defpackage.rp0 fWTAfUmVKrZq() {
        int hashCode;
        defpackage.rp0 rp0Var = (defpackage.rp0) super.ZpBGe2uQfcn8();
        java.util.ArrayList arrayList = this.e6mdH7fiFuta;
        arrayList.getClass();
        defpackage.up0 up0Var = rp0Var.GE9mJIPrb8gP;
        up0Var.getClass();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            java.lang.Object obj = arrayList.get(i);
            i++;
            defpackage.np0 np0Var = (defpackage.np0) obj;
            if (np0Var != null) {
                defpackage.rf1 rf1Var = (defpackage.rf1) up0Var.fWTAfUmVKrZq;
                defpackage.rp0 rp0Var2 = (defpackage.rp0) up0Var.giKS3J6vZuNy;
                defpackage.qp0 qp0Var = rp0Var2.oh71FJcDz6S2;
                defpackage.qp0 qp0Var2 = np0Var.oh71FJcDz6S2;
                int i2 = qp0Var2.ZpBGe2uQfcn8;
                java.lang.String str = (java.lang.String) qp0Var2.WDYagTQQm9ns;
                if (i2 == 0 && str == null) {
                    defpackage.h7.w7APNrr0aGRc("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
                    return null;
                }
                java.lang.String str2 = (java.lang.String) qp0Var.WDYagTQQm9ns;
                if (str2 != null && defpackage.ma0.QiMR8OkAhezm(str, str2)) {
                    defpackage.h7.GE9mJIPrb8gP("Destination ", np0Var, " cannot have the same route as graph ", rp0Var2);
                    return null;
                }
                if (i2 == qp0Var.ZpBGe2uQfcn8) {
                    defpackage.h7.GE9mJIPrb8gP("Destination ", np0Var, " cannot have the same id as graph ", rp0Var2);
                    return null;
                }
                defpackage.np0 np0Var2 = (defpackage.np0) rf1Var.giKS3J6vZuNy(i2);
                if (np0Var2 == np0Var) {
                    continue;
                } else {
                    if (np0Var.QiMR8OkAhezm != null) {
                        defpackage.h7.P05cfTpS5W5L("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
                        return null;
                    }
                    if (np0Var2 != null) {
                        np0Var2.QiMR8OkAhezm = null;
                    }
                    np0Var.QiMR8OkAhezm = rp0Var2;
                    rf1Var.JhCgjQRTAOCT(qp0Var2.ZpBGe2uQfcn8, np0Var);
                }
            }
        }
        java.lang.Object obj2 = this.P05cfTpS5W5L;
        if (obj2 == null) {
            if (this.fWTAfUmVKrZq != null) {
                defpackage.h7.P05cfTpS5W5L("You must set a start destination route");
                return null;
            }
            defpackage.h7.P05cfTpS5W5L("You must set a start destination id");
            return null;
        }
        defpackage.rb0 BXaznwstz2U0 = defpackage.t80.BXaznwstz2U0(defpackage.b41.ZpBGe2uQfcn8(obj2.getClass()));
        int oCu53ZX2v4Ju = defpackage.w60.oCu53ZX2v4Ju(BXaznwstz2U0);
        defpackage.np0 gUjdnLbkVAaA = up0Var.gUjdnLbkVAaA(oCu53ZX2v4Ju);
        if (gUjdnLbkVAaA == null) {
            defpackage.h7.e6mdH7fiFuta("Cannot find startDestination ", BXaznwstz2U0.giKS3J6vZuNy().ZpBGe2uQfcn8(), " from NavGraph. Ensure the starting NavDestination was added with route from KClass.");
            return null;
        }
        java.util.Map giKS3J6vZuNy = gUjdnLbkVAaA.giKS3J6vZuNy();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(defpackage.jk0.zJPqDeoF0Os1(giKS3J6vZuNy.size()));
        for (java.util.Map.Entry entry : giKS3J6vZuNy.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((defpackage.wo0) entry.getValue()).ZpBGe2uQfcn8);
        }
        java.lang.String dG7RjM6DqYVL = defpackage.w60.dG7RjM6DqYVL(obj2, linkedHashMap);
        defpackage.rp0 rp0Var3 = (defpackage.rp0) up0Var.giKS3J6vZuNy;
        if (dG7RjM6DqYVL != null) {
            if (dG7RjM6DqYVL.equals((java.lang.String) rp0Var3.oh71FJcDz6S2.WDYagTQQm9ns)) {
                defpackage.h7.GE9mJIPrb8gP("Start destination ", dG7RjM6DqYVL, " cannot use the same route as the graph ", rp0Var3);
            } else if (defpackage.tg1.PS16moFv2oLu(dG7RjM6DqYVL)) {
                defpackage.h7.w7APNrr0aGRc("Cannot have an empty start destination route");
            } else {
                int i3 = defpackage.np0.e6mdH7fiFuta;
                hashCode = "android-app://androidx.navigation/".concat(dG7RjM6DqYVL).hashCode();
            }
            up0Var.ZpBGe2uQfcn8 = oCu53ZX2v4Ju;
            return rp0Var;
        }
        hashCode = 0;
        up0Var.ZpBGe2uQfcn8 = hashCode;
        up0Var.WDYagTQQm9ns = dG7RjM6DqYVL;
        up0Var.ZpBGe2uQfcn8 = oCu53ZX2v4Ju;
        return rp0Var;
    }
}
