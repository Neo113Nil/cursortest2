package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.FrameLayout;
import java.util.Collections;
import p2.C4835j;
import q2.InterfaceC4868A;
import q2.InterfaceC4871a0;
import q2.InterfaceC4904r0;
import q2.InterfaceC4909u;
import q2.InterfaceC4914w0;
import q2.InterfaceC4915x;
import v2.C5110a;

/* loaded from: classes2.dex */
public final class Br extends q2.J implements InterfaceC2843Wk {

    /* renamed from: A, reason: collision with root package name */
    public final C3153eo f23972A;

    /* renamed from: B, reason: collision with root package name */
    public C3524lj f23973B;

    /* renamed from: n, reason: collision with root package name */
    public final Context f23974n;

    /* renamed from: u, reason: collision with root package name */
    public final C3696ot f23975u;

    /* renamed from: v, reason: collision with root package name */
    public final String f23976v;

    /* renamed from: w, reason: collision with root package name */
    public final Dr f23977w;

    /* renamed from: x, reason: collision with root package name */
    public q2.f1 f23978x;

    /* renamed from: y, reason: collision with root package name */
    public final C2999bu f23979y;

    /* renamed from: z, reason: collision with root package name */
    public final C5110a f23980z;

    public Br(Context context, q2.f1 f1Var, String str, C3696ot c3696ot, Dr dr, C5110a c5110a, C3153eo c3153eo) {
        this.f23974n = context;
        this.f23975u = c3696ot;
        this.f23978x = f1Var;
        this.f23976v = str;
        this.f23977w = dr;
        this.f23979y = c3696ot.f32971k;
        this.f23980z = c5110a;
        this.f23972A = c3153eo;
        c3696ot.f32969h.H1(this, c3696ot.f32963b);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003d, B:12:0x0041, B:19:0x0038), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[DONT_GENERATE] */
    @Override // q2.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void A() {
        C3524lj c3524lj;
        try {
            if (((Boolean) AbstractC2684Na.f26497e.r()).booleanValue()) {
                C3301ha c3301ha = AbstractC3569ma.zc;
                q2.r rVar = q2.r.f40204e;
                if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
                    if (this.f23980z.f41390v < ((Integer) rVar.f40207c.a(AbstractC3569ma.Ec)).intValue()) {
                    }
                    c3524lj = this.f23973B;
                    if (c3524lj == null) {
                        C2558Fk c2558Fk = c3524lj.f24835c;
                        c2558Fk.getClass();
                        c2558Fk.M1(new C3193fa(null, false));
                        return;
                    }
                    return;
                }
            }
            P2.w.d("destroy must be called on the main UI thread.");
            c3524lj = this.f23973B;
            if (c3524lj == null) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // q2.K
    public final synchronized void A0(long j6) {
        C3364ik c3364ik;
        this.f23979y.f29362u.set(j6);
        C3524lj c3524lj = this.f23973B;
        if (c3524lj == null || (c3364ik = c3524lj.f24841j) == null) {
            return;
        }
        c3364ik.a(j6);
    }

    @Override // q2.K
    public final InterfaceC4915x B() {
        return this.f23977w.c();
    }

    @Override // q2.K
    public final void B3(InterfaceC4909u interfaceC4909u) {
        if (V3()) {
            P2.w.d("setAdListener must be called on the main UI thread.");
        }
        Fr fr = this.f23975u.f32966e;
        synchronized (fr) {
            fr.f24853n = interfaceC4909u;
        }
    }

