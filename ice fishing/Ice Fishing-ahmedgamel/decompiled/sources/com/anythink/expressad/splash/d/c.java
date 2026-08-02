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
    private static String f21403b = "SplashProvider";

    /* renamed from: A, reason: collision with root package name */
    private Context f21404A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f21405B;

    /* renamed from: C, reason: collision with root package name */
    private com.anythink.expressad.foundation.d.d f21406C;

    /* renamed from: D, reason: collision with root package name */
    private ATSplashPopView f21407D;

    /* renamed from: c, reason: collision with root package name */
    private String f21411c;

    /* renamed from: d, reason: collision with root package name */
    private String f21412d;

    /* renamed from: f, reason: collision with root package name */
    private int f21414f;

    /* renamed from: g, reason: collision with root package name */
    private long f21415g;

    /* renamed from: h, reason: collision with root package name */
    private int f21416h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private e f21417j;

    /* renamed from: k, reason: collision with root package name */
    private f f21418k;

    /* renamed from: l, reason: collision with root package name */
    private b f21419l;

    /* renamed from: m, reason: collision with root package name */
    private com.anythink.expressad.out.e f21420m;

    /* renamed from: n, reason: collision with root package name */
    private d f21421n;

    /* renamed from: o, reason: collision with root package name */
    private ATSplashView f21422o;

    /* renamed from: p, reason: collision with root package name */
    private ViewGroup f21423p;

    /* renamed from: q, reason: collision with root package name */
    private View f21424q;

    /* renamed from: r, reason: collision with root package name */
    private com.anythink.expressad.f.c f21425r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f21426s;

    /* renamed from: t, reason: collision with root package name */
    private ViewGroup f21427t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f21428u;

    /* renamed from: w, reason: collision with root package name */
    private int f21430w;

    /* renamed from: x, reason: collision with root package name */
    private int f21431x;

    /* renamed from: e, reason: collision with root package name */
    private int f21413e = 5;

    /* renamed from: v, reason: collision with root package name */
    private int f21429v = 1;

    /* renamed from: y, reason: collision with root package name */
    private Object f21432y = new Object();

    /* renamed from: z, reason: collision with root package name */
    private Object f21433z = new Object();

    /* renamed from: a, reason: collision with root package name */
    public boolean f21410a = false;

    /* renamed from: E, reason: collision with root package name */
    private boolean f21408E = false;

    /* renamed from: F, reason: collision with root package name */
    private boolean f21409F = false;

    public c(Context context, String str, String str2) {
        this.f21430w = n.f(t.b().g());
        this.f21431x = n.g(t.b().g());
        this.f21430w = context.getResources().getDisplayMetrics().widthPixels;
        this.f21431x = context.getResources().getDisplayMetrics().heightPixels;
        str = TextUtils.isEmpty(str) ? "" : str;
        this.f21412d = str;
        this.f21411c = str2;
        this.f21404A = context;
        if (this.f21418k == null) {
            this.f21418k = new f(context, str, str2);
        }
        if (this.f21422o == null) {
            ATSplashView aTSplashView = new ATSplashView(context);
            this.f21422o = aTSplashView;
            aTSplashView.setSplashWebview();
        }
    }

    private void b(ViewGroup viewGroup) {
        this.f21427t = viewGroup;
    }

    private String i() {
        if (this.f21410a) {
            f fVar = this.f21418k;
            return fVar != null ? fVar.a() : "";
        }
        e eVar = this.f21417j;
        return eVar != null ? eVar.a() : "";
    }

    private String j() {
        if (this.f21410a) {
            f fVar = this.f21418k;
            return fVar != null ? fVar.b() : "";
        }
        e eVar = this.f21417j;
        return eVar != null ? eVar.b() : "";
    }

    private void k() {
        this.f21408E = true;
        ATSplashPopView aTSplashPopView = this.f21407D;
        if (aTSplashPopView != null) {
            aTSplashPopView.startCountDown();
        }
    }

    private void l() {
        this.f21408E = false;
        ATSplashPopView aTSplashPopView = this.f21407D;
        if (aTSplashPopView != null) {
            aTSplashPopView.release();
        }
    }

    private void m() {
        f fVar = this.f21418k;
        if (fVar != null) {
            fVar.e();
        }
        ATSplashPopView aTSplashPopView = this.f21407D;
        if (aTSplashPopView == null || !this.f21408E) {
            return;
        }
        aTSplashPopView.reStartCountDown();
    }

    private void n() {
        ATSplashView aTSplashView = this.f21422o;
        if (aTSplashView != null) {
            aTSplashView.setAllowClickSplash(true);
        }
    }

    private void o() {
        f fVar = this.f21418k;
        if (fVar != null) {
            fVar.f();
        }
        ATSplashPopView aTSplashPopView = this.f21407D;
        if (aTSplashPopView == null || !this.f21408E) {
            return;
        }
        aTSplashPopView.pauseCountDown();
    }

    public final long c() {
        return this.f21415g;
    }

    public final boolean d() {
        return this.f21428u;
    }

    public final int e() {
        return this.f21413e;
    }

    public final void f() {
        a(100, 100);
    }

    public final void g() {
        this.f21406C = null;
        if (this.f21420m != null) {
            this.f21420m = null;
        }
        if (this.f21419l != null) {
            this.f21419l = null;
        }
        if (this.f21421n != null) {
            this.f21421n = null;
        }
        e eVar = this.f21417j;
        if (eVar != null) {
            eVar.c();
        }
        f fVar = this.f21418k;
        if (fVar != null) {
            fVar.d();
        }
        if (this.f21404A != null) {
            this.f21404A = null;
        }
    }

    public final void h() {
        f fVar = this.f21418k;
        if (fVar != null) {
            fVar.c();
        }
    }

    @Override // com.anythink.basead.f.c.c
    public final boolean isReady() {
        e eVar = this.f21417j;
        return (eVar == null || eVar.d() == null || !com.anythink.expressad.splash.c.d.a(this.f21422o, this.f21417j.d())) ? false : true;
    }

    private void c(boolean z6) {
        this.f21405B = z6;
    }

    public final boolean a() {
        return this.f21426s;
    }

    public final void b() {
        this.f21426s = false;
    }

    public final void a(int i) {
        this.f21429v = i;
    }

    public final void b(boolean z6) {
        this.f21428u = z6;
    }

    public final void c(int i) {
        this.f21414f = i;
    }

    private void a(long j6) {
        this.f21415g = j6;
    }

    public final void b(int i) {
        this.f21413e = i;
    }

    public final void a(boolean z6) {
        this.f21409F = z6;
    }

    public final void a(com.anythink.expressad.out.d dVar) {
        if (this.f21419l == null) {
            this.f21419l = new b(this);
        }
        this.f21419l.a(dVar);
    }

    public final void a(com.anythink.expressad.out.e eVar) {
        this.f21420m = eVar;
    }

    private void a(String str, ViewGroup viewGroup) {
        if (TextUtils.isEmpty(str)) {
            com.anythink.expressad.out.e eVar = this.f21420m;
            if (eVar != null) {
                eVar.a("token is null or empty");
                return;
            }
            return;
        }
        a(viewGroup);
    }

    public final void a(ViewGroup viewGroup) {
        this.f21423p = viewGroup;
        ATSplashView aTSplashView = this.f21422o;
        if (aTSplashView != null) {
            aTSplashView.setDevContainer(viewGroup);
        }
        e eVar = this.f21417j;
        final com.anythink.expressad.foundation.d.d d9 = eVar != null ? eVar.d() : null;
        if (d9 != null) {
            if (this.f21425r == null) {
                com.anythink.expressad.f.b.a();
                this.f21425r = com.anythink.expressad.f.b.a(com.anythink.expressad.foundation.b.a.c().f(), this.f21411c);
            }
            d dVar = new d(this, this.f21420m, this.f21425r.a(), d9);
            this.f21421n = dVar;
            int i = this.f21413e;
            if (i < 2 || i > 10) {
                this.f21413e = 5;
            }
            dVar.c();
            viewGroup.post(new Runnable() { // from class: com.anythink.expressad.splash.d.c.1
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.a(d9, false);
                }
            });
            return;
        }
        com.anythink.expressad.out.e eVar2 = this.f21420m;
        if (eVar2 != null) {
            eVar2.a("campaignEx is vali");
        }
    }

    public final void a(com.anythink.expressad.foundation.d.d dVar, boolean z6) {
        c cVar;
        com.anythink.expressad.foundation.d.d dVar2;
        if (dVar == null || !z6) {
            cVar = this;
            dVar2 = dVar;
        } else {
            if (this.f21425r == null) {
                com.anythink.expressad.f.b.a();
                this.f21425r = com.anythink.expressad.f.b.a(com.anythink.expressad.foundation.b.a.c().f(), this.f21411c);
            }
            cVar = this;
            dVar2 = dVar;
            cVar.f21421n = new d(cVar, this.f21420m, this.f21425r.a(), dVar2);
        }
        cVar.f21406C = dVar2;
        ViewGroup viewGroup = cVar.f21423p;
        if (viewGroup == null) {
            d dVar3 = cVar.f21421n;
            if (dVar3 != null) {
                dVar3.a("container is null");
                return;
            }
            return;
        }
        if (cVar.f21418k == null) {
            cVar.f21418k = new f(viewGroup.getContext(), cVar.f21412d, cVar.f21411c);
        }
        a(dVar2, 0, z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final com.anythink.expressad.foundation.d.d dVar, final int i, final boolean z6) {
        if (!com.anythink.expressad.splash.c.d.a(this.f21422o, dVar)) {
            if (i > 0) {
                this.f21418k.f21303j.postDelayed(new Runnable() { // from class: com.anythink.expressad.splash.d.c.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.this.a(dVar, i - 1, z6);
                    }
                }, 1L);
                return;
            }
            d dVar2 = this.f21421n;
            if (dVar2 != null) {
                dVar2.a("campaignEx is not ready");
                return;
            }
            return;
        }
        n();
        this.f21418k.a(this.f21413e);
        this.f21418k.b(this.f21414f);
        this.f21418k.a(this.f21427t);
        this.f21418k.a(this.f21421n);
        ViewGroup viewGroup = this.f21423p;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            am.a(this.f21422o);
            this.f21423p.addView(this.f21422o, new ViewGroup.LayoutParams(-1, -1));
        }
        this.f21418k.a(this.f21428u);
        this.f21418k.a(dVar, this.f21422o);
    }

    public final void a(com.anythink.expressad.foundation.d.e eVar) {
        synchronized (this.f21432y) {
            try {
                if (this.f21426s) {
                    if (this.f21419l != null) {
                        this.f21419l.a(new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19780p, "current unit is loading"));
                        this.f21426s = true;
                    }
                    return;
                }
                this.f21426s = true;
                this.f21422o.clearResState();
                this.f21425r = new com.anythink.expressad.f.c();
                if (this.f21417j == null) {
                    this.f21417j = new e(this.f21412d, this.f21411c, this.f21415g * 1000);
                }
                b bVar = this.f21419l;
                if (bVar != null) {
                    bVar.a("");
                    this.f21417j.a(this.f21419l);
                }
                this.f21422o.resetLoadState();
                this.f21417j.b(this.f21413e);
                this.f21417j.a(this.f21422o);
                this.f21417j.a(this.f21425r);
                this.f21417j.a(this.f21430w, this.f21431x);
                this.f21417j.b(this.f21428u);
                this.f21417j.a(this.f21409F);
                this.f21417j.a(this.f21429v);
                this.f21417j.a(eVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a(Context context) {
        if (this.f21418k == null) {
            if (context != null) {
                this.f21418k = new f(context, this.f21412d, this.f21411c);
            } else {
                this.f21418k = new f(t.b().g(), this.f21412d, this.f21411c);
            }
        }
        if (this.f21422o == null) {
            if (context != null) {
                this.f21422o = new ATSplashView(context);
            } else {
                this.f21422o = new ATSplashView(t.b().g());
            }
            this.f21422o.setSplashWebview();
        }
    }

    private void a(View view, RelativeLayout.LayoutParams layoutParams) {
        this.f21424q = view;
        if (view != null) {
            a(layoutParams.width, layoutParams.height);
            ATSplashView aTSplashView = this.f21422o;
            if (aTSplashView != null) {
                aTSplashView.setIconVg(view, layoutParams);
            }
        }
    }

    private ViewGroup a(u uVar) {
        ATSplashPopView aTSplashPopView = new ATSplashPopView(t.b().g(), new ATSplashPopView.a(this.f21412d, this.f21411c, uVar.a(), this.f21406C), this.f21421n);
        this.f21407D = aTSplashPopView;
        return aTSplashPopView;
    }

    private void a(int i, int i4) {
        int f2 = n.f(t.b().g());
        int g9 = n.g(t.b().g());
        int i6 = this.f21429v;
        if (i6 == 1) {
            if (g9 >= i4 * 4) {
                this.f21431x = g9 - i4;
                this.f21430w = f2;
                return;
            } else {
                this.f21431x = 0;
                this.f21430w = 0;
                return;
            }
        }
        if (i6 == 2) {
            if (f2 >= i * 4) {
                this.f21430w = f2 - i;
                this.f21431x = g9;
            } else {
                this.f21431x = 0;
                this.f21430w = 0;
            }
        }
    }

    private void a(int i, int i4, int i6, int i9) {
        try {
            ATSplashView aTSplashView = this.f21422o;
            if (aTSplashView != null) {
                aTSplashView.setNotchPadding(i, i4, i6, i9);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
