package com.anythink.expressad.splash.d;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.anythink.core.common.d.t;
import com.anythink.core.common.v.am;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.out.u;
import com.anythink.expressad.splash.c.e;
import com.anythink.expressad.splash.c.f;
import com.anythink.expressad.splash.view.ATSplashPopView;
import com.anythink.expressad.splash.view.ATSplashView;

/* loaded from: classes.dex */
public final class c implements com.anythink.basead.f.c.c {

    /* renamed from: b, reason: collision with root package name */
    private static String f20616b = "SplashProvider";

    /* renamed from: A, reason: collision with root package name */
    private Context f20617A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f20618B;

    /* renamed from: C, reason: collision with root package name */
    private com.anythink.expressad.foundation.d.d f20619C;

    /* renamed from: D, reason: collision with root package name */
    private ATSplashPopView f20620D;

    /* renamed from: c, reason: collision with root package name */
    private String f20624c;

    /* renamed from: d, reason: collision with root package name */
    private String f20625d;

    /* renamed from: f, reason: collision with root package name */
    private int f20627f;

    /* renamed from: g, reason: collision with root package name */
    private long f20628g;

    /* renamed from: h, reason: collision with root package name */
    private int f20629h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private e f20630j;

    /* renamed from: k, reason: collision with root package name */
    private f f20631k;

    /* renamed from: l, reason: collision with root package name */
    private b f20632l;

    /* renamed from: m, reason: collision with root package name */
    private com.anythink.expressad.out.e f20633m;

    /* renamed from: n, reason: collision with root package name */
    private d f20634n;

    /* renamed from: o, reason: collision with root package name */
    private ATSplashView f20635o;

    /* renamed from: p, reason: collision with root package name */
    private ViewGroup f20636p;

    /* renamed from: q, reason: collision with root package name */
    private View f20637q;

    /* renamed from: r, reason: collision with root package name */
    private com.anythink.expressad.f.c f20638r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f20639s;

    /* renamed from: t, reason: collision with root package name */
    private ViewGroup f20640t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f20641u;

    /* renamed from: w, reason: collision with root package name */
    private int f20643w;

    /* renamed from: x, reason: collision with root package name */
    private int f20644x;

    /* renamed from: e, reason: collision with root package name */
    private int f20626e = 5;

    /* renamed from: v, reason: collision with root package name */
    private int f20642v = 1;

    /* renamed from: y, reason: collision with root package name */
    private Object f20645y = new Object();

    /* renamed from: z, reason: collision with root package name */
    private Object f20646z = new Object();

    /* renamed from: a, reason: collision with root package name */
    public boolean f20623a = false;

    /* renamed from: E, reason: collision with root package name */
    private boolean f20621E = false;

    /* renamed from: F, reason: collision with root package name */
    private boolean f20622F = false;

    public c(Context context, String str, String str2) {
        this.f20643w = n.f(t.b().g());
        this.f20644x = n.g(t.b().g());
        this.f20643w = context.getResources().getDisplayMetrics().widthPixels;
        this.f20644x = context.getResources().getDisplayMetrics().heightPixels;
        str = TextUtils.isEmpty(str) ? "" : str;
        this.f20625d = str;
        this.f20624c = str2;
        this.f20617A = context;
        if (this.f20631k == null) {
            this.f20631k = new f(context, str, str2);
        }
        if (this.f20635o == null) {
            ATSplashView aTSplashView = new ATSplashView(context);
            this.f20635o = aTSplashView;
            aTSplashView.setSplashWebview();
        }
    }

    private void b(ViewGroup viewGroup) {
        this.f20640t = viewGroup;
    }

    private String i() {
        if (this.f20623a) {
            f fVar = this.f20631k;
            return fVar != null ? fVar.a() : "";
        }
        e eVar = this.f20630j;
        return eVar != null ? eVar.a() : "";
    }

    private String j() {
        if (this.f20623a) {
            f fVar = this.f20631k;
            return fVar != null ? fVar.b() : "";
        }
        e eVar = this.f20630j;
        return eVar != null ? eVar.b() : "";
    }

    private void k() {
        this.f20621E = true;
        ATSplashPopView aTSplashPopView = this.f20620D;
        if (aTSplashPopView != null) {
            aTSplashPopView.startCountDown();
        }
    }

    private void l() {
        this.f20621E = false;
        ATSplashPopView aTSplashPopView = this.f20620D;
        if (aTSplashPopView != null) {
            aTSplashPopView.release();
        }
    }

    private void m() {
        f fVar = this.f20631k;
        if (fVar != null) {
            fVar.e();
        }
        ATSplashPopView aTSplashPopView = this.f20620D;
        if (aTSplashPopView == null || !this.f20621E) {
            return;
        }
        aTSplashPopView.reStartCountDown();
    }