    @Override // q2.K
    public final synchronized InterfaceC4914w0 C() {
        C3524lj c3524lj;
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32021F7)).booleanValue() && (c3524lj = this.f23973B) != null) {
            return c3524lj.f24838f;
        }
        return null;
    }

    @Override // q2.K
    public final synchronized boolean M() {
        return this.f23975u.b();
    }

    @Override // q2.K
    public final synchronized String N() {
        return this.f23976v;
    }

    @Override // q2.K
    public final void O2(String str) {
    }

    @Override // q2.K
    public final void P3(P8 p82) {
    }

    @Override // q2.K
    public final synchronized void U0(q2.Z0 z02) {
        try {
            if (V3()) {
                P2.w.d("setVideoOptions must be called on the main UI thread.");
            }
            this.f23979y.f29346d = z02;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // q2.K
    public final synchronized void U1(q2.f1 f1Var) {
        InterfaceC4061vh interfaceC4061vh;
        P2.w.d("setAdSize must be called on the main UI thread.");
        this.f23979y.f29344b = f1Var;
        this.f23978x = f1Var;
        C3524lj c3524lj = this.f23973B;
        if (c3524lj != null) {
            FrameLayout frameLayout = this.f23975u.f32967f;
            if (frameLayout != null && (interfaceC4061vh = c3524lj.f31828n) != null) {
                interfaceC4061vh.o0(X2.b.a(f1Var));
                frameLayout.setMinimumHeight(f1Var.f40141v);
                frameLayout.setMinimumWidth(f1Var.f40144y);
                c3524lj.f31835u = f1Var;
            }
        }
    }

    public final synchronized boolean U3(q2.c1 c1Var) {
        try {
            if (V3()) {
                P2.w.d("loadAd must be called on the main UI thread.");
            }
            u2.D d2 = C4835j.f39730C.f39735c;
            Context context = this.f23974n;
            if (!u2.D.h(context) || c1Var.f40104L != null) {
                AbstractC2968bG.r(context, c1Var.f40120y);
                return this.f23975u.a(c1Var, this.f23976v, null, new Ux(this));
            }
            int i = u2.z.f41319b;
            v2.i.c("Failed to load the ad because app ID is missing.");
            Dr dr = this.f23977w;
            if (dr != null) {
                dr.v(SK.F(4, null, null));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // q2.K
    public final synchronized q2.A0 V() {
        P2.w.d("getVideoController must be called from the main thread.");
        C3524lj c3524lj = this.f23973B;
        q2.A0 a02 = null;
        if (c3524lj == null) {
            return null;
        }
        try {
            a02 = c3524lj.f31830p.mo13c();
        } catch (C3267gu unused) {
        }
        return a02;
    }

    public final boolean V3() {
        boolean z3;
        if (((Boolean) AbstractC2684Na.f26498f.r()).booleanValue()) {
            if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.Cc)).booleanValue()) {
                z3 = true;
                return this.f23980z.f41390v >= ((Integer) q2.r.f40204e.f40207c.a(AbstractC3569ma.Dc)).intValue() || !z3;
            }
        }
        z3 = false;
        if (this.f23980z.f41390v >= ((Integer) q2.r.f40204e.f40207c.a(AbstractC3569ma.Dc)).intValue()) {
        }
    }

    @Override // q2.K
    public final void Z2(InterfaceC4915x interfaceC4915x) {
        if (V3()) {
            P2.w.d("setAdListener must be called on the main UI thread.");
        }
        this.f23977w.f24476n.set(interfaceC4915x);
    }

    @Override // q2.K
    public final W2.a c() {
        if (V3()) {
            P2.w.d("getAdFrame must be called on the main UI thread.");
        }
        return new W2.b(this.f23975u.f32967f);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003d, B:12:0x0041, B:19:0x0038), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[DONT_GENERATE] */
    @Override // q2.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void d() {
        C3524lj c3524lj;
        try {
            if (((Boolean) AbstractC2684Na.f26499g.r()).booleanValue()) {
                C3301ha c3301ha = AbstractC3569ma.Ac;
                q2.r rVar = q2.r.f40204e;
                if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
                    if (this.f23980z.f41390v < ((Integer) rVar.f40207c.a(AbstractC3569ma.Ec)).intValue()) {
                    }
                    c3524lj = this.f23973B;
                    if (c3524lj == null) {
                        C2558Fk c2558Fk = c3524lj.f24835c;
                        c2558Fk.getClass();
                        c2558Fk.M1(new C3515la(null, 1));
                        return;
                    }
                    return;
                }
            }
            P2.w.d("pause must be called on the main UI thread.");
            c3524lj = this.f23973B;
            if (c3524lj == null) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // q2.K
    public final synchronized boolean d3(q2.c1 c1Var) {
        q2.f1 f1Var = this.f23978x;
        synchronized (this) {
            C2999bu c2999bu = this.f23979y;
            c2999bu.f29344b = f1Var;
            c2999bu.f29358q = this.f23978x.f40136G;
        }
        return U3(c1Var);
        return U3(c1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003d, B:12:0x0041, B:19:0x0038), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[DONT_GENERATE] */
    @Override // q2.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void e() {
        C3524lj c3524lj;
        try {
            if (((Boolean) AbstractC2684Na.f26500h.r()).booleanValue()) {
                C3301ha c3301ha = AbstractC3569ma.yc;
                q2.r rVar = q2.r.f40204e;
                if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
                    if (this.f23980z.f41390v < ((Integer) rVar.f40207c.a(AbstractC3569ma.Ec)).intValue()) {
                    }
                    c3524lj = this.f23973B;
                    if (c3524lj == null) {
                        C2558Fk c2558Fk = c3524lj.f24835c;
                        c2558Fk.getClass();
                        c2558Fk.M1(new C2552Fe(null, 1));
                        return;
                    }
                    return;
                }
            }
            P2.w.d("resume must be called on the main UI thread.");
            c3524lj = this.f23973B;
            if (c3524lj == null) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // q2.K
    public final synchronized long f0() {
        C3364ik c3364ik;
        C3524lj c3524lj = this.f23973B;
        return (c3524lj == null || (c3364ik = c3524lj.f24841j) == null) ? this.f23979y.f29362u.get() : c3364ik.f31114a.get();
    }

    @Override // q2.K
    public final synchronized void f2(boolean z3) {
        try {
            if (V3()) {
                P2.w.d("setManualImpressionsEnabled must be called from the main thread.");
            }
            this.f23979y.f29347e = z3;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // q2.K
    public final boolean i() {
        return false;
    }

    @Override // q2.K
    public final Bundle j() {
        P2.w.d("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // q2.K
    public final void k() {
    }

    @Override // q2.K
    public final void k2() {
        P2.w.d("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // q2.K
    public final synchronized void l() {
        P2.w.d("recordManualImpression must be called on the main UI thread.");
        C3524lj c3524lj = this.f23973B;
        if (c3524lj != null) {
            C2559Fl c2559Fl = c3524lj.f31832r;
            synchronized (c2559Fl) {
                c2559Fl.M1(C3472kl.f31607F);
            }
        }
    }

    @Override // q2.K
    public final synchronized String m() {
        BinderC3848rk binderC3848rk;
        C3524lj c3524lj = this.f23973B;
        if (c3524lj == null || (binderC3848rk = c3524lj.f24838f) == null) {
            return null;
        }
        return binderC3848rk.f33698n;
    }

    @Override // q2.K
    public final void o0(boolean z3) {
    }

    @Override // q2.K
    public final synchronized q2.f1 q() {
        P2.w.d("getAdSize must be called on the main UI thread.");
        C3524lj c3524lj = this.f23973B;
        if (c3524lj != null) {
            return AbstractC3043cl.k(this.f23974n, Collections.singletonList(c3524lj.c()));
        }
        return this.f23979y.f29344b;
    }

    @Override // q2.K
    public final synchronized void r2(C3892sa c3892sa) {
        P2.w.d("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f23975u.f32968g = c3892sa;
    }

    @Override // q2.K
    public final synchronized void r3(q2.Y y7) {
        P2.w.d("setCorrelationIdProvider must be called on the main UI thread");
        this.f23979y.f29365x = y7;
    }

    @Override // q2.K
    public final void s0(InterfaceC4904r0 interfaceC4904r0) {
        if (V3()) {
            P2.w.d("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!interfaceC4904r0.e()) {
                this.f23972A.b();
            }
        } catch (RemoteException e9) {
            int i = u2.z.f41319b;
            v2.i.b("Error in making CSI ping for reporting paid event callback", e9);
        }
        this.f23977w.f24478v.set(interfaceC4904r0);
    }

    @Override // q2.K
    public final synchronized boolean u() {
        C3524lj c3524lj = this.f23973B;
        if (c3524lj != null) {
            if (c3524lj.f24834b.f27637q0) {
                return true;
            }
        }
        return false;
    }

    @Override // q2.K
    public final synchronized String w() {
        BinderC3848rk binderC3848rk;
        C3524lj c3524lj = this.f23973B;
        if (c3524lj == null || (binderC3848rk = c3524lj.f24838f) == null) {
            return null;
        }
        return binderC3848rk.f33698n;
    }

    @Override // q2.K
    public final void x1(q2.V v9) {
        if (V3()) {
            P2.w.d("setAppEventListener must be called on the main UI thread.");
        }
        this.f23977w.n(v9);
    }

    @Override // q2.K
    public final q2.V y() {
        q2.V v9;
        Dr dr = this.f23977w;
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
    public final void C1(W2.a aVar) {
    }

    @Override // q2.K
    public final void E0(C2869Ye c2869Ye) {
    }

    @Override // q2.K
    public final void X0(InterfaceC4871a0 interfaceC4871a0) {
    }

    @Override // q2.K
    public final void Y2(q2.i1 i1Var) {
    }

    @Override // q2.K
    public final void m2(q2.c1 c1Var, InterfaceC4868A interfaceC4868A) {
    }
}
