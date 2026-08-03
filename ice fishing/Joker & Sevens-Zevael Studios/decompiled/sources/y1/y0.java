package y1;

import m0.x2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final x2 f8702a = new x2(f0.f8514n);

    /* renamed from: b, reason: collision with root package name */
    public static final x2 f8703b = new x2(f0.f8515o);

    /* renamed from: c, reason: collision with root package name */
    public static final x2 f8704c = new x2(f0.f8517q);

    /* renamed from: d, reason: collision with root package name */
    public static final x2 f8705d = new x2(f0.f8516p);

    /* renamed from: e, reason: collision with root package name */
    public static final x2 f8706e = new x2(f0.f8519s);

    /* renamed from: f, reason: collision with root package name */
    public static final x2 f8707f = new x2(f0.f8518r);

    /* renamed from: g, reason: collision with root package name */
    public static final x2 f8708g = new x2(f0.f8525y);

    /* renamed from: h, reason: collision with root package name */
    public static final x2 f8709h = new x2(f0.f8521u);

    /* renamed from: i, reason: collision with root package name */
    public static final x2 f8710i = new x2(f0.f8522v);

    /* renamed from: j, reason: collision with root package name */
    public static final x2 f8711j = new x2(f0.f8524x);

    /* renamed from: k, reason: collision with root package name */
    public static final x2 f8712k = new x2(f0.f8523w);

    /* renamed from: l, reason: collision with root package name */
    public static final x2 f8713l = new x2(f0.f8526z);

    /* renamed from: m, reason: collision with root package name */
    public static final x2 f8714m = new x2(f0.A);

    /* renamed from: n, reason: collision with root package name */
    public static final x2 f8715n = new x2(f0.B);

    /* renamed from: o, reason: collision with root package name */
    public static final x2 f8716o = new x2(f0.F);

    /* renamed from: p, reason: collision with root package name */
    public static final x2 f8717p = new x2(f0.E);

    /* renamed from: q, reason: collision with root package name */
    public static final x2 f8718q = new x2(f0.G);

    /* renamed from: r, reason: collision with root package name */
    public static final x2 f8719r = new x2(f0.H);

    /* renamed from: s, reason: collision with root package name */
    public static final x2 f8720s = new x2(f0.I);

    /* renamed from: t, reason: collision with root package name */
    public static final x2 f8721t = new x2(f0.J);

    /* renamed from: u, reason: collision with root package name */
    public static final x2 f8722u = new x2(f0.C);

    /* renamed from: v, reason: collision with root package name */
    public static final m0.e0 f8723v = new m0.e0(f0.D);

    static {
        bc.a0.y(f0.f8520t);
    }

    public static final void a(x1.m1 m1Var, l0 l0Var, oc.e eVar, m0.r rVar, int i10) {
        rVar.Z(1925803616);
        int i11 = i10 | (rVar.f(m1Var) ? 4 : 2) | (rVar.f(l0Var) ? 32 : 16) | (rVar.h(eVar) ? 256 : 128);
        if (rVar.P(i11 & 1, (i11 & 147) != 146)) {
            r rVar2 = (r) m1Var;
            m0.v1 a6 = f8702a.a(rVar2.getAccessibilityManager());
            m0.v1 a8 = f8703b.a(rVar2.getAutofill());
            m0.v1 a10 = f8705d.a(rVar2.getAutofillManager());
            m0.v1 a11 = f8704c.a(rVar2.getAutofillTree());
            m0.v1 a12 = f8706e.a(rVar2.m51getClipboardManager());
            m0.v1 a13 = f8707f.a(rVar2.m50getClipboard());
            m0.v1 a14 = f8709h.a(rVar2.getDensity());
            m0.v1 a15 = f8710i.a(rVar2.getFocusOwner());
            m0.v1 a16 = f8711j.a(rVar2.getFontLoader());
            a16.f4789f = false;
            m0.v1 a17 = f8712k.a(rVar2.getFontFamilyResolver());
            a17.f4789f = false;
            m0.z.b(new m0.v1[]{a6, a8, a10, a11, a12, a13, a14, a15, a16, a17, f8713l.a(rVar2.getHapticFeedBack()), f8714m.a(rVar2.getInputModeManager()), f8715n.a(rVar2.getLayoutDirection()), f8716o.a(rVar2.getTextInputService()), f8717p.a(rVar2.getSoftwareKeyboardController()), f8718q.a(rVar2.getTextToolbar()), f8719r.a(l0Var), f8720s.a(rVar2.getViewConfiguration()), f8721t.a(rVar2.getWindowInfo()), f8722u.a(rVar2.getPointerIconService()), f8708g.a(rVar2.getGraphicsContext())}, eVar, rVar, ((i11 >> 3) & 112) | 8);
        } else {
            rVar.S();
        }
        m0.x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new j5.e(m1Var, l0Var, eVar, i10, 6);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
