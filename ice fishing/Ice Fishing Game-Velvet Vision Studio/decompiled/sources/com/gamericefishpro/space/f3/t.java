package com.gamericefishpro.space.f3;

import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.gamericefishpro.space.h2.o1;
import com.gamericefishpro.space.i9.y3;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends com.gamericefishpro.space.h1.l implements com.gamericefishpro.space.m1.p, ViewTreeObserver.OnGlobalFocusChangeListener {
    public ViewTreeObserver H;
    public final s I = new s(this, 0);
    public final s J = new s(this, 1);

    public final com.gamericefishpro.space.m1.u A0() {
        if (!this.d.G) {
            com.gamericefishpro.space.e2.a.b("visitLocalDescendants called on an unattached node");
        }
        com.gamericefishpro.space.h1.l lVar = this.d;
        if ((lVar.v & 1024) != 0) {
            boolean z = false;
            for (com.gamericefishpro.space.h1.l lVar2 = lVar.y; lVar2 != null; lVar2 = lVar2.y) {
                if ((lVar2.i & 1024) != 0) {
                    com.gamericefishpro.space.h1.l lVarE = lVar2;
                    com.gamericefishpro.space.v0.e eVar = null;
                    while (lVarE != null) {
                        if (lVarE instanceof com.gamericefishpro.space.m1.u) {
                            com.gamericefishpro.space.m1.u uVar = (com.gamericefishpro.space.m1.u) lVarE;
                            if (z) {
                                return uVar;
                            }
                            z = true;
                        } else if ((lVarE.i & 1024) != 0 && (lVarE instanceof com.gamericefishpro.space.h2.j)) {
                            int i = 0;
                            for (com.gamericefishpro.space.h1.l lVar3 = ((com.gamericefishpro.space.h2.j) lVarE).I; lVar3 != null; lVar3 = lVar3.y) {
                                if ((lVar3.i & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        lVarE = lVar3;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                        }
                                        if (lVarE != null) {
                                            eVar.b(lVarE);
                                            lVarE = null;
                                        }
                                        eVar.b(lVar3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        lVarE = com.gamericefishpro.space.h2.k.e(eVar);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @Override // com.gamericefishpro.space.m1.p
    public final void o(com.gamericefishpro.space.m1.m mVar) {
        mVar.c(false);
        mVar.d(this.I);
        mVar.e(this.J);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z;
        boolean z2;
        if (com.gamericefishpro.space.h2.k.s(this).H == null) {
            return;
        }
        View viewC = k.c(this);
        com.gamericefishpro.space.m1.h focusOwner = ((com.gamericefishpro.space.i2.t) com.gamericefishpro.space.h2.k.t(this)).getFocusOwner();
        o1 o1VarT = com.gamericefishpro.space.h2.k.t(this);
        if (view != null && !view.equals(o1VarT)) {
            ViewParent parent = view.getParent();
            while (true) {
                if (parent == null) {
                    z = false;
                    break;
                } else {
                    if (parent == viewC.getParent()) {
                        z = true;
                        break;
                    }
                    parent = parent.getParent();
                }
            }
        } else {
            z = false;
            break;
        }
        if (view2 != null && !view2.equals(o1VarT)) {
            ViewParent parent2 = view2.getParent();
            while (true) {
                if (parent2 == null) {
                    z2 = false;
                    break;
                } else {
                    if (parent2 == viewC.getParent()) {
                        z2 = true;
                        break;
                    }
                    parent2 = parent2.getParent();
                }
            }
        } else {
            z2 = false;
            break;
        }
        if (z && z2) {
            return;
        }
        if (!z2) {
            if (z && A0().F0().a()) {
                ((com.gamericefishpro.space.m1.k) focusOwner).b(8, false, false);
                return;
            }
            return;
        }
        com.gamericefishpro.space.m1.u uVarA0 = A0();
        int iOrdinal = uVarA0.F0().ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return;
        }
        if (iOrdinal != 3) {
            throw new com.gamericefishpro.space.oh.k();
        }
        y3.F(uVarA0);
    }

    @Override // com.gamericefishpro.space.h1.l
    public final void s0() {
        ViewTreeObserver viewTreeObserver = com.gamericefishpro.space.h2.k.u(this).getViewTreeObserver();
        this.H = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // com.gamericefishpro.space.h1.l
    public final void t0() {
        ViewTreeObserver viewTreeObserver = this.H;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.H = null;
        com.gamericefishpro.space.h2.k.u(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }
}
