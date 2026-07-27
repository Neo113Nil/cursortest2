package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import p2.C4856a;
import q2.InterfaceC4877a;

/* renamed from: com.google.android.gms.internal.ads.In, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2611In {

    /* renamed from: a, reason: collision with root package name */
    public final C3808qk f25592a;

    /* renamed from: b, reason: collision with root package name */
    public final C2507Cl f25593b;

    /* renamed from: c, reason: collision with root package name */
    public final C2557Fk f25594c;

    /* renamed from: d, reason: collision with root package name */
    public final C2659Lk f25595d;

    /* renamed from: e, reason: collision with root package name */
    public final C2727Pk f25596e;

    /* renamed from: f, reason: collision with root package name */
    public final C3325hl f25597f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f25598g;

    /* renamed from: h, reason: collision with root package name */
    public final C2490Bl f25599h;
    public final C2895Zi i;

    /* renamed from: j, reason: collision with root package name */
    public final C4856a f25600j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC4180xf f25601k;

    /* renamed from: l, reason: collision with root package name */
    public final C3348i7 f25602l;

    /* renamed from: m, reason: collision with root package name */
    public final C3053cl f25603m;

    /* renamed from: n, reason: collision with root package name */
    public final C2834Vp f25604n;

    /* renamed from: o, reason: collision with root package name */
    public final Av f25605o;

    /* renamed from: p, reason: collision with root package name */
    public final C3165eo f25606p;

    /* renamed from: q, reason: collision with root package name */
    public final C2657Li f25607q;

    /* renamed from: r, reason: collision with root package name */
    public final C2679Mn f25608r;

    /* renamed from: s, reason: collision with root package name */
    public final C3758po f25609s;

    /* renamed from: t, reason: collision with root package name */
    public final C3484kk f25610t;

    /* renamed from: u, reason: collision with root package name */
    public final C3270gk f25611u;

    public C2611In(C3808qk c3808qk, C2557Fk c2557Fk, C2659Lk c2659Lk, C2727Pk c2727Pk, C3325hl c3325hl, Executor executor, C2490Bl c2490Bl, C2895Zi c2895Zi, C4856a c4856a, InterfaceC4180xf interfaceC4180xf, C3348i7 c3348i7, C3053cl c3053cl, C2834Vp c2834Vp, Av av, C3165eo c3165eo, C2507Cl c2507Cl, C2657Li c2657Li, C2679Mn c2679Mn, C3758po c3758po, C3484kk c3484kk, C3270gk c3270gk) {
        this.f25592a = c3808qk;
        this.f25594c = c2557Fk;
        this.f25595d = c2659Lk;
        this.f25596e = c2727Pk;
        this.f25597f = c3325hl;
        this.f25598g = executor;
        this.f25599h = c2490Bl;
        this.i = c2895Zi;
        this.f25600j = c4856a;
        this.f25601k = interfaceC4180xf;
        this.f25602l = c3348i7;
        this.f25603m = c3053cl;
        this.f25604n = c2834Vp;
        this.f25605o = av;
        this.f25606p = c3165eo;
        this.f25593b = c2507Cl;
        this.f25607q = c2657Li;
        this.f25608r = c2679Mn;
        this.f25609s = c3758po;
        this.f25610t = c3484kk;
        this.f25611u = c3270gk;
    }

    public static final C3320hg b(InterfaceC3858rh interfaceC3858rh, String str, String str2, C3002bo c3002bo, Yu yu) {
        C3151ea c3151ea = AbstractC3368ia.f31494M2;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            com.anythink.basead.b.c.i.u(p2.j.f39798C.f39810k, c3002bo, "rendering-webview-load-html-start");
        }
        C3320hg c3320hg = new C3320hg();
        if (((Boolean) rVar.f40119c.a(AbstractC3368ia.fa)).booleanValue()) {
            Vu f6 = Vu.f(interfaceC3858rh.getContext(), 112);
            f6.a();
            PA.Q(c3320hg, yu, f6, false);
        }
        interfaceC3858rh.j0().f25412z = new C2593Hm(2, c3002bo, c3320hg);
        interfaceC3858rh.z0(str, str2);
        return c3320hg;
    }

    public final void a(InterfaceC3858rh interfaceC3858rh, boolean z8, C3153ec c3153ec, C3002bo c3002bo) {
        InterfaceC3240g7 interfaceC3240g7;
        C3151ea c3151ea = AbstractC3368ia.f31494M2;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            com.anythink.basead.b.c.i.u(p2.j.f39798C.f39810k, c3002bo, "rendering-configure-webview-start");
        }
        interfaceC3858rh.j0().l(new InterfaceC4877a() { // from class: com.google.android.gms.internal.ads.Hn
            @Override // q2.InterfaceC4877a
            public final /* synthetic */ void onAdClicked() {
                C2611In.this.f25592a.onAdClicked();
            }
        }, this.f25595d, this.f25596e, new InterfaceC2786Tb() { // from class: com.google.android.gms.internal.ads.Fn
            @Override // com.google.android.gms.internal.ads.InterfaceC2786Tb
            public final /* synthetic */ void m0(String str, String str2) {
                C2611In.this.f25597f.m0(str, str2);
            }
        }, new C3864rn(2, this), z8, c3153ec, this.f25600j, new Rx(this), this.f25601k, this.f25604n, this.f25605o, this.f25606p, null, this.f25593b, null, null, null, this.f25607q, this.f25609s, this.f25610t, this.f25611u);
        interfaceC3858rh.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.Gn
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C2611In c2611In = C2611In.this;
                c2611In.getClass();
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.vb)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
                    c2611In.f25608r.f26374a = motionEvent;
                }
                c2611In.f25600j.f39758b = true;
                if (view == null) {
                    return false;
                }
                view.performClick();
                return false;
            }
        });
        interfaceC3858rh.setOnClickListener(new ViewOnClickListenerC2822Vd(this));
        C3151ea c3151ea2 = AbstractC3368ia.f31810v3;
        SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea2)).booleanValue() && (interfaceC3240g7 = this.f25602l.f31319b) != null) {
            interfaceC3240g7.g(interfaceC3858rh.b0());
        }
        C2490Bl c2490Bl = this.f25599h;
        Executor executor = this.f25598g;
        c2490Bl.s1(interfaceC3858rh, executor);
        c2490Bl.s1(new C3110dn(interfaceC3858rh, 2), executor);
        c2490Bl.v1(interfaceC3858rh.b0());
        interfaceC3858rh.N0("/trackActiveViewUnit", new C2871Yb(5, this, interfaceC3858rh));
        C2895Zi c2895Zi = this.i;
        c2895Zi.getClass();
        c2895Zi.f29046C = new WeakReference(interfaceC3858rh);
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea)).booleanValue()) {
            com.anythink.basead.b.c.i.u(p2.j.f39798C.f39810k, c3002bo, "rendering-configure-webview-end");
        }
    }
}
