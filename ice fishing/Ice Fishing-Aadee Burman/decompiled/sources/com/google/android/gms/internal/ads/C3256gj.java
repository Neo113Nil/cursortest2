package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.anythink.core.api.ATAdConst;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.gj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3256gj extends AbstractC2557Fj {

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC4061vh f30606l;

    /* renamed from: m, reason: collision with root package name */
    public final int f30607m;

    /* renamed from: n, reason: collision with root package name */
    public final Context f30608n;

    /* renamed from: o, reason: collision with root package name */
    public final S0.l f30609o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC2844Wl f30610p;

    /* renamed from: q, reason: collision with root package name */
    public final Ku f30611q;

    /* renamed from: r, reason: collision with root package name */
    public final C2473Ak f30612r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f30613s;

    /* renamed from: t, reason: collision with root package name */
    public final C3199fg f30614t;

    /* renamed from: u, reason: collision with root package name */
    public final C3153eo f30615u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f30616v;

    public C3256gj(S0.q qVar, Context context, InterfaceC4061vh interfaceC4061vh, int i, S0.l lVar, InterfaceC2844Wl interfaceC2844Wl, Ku ku, C2473Ak c2473Ak, C3199fg c3199fg, C3153eo c3153eo) {
        super(qVar);
        this.f30616v = false;
        this.f30606l = interfaceC4061vh;
        this.f30608n = context;
        this.f30607m = i;
        this.f30609o = lVar;
        this.f30610p = interfaceC2844Wl;
        this.f30611q = ku;
        this.f30612r = c2473Ak;
        this.f30613s = ((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32367s6)).booleanValue();
        this.f30614t = c3199fg;
        this.f30615u = c3153eo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v16, types: [android.content.Context] */
    public final void c(Activity activity, boolean z3) {
        InterfaceC4061vh interfaceC4061vh;
        St K7;
        int i;
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.f30608n;
        }
        Ku ku = this.f30611q;
        boolean z6 = this.f30613s;
        if (z6) {
            ku.M1(C3472kl.f31623z);
        }
        C4835j c4835j = C4835j.f39730C;
        u2.D d2 = c4835j.f39735c;
        InterfaceC2844Wl interfaceC2844Wl = this.f30610p;
        boolean m4 = u2.D.m(interfaceC2844Wl.f());
        C2473Ak c2473Ak = this.f30612r;
        if (!m4) {
            C3301ha c3301ha = AbstractC3569ma.hf;
            q2.r rVar = q2.r.f40204e;
            if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
                u2.D.l(activity2, this.f24834b, this.f30615u);
            }
            if (((Boolean) rVar.f40207c.a(AbstractC3569ma.f32279j1)).booleanValue() && u2.D.g(activity2)) {
                int i6 = u2.z.f41319b;
                v2.i.f("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                c2473Ak.d();
                if (((Boolean) rVar.f40207c.a(AbstractC3569ma.f32288k1)).booleanValue()) {
                    new Gw(activity2.getApplicationContext(), c4835j.f39751t.b()).a(((Ut) this.f24833a.f28754b.f25043v).f28004b);
                    return;
                }
                return;
            }
        }
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.qd)).booleanValue() && (interfaceC4061vh = this.f30606l) != null && (K7 = interfaceC4061vh.K()) != null && K7.f27639r0) {
            C3199fg c3199fg = this.f30614t;
            synchronized (c3199fg.f30280n) {
                C3092dg c3092dg = c3199fg.f30283w;
                synchronized (c3092dg.f29796f) {
                    i = c3092dg.f29801l;
                }
            }
            if (K7.f27641s0 != i) {
                int i9 = u2.z.f41319b;
                v2.i.f("The app open consent form has been shown.");
                c2473Ak.G(SK.F(12, "The consent form has already been shown.", null));
                return;
            }
        }
        if (this.f30616v) {
            int i10 = u2.z.f41319b;
            v2.i.f("App open interstitial ad is already visible.");
            c2473Ak.G(SK.F(10, null, null));
        }
        if (this.f30616v) {
            return;
        }
        try {
            interfaceC2844Wl.e(z3, activity2, c2473Ak);
            if (z6) {
                ku.Q1();
            }
            this.f30616v = true;
        } catch (C2828Vl e9) {
            c2473Ak.L(e9);
        }
    }

    public final void d() {
        C2558Fk c2558Fk = this.f24835c;
        c2558Fk.getClass();
        c2558Fk.M1(new C3193fa(null, false));
        InterfaceC4061vh interfaceC4061vh = this.f30606l;
        if (interfaceC4061vh != null) {
            interfaceC4061vh.destroy();
        }
    }

    public final void e(int i, long j6) {
        S0.l lVar = this.f30609o;
        S0.e a9 = ((C3153eo) lVar.f2797u).a();
        a9.v("gqi", ((Ut) ((Yt) lVar.f2798v).f28754b.f25043v).f28004b);
        a9.v(NativeAdvancedJsUtils.f17906p, "ad_closed");
        a9.v("show_time", String.valueOf(j6));
        a9.v(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, "app_open_ad");
        int i6 = i - 1;
        a9.v("acr", i6 != 0 ? i6 != 1 ? i6 != 2 ? i6 != 3 ? i6 != 4 ? "u" : "ac" : "cb" : com.anythink.expressad.f.a.b.f18418h : "bb" : "h");
        a9.y();
    }
}
