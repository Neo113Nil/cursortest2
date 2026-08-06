package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class g9 implements defpackage.zq {
    public final /* synthetic */ int ZpBGe2uQfcn8;
    public final /* synthetic */ java.lang.Object fWTAfUmVKrZq;
    public final /* synthetic */ java.lang.Object giKS3J6vZuNy;

    public /* synthetic */ g9(int i, java.lang.Object obj, java.lang.Object obj2) {
        this.ZpBGe2uQfcn8 = i;
        this.giKS3J6vZuNy = obj;
        this.fWTAfUmVKrZq = obj2;
    }

    @Override // defpackage.zq
    public final void ZpBGe2uQfcn8() {
        int i = this.ZpBGe2uQfcn8;
        java.lang.Object obj = this.fWTAfUmVKrZq;
        java.lang.Object obj2 = this.giKS3J6vZuNy;
        switch (i) {
            case 0:
                ((defpackage.b9) obj2).giKS3J6vZuNy((defpackage.ai) obj);
                break;
            case 1:
                ((defpackage.xo0) obj2).fNwYGHIYeJcR.GE9mJIPrb8gP.oh71FJcDz6S2((defpackage.aq) obj);
                break;
            case 2:
                ((defpackage.wf0) obj2).QiMR8OkAhezm.Ns0WNyEWdPsk(obj);
                break;
            case 3:
                java.util.Iterator it = ((java.util.List) ((defpackage.dg1) obj2).getValue()).iterator();
                while (it.hasNext()) {
                    ((defpackage.gi) obj).giKS3J6vZuNy().fWTAfUmVKrZq((defpackage.xo0) it.next());
                }
                break;
            case 4:
                ((defpackage.b9) obj2).giKS3J6vZuNy((defpackage.mi) obj);
                break;
            case 5:
                defpackage.fo0 fo0Var = (defpackage.fo0) obj2;
                defpackage.u11 u11Var = (defpackage.u11) fo0Var.getValue();
                if (u11Var != null) {
                    defpackage.t11 t11Var = new defpackage.t11(u11Var);
                    defpackage.in0 in0Var = (defpackage.in0) obj;
                    if (in0Var != null) {
                        in0Var.giKS3J6vZuNy(t11Var);
                    }
                    fo0Var.setValue(null);
                    break;
                }
                break;
            case 6:
                ((defpackage.jp1) obj2).GE9mJIPrb8gP.remove((defpackage.jp1) obj);
                break;
            case 7:
                defpackage.jp1 jp1Var = (defpackage.jp1) obj2;
                jp1Var.getClass();
                defpackage.dp1 dp1Var = (defpackage.dp1) ((defpackage.ep1) obj).giKS3J6vZuNy.getValue();
                if (dp1Var != null) {
                    jp1Var.e6mdH7fiFuta.remove(dp1Var.WDYagTQQm9ns);
                    break;
                }
                break;
            case 8:
                ((defpackage.jp1) obj2).e6mdH7fiFuta.remove((defpackage.hp1) obj);
                break;
            default:
                defpackage.rw1 rw1Var = (defpackage.rw1) obj2;
                android.view.View view = (android.view.View) obj;
                int i2 = rw1Var.ZVVdXbWmyCSK - 1;
                rw1Var.ZVVdXbWmyCSK = i2;
                if (i2 == 0) {
                    int i3 = defpackage.zt1.ZpBGe2uQfcn8;
                    defpackage.ut1.giKS3J6vZuNy(view, null);
                    defpackage.zt1.ZpBGe2uQfcn8(view, null);
                    view.removeOnAttachStateChangeListener(rw1Var.w7APNrr0aGRc);
                    break;
                }
                break;
        }
    }
}
