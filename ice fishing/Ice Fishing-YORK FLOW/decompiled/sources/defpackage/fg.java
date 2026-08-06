package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class fg implements defpackage.y10 {
    public final /* synthetic */ java.lang.Object GE9mJIPrb8gP;
    public final /* synthetic */ java.lang.Object P05cfTpS5W5L;
    public final /* synthetic */ java.lang.Object QiMR8OkAhezm;
    public final /* synthetic */ int WDYagTQQm9ns = 1;
    public final /* synthetic */ java.lang.Object e6mdH7fiFuta;
    public final /* synthetic */ int oh71FJcDz6S2;

    public /* synthetic */ fg(defpackage.dv1 dv1Var, int i, defpackage.fo0 fo0Var, defpackage.mw0 mw0Var, defpackage.mw0 mw0Var2) {
        this.QiMR8OkAhezm = dv1Var;
        this.oh71FJcDz6S2 = i;
        this.P05cfTpS5W5L = fo0Var;
        this.e6mdH7fiFuta = mw0Var;
        this.GE9mJIPrb8gP = mw0Var2;
    }

    @Override // defpackage.y10
    public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj) {
        int i;
        int i2 = this.WDYagTQQm9ns;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        int i3 = 0;
        java.lang.Object obj2 = this.GE9mJIPrb8gP;
        java.lang.Object obj3 = this.e6mdH7fiFuta;
        java.lang.Object obj4 = this.P05cfTpS5W5L;
        int i4 = this.oh71FJcDz6S2;
        java.lang.Object obj5 = this.QiMR8OkAhezm;
        switch (i2) {
            case 0:
                defpackage.ry0[] ry0VarArr = (defpackage.ry0[]) obj5;
                defpackage.gg ggVar = (defpackage.gg) obj4;
                defpackage.xk0 xk0Var = (defpackage.xk0) obj3;
                int[] iArr = (int[]) obj2;
                defpackage.qy0 qy0Var = (defpackage.qy0) obj;
                int length = ry0VarArr.length;
                int i5 = 0;
                while (i3 < length) {
                    defpackage.ry0 ry0Var = ry0VarArr[i3];
                    ry0Var.getClass();
                    ry0Var.GE9mJIPrb8gP();
                    defpackage.qy0.QiMR8OkAhezm(qy0Var, ry0Var, ggVar.giKS3J6vZuNy.ZpBGe2uQfcn8(ry0Var.WDYagTQQm9ns, i4, xk0Var.getLayoutDirection()), iArr[i5]);
                    i3++;
                    i5++;
                }
                break;
            default:
                defpackage.fo0 fo0Var = (defpackage.fo0) obj4;
                defpackage.mw0 mw0Var = (defpackage.mw0) obj2;
                defpackage.rc0 rc0Var = (defpackage.rc0) obj;
                fo0Var.setValue(rc0Var);
                ((defpackage.mw0) obj3).e6mdH7fiFuta((int) (rc0Var.GcLuU6pT9wO9() >> 32));
                android.view.View view = ((defpackage.dv1) obj5).ZpBGe2uQfcn8;
                android.graphics.Rect rect = new android.graphics.Rect();
                view.getWindowVisibleDisplayFrame(rect);
                int i6 = rect.top;
                int i7 = rect.bottom;
                defpackage.rc0 rc0Var2 = (defpackage.rc0) fo0Var.getValue();
                defpackage.s31 oh71FJcDz6S2 = (rc0Var2 == null || !rc0Var2.blKFvluuDQOf()) ? defpackage.s31.WDYagTQQm9ns : defpackage.n70.oh71FJcDz6S2(rc0Var2.e6mdH7fiFuta(0L), defpackage.w60.EPEWHACkMcF1(rc0Var2.GcLuU6pT9wO9()));
                int i8 = i6 + i4;
                int i9 = i7 - i4;
                float f = oh71FJcDz6S2.giKS3J6vZuNy;
                if (f <= i7) {
                    float f2 = oh71FJcDz6S2.JhCgjQRTAOCT;
                    if (f2 >= i6) {
                        i = defpackage.ok0.CZa7MwI9IzLd(java.lang.Math.max(f - i8, i9 - f2));
                        mw0Var.e6mdH7fiFuta(java.lang.Math.max(i, 0));
                        break;
                    }
                }
                i = i9 - i8;
                mw0Var.e6mdH7fiFuta(java.lang.Math.max(i, 0));
                break;
        }
        return gs1Var;
    }

    public /* synthetic */ fg(defpackage.ry0[] ry0VarArr, defpackage.gg ggVar, int i, defpackage.xk0 xk0Var, int[] iArr) {
        this.QiMR8OkAhezm = ry0VarArr;
        this.P05cfTpS5W5L = ggVar;
        this.oh71FJcDz6S2 = i;
        this.e6mdH7fiFuta = xk0Var;
        this.GE9mJIPrb8gP = iArr;
    }
}
