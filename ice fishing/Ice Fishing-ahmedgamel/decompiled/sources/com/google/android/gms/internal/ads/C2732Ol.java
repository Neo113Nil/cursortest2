package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.Ol, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2732Ol extends AbstractC2577Fj {

    /* renamed from: l, reason: collision with root package name */
    public final Context f27426l;

    /* renamed from: m, reason: collision with root package name */
    public final WeakReference f27427m;

    /* renamed from: n, reason: collision with root package name */
    public final Ku f27428n;

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC2883Xl f27429o;

    /* renamed from: p, reason: collision with root package name */
    public final C2713Nj f27430p;

    /* renamed from: q, reason: collision with root package name */
    public final Gw f27431q;

    /* renamed from: r, reason: collision with root package name */
    public final C2493Ak f27432r;

    /* renamed from: s, reason: collision with root package name */
    public final C3222fg f27433s;

    /* renamed from: t, reason: collision with root package name */
    public final C3230fo f27434t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f27435u;

    public C2732Ol(S0.q qVar, Context context, InterfaceC4084vh interfaceC4084vh, Ku ku, InterfaceC2883Xl interfaceC2883Xl, C2713Nj c2713Nj, Gw gw, C2493Ak c2493Ak, C3222fg c3222fg, C3230fo c3230fo) {
        super(qVar);
        this.f27435u = false;
        this.f27426l = context;
        this.f27427m = new WeakReference(interfaceC4084vh);
        this.f27428n = ku;
        this.f27429o = interfaceC2883Xl;
        this.f27430p = c2713Nj;
        this.f27431q = gw;
        this.f27432r = c2493Ak;
        this.f27433s = c3222fg;
        this.f27434t = c3230fo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(Activity activity, boolean z6) {
        St J;
        int i;
        Ku ku = this.f27428n;
        ku.M1(C3495kl.f32400z);
        w2.D d9 = C4906k.f40186C.f40191c;
        InterfaceC2883Xl interfaceC2883Xl = this.f27429o;
        boolean m9 = w2.D.m(interfaceC2883Xl.f());
        Context context = this.f27426l;
        C2493Ak c2493Ak = this.f27432r;
        if (!m9) {
            C3324ha c3324ha = AbstractC3592ma.hf;
            s2.r rVar = s2.r.f40506e;
            if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                w2.D.l(context, this.f25623b, this.f27434t);
            }
            if (((Boolean) rVar.f40509c.a(AbstractC3592ma.f33058j1)).booleanValue() && w2.D.g(context)) {
                int i4 = w2.z.f41712b;
                x2.i.f("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://goo.gle/admob-interstitial-policies");
                c2493Ak.d();
                if (((Boolean) rVar.f40509c.a(AbstractC3592ma.f33067k1)).booleanValue()) {
                    this.f27431q.a(((Ut) this.f25622a.f29533b.f25831v).f28801b);
                    return;
                }
                return;
            }
        }
        InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) this.f27427m.get();
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.qd)).booleanValue() && interfaceC4084vh != null && (J = interfaceC4084vh.J()) != null && J.f28422r0) {
            C3222fg c3222fg = this.f27433s;
            synchronized (c3222fg.f31068n) {
                C3115dg c3115dg = c3222fg.f31071w;
                synchronized (c3115dg.f30569f) {
                    i = c3115dg.f30574l;
                }
            }
            if (J.f28424s0 != i) {
                int i6 = w2.z.f41712b;
                x2.i.f("The interstitial consent form has been shown.");
                c2493Ak.M(SK.F(12, "The consent form has already been shown.", null));
                return;
            }
        }
        if (this.f27435u) {
            int i9 = w2.z.f41712b;
            x2.i.f("The interstitial ad has been shown.");
            c2493Ak.M(SK.F(10, null, null));
        }
        if (this.f27435u) {
            return;
        }
        if (activity == null) {
            activity = context;
        }
        try {
            interfaceC2883Xl.e(z6, activity, c2493Ak);
            ku.R1();
            this.f27435u = true;
        } catch (C2867Wl e9) {
            c2493Ak.K(e9);
        }
    }

    public final void finalize() {
        try {
            InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) this.f27427m.get();
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32784D7)).booleanValue()) {
                if (!this.f27435u && interfaceC4084vh != null) {
                    AbstractC3436jg.f32060f.execute(new RunnableC4032uj(interfaceC4084vh, 2));
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
