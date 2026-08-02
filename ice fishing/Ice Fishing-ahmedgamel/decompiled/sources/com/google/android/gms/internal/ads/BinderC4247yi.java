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
import p.AbstractC4820f;
import r2.C4906k;
import s2.AbstractBinderC4930f0;
import s2.C4949p;
import s2.InterfaceC4948o0;
import w2.C5140B;
import w2.C5141a;
import w2.C5147g;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.yi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC4247yi extends AbstractBinderC4930f0 {

    /* renamed from: A, reason: collision with root package name */
    public final C2819Tn f35986A;

    /* renamed from: B, reason: collision with root package name */
    public final C2786Ro f35987B;

    /* renamed from: C, reason: collision with root package name */
    public final C3506kw f35988C;

    /* renamed from: D, reason: collision with root package name */
    public final Wu f35989D;

    /* renamed from: E, reason: collision with root package name */
    public final C3504ku f35990E;

    /* renamed from: F, reason: collision with root package name */
    public final C2897Yj f35991F;

    /* renamed from: G, reason: collision with root package name */
    public final C3230fo f35992G;

    /* renamed from: H, reason: collision with root package name */
    public final C3070cp f35993H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f35994I = false;
    public final Long J;

    /* renamed from: n, reason: collision with root package name */
    public final Context f35995n;

    /* renamed from: u, reason: collision with root package name */
    public final C5189a f35996u;

    /* renamed from: v, reason: collision with root package name */
    public final C2785Rn f35997v;

    /* renamed from: w, reason: collision with root package name */
    public final InterfaceC3446jq f35998w;

    /* renamed from: x, reason: collision with root package name */
    public final C3986tr f35999x;

    /* renamed from: y, reason: collision with root package name */
    public final C2531Co f36000y;

    /* renamed from: z, reason: collision with root package name */
    public final C2641Jf f36001z;

    public BinderC4247yi(Context context, C5189a c5189a, C2785Rn c2785Rn, InterfaceC3446jq interfaceC3446jq, C3986tr c3986tr, C2531Co c2531Co, C2641Jf c2641Jf, C2819Tn c2819Tn, C2786Ro c2786Ro, C3506kw c3506kw, Wu wu, C3504ku c3504ku, C2897Yj c2897Yj, C3230fo c3230fo, C3070cp c3070cp) {
        this.f35995n = context;
        this.f35996u = c5189a;
        this.f35997v = c2785Rn;
        this.f35998w = interfaceC3446jq;
        this.f35999x = c3986tr;
        this.f36000y = c2531Co;
        this.f36001z = c2641Jf;
        this.f35986A = c2819Tn;
        this.f35987B = c2786Ro;
        this.f35988C = c3506kw;
        this.f35989D = wu;
        this.f35990E = c3504ku;
        this.f35991F = c2897Yj;
        this.f35992G = c3230fo;
        this.f35993H = c3070cp;
        C4906k.f40186C.f40198k.getClass();
        this.J = Long.valueOf(SystemClock.elapsedRealtime());
    }

    @Override // s2.InterfaceC4932g0
    public final void C() {
        this.f36000y.f24981q = false;
    }

    @Override // s2.InterfaceC4932g0
    public final void G3(Y2.a aVar, String str) {
        if (aVar == null) {
            int i = w2.z.f41712b;
            x2.i.c("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) Y2.b.D0(aVar);
        if (context == null) {
            int i4 = w2.z.f41712b;
            x2.i.c("Context is null. Failed to open debug menu.");
        } else {
            C5147g c5147g = new C5147g(context);
            c5147g.f41664d = str;
            c5147g.f41665e = this.f35996u.f41845n;
            c5147g.b();
        }
    }

    @Override // s2.InterfaceC4932g0
    public final synchronized void P2(String str) {
        Context context = this.f35995n;
        AbstractC3592ma.a(context);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32907S4)).booleanValue()) {
                C4906k.f40186C.f40199l.y(context, this.f35996u, true, null, str, null, null, this.f35989D, null, null, this.f35987B.f());
            }
        }
    }

    @Override // s2.InterfaceC4932g0
    public final void S3(InterfaceC2536Dc interfaceC2536Dc) {
        C2531Co c2531Co = this.f36000y;
        c2531Co.getClass();
        c2531Co.f24970e.f32256n.a(new RunnableC3996u0(28, c2531Co, interfaceC2536Dc), c2531Co.f24974j);
    }

    @Override // s2.InterfaceC4932g0
    public final void U(String str) {
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.La)).booleanValue()) {
            C4906k.f40186C.f40196h.f30308g = str;
        }
    }

    @Override // s2.InterfaceC4932g0
    public final void W1(s2.W0 w02) {
        C2641Jf c2641Jf = this.f36001z;
        Context context = this.f35995n;
        c2641Jf.getClass();
        C2590Gf m9 = C2590Gf.m(context);
        C2539Df c2539Df = (C2539Df) ((C3266gN) m9.f25832w).f();
        ((V2.a) m9.f25830u).getClass();
        c2539Df.a(-1, System.currentTimeMillis());
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32955Y0)).booleanValue() && c2641Jf.a(context) && C2641Jf.g(context)) {
            synchronized (c2641Jf.f26468j) {
            }
        }
    }

    @Override // s2.InterfaceC4932g0
    public final synchronized void Z(boolean z6) {
        C5141a c5141a = C4906k.f40186C.i;
        synchronized (c5141a) {
            c5141a.f41642a = z6;
        }
    }

    @Override // s2.InterfaceC4932g0
    public final void a2(InterfaceC3595md interfaceC3595md) {
        this.f35990E.s(interfaceC3595md);
    }

    @Override // s2.InterfaceC4932g0
    public final synchronized void d() {
        final int i = 1;
        final int i4 = 0;
        final int i6 = 2;
        synchronized (this) {
            if (this.f35994I) {
                int i9 = w2.z.f41712b;
                x2.i.f("Mobile ads is initialized already.");
                return;
            }
            C3324ha c3324ha = AbstractC3592ma.f33015e3;
            s2.r rVar = s2.r.f40506e;
            if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                C4949p.a();
            }
            Context context = this.f35995n;
            AbstractC3592ma.a(context);
            C5189a c5189a = this.f35996u;
            C3230fo c3230fo = this.f35992G;
            C4906k c4906k = C4906k.f40186C;
            c4906k.f40196h.b(context, c5189a, c3230fo);
            this.f35991F.a();
            c4906k.f40197j.c(context);
            this.f35994I = true;
            this.f36000y.a();
            C3986tr c3986tr = this.f35999x;
            c3986tr.getClass();
            C5140B g9 = c4906k.f40196h.g();
            g9.f41601c.add(new RunnableC3932sr(c3986tr, 2));
            c3986tr.f35183f.execute(new RunnableC3932sr(c3986tr, 0));
            if (((Boolean) rVar.f40509c.a(AbstractC3592ma.f32925U4)).booleanValue()) {
                C2819Tn c2819Tn = this.f35986A;
                if (!c2819Tn.f28583f.getAndSet(true)) {
                    C5140B g10 = c4906k.f40196h.g();
                    g10.f41601c.add(new RunnableC2802Sn(c2819Tn, 0));
                }
                c2819Tn.f28580c.execute(new RunnableC2802Sn(c2819Tn, 2));
            }
            this.f35987B.a();
            if (((Boolean) rVar.f40509c.a(AbstractC3592ma.za)).booleanValue()) {
                final int i10 = 3;
                AbstractC3436jg.f32055a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.wi

                    /* renamed from: u, reason: collision with root package name */
                    public final /* synthetic */ BinderC4247yi f35644u;

                    {
                        this.f35644u = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        String b9;
                        C3217fb c3217fb;
                        boolean z6;
                        String str;
                        switch (i10) {
                            case 0:
                                AbstractC2659Kg.h(this.f35644u.f35995n, true);
                                return;
                            case 1:
                                BinderC4247yi binderC4247yi = this.f35644u;
                                binderC4247yi.getClass();
                                C4077va c4077va = C4906k.f40186C.f40201n;
                                if (c4077va.f35462n.getAndSet(true)) {
                                    return;
                                }
                                Context context2 = binderC4247yi.f35995n;
                                c4077va.f35463u = context2;
                                c4077va.f35464v = binderC4247yi.f35992G;
                                if (c4077va.f35466x != null || context2 == null || (b9 = AbstractC4820f.b(context2)) == null || b9.equals(context2.getPackageName())) {
                                    return;
                                }
                                AbstractC4820f.a(context2, b9, c4077va);
                                return;
                            case 2:
                                BinderC4247yi binderC4247yi2 = this.f35644u;
                                binderC4247yi2.getClass();
                                BinderC2555Ee binderC2555Ee = new BinderC2555Ee("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                                C3506kw c3506kw = binderC4247yi2.f35988C;
                                c3506kw.getClass();
                                try {
                                    try {
                                        IBinder b10 = com.bumptech.glide.e.y(c3506kw.f32449a).b("com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy");
                                        if (b10 == null) {
                                            c3217fb = null;
                                        } else {
                                            IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                                            c3217fb = queryLocalInterface instanceof C3217fb ? (C3217fb) queryLocalInterface : new C3217fb(b10, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy", 1);
                                        }
                                        Parcel F02 = c3217fb.F0();
                                        AbstractC3411j8.e(F02, binderC2555Ee);
                                        c3217fb.d1(F02, 1);
                                        return;
                                    } catch (Exception e9) {
                                        throw new x2.j(e9);
                                    }
                                } catch (RemoteException e10) {
                                    x2.i.f("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e10.getMessage())));
                                    return;
                                } catch (x2.j e11) {
                                    x2.i.f("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e11.getMessage())));
                                    return;
                                }
                            default:
                                BinderC4247yi binderC4247yi3 = this.f35644u;
                                binderC4247yi3.getClass();
                                C4906k c4906k2 = C4906k.f40186C;
                                C5140B g11 = c4906k2.f40196h.g();
                                g11.i();
                                synchronized (g11.f41599a) {
                                    z6 = g11.f41622y;
                                }
                                if (z6) {
                                    C5140B g12 = c4906k2.f40196h.g();
                                    g12.i();
                                    synchronized (g12.f41599a) {
                                        str = g12.f41623z;
                                    }
                                    if (c4906k2.f40202o.b(binderC4247yi3.f35995n, str, binderC4247yi3.f35996u.f41845n)) {
                                        return;
                                    }
                                    c4906k2.f40196h.g().e(false);
                                    c4906k2.f40196h.g().f("");
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            if (((Boolean) rVar.f40509c.a(AbstractC3592ma.qc)).booleanValue()) {
                AbstractC3436jg.f32055a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.wi

                    /* renamed from: u, reason: collision with root package name */
                    public final /* synthetic */ BinderC4247yi f35644u;

                    {
                        this.f35644u = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        String b9;
                        C3217fb c3217fb;
                        boolean z6;
                        String str;
                        switch (i6) {
                            case 0:
                                AbstractC2659Kg.h(this.f35644u.f35995n, true);
                                return;
                            case 1:
                                BinderC4247yi binderC4247yi = this.f35644u;
                                binderC4247yi.getClass();
                                C4077va c4077va = C4906k.f40186C.f40201n;
                                if (c4077va.f35462n.getAndSet(true)) {
                                    return;
                                }
                                Context context2 = binderC4247yi.f35995n;
                                c4077va.f35463u = context2;
                                c4077va.f35464v = binderC4247yi.f35992G;
                                if (c4077va.f35466x != null || context2 == null || (b9 = AbstractC4820f.b(context2)) == null || b9.equals(context2.getPackageName())) {
                                    return;
                                }
                                AbstractC4820f.a(context2, b9, c4077va);
                                return;
                            case 2:
                                BinderC4247yi binderC4247yi2 = this.f35644u;
                                binderC4247yi2.getClass();
                                BinderC2555Ee binderC2555Ee = new BinderC2555Ee("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                                C3506kw c3506kw = binderC4247yi2.f35988C;
                                c3506kw.getClass();
                                try {
                                    try {
                                        IBinder b10 = com.bumptech.glide.e.y(c3506kw.f32449a).b("com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy");
                                        if (b10 == null) {
                                            c3217fb = null;
                                        } else {
                                            IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                                            c3217fb = queryLocalInterface instanceof C3217fb ? (C3217fb) queryLocalInterface : new C3217fb(b10, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy", 1);
                                        }
                                        Parcel F02 = c3217fb.F0();
                                        AbstractC3411j8.e(F02, binderC2555Ee);
                                        c3217fb.d1(F02, 1);
                                        return;
                                    } catch (Exception e9) {
                                        throw new x2.j(e9);
                                    }
                                } catch (RemoteException e10) {
                                    x2.i.f("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e10.getMessage())));
                                    return;
                                } catch (x2.j e11) {
                                    x2.i.f("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e11.getMessage())));
                                    return;
                                }
                            default:
                                BinderC4247yi binderC4247yi3 = this.f35644u;
                                binderC4247yi3.getClass();
                                C4906k c4906k2 = C4906k.f40186C;
                                C5140B g11 = c4906k2.f40196h.g();
                                g11.i();
                                synchronized (g11.f41599a) {
                                    z6 = g11.f41622y;
                                }
                                if (z6) {
                                    C5140B g12 = c4906k2.f40196h.g();
                                    g12.i();
                                    synchronized (g12.f41599a) {
                                        str = g12.f41623z;
                                    }
                                    if (c4906k2.f40202o.b(binderC4247yi3.f35995n, str, binderC4247yi3.f35996u.f41845n)) {
                                        return;
                                    }
                                    c4906k2.f40196h.g().e(false);
                                    c4906k2.f40196h.g().f("");
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            if (((Boolean) rVar.f40509c.a(AbstractC3592ma.f32897R3)).booleanValue()) {
                AbstractC3436jg.f32055a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.wi

                    /* renamed from: u, reason: collision with root package name */
                    public final /* synthetic */ BinderC4247yi f35644u;

                    {
                        this.f35644u = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        String b9;
                        C3217fb c3217fb;
                        boolean z6;
                        String str;
                        switch (i4) {
                            case 0:
                                AbstractC2659Kg.h(this.f35644u.f35995n, true);
                                return;
                            case 1:
                                BinderC4247yi binderC4247yi = this.f35644u;
                                binderC4247yi.getClass();
                                C4077va c4077va = C4906k.f40186C.f40201n;
                                if (c4077va.f35462n.getAndSet(true)) {
                                    return;
                                }
                                Context context2 = binderC4247yi.f35995n;
                                c4077va.f35463u = context2;
                                c4077va.f35464v = binderC4247yi.f35992G;
                                if (c4077va.f35466x != null || context2 == null || (b9 = AbstractC4820f.b(context2)) == null || b9.equals(context2.getPackageName())) {
                                    return;
                                }
                                AbstractC4820f.a(context2, b9, c4077va);
                                return;
                            case 2:
                                BinderC4247yi binderC4247yi2 = this.f35644u;
                                binderC4247yi2.getClass();
                                BinderC2555Ee binderC2555Ee = new BinderC2555Ee("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                                C3506kw c3506kw = binderC4247yi2.f35988C;
                                c3506kw.getClass();
                                try {
                                    try {
                                        IBinder b10 = com.bumptech.glide.e.y(c3506kw.f32449a).b("com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy");
                                        if (b10 == null) {
                                            c3217fb = null;
                                        } else {
                                            IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                                            c3217fb = queryLocalInterface instanceof C3217fb ? (C3217fb) queryLocalInterface : new C3217fb(b10, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy", 1);
                                        }
                                        Parcel F02 = c3217fb.F0();
                                        AbstractC3411j8.e(F02, binderC2555Ee);
                                        c3217fb.d1(F02, 1);
                                        return;
                                    } catch (Exception e9) {
                                        throw new x2.j(e9);
                                    }
                                } catch (RemoteException e10) {
                                    x2.i.f("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e10.getMessage())));
                                    return;
                                } catch (x2.j e11) {
                                    x2.i.f("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e11.getMessage())));
                                    return;
                                }
                            default:
                                BinderC4247yi binderC4247yi3 = this.f35644u;
                                binderC4247yi3.getClass();
                                C4906k c4906k2 = C4906k.f40186C;
                                C5140B g11 = c4906k2.f40196h.g();
                                g11.i();
                                synchronized (g11.f41599a) {
                                    z6 = g11.f41622y;
                                }
                                if (z6) {
                                    C5140B g12 = c4906k2.f40196h.g();
                                    g12.i();
                                    synchronized (g12.f41599a) {
                                        str = g12.f41623z;
                                    }
                                    if (c4906k2.f40202o.b(binderC4247yi3.f35995n, str, binderC4247yi3.f35996u.f41845n)) {
                                        return;
                                    }
                                    c4906k2.f40196h.g().e(false);
                                    c4906k2.f40196h.g().f("");
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            if (((Boolean) rVar.f40509c.a(AbstractC3592ma.f33210z5)).booleanValue()) {
                if (((Boolean) rVar.f40509c.a(AbstractC3592ma.f32755A5)).booleanValue()) {
                    AbstractC3436jg.f32055a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.wi

                        /* renamed from: u, reason: collision with root package name */
                        public final /* synthetic */ BinderC4247yi f35644u;

                        {
                            this.f35644u = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            String b9;
                            C3217fb c3217fb;
                            boolean z6;
                            String str;
                            switch (i) {
                                case 0:
                                    AbstractC2659Kg.h(this.f35644u.f35995n, true);
                                    return;
                                case 1:
                                    BinderC4247yi binderC4247yi = this.f35644u;
                                    binderC4247yi.getClass();
                                    C4077va c4077va = C4906k.f40186C.f40201n;
                                    if (c4077va.f35462n.getAndSet(true)) {
                                        return;
                                    }
                                    Context context2 = binderC4247yi.f35995n;
                                    c4077va.f35463u = context2;
                                    c4077va.f35464v = binderC4247yi.f35992G;
                                    if (c4077va.f35466x != null || context2 == null || (b9 = AbstractC4820f.b(context2)) == null || b9.equals(context2.getPackageName())) {
                                        return;
                                    }
                                    AbstractC4820f.a(context2, b9, c4077va);
                                    return;
                                case 2:
                                    BinderC4247yi binderC4247yi2 = this.f35644u;
                                    binderC4247yi2.getClass();
                                    BinderC2555Ee binderC2555Ee = new BinderC2555Ee("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                                    C3506kw c3506kw = binderC4247yi2.f35988C;
                                    c3506kw.getClass();
                                    try {
                                        try {
                                            IBinder b10 = com.bumptech.glide.e.y(c3506kw.f32449a).b("com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy");
                                            if (b10 == null) {
                                                c3217fb = null;
                                            } else {
                                                IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                                                c3217fb = queryLocalInterface instanceof C3217fb ? (C3217fb) queryLocalInterface : new C3217fb(b10, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy", 1);
                                            }
                                            Parcel F02 = c3217fb.F0();
                                            AbstractC3411j8.e(F02, binderC2555Ee);
                                            c3217fb.d1(F02, 1);
                                            return;
                                        } catch (Exception e9) {
                                            throw new x2.j(e9);
                                        }
                                    } catch (RemoteException e10) {
                                        x2.i.f("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e10.getMessage())));
                                        return;
                                    } catch (x2.j e11) {
                                        x2.i.f("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e11.getMessage())));
                                        return;
                                    }
                                default:
                                    BinderC4247yi binderC4247yi3 = this.f35644u;
                                    binderC4247yi3.getClass();
                                    C4906k c4906k2 = C4906k.f40186C;
                                    C5140B g11 = c4906k2.f40196h.g();
                                    g11.i();
                                    synchronized (g11.f41599a) {
                                        z6 = g11.f41622y;
                                    }
                                    if (z6) {
                                        C5140B g12 = c4906k2.f40196h.g();
                                        g12.i();
                                        synchronized (g12.f41599a) {
                                            str = g12.f41623z;
                                        }
                                        if (c4906k2.f40202o.b(binderC4247yi3.f35995n, str, binderC4247yi3.f35996u.f41845n)) {
                                            return;
                                        }
                                        c4906k2.f40196h.g().e(false);
                                        c4906k2.f40196h.g().f("");
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                }
            }
            if (((Boolean) rVar.f40509c.a(AbstractC3592ma.f32873O5)).booleanValue()) {
                C3070cp c3070cp = this.f35993H;
                C3383ig c3383ig = AbstractC3436jg.f32060f;
                Objects.requireNonNull(c3070cp);
                c3383ig.execute(new RunnableC3134e(27, c3070cp));
            }
        }
    }

    @Override // s2.InterfaceC4932g0
    public final synchronized void g1(float f2) {
        C5141a c5141a = C4906k.f40186C.i;
        synchronized (c5141a) {
            c5141a.f41643b = f2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0042  */
    @Override // s2.InterfaceC4932g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i3(Y2.a aVar, String str) {
        String M8;
        String str2;
        RunnableC4193xi runnableC4193xi;
        Context context = this.f35995n;
        AbstractC3592ma.a(context);
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32967Z4)).booleanValue()) {
            try {
                w2.D d9 = C4906k.f40186C.f40191c;
                M8 = w2.D.M(context);
            } catch (RemoteException | RuntimeException e9) {
                C4906k.f40186C.f40196h.d("NonagonMobileAdsSettingManager_AppId", e9);
            }
            boolean z6 = true;
            str2 = true != TextUtils.isEmpty(M8) ? str : M8;
            if (TextUtils.isEmpty(str2)) {
                C3324ha c3324ha = AbstractC3592ma.f32907S4;
                s2.r rVar = s2.r.f40506e;
                boolean booleanValue = ((Boolean) rVar.f40509c.a(c3324ha)).booleanValue();
                C3324ha c3324ha2 = AbstractC3592ma.f33206z1;
                SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
                boolean booleanValue2 = booleanValue | ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha2)).booleanValue();
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha2)).booleanValue()) {
                    runnableC4193xi = new RunnableC4193xi(this, (Runnable) Y2.b.D0(aVar), 0);
                } else {
                    runnableC4193xi = null;
                    z6 = booleanValue2;
                }
                RunnableC4193xi runnableC4193xi2 = runnableC4193xi;
                if (z6) {
                    C4906k.f40186C.f40199l.y(this.f35995n, this.f35996u, true, null, str2, null, runnableC4193xi2, this.f35989D, this.f35992G, this.J, this.f35987B.f());
                    return;
                }
                return;
            }
            return;
        }
        M8 = "";
        boolean z62 = true;
        if (true != TextUtils.isEmpty(M8)) {
        }
        if (TextUtils.isEmpty(str2)) {
        }
    }

    @Override // s2.InterfaceC4932g0
    public final synchronized float k() {
        return C4906k.f40186C.i.a();
    }

    @Override // s2.InterfaceC4932g0
    public final synchronized boolean l() {
        boolean z6;
        C5141a c5141a = C4906k.f40186C.i;
        synchronized (c5141a) {
            z6 = c5141a.f41642a;
        }
        return z6;
    }

    @Override // s2.InterfaceC4932g0
    public final List m() {
        return this.f36000y.b();
    }

    @Override // s2.InterfaceC4932g0
    public final String q() {
        return this.f35996u.f41845n;
    }

    @Override // s2.InterfaceC4932g0
    public final synchronized void q1() {
        C3324ha c3324ha = AbstractC3592ma.f33005d3;
        s2.r rVar = s2.r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
            C2590Gf c2590Gf = C4906k.f40186C.f40205r;
            synchronized (c2590Gf.f25830u) {
                try {
                    C3112dd c3112dd = (C3112dd) c2590Gf.f25832w;
                    if (c3112dd != null) {
                        g7.m mVar = c3112dd.f30558a;
                        C2874Xc c2874Xc = (C2874Xc) mVar.f37695h;
                        if (c2874Xc != null) {
                            c2874Xc.u();
                            mVar.f37695h = null;
                        }
                        c2590Gf.f25832w = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (((Boolean) rVar.f40509c.a(AbstractC3592ma.f33015e3)).booleanValue()) {
                C4949p.f40498g.f40501c = true;
            }
        }
    }

    @Override // s2.InterfaceC4932g0
    public final void w1(String str) {
        this.f35999x.b(str);
    }

    @Override // s2.InterfaceC4932g0
    public final void y1(InterfaceC4948o0 interfaceC4948o0) {
        this.f35987B.e(interfaceC4948o0, EnumC2769Qo.f27855u);
    }

    @Override // s2.InterfaceC4932g0
    public final void z0(boolean z6) {
        try {
            Qx.f(this.f35995n).l(z6);
        } catch (IOException e9) {
            throw new RemoteException(e9.getMessage());
        }
    }
}
