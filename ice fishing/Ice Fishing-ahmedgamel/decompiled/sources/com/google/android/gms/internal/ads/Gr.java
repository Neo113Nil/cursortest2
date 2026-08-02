package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import r2.C4906k;
import s2.InterfaceC4917A;
import s2.InterfaceC4920a0;
import s2.InterfaceC4953r0;
import s2.InterfaceC4958u;
import s2.InterfaceC4963w0;
import s2.InterfaceC4964x;
import x2.C5189a;

/* loaded from: classes2.dex */
public final class Gr extends s2.J {

    /* renamed from: A, reason: collision with root package name */
    public final C3464k7 f25905A;

    /* renamed from: B, reason: collision with root package name */
    public final C3230fo f25906B;

    /* renamed from: C, reason: collision with root package name */
    public C2732Ol f25907C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f25908D;

    /* renamed from: n, reason: collision with root package name */
    public final s2.f1 f25909n;

    /* renamed from: u, reason: collision with root package name */
    public final Context f25910u;

    /* renamed from: v, reason: collision with root package name */
    public final Gt f25911v;

    /* renamed from: w, reason: collision with root package name */
    public final String f25912w;

    /* renamed from: x, reason: collision with root package name */
    public final C5189a f25913x;

    /* renamed from: y, reason: collision with root package name */
    public final Dr f25914y;

    /* renamed from: z, reason: collision with root package name */
    public final Jt f25915z;

    public Gr(Context context, s2.f1 f1Var, String str, Gt gt, Dr dr, Jt jt, C5189a c5189a, C3464k7 c3464k7, C3230fo c3230fo) {
        this.f25909n = f1Var;
        this.f25912w = str;
        this.f25910u = context;
        this.f25911v = gt;
        this.f25914y = dr;
        this.f25915z = jt;
        this.f25913x = c5189a;
        C3324ha c3324ha = AbstractC3592ma.f33086m1;
        s2.r rVar = s2.r.f40506e;
        if (!((Boolean) rVar.f40509c.a(c3324ha)).booleanValue() || Build.VERSION.SDK_INT < 35) {
            this.f25908D = ((Boolean) rVar.f40509c.a(AbstractC3592ma.f33077l1)).booleanValue();
        } else {
            this.f25908D = true;
        }
        this.f25905A = c3464k7;
        this.f25906B = c3230fo;
    }

    @Override // s2.K
    public final synchronized void A() {
        R2.w.d("destroy must be called on the main UI thread.");
        C2732Ol c2732Ol = this.f25907C;
        if (c2732Ol != null) {
            C2578Fk c2578Fk = c2732Ol.f25624c;
            c2578Fk.getClass();
            c2578Fk.M1(new C3216fa(null, false));
        }
    }

    @Override // s2.K
    public final InterfaceC4964x B() {
        return this.f25914y.a();
    }

