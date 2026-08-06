package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class h extends defpackage.ul0 implements defpackage.fb, defpackage.hb1, defpackage.zb0, defpackage.ad0, defpackage.rp1 {
    public final defpackage.YjS0G3zEDWNX BHfvd2J71qpO = new defpackage.YjS0G3zEDWNX(2, this);
    public final /* synthetic */ defpackage.u ZVVdXbWmyCSK;

    public h(defpackage.u uVar) {
        this.ZVVdXbWmyCSK = uVar;
    }

    @Override // defpackage.zb0
    public final boolean CZa7MwI9IzLd(android.view.KeyEvent keyEvent) {
        defpackage.wy wyVar;
        int[] iArr = defpackage.az.ZpBGe2uQfcn8;
        long qjMheFZ0l9kA = defpackage.w60.qjMheFZ0l9kA(keyEvent);
        java.lang.Integer num = null;
        if (defpackage.ub0.ZpBGe2uQfcn8(qjMheFZ0l9kA, defpackage.ub0.giKS3J6vZuNy)) {
            wyVar = new defpackage.wy(2);
        } else if (defpackage.ub0.ZpBGe2uQfcn8(qjMheFZ0l9kA, defpackage.ub0.fWTAfUmVKrZq)) {
            wyVar = new defpackage.wy(1);
        } else if (defpackage.ub0.ZpBGe2uQfcn8(qjMheFZ0l9kA, defpackage.ub0.XntWc4eZSQ8j)) {
            wyVar = new defpackage.wy(keyEvent.isShiftPressed() ? 2 : 1);
        } else {
            wyVar = defpackage.ub0.ZpBGe2uQfcn8(qjMheFZ0l9kA, defpackage.ub0.QiMR8OkAhezm) ? new defpackage.wy(4) : defpackage.ub0.ZpBGe2uQfcn8(qjMheFZ0l9kA, defpackage.ub0.oh71FJcDz6S2) ? new defpackage.wy(3) : (defpackage.ub0.ZpBGe2uQfcn8(qjMheFZ0l9kA, defpackage.ub0.JhCgjQRTAOCT) || defpackage.ub0.ZpBGe2uQfcn8(qjMheFZ0l9kA, defpackage.ub0.UmgHb6n58gfG)) ? new defpackage.wy(5) : (defpackage.ub0.ZpBGe2uQfcn8(qjMheFZ0l9kA, defpackage.ub0.WDYagTQQm9ns) || defpackage.ub0.ZpBGe2uQfcn8(qjMheFZ0l9kA, defpackage.ub0.qjMheFZ0l9kA)) ? new defpackage.wy(6) : (defpackage.ub0.ZpBGe2uQfcn8(qjMheFZ0l9kA, defpackage.ub0.P05cfTpS5W5L) || defpackage.ub0.ZpBGe2uQfcn8(qjMheFZ0l9kA, defpackage.ub0.s0TASMVLSWD5) || defpackage.ub0.ZpBGe2uQfcn8(qjMheFZ0l9kA, defpackage.ub0.jjTN4uUnoyEn)) ? new defpackage.wy(7) : (defpackage.ub0.ZpBGe2uQfcn8(qjMheFZ0l9kA, defpackage.ub0.ZpBGe2uQfcn8) || defpackage.ub0.ZpBGe2uQfcn8(qjMheFZ0l9kA, defpackage.ub0.w7APNrr0aGRc)) ? new defpackage.wy(8) : null;
        }
        if (wyVar != null) {
            int i = wyVar.ZpBGe2uQfcn8;
            if (defpackage.w60.jjTN4uUnoyEn(keyEvent) == 2) {
                defpackage.u uVar = this.ZVVdXbWmyCSK;
                ((defpackage.gz) uVar.getFocusOwner()).getClass();
                java.lang.Boolean WDYagTQQm9ns = ((defpackage.gz) uVar.getFocusOwner()).WDYagTQQm9ns(i, uVar.getEmbeddedViewFocusRect(), new defpackage.YjS0G3zEDWNX(1, wyVar));
                if (WDYagTQQm9ns != null ? WDYagTQQm9ns.booleanValue() : true) {
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
                    android.view.FocusFinder focusFinder = android.view.FocusFinder.getInstance();
                    android.view.View rootView = uVar.getRootView();
                    rootView.getClass();
                    android.view.View findNextFocus = focusFinder.findNextFocus((android.view.ViewGroup) rootView, uVar.getView(), intValue);
                    if (findNextFocus == null || findNextFocus.equals(uVar)) {
                        return ((defpackage.gz) uVar.getFocusOwner()).P05cfTpS5W5L(i);
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.fb
    public final java.lang.Object Rl68HURFBtL3(defpackage.sr0 sr0Var, defpackage.l lVar, defpackage.ll llVar) {
        long w6IV1lieBIux = sr0Var.w6IV1lieBIux(0L);
        defpackage.s31 s31Var = (defpackage.s31) lVar.ZpBGe2uQfcn8();
        defpackage.s31 e6mdH7fiFuta = s31Var != null ? s31Var.e6mdH7fiFuta(w6IV1lieBIux) : null;
        if (e6mdH7fiFuta != null) {
            this.ZVVdXbWmyCSK.requestRectangleOnScreen(new android.graphics.Rect((int) e6mdH7fiFuta.ZpBGe2uQfcn8, (int) e6mdH7fiFuta.giKS3J6vZuNy, (int) e6mdH7fiFuta.fWTAfUmVKrZq, (int) e6mdH7fiFuta.JhCgjQRTAOCT), false);
        }
        return defpackage.gs1.ZpBGe2uQfcn8;
    }

    @Override // defpackage.ad0
    public final defpackage.wk0 WDYagTQQm9ns(defpackage.xk0 xk0Var, defpackage.qk0 qk0Var, long j) {
        defpackage.ry0 WDYagTQQm9ns = qk0Var.WDYagTQQm9ns(j);
        return xk0Var.Wc0TdmRSwbbi(WDYagTQQm9ns.WDYagTQQm9ns, WDYagTQQm9ns.oh71FJcDz6S2, defpackage.bv.WDYagTQQm9ns, this.BHfvd2J71qpO, new defpackage.g(WDYagTQQm9ns, 0));
    }

    @Override // defpackage.rp1
    public final java.lang.Object WmetiUbpKU9I() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // defpackage.zb0
    public final boolean fNwYGHIYeJcR(android.view.KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.hb1
    public final void m6iZQUu7XjoL(defpackage.rb1 rb1Var) {
    }
}
