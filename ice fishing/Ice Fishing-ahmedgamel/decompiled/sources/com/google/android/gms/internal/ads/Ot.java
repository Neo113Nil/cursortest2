package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import r2.C4906k;
import s2.C4950p0;
import s2.InterfaceC4953r0;
import s2.InterfaceC4963w0;
import x2.C5189a;

/* loaded from: classes2.dex */
public final class Ot extends AbstractBinderC3329hf {

    /* renamed from: A, reason: collision with root package name */
    public final C3464k7 f27451A;

    /* renamed from: B, reason: collision with root package name */
    public final C3230fo f27452B;

    /* renamed from: C, reason: collision with root package name */
    public C2513Bn f27453C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f27454D;

    /* renamed from: u, reason: collision with root package name */
    public final Mt f27455u;

    /* renamed from: v, reason: collision with root package name */
    public final Jt f27456v;

    /* renamed from: w, reason: collision with root package name */
    public final String f27457w;

    /* renamed from: x, reason: collision with root package name */
    public final Zt f27458x;

    /* renamed from: y, reason: collision with root package name */
    public final Context f27459y;

    /* renamed from: z, reason: collision with root package name */
    public final C5189a f27460z;

    public Ot(String str, Mt mt, Context context, Jt jt, Zt zt, C5189a c5189a, C3464k7 c3464k7, C3230fo c3230fo) {
        this.f27457w = str;
        this.f27455u = mt;
        this.f27456v = jt;
        this.f27458x = zt;
        this.f27459y = context;
        this.f27460z = c5189a;
        C3324ha c3324ha = AbstractC3592ma.f33086m1;
        s2.r rVar = s2.r.f40506e;
        if (!((Boolean) rVar.f40509c.a(c3324ha)).booleanValue() || Build.VERSION.SDK_INT < 35) {
            this.f27454D = ((Boolean) rVar.f40509c.a(AbstractC3592ma.f33077l1)).booleanValue();
        } else {
            this.f27454D = true;
        }
        this.f27451A = c3464k7;
        this.f27452B = c3230fo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3435jf
    public final synchronized void A2(Y2.a aVar, boolean z6) {
        R2.w.d("#008 Must be called on the main UI thread.");
        if (this.f27453C == null) {
            int i = w2.z.f41712b;
            x2.i.f("Rewarded can not be shown before loaded");
            this.f27456v.c(SK.F(9, null, null));
        } else {
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32771C3)).booleanValue()) {
                this.f27451A.f32160b.e(new Throwable().getStackTrace());
            }
            this.f27453C.c((Activity) Y2.b.D0(aVar), z6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3435jf
    public final synchronized void H0(s2.c1 c1Var, InterfaceC3813qf interfaceC3813qf) {
        U3(c1Var, interfaceC3813qf, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3435jf
    public final synchronized void K1(Y2.a aVar) {
        A2(aVar, this.f27454D);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3435jf
    public final void O3(C4950p0 c4950p0) {
        Jt jt = this.f27456v;
        if (c4950p0 == null) {
            jt.f26533u.set(null);
        } else {
            jt.f26533u.set(new Nt(this, c4950p0));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3435jf
    public final synchronized void R1(s2.c1 c1Var, InterfaceC3813qf interfaceC3813qf) {
        U3(c1Var, interfaceC3813qf, 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3435jf
    public final void S0(C3866rf c3866rf) {
        R2.w.d("#008 Must be called on the main UI thread.");
        this.f27456v.f26537y.set(c3866rf);
    }

    public final synchronized void U3(s2.c1 c1Var, InterfaceC3813qf interfaceC3813qf, int i) {
        try {
            if (!c1Var.b()) {
                boolean z6 = false;
                if (((Boolean) AbstractC2704Na.f27285k.r()).booleanValue()) {
                    if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Cc)).booleanValue()) {
                        z6 = true;
                    }
                }
                if (this.f27460z.f41847v < ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.Dc)).intValue() || !z6) {
                    R2.w.d("#008 Must be called on the main UI thread.");
                }
            }
            Jt jt = this.f27456v;
            jt.f26534v.set(interfaceC3813qf);
            w2.D d9 = C4906k.f40186C.f40191c;
            if (w2.D.h(this.f27459y) && c1Var.f40406L == null) {
                int i4 = w2.z.f41712b;
                x2.i.c("Failed to load the ad because app ID is missing.");
                jt.I(SK.F(4, null, null));
            } else {
                if (this.f27453C != null) {
                    return;
                }
                Kt kt = new Kt(23);
                Mt mt = this.f27455u;
                mt.f27154h.f30144o.f2062u = i;
                mt.a(c1Var, this.f27457w, kt, new C3717or(this));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3435jf
    public final synchronized void X(long j6) {
        C3387ik c3387ik;
        C2513Bn c2513Bn = this.f27453C;
        if (c2513Bn == null || (c3387ik = c2513Bn.f25630j) == null) {
            return;
        }
        c3387ik.a(j6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3435jf
    public final void X1(InterfaceC3597mf interfaceC3597mf) {
        R2.w.d("#008 Must be called on the main UI thread.");
        this.f27456v.f26535w.set(interfaceC3597mf);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3435jf
    public final Bundle e() {
        Bundle bundle;
        R2.w.d("#008 Must be called on the main UI thread.");
        C2513Bn c2513Bn = this.f27453C;
        if (c2513Bn == null) {
            return new Bundle();
        }
        C2714Nk c2714Nk = c2513Bn.f24719q;
        synchronized (c2714Nk) {
            bundle = new Bundle(c2714Nk.f27304v);
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3435jf
    public final synchronized void e3(C4028uf c4028uf) {
        R2.w.d("#008 Must be called on the main UI thread.");
        Zt zt = this.f27458x;
        zt.f29743a = c4028uf.f35327n;
        zt.f29744b = c4028uf.f35328u;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3435jf
    public final boolean g() {
        R2.w.d("#008 Must be called on the main UI thread.");
        C2513Bn c2513Bn = this.f27453C;
        return (c2513Bn == null || c2513Bn.f24725w) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3435jf
    public final InterfaceC3221ff k() {
        R2.w.d("#008 Must be called on the main UI thread.");
        C2513Bn c2513Bn = this.f27453C;
        if (c2513Bn != null) {
            return c2513Bn.f24721s;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3435jf
    public final InterfaceC4963w0 l() {
        C2513Bn c2513Bn;
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32802F7)).booleanValue() && (c2513Bn = this.f27453C) != null) {
            return c2513Bn.f25627f;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3435jf
    public final synchronized String n() {
        BinderC3871rk binderC3871rk;
        C2513Bn c2513Bn = this.f27453C;
        if (c2513Bn == null || (binderC3871rk = c2513Bn.f25627f) == null) {
            return null;
        }
        return binderC3871rk.f34470n;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3435jf
    public final synchronized void o3(boolean z6) {
        R2.w.d("setImmersiveMode must be called on the main UI thread.");
        this.f27454D = z6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3435jf
    public final String q() {
        return this.f27457w;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3435jf
    public final synchronized long r() {
        C3387ik c3387ik;
        C2513Bn c2513Bn = this.f27453C;
        if (c2513Bn == null || (c3387ik = c2513Bn.f25630j) == null) {
            return 0L;
        }
        return c3387ik.f31884a.get();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3435jf
    public final void z1(InterfaceC4953r0 interfaceC4953r0) {
        R2.w.d("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!interfaceC4953r0.e()) {
                this.f27452B.b();
            }
        } catch (RemoteException e9) {
            int i = w2.z.f41712b;
            x2.i.b("Error in making CSI ping for reporting paid event callback", e9);
        }
        this.f27456v.f26529A.set(interfaceC4953r0);
    }
}