    @Override // s2.K
    public final synchronized InterfaceC4963w0 C() {
        C2732Ol c2732Ol;
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32802F7)).booleanValue() && (c2732Ol = this.f25907C) != null) {
            return c2732Ol.f25627f;
        }
        return null;
    }

    @Override // s2.K
    public final void C0(C2892Ye c2892Ye) {
        this.f25915z.f26536x.set(c2892Ye);
    }

    @Override // s2.K
    public final synchronized boolean D3(s2.c1 c1Var) {
        boolean z6;
        try {
            if (!c1Var.b()) {
                if (((Boolean) AbstractC2704Na.i.r()).booleanValue()) {
                    if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Cc)).booleanValue()) {
                        z6 = true;
                        if (this.f25913x.f41847v >= ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.Dc)).intValue() || !z6) {
                            R2.w.d("loadAd must be called on the main UI thread.");
                        }
                    }
                }
                z6 = false;
                if (this.f25913x.f41847v >= ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.Dc)).intValue()) {
                }
                R2.w.d("loadAd must be called on the main UI thread.");
            }
            w2.D d9 = C4906k.f40186C.f40191c;
            Context context = this.f25910u;
            if (w2.D.h(context) && c1Var.f40406L == null) {
                int i = w2.z.f41712b;
                x2.i.c("Failed to load the ad because app ID is missing.");
                Dr dr = this.f25914y;
                if (dr != null) {
                    dr.I(SK.F(4, null, null));
                }
            } else if (!U3()) {
                AbstractC2991bG.r(context, c1Var.f40422y);
                this.f25907C = null;
                return this.f25911v.a(c1Var, this.f25912w, new Ct(this.f25909n), new C3680o7(this));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // s2.K
    public final void E3(InterfaceC4920a0 interfaceC4920a0) {
        this.f25914y.f25241x.set(interfaceC4920a0);
    }

    @Override // s2.K
    public final void H1(InterfaceC4964x interfaceC4964x) {
        R2.w.d("setAdListener must be called on the main UI thread.");
        this.f25914y.f25237n.set(interfaceC4964x);
    }

    @Override // s2.K
    public final void I3(s2.c1 c1Var, InterfaceC4917A interfaceC4917A) {
        this.f25914y.f25240w.set(interfaceC4917A);
        D3(c1Var);
    }

    @Override // s2.K
    public final synchronized boolean L() {
        return this.f25911v.b();
    }

    @Override // s2.K
    public final void M2(String str) {
    }

    @Override // s2.K
    public final void M3(InterfaceC4953r0 interfaceC4953r0) {
        R2.w.d("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!interfaceC4953r0.e()) {
                this.f25906B.b();
            }
        } catch (RemoteException e9) {
            int i = w2.z.f41712b;
            x2.i.b("Error in making CSI ping for reporting paid event callback", e9);
        }
        this.f25914y.f25239v.set(interfaceC4953r0);
    }

    @Override // s2.K
    public final synchronized String N() {
        return this.f25912w;
    }

    @Override // s2.K
    public final void P3(P8 p82) {
    }

    public final synchronized boolean U3() {
        C2732Ol c2732Ol = this.f25907C;
        if (c2732Ol != null) {
            if (!c2732Ol.f27430p.f27302u.get()) {
                return true;
            }
        }
        return false;
    }

    @Override // s2.K
    public final s2.A0 V() {
        return null;
    }

    @Override // s2.K
    public final Y2.a c() {
        return null;
    }

    @Override // s2.K
    public final void c2(boolean z6) {
    }

    @Override // s2.K
    public final synchronized void d() {
        R2.w.d("pause must be called on the main UI thread.");
        C2732Ol c2732Ol = this.f25907C;
        if (c2732Ol != null) {
            C2578Fk c2578Fk = c2732Ol.f25624c;
            c2578Fk.getClass();
            c2578Fk.M1(new C3538la(null, 1));
        }
    }

    @Override // s2.K
    public final void d2() {
        R2.w.d("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // s2.K
    public final synchronized void e() {
        R2.w.d("resume must be called on the main UI thread.");
        C2732Ol c2732Ol = this.f25907C;
        if (c2732Ol != null) {
            C2578Fk c2578Fk = c2732Ol.f25624c;
            c2578Fk.getClass();
            c2578Fk.M1(new C2572Fe(null, 1));
        }
    }

    @Override // s2.K
    public final synchronized long g0() {
        C3387ik c3387ik;
        C2732Ol c2732Ol = this.f25907C;
        if (c2732Ol == null || (c3387ik = c2732Ol.f25630j) == null) {
            return 0L;
        }
        return c3387ik.f31884a.get();
    }

    @Override // s2.K
    public final synchronized boolean i() {
        R2.w.d("isLoaded must be called on the main UI thread.");
        return U3();
    }

    @Override // s2.K
    public final Bundle j() {
        R2.w.d("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // s2.K
    public final synchronized void k() {
        R2.w.d("showInterstitial must be called on the main UI thread.");
        if (this.f25907C == null) {
            int i = w2.z.f41712b;
            x2.i.f("Interstitial can not be shown before loaded.");
            this.f25914y.c(SK.F(9, null, null));
        } else {
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32771C3)).booleanValue()) {
                this.f25905A.f32160b.e(new Throwable().getStackTrace());
            }
            this.f25907C.c(null, this.f25908D);
        }
    }

    @Override // s2.K
    public final void l() {
    }

    @Override // s2.K
    public final synchronized String m() {
        BinderC3871rk binderC3871rk;
        C2732Ol c2732Ol = this.f25907C;
        if (c2732Ol == null || (binderC3871rk = c2732Ol.f25627f) == null) {
            return null;
        }
        return binderC3871rk.f34470n;
    }

    @Override // s2.K
    public final synchronized void m2(C3915sa c3915sa) {
        R2.w.d("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f25911v.f25927f = c3915sa;
    }

    @Override // s2.K
    public final synchronized void n0(boolean z6) {
        R2.w.d("setImmersiveMode must be called on the main UI thread.");
        this.f25908D = z6;
    }

    @Override // s2.K
    public final void o0(s2.V v9) {
        R2.w.d("setAppEventListener must be called on the main UI thread.");
        this.f25914y.n(v9);
    }

    @Override // s2.K
    public final s2.f1 q() {
        return null;
    }

    @Override // s2.K
    public final synchronized boolean u() {
        return false;
    }

    @Override // s2.K
    public final synchronized String w() {
        BinderC3871rk binderC3871rk;
        C2732Ol c2732Ol = this.f25907C;
        if (c2732Ol == null || (binderC3871rk = c2732Ol.f25627f) == null) {
            return null;
        }
        return binderC3871rk.f34470n;
    }

    @Override // s2.K
    public final synchronized void w0(long j6) {
        C3387ik c3387ik;
        C2732Ol c2732Ol = this.f25907C;
        if (c2732Ol == null || (c3387ik = c2732Ol.f25630j) == null) {
            return;
        }
        c3387ik.a(j6);
    }

    @Override // s2.K
    public final synchronized void x0(Y2.a aVar) {
        if (this.f25907C == null) {
            int i = w2.z.f41712b;
            x2.i.f("Interstitial can not be shown before loaded.");
            this.f25914y.c(SK.F(9, null, null));
        } else {
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32771C3)).booleanValue()) {
                this.f25905A.f32160b.e(new Throwable().getStackTrace());
            }
            this.f25907C.c((Activity) Y2.b.D0(aVar), this.f25908D);
        }
    }

    @Override // s2.K
    public final s2.V y() {
        s2.V v9;
        Dr dr = this.f25914y;
        synchronized (dr) {
            v9 = (s2.V) dr.f25238u.get();
        }
        return v9;
    }

    @Override // s2.K
    public final void J() {
    }

    @Override // s2.K
    public final void c1() {
    }

    @Override // s2.K
    public final void r() {
    }

    @Override // s2.K
    public final void s() {
    }

    @Override // s2.K
    public final void B0(s2.Y y7) {
    }

    @Override // s2.K
    public final void F2(s2.f1 f1Var) {
    }

    @Override // s2.K
    public final void F3(s2.i1 i1Var) {
    }

    @Override // s2.K
    public final void o2(s2.Z0 z02) {
    }

    @Override // s2.K
    public final void p3(InterfaceC4958u interfaceC4958u) {
    }
}
