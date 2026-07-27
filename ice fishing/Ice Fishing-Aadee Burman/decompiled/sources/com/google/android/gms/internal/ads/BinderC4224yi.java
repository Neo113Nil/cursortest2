package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import p.AbstractC4816f;
import p2.C4835j;
import q2.AbstractBinderC4881f0;
import q2.C4900p;
import q2.InterfaceC4899o0;
import u2.C5069B;
import u2.C5070a;
import u2.C5076g;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.yi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC4224yi extends AbstractBinderC4881f0 {

    /* renamed from: A, reason: collision with root package name */
    public final C2782Sn f35196A;

    /* renamed from: B, reason: collision with root package name */
    public final C2749Qo f35197B;

    /* renamed from: C, reason: collision with root package name */
    public final C3429jw f35198C;

    /* renamed from: D, reason: collision with root package name */
    public final Wu f35199D;

    /* renamed from: E, reason: collision with root package name */
    public final C3481ku f35200E;

    /* renamed from: F, reason: collision with root package name */
    public final C2874Yj f35201F;

    /* renamed from: G, reason: collision with root package name */
    public final C3153eo f35202G;

    /* renamed from: H, reason: collision with root package name */
    public final C3047cp f35203H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f35204I = false;
    public final Long J;

    /* renamed from: n, reason: collision with root package name */
    public final Context f35205n;

    /* renamed from: u, reason: collision with root package name */
    public final C5110a f35206u;

    /* renamed from: v, reason: collision with root package name */
    public final C2748Qn f35207v;

    /* renamed from: w, reason: collision with root package name */
    public final InterfaceC3423jq f35208w;

    /* renamed from: x, reason: collision with root package name */
    public final C3963tr f35209x;

    /* renamed from: y, reason: collision with root package name */
    public final C2494Bo f35210y;

    /* renamed from: z, reason: collision with root package name */
    public final C2621Jf f35211z;

    public BinderC4224yi(Context context, C5110a c5110a, C2748Qn c2748Qn, InterfaceC3423jq interfaceC3423jq, C3963tr c3963tr, C2494Bo c2494Bo, C2621Jf c2621Jf, C2782Sn c2782Sn, C2749Qo c2749Qo, C3429jw c3429jw, Wu wu, C3481ku c3481ku, C2874Yj c2874Yj, C3153eo c3153eo, C3047cp c3047cp) {
        this.f35205n = context;
        this.f35206u = c5110a;
        this.f35207v = c2748Qn;
        this.f35208w = interfaceC3423jq;
        this.f35209x = c3963tr;
        this.f35210y = c2494Bo;
        this.f35211z = c2621Jf;
        this.f35196A = c2782Sn;
        this.f35197B = c2749Qo;
        this.f35198C = c3429jw;
        this.f35199D = wu;
        this.f35200E = c3481ku;
        this.f35201F = c2874Yj;
        this.f35202G = c3153eo;
        this.f35203H = c3047cp;
        C4835j.f39730C.f39742k.getClass();
        this.J = Long.valueOf(SystemClock.elapsedRealtime());
    }

    @Override // q2.InterfaceC4883g0
    public final void C() {
        this.f35210y.f23968q = false;
    }

    @Override // q2.InterfaceC4883g0
    public final void C0(boolean z3) {
        try {
            Qx.f(this.f35205n).k(z3);
        } catch (IOException e9) {
            throw new RemoteException(e9.getMessage());
        }
    }

    @Override // q2.InterfaceC4883g0
    public final void E1(String str) {
        this.f35209x.b(str);
    }

    @Override // q2.InterfaceC4883g0
    public final void F2(W2.a aVar, String str) {
        if (aVar == null) {
            int i = u2.z.f41319b;
            v2.i.c("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) W2.b.F0(aVar);
        if (context == null) {
            int i6 = u2.z.f41319b;
            v2.i.c("Context is null. Failed to open debug menu.");
        } else {
            C5076g c5076g = new C5076g(context);
            c5076g.f41271d = str;
            c5076g.f41272e = this.f35206u.f41388n;
            c5076g.b();
        }
    }

    @Override // q2.InterfaceC4883g0
    public final void J1(InterfaceC4899o0 interfaceC4899o0) {
        this.f35197B.e(interfaceC4899o0, EnumC2732Po.f26862u);
    }

    @Override // q2.InterfaceC4883g0
    public final synchronized void R2(String str) {
        Context context = this.f35205n;
        AbstractC3569ma.a(context);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32128S4)).booleanValue()) {
                C4835j.f39730C.f39743l.x(context, this.f35206u, true, null, str, null, null, this.f35199D, null, null, this.f35197B.f());
            }
        }
    }

    @Override // q2.InterfaceC4883g0
    public final void S3(InterfaceC2516Dc interfaceC2516Dc) {
        C2494Bo c2494Bo = this.f35210y;
        c2494Bo.getClass();
        c2494Bo.f23957e.f31479n.a(new RunnableC3973u0(28, c2494Bo, interfaceC2516Dc), c2494Bo.f23961j);
    }

    @Override // q2.InterfaceC4883g0
    public final void U(String str) {
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.La)).booleanValue()) {
            C4835j.f39730C.f39740h.f29523g = str;
        }
    }

    @Override // q2.InterfaceC4883g0
    public final synchronized void Z(boolean z3) {
        C5070a c5070a = C4835j.f39730C.i;
        synchronized (c5070a) {
            c5070a.f41249a = z3;
        }
    }

    @Override // q2.InterfaceC4883g0
    public final void c2(InterfaceC3572md interfaceC3572md) {
        this.f35200E.u(interfaceC3572md);
    }

    @Override // q2.InterfaceC4883g0
    public final synchronized void d() {
        final int i = 1;
        final int i6 = 0;
        final int i9 = 2;
        synchronized (this) {
            if (this.f35204I) {
                int i10 = u2.z.f41319b;
                v2.i.f("Mobile ads is initialized already.");
                return;
            }
            C3301ha c3301ha = AbstractC3569ma.f32235e3;
            q2.r rVar = q2.r.f40204e;
            if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
                C4900p.a();
            }
            Context context = this.f35205n;
            AbstractC3569ma.a(context);
            C5110a c5110a = this.f35206u;
            C3153eo c3153eo = this.f35202G;
            C4835j c4835j = C4835j.f39730C;
            c4835j.f39740h.b(context, c5110a, c3153eo);
            this.f35201F.a();
            c4835j.f39741j.c(context);
            this.f35204I = true;
            this.f35210y.a();
            C3963tr c3963tr = this.f35209x;
            c3963tr.getClass();
            C5069B g4 = c4835j.f39740h.g();
            g4.f41208c.add(new RunnableC3909sr(c3963tr, 2));
            c3963tr.f34409f.execute(new RunnableC3909sr(c3963tr, 0));
            if (((Boolean) rVar.f40207c.a(AbstractC3569ma.f32145U4)).booleanValue()) {
                C2782Sn c2782Sn = this.f35196A;
                if (!c2782Sn.f27554f.getAndSet(true)) {
                    C5069B g9 = c4835j.f39740h.g();
                    g9.f41208c.add(new RunnableC2765Rn(c2782Sn, 0));
                }
                c2782Sn.f27551c.execute(new RunnableC2765Rn(c2782Sn, 2));
            }
            this.f35197B.a();
            if (((Boolean) rVar.f40207c.a(AbstractC3569ma.za)).booleanValue()) {
                final int i11 = 3;
                AbstractC3413jg.f31268a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.wi

                    /* renamed from: u, reason: collision with root package name */
                    public final /* synthetic */ BinderC4224yi f34867u;

                    {
                        this.f34867u = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        String b9;
                        C3194fb c3194fb;
                        boolean z3;
                        String str;
                        switch (i11) {
                            case 0:
                                AbstractC2639Kg.h(this.f34867u.f35205n, true);
                                return;
                            case 1:
                                BinderC4224yi binderC4224yi = this.f34867u;
                                binderC4224yi.getClass();
                                C4054va c4054va = C4835j.f39730C.f39745n;
                                if (c4054va.f34705n.getAndSet(true)) {
                                    return;
                                }
                                Context context2 = binderC4224yi.f35205n;
                                c4054va.f34706u = context2;
                                c4054va.f34707v = binderC4224yi.f35202G;
                                if (c4054va.f34709x != null || context2 == null || (b9 = AbstractC4816f.b(context2)) == null || b9.equals(context2.getPackageName())) {
                                    return;
                                }
                                AbstractC4816f.a(context2, b9, c4054va);
                                return;
                            case 2:
                                BinderC4224yi binderC4224yi2 = this.f34867u;
                                binderC4224yi2.getClass();
                                BinderC2535Ee binderC2535Ee = new BinderC2535Ee("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                                C3429jw c3429jw = binderC4224yi2.f35198C;
                                c3429jw.getClass();
                                try {
                                    try {
                                        IBinder b10 = com.bumptech.glide.f.D(c3429jw.f31351a).b("com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy");
                                        if (b10 == null) {
                                            c3194fb = null;
                                        } else {
                                            IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                                            c3194fb = queryLocalInterface instanceof C3194fb ? (C3194fb) queryLocalInterface : new C3194fb(b10, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy", 2);
                                        }
                                        Parcel H02 = c3194fb.H0();
                                        AbstractC3388j8.e(H02, binderC2535Ee);
                                        c3194fb.f1(H02, 1);
                                        return;
                                    } catch (Exception e9) {
                                        throw new v2.j(e9);
                                    }
                                } catch (RemoteException e10) {
                                    v2.i.f("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e10.getMessage())));
                                    return;
                                } catch (v2.j e11) {
                                    v2.i.f("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e11.getMessage())));
                                    return;
                                }
                            default:
                                BinderC4224yi binderC4224yi3 = this.f34867u;
                                binderC4224yi3.getClass();
                                C4835j c4835j2 = C4835j.f39730C;
                                C5069B g10 = c4835j2.f39740h.g();
                                g10.i();
                                synchronized (g10.f41206a) {
                                    z3 = g10.f41229y;
                                }
                                if (z3) {
                                    C5069B g11 = c4835j2.f39740h.g();
                                    g11.i();
                                    synchronized (g11.f41206a) {
                                        str = g11.f41230z;
                                    }
                                    if (c4835j2.f39746o.b(binderC4224yi3.f35205n, str, binderC4224yi3.f35206u.f41388n)) {
                                        return;
                                    }
                                    c4835j2.f39740h.g().e(false);
                                    c4835j2.f39740h.g().f("");
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            if (((Boolean) rVar.f40207c.a(AbstractC3569ma.qc)).booleanValue()) {
                AbstractC3413jg.f31268a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.wi

                    /* renamed from: u, reason: collision with root package name */
                    public final /* synthetic */ BinderC4224yi f34867u;

                    {
                        this.f34867u = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        String b9;
                        C3194fb c3194fb;
                        boolean z3;
                        String str;
                        switch (i9) {
                            case 0:
                                AbstractC2639Kg.h(this.f34867u.f35205n, true);
                                return;
                            case 1:
                                BinderC4224yi binderC4224yi = this.f34867u;
                                binderC4224yi.getClass();
                                C4054va c4054va = C4835j.f39730C.f39745n;
                                if (c4054va.f34705n.getAndSet(true)) {
                                    return;
                                }
                                Context context2 = binderC4224yi.f35205n;
                                c4054va.f34706u = context2;
                                c4054va.f34707v = binderC4224yi.f35202G;
                                if (c4054va.f34709x != null || context2 == null || (b9 = AbstractC4816f.b(context2)) == null || b9.equals(context2.getPackageName())) {
                                    return;
                                }
                                AbstractC4816f.a(context2, b9, c4054va);
                                return;
                            case 2:
                                BinderC4224yi binderC4224yi2 = this.f34867u;
                                binderC4224yi2.getClass();
                                BinderC2535Ee binderC2535Ee = new BinderC2535Ee("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                                C3429jw c3429jw = binderC4224yi2.f35198C;
                                c3429jw.getClass();
                                try {
                                    try {
                                        IBinder b10 = com.bumptech.glide.f.D(c3429jw.f31351a).b("com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy");
                                        if (b10 == null) {
                                            c3194fb = null;
                                        } else {
                                            IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                                            c3194fb = queryLocalInterface instanceof C3194fb ? (C3194fb) queryLocalInterface : new C3194fb(b10, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy", 2);
                                        }
                                        Parcel H02 = c3194fb.H0();
                                        AbstractC3388j8.e(H02, binderC2535Ee);
                                        c3194fb.f1(H02, 1);
                                        return;
                                    } catch (Exception e9) {
                                        throw new v2.j(e9);
                                    }
                                } catch (RemoteException e10) {
                                    v2.i.f("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e10.getMessage())));
                                    return;
                                } catch (v2.j e11) {
                                    v2.i.f("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e11.getMessage())));
                                    return;
                                }
                            default:
                                BinderC4224yi binderC4224yi3 = this.f34867u;
                                binderC4224yi3.getClass();
                                C4835j c4835j2 = C4835j.f39730C;
                                C5069B g10 = c4835j2.f39740h.g();
                                g10.i();
                                synchronized (g10.f41206a) {
                                    z3 = g10.f41229y;
                                }
                                if (z3) {
                                    C5069B g11 = c4835j2.f39740h.g();
                                    g11.i();
                                    synchronized (g11.f41206a) {
                                        str = g11.f41230z;
                                    }
                                    if (c4835j2.f39746o.b(binderC4224yi3.f35205n, str, binderC4224yi3.f35206u.f41388n)) {
                                        return;
                                    }
                                    c4835j2.f39740h.g().e(false);
                                    c4835j2.f39740h.g().f("");
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            if (((Boolean) rVar.f40207c.a(AbstractC3569ma.f32118R3)).booleanValue()) {
                AbstractC3413jg.f31268a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.wi

                    /* renamed from: u, reason: collision with root package name */
                    public final /* synthetic */ BinderC4224yi f34867u;

                    {
                        this.f34867u = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        String b9;
                        C3194fb c3194fb;
                        boolean z3;
                        String str;
                        switch (i6) {
                            case 0:
                                AbstractC2639Kg.h(this.f34867u.f35205n, true);
                                return;
                            case 1:
                                BinderC4224yi binderC4224yi = this.f34867u;
                                binderC4224yi.getClass();
                                C4054va c4054va = C4835j.f39730C.f39745n;
                                if (c4054va.f34705n.getAndSet(true)) {
                                    return;
                                }
                                Context context2 = binderC4224yi.f35205n;
                                c4054va.f34706u = context2;
                                c4054va.f34707v = binderC4224yi.f35202G;
                                if (c4054va.f34709x != null || context2 == null || (b9 = AbstractC4816f.b(context2)) == null || b9.equals(context2.getPackageName())) {
                                    return;
                                }
                                AbstractC4816f.a(context2, b9, c4054va);
                                return;
                            case 2:
                                BinderC4224yi binderC4224yi2 = this.f34867u;
                                binderC4224yi2.getClass();
                                BinderC2535Ee binderC2535Ee = new BinderC2535Ee("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                                C3429jw c3429jw = binderC4224yi2.f35198C;
                                c3429jw.getClass();
                                try {
                                    try {
                                        IBinder b10 = com.bumptech.glide.f.D(c3429jw.f31351a).b("com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy");
                                        if (b10 == null) {
                                            c3194fb = null;
                                        } else {
                                            IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                                            c3194fb = queryLocalInterface instanceof C3194fb ? (C3194fb) queryLocalInterface : new C3194fb(b10, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy", 2);
                                        }
                                        Parcel H02 = c3194fb.H0();
                                        AbstractC3388j8.e(H02, binderC2535Ee);
                                        c3194fb.f1(H02, 1);
                                        return;
                                    } catch (Exception e9) {
                                        throw new v2.j(e9);
                                    }
                                } catch (RemoteException e10) {
                                    v2.i.f("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e10.getMessage())));
                                    return;
                                } catch (v2.j e11) {
                                    v2.i.f("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e11.getMessage())));
                                    return;
                                }
                            default:
                                BinderC4224yi binderC4224yi3 = this.f34867u;
                                binderC4224yi3.getClass();
                                C4835j c4835j2 = C4835j.f39730C;
                                C5069B g10 = c4835j2.f39740h.g();
                                g10.i();
                                synchronized (g10.f41206a) {
                                    z3 = g10.f41229y;
                                }
                                if (z3) {
                                    C5069B g11 = c4835j2.f39740h.g();
                                    g11.i();
                                    synchronized (g11.f41206a) {
                                        str = g11.f41230z;
                                    }
                                    if (c4835j2.f39746o.b(binderC4224yi3.f35205n, str, binderC4224yi3.f35206u.f41388n)) {
                                        return;
                                    }
                                    c4835j2.f39740h.g().e(false);
                                    c4835j2.f39740h.g().f("");
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            if (((Boolean) rVar.f40207c.a(AbstractC3569ma.f32430z5)).booleanValue()) {
                if (((Boolean) rVar.f40207c.a(AbstractC3569ma.f31974A5)).booleanValue()) {
                    AbstractC3413jg.f31268a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.wi

                        /* renamed from: u, reason: collision with root package name */
                        public final /* synthetic */ BinderC4224yi f34867u;

                        {
                            this.f34867u = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            String b9;
                            C3194fb c3194fb;
                            boolean z3;
                            String str;
                            switch (i) {
                                case 0:
                                    AbstractC2639Kg.h(this.f34867u.f35205n, true);
                                    return;
                                case 1:
                                    BinderC4224yi binderC4224yi = this.f34867u;
                                    binderC4224yi.getClass();
                                    C4054va c4054va = C4835j.f39730C.f39745n;
                                    if (c4054va.f34705n.getAndSet(true)) {
                                        return;
                                    }
                                    Context context2 = binderC4224yi.f35205n;
                                    c4054va.f34706u = context2;
                                    c4054va.f34707v = binderC4224yi.f35202G;
                                    if (c4054va.f34709x != null || context2 == null || (b9 = AbstractC4816f.b(context2)) == null || b9.equals(context2.getPackageName())) {
                                        return;
                                    }
                                    AbstractC4816f.a(context2, b9, c4054va);
                                    return;
                                case 2:
                                    BinderC4224yi binderC4224yi2 = this.f34867u;
                                    binderC4224yi2.getClass();
                                    BinderC2535Ee binderC2535Ee = new BinderC2535Ee("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                                    C3429jw c3429jw = binderC4224yi2.f35198C;
                                    c3429jw.getClass();
                                    try {
                                        try {
                                            IBinder b10 = com.bumptech.glide.f.D(c3429jw.f31351a).b("com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy");
                                            if (b10 == null) {
                                                c3194fb = null;
                                            } else {
                                                IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                                                c3194fb = queryLocalInterface instanceof C3194fb ? (C3194fb) queryLocalInterface : new C3194fb(b10, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy", 2);
                                            }
                                            Parcel H02 = c3194fb.H0();
                                            AbstractC3388j8.e(H02, binderC2535Ee);
                                            c3194fb.f1(H02, 1);
                                            return;
                                        } catch (Exception e9) {
                                            throw new v2.j(e9);
                                        }
                                    } catch (RemoteException e10) {
                                        v2.i.f("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e10.getMessage())));
                                        return;
                                    } catch (v2.j e11) {
                                        v2.i.f("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e11.getMessage())));
                                        return;
                                    }
                                default:
                                    BinderC4224yi binderC4224yi3 = this.f34867u;
                                    binderC4224yi3.getClass();
                                    C4835j c4835j2 = C4835j.f39730C;
                                    C5069B g10 = c4835j2.f39740h.g();
                                    g10.i();
                                    synchronized (g10.f41206a) {
                                        z3 = g10.f41229y;
                                    }
                                    if (z3) {
                                        C5069B g11 = c4835j2.f39740h.g();
                                        g11.i();
                                        synchronized (g11.f41206a) {
                                            str = g11.f41230z;
                                        }
                                        if (c4835j2.f39746o.b(binderC4224yi3.f35205n, str, binderC4224yi3.f35206u.f41388n)) {
                                            return;
                                        }
                                        c4835j2.f39740h.g().e(false);
                                        c4835j2.f39740h.g().f("");
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                }
            }
            if (((Boolean) rVar.f40207c.a(AbstractC3569ma.f32094O5)).booleanValue()) {
                C3047cp c3047cp = this.f35203H;
                C3360ig c3360ig = AbstractC3413jg.f31273f;
                Objects.requireNonNull(c3047cp);
                c3360ig.execute(new RunnableC3111e(27, c3047cp));
            }
        }
    }

    @Override // q2.InterfaceC4883g0
    public final synchronized void g1(float f3) {
        C5070a c5070a = C4835j.f39730C.i;
        synchronized (c5070a) {
            c5070a.f41250b = f3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0042  */
    @Override // q2.InterfaceC4883g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i1(W2.a aVar, String str) {
        String M8;
        String str2;
        RunnableC4170xi runnableC4170xi;
        Context context = this.f35205n;
        AbstractC3569ma.a(context);
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32188Z4)).booleanValue()) {
            try {
                u2.D d2 = C4835j.f39730C.f39735c;
                M8 = u2.D.M(context);
            } catch (RemoteException | RuntimeException e9) {
                C4835j.f39730C.f39740h.d("NonagonMobileAdsSettingManager_AppId", e9);
            }
            boolean z3 = true;
            str2 = true != TextUtils.isEmpty(M8) ? str : M8;
            if (TextUtils.isEmpty(str2)) {
                C3301ha c3301ha = AbstractC3569ma.f32128S4;
                q2.r rVar = q2.r.f40204e;
                boolean booleanValue = ((Boolean) rVar.f40207c.a(c3301ha)).booleanValue();
                C3301ha c3301ha2 = AbstractC3569ma.f32427z1;
                SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40207c;
                boolean booleanValue2 = booleanValue | ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha2)).booleanValue();
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha2)).booleanValue()) {
                    runnableC4170xi = new RunnableC4170xi(this, (Runnable) W2.b.F0(aVar), 0);
                } else {
                    runnableC4170xi = null;
                    z3 = booleanValue2;
                }
                RunnableC4170xi runnableC4170xi2 = runnableC4170xi;
                if (z3) {
                    C4835j.f39730C.f39743l.x(this.f35205n, this.f35206u, true, null, str2, null, runnableC4170xi2, this.f35199D, this.f35202G, this.J, this.f35197B.f());
                    return;
                }
                return;
            }
            return;
        }
        M8 = "";
        boolean z32 = true;
        if (true != TextUtils.isEmpty(M8)) {
        }
        if (TextUtils.isEmpty(str2)) {
        }
    }

    @Override // q2.InterfaceC4883g0
    public final void i2(q2.W0 w02) {
        C2621Jf c2621Jf = this.f35211z;
        Context context = this.f35205n;
        c2621Jf.getClass();
        C2570Gf o6 = C2570Gf.o(context);
        C2519Df c2519Df = (C2519Df) ((C3243gN) o6.f25044w).f();
        ((T2.a) o6.f25042u).getClass();
        c2519Df.a(-1, System.currentTimeMillis());
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32176Y0)).booleanValue() && c2621Jf.a(context) && C2621Jf.g(context)) {
            synchronized (c2621Jf.f25714j) {
            }
        }
    }

    @Override // q2.InterfaceC4883g0
    public final synchronized float k() {
        return C4835j.f39730C.i.a();
    }

    @Override // q2.InterfaceC4883g0
    public final synchronized boolean l() {
        boolean z3;
        C5070a c5070a = C4835j.f39730C.i;
        synchronized (c5070a) {
            z3 = c5070a.f41249a;
        }
        return z3;
    }

    @Override // q2.InterfaceC4883g0
    public final List m() {
        return this.f35210y.b();
    }

    @Override // q2.InterfaceC4883g0
    public final String q() {
        return this.f35206u.f41388n;
    }

    @Override // q2.InterfaceC4883g0
    public final synchronized void r1() {
        C3301ha c3301ha = AbstractC3569ma.f32225d3;
        q2.r rVar = q2.r.f40204e;
        if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
            C2570Gf c2570Gf = C4835j.f39730C.f39749r;
            synchronized (c2570Gf.f25042u) {
                try {
                    C3089dd c3089dd = (C3089dd) c2570Gf.f25044w;
                    if (c3089dd != null) {
                        g7.m mVar = c3089dd.f29785a;
                        C2851Xc c2851Xc = (C2851Xc) mVar.f37670h;
                        if (c2851Xc != null) {
                            c2851Xc.u();
                            mVar.f37670h = null;
                        }
                        c2570Gf.f25044w = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (((Boolean) rVar.f40207c.a(AbstractC3569ma.f32235e3)).booleanValue()) {
                C4900p.f40196g.f40199c = true;
            }
        }
    }
}
