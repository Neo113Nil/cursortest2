package com.gamericefishpro.space.i2;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.gamericefishpro.space.i9.a4;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends com.gamericefishpro.space.h1.l implements com.gamericefishpro.space.l2.a, com.gamericefishpro.space.h2.x1, com.gamericefishpro.space.z1.b, com.gamericefishpro.space.h2.v, com.gamericefishpro.space.h2.c2, com.gamericefishpro.space.h2.i {
    public final com.gamericefishpro.space.b2.d0 H = new com.gamericefishpro.space.b2.d0(6, this);
    public final /* synthetic */ t I;

    public k(t tVar) {
        this.I = tVar;
    }

    @Override // com.gamericefishpro.space.l2.a
    public final Object B(com.gamericefishpro.space.h2.f1 f1Var, com.gamericefishpro.space.b2.b bVar, com.gamericefishpro.space.vh.i iVar) {
        long jH = f1Var.H(0L);
        com.gamericefishpro.space.n1.c cVar = (com.gamericefishpro.space.n1.c) bVar.invoke();
        com.gamericefishpro.space.n1.c cVarE = cVar != null ? cVar.e(jH) : null;
        if (cVarE != null) {
            this.I.requestRectangleOnScreen(new Rect((int) cVarE.a, (int) cVarE.b, (int) cVarE.c, (int) cVarE.d), false);
        }
        return Unit.a;
    }

    @Override // com.gamericefishpro.space.h2.v
    public final com.gamericefishpro.space.f2.m0 F(com.gamericefishpro.space.f2.n0 n0Var, com.gamericefishpro.space.f2.k0 k0Var, long j) {
        com.gamericefishpro.space.f2.u0 u0VarE = k0Var.e(j);
        return n0Var.G(u0VarE.d, u0VarE.e, com.gamericefishpro.space.ph.m0.c(), this.H, new com.gamericefishpro.space.f2.x0(u0VarE, 1));
    }

    @Override // com.gamericefishpro.space.z1.b
    public final boolean P(KeyEvent keyEvent) {
        com.gamericefishpro.space.m1.c cVar;
        int[] iArr = com.gamericefishpro.space.m1.d.a;
        long jH = com.gamericefishpro.space.i.a.h(keyEvent.getKeyCode());
        boolean z = true;
        if (com.gamericefishpro.space.z1.a.a(jH, com.gamericefishpro.space.z1.a.b)) {
            cVar = new com.gamericefishpro.space.m1.c(2);
        } else if (com.gamericefishpro.space.z1.a.a(jH, com.gamericefishpro.space.z1.a.c)) {
            cVar = new com.gamericefishpro.space.m1.c(1);
        } else if (com.gamericefishpro.space.z1.a.a(jH, com.gamericefishpro.space.z1.a.i)) {
            cVar = new com.gamericefishpro.space.m1.c(keyEvent.isShiftPressed() ? 2 : 1);
        } else if (com.gamericefishpro.space.z1.a.a(jH, com.gamericefishpro.space.z1.a.g)) {
            cVar = new com.gamericefishpro.space.m1.c(4);
        } else if (com.gamericefishpro.space.z1.a.a(jH, com.gamericefishpro.space.z1.a.f)) {
            cVar = new com.gamericefishpro.space.m1.c(3);
        } else if (com.gamericefishpro.space.z1.a.a(jH, com.gamericefishpro.space.z1.a.d) || com.gamericefishpro.space.z1.a.a(jH, com.gamericefishpro.space.z1.a.m)) {
            cVar = new com.gamericefishpro.space.m1.c(5);
        } else if (com.gamericefishpro.space.z1.a.a(jH, com.gamericefishpro.space.z1.a.e) || com.gamericefishpro.space.z1.a.a(jH, com.gamericefishpro.space.z1.a.n)) {
            cVar = new com.gamericefishpro.space.m1.c(6);
        } else if (com.gamericefishpro.space.z1.a.a(jH, com.gamericefishpro.space.z1.a.h) || com.gamericefishpro.space.z1.a.a(jH, com.gamericefishpro.space.z1.a.k) || com.gamericefishpro.space.z1.a.a(jH, com.gamericefishpro.space.z1.a.o)) {
            cVar = new com.gamericefishpro.space.m1.c(7);
        } else {
            cVar = (com.gamericefishpro.space.z1.a.a(jH, com.gamericefishpro.space.z1.a.a) || com.gamericefishpro.space.z1.a.a(jH, com.gamericefishpro.space.z1.a.l)) ? new com.gamericefishpro.space.m1.c(8) : null;
        }
        if (cVar != null) {
            int i = cVar.a;
            if (a4.D(keyEvent) == 2) {
                t tVar = this.I;
                com.gamericefishpro.space.m1.u uVarF = ((com.gamericefishpro.space.m1.k) tVar.getFocusOwner()).f();
                if (uVarF == null || !uVarF.H || !tVar.w(i)) {
                    Boolean boolE = ((com.gamericefishpro.space.m1.k) tVar.getFocusOwner()).e(i, tVar.getEmbeddedViewFocusRect(), new com.gamericefishpro.space.b2.d0(5, cVar));
                    if (!(boolE != null ? boolE.booleanValue() : true)) {
                        if (i != 1 && i != 2) {
                            z = false;
                        }
                        if (z) {
                            Integer numC = com.gamericefishpro.space.m1.d.c(i);
                            int iIntValue = numC != null ? numC.intValue() : 2;
                            FocusFinder focusFinder = FocusFinder.getInstance();
                            View rootView = tVar.getRootView();
                            Intrinsics.c(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                            View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, tVar.getView(), iIntValue);
                            if (viewFindNextFocus == null || viewFindNextFocus.equals(tVar)) {
                                return ((com.gamericefishpro.space.m1.k) tVar.getFocusOwner()).g(i);
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.gamericefishpro.space.h2.c2
    public final Object i() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // com.gamericefishpro.space.h2.x1
    public final void L(com.gamericefishpro.space.o2.w wVar) {
    }
}
