package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class op implements defpackage.y10 {
    public final /* synthetic */ java.lang.Object P05cfTpS5W5L;
    public final /* synthetic */ java.lang.Object QiMR8OkAhezm;
    public final /* synthetic */ int WDYagTQQm9ns;
    public final /* synthetic */ java.lang.Object e6mdH7fiFuta;
    public final /* synthetic */ int oh71FJcDz6S2;

    public /* synthetic */ op(defpackage.ry0[] ry0VarArr, defpackage.v61 v61Var, int i, int[] iArr) {
        this.WDYagTQQm9ns = 2;
        this.QiMR8OkAhezm = ry0VarArr;
        this.P05cfTpS5W5L = v61Var;
        this.oh71FJcDz6S2 = i;
        this.e6mdH7fiFuta = iArr;
    }

    @Override // defpackage.y10
    public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj) {
        int i = this.WDYagTQQm9ns;
        int i2 = 0;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        java.lang.Object obj2 = this.e6mdH7fiFuta;
        int i3 = this.oh71FJcDz6S2;
        java.lang.Object obj3 = this.P05cfTpS5W5L;
        java.lang.Object obj4 = this.QiMR8OkAhezm;
        switch (i) {
            case 0:
                defpackage.r90 r90Var = (defpackage.r90) obj3;
                defpackage.on0 on0Var = (defpackage.on0) obj2;
                if (obj == ((defpackage.qp) obj4)) {
                    defpackage.h7.P05cfTpS5W5L("A derived state calculation cannot read itself");
                    break;
                } else {
                    if (obj instanceof defpackage.jg1) {
                        int i4 = r90Var.ZpBGe2uQfcn8 - i3;
                        int JhCgjQRTAOCT = on0Var.JhCgjQRTAOCT(obj);
                        on0Var.QiMR8OkAhezm(java.lang.Math.min(i4, JhCgjQRTAOCT >= 0 ? on0Var.fWTAfUmVKrZq[JhCgjQRTAOCT] : Integer.MAX_VALUE), obj);
                    }
                    break;
                }
            case 1:
                defpackage.p50 p50Var = (defpackage.p50) obj4;
                defpackage.xk0 xk0Var = (defpackage.xk0) obj3;
                defpackage.ry0 ry0Var = (defpackage.ry0) obj2;
                defpackage.qy0 qy0Var = (defpackage.qy0) obj;
                int i5 = p50Var.giKS3J6vZuNy;
                defpackage.vl1 vl1Var = p50Var.ZpBGe2uQfcn8;
                defpackage.ap1 ap1Var = p50Var.fWTAfUmVKrZq;
                defpackage.cn1 cn1Var = (defpackage.cn1) p50Var.JhCgjQRTAOCT.ZpBGe2uQfcn8();
                vl1Var.ZpBGe2uQfcn8(defpackage.fv0.oh71FJcDz6S2, defpackage.w60.P05cfTpS5W5L(qy0Var, i5, ap1Var, cn1Var != null ? cn1Var.ZpBGe2uQfcn8 : null, xk0Var.getLayoutDirection() == defpackage.sc0.oh71FJcDz6S2, ry0Var.WDYagTQQm9ns), i3, ry0Var.WDYagTQQm9ns);
                defpackage.qy0.GE9mJIPrb8gP(qy0Var, ry0Var, java.lang.Math.round(-vl1Var.ZpBGe2uQfcn8.P05cfTpS5W5L()), 0);
                break;
            default:
                defpackage.ry0[] ry0VarArr = (defpackage.ry0[]) obj4;
                defpackage.v61 v61Var = (defpackage.v61) obj3;
                int[] iArr = (int[]) obj2;
                defpackage.qy0 qy0Var2 = (defpackage.qy0) obj;
                int length = ry0VarArr.length;
                int i6 = 0;
                while (i2 < length) {
                    defpackage.ry0 ry0Var2 = ry0VarArr[i2];
                    ry0Var2.getClass();
                    ry0Var2.GE9mJIPrb8gP();
                    defpackage.qy0.QiMR8OkAhezm(qy0Var2, ry0Var2, iArr[i6], v61Var.giKS3J6vZuNy.ZpBGe2uQfcn8(ry0Var2.oh71FJcDz6S2, i3));
                    i2++;
                    i6++;
                }
                break;
        }
        return gs1Var;
    }

    public /* synthetic */ op(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, int i2) {
        this.WDYagTQQm9ns = i2;
        this.QiMR8OkAhezm = obj;
        this.P05cfTpS5W5L = obj2;
        this.e6mdH7fiFuta = obj3;
        this.oh71FJcDz6S2 = i;
    }
}
