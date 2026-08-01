package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.An, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2476An extends AbstractC2557Fj {

    /* renamed from: l, reason: collision with root package name */
    public final Context f23733l;

    /* renamed from: m, reason: collision with root package name */
    public final WeakReference f23734m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC2844Wl f23735n;

    /* renamed from: o, reason: collision with root package name */
    public final Ku f23736o;

    /* renamed from: p, reason: collision with root package name */
    public final C2473Ak f23737p;

    /* renamed from: q, reason: collision with root package name */
    public final C2694Nk f23738q;

    /* renamed from: r, reason: collision with root package name */
    public final C2693Nj f23739r;

    /* renamed from: s, reason: collision with root package name */
    public final BinderC4059vf f23740s;

    /* renamed from: t, reason: collision with root package name */
    public final Gw f23741t;

    /* renamed from: u, reason: collision with root package name */
    public final C2945au f23742u;

    /* renamed from: v, reason: collision with root package name */
    public final C3153eo f23743v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f23744w;

    public C2476An(S0.q qVar, Context context, InterfaceC4061vh interfaceC4061vh, InterfaceC2844Wl interfaceC2844Wl, Ku ku, C2473Ak c2473Ak, C2694Nk c2694Nk, C2693Nj c2693Nj, St st, Gw gw, C2945au c2945au, C3153eo c3153eo) {
        super(qVar);
        this.f23744w = false;
        this.f23733l = context;
        this.f23735n = interfaceC2844Wl;
        this.f23734m = new WeakReference(interfaceC4061vh);
        this.f23736o = ku;
        this.f23737p = c2473Ak;
        this.f23738q = c2694Nk;
        this.f23739r = c2693Nj;
        this.f23741t = gw;
        C3091df c3091df = st.f27627l;
        this.f23740s = new BinderC4059vf(c3091df != null ? c3091df.f29789n : "", c3091df != null ? c3091df.f29790u : 1);
        this.f23742u = c2945au;
        this.f23743v = c3153eo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(Activity activity, boolean z3) {
        u2.D d2 = C4835j.f39733C.f39738c;
        InterfaceC2844Wl interfaceC2844Wl = this.f23735n;
        boolean m4 = u2.D.m(interfaceC2844Wl.f());
        Context context = this.f23733l;
        C2473Ak c2473Ak = this.f23737p;
        if (!m4) {
            C3301ha c3301ha = AbstractC3569ma.hf;
            q2.r rVar = q2.r.f40207e;
            if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
                u2.D.l(context, this.f24834b, this.f23743v);
            }
            C3301ha c3301ha2 = AbstractC3569ma.f32279j1;
            SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40210c;
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha2)).booleanValue() && u2.D.g(context)) {
                int i = u2.z.f41322b;
                v2.i.f("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                c2473Ak.d();
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32288k1)).booleanValue()) {
                    this.f23741t.a(((Ut) this.f24833a.f28754b.f25043v).f28004b);
                    return;
                }
                return;
            }
        }
        if (this.f23744w) {
            int i6 = u2.z.f41322b;
            v2.i.f("The rewarded ad have been showed.");
            c2473Ak.G(SK.F(10, null, null));
            return;
        }
        this.f23744w = true;
        C3472kl c3472kl = C3472kl.f31623z;
        Ku ku = this.f23736o;
        ku.M1(c3472kl);
        if (activity == null) {
            activity = context;
        }
        try {
            interfaceC2844Wl.e(z3, activity, c2473Ak);
            ku.Q1();
        } catch (C2828Vl e9) {
            c2473Ak.L(e9);
        }
    }

    public final void finalize() {
        try {
            InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) this.f23734m.get();
            if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32004D7)).booleanValue()) {
                if (!this.f23744w && interfaceC4061vh != null) {
                    AbstractC3413jg.f31273f.execute(new RunnableC4009uj(interfaceC4061vh, 4));
                }
            } else if (interfaceC4061vh != null) {
                interfaceC4061vh.destroy();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }
}
