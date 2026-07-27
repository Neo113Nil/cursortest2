package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import p2.C4835j;
import q2.InterfaceC4868A;
import q2.InterfaceC4871a0;
import q2.InterfaceC4904r0;
import q2.InterfaceC4909u;
import q2.InterfaceC4914w0;
import q2.InterfaceC4915x;
import v2.C5110a;

/* loaded from: classes2.dex */
public final class Gr extends q2.J {

    /* renamed from: A, reason: collision with root package name */
    public final C3441k7 f25133A;

    /* renamed from: B, reason: collision with root package name */
    public final C3153eo f25134B;

    /* renamed from: C, reason: collision with root package name */
    public C2695Nl f25135C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f25136D;

    /* renamed from: n, reason: collision with root package name */
    public final q2.f1 f25137n;

    /* renamed from: u, reason: collision with root package name */
    public final Context f25138u;

    /* renamed from: v, reason: collision with root package name */
    public final Gt f25139v;

    /* renamed from: w, reason: collision with root package name */
    public final String f25140w;

    /* renamed from: x, reason: collision with root package name */
    public final C5110a f25141x;

    /* renamed from: y, reason: collision with root package name */
    public final Dr f25142y;

    /* renamed from: z, reason: collision with root package name */
    public final Jt f25143z;

    public Gr(Context context, q2.f1 f1Var, String str, Gt gt, Dr dr, Jt jt, C5110a c5110a, C3441k7 c3441k7, C3153eo c3153eo) {
        this.f25137n = f1Var;
        this.f25140w = str;
        this.f25138u = context;
        this.f25139v = gt;
        this.f25142y = dr;
        this.f25143z = jt;
        this.f25141x = c5110a;
        C3301ha c3301ha = AbstractC3569ma.f32307m1;
        q2.r rVar = q2.r.f40204e;
        if (!((Boolean) rVar.f40207c.a(c3301ha)).booleanValue() || Build.VERSION.SDK_INT < 35) {
            this.f25136D = ((Boolean) rVar.f40207c.a(AbstractC3569ma.f32298l1)).booleanValue();
        } else {
            this.f25136D = true;
        }
        this.f25133A = c3441k7;
        this.f25134B = c3153eo;
    }

    @Override // q2.K
    public final synchronized void A() {
        P2.w.d("destroy must be called on the main UI thread.");
        C2695Nl c2695Nl = this.f25135C;
        if (c2695Nl != null) {
            C2558Fk c2558Fk = c2695Nl.f24835c;
            c2558Fk.getClass();
            c2558Fk.M1(new C3193fa(null, false));
        }
    }

    @Override // q2.K
    public final synchronized void A0(long j6) {
        C3364ik c3364ik;
        C2695Nl c2695Nl = this.f25135C;
        if (c2695Nl == null || (c3364ik = c2695Nl.f24841j) == null) {
            return;
        }
        c3364ik.a(j6);
    }

    @Override // q2.K
    public final InterfaceC4915x B() {
        return this.f25142y.c();
    }

