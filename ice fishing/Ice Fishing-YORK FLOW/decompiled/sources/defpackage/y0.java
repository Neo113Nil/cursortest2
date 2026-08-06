package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class y0 implements defpackage.zq {
    public final /* synthetic */ int ZpBGe2uQfcn8;
    public final /* synthetic */ java.lang.Object giKS3J6vZuNy;

    public /* synthetic */ y0(int i, java.lang.Object obj) {
        this.ZpBGe2uQfcn8 = i;
        this.giKS3J6vZuNy = obj;
    }

    @Override // defpackage.zq
    public final void ZpBGe2uQfcn8() {
        int i = this.ZpBGe2uQfcn8;
        java.lang.Object obj = this.giKS3J6vZuNy;
        switch (i) {
            case 0:
                defpackage.kq kqVar = (defpackage.kq) obj;
                kqVar.dismiss();
                kqVar.fNwYGHIYeJcR.oh71FJcDz6S2();
                break;
            case 1:
                defpackage.a11 a11Var = (defpackage.a11) obj;
                a11Var.oh71FJcDz6S2();
                a11Var.setTag(com.ice.fishing.wolberta.R.id.view_tree_lifecycle_owner, null);
                a11Var.ZVVdXbWmyCSK.removeViewImmediate(a11Var);
                break;
            case 2:
                defpackage.e4 e4Var = (defpackage.e4) obj;
                defpackage.hf1 hf1Var = e4Var.WDYagTQQm9ns;
                defpackage.it0 it0Var = hf1Var.P05cfTpS5W5L;
                if (it0Var != null) {
                    it0Var.ZpBGe2uQfcn8();
                }
                hf1Var.ZpBGe2uQfcn8();
                android.view.ActionMode actionMode = e4Var.P05cfTpS5W5L;
                if (actionMode != null) {
                    actionMode.finish();
                }
                e4Var.P05cfTpS5W5L = null;
                break;
            case 3:
                defpackage.q9 q9Var = (defpackage.q9) ((defpackage.r9) obj).fWTAfUmVKrZq.getValue();
                if (q9Var != null) {
                    q9Var.close();
                    break;
                }
                break;
            case 4:
                ((defpackage.dr) obj).oh71FJcDz6S2.ZpBGe2uQfcn8();
                break;
            case 5:
                ((defpackage.em1) obj).T1fB7bDYiVJQ();
                break;
            case 6:
                defpackage.sw swVar = (defpackage.sw) obj;
                android.view.View view = swVar.oh71FJcDz6S2;
                if (swVar.WDYagTQQm9ns) {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(swVar);
                    swVar.WDYagTQQm9ns = false;
                }
                view.removeOnAttachStateChangeListener(swVar);
                break;
            case 7:
                ((defpackage.ne0) obj).JhCgjQRTAOCT = null;
                break;
            case 8:
                defpackage.ye0 ye0Var = (defpackage.ye0) obj;
                defpackage.mc0 mc0Var = ye0Var.fWTAfUmVKrZq;
                if (mc0Var != null) {
                    mc0Var.ZpBGe2uQfcn8 = false;
                }
                ye0Var.fWTAfUmVKrZq = null;
                break;
            case defpackage.n70.ZpBGe2uQfcn8 /* 9 */:
                ((defpackage.te0) obj).oh71FJcDz6S2 = true;
                break;
            default:
                ((defpackage.ja1) ((defpackage.ti) obj)).VFeft99leXEK(null);
                break;
        }
    }
}