    private void n() {
        ATSplashView aTSplashView = this.f20635o;
        if (aTSplashView != null) {
            aTSplashView.setAllowClickSplash(true);
        }
    }

    private void o() {
        f fVar = this.f20631k;
        if (fVar != null) {
            fVar.f();
        }
        ATSplashPopView aTSplashPopView = this.f20620D;
        if (aTSplashPopView == null || !this.f20621E) {
            return;
        }
        aTSplashPopView.pauseCountDown();
    }

    public final long c() {
        return this.f20628g;
    }

    public final boolean d() {
        return this.f20641u;
    }

    public final int e() {
        return this.f20626e;
    }

    public final void f() {
        a(100, 100);
    }

    public final void g() {
        this.f20619C = null;
        if (this.f20633m != null) {
            this.f20633m = null;
        }
        if (this.f20632l != null) {
            this.f20632l = null;
        }
        if (this.f20634n != null) {
            this.f20634n = null;
        }
        e eVar = this.f20630j;
        if (eVar != null) {
            eVar.c();
        }
        f fVar = this.f20631k;
        if (fVar != null) {
            fVar.d();
        }
        if (this.f20617A != null) {
            this.f20617A = null;
        }
    }

    public final void h() {
        f fVar = this.f20631k;
        if (fVar != null) {
            fVar.c();
        }
    }

    @Override // com.anythink.basead.f.c.c
    public final boolean isReady() {
        e eVar = this.f20630j;
        return (eVar == null || eVar.d() == null || !com.anythink.expressad.splash.c.d.a(this.f20635o, this.f20630j.d())) ? false : true;
    }

    private void c(boolean z3) {
        this.f20618B = z3;
    }

    public final boolean a() {
        return this.f20639s;
    }

    public final void b() {
        this.f20639s = false;
    }

    public final void a(int i) {
        this.f20642v = i;
    }

    public final void b(boolean z3) {
        this.f20641u = z3;
    }

    public final void c(int i) {
        this.f20627f = i;
    }

    private void a(long j6) {
        this.f20628g = j6;
    }

    public final void b(int i) {
        this.f20626e = i;
    }

    public final void a(boolean z3) {
        this.f20622F = z3;
    }

    public final void a(com.anythink.expressad.out.d dVar) {
        if (this.f20632l == null) {
            this.f20632l = new b(this);
        }
        this.f20632l.a(dVar);
    }

    public final void a(com.anythink.expressad.out.e eVar) {
        this.f20633m = eVar;
    }

    private void a(String str, ViewGroup viewGroup) {
        if (TextUtils.isEmpty(str)) {
            com.anythink.expressad.out.e eVar = this.f20633m;
            if (eVar != null) {
                eVar.a("token is null or empty");
                return;
            }
            return;
        }
        a(viewGroup);
    }

