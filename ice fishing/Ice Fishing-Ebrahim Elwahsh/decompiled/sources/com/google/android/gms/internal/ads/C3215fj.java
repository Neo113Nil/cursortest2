package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.anythink.core.api.ATAdConst;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;

/* renamed from: com.google.android.gms.internal.ads.fj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3215fj extends AbstractC2539Ej {

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC3858rh f30843l;

    /* renamed from: m, reason: collision with root package name */
    public final int f30844m;

    /* renamed from: n, reason: collision with root package name */
    public final Context f30845n;

    /* renamed from: o, reason: collision with root package name */
    public final C2881Yl f30846o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC2779Sl f30847p;

    /* renamed from: q, reason: collision with root package name */
    public final Nu f30848q;

    /* renamed from: r, reason: collision with root package name */
    public final C4293zk f30849r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f30850s;

    /* renamed from: t, reason: collision with root package name */
    public final C2994bg f30851t;

    /* renamed from: u, reason: collision with root package name */
    public final C3165eo f30852u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f30853v;

    public C3215fj(S0.q qVar, Context context, InterfaceC3858rh interfaceC3858rh, int i, C2881Yl c2881Yl, InterfaceC2779Sl interfaceC2779Sl, Nu nu, C4293zk c4293zk, C2994bg c2994bg, C3165eo c3165eo) {
        super(qVar);
        this.f30853v = false;
        this.f30843l = interfaceC3858rh;
        this.f30845n = context;
        this.f30844m = i;
        this.f30846o = c2881Yl;
        this.f30847p = interfaceC2779Sl;
        this.f30848q = nu;
        this.f30849r = c4293zk;
        this.f30850s = ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.s6)).booleanValue();
        this.f30851t = c2994bg;
        this.f30852u = c3165eo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v16, types: [android.content.Context] */
    public final void c(Activity activity, boolean z8) {
        InterfaceC3858rh interfaceC3858rh;
        Ut J;
        int i;
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.f30845n;
        }
        Nu nu = this.f30848q;
        boolean z9 = this.f30850s;
        if (z9) {
            nu.u1(C3431jl.f32189z);
        }
        p2.j jVar = p2.j.f39798C;
        t2.G g9 = jVar.f39803c;
        InterfaceC2779Sl interfaceC2779Sl = this.f30847p;
        boolean m8 = t2.G.m(interfaceC2779Sl.d());
        C4293zk c4293zk = this.f30849r;
        if (!m8) {
            C3151ea c3151ea = AbstractC3368ia.bf;
            q2.r rVar = q2.r.f40116e;
            if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                t2.G.l(activity2, this.f24804b, this.f30852u);
            }
            if (((Boolean) rVar.f40119c.a(AbstractC3368ia.f31698j1)).booleanValue() && t2.G.g(activity2)) {
                int i4 = t2.C.f40822b;
                u2.i.f("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                c4293zk.c();
                if (((Boolean) rVar.f40119c.a(AbstractC3368ia.f31708k1)).booleanValue()) {
                    new Iw(activity2.getApplicationContext(), jVar.f39819t.b()).a(((Wt) this.f24803a.f29349b.f24454v).f28491b);
                    return;
                }
                return;
            }
        }
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.qd)).booleanValue() && (interfaceC3858rh = this.f30843l) != null && (J = interfaceC3858rh.J()) != null && J.f28172r0) {
            C2994bg c2994bg = this.f30851t;
            synchronized (c2994bg.f29527n) {
                C2939ag c2939ag = c2994bg.f29530w;
                synchronized (c2939ag.f29246f) {
                    i = c2939ag.f29251l;
                }
            }
            if (J.f28174s0 != i) {
                int i9 = t2.C.f40822b;
                u2.i.f("The app open consent form has been shown.");
                c4293zk.U(AbstractC3217fl.M(12, "The consent form has already been shown.", null));
                return;
            }
        }
        if (this.f30853v) {
            int i10 = t2.C.f40822b;
            u2.i.f("App open interstitial ad is already visible.");
            c4293zk.U(AbstractC3217fl.M(10, null, null));
        }
        if (this.f30853v) {
            return;
        }
        try {
            interfaceC2779Sl.h(z8, activity2, c4293zk);
            if (z9) {
                nu.v1();
            }
            this.f30853v = true;
        } catch (C2762Rl e6) {
            c4293zk.V(e6);
        }
    }

    public final void d() {
        C2540Ek c2540Ek = this.f24805c;
        c2540Ek.getClass();
        c2540Ek.u1(new C3042ca(null, false));
        InterfaceC3858rh interfaceC3858rh = this.f30843l;
        if (interfaceC3858rh != null) {
            interfaceC3858rh.destroy();
        }
    }

    public final void e(int i, long j9) {
        C2881Yl c2881Yl = this.f30846o;
        C2593Hm a9 = ((C3165eo) c2881Yl.f28862u).a();
        a9.r("gqi", ((Wt) ((C2953au) c2881Yl.f28863v).f29349b.f24454v).f28491b);
        a9.r(NativeAdvancedJsUtils.f18064p, "ad_closed");
        a9.r("show_time", String.valueOf(j9));
        a9.r(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, "app_open_ad");
        int i4 = i - 1;
        a9.r("acr", i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? "u" : "ac" : "cb" : com.anythink.expressad.f.a.b.f18576h : "bb" : "h");
        a9.s();
    }
}
