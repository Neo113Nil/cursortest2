package com.gamericefishpro.space.i2;

import com.gamericefishpro.space.t0.t2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b1 {
    public static final t2 a = new t2(g0.A);
    public static final t2 b = new t2(g0.B);
    public static final t2 c = new t2(g0.D);
    public static final t2 d = new t2(g0.C);
    public static final t2 e = new t2(g0.F);
    public static final t2 f = new t2(g0.E);
    public static final t2 g = new t2(g0.L);
    public static final t2 h = new t2(g0.H);
    public static final t2 i = new t2(g0.I);
    public static final t2 j = new t2(g0.K);
    public static final t2 k = new t2(g0.J);
    public static final t2 l = new t2(g0.M);
    public static final t2 m = new t2(g0.N);
    public static final t2 n = new t2(g0.O);
    public static final t2 o = new t2(g0.S);
    public static final t2 p = new t2(g0.R);
    public static final t2 q = new t2(g0.T);
    public static final t2 r = new t2(g0.U);
    public static final t2 s = new t2(g0.V);
    public static final t2 t = new t2(g0.W);
    public static final t2 u = new t2(g0.P);
    public static final com.gamericefishpro.space.t0.a0 v = new com.gamericefishpro.space.t0.a0(g0.Q);

    static {
        com.gamericefishpro.space.oh.i.b(g0.G);
    }

    public static final void a(com.gamericefishpro.space.h2.o1 o1Var, o0 o0Var, Function2 function2, com.gamericefishpro.space.t0.r rVar, int i2) {
        rVar.b0(1925803616);
        int i3 = (rVar.f(o1Var) ? 4 : 2) | i2 | (rVar.f(o0Var) ? 32 : 16) | (rVar.h(function2) ? 256 : 128);
        if (rVar.S(i3 & 1, (i3 & 147) != 146)) {
            t tVar = (t) o1Var;
            com.gamericefishpro.space.n.p pVarA = a.a(tVar.getAccessibilityManager());
            com.gamericefishpro.space.n.p pVarA2 = b.a(tVar.getAutofill());
            com.gamericefishpro.space.n.p pVarA3 = d.a(tVar.getAutofillManager());
            com.gamericefishpro.space.n.p pVarA4 = c.a(tVar.getAutofillTree());
            com.gamericefishpro.space.n.p pVarA5 = e.a(tVar.m7getClipboardManager());
            com.gamericefishpro.space.n.p pVarA6 = f.a(tVar.m6getClipboard());
            com.gamericefishpro.space.n.p pVarA7 = h.a(tVar.getDensity());
            com.gamericefishpro.space.n.p pVarA8 = i.a(tVar.getFocusOwner());
            com.gamericefishpro.space.n.p pVarA9 = j.a(tVar.getFontLoader());
            pVarA9.c = false;
            com.gamericefishpro.space.n.p pVarA10 = k.a(tVar.getFontFamilyResolver());
            pVarA10.c = false;
            com.gamericefishpro.space.t0.i.b(new com.gamericefishpro.space.n.p[]{pVarA, pVarA2, pVarA3, pVarA4, pVarA5, pVarA6, pVarA7, pVarA8, pVarA9, pVarA10, l.a(tVar.getHapticFeedBack()), m.a(tVar.getInputModeManager()), n.a(tVar.getLayoutDirection()), o.a(tVar.getTextInputService()), p.a(tVar.getSoftwareKeyboardController()), q.a(tVar.getTextToolbar()), r.a(o0Var), s.a(tVar.getViewConfiguration()), t.a(tVar.getWindowInfo()), u.a(tVar.getPointerIconService()), g.a(tVar.getGraphicsContext()), com.gamericefishpro.space.c1.b.a.a(tVar.getRetainedValuesStore())}, function2, rVar, ((i3 >> 3) & 112) | 8);
        } else {
            rVar.V();
        }
        com.gamericefishpro.space.t0.p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.f3.l(o1Var, o0Var, function2, i2);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
