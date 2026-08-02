package com.anythink.basead.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.IceFishing.LiveIceFishing.k;
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
    private IExHandlerBaseAd.DataFetchListener f10519a;

    /* renamed from: e, reason: collision with root package name */
    String f10520e;

    /* renamed from: f, reason: collision with root package name */
    protected x f10521f;

    /* renamed from: g, reason: collision with root package name */
    protected w f10522g;

    /* renamed from: h, reason: collision with root package name */
    com.anythink.core.common.v.a.c f10523h;
    com.anythink.basead.b.c i;

    /* renamed from: j, reason: collision with root package name */
    volatile boolean f10524j;

    /* renamed from: k, reason: collision with root package name */
    volatile boolean f10525k;

    /* renamed from: l, reason: collision with root package name */
    protected boolean f10526l;

    /* renamed from: m, reason: collision with root package name */
    String f10527m;

    /* renamed from: n, reason: collision with root package name */
    protected List<View> f10528n;

    /* renamed from: o, reason: collision with root package name */
    View f10529o;

    /* renamed from: p, reason: collision with root package name */
    protected boolean f10530p;

    /* renamed from: q, reason: collision with root package name */
    protected View f10531q;

    /* renamed from: r, reason: collision with root package name */
    protected com.anythink.basead.ui.component.a f10532r;

    /* renamed from: s, reason: collision with root package name */
    protected com.anythink.basead.ui.improveclick.a f10533s;

    /* renamed from: t, reason: collision with root package name */
    d f10534t;

    /* renamed from: u, reason: collision with root package name */
    protected com.anythink.basead.ui.f.c f10535u;

    /* renamed from: v, reason: collision with root package name */
    protected long f10536v;

    /* renamed from: w, reason: collision with root package name */
    protected long f10537w;

    /* renamed from: x, reason: collision with root package name */
    protected boolean f10538x;

    /* renamed from: y, reason: collision with root package name */
    protected boolean f10539y;

    /* renamed from: z, reason: collision with root package name */
    protected e f10540z;

    /* renamed from: com.anythink.basead.ui.BaseATView$4, reason: invalid class name */
    public class AnonymousClass4 extends b.a {
        public AnonymousClass4(w wVar) {
            super(wVar);
        }

        @Override // com.anythink.core.api.IExHandlerBaseAd.DataFetchListener
        public final void onStatusChanged(String str) {
            View view = BaseATView.this.f10531q;
            if (view != null && (view instanceof CTAButtonLayout)) {
                ((CTAButtonLayout) view).setMajorCTAText(str);
            }
            if (BaseATView.this.f10533s != null) {
                HashMap hashMap = new HashMap();
                hashMap.put(g.a.f11959h, str);
                BaseATView.this.f10533s.a(hashMap);
            }
            BaseATView.this.a(121);
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseATView$5, reason: invalid class name */
    public class AnonymousClass5 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w f10548a;

        public AnonymousClass5(w wVar) {
            this.f10548a = wVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!(BaseATView.this.f10531q instanceof ScanningAnimButton) || this.f10548a.r() == null) {
                return;
            }
            ((ScanningAnimButton) BaseATView.this.f10531q).startAnimation(this.f10548a.r().aH());
        }
    }

    public static class a {

        /* renamed from: A, reason: collision with root package name */
        public static final int f10551A = 202;

        /* renamed from: B, reason: collision with root package name */
        public static final int f10552B = 203;

        /* renamed from: C, reason: collision with root package name */
        public static final int f10553C = 204;

        /* renamed from: D, reason: collision with root package name */
        public static final int f10554D = 205;

        /* renamed from: E, reason: collision with root package name */
        public static final int f10555E = 206;

        /* renamed from: F, reason: collision with root package name */
        public static final int f10556F = 207;

        /* renamed from: G, reason: collision with root package name */
        public static final int f10557G = 208;

        /* renamed from: H, reason: collision with root package name */
        public static final int f10558H = 209;

        /* renamed from: I, reason: collision with root package name */
        public static final int f10559I = 210;
        public static final int J = 211;

        /* renamed from: K, reason: collision with root package name */
        public static final int f10560K = 212;

        /* renamed from: L, reason: collision with root package name */
        public static final int f10561L = 301;

        /* renamed from: M, reason: collision with root package name */
        public static final int f10562M = 302;

        /* renamed from: N, reason: collision with root package name */
        public static final int f10563N = 303;

        /* renamed from: O, reason: collision with root package name */
        public static final int f10564O = 304;

        /* renamed from: P, reason: collision with root package name */
        public static final int f10565P = 305;

        /* renamed from: a, reason: collision with root package name */
        public static final int f10566a = 101;

        /* renamed from: b, reason: collision with root package name */
        public static final int f10567b = 102;

        /* renamed from: c, reason: collision with root package name */
        public static final int f10568c = 103;

        /* renamed from: d, reason: collision with root package name */
        public static final int f10569d = 104;

        /* renamed from: e, reason: collision with root package name */
        public static final int f10570e = 105;

        /* renamed from: f, reason: collision with root package name */
        public static final int f10571f = 106;

        /* renamed from: g, reason: collision with root package name */
        public static final int f10572g = 107;

        /* renamed from: h, reason: collision with root package name */
        public static final int f10573h = 108;
        public static final int i = 110;

        /* renamed from: j, reason: collision with root package name */
        public static final int f10574j = 111;

        /* renamed from: k, reason: collision with root package name */
        public static final int f10575k = 112;

        /* renamed from: l, reason: collision with root package name */
        public static final int f10576l = 113;

        /* renamed from: m, reason: collision with root package name */
        public static final int f10577m = 114;

        /* renamed from: n, reason: collision with root package name */
        public static final int f10578n = 115;

        /* renamed from: o, reason: collision with root package name */
        public static final int f10579o = 116;

        /* renamed from: p, reason: collision with root package name */
        public static final int f10580p = 117;

        /* renamed from: q, reason: collision with root package name */
        public static final int f10581q = 118;

        /* renamed from: r, reason: collision with root package name */
        public static final int f10582r = 119;

        /* renamed from: s, reason: collision with root package name */
        public static final int f10583s = 120;

        /* renamed from: t, reason: collision with root package name */
        public static final int f10584t = 121;

        /* renamed from: u, reason: collision with root package name */
        public static final int f10585u = 122;

        /* renamed from: v, reason: collision with root package name */
        public static final int f10586v = 123;

        /* renamed from: w, reason: collision with root package name */
        public static final int f10587w = 124;

        /* renamed from: x, reason: collision with root package name */
        public static final int f10588x = 125;

        /* renamed from: y, reason: collision with root package name */
        public static final int f10589y = 125;

        /* renamed from: z, reason: collision with root package name */
        public static final int f10590z = 201;
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final int f10591a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f10592b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f10593c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f10594d = 3;

        /* renamed from: e, reason: collision with root package name */
        public static final int f10595e = 4;

        /* renamed from: f, reason: collision with root package name */
        public static final int f10596f = 5;

        /* renamed from: g, reason: collision with root package name */
        public static final int f10597g = 6;

        /* renamed from: h, reason: collision with root package name */
        public static final int f10598h = 100;
    }

    public BaseATView(Context context, x xVar, w wVar, String str) {
        super(context);
        this.f10520e = "BaseATView";
        this.f10524j = false;
        this.f10525k = false;
        this.f10526l = false;
        this.f10530p = false;
        this.f10521f = xVar;
        this.f10522g = wVar;
        this.f10527m = str;
        this.f10528n = new ArrayList();
        this.f10535u = new com.anythink.basead.ui.f.c(this.f10522g);
        this.f10540z = new e(this.f10522g, this.f10521f);
        e();
        a();
        i();
        w wVar2 = this.f10522g;
        if (wVar2 != null && !wVar2.c()) {
            setFocusable(true);
            setClickable(true);
        }
        if (wVar != null && wVar.ae()) {
            this.f10519a = new AnonymousClass4(wVar);
            com.anythink.basead.b.a().addDataFetchListener(this.f10519a);
        }
        post(new AnonymousClass5(wVar));
    }

    private void b() {
        w wVar = this.f10522g;
        if (wVar instanceof ay) {
            com.anythink.basead.h.a.b.a(getContext()).a((ay) this.f10522g);
        } else if (wVar instanceof bj) {
            com.anythink.basead.f.f.c a9 = com.anythink.basead.f.f.c.a();
            Context context = getContext();
            x xVar = this.f10521f;
            a9.a(context, com.anythink.basead.f.f.c.a(xVar.f14942b, xVar.f14943c), this.f10522g, this.f10521f.f14954o);
        }
        w wVar2 = this.f10522g;
        if ((wVar2 instanceof bj) && this.f10521f.f14946f == 67) {
            if (((bj) wVar2).a(true, true)) {
                com.anythink.core.common.f.c.a(getContext()).a(this.f10522g.v(), 0, 1);
            }
            if (((bj) this.f10522g).a(false, true)) {
                com.anythink.core.common.f.b.a(getContext()).a(this.f10522g.w(), 0, 1);
            }
        }
    }

    private View c() {
        return this;
    }

    public abstract void a();

    public abstract void a(j jVar);

    public abstract void a(boolean z6);

    public boolean a(String str, IOfferClickHandler iOfferClickHandler) {
        return false;
    }

    public void destroy() {
        a(112);
        com.anythink.basead.b.c cVar = this.i;
        if (cVar != null) {
            cVar.d();
        }
        com.anythink.core.common.v.a.c cVar2 = this.f10523h;
        if (cVar2 != null) {
            cVar2.b();
        }
        if (this.f10519a != null) {
            com.anythink.basead.b.a().removeDataFetchListener(this.f10519a);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        com.anythink.basead.ui.f.c cVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            com.anythink.basead.ui.f.c cVar2 = this.f10535u;
            if (cVar2 != null) {
                cVar2.a((int) motionEvent.getRawX(), (int) motionEvent.getRawY(), (int) motionEvent.getX(), (int) motionEvent.getY());
            }
        } else if ((action == 1 || action == 3) && (cVar = this.f10535u) != null) {
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
        return this.f10526l;
    }

    public void h() {
    }

    public void i() {
        this.f10533s = new com.anythink.basead.ui.improveclick.a(this, this.f10522g, this.f10521f, r(), s()) { // from class: com.anythink.basead.ui.BaseATView.1
            @Override // com.anythink.basead.ui.improveclick.a
            public final ViewGroup.LayoutParams a() {
                return BaseATView.this.q();
            }
        };
    }

    public boolean isShowingEndCardAfterVideoPlay() {
        return this.f10530p;
    }

    public final synchronized void j() {
        if (this.f10524j) {
            return;
        }
        this.f10524j = true;
        if (v()) {
            com.anythink.core.common.u.e.c(this.f10522g, this.f10521f, 3);
            u();
            this.f10525k = true;
            return;
        }
        w wVar = this.f10522g;
        if (wVar instanceof ay) {
            com.anythink.basead.h.a.b.a(getContext()).a((ay) this.f10522g);
        } else if (wVar instanceof bj) {
            com.anythink.basead.f.f.c a9 = com.anythink.basead.f.f.c.a();
            Context context = getContext();
            x xVar = this.f10521f;
            a9.a(context, com.anythink.basead.f.f.c.a(xVar.f14942b, xVar.f14943c), this.f10522g, this.f10521f.f14954o);
        }
        w wVar2 = this.f10522g;
        if ((wVar2 instanceof bj) && this.f10521f.f14946f == 67) {
            if (((bj) wVar2).a(true, true)) {
                com.anythink.core.common.f.c.a(getContext()).a(this.f10522g.v(), 0, 1);
            }
            if (((bj) this.f10522g).a(false, true)) {
                com.anythink.core.common.f.b.a(getContext()).a(this.f10522g.w(), 0, 1);
            }
        }
        a(114);
        com.anythink.basead.b.b.a(8, this.f10522g, l());
        f();
    }

    public final void k() {
        w wVar = this.f10522g;
        if ((wVar instanceof bj) && this.f10521f.f14946f == 67) {
            if (((bj) wVar).a(true, false)) {
                com.anythink.core.common.f.c.a(getContext()).a(this.f10522g.v(), 1, 0);
            }
            if (((bj) this.f10522g).a(false, false)) {
                com.anythink.core.common.f.b.a(getContext()).a(this.f10522g.w(), 1, 0);
            }
        }
    }

    public com.anythink.basead.d.j l() {
        com.anythink.basead.d.j jVar = new com.anythink.basead.d.j(this.f10521f, "");
        jVar.f6998g = getWidth();
        jVar.f6999h = getHeight();
        try {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            jVar.f7004n = iArr[0];
            jVar.f7005o = iArr[1];
        } catch (Throwable unused) {
        }
        jVar.f7006p = 100;
        x xVar = this.f10521f;
        if (xVar != null && xVar.f14949j == 2) {
            jVar.f7006p = f.b.a(this);
        }
        jVar.f7007q = this.f10536v;
        return jVar;
    }

    public final com.anythink.basead.d.a m() {
        com.anythink.basead.ui.f.c cVar = this.f10535u;
        if (cVar != null) {
            return cVar.a(13);
        }
        return null;
    }

    public boolean n() {
        return com.anythink.basead.b.e.a(this.f10521f);
    }

    public final boolean o() {
        return com.anythink.basead.b.e.b(this.f10522g);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f10536v == 0) {
            this.f10536v = System.currentTimeMillis();
            if (!this.f10540z.a()) {
                a(a.f10590z);
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
            this.f10534t = dVar;
        }
    }

    public void setHasPerformClick(boolean z6) {
        this.f10526l = z6;
    }

    public void setShowingEndCardAfterVideoPlay(boolean z6) {
        this.f10530p = z6;
    }

    public boolean t() {
        return true;
    }

    public void u() {
    }

    public final boolean v() {
        w wVar = this.f10522g;
        if (wVar instanceof bj) {
            return ((bj) wVar).ay();
        }
        return false;
    }

    public void a(int i, int i4) {
        this.f10526l = true;
        j();
        if (this.i == null) {
            this.i = new com.anythink.basead.b.c(getContext(), this.f10521f, this.f10522g, this);
        }
        if (this.i.a()) {
            return;
        }
        if (this.f10522g.ae() && i == 1 && ((i4 == 1 || i4 == 6) && this.f10522g.aa() == 4 && this.f10521f.f14954o.aO())) {
            com.anythink.basead.b.a().pause(this.f10522g);
            return;
        }
        if (i != 5 && i != 6 && i != 7) {
            int b9 = com.anythink.basead.ui.f.c.b(i, i4);
            if (b9 == 0 || b9 == 1) {
                this.f10539y = true;
            } else if (b9 == 2) {
                this.f10538x = true;
            }
        }
        if (this.f10530p) {
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
                if (BaseATView.this.f10525k) {
                    return;
                }
                if (BaseATView.this.v()) {
                    w wVar = BaseATView.this.f10522g;
                    if (wVar == null || wVar.r() == null || BaseATView.this.f10522g.r().bN() != 2) {
                        BaseATView baseATView = BaseATView.this;
                        com.anythink.core.common.u.e.c(baseATView.f10522g, baseATView.f10521f, 1);
                        return;
                    } else {
                        BaseATView baseATView2 = BaseATView.this;
                        com.anythink.core.common.u.e.c(baseATView2.f10522g, baseATView2.f10521f, 2);
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
            public final void a(boolean z6) {
                w wVar;
                if (BaseATView.this.f10525k) {
                    return;
                }
                if (!BaseATView.this.v() || (wVar = BaseATView.this.f10522g) == null || wVar.r() == null || BaseATView.this.f10522g.r().bN() == 2) {
                    BaseATView.this.a(z6);
                }
            }

            @Override // com.anythink.basead.b.c.a
            public final boolean a(String str, IOfferClickHandler iOfferClickHandler) {
                return BaseATView.this.a(str, iOfferClickHandler);
            }
        });
        com.anythink.basead.d.j l9 = l();
        com.anythink.basead.ui.f.c cVar = this.f10535u;
        if (cVar != null) {
            if (i != 1) {
                View view = this.f10529o;
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
        if (this.f10533s != null) {
            HashMap hashMap = new HashMap();
            k.A(i, hashMap, "click_type", i4, g.a.f11958g);
            this.f10533s.a(hashMap);
        }
        a(113);
    }

    private void b(View view) {
        this.f10529o = view;
    }

    private void b(w wVar) {
        post(new AnonymousClass5(wVar));
    }

    public BaseATView(Context context, x xVar, w wVar) {
        this(context, xVar, wVar, "");
    }

    public BaseATView(Context context) {
        super(context);
        this.f10520e = "BaseATView";
        this.f10524j = false;
        this.f10525k = false;
        this.f10526l = false;
        this.f10530p = false;
    }

    public void a(final int i, final Runnable runnable) {
        w wVar = this.f10522g;
        int bO = (wVar == null || wVar.r() == null) ? 1 : this.f10522g.r().bO();
        if (i > 0) {
            getContext();
            this.f10523h = new com.anythink.core.common.v.a.c(bO, i);
        } else {
            getContext();
            this.f10523h = new com.anythink.core.common.v.a.c(bO);
        }
        this.f10523h.a(this, new com.anythink.core.common.v.a.a() { // from class: com.anythink.basead.ui.BaseATView.3
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

    public float a(com.anythink.basead.ui.b bVar, boolean z6) {
        return com.anythink.basead.ui.f.b.a(bVar, z6, this.f10521f, true);
    }

    public void a(int i) {
        if (i == 114) {
            this.f10537w = System.currentTimeMillis();
        }
        e eVar = this.f10540z;
        if (eVar != null) {
            eVar.a(i, this);
        }
        com.anythink.basead.ui.improveclick.a aVar = this.f10533s;
        if (aVar != null) {
            aVar.a(i);
        }
    }

    private boolean a(MotionEvent motionEvent) {
        synchronized (this) {
            try {
                d dVar = this.f10534t;
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
        this.f10519a = new AnonymousClass4(wVar);
        com.anythink.basead.b.a().addDataFetchListener(this.f10519a);
    }

    public final void a(View view) {
        if (this.f10540z == null || view == null || !(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            this.f10540z.b(viewGroup.getChildAt(i));
        }
    }
}
