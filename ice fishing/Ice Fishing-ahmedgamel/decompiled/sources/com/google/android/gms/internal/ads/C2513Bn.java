package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.Bn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2513Bn extends AbstractC2577Fj {

    /* renamed from: l, reason: collision with root package name */
    public final Context f24714l;

    /* renamed from: m, reason: collision with root package name */
    public final WeakReference f24715m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC2883Xl f24716n;

    /* renamed from: o, reason: collision with root package name */
    public final Ku f24717o;

    /* renamed from: p, reason: collision with root package name */
    public final C2493Ak f24718p;

    /* renamed from: q, reason: collision with root package name */
    public final C2714Nk f24719q;

    /* renamed from: r, reason: collision with root package name */
    public final C2713Nj f24720r;

    /* renamed from: s, reason: collision with root package name */
    public final BinderC4082vf f24721s;

    /* renamed from: t, reason: collision with root package name */
    public final Gw f24722t;

    /* renamed from: u, reason: collision with root package name */
    public final C2968au f24723u;

    /* renamed from: v, reason: collision with root package name */
    public final C3230fo f24724v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f24725w;

    public C2513Bn(S0.q qVar, Context context, InterfaceC4084vh interfaceC4084vh, InterfaceC2883Xl interfaceC2883Xl, Ku ku, C2493Ak c2493Ak, C2714Nk c2714Nk, C2713Nj c2713Nj, St st, Gw gw, C2968au c2968au, C3230fo c3230fo) {
        super(qVar);
        this.f24725w = false;
        this.f24714l = context;
        this.f24716n = interfaceC2883Xl;
        this.f24715m = new WeakReference(interfaceC4084vh);
        this.f24717o = ku;
        this.f24718p = c2493Ak;
        this.f24719q = c2714Nk;
        this.f24720r = c2713Nj;
        this.f24722t = gw;
        C3114df c3114df = st.f28410l;
        this.f24721s = new BinderC4082vf(c3114df != null ? c3114df.f30562n : "", c3114df != null ? c3114df.f30563u : 1);
        this.f24723u = c2968au;
        this.f24724v = c3230fo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(Activity activity, boolean z6) {
        w2.D d9 = C4906k.f40186C.f40191c;
        InterfaceC2883Xl interfaceC2883Xl = this.f24716n;
        boolean m9 = w2.D.m(interfaceC2883Xl.f());
        Context context = this.f24714l;
        C2493Ak c2493Ak = this.f24718p;
        if (!m9) {
            C3324ha c3324ha = AbstractC3592ma.hf;
            s2.r rVar = s2.r.f40506e;
            if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                w2.D.l(context, this.f25623b, this.f24724v);
            }
            C3324ha c3324ha2 = AbstractC3592ma.f33058j1;
            SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha2)).booleanValue() && w2.D.g(context)) {
                int i = w2.z.f41712b;
                x2.i.f("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                c2493Ak.d();
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f33067k1)).booleanValue()) {
                    this.f24722t.a(((Ut) this.f25622a.f29533b.f25831v).f28801b);
                    return;
                }
                return;
            }
        }
        if (this.f24725w) {
            int i4 = w2.z.f41712b;
            x2.i.f("The rewarded ad have been showed.");
            c2493Ak.M(SK.F(10, null, null));
            return;
        }
        this.f24725w = true;
        C3495kl c3495kl = C3495kl.f32400z;
        Ku ku = this.f24717o;
        ku.M1(c3495kl);
        if (activity == null) {
            activity = context;
        }
        try {
            interfaceC2883Xl.e(z6, activity, c2493Ak);
            ku.R1();
        } catch (C2867Wl e9) {
            c2493Ak.K(e9);
        }
    }

    public final void finalize() {
        try {
            InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) this.f24715m.get();
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32784D7)).booleanValue()) {
                if (!this.f24725w && interfaceC4084vh != null) {
                    AbstractC3436jg.f32060f.execute(new RunnableC4032uj(interfaceC4084vh, 4));
                }
            } else if (interfaceC4084vh != null) {
                interfaceC4084vh.destroy();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }
}
