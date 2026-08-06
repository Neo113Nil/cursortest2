package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class wd1 implements defpackage.y10 {
    public final /* synthetic */ int WDYagTQQm9ns;
    public final /* synthetic */ java.lang.Object oh71FJcDz6S2;

    public /* synthetic */ wd1(defpackage.wd1 wd1Var, defpackage.WDYagTQQm9ns wDYagTQQm9ns) {
        this.WDYagTQQm9ns = 6;
        this.oh71FJcDz6S2 = wd1Var;
    }

    @Override // defpackage.y10
    public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj) {
        int i = this.WDYagTQQm9ns;
        java.lang.Object obj2 = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                java.util.ArrayList arrayList = (java.util.ArrayList) obj2;
                defpackage.qy0 qy0Var = (defpackage.qy0) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    defpackage.qy0.QiMR8OkAhezm(qy0Var, (defpackage.ry0) arrayList.get(i2), 0, 0);
                }
                return defpackage.gs1.ZpBGe2uQfcn8;
            case 1:
                defpackage.zd1 zd1Var = (defpackage.zd1) obj2;
                defpackage.bc1 bc1Var = zd1Var.oh71FJcDz6S2;
                bc1Var.getClass();
                if (!defpackage.ma0.QiMR8OkAhezm(zd1Var.oh71FJcDz6S2, bc1Var)) {
                    defpackage.g11.giKS3J6vZuNy("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                }
                defpackage.zn0 zn0Var = zd1Var.WDYagTQQm9ns;
                java.lang.Object obj3 = zd1Var.fWTAfUmVKrZq;
                if (zn0Var != null) {
                    if (obj3 != null) {
                        defpackage.g11.giKS3J6vZuNy("workingSoleWatchedObject must be null when workingWatchSet is non-null");
                    }
                    zn0Var.ZpBGe2uQfcn8(obj);
                } else if (obj3 == null) {
                    zd1Var.fWTAfUmVKrZq = obj;
                } else {
                    defpackage.zn0 zn0Var2 = defpackage.n81.ZpBGe2uQfcn8;
                    defpackage.zn0 zn0Var3 = new defpackage.zn0();
                    zn0Var3.ZpBGe2uQfcn8(obj3);
                    zn0Var3.ZpBGe2uQfcn8(obj);
                    zd1Var.WDYagTQQm9ns = zn0Var3;
                    zd1Var.fWTAfUmVKrZq = null;
                }
                return defpackage.gs1.ZpBGe2uQfcn8;
            case 2:
                defpackage.hf1 hf1Var = (defpackage.hf1) obj2;
                synchronized (hf1Var.QiMR8OkAhezm) {
                    defpackage.gf1 gf1Var = hf1Var.e6mdH7fiFuta;
                    gf1Var.getClass();
                    java.lang.Object obj4 = gf1Var.giKS3J6vZuNy;
                    obj4.getClass();
                    int i3 = gf1Var.JhCgjQRTAOCT;
                    defpackage.on0 on0Var = gf1Var.fWTAfUmVKrZq;
                    if (on0Var == null) {
                        on0Var = new defpackage.on0();
                        gf1Var.fWTAfUmVKrZq = on0Var;
                        gf1Var.oh71FJcDz6S2.h3m55N1URyyK(obj4, on0Var);
                    }
                    gf1Var.giKS3J6vZuNy(obj, i3, obj4, on0Var);
                }
                return defpackage.gs1.ZpBGe2uQfcn8;
            case 3:
                defpackage.z5 z5Var = (defpackage.z5) obj;
                ((defpackage.c20) obj2).QiMR8OkAhezm(z5Var.WDYagTQQm9ns.getValue(), defpackage.nn.ZVVdXbWmyCSK.giKS3J6vZuNy.P05cfTpS5W5L(z5Var.oh71FJcDz6S2));
                return defpackage.gs1.ZpBGe2uQfcn8;
            case 4:
                android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) obj2;
                defpackage.ct ctVar = (defpackage.ct) obj;
                defpackage.id oh71FJcDz6S2 = ctVar.qjMheFZ0l9kA().oh71FJcDz6S2();
                drawable.setBounds(0, 0, (int) java.lang.Float.intBitsToFloat((int) (ctVar.JhCgjQRTAOCT() >> 32)), (int) java.lang.Float.intBitsToFloat((int) (ctVar.JhCgjQRTAOCT() & 4294967295L)));
                drawable.draw(defpackage.a.ZpBGe2uQfcn8(oh71FJcDz6S2));
                return defpackage.gs1.ZpBGe2uQfcn8;
            case 5:
                ((defpackage.y10) obj).P05cfTpS5W5L((defpackage.yj1) obj2);
                return defpackage.gs1.ZpBGe2uQfcn8;
            case 6:
                defpackage.wd1 wd1Var = (defpackage.wd1) obj2;
                defpackage.rp1 rp1Var = (defpackage.rp1) obj;
                if (rp1Var instanceof defpackage.YZh1E3mnTFwf) {
                    wd1Var.P05cfTpS5W5L(((defpackage.YZh1E3mnTFwf) rp1Var).BHfvd2J71qpO);
                    return java.lang.Boolean.TRUE;
                }
                defpackage.h7.P05cfTpS5W5L("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                return null;
            case 7:
                defpackage.vl1 vl1Var = (defpackage.vl1) obj2;
                float floatValue = ((java.lang.Float) obj).floatValue();
                defpackage.lw0 lw0Var = vl1Var.ZpBGe2uQfcn8;
                float P05cfTpS5W5L = lw0Var.P05cfTpS5W5L() + floatValue;
                defpackage.lw0 lw0Var2 = vl1Var.giKS3J6vZuNy;
                if (P05cfTpS5W5L > lw0Var2.P05cfTpS5W5L()) {
                    floatValue = lw0Var2.P05cfTpS5W5L() - lw0Var.P05cfTpS5W5L();
                } else if (P05cfTpS5W5L < 0.0f) {
                    floatValue = -lw0Var.P05cfTpS5W5L();
                }
                lw0Var.e6mdH7fiFuta(lw0Var.P05cfTpS5W5L() + floatValue);
                return java.lang.Float.valueOf(floatValue);
            case 8:
                return (defpackage.ws0) ((defpackage.n10) obj2).ZpBGe2uQfcn8();
            default:
                defpackage.jq1 jq1Var = (defpackage.jq1) obj2;
                defpackage.oe oeVar = (defpackage.oe) obj;
                oeVar.getClass();
                defpackage.oe.ZpBGe2uQfcn8(oeVar, "first", jq1Var.ZpBGe2uQfcn8.giKS3J6vZuNy());
                defpackage.oe.ZpBGe2uQfcn8(oeVar, "second", jq1Var.giKS3J6vZuNy.giKS3J6vZuNy());
                defpackage.oe.ZpBGe2uQfcn8(oeVar, "third", jq1Var.fWTAfUmVKrZq.giKS3J6vZuNy());
                return defpackage.gs1.ZpBGe2uQfcn8;
        }
    }

    public /* synthetic */ wd1(int i, java.lang.Object obj) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = obj;
    }
}
