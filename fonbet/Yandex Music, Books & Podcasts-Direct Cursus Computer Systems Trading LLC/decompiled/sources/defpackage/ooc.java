package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class ooc extends xci implements xoc, ViewTreeObserver.OnGlobalFocusChangeListener {
    public View o;
    public ViewTreeObserver p;
    public final noc q = new noc(this, 0);
    public final noc r = new noc(this, 1);

    @Override // defpackage.xci
    public final void K0() {
        ViewTreeObserver viewTreeObserver = kg5.I(this).getViewTreeObserver();
        this.p = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // defpackage.xci
    public final void L0() {
        ViewTreeObserver viewTreeObserver = this.p;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.p = null;
        kg5.I(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.o = null;
    }

    public final dpc S0() {
        if (!this.a.n) {
            sme.b("visitLocalDescendants called on an unattached node");
        }
        xci xciVar = this.a;
        if ((xciVar.d & 1024) != 0) {
            boolean z = false;
            for (xci xciVar2 = xciVar.f; xciVar2 != null; xciVar2 = xciVar2.f) {
                if ((xciVar2.c & 1024) != 0) {
                    xci xciVar3 = xciVar2;
                    eqi eqiVar = null;
                    while (xciVar3 != null) {
                        if (xciVar3 instanceof dpc) {
                            dpc dpcVar = (dpc) xciVar3;
                            if (z) {
                                return dpcVar;
                            }
                            z = true;
                        } else if ((xciVar3.c & 1024) != 0 && (xciVar3 instanceof cw7)) {
                            int i = 0;
                            for (xci xciVar4 = ((cw7) xciVar3).p; xciVar4 != null; xciVar4 = xciVar4.f) {
                                if ((xciVar4.c & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        xciVar3 = xciVar4;
                                    } else {
                                        if (eqiVar == null) {
                                            eqiVar = new eqi(new xci[16]);
                                        }
                                        if (xciVar3 != null) {
                                            eqiVar.d(xciVar3);
                                            xciVar3 = null;
                                        }
                                        eqiVar.d(xciVar4);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        xciVar3 = bcx.p(eqiVar);
                    }
                }
            }
        }
        xq0.q("Could not find focus target of embedded view wrapper");
        return null;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (bcx.F(this).n == null) {
            return;
        }
        View m = xp3.m(this);
        toc focusOwner = bcx.G(this).getFocusOwner();
        uzj G = bcx.G(this);
        boolean z = (view == null || view.equals(G) || !xp3.k(m, view)) ? false : true;
        boolean z2 = (view2 == null || view2.equals(G) || !xp3.k(m, view2)) ? false : true;
        if (z && z2) {
            this.o = view2;
            return;
        }
        if (z2) {
            this.o = view2;
            dpc S0 = S0();
            if (S0.U0().a()) {
                return;
            }
            x97.C(S0);
            return;
        }
        if (!z) {
            this.o = null;
            return;
        }
        this.o = null;
        if (S0().U0().b()) {
            ((uoc) focusOwner).b(8, false, false);
        }
    }

    @Override // defpackage.xoc
    public final void r(voc vocVar) {
        vocVar.b(false);
        vocVar.a(this.q);
        vocVar.c(this.r);
    }
}
