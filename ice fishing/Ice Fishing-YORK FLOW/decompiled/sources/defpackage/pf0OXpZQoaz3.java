package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class pf0OXpZQoaz3 implements defpackage.zq {
    public final /* synthetic */ java.lang.Object JhCgjQRTAOCT;
    public final /* synthetic */ int ZpBGe2uQfcn8;
    public final /* synthetic */ java.lang.Object fWTAfUmVKrZq;
    public final /* synthetic */ java.lang.Object giKS3J6vZuNy;

    public pf0OXpZQoaz3(defpackage.wg0 wg0Var, defpackage.sg0 sg0Var, defpackage.z31 z31Var) {
        this.ZpBGe2uQfcn8 = 3;
        this.fWTAfUmVKrZq = wg0Var;
        this.giKS3J6vZuNy = sg0Var;
        this.JhCgjQRTAOCT = z31Var;
    }

    @Override // defpackage.zq
    public final void ZpBGe2uQfcn8() {
        int i = this.ZpBGe2uQfcn8;
        java.lang.Object obj = this.JhCgjQRTAOCT;
        java.lang.Object obj2 = this.fWTAfUmVKrZq;
        java.lang.Object obj3 = this.giKS3J6vZuNy;
        switch (i) {
            case 0:
                ((defpackage.n10) obj3).ZpBGe2uQfcn8();
                ((defpackage.wg0) obj2).QiMR8OkAhezm().oh71FJcDz6S2((defpackage.mnkwqFSfsWTC) obj);
                break;
            case 1:
                ((defpackage.ff1) obj3).remove(obj2);
                ((defpackage.q5) obj).JhCgjQRTAOCT.Ns0WNyEWdPsk(obj2);
                break;
            case 2:
                defpackage.xo0 xo0Var = (defpackage.xo0) obj2;
                ((defpackage.hq) obj3).giKS3J6vZuNy().fWTAfUmVKrZq(xo0Var);
                ((defpackage.ff1) obj).remove(xo0Var);
                break;
            case 3:
                ((defpackage.wg0) obj2).QiMR8OkAhezm().oh71FJcDz6S2((defpackage.sg0) obj3);
                defpackage.f9 f9Var = (defpackage.f9) ((defpackage.z31) obj).WDYagTQQm9ns;
                if (f9Var != null) {
                    f9Var.ZpBGe2uQfcn8();
                    break;
                }
                break;
            default:
                defpackage.j71 j71Var = (defpackage.j71) obj3;
                defpackage.n71 n71Var = (defpackage.n71) obj;
                if (j71Var.oh71FJcDz6S2.Ns0WNyEWdPsk(obj2) == n71Var) {
                    java.util.Map map = j71Var.WDYagTQQm9ns;
                    java.util.Map WDYagTQQm9ns = n71Var.WDYagTQQm9ns();
                    if (!WDYagTQQm9ns.isEmpty()) {
                        map.put(obj2, WDYagTQQm9ns);
                        break;
                    } else {
                        map.remove(obj2);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ pf0OXpZQoaz3(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.ZpBGe2uQfcn8 = i;
        this.giKS3J6vZuNy = obj;
        this.fWTAfUmVKrZq = obj2;
        this.JhCgjQRTAOCT = obj3;
    }
}