    public final void a(ViewGroup viewGroup) {
        this.f20636p = viewGroup;
        ATSplashView aTSplashView = this.f20635o;
        if (aTSplashView != null) {
            aTSplashView.setDevContainer(viewGroup);
        }
        e eVar = this.f20630j;
        final com.anythink.expressad.foundation.d.d d2 = eVar != null ? eVar.d() : null;
        if (d2 != null) {
            if (this.f20638r == null) {
                com.anythink.expressad.f.b.a();
                this.f20638r = com.anythink.expressad.f.b.a(com.anythink.expressad.foundation.b.a.c().f(), this.f20624c);
            }
            d dVar = new d(this, this.f20633m, this.f20638r.a(), d2);
            this.f20634n = dVar;
            int i = this.f20626e;
            if (i < 2 || i > 10) {
                this.f20626e = 5;
            }
            dVar.c();
            viewGroup.post(new Runnable() { // from class: com.anythink.expressad.splash.d.c.1
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.a(d2, false);
                }
            });
            return;
        }
        com.anythink.expressad.out.e eVar2 = this.f20633m;
        if (eVar2 != null) {
            eVar2.a("campaignEx is vali");
        }
    }

    public final void a(com.anythink.expressad.foundation.d.d dVar, boolean z3) {
        c cVar;
        com.anythink.expressad.foundation.d.d dVar2;
        if (dVar == null || !z3) {
            cVar = this;
            dVar2 = dVar;
        } else {
            if (this.f20638r == null) {
                com.anythink.expressad.f.b.a();
                this.f20638r = com.anythink.expressad.f.b.a(com.anythink.expressad.foundation.b.a.c().f(), this.f20624c);
            }
            cVar = this;
            dVar2 = dVar;
            cVar.f20634n = new d(cVar, this.f20633m, this.f20638r.a(), dVar2);
        }
        cVar.f20619C = dVar2;
        ViewGroup viewGroup = cVar.f20636p;
        if (viewGroup == null) {
            d dVar3 = cVar.f20634n;
            if (dVar3 != null) {
                dVar3.a("container is null");
                return;
            }
            return;
        }
        if (cVar.f20631k == null) {
            cVar.f20631k = new f(viewGroup.getContext(), cVar.f20625d, cVar.f20624c);
        }
        a(dVar2, 0, z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final com.anythink.expressad.foundation.d.d dVar, final int i, final boolean z3) {
        if (!com.anythink.expressad.splash.c.d.a(this.f20635o, dVar)) {
            if (i > 0) {
                this.f20631k.f20516j.postDelayed(new Runnable() { // from class: com.anythink.expressad.splash.d.c.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.this.a(dVar, i - 1, z3);
                    }
                }, 1L);
                return;
            }
            d dVar2 = this.f20634n;
            if (dVar2 != null) {
                dVar2.a("campaignEx is not ready");
                return;
            }
            return;
        }
        n();
        this.f20631k.a(this.f20626e);
        this.f20631k.b(this.f20627f);
        this.f20631k.a(this.f20640t);
        this.f20631k.a(this.f20634n);
        ViewGroup viewGroup = this.f20636p;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            am.a(this.f20635o);
            this.f20636p.addView(this.f20635o, new ViewGroup.LayoutParams(-1, -1));
        }
        this.f20631k.a(this.f20641u);
        this.f20631k.a(dVar, this.f20635o);
    }

    public final void a(com.anythink.expressad.foundation.d.e eVar) {
        synchronized (this.f20645y) {
            try {
                if (this.f20639s) {
                    if (this.f20632l != null) {
                        this.f20632l.a(new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f18993p, "current unit is loading"));
                        this.f20639s = true;
                    }
                    return;
                }
                this.f20639s = true;
                this.f20635o.clearResState();
                this.f20638r = new com.anythink.expressad.f.c();
                if (this.f20630j == null) {
                    this.f20630j = new e(this.f20625d, this.f20624c, this.f20628g * 1000);
                }
                b bVar = this.f20632l;
                if (bVar != null) {
                    bVar.a("");
                    this.f20630j.a(this.f20632l);
                }
                this.f20635o.resetLoadState();
                this.f20630j.b(this.f20626e);
                this.f20630j.a(this.f20635o);
                this.f20630j.a(this.f20638r);
                this.f20630j.a(this.f20643w, this.f20644x);
                this.f20630j.b(this.f20641u);
                this.f20630j.a(this.f20622F);
                this.f20630j.a(this.f20642v);
                this.f20630j.a(eVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a(Context context) {
        if (this.f20631k == null) {
            if (context != null) {
                this.f20631k = new f(context, this.f20625d, this.f20624c);
            } else {
                this.f20631k = new f(t.b().g(), this.f20625d, this.f20624c);
            }
        }
        if (this.f20635o == null) {
            if (context != null) {
                this.f20635o = new ATSplashView(context);
            } else {
                this.f20635o = new ATSplashView(t.b().g());
            }
            this.f20635o.setSplashWebview();
        }
    }

    private void a(View view, RelativeLayout.LayoutParams layoutParams) {
        this.f20637q = view;
        if (view != null) {
            a(layoutParams.width, layoutParams.height);
            ATSplashView aTSplashView = this.f20635o;
            if (aTSplashView != null) {
                aTSplashView.setIconVg(view, layoutParams);
            }
        }
    }

    private ViewGroup a(u uVar) {
        ATSplashPopView aTSplashPopView = new ATSplashPopView(t.b().g(), new ATSplashPopView.a(this.f20625d, this.f20624c, uVar.a(), this.f20619C), this.f20634n);
        this.f20620D = aTSplashPopView;
        return aTSplashPopView;
    }

    private void a(int i, int i6) {
        int f3 = n.f(t.b().g());
        int g4 = n.g(t.b().g());
        int i9 = this.f20642v;
        if (i9 == 1) {
            if (g4 >= i6 * 4) {
                this.f20644x = g4 - i6;
                this.f20643w = f3;
                return;
            } else {
                this.f20644x = 0;
                this.f20643w = 0;
                return;
            }
        }
        if (i9 == 2) {
            if (f3 >= i * 4) {
                this.f20643w = f3 - i;
                this.f20644x = g4;
            } else {
                this.f20644x = 0;
                this.f20643w = 0;
            }
        }
    }

    private void a(int i, int i6, int i9, int i10) {
        try {
            ATSplashView aTSplashView = this.f20635o;
            if (aTSplashView != null) {
                aTSplashView.setNotchPadding(i, i6, i9, i10);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
