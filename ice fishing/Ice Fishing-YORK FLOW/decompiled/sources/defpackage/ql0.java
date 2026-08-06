package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ql0 extends defpackage.ul0 implements defpackage.mj, defpackage.ad0 {
    public java.util.LinkedHashMap BHfvd2J71qpO;

    @Override // defpackage.ad0
    public final defpackage.wk0 WDYagTQQm9ns(defpackage.xk0 xk0Var, defpackage.qk0 qk0Var, long j) {
        float f = ((defpackage.or) defpackage.nq1.blKFvluuDQOf(this, defpackage.z90.fWTAfUmVKrZq)).WDYagTQQm9ns;
        if (f < 0.0f) {
            f = 0.0f;
        }
        defpackage.ry0 WDYagTQQm9ns = qk0Var.WDYagTQQm9ns(j);
        boolean z = this.s0TASMVLSWD5 && !java.lang.Float.isNaN(f) && defpackage.or.ZpBGe2uQfcn8(f, 0.0f) > 0;
        int OVwOqzUGHcCU = !java.lang.Float.isNaN(f) ? xk0Var.OVwOqzUGHcCU(f) : 0;
        int i = WDYagTQQm9ns.WDYagTQQm9ns;
        if (z) {
            i = java.lang.Math.max(i, OVwOqzUGHcCU);
        }
        int i2 = WDYagTQQm9ns.oh71FJcDz6S2;
        if (z) {
            i2 = java.lang.Math.max(i2, OVwOqzUGHcCU);
        }
        if (z) {
            java.util.LinkedHashMap linkedHashMap = this.BHfvd2J71qpO;
            if (linkedHashMap == null) {
                linkedHashMap = new java.util.LinkedHashMap(2);
                this.BHfvd2J71qpO = linkedHashMap;
            }
            defpackage.qt1 qt1Var = defpackage.z90.giKS3J6vZuNy;
            int round = java.lang.Math.round((OVwOqzUGHcCU - WDYagTQQm9ns.WDYagTQQm9ns) / 2.0f);
            if (round < 0) {
                round = 0;
            }
            linkedHashMap.put(qt1Var, java.lang.Integer.valueOf(round));
            defpackage.l50 l50Var = defpackage.z90.ZpBGe2uQfcn8;
            int round2 = java.lang.Math.round((OVwOqzUGHcCU - WDYagTQQm9ns.oh71FJcDz6S2) / 2.0f);
            linkedHashMap.put(l50Var, java.lang.Integer.valueOf(round2 >= 0 ? round2 : 0));
        }
        java.util.Map map = this.BHfvd2J71qpO;
        if (map == null) {
            map = defpackage.bv.WDYagTQQm9ns;
        }
        return xk0Var.hwoZxnIesQBZ(i, i2, map, new defpackage.pl0(i, WDYagTQQm9ns, i2));
    }
}
