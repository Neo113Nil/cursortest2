package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.Nl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2695Nl extends AbstractC2557Fj {

    /* renamed from: l, reason: collision with root package name */
    public final Context f26522l;

    /* renamed from: m, reason: collision with root package name */
    public final WeakReference f26523m;

    /* renamed from: n, reason: collision with root package name */
    public final Ku f26524n;

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC2844Wl f26525o;

    /* renamed from: p, reason: collision with root package name */
    public final C2693Nj f26526p;

    /* renamed from: q, reason: collision with root package name */
    public final Gw f26527q;

    /* renamed from: r, reason: collision with root package name */
    public final C2473Ak f26528r;

    /* renamed from: s, reason: collision with root package name */
    public final C3199fg f26529s;

    /* renamed from: t, reason: collision with root package name */
    public final C3153eo f26530t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f26531u;

    public C2695Nl(S0.q qVar, Context context, InterfaceC4061vh interfaceC4061vh, Ku ku, InterfaceC2844Wl interfaceC2844Wl, C2693Nj c2693Nj, Gw gw, C2473Ak c2473Ak, C3199fg c3199fg, C3153eo c3153eo) {
        super(qVar);
        this.f26531u = false;
        this.f26522l = context;
        this.f26523m = new WeakReference(interfaceC4061vh);
        this.f26524n = ku;
        this.f26525o = interfaceC2844Wl;
        this.f26526p = c2693Nj;
        this.f26527q = gw;
        this.f26528r = c2473Ak;
        this.f26529s = c3199fg;
        this.f26530t = c3153eo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(Activity activity, boolean z3) {
        St K7;
        int i;
        Ku ku = this.f26524n;
        ku.M1(C3472kl.f31623z);
        u2.D d2 = C4835j.f39733C.f39738c;
        InterfaceC2844Wl interfaceC2844Wl = this.f26525o;
        boolean m4 = u2.D.m(interfaceC2844Wl.f());
        Context context = this.f26522l;
        C2473Ak c2473Ak = this.f26528r;
        if (!m4) {
            C3301ha c3301ha = AbstractC3569ma.hf;
            q2.r rVar = q2.r.f40207e;
            if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
                u2.D.l(context, this.f24834b, this.f26530t);
            }
            if (((Boolean) rVar.f40210c.a(AbstractC3569ma.f32279j1)).booleanValue() && u2.D.g(context)) {
                int i6 = u2.z.f41322b;
                v2.i.f("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://goo.gle/admob-interstitial-policies");
                c2473Ak.d();
                if (((Boolean) rVar.f40210c.a(AbstractC3569ma.f32288k1)).booleanValue()) {
                    this.f26527q.a(((Ut) this.f24833a.f28754b.f25043v).f28004b);
                    return;
                }
                return;
            }
        }
        InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) this.f26523m.get();
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.qd)).booleanValue() && interfaceC4061vh != null && (K7 = interfaceC4061vh.K()) != null && K7.f27639r0) {
            C3199fg c3199fg = this.f26529s;
            synchronized (c3199fg.f30280n) {
                C3092dg c3092dg = c3199fg.f30283w;
                synchronized (c3092dg.f29796f) {
                    i = c3092dg.f29801l;
                }
            }
            if (K7.f27641s0 != i) {
                int i9 = u2.z.f41322b;
                v2.i.f("The interstitial consent form has been shown.");
                c2473Ak.G(SK.F(12, "The consent form has already been shown.", null));
                return;
            }
        }
        if (this.f26531u) {
            int i10 = u2.z.f41322b;
            v2.i.f("The interstitial ad has been shown.");
            c2473Ak.G(SK.F(10, null, null));
        }
        if (this.f26531u) {
            return;
        }
        if (activity == null) {
            activity = context;
        }
        try {
            interfaceC2844Wl.e(z3, activity, c2473Ak);
            ku.Q1();
            this.f26531u = true;
        } catch (C2828Vl e9) {
            c2473Ak.L(e9);
        }
    }

    public final void finalize() {
        try {
            InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) this.f26523m.get();
            if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32004D7)).booleanValue()) {
                if (!this.f26531u && interfaceC4061vh != null) {
                    AbstractC3413jg.f31273f.execute(new RunnableC4009uj(interfaceC4061vh, 2));
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