    @Override // q2.K
    public final synchronized InterfaceC4914w0 C() {
        C2695Nl c2695Nl;
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32021F7)).booleanValue() && (c2695Nl = this.f25135C) != null) {
            return c2695Nl.f24838f;
        }
        return null;
    }

    @Override // q2.K
    public final synchronized void C1(W2.a aVar) {
        if (this.f25135C == null) {
            int i = u2.z.f41319b;
            v2.i.f("Interstitial can not be shown before loaded.");
            this.f25142y.b(SK.F(9, null, null));
        } else {
            if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f31991C3)).booleanValue()) {
                this.f25133A.f31381b.e(new Throwable().getStackTrace());
            }
            this.f25135C.c((Activity) W2.b.F0(aVar), this.f25136D);
        }
    }

    @Override // q2.K
    public final void E0(C2869Ye c2869Ye) {
        this.f25143z.f25784x.set(c2869Ye);
    }

    @Override // q2.K
    public final synchronized boolean M() {
        return this.f25139v.b();
    }

    @Override // q2.K
    public final synchronized String N() {
        return this.f25140w;
    }

    @Override // q2.K
    public final void O2(String str) {
    }

    @Override // q2.K
    public final void P3(P8 p82) {
    }

    public final synchronized boolean U3() {
        C2695Nl c2695Nl = this.f25135C;
        if (c2695Nl != null) {
            if (!c2695Nl.f26526p.f26519u.get()) {
                return true;
            }
        }
        return false;
    }

    @Override // q2.K
    public final q2.A0 V() {
        return null;
    }

    @Override // q2.K
    public final void X0(InterfaceC4871a0 interfaceC4871a0) {
        this.f25142y.f24480x.set(interfaceC4871a0);
    }

    @Override // q2.K
    public final void Z2(InterfaceC4915x interfaceC4915x) {
        P2.w.d("setAdListener must be called on the main UI thread.");
        this.f25142y.f24476n.set(interfaceC4915x);
    }

    @Override // q2.K
    public final W2.a c() {
        return null;
    }

    @Override // q2.K
    public final synchronized void d() {
        P2.w.d("pause must be called on the main UI thread.");
        C2695Nl c2695Nl = this.f25135C;
        if (c2695Nl != null) {
            C2558Fk c2558Fk = c2695Nl.f24835c;
            c2558Fk.getClass();
            c2558Fk.M1(new C3515la(null, 1));
        }
    }

    @Override // q2.K
    public final synchronized boolean d3(q2.c1 c1Var) {
        boolean z3;
        try {
            if (!c1Var.b()) {
                if (((Boolean) AbstractC2684Na.i.r()).booleanValue()) {
                    if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.Cc)).booleanValue()) {
                        z3 = true;
                        if (this.f25141x.f41390v >= ((Integer) q2.r.f40204e.f40207c.a(AbstractC3569ma.Dc)).intValue() || !z3) {
                            P2.w.d("loadAd must be called on the main UI thread.");
                        }
                    }
                }
                z3 = false;
                if (this.f25141x.f41390v >= ((Integer) q2.r.f40204e.f40207c.a(AbstractC3569ma.Dc)).intValue()) {
                }
                P2.w.d("loadAd must be called on the main UI thread.");
            }
            u2.D d2 = C4835j.f39730C.f39735c;
            Context context = this.f25138u;
            if (u2.D.h(context) && c1Var.f40104L == null) {
                int i = u2.z.f41319b;
                v2.i.c("Failed to load the ad because app ID is missing.");
                Dr dr = this.f25142y;
                if (dr != null) {
                    dr.v(SK.F(4, null, null));
                }
            } else if (!U3()) {
                AbstractC2968bG.r(context, c1Var.f40120y);
                this.f25135C = null;
                return this.f25139v.a(c1Var, this.f25140w, new Ct(this.f25137n), new C3657o7(this));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // q2.K
    public final synchronized void e() {
        P2.w.d("resume must be called on the main UI thread.");
        C2695Nl c2695Nl = this.f25135C;
        if (c2695Nl != null) {
            C2558Fk c2558Fk = c2695Nl.f24835c;
            c2558Fk.getClass();
            c2558Fk.M1(new C2552Fe(null, 1));
        }
    }

    @Override // q2.K
    public final synchronized long f0() {
        C3364ik c3364ik;
        C2695Nl c2695Nl = this.f25135C;
        if (c2695Nl == null || (c3364ik = c2695Nl.f24841j) == null) {
            return 0L;
        }
        return c3364ik.f31114a.get();
    }

    @Override // q2.K
    public final void f2(boolean z3) {
    }

    @Override // q2.K
    public final synchronized boolean i() {
        P2.w.d("isLoaded must be called on the main UI thread.");
        return U3();
    }

    @Override // q2.K
    public final Bundle j() {
        P2.w.d("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // q2.K
    public final synchronized void k() {
        P2.w.d("showInterstitial must be called on the main UI thread.");
        if (this.f25135C == null) {
            int i = u2.z.f41319b;
            v2.i.f("Interstitial can not be shown before loaded.");
            this.f25142y.b(SK.F(9, null, null));
        } else {
            if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f31991C3)).booleanValue()) {
                this.f25133A.f31381b.e(new Throwable().getStackTrace());
            }
            this.f25135C.c(null, this.f25136D);
        }
    }

    @Override // q2.K
    public final void k2() {
        P2.w.d("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // q2.K
    public final void l() {
    }

    @Override // q2.K
    public final synchronized String m() {
        BinderC3848rk binderC3848rk;
        C2695Nl c2695Nl = this.f25135C;
        if (c2695Nl == null || (binderC3848rk = c2695Nl.f24838f) == null) {
            return null;
        }
        return binderC3848rk.f33698n;
    }

    @Override // q2.K
    public final void m2(q2.c1 c1Var, InterfaceC4868A interfaceC4868A) {
        this.f25142y.f24479w.set(interfaceC4868A);
        d3(c1Var);
    }

    @Override // q2.K
    public final synchronized void o0(boolean z3) {
        P2.w.d("setImmersiveMode must be called on the main UI thread.");
        this.f25136D = z3;
    }

    @Override // q2.K
    public final q2.f1 q() {
        return null;
    }

    @Override // q2.K
    public final synchronized void r2(C3892sa c3892sa) {
        P2.w.d("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f25139v.f25155f = c3892sa;
    }

    @Override // q2.K
    public final void s0(InterfaceC4904r0 interfaceC4904r0) {
        P2.w.d("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!interfaceC4904r0.e()) {
                this.f25134B.b();
            }
        } catch (RemoteException e9) {
            int i = u2.z.f41319b;
            v2.i.b("Error in making CSI ping for reporting paid event callback", e9);
        }
        this.f25142y.f24478v.set(interfaceC4904r0);
    }

    @Override // q2.K
    public final synchronized boolean u() {
        return false;
    }

    @Override // q2.K
    public final synchronized String w() {
        BinderC3848rk binderC3848rk;
        C2695Nl c2695Nl = this.f25135C;
        if (c2695Nl == null || (binderC3848rk = c2695Nl.f24838f) == null) {
            return null;
        }
        return binderC3848rk.f33698n;
    }

    @Override // q2.K
    public final void x1(q2.V v9) {
        P2.w.d("setAppEventListener must be called on the main UI thread.");
        this.f25142y.n(v9);
    }

    @Override // q2.K
    public final q2.V y() {
        q2.V v9;
        Dr dr = this.f25142y;
        synchronized (dr) {
            v9 = (q2.V) dr.f24477u.get();
        }
        return v9;
    }

    @Override // q2.K
    public final void K() {
    }

    @Override // q2.K
    public final void e1() {
    }

    @Override // q2.K
    public final void r() {
    }

    @Override // q2.K
    public final void s() {
    }

    @Override // q2.K
    public final void B3(InterfaceC4909u interfaceC4909u) {
    }

    @Override // q2.K
    public final void U0(q2.Z0 z02) {
    }

    @Override // q2.K
    public final void U1(q2.f1 f1Var) {
    }

    @Override // q2.K
    public final void Y2(q2.i1 i1Var) {
    }

    @Override // q2.K
    public final void r3(q2.Y y7) {
    }
}
