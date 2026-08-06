package defpackage;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class PCrRnrghk5 extends he0 implements w7, b01, y40, w50, va1 {
    public final /* synthetic */ c jivtDDk9H;
    public final NWXxPwoOUSX9 mE4lRynR = new NWXxPwoOUSX9(2, this);

    public PCrRnrghk5(c cVar) {
        this.jivtDDk9H = cVar;
    }

    @Override // defpackage.va1
    public final Object E7jCp8Ls() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // defpackage.w7
    public final Object EDwNPVYuViP0(bk0 bk0Var, psOJLYhIz psojlyhiz, d71 d71Var) {
        long pjimB8cb = bk0Var.pjimB8cb(0L);
        kt0 kt0Var = (kt0) psojlyhiz.GWasM1elztuh();
        kt0 OOA6hdeuvCS = kt0Var != null ? kt0Var.OOA6hdeuvCS(pjimB8cb) : null;
        if (OOA6hdeuvCS != null) {
            this.jivtDDk9H.requestRectangleOnScreen(new Rect((int) OOA6hdeuvCS.GWasM1elztuh, (int) OOA6hdeuvCS.Yi7zF1RB1, (int) OOA6hdeuvCS.X1lG3V04pd, (int) OOA6hdeuvCS.xqGvceK5x), false);
        }
        return kc1.GWasM1elztuh;
    }

    @Override // defpackage.w50
    public final cd0 ES6ysExf(dd0 dd0Var, wc0 wc0Var, long j) {
        up0 OOA6hdeuvCS = wc0Var.OOA6hdeuvCS(j);
        return dd0Var.HFYAaqMd6(OOA6hdeuvCS.OOA6hdeuvCS, OOA6hdeuvCS.EljAMC1QTz, yp.OOA6hdeuvCS, this.mE4lRynR, new Bg54Cq4f(OOA6hdeuvCS, 0));
    }

    @Override // defpackage.y40
    public final boolean VeqTn1PQw7(KeyEvent keyEvent) {
        dt dtVar;
        int[] iArr = gt.GWasM1elztuh;
        long OOA6hdeuvCS = rj0.OOA6hdeuvCS(keyEvent.getKeyCode());
        Integer num = null;
        if (w40.GWasM1elztuh(OOA6hdeuvCS, w40.Yi7zF1RB1)) {
            dtVar = new dt(2);
        } else if (w40.GWasM1elztuh(OOA6hdeuvCS, w40.X1lG3V04pd)) {
            dtVar = new dt(1);
        } else if (w40.GWasM1elztuh(OOA6hdeuvCS, w40.mOu10nynGul)) {
            dtVar = new dt(keyEvent.isShiftPressed() ? 2 : 1);
        } else {
            dtVar = w40.GWasM1elztuh(OOA6hdeuvCS, w40.AvO7iQsrTN) ? new dt(4) : w40.GWasM1elztuh(OOA6hdeuvCS, w40.EljAMC1QTz) ? new dt(3) : (w40.GWasM1elztuh(OOA6hdeuvCS, w40.xqGvceK5x) || w40.GWasM1elztuh(OOA6hdeuvCS, w40.XnEVoBF0td1l)) ? new dt(5) : (w40.GWasM1elztuh(OOA6hdeuvCS, w40.OOA6hdeuvCS) || w40.GWasM1elztuh(OOA6hdeuvCS, w40.uFEq9NpZ)) ? new dt(6) : (w40.GWasM1elztuh(OOA6hdeuvCS, w40.encWxUiV2) || w40.GWasM1elztuh(OOA6hdeuvCS, w40.rQPn8YBR) || w40.GWasM1elztuh(OOA6hdeuvCS, w40.iwATDS1i01k)) ? new dt(7) : (w40.GWasM1elztuh(OOA6hdeuvCS, w40.GWasM1elztuh) || w40.GWasM1elztuh(OOA6hdeuvCS, w40.E7jCp8Ls)) ? new dt(8) : null;
        }
        if (dtVar != null) {
            int i = dtVar.GWasM1elztuh;
            if (vc0.lv06NcmrQ(keyEvent) == 2) {
                c cVar = this.jivtDDk9H;
                ((nt) cVar.getFocusOwner()).getClass();
                Boolean OOA6hdeuvCS2 = ((nt) cVar.getFocusOwner()).OOA6hdeuvCS(i, cVar.getEmbeddedViewFocusRect(), new NWXxPwoOUSX9(1, dtVar));
                if (OOA6hdeuvCS2 != null ? OOA6hdeuvCS2.booleanValue() : true) {
                    return true;
                }
                if (i == 1 || i == 2) {
                    if (i == 5) {
                        num = 33;
                    } else if (i == 6) {
                        num = 130;
                    } else if (i == 3) {
                        num = 17;
                    } else if (i == 4) {
                        num = 66;
                    } else if (i == 1) {
                        num = 2;
                    } else if (i == 2) {
                        num = 1;
                    }
                    int intValue = num != null ? num.intValue() : 2;
                    FocusFinder focusFinder = FocusFinder.getInstance();
                    View rootView = cVar.getRootView();
                    rootView.getClass();
                    View findNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, cVar.getView(), intValue);
                    if (findNextFocus == null || findNextFocus.equals(cVar)) {
                        return ((nt) cVar.getFocusOwner()).AvO7iQsrTN(i);
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.b01
    public final void Uxq83abb04(l01 l01Var) {
    }
}
