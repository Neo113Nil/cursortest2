package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.Bn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2492Bn extends AbstractC2539Ej {

    /* renamed from: l, reason: collision with root package name */
    public final Context f24077l;

    /* renamed from: m, reason: collision with root package name */
    public final WeakReference f24078m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC2779Sl f24079n;

    /* renamed from: o, reason: collision with root package name */
    public final Nu f24080o;

    /* renamed from: p, reason: collision with root package name */
    public final C4293zk f24081p;

    /* renamed from: q, reason: collision with root package name */
    public final C2659Lk f24082q;

    /* renamed from: r, reason: collision with root package name */
    public final C2692Nj f24083r;

    /* renamed from: s, reason: collision with root package name */
    public final BinderC3910sf f24084s;

    /* renamed from: t, reason: collision with root package name */
    public final Iw f24085t;

    /* renamed from: u, reason: collision with root package name */
    public final C3116du f24086u;

    /* renamed from: v, reason: collision with root package name */
    public final C3165eo f24087v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f24088w;

    public C2492Bn(S0.q qVar, Context context, InterfaceC3858rh interfaceC3858rh, InterfaceC2779Sl interfaceC2779Sl, Nu nu, C4293zk c4293zk, C2659Lk c2659Lk, C2692Nj c2692Nj, Ut ut, Iw iw, C3116du c3116du, C3165eo c3165eo) {
        super(qVar);
        this.f24088w = false;
        this.f24077l = context;
        this.f24079n = interfaceC2779Sl;
        this.f24078m = new WeakReference(interfaceC3858rh);
        this.f24080o = nu;
        this.f24081p = c4293zk;
        this.f24082q = c2659Lk;
        this.f24083r = c2692Nj;
        this.f24085t = iw;
        C2938af c2938af = ut.f28160l;
        this.f24084s = new BinderC3910sf(c2938af != null ? c2938af.f29239n : "", c2938af != null ? c2938af.f29240u : 1);
        this.f24086u = c3116du;
        this.f24087v = c3165eo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(Activity activity, boolean z8) {
        t2.G g9 = p2.j.f39798C.f39803c;
        InterfaceC2779Sl interfaceC2779Sl = this.f24079n;
        boolean m8 = t2.G.m(interfaceC2779Sl.d());
        Context context = this.f24077l;
        C4293zk c4293zk = this.f24081p;
        if (!m8) {
            C3151ea c3151ea = AbstractC3368ia.bf;
            q2.r rVar = q2.r.f40116e;
            if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                t2.G.l(context, this.f24804b, this.f24087v);
            }
            C3151ea c3151ea2 = AbstractC3368ia.f31698j1;
            SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea2)).booleanValue() && t2.G.g(context)) {
                int i = t2.C.f40822b;
                u2.i.f("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                c4293zk.c();
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31708k1)).booleanValue()) {
                    this.f24085t.a(((Wt) this.f24803a.f29349b.f24454v).f28491b);
                    return;
                }
                return;
            }
        }
        if (this.f24088w) {
            int i4 = t2.C.f40822b;
            u2.i.f("The rewarded ad have been showed.");
            c4293zk.U(AbstractC3217fl.M(10, null, null));
            return;
        }
        this.f24088w = true;
        C3431jl c3431jl = C3431jl.f32189z;
        Nu nu = this.f24080o;
        nu.u1(c3431jl);
        if (activity == null) {
            activity = context;
        }
        try {
            interfaceC2779Sl.h(z8, activity, c4293zk);
            nu.v1();
        } catch (C2762Rl e6) {
            c4293zk.V(e6);
        }
    }

    public final void finalize() {
        try {
            InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) this.f24078m.get();
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31424D7)).booleanValue()) {
                if (!this.f24088w && interfaceC3858rh != null) {
                    AbstractC3212fg.f30743f.execute(new RunnableC3968tj(interfaceC3858rh, 4));
                }
            } else if (interfaceC3858rh != null) {
                interfaceC3858rh.destroy();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }
}
