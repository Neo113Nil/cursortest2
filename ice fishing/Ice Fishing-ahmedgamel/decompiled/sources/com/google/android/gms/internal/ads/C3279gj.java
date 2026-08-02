package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.anythink.core.api.ATAdConst;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.gj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3279gj extends AbstractC2577Fj {

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC4084vh f31373l;

    /* renamed from: m, reason: collision with root package name */
    public final int f31374m;

    /* renamed from: n, reason: collision with root package name */
    public final Context f31375n;

    /* renamed from: o, reason: collision with root package name */
    public final S0.l f31376o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC2883Xl f31377p;

    /* renamed from: q, reason: collision with root package name */
    public final Ku f31378q;

    /* renamed from: r, reason: collision with root package name */
    public final C2493Ak f31379r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f31380s;

    /* renamed from: t, reason: collision with root package name */
    public final C3222fg f31381t;

    /* renamed from: u, reason: collision with root package name */
    public final C3230fo f31382u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f31383v;

    public C3279gj(S0.q qVar, Context context, InterfaceC4084vh interfaceC4084vh, int i, S0.l lVar, InterfaceC2883Xl interfaceC2883Xl, Ku ku, C2493Ak c2493Ak, C3222fg c3222fg, C3230fo c3230fo) {
        super(qVar);
        this.f31383v = false;
        this.f31373l = interfaceC4084vh;
        this.f31375n = context;
        this.f31374m = i;
        this.f31376o = lVar;
        this.f31377p = interfaceC2883Xl;
        this.f31378q = ku;
        this.f31379r = c2493Ak;
        this.f31380s = ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33146s6)).booleanValue();
        this.f31381t = c3222fg;
        this.f31382u = c3230fo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v16, types: [android.content.Context] */
    public final void c(Activity activity, boolean z6) {
        InterfaceC4084vh interfaceC4084vh;
        St J;
        int i;
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.f31375n;
        }
        Ku ku = this.f31378q;
        boolean z9 = this.f31380s;
        if (z9) {
            ku.M1(C3495kl.f32400z);
        }
        C4906k c4906k = C4906k.f40186C;
        w2.D d9 = c4906k.f40191c;
        InterfaceC2883Xl interfaceC2883Xl = this.f31377p;
        boolean m9 = w2.D.m(interfaceC2883Xl.f());
        C2493Ak c2493Ak = this.f31379r;
        if (!m9) {
            C3324ha c3324ha = AbstractC3592ma.hf;
            s2.r rVar = s2.r.f40506e;
            if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                w2.D.l(activity2, this.f25623b, this.f31382u);
            }
            if (((Boolean) rVar.f40509c.a(AbstractC3592ma.f33058j1)).booleanValue() && w2.D.g(activity2)) {
                int i4 = w2.z.f41712b;
                x2.i.f("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                c2493Ak.d();
                if (((Boolean) rVar.f40509c.a(AbstractC3592ma.f33067k1)).booleanValue()) {
                    new Gw(activity2.getApplicationContext(), c4906k.f40207t.b()).a(((Ut) this.f25622a.f29533b.f25831v).f28801b);
                    return;
                }
                return;
            }
        }
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.qd)).booleanValue() && (interfaceC4084vh = this.f31373l) != null && (J = interfaceC4084vh.J()) != null && J.f28422r0) {
            C3222fg c3222fg = this.f31381t;
            synchronized (c3222fg.f31068n) {
                C3115dg c3115dg = c3222fg.f31071w;
                synchronized (c3115dg.f30569f) {
                    i = c3115dg.f30574l;
                }
            }
            if (J.f28424s0 != i) {
                int i6 = w2.z.f41712b;
                x2.i.f("The app open consent form has been shown.");
                c2493Ak.M(SK.F(12, "The consent form has already been shown.", null));
                return;
            }
        }
        if (this.f31383v) {
            int i9 = w2.z.f41712b;
            x2.i.f("App open interstitial ad is already visible.");
            c2493Ak.M(SK.F(10, null, null));
        }
        if (this.f31383v) {
            return;
        }
        try {
            interfaceC2883Xl.e(z6, activity2, c2493Ak);
            if (z9) {
                ku.R1();
            }
            this.f31383v = true;
        } catch (C2867Wl e9) {
            c2493Ak.K(e9);
        }
    }

    public final void d() {
        C2578Fk c2578Fk = this.f25624c;
        c2578Fk.getClass();
        c2578Fk.M1(new C3216fa(null, false));
        InterfaceC4084vh interfaceC4084vh = this.f31373l;
        if (interfaceC4084vh != null) {
            interfaceC4084vh.destroy();
        }
    }

    public final void e(int i, long j6) {
        S0.l lVar = this.f31376o;
        S0.e a9 = ((C3230fo) lVar.f2926u).a();
        a9.M("gqi", ((Ut) ((Yt) lVar.f2927v).f29533b.f25831v).f28801b);
        a9.M(NativeAdvancedJsUtils.f18693p, "ad_closed");
        a9.M("show_time", String.valueOf(j6));
        a9.M(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, "app_open_ad");
        int i4 = i - 1;
        a9.M("acr", i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? "u" : "ac" : "cb" : com.anythink.expressad.f.a.b.f19205h : "bb" : "h");
        a9.N();
    }
}
