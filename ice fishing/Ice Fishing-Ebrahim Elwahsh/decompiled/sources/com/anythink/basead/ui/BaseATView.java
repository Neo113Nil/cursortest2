package com.anythink.basead.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.anythink.basead.b;
import com.anythink.basead.b.c;
import com.anythink.basead.b.c.i;
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
    private IExHandlerBaseAd.DataFetchListener f9890a;

    /* renamed from: e, reason: collision with root package name */
    String f9891e;

    /* renamed from: f, reason: collision with root package name */
    protected x f9892f;

    /* renamed from: g, reason: collision with root package name */
    protected w f9893g;

    /* renamed from: h, reason: collision with root package name */
    com.anythink.core.common.v.a.c f9894h;
    com.anythink.basead.b.c i;

    /* renamed from: j, reason: collision with root package name */
    volatile boolean f9895j;

    /* renamed from: k, reason: collision with root package name */
    volatile boolean f9896k;

    /* renamed from: l, reason: collision with root package name */
    protected boolean f9897l;

    /* renamed from: m, reason: collision with root package name */
    String f9898m;

    /* renamed from: n, reason: collision with root package name */
    protected List<View> f9899n;

    /* renamed from: o, reason: collision with root package name */
    View f9900o;

    /* renamed from: p, reason: collision with root package name */
    protected boolean f9901p;

    /* renamed from: q, reason: collision with root package name */
    protected View f9902q;

    /* renamed from: r, reason: collision with root package name */
    protected com.anythink.basead.ui.component.a f9903r;

    /* renamed from: s, reason: collision with root package name */
    protected com.anythink.basead.ui.improveclick.a f9904s;

    /* renamed from: t, reason: collision with root package name */
    d f9905t;

    /* renamed from: u, reason: collision with root package name */
    protected com.anythink.basead.ui.f.c f9906u;

    /* renamed from: v, reason: collision with root package name */
    protected long f9907v;

    /* renamed from: w, reason: collision with root package name */
    protected long f9908w;

    /* renamed from: x, reason: collision with root package name */
    protected boolean f9909x;

    /* renamed from: y, reason: collision with root package name */
    protected boolean f9910y;

    /* renamed from: z, reason: collision with root package name */
    protected e f9911z;

    /* renamed from: com.anythink.basead.ui.BaseATView$4, reason: invalid class name */
    public class AnonymousClass4 extends b.a {
        public AnonymousClass4(w wVar) {
            super(wVar);
        }

        @Override // com.anythink.core.api.IExHandlerBaseAd.DataFetchListener
        public final void onStatusChanged(String str) {
            View view = BaseATView.this.f9902q;
            if (view != null && (view instanceof CTAButtonLayout)) {
                ((CTAButtonLayout) view).setMajorCTAText(str);
            }
            if (BaseATView.this.f9904s != null) {
                HashMap hashMap = new HashMap();
                hashMap.put(g.a.f11330h, str);
                BaseATView.this.f9904s.a(hashMap);
            }
            BaseATView.this.a(121);
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseATView$5, reason: invalid class name */
    public class AnonymousClass5 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w f9919a;

        public AnonymousClass5(w wVar) {
            this.f9919a = wVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!(BaseATView.this.f9902q instanceof ScanningAnimButton) || this.f9919a.r() == null) {
                return;
            }
            ((ScanningAnimButton) BaseATView.this.f9902q).startAnimation(this.f9919a.r().aH());
        }
    }

    public static class a {

        /* renamed from: A, reason: collision with root package name */
        public static final int f9922A = 202;

        /* renamed from: B, reason: collision with root package name */
        public static final int f9923B = 203;

        /* renamed from: C, reason: collision with root package name */
        public static final int f9924C = 204;

        /* renamed from: D, reason: collision with root package name */
        public static final int f9925D = 205;

        /* renamed from: E, reason: collision with root package name */
        public static final int f9926E = 206;

        /* renamed from: F, reason: collision with root package name */
        public static final int f9927F = 207;

        /* renamed from: G, reason: collision with root package name */
        public static final int f9928G = 208;

        /* renamed from: H, reason: collision with root package name */
        public static final int f9929H = 209;

        /* renamed from: I, reason: collision with root package name */
        public static final int f9930I = 210;
        public static final int J = 211;

        /* renamed from: K, reason: collision with root package name */
        public static final int f9931K = 212;

        /* renamed from: L, reason: collision with root package name */
        public static final int f9932L = 301;

        /* renamed from: M, reason: collision with root package name */
        public static final int f9933M = 302;

        /* renamed from: N, reason: collision with root package name */
        public static final int f9934N = 303;

        /* renamed from: O, reason: collision with root package name */
        public static final int f9935O = 304;

        /* renamed from: P, reason: collision with root package name */
        public static final int f9936P = 305;

        /* renamed from: a, reason: collision with root package name */
        public static final int f9937a = 101;

        /* renamed from: b, reason: collision with root package name */
        public static final int f9938b = 102;

        /* renamed from: c, reason: collision with root package name */
        public static final int f9939c = 103;

        /* renamed from: d, reason: collision with root package name */
        public static final int f9940d = 104;

        /* renamed from: e, reason: collision with root package name */
        public static final int f9941e = 105;

        /* renamed from: f, reason: collision with root package name */
        public static final int f9942f = 106;

        /* renamed from: g, reason: collision with root package name */
        public static final int f9943g = 107;

        /* renamed from: h, reason: collision with root package name */
        public static final int f9944h = 108;
        public static final int i = 110;

        /* renamed from: j, reason: collision with root package name */
        public static final int f9945j = 111;

        /* renamed from: k, reason: collision with root package name */
        public static final int f9946k = 112;

        /* renamed from: l, reason: collision with root package name */
        public static final int f9947l = 113;

        /* renamed from: m, reason: collision with root package name */
        public static final int f9948m = 114;

        /* renamed from: n, reason: collision with root package name */
        public static final int f9949n = 115;

        /* renamed from: o, reason: collision with root package name */
        public static final int f9950o = 116;

        /* renamed from: p, reason: collision with root package name */
        public static final int f9951p = 117;

        /* renamed from: q, reason: collision with root package name */
        public static final int f9952q = 118;

        /* renamed from: r, reason: collision with root package name */
        public static final int f9953r = 119;

        /* renamed from: s, reason: collision with root package name */
        public static final int f9954s = 120;

        /* renamed from: t, reason: collision with root package name */
        public static final int f9955t = 121;

        /* renamed from: u, reason: collision with root package name */
        public static final int f9956u = 122;

        /* renamed from: v, reason: collision with root package name */
        public static final int f9957v = 123;

        /* renamed from: w, reason: collision with root package name */
        public static final int f9958w = 124;

        /* renamed from: x, reason: collision with root package name */
        public static final int f9959x = 125;

        /* renamed from: y, reason: collision with root package name */
        public static final int f9960y = 125;

        /* renamed from: z, reason: collision with root package name */
        public static final int f9961z = 201;
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final int f9962a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f9963b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f9964c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f9965d = 3;

        /* renamed from: e, reason: collision with root package name */
        public static final int f9966e = 4;

        /* renamed from: f, reason: collision with root package name */
        public static final int f9967f = 5;

        /* renamed from: g, reason: collision with root package name */
        public static final int f9968g = 6;

        /* renamed from: h, reason: collision with root package name */
        public static final int f9969h = 100;
    }

    public BaseATView(Context context, x xVar, w wVar, String str) {
        super(context);
        this.f9891e = "BaseATView";
        this.f9895j = false;
        this.f9896k = false;
        this.f9897l = false;
        this.f9901p = false;
        this.f9892f = xVar;
        this.f9893g = wVar;
        this.f9898m = str;
        this.f9899n = new ArrayList();
        this.f9906u = new com.anythink.basead.ui.f.c(this.f9893g);
        this.f9911z = new e(this.f9893g, this.f9892f);
        e();
        a();
        i();
        w wVar2 = this.f9893g;
        if (wVar2 != null && !wVar2.c()) {
            setFocusable(true);
            setClickable(true);
        }
        if (wVar != null && wVar.ae()) {
            this.f9890a = new AnonymousClass4(wVar);
            com.anythink.basead.b.a().addDataFetchListener(this.f9890a);
        }
        post(new AnonymousClass5(wVar));
    }

    private void b() {
        w wVar = this.f9893g;
        if (wVar instanceof ay) {
            com.anythink.basead.h.a.b.a(getContext()).a((ay) this.f9893g);
        } else if (wVar instanceof bj) {
            com.anythink.basead.f.f.c a9 = com.anythink.basead.f.f.c.a();
            Context context = getContext();
            x xVar = this.f9892f;
            a9.a(context, com.anythink.basead.f.f.c.a(xVar.f14313b, xVar.f14314c), this.f9893g, this.f9892f.f14325o);
        }
        w wVar2 = this.f9893g;
        if ((wVar2 instanceof bj) && this.f9892f.f14317f == 67) {
            if (((bj) wVar2).a(true, true)) {
                com.anythink.core.common.f.c.a(getContext()).a(this.f9893g.v(), 0, 1);
            }
            if (((bj) this.f9893g).a(false, true)) {
                com.anythink.core.common.f.b.a(getContext()).a(this.f9893g.w(), 0, 1);
            }
        }
    }

    private View c() {
        return this;
    }

    public abstract void a();

    public abstract void a(j jVar);

    public abstract void a(boolean z8);

    public boolean a(String str, IOfferClickHandler iOfferClickHandler) {
        return false;
    }

    public void destroy() {
        a(112);
        com.anythink.basead.b.c cVar = this.i;
        if (cVar != null) {
            cVar.d();
        }
        com.anythink.core.common.v.a.c cVar2 = this.f9894h;
        if (cVar2 != null) {
            cVar2.b();
        }
        if (this.f9890a != null) {
            com.anythink.basead.b.a().removeDataFetchListener(this.f9890a);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        com.anythink.basead.ui.f.c cVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            com.anythink.basead.ui.f.c cVar2 = this.f9906u;
            if (cVar2 != null) {
                cVar2.a((int) motionEvent.getRawX(), (int) motionEvent.getRawY(), (int) motionEvent.getX(), (int) motionEvent.getY());
            }
        } else if ((action == 1 || action == 3) && (cVar = this.f9906u) != null) {
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
        return this.f9897l;
    }

    public void h() {
    }

    public void i() {
        this.f9904s = new com.anythink.basead.ui.improveclick.a(this, this.f9893g, this.f9892f, r(), s()) { // from class: com.anythink.basead.ui.BaseATView.1
            @Override // com.anythink.basead.ui.improveclick.a
            public final ViewGroup.LayoutParams a() {
                return BaseATView.this.q();
            }
        };
    }

    public boolean isShowingEndCardAfterVideoPlay() {
        return this.f9901p;
    }

    public final synchronized void j() {
        if (this.f9895j) {
            return;
        }
        this.f9895j = true;
        if (v()) {
            com.anythink.core.common.u.e.c(this.f9893g, this.f9892f, 3);
            u();
            this.f9896k = true;
            return;
        }
        w wVar = this.f9893g;
        if (wVar instanceof ay) {
            com.anythink.basead.h.a.b.a(getContext()).a((ay) this.f9893g);
        } else if (wVar instanceof bj) {
            com.anythink.basead.f.f.c a9 = com.anythink.basead.f.f.c.a();
            Context context = getContext();
            x xVar = this.f9892f;
            a9.a(context, com.anythink.basead.f.f.c.a(xVar.f14313b, xVar.f14314c), this.f9893g, this.f9892f.f14325o);
        }
        w wVar2 = this.f9893g;
        if ((wVar2 instanceof bj) && this.f9892f.f14317f == 67) {
            if (((bj) wVar2).a(true, true)) {
                com.anythink.core.common.f.c.a(getContext()).a(this.f9893g.v(), 0, 1);
            }
            if (((bj) this.f9893g).a(false, true)) {
                com.anythink.core.common.f.b.a(getContext()).a(this.f9893g.w(), 0, 1);
            }
        }
        a(114);
        com.anythink.basead.b.b.a(8, this.f9893g, l());
        f();
    }

    public final void k() {
        w wVar = this.f9893g;
        if ((wVar instanceof bj) && this.f9892f.f14317f == 67) {
            if (((bj) wVar).a(true, false)) {
                com.anythink.core.common.f.c.a(getContext()).a(this.f9893g.v(), 1, 0);
            }
            if (((bj) this.f9893g).a(false, false)) {
                com.anythink.core.common.f.b.a(getContext()).a(this.f9893g.w(), 1, 0);
            }
        }
    }

    public com.anythink.basead.d.j l() {
        com.anythink.basead.d.j jVar = new com.anythink.basead.d.j(this.f9892f, "");
        jVar.f6369g = getWidth();
        jVar.f6370h = getHeight();
        try {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            jVar.f6375n = iArr[0];
            jVar.f6376o = iArr[1];
        } catch (Throwable unused) {
        }
        jVar.f6377p = 100;
        x xVar = this.f9892f;
        if (xVar != null && xVar.f14320j == 2) {
            jVar.f6377p = f.b.a(this);
        }
        jVar.f6378q = this.f9907v;
        return jVar;
    }

    public final com.anythink.basead.d.a m() {
        com.anythink.basead.ui.f.c cVar = this.f9906u;
        if (cVar != null) {
            return cVar.a(13);
        }
        return null;
    }

    public boolean n() {
        return com.anythink.basead.b.e.a(this.f9892f);
    }

    public final boolean o() {
        return com.anythink.basead.b.e.b(this.f9893g);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f9907v == 0) {
            this.f9907v = System.currentTimeMillis();
            if (!this.f9911z.a()) {
                a(a.f9961z);
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
            public final void a(int i, int i4) {
                BaseATView.this.a(i, i4);
            }
        };
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.c
    public void setCallback(d dVar) {
        synchronized (this) {
            this.f9905t = dVar;
        }
    }

    public void setHasPerformClick(boolean z8) {
        this.f9897l = z8;
    }

    public void setShowingEndCardAfterVideoPlay(boolean z8) {
        this.f9901p = z8;
    }

    public boolean t() {
        return true;
    }

    public void u() {
    }

    public final boolean v() {
        w wVar = this.f9893g;
        if (wVar instanceof bj) {
            return ((bj) wVar).ay();
        }
        return false;
    }

    public void a(int i, int i4) {
        this.f9897l = true;
        j();
        if (this.i == null) {
            this.i = new com.anythink.basead.b.c(getContext(), this.f9892f, this.f9893g, this);
        }
        if (this.i.a()) {
            return;
        }
        if (this.f9893g.ae() && i == 1 && ((i4 == 1 || i4 == 6) && this.f9893g.aa() == 4 && this.f9892f.f14325o.aO())) {
            com.anythink.basead.b.a().pause(this.f9893g);
            return;
        }
        if (i != 5 && i != 6 && i != 7) {
            int b9 = com.anythink.basead.ui.f.c.b(i, i4);
            if (b9 == 0 || b9 == 1) {
                this.f9910y = true;
            } else if (b9 == 2) {
                this.f9909x = true;
            }
        }
        if (this.f9901p) {
            if (i4 == 1) {
                i4 = 6;
            } else if (i4 == 2 || i4 == 3) {
                i4 = 7;
            } else if (i4 == 4) {
                i4 = 8;
            } else if (i4 == 5) {
                i4 = 9;
            }
        }
        final j a9 = new j().a(i, i4);
        this.i.a(new c.a() { // from class: com.anythink.basead.ui.BaseATView.2
            @Override // com.anythink.basead.b.c.a
            public final void a() {
                if (BaseATView.this.f9896k) {
                    return;
                }
                if (BaseATView.this.v()) {
                    w wVar = BaseATView.this.f9893g;
                    if (wVar == null || wVar.r() == null || BaseATView.this.f9893g.r().bN() != 2) {
                        BaseATView baseATView = BaseATView.this;
                        com.anythink.core.common.u.e.c(baseATView.f9893g, baseATView.f9892f, 1);
                        return;
                    } else {
                        BaseATView baseATView2 = BaseATView.this;
                        com.anythink.core.common.u.e.c(baseATView2.f9893g, baseATView2.f9892f, 2);
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
            public final void a(boolean z8) {
                w wVar;
                if (BaseATView.this.f9896k) {
                    return;
                }
                if (!BaseATView.this.v() || (wVar = BaseATView.this.f9893g) == null || wVar.r() == null || BaseATView.this.f9893g.r().bN() == 2) {
                    BaseATView.this.a(z8);
                }
            }

            @Override // com.anythink.basead.b.c.a
            public final boolean a(String str, IOfferClickHandler iOfferClickHandler) {
                return BaseATView.this.a(str, iOfferClickHandler);
            }
        });
        com.anythink.basead.d.j l9 = l();
        com.anythink.basead.ui.f.c cVar = this.f9906u;
        if (cVar != null) {
            if (i != 1) {
                View view = this.f9900o;
                if (view != null) {
                    l9.i = cVar.a(view, i, i4);
                } else {
                    l9.i = cVar.a(this, i, i4);
                }
            } else {
                l9.i = cVar.a(0, i4);
            }
        }
        this.i.a(l9);
        if (this.f9904s != null) {
            HashMap hashMap = new HashMap();
            i.y(i, hashMap, "click_type", i4, g.a.f11329g);
            this.f9904s.a(hashMap);
        }
        a(113);
    }

    private void b(View view) {
        this.f9900o = view;
    }

    private void b(w wVar) {
        post(new AnonymousClass5(wVar));
    }

    public BaseATView(Context context, x xVar, w wVar) {
        this(context, xVar, wVar, "");
    }

    public BaseATView(Context context) {
        super(context);
        this.f9891e = "BaseATView";
        this.f9895j = false;
        this.f9896k = false;
        this.f9897l = false;
        this.f9901p = false;
    }

    public void a(final int i, final Runnable runnable) {
        w wVar = this.f9893g;
        int bO = (wVar == null || wVar.r() == null) ? 1 : this.f9893g.r().bO();
        if (i > 0) {
            getContext();
            this.f9894h = new com.anythink.core.common.v.a.c(bO, i);
        } else {
            getContext();
            this.f9894h = new com.anythink.core.common.v.a.c(bO);
        }
        this.f9894h.a(this, new com.anythink.core.common.v.a.a() { // from class: com.anythink.basead.ui.BaseATView.3
            @Override // com.anythink.core.common.v.a.a, com.anythink.core.common.v.a.b
            public final int getImpressionMinTimeViewed() {
                int i4 = i;
                if (i4 > 0) {
                    return i4;
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

    public float a(com.anythink.basead.ui.b bVar, boolean z8) {
        return com.anythink.basead.ui.f.b.a(bVar, z8, this.f9892f, true);
    }

    public void a(int i) {
        if (i == 114) {
            this.f9908w = System.currentTimeMillis();
        }
        e eVar = this.f9911z;
        if (eVar != null) {
            eVar.a(i, this);
        }
        com.anythink.basead.ui.improveclick.a aVar = this.f9904s;
        if (aVar != null) {
            aVar.a(i);
        }
    }

    private boolean a(MotionEvent motionEvent) {
        synchronized (this) {
            try {
                d dVar = this.f9905t;
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
        this.f9890a = new AnonymousClass4(wVar);
        com.anythink.basead.b.a().addDataFetchListener(this.f9890a);
    }

    public final void a(View view) {
        if (this.f9911z == null || view == null || !(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            this.f9911z.b(viewGroup.getChildAt(i));
        }
    }
}
