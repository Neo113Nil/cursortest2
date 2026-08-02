package defpackage;

import android.os.Build;
import android.view.View;
import java.util.WeakHashMap;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class rqv {
    public static final WeakHashMap w = new WeakHashMap();
    public final yj0 a = z7l.e(4, "captionBar");
    public final yj0 b;
    public final yj0 c;
    public final yj0 d;
    public final yj0 e;
    public final yj0 f;
    public final yj0 g;
    public final yj0 h;
    public final yj0 i;
    public final wwt j;
    public final tit k;
    public final tit l;
    public final wwt m;
    public final wwt n;
    public final wwt o;
    public final wwt p;
    public final wwt q;
    public final wwt r;
    public final wwt s;
    public final boolean t;
    public int u;
    public final boe v;

    public rqv(View view) {
        yj0 e = z7l.e(128, "displayCutout");
        this.b = e;
        yj0 e2 = z7l.e(8, "ime");
        this.c = e2;
        yj0 e3 = z7l.e(32, "mandatorySystemGestures");
        this.d = e3;
        this.e = z7l.e(2, "navigationBars");
        this.f = z7l.e(1, "statusBars");
        yj0 e4 = z7l.e(519, "systemBars");
        this.g = e4;
        yj0 e5 = z7l.e(16, "systemGestures");
        this.h = e5;
        yj0 e6 = z7l.e(64, "tappableElement");
        this.i = e6;
        wwt wwtVar = new wwt(new ioe(0, 0, 0, 0), "waterfall");
        this.j = wwtVar;
        tit titVar = new tit(new tit(e4, e2), e);
        this.k = titVar;
        this.l = new tit(titVar, new tit(new tit(new tit(e6, e3), e5), wwtVar));
        this.m = z7l.g(4, "captionBarIgnoringVisibility");
        this.n = z7l.g(2, "navigationBarsIgnoringVisibility");
        this.o = z7l.g(1, "statusBarsIgnoringVisibility");
        this.p = z7l.g(519, "systemBarsIgnoringVisibility");
        this.q = z7l.g(64, "tappableElementIgnoringVisibility");
        this.r = z7l.g(8, "imeAnimationTarget");
        this.s = z7l.g(8, "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.t = bool != null ? bool.booleanValue() : true;
        this.v = new boe(this);
    }

    public static void a(rqv rqvVar, kqv kqvVar) {
        boolean z = false;
        rqvVar.a.f(kqvVar, 0);
        rqvVar.c.f(kqvVar, 0);
        rqvVar.b.f(kqvVar, 0);
        rqvVar.e.f(kqvVar, 0);
        rqvVar.f.f(kqvVar, 0);
        rqvVar.g.f(kqvVar, 0);
        rqvVar.h.f(kqvVar, 0);
        rqvVar.i.f(kqvVar, 0);
        rqvVar.d.f(kqvVar, 0);
        rqvVar.m.f(t7g.I(kqvVar.a.h(4)));
        rqvVar.n.f(t7g.I(kqvVar.a.h(2)));
        rqvVar.o.f(t7g.I(kqvVar.a.h(1)));
        rqvVar.p.f(t7g.I(kqvVar.a.h(519)));
        rqvVar.q.f(t7g.I(kqvVar.a.h(64)));
        ea8 f = kqvVar.a.f();
        if (f != null) {
            rqvVar.j.f(t7g.I(Build.VERSION.SDK_INT >= 30 ? zne.d(qdq.w(f.a)) : zne.e));
        }
        synchronized (g2r.b) {
            upi upiVar = g2r.i.h;
            if (upiVar != null) {
                if (upiVar.i()) {
                    z = true;
                }
            }
        }
        if (z) {
            g2r.a();
        }
    }
}
