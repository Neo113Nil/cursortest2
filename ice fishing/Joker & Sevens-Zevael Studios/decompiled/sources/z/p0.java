package z;

import android.view.View;
import h3.a1;
import java.util.WeakHashMap;
import org.fortheloss.st.R;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: u, reason: collision with root package name */
    public static final WeakHashMap f9003u = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final a f9004a = b.c("captionBar", 4);

    /* renamed from: b, reason: collision with root package name */
    public final a f9005b;

    /* renamed from: c, reason: collision with root package name */
    public final a f9006c;

    /* renamed from: d, reason: collision with root package name */
    public final a f9007d;

    /* renamed from: e, reason: collision with root package name */
    public final a f9008e;

    /* renamed from: f, reason: collision with root package name */
    public final a f9009f;

    /* renamed from: g, reason: collision with root package name */
    public final a f9010g;

    /* renamed from: h, reason: collision with root package name */
    public final a f9011h;

    /* renamed from: i, reason: collision with root package name */
    public final a f9012i;

    /* renamed from: j, reason: collision with root package name */
    public final n0 f9013j;

    /* renamed from: k, reason: collision with root package name */
    public final n0 f9014k;

    /* renamed from: l, reason: collision with root package name */
    public final n0 f9015l;

    /* renamed from: m, reason: collision with root package name */
    public final n0 f9016m;

    /* renamed from: n, reason: collision with root package name */
    public final n0 f9017n;

    /* renamed from: o, reason: collision with root package name */
    public final n0 f9018o;

    /* renamed from: p, reason: collision with root package name */
    public final n0 f9019p;

    /* renamed from: q, reason: collision with root package name */
    public final n0 f9020q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f9021r;

    /* renamed from: s, reason: collision with root package name */
    public int f9022s;

    /* renamed from: t, reason: collision with root package name */
    public final w f9023t;

    public p0(View view) {
        a c3 = b.c("displayCutout", 128);
        this.f9005b = c3;
        a c7 = b.c("ime", 8);
        this.f9006c = c7;
        a c10 = b.c("mandatorySystemGestures", 32);
        this.f9007d = c10;
        this.f9008e = b.c("navigationBars", 2);
        this.f9009f = b.c("statusBars", 1);
        a c11 = b.c("systemBars", 519);
        this.f9010g = c11;
        a c12 = b.c("systemGestures", 16);
        this.f9011h = c12;
        a c13 = b.c("tappableElement", 64);
        this.f9012i = c13;
        n0 n0Var = new n0(new y(0, 0, 0, 0), "waterfall");
        this.f9013j = n0Var;
        new l0(new l0(c11, c7), c3);
        new l0(new l0(new l0(c13, c10), c12), n0Var);
        this.f9014k = b.d("captionBarIgnoringVisibility", 4);
        this.f9015l = b.d("navigationBarsIgnoringVisibility", 2);
        this.f9016m = b.d("statusBarsIgnoringVisibility", 1);
        this.f9017n = b.d("systemBarsIgnoringVisibility", 519);
        this.f9018o = b.d("tappableElementIgnoringVisibility", 64);
        this.f9019p = b.d("imeAnimationTarget", 8);
        this.f9020q = b.d("imeAnimationSource", 8);
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f9021r = bool != null ? bool.booleanValue() : true;
        this.f9023t = new w(this);
    }

    public static void a(p0 p0Var, a1 a1Var) {
        boolean z10 = false;
        p0Var.f9004a.f(a1Var, 0);
        p0Var.f9006c.f(a1Var, 0);
        p0Var.f9005b.f(a1Var, 0);
        p0Var.f9008e.f(a1Var, 0);
        p0Var.f9009f.f(a1Var, 0);
        p0Var.f9010g.f(a1Var, 0);
        p0Var.f9011h.f(a1Var, 0);
        p0Var.f9012i.f(a1Var, 0);
        p0Var.f9007d.f(a1Var, 0);
        p0Var.f9014k.f(u5.d.k(a1Var.f2745a.g(4)));
        p0Var.f9015l.f(u5.d.k(a1Var.f2745a.g(2)));
        p0Var.f9016m.f(u5.d.k(a1Var.f2745a.g(1)));
        p0Var.f9017n.f(u5.d.k(a1Var.f2745a.g(519)));
        p0Var.f9018o.f(u5.d.k(a1Var.f2745a.g(64)));
        h3.d e10 = a1Var.f2745a.e();
        if (e10 != null) {
            p0Var.f9013j.f(u5.d.k(e10.a()));
        }
        synchronized (w0.m.f7580c) {
            s.h0 h0Var = w0.m.f7587j.f7547h;
            if (h0Var != null) {
                if (h0Var.h()) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            w0.m.a();
        }
    }
}
