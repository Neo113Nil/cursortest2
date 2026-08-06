package defpackage;

/* loaded from: classes.dex */
public final class k0 extends defpackage.lj0 implements defpackage.e9, defpackage.d71, defpackage.n90, defpackage.da0, defpackage.ui1 {
    public final defpackage.s EgCjBq0SZwJ = new defpackage.s(2, this);
    public final /* synthetic */ defpackage.v0 fnWB2E7cs;

    public k0(defpackage.v0 v0Var) {
        this.fnWB2E7cs = v0Var;
    }

    @Override // defpackage.e9
    public final java.lang.Object CGXpA9s3RjIa(defpackage.ip0 ip0Var, defpackage.o0 o0Var, defpackage.ce1 ce1Var) {
        long wcsMeQWq = ip0Var.wcsMeQWq(0L);
        defpackage.kz0 kz0Var = (defpackage.kz0) o0Var.IHQe1A4L2xu();
        defpackage.kz0 adDC3e2L = kz0Var != null ? kz0Var.adDC3e2L(wcsMeQWq) : null;
        if (adDC3e2L != null) {
            this.fnWB2E7cs.requestRectangleOnScreen(new android.graphics.Rect((int) adDC3e2L.IHQe1A4L2xu, (int) adDC3e2L.oh6vYeIP, (int) adDC3e2L.r1MBDhnF, (int) adDC3e2L.F7NU4MC0GW), false);
        }
        return defpackage.ok1.IHQe1A4L2xu;
    }

    @Override // defpackage.ui1
    public final java.lang.Object JlrlGoKF() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // defpackage.n90
    public final boolean mAr5m2L7gYDP(android.view.KeyEvent keyEvent) {
        defpackage.sx sxVar;
        int[] iArr = defpackage.vx.IHQe1A4L2xu;
        long oh6vYeIP = defpackage.c80.oh6vYeIP(keyEvent.getKeyCode());
        java.lang.Integer num = null;
        if (defpackage.l90.IHQe1A4L2xu(oh6vYeIP, defpackage.l90.oh6vYeIP)) {
            sxVar = new defpackage.sx(2);
        } else if (defpackage.l90.IHQe1A4L2xu(oh6vYeIP, defpackage.l90.r1MBDhnF)) {
            sxVar = new defpackage.sx(1);
        } else if (defpackage.l90.IHQe1A4L2xu(oh6vYeIP, defpackage.l90.riuEU0zW4)) {
            sxVar = new defpackage.sx(keyEvent.isShiftPressed() ? 2 : 1);
        } else {
            sxVar = defpackage.l90.IHQe1A4L2xu(oh6vYeIP, defpackage.l90.AARZUJiTa) ? new defpackage.sx(4) : defpackage.l90.IHQe1A4L2xu(oh6vYeIP, defpackage.l90.xiZrDbcSW0) ? new defpackage.sx(3) : (defpackage.l90.IHQe1A4L2xu(oh6vYeIP, defpackage.l90.F7NU4MC0GW) || defpackage.l90.IHQe1A4L2xu(oh6vYeIP, defpackage.l90.DFo87pBq1E5)) ? new defpackage.sx(5) : (defpackage.l90.IHQe1A4L2xu(oh6vYeIP, defpackage.l90.adDC3e2L) || defpackage.l90.IHQe1A4L2xu(oh6vYeIP, defpackage.l90.SyNS6RMn)) ? new defpackage.sx(6) : (defpackage.l90.IHQe1A4L2xu(oh6vYeIP, defpackage.l90.EXtogiMhuM) || defpackage.l90.IHQe1A4L2xu(oh6vYeIP, defpackage.l90.ez2rX8ReCYw) || defpackage.l90.IHQe1A4L2xu(oh6vYeIP, defpackage.l90.cnag84Bm)) ? new defpackage.sx(7) : (defpackage.l90.IHQe1A4L2xu(oh6vYeIP, defpackage.l90.IHQe1A4L2xu) || defpackage.l90.IHQe1A4L2xu(oh6vYeIP, defpackage.l90.JlrlGoKF)) ? new defpackage.sx(8) : null;
        }
        if (sxVar != null) {
            int i = sxVar.IHQe1A4L2xu;
            if (defpackage.s70.nBH8hAHy(keyEvent) == 2) {
                defpackage.v0 v0Var = this.fnWB2E7cs;
                ((defpackage.cy) v0Var.getFocusOwner()).getClass();
                java.lang.Boolean adDC3e2L = ((defpackage.cy) v0Var.getFocusOwner()).adDC3e2L(i, v0Var.getEmbeddedViewFocusRect(), new defpackage.s(1, sxVar));
                if (adDC3e2L != null ? adDC3e2L.booleanValue() : true) {
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
                    android.view.View rootView = v0Var.getRootView();
                    rootView.getClass();
                    android.view.View findNextFocus = focusFinder.findNextFocus((android.view.ViewGroup) rootView, v0Var.getView(), intValue);
                    if (findNextFocus == null || findNextFocus.equals(v0Var)) {
                        return ((defpackage.cy) v0Var.getFocusOwner()).AARZUJiTa(i);
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.da0
    public final defpackage.ji0 nVhUznk1t(defpackage.ki0 ki0Var, defpackage.di0 di0Var, long j) {
        defpackage.bv0 xiZrDbcSW0 = di0Var.xiZrDbcSW0(j);
        return ki0Var.p4kuH6PDtgom(xiZrDbcSW0.adDC3e2L, xiZrDbcSW0.xiZrDbcSW0, defpackage.ot.adDC3e2L, this.EgCjBq0SZwJ, new defpackage.j0(xiZrDbcSW0, 0));
    }

    @Override // defpackage.d71
    public final void wKlPRKlRnfqr(defpackage.n71 n71Var) {
    }
}
