package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class c implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ Object MdtA4re8;
    public final /* synthetic */ int NCTxEWno;

    public /* synthetic */ c(int i, Object obj) {
        this.NCTxEWno = i;
        this.MdtA4re8 = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.NCTxEWno;
        Object obj = this.MdtA4re8;
        switch (i) {
            case 0:
                l lVar = (l) obj;
                if (!lVar.getInternalPopup().NCTxEWno()) {
                    lVar.b2ZJblxo.ygLcUYwZ(lVar.getTextDirection(), lVar.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = lVar.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            case 1:
                i iVar = (i) obj;
                l lVar2 = iVar.eIA6dogk;
                if (!lVar2.isAttachedToWindow() || !lVar2.getGlobalVisibleRect(iVar.SgZGMMPL)) {
                    iVar.dismiss();
                    break;
                } else {
                    iVar.KlHjfFWx();
                    iVar.wxUZMvaN();
                    break;
                }
                break;
            case 2:
                z3 z3Var = (z3) obj;
                ArrayList arrayList = z3Var.jb9XjC4I;
                if (z3Var.NCTxEWno() && arrayList.size() > 0) {
                    int i2 = 0;
                    if (!((y3) arrayList.get(0)).qoPGr6Ce.DK9slbsy) {
                        View view = z3Var.sjUBp5pO;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i2 < size) {
                                Object obj2 = arrayList.get(i2);
                                i2++;
                                ((y3) obj2).qoPGr6Ce.wxUZMvaN();
                            }
                            break;
                        } else {
                            z3Var.dismiss();
                            break;
                        }
                    }
                }
                break;
            default:
                r90 r90Var = (r90) obj;
                ns nsVar = r90Var.jb9XjC4I;
                if (r90Var.NCTxEWno() && !nsVar.DK9slbsy) {
                    View view2 = r90Var.ygLcUYwZ;
                    if (view2 != null && view2.isShown()) {
                        nsVar.wxUZMvaN();
                        break;
                    } else {
                        r90Var.dismiss();
                        break;
                    }
                }
                break;
        }
    }
}
