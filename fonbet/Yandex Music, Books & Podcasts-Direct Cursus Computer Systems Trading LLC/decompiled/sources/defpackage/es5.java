package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class es5 {
    public static final agr a = new agr(na5.u);
    public static final agr b = new agr(na5.w);
    public static final agr c = new agr(na5.y);
    public static final agr d = new agr(na5.x);
    public static final agr e = new agr(na5.A);
    public static final agr f = new agr(na5.z);
    public static final agr g = new agr(na5.J);
    public static final agr h = new agr(na5.E);
    public static final agr i = new agr(na5.F);
    public static final agr j = new agr(na5.H);
    public static final agr k = new agr(na5.G);
    public static final agr l = new agr(na5.K);
    public static final agr m = new agr(na5.L);
    public static final agr n = new agr(na5.X);
    public static final agr o = new agr(na5.y0);
    public static final agr p = new agr(na5.w0);
    public static final agr q = new agr(na5.z0);
    public static final agr r = new agr(na5.A0);
    public static final agr s = new agr(na5.B0);
    public static final agr t = new agr(bs5.s);
    public static final agr u = new agr(na5.Y);
    public static final qs5 v = new qs5(na5.Z);
    public static final agr w = new agr(na5.D);

    public static final void a(uzj uzjVar, ej0 ej0Var, Function2 function2, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(874662829);
        int i3 = i2 | (oq5Var.f(uzjVar) ? 4 : 2) | (oq5Var.f(ej0Var) ? 32 : 16) | (oq5Var.h(function2) ? 256 : 128);
        if (oq5Var.P(i3 & 1, (i3 & 147) != 146)) {
            qzm a2 = a.a(uzjVar.getAccessibilityManager());
            qzm a3 = b.a(uzjVar.getAutofill());
            qzm a4 = d.a(uzjVar.getAutofillManager());
            qzm a5 = c.a(uzjVar.getAutofillTree());
            qzm a6 = e.a(uzjVar.getClipboardManager());
            qzm a7 = f.a(uzjVar.getClipboard());
            qzm a8 = h.a(uzjVar.getDensity());
            qzm a9 = i.a(uzjVar.getFocusOwner());
            qzm a10 = j.a(uzjVar.getFontLoader());
            a10.f = false;
            qzm a11 = k.a(uzjVar.getFontFamilyResolver());
            a11.f = false;
            etn.m(new qzm[]{a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, l.a(uzjVar.getHapticFeedBack()), m.a(uzjVar.getInputModeManager()), n.a(uzjVar.getLayoutDirection()), o.a(uzjVar.getTextInputService()), p.a(uzjVar.getSoftwareKeyboardController()), q.a(uzjVar.getTextToolbar()), r.a(ej0Var), s.a(uzjVar.getViewConfiguration()), t.a(uzjVar.getWindowInfo()), u.a(uzjVar.getPointerIconService()), g.a(uzjVar.getGraphicsContext())}, function2, oq5Var, ((i3 >> 3) & 112) | 8);
        } else {
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new lf0(uzjVar, ej0Var, function2, i2, 2);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
