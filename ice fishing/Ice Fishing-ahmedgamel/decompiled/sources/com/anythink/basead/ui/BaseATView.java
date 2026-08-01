package com.anythink.basead.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.anythink.basead.b;
import com.anythink.basead.b.c;
import com.anythink.basead.g.j;
import com.anythink.basead.j.e;
import com.anythink.basead.ui.component.CTAButtonLayout;
import com.anythink.basead.ui.guidetoclickv2.d;
import com.anythink.basead.ui.improveclick.c;
import com.anythink.basead.ui.improveclick.g;
import com.anythink.core.api.IExHandlerBaseAd;
import com.anythink.core.api.IOfferClickHandler;
import com.anythink.core.common.h.ay;
import com.anythink.core.common.h.bj;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.a.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public abstract class BaseATView extends RelativeLayout implements com.anythink.basead.ui.guidetoclickv2.c {

    /* renamed from: a, reason: collision with root package name */
    private IExHandlerBaseAd.DataFetchListener f9733a;

    /* renamed from: e, reason: collision with root package name */
    String f9734e;

    /* renamed from: f, reason: collision with root package name */
    protected x f9735f;

    /* renamed from: g, reason: collision with root package name */
    protected w f9736g;

    /* renamed from: h, reason: collision with root package name */
    com.anythink.core.common.v.a.c f9737h;
    com.anythink.basead.b.c i;

    /* renamed from: j, reason: collision with root package name */
    volatile boolean f9738j;

    /* renamed from: k, reason: collision with root package name */
    volatile boolean f9739k;

    /* renamed from: l, reason: collision with root package name */
    protected boolean f9740l;

    /* renamed from: m, reason: collision with root package name */
    String f9741m;

    /* renamed from: n, reason: collision with root package name */
    protected List<View> f9742n;

    /* renamed from: o, reason: collision with root package name */
    View f9743o;

    /* renamed from: p, reason: collision with root package name */
    protected boolean f9744p;

    /* renamed from: q, reason: collision with root package name */
    protected View f9745q;

    /* renamed from: r, reason: collision with root package name */
    protected com.anythink.basead.ui.component.a f9746r;

    /* renamed from: s, reason: collision with root package name */
    protected com.anythink.basead.ui.improveclick.a f9747s;

    /* renamed from: t, reason: collision with root package name */
    d f9748t;

    /* renamed from: u, reason: collision with root package name */
    protected com.anythink.basead.ui.f.c f9749u;

    /* renamed from: v, reason: collision with root package name */
    protected long f9750v;

    /* renamed from: w, reason: collision with root package name */
    protected long f9751w;

    /* renamed from: x, reason: collision with root package name */
    protected boolean f9752x;

    /* renamed from: y, reason: collision with root package name */
    protected boolean f9753y;

    /* renamed from: z, reason: collision with root package name */
    protected e f9754z;

    /* renamed from: com.anythink.basead.ui.BaseATView$4, reason: invalid class name */
    public class AnonymousClass4 extends b.a {
        public AnonymousClass4(w wVar) {
            super(wVar);
        }

        @Override // com.anythink.core.api.IExHandlerBaseAd.DataFetchListener
        public final void onStatusChanged(String str) {
            View view = BaseATView.this.f9745q;
            if (view != null && (view instanceof CTAButtonLayout)) {
                ((CTAButtonLayout) view).setMajorCTAText(str);
            }
            if (BaseATView.this.f9747s != null) {
                HashMap hashMap = new HashMap();
                hashMap.put(g.a.f11173h, str);
                BaseATView.this.f9747s.a(hashMap);
            }
            BaseATView.this.a(121);
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseATView$5, reason: invalid class name */
    public class AnonymousClass5 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w f9762a;

        public AnonymousClass5(w wVar) {
            this.f9762a = wVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!(BaseATView.this.f9745q instanceof ScanningAnimButton) || this.f9762a.r() == null) {
                return;
            }
            ((ScanningAnimButton) BaseATView.this.f9745q).startAnimation(this.f9762a.r().aH());
        }
    }

    public static class a {

        /* renamed from: A, reason: collision with root package name */
        public static final int f9765A = 202;

        /* renamed from: B, reason: collision with root package name */
        public static final int f9766B = 203;

        /* renamed from: C, reason: collision with root package name */
        public static final int f9767C = 204;

        /* renamed from: D, reason: collision with root package name */
        public static final int f9768D = 205;

        /* renamed from: E, reason: collision with root package name */
        public static final int f9769E = 206;

        /* renamed from: F, reason: collision with root package name */
        public static final int f9770F = 207;

        /* renamed from: G, reason: collision with root package name */
        public static final int f9771G = 208;

        /* renamed from: H, reason: collision with root package name */
        public static final int f9772H = 209;

        /* renamed from: I, reason: collision with root package name */
        public static final int f9773I = 210;
        public static final int J = 211;

        /* renamed from: K, reason: collision with root package name */
        public static final int f9774K = 212;

        /* renamed from: L, reason: collision with root package name */
        public static final int f9775L = 301;

        /* renamed from: M, reason: collision with root package name */
        public static final int f9776M = 302;

        /* renamed from: N, reason: collision with root package name */
        public static final int f9777N = 303;

        /* renamed from: O, reason: collision with root package name */
        public static final int f9778O = 304;

        /* renamed from: P, reason: collision with root package name */
        public static final int f9779P = 305;

        /* renamed from: a, reason: collision with root package name */
        public static final int f9780a = 101;

        /* renamed from: b, reason: collision with root package name */
        public static final int f9781b = 102;

        /* renamed from: c, reason: collision with root package name */
        public static final int f9782c = 103;

        /* renamed from: d, reason: collision with root package name */
        public static final int f9783d = 104;

        /* renamed from: e, reason: collision with root package name */
        public static final int f9784e = 105;

        /* renamed from: f, reason: collision with root package name */
        public static final int f9785f = 106;

        /* renamed from: g, reason: collision with root package name */
        public static final int f9786g = 107;

        /* renamed from: h, reason: collision with root package name */
        public static final int f9787h = 108;
        public static final int i = 110;

        /* renamed from: j, reason: collision with root package name */
        public static final int f9788j = 111;

        /* renamed from: k, reason: collision with root package name */
        public static final int f9789k = 112;

        /* renamed from: l, reason: collision with root package name */
        public static final int f9790l = 113;

        /* renamed from: m, reason: collision with root package name */
        public static final int f9791m = 114;

        /* renamed from: n, reason: collision with root package name */
        public static final int f9792n = 115;

        /* renamed from: o, reason: collision with root package name */
        public static final int f9793o = 116;

        /* renamed from: p, reason: collision with root package name */
        public static final int f9794p = 117;

        /* renamed from: q, reason: collision with root package name */
        public static final int f9795q = 118;

        /* renamed from: r, reason: collision with root package name */
        public static final int f9796r = 119;

        /* renamed from: s, reason: collision with root package name */
        public static final int f9797s = 120;

        /* renamed from: t, reason: collision with root package name */
        public static final int f9798t = 121;

        /* renamed from: u, reason: collision with root package name */
        public static final int f9799u = 122;

        /* renamed from: v, reason: collision with root package name */
        public static final int f9800v = 123;

        /* renamed from: w, reason: collision with root package name */
        public static final int f9801w = 124;

        /* renamed from: x, reason: collision with root package name */
        public static final int f9802x = 125;

        /* renamed from: y, reason: collision with root package name */
        public static final int f9803y = 125;

        /* renamed from: z, reason: collision with root package name */
        public static final int f9804z = 201;
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final int f9805a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f9806b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f9807c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f9808d = 3;

        /* renamed from: e, reason: collision with root package name */
        public static final int f9809e = 4;

        /* renamed from: f, reason: collision with root package name */
        public static final int f9810f = 5;

        /* renamed from: g, reason: collision with root package name */
        public static final int f9811g = 6;

        /* renamed from: h, reason: collision with root package name */
        public static final int f9812h = 100;
    }

    public BaseATView(Context context, x xVar, w wVar, String str) {
        super(context);
        this.f9734e = "BaseATView";
        this.f9738j = false;
        this.f9739k = false;
        this.f9740l = false;
        this.f9744p = false;
        this.f9735f = xVar;
        this.f9736g = wVar;
        this.f9741m = str;
        this.f9742n = new ArrayList();
        this.f9749u = new com.anythink.basead.ui.f.c(this.f9736g);
        this.f9754z = new e(this.f9736g, this.f9735f);
        e();
        a();
        i();
        w wVar2 = this.f9736g;
        if (wVar2 != null && !wVar2.c()) {
            setFocusable(true);
            setClickable(true);
        }
        if (wVar != null && wVar.ae()) {
            this.f9733a = new AnonymousClass4(wVar);
            com.anythink.basead.b.a().addDataFetchListener(this.f9733a);
        }
        post(new AnonymousClass5(wVar));
    }

    private void b() {
        w wVar = this.f9736g;
        if (wVar instanceof ay) {
            com.anythink.basead.h.a.b.a(getContext()).a((ay) this.f9736g);
        } else if (wVar instanceof bj) {
            com.anythink.basead.f.f.c a9 = com.anythink.basead.f.f.c.a();
            Context context = getContext();
            x xVar = this.f9735f;
            a9.a(context, com.anythink.basead.f.f.c.a(xVar.f14156b, xVar.f14157c), this.f9736g, this.f9735f.f14168o);
        }
        w wVar2 = this.f9736g;
        if ((wVar2 instanceof bj) && this.f9735f.f14160f == 67) {
            if (((bj) wVar2).a(true, true)) {
                com.anythink.core.common.f.c.a(getContext()).a(this.f9736g.v(), 0, 1);
            }
            if (((bj) this.f9736g).a(false, true)) {
                com.anythink.core.common.f.b.a(getContext()).a(this.f9736g.w(), 0, 1);
            }
        }
    }

    private View c() {
        return this;
    }

    public abstract void a();

    public abstract void a(j jVar);

    public abstract void a(boolean z3);

    public boolean a(String str, IOfferClickHandler iOfferClickHandler) {
        return false;
    }

    public void destroy() {
        a(112);
        com.anythink.basead.b.c cVar = this.i;
        if (cVar != null) {
            cVar.d();
        }
        com.anythink.core.common.v.a.c cVar2 = this.f9737h;
        if (cVar2 != null) {
            cVar2.b();
        }
        if (this.f9733a != null) {
            com.anythink.basead.b.a().removeDataFetchListener(this.f9733a);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        com.anythink.basead.ui.f.c cVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            com.anythink.basead.ui.f.c cVar2 = this.f9749u;
            if (cVar2 != null) {
                cVar2.a((int) motionEvent.getRawX(), (int) motionEvent.getRawY(), (int) motionEvent.getX(), (int) motionEvent.getY());
            }
        } else if ((action == 1 || action == 3) && (cVar = this.f9749u) != null) {
            cVar.b((int) motionEvent.getRawX(), (int) motionEvent.getRawY(), (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void e() {
    }

    public abstract void f();

    public void g() {
    }

    public boolean getHasPerformClick() {
        return this.f9740l;
    }

    public void h() {
    }

    public void i() {
        this.f9747s = new com.anythink.basead.ui.improveclick.a(this, this.f9736g, this.f9735f, r(), s()) { // from class: com.anythink.basead.ui.BaseATView.1
            @Override // com.anythink.basead.ui.improveclick.a
            public final ViewGroup.LayoutParams a() {
                return BaseATView.this.q();
            }
        };
    }

    public boolean isShowingEndCardAfterVideoPlay() {
        return this.f9744p;
    }

    public final synchronized void j() {
        if (this.f9738j) {
            return;
        }
        this.f9738j = true;
        if (v()) {
            com.anythink.core.common.u.e.c(this.f9736g, this.f9735f, 3);
            u();
            this.f9739k = true;
            return;
        }
        w wVar = this.f9736g;
        if (wVar instanceof ay) {
            com.anythink.basead.h.a.b.a(getContext()).a((ay) this.f9736g);
        } else if (wVar instanceof bj) {
            com.anythink.basead.f.f.c a9 = com.anythink.basead.f.f.c.a();
            Context context = getContext();
            x xVar = this.f9735f;
            a9.a(context, com.anythink.basead.f.f.c.a(xVar.f14156b, xVar.f14157c), this.f9736g, this.f9735f.f14168o);
        }
        w wVar2 = this.f9736g;
        if ((wVar2 instanceof bj) && this.f9735f.f14160f == 67) {
            if (((bj) wVar2).a(true, true)) {
                com.anythink.core.common.f.c.a(getContext()).a(this.f9736g.v(), 0, 1);
            }
            if (((bj) this.f9736g).a(false, true)) {
                com.anythink.core.common.f.b.a(getContext()).a(this.f9736g.w(), 0, 1);
            }
        }
        a(114);
        com.anythink.basead.b.b.a(8, this.f9736g, l());
        f();
    }

    public final void k() {
        w wVar = this.f9736g;
        if ((wVar instanceof bj) && this.f9735f.f14160f == 67) {
            if (((bj) wVar).a(true, false)) {
                com.anythink.core.common.f.c.a(getContext()).a(this.f9736g.v(), 1, 0);
            }
            if (((bj) this.f9736g).a(false, false)) {
                com.anythink.core.common.f.b.a(getContext()).a(this.f9736g.w(), 1, 0);
            }
        }
    }

    public com.anythink.basead.d.j l() {
        com.anythink.basead.d.j jVar = new com.anythink.basead.d.j(this.f9735f, "");
        jVar.f6212g = getWidth();
        jVar.f6213h = getHeight();
        try {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            jVar.f6218n = iArr[0];
            jVar.f6219o = iArr[1];
        } catch (Throwable unused) {
        }
        jVar.f6220p = 100;
        x xVar = this.f9735f;
        if (xVar != null && xVar.f14163j == 2) {
            jVar.f6220p = f.b.a(this);
        }
        jVar.f6221q = this.f9750v;
        return jVar;
    }

    public final com.anythink.basead.d.a m() {
        com.anythink.basead.ui.f.c cVar = this.f9749u;
        if (cVar != null) {
            return cVar.a(13);
        }
        return null;
    }

    public boolean n() {
        return com.anythink.basead.b.e.a(this.f9735f);
    }

    public final boolean o() {
        return com.anythink.basead.b.e.b(this.f9736g);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f9750v == 0) {
            this.f9750v = System.currentTimeMillis();
            if (!this.f9754z.a()) {
                a(a.f9804z);
            }
        }
        a(116);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a(117);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        a(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (a(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean p() {
        return false;
    }

    public RelativeLayout.LayoutParams q() {
        return null;
    }

    public int r() {
        return 0;
    }

    public c.a s() {
        return new c.a() { // from class: com.anythink.basead.ui.BaseATView.6
            @Override // com.anythink.basead.ui.improveclick.c.a
            public final void a(int i, int i6) {
                BaseATView.this.a(i, i6);
            }
        };
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.c
    public void setCallback(d dVar) {
        synchronized (this) {
            this.f9748t = dVar;
        }
    }

    public void setHasPerformClick(boolean z3) {
        this.f9740l = z3;
    }

    public void setShowingEndCardAfterVideoPlay(boolean z3) {
        this.f9744p = z3;
    }

    public boolean t() {
        return true;
    }

    public void u() {
    }

    public final boolean v() {
        w wVar = this.f9736g;
        if (wVar instanceof bj) {
            return ((bj) wVar).ay();
        }
        return false;
    }

    public void a(int i, int i6) {
        this.f9740l = true;
        j();
        if (this.i == null) {
            this.i = new com.anythink.basead.b.c(getContext(), this.f9735f, this.f9736g, this);
        }
        if (this.i.a()) {
            return;
        }
        if (this.f9736g.ae() && i == 1 && ((i6 == 1 || i6 == 6) && this.f9736g.aa() == 4 && this.f9735f.f14168o.aO())) {
            com.anythink.basead.b.a().pause(this.f9736g);
            return;
        }
        if (i != 5 && i != 6 && i != 7) {
            int b9 = com.anythink.basead.ui.f.c.b(i, i6);
            if (b9 == 0 || b9 == 1) {
                this.f9753y = true;
            } else if (b9 == 2) {
                this.f9752x = true;
            }
        }
        if (this.f9744p) {
            if (i6 == 1) {
                i6 = 6;
            } else if (i6 == 2 || i6 == 3) {
                i6 = 7;
            } else if (i6 == 4) {
                i6 = 8;
            } else if (i6 == 5) {
                i6 = 9;
            }
        }
        final j a9 = new j().a(i, i6);
        this.i.a(new c.a() { // from class: com.anythink.basead.ui.BaseATView.2
            @Override // com.anythink.basead.b.c.a
            public final void a() {
                if (BaseATView.this.f9739k) {
                    return;
                }
                if (BaseATView.this.v()) {
                    w wVar = BaseATView.this.f9736g;
                    if (wVar == null || wVar.r() == null || BaseATView.this.f9736g.r().bN() != 2) {
                        BaseATView baseATView = BaseATView.this;
                        com.anythink.core.common.u.e.c(baseATView.f9736g, baseATView.f9735f, 1);
                        return;
                    } else {
                        BaseATView baseATView2 = BaseATView.this;
                        com.anythink.core.common.u.e.c(baseATView2.f9736g, baseATView2.f9735f, 2);
                    }
                }
                BaseATView.this.a(a9);
                BaseATView.this.k();
            }

            @Override // com.anythink.basead.b.c.a
            public final void b() {
                BaseATView.this.g();
            }

            @Override // com.anythink.basead.b.c.a
            public final void c() {
                BaseATView.this.h();
            }

            @Override // com.anythink.basead.b.c.a
            public final void a(boolean z3) {
                w wVar;
                if (BaseATView.this.f9739k) {
                    return;
                }
                if (!BaseATView.this.v() || (wVar = BaseATView.this.f9736g) == null || wVar.r() == null || BaseATView.this.f9736g.r().bN() == 2) {
                    BaseATView.this.a(z3);
                }
            }

            @Override // com.anythink.basead.b.c.a
            public final boolean a(String str, IOfferClickHandler iOfferClickHandler) {
                return BaseATView.this.a(str, iOfferClickHandler);
            }
        });
        com.anythink.basead.d.j l9 = l();
        com.anythink.basead.ui.f.c cVar = this.f9749u;
        if (cVar != null) {
            if (i != 1) {
                View view = this.f9743o;
                if (view != null) {
                    l9.i = cVar.a(view, i, i6);
                } else {
                    l9.i = cVar.a(this, i, i6);
                }
            } else {
                l9.i = cVar.a(0, i6);
            }
        }
        this.i.a(l9);
        if (this.f9747s != null) {
            HashMap hashMap = new HashMap();
            com.anythink.basead.exoplayer.f.f.y(i, hashMap, "click_type", i6, g.a.f11172g);
            this.f9747s.a(hashMap);
        }
        a(113);
    }

    private void b(View view) {
        this.f9743o = view;
    }

    private void b(w wVar) {
        post(new AnonymousClass5(wVar));
    }

    public BaseATView(Context context, x xVar, w wVar) {
        this(context, xVar, wVar, "");
    }

    public BaseATView(Context context) {
        super(context);
        this.f9734e = "BaseATView";
        this.f9738j = false;
        this.f9739k = false;
        this.f9740l = false;
        this.f9744p = false;
    }

    public void a(final int i, final Runnable runnable) {
        w wVar = this.f9736g;
        int bO = (wVar == null || wVar.r() == null) ? 1 : this.f9736g.r().bO();
        if (i > 0) {
            getContext();
            this.f9737h = new com.anythink.core.common.v.a.c(bO, i);
        } else {
            getContext();
            this.f9737h = new com.anythink.core.common.v.a.c(bO);
        }
        this.f9737h.a(this, new com.anythink.core.common.v.a.a() { // from class: com.anythink.basead.ui.BaseATView.3
            @Override // com.anythink.core.common.v.a.a, com.anythink.core.common.v.a.b
            public final int getImpressionMinTimeViewed() {
                int i6 = i;
                if (i6 > 0) {
                    return i6;
                }
                return 50;
            }

            @Override // com.anythink.core.common.v.a.a, com.anythink.core.common.v.a.b
            public final void recordImpression(View view) {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
    }

    public float a(com.anythink.basead.ui.b bVar, boolean z3) {
        return com.anythink.basead.ui.f.b.a(bVar, z3, this.f9735f, true);
    }

    public void a(int i) {
        if (i == 114) {
            this.f9751w = System.currentTimeMillis();
        }
        e eVar = this.f9754z;
        if (eVar != null) {
            eVar.a(i, this);
        }
        com.anythink.basead.ui.improveclick.a aVar = this.f9747s;
        if (aVar != null) {
            aVar.a(i);
        }
    }

    private boolean a(MotionEvent motionEvent) {
        synchronized (this) {
            try {
                d dVar = this.f9748t;
                if (dVar != null) {
                    if (dVar.a(motionEvent)) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
            return false;
        }
    }

    private void a(w wVar) {
        if (wVar == null || !wVar.ae()) {
            return;
        }
        this.f9733a = new AnonymousClass4(wVar);
        com.anythink.basead.b.a().addDataFetchListener(this.f9733a);
    }

    public final void a(View view) {
        if (this.f9754z == null || view == null || !(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            this.f9754z.b(viewGroup.getChildAt(i));
        }
    }
}
