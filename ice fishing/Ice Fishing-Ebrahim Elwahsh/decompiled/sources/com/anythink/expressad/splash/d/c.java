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
    private static String f20774b = "SplashProvider";

    /* renamed from: A, reason: collision with root package name */
    private Context f20775A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f20776B;

    /* renamed from: C, reason: collision with root package name */
    private com.anythink.expressad.foundation.d.d f20777C;

    /* renamed from: D, reason: collision with root package name */
    private ATSplashPopView f20778D;

    /* renamed from: c, reason: collision with root package name */
    private String f20782c;

    /* renamed from: d, reason: collision with root package name */
    private String f20783d;

    /* renamed from: f, reason: collision with root package name */
    private int f20785f;

    /* renamed from: g, reason: collision with root package name */
    private long f20786g;

    /* renamed from: h, reason: collision with root package name */
    private int f20787h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private e f20788j;

    /* renamed from: k, reason: collision with root package name */
    private f f20789k;

    /* renamed from: l, reason: collision with root package name */
    private b f20790l;

    /* renamed from: m, reason: collision with root package name */
    private com.anythink.expressad.out.e f20791m;

    /* renamed from: n, reason: collision with root package name */
    private d f20792n;

    /* renamed from: o, reason: collision with root package name */
    private ATSplashView f20793o;

    /* renamed from: p, reason: collision with root package name */
    private ViewGroup f20794p;

    /* renamed from: q, reason: collision with root package name */
    private View f20795q;

    /* renamed from: r, reason: collision with root package name */
    private com.anythink.expressad.f.c f20796r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f20797s;

    /* renamed from: t, reason: collision with root package name */
    private ViewGroup f20798t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f20799u;

    /* renamed from: w, reason: collision with root package name */
    private int f20801w;

    /* renamed from: x, reason: collision with root package name */
    private int f20802x;

    /* renamed from: e, reason: collision with root package name */
    private int f20784e = 5;

    /* renamed from: v, reason: collision with root package name */
    private int f20800v = 1;

    /* renamed from: y, reason: collision with root package name */
    private Object f20803y = new Object();

    /* renamed from: z, reason: collision with root package name */
    private Object f20804z = new Object();

    /* renamed from: a, reason: collision with root package name */
    public boolean f20781a = false;

    /* renamed from: E, reason: collision with root package name */
    private boolean f20779E = false;

    /* renamed from: F, reason: collision with root package name */
    private boolean f20780F = false;

    public c(Context context, String str, String str2) {
        this.f20801w = n.f(t.b().g());
        this.f20802x = n.g(t.b().g());
        this.f20801w = context.getResources().getDisplayMetrics().widthPixels;
        this.f20802x = context.getResources().getDisplayMetrics().heightPixels;
        str = TextUtils.isEmpty(str) ? "" : str;
        this.f20783d = str;
        this.f20782c = str2;
        this.f20775A = context;
        if (this.f20789k == null) {
            this.f20789k = new f(context, str, str2);
        }
        if (this.f20793o == null) {
            ATSplashView aTSplashView = new ATSplashView(context);
            this.f20793o = aTSplashView;
            aTSplashView.setSplashWebview();
        }
    }

    private void b(ViewGroup viewGroup) {
        this.f20798t = viewGroup;
    }

    private String i() {
        if (this.f20781a) {
            f fVar = this.f20789k;
            return fVar != null ? fVar.a() : "";
        }
        e eVar = this.f20788j;
        return eVar != null ? eVar.a() : "";
    }

    private String j() {
        if (this.f20781a) {
            f fVar = this.f20789k;
            return fVar != null ? fVar.b() : "";
        }
        e eVar = this.f20788j;
        return eVar != null ? eVar.b() : "";
    }

    private void k() {
        this.f20779E = true;
        ATSplashPopView aTSplashPopView = this.f20778D;
        if (aTSplashPopView != null) {
            aTSplashPopView.startCountDown();
        }
    }

    private void l() {
        this.f20779E = false;
        ATSplashPopView aTSplashPopView = this.f20778D;
        if (aTSplashPopView != null) {
            aTSplashPopView.release();
        }
    }

    private void m() {
        f fVar = this.f20789k;
        if (fVar != null) {
            fVar.e();
        }
        ATSplashPopView aTSplashPopView = this.f20778D;
        if (aTSplashPopView == null || !this.f20779E) {
            return;
        }
        aTSplashPopView.reStartCountDown();
    }

    private void n() {
        ATSplashView aTSplashView = this.f20793o;
        if (aTSplashView != null) {
            aTSplashView.setAllowClickSplash(true);
        }
    }

    private void o() {
        f fVar = this.f20789k;
        if (fVar != null) {
            fVar.f();
        }
        ATSplashPopView aTSplashPopView = this.f20778D;
        if (aTSplashPopView == null || !this.f20779E) {
            return;
        }
        aTSplashPopView.pauseCountDown();
    }

    public final long c() {
        return this.f20786g;
    }

    public final boolean d() {
        return this.f20799u;
    }

    public final int e() {
        return this.f20784e;
    }

    public final void f() {
        a(100, 100);
    }

    public final void g() {
        this.f20777C = null;
        if (this.f20791m != null) {
            this.f20791m = null;
        }
        if (this.f20790l != null) {
            this.f20790l = null;
        }
        if (this.f20792n != null) {
            this.f20792n = null;
        }
        e eVar = this.f20788j;
        if (eVar != null) {
            eVar.c();
        }
        f fVar = this.f20789k;
        if (fVar != null) {
            fVar.d();
        }
        if (this.f20775A != null) {
            this.f20775A = null;
        }
    }

    public final void h() {
        f fVar = this.f20789k;
        if (fVar != null) {
            fVar.c();
        }
    }

    @Override // com.anythink.basead.f.c.c
    public final boolean isReady() {
        e eVar = this.f20788j;
        return (eVar == null || eVar.d() == null || !com.anythink.expressad.splash.c.d.a(this.f20793o, this.f20788j.d())) ? false : true;
    }

    private void c(boolean z8) {
        this.f20776B = z8;
    }

    public final boolean a() {
        return this.f20797s;
    }

    public final void b() {
        this.f20797s = false;
    }

    public final void a(int i) {
        this.f20800v = i;
    }

    public final void b(boolean z8) {
        this.f20799u = z8;
    }

    public final void c(int i) {
        this.f20785f = i;
    }

    private void a(long j9) {
        this.f20786g = j9;
    }

    public final void b(int i) {
        this.f20784e = i;
    }

    public final void a(boolean z8) {
        this.f20780F = z8;
    }

    public final void a(com.anythink.expressad.out.d dVar) {
        if (this.f20790l == null) {
            this.f20790l = new b(this);
        }
        this.f20790l.a(dVar);
    }

    public final void a(com.anythink.expressad.out.e eVar) {
        this.f20791m = eVar;
    }

    private void a(String str, ViewGroup viewGroup) {
        if (TextUtils.isEmpty(str)) {
            com.anythink.expressad.out.e eVar = this.f20791m;
            if (eVar != null) {
                eVar.a("token is null or empty");
                return;
            }
            return;
        }
        a(viewGroup);
    }

    public final void a(ViewGroup viewGroup) {
        this.f20794p = viewGroup;
        ATSplashView aTSplashView = this.f20793o;
        if (aTSplashView != null) {
            aTSplashView.setDevContainer(viewGroup);
        }
        e eVar = this.f20788j;
        final com.anythink.expressad.foundation.d.d d2 = eVar != null ? eVar.d() : null;
        if (d2 != null) {
            if (this.f20796r == null) {
                com.anythink.expressad.f.b.a();
                this.f20796r = com.anythink.expressad.f.b.a(com.anythink.expressad.foundation.b.a.c().f(), this.f20782c);
            }
            d dVar = new d(this, this.f20791m, this.f20796r.a(), d2);
            this.f20792n = dVar;
            int i = this.f20784e;
            if (i < 2 || i > 10) {
                this.f20784e = 5;
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
        com.anythink.expressad.out.e eVar2 = this.f20791m;
        if (eVar2 != null) {
            eVar2.a("campaignEx is vali");
        }
    }

    public final void a(com.anythink.expressad.foundation.d.d dVar, boolean z8) {
        c cVar;
        com.anythink.expressad.foundation.d.d dVar2;
        if (dVar == null || !z8) {
            cVar = this;
            dVar2 = dVar;
        } else {
            if (this.f20796r == null) {
                com.anythink.expressad.f.b.a();
                this.f20796r = com.anythink.expressad.f.b.a(com.anythink.expressad.foundation.b.a.c().f(), this.f20782c);
            }
            cVar = this;
            dVar2 = dVar;
            cVar.f20792n = new d(cVar, this.f20791m, this.f20796r.a(), dVar2);
        }
        cVar.f20777C = dVar2;
        ViewGroup viewGroup = cVar.f20794p;
        if (viewGroup == null) {
            d dVar3 = cVar.f20792n;
            if (dVar3 != null) {
                dVar3.a("container is null");
                return;
            }
            return;
        }
        if (cVar.f20789k == null) {
            cVar.f20789k = new f(viewGroup.getContext(), cVar.f20783d, cVar.f20782c);
        }
        a(dVar2, 0, z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final com.anythink.expressad.foundation.d.d dVar, final int i, final boolean z8) {
        if (!com.anythink.expressad.splash.c.d.a(this.f20793o, dVar)) {
            if (i > 0) {
                this.f20789k.f20674j.postDelayed(new Runnable() { // from class: com.anythink.expressad.splash.d.c.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.this.a(dVar, i - 1, z8);
                    }
                }, 1L);
                return;
            }
            d dVar2 = this.f20792n;
            if (dVar2 != null) {
                dVar2.a("campaignEx is not ready");
                return;
            }
            return;
        }
        n();
        this.f20789k.a(this.f20784e);
        this.f20789k.b(this.f20785f);
        this.f20789k.a(this.f20798t);
        this.f20789k.a(this.f20792n);
        ViewGroup viewGroup = this.f20794p;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            am.a(this.f20793o);
            this.f20794p.addView(this.f20793o, new ViewGroup.LayoutParams(-1, -1));
        }
        this.f20789k.a(this.f20799u);
        this.f20789k.a(dVar, this.f20793o);
    }

    public final void a(com.anythink.expressad.foundation.d.e eVar) {
        synchronized (this.f20803y) {
            try {
                if (this.f20797s) {
                    if (this.f20790l != null) {
                        this.f20790l.a(new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19151p, "current unit is loading"));
                        this.f20797s = true;
                    }
                    return;
                }
                this.f20797s = true;
                this.f20793o.clearResState();
                this.f20796r = new com.anythink.expressad.f.c();
                if (this.f20788j == null) {
                    this.f20788j = new e(this.f20783d, this.f20782c, this.f20786g * 1000);
                }
                b bVar = this.f20790l;
                if (bVar != null) {
                    bVar.a("");
                    this.f20788j.a(this.f20790l);
                }
                this.f20793o.resetLoadState();
                this.f20788j.b(this.f20784e);
                this.f20788j.a(this.f20793o);
                this.f20788j.a(this.f20796r);
                this.f20788j.a(this.f20801w, this.f20802x);
                this.f20788j.b(this.f20799u);
                this.f20788j.a(this.f20780F);
                this.f20788j.a(this.f20800v);
                this.f20788j.a(eVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a(Context context) {
        if (this.f20789k == null) {
            if (context != null) {
                this.f20789k = new f(context, this.f20783d, this.f20782c);
            } else {
                this.f20789k = new f(t.b().g(), this.f20783d, this.f20782c);
            }
        }
        if (this.f20793o == null) {
            if (context != null) {
                this.f20793o = new ATSplashView(context);
            } else {
                this.f20793o = new ATSplashView(t.b().g());
            }
            this.f20793o.setSplashWebview();
        }
    }

    private void a(View view, RelativeLayout.LayoutParams layoutParams) {
        this.f20795q = view;
        if (view != null) {
            a(layoutParams.width, layoutParams.height);
            ATSplashView aTSplashView = this.f20793o;
            if (aTSplashView != null) {
                aTSplashView.setIconVg(view, layoutParams);
            }
        }
    }

    private ViewGroup a(u uVar) {
        ATSplashPopView aTSplashPopView = new ATSplashPopView(t.b().g(), new ATSplashPopView.a(this.f20783d, this.f20782c, uVar.a(), this.f20777C), this.f20792n);
        this.f20778D = aTSplashPopView;
        return aTSplashPopView;
    }

    private void a(int i, int i4) {
        int f6 = n.f(t.b().g());
        int g9 = n.g(t.b().g());
        int i9 = this.f20800v;
        if (i9 == 1) {
            if (g9 >= i4 * 4) {
                this.f20802x = g9 - i4;
                this.f20801w = f6;
                return;
            } else {
                this.f20802x = 0;
                this.f20801w = 0;
                return;
            }
        }
        if (i9 == 2) {
            if (f6 >= i * 4) {
                this.f20801w = f6 - i;
                this.f20802x = g9;
            } else {
                this.f20802x = 0;
                this.f20801w = 0;
            }
        }
    }

    private void a(int i, int i4, int i9, int i10) {
        try {
            ATSplashView aTSplashView = this.f20793o;
            if (aTSplashView != null) {
                aTSplashView.setNotchPadding(i, i4, i9, i10);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
