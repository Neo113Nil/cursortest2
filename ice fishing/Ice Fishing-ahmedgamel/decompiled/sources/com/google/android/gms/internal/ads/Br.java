package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.FrameLayout;
import java.util.Collections;
import r2.C4906k;
import s2.InterfaceC4917A;
import s2.InterfaceC4920a0;
import s2.InterfaceC4953r0;
import s2.InterfaceC4958u;
import s2.InterfaceC4963w0;
import s2.InterfaceC4964x;
import x2.C5189a;

/* loaded from: classes2.dex */
public final class Br extends s2.J implements InterfaceC2866Wk {

    /* renamed from: A, reason: collision with root package name */
    public final C3230fo f24735A;

    /* renamed from: B, reason: collision with root package name */
    public C3547lj f24736B;

    /* renamed from: n, reason: collision with root package name */
    public final Context f24737n;

    /* renamed from: u, reason: collision with root package name */
    public final C3719ot f24738u;

    /* renamed from: v, reason: collision with root package name */
    public final String f24739v;

    /* renamed from: w, reason: collision with root package name */
    public final Dr f24740w;

    /* renamed from: x, reason: collision with root package name */
    public s2.f1 f24741x;

    /* renamed from: y, reason: collision with root package name */
    public final C3022bu f24742y;

    /* renamed from: z, reason: collision with root package name */
    public final C5189a f24743z;

    public Br(Context context, s2.f1 f1Var, String str, C3719ot c3719ot, Dr dr, C5189a c5189a, C3230fo c3230fo) {
        this.f24737n = context;
        this.f24738u = c3719ot;
        this.f24741x = f1Var;
        this.f24739v = str;
        this.f24740w = dr;
        this.f24742y = c3719ot.f33757k;
        this.f24743z = c5189a;
        this.f24735A = c3230fo;
        c3719ot.f33755h.I1(this, c3719ot.f33749b);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003d, B:12:0x0041, B:19:0x0038), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[DONT_GENERATE] */
    @Override // s2.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void A() {
        C3547lj c3547lj;
        try {
            if (((Boolean) AbstractC2704Na.f27280e.r()).booleanValue()) {
                C3324ha c3324ha = AbstractC3592ma.zc;
                s2.r rVar = s2.r.f40506e;
                if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                    if (this.f24743z.f41847v < ((Integer) rVar.f40509c.a(AbstractC3592ma.Ec)).intValue()) {
                    }
                    c3547lj = this.f24736B;
                    if (c3547lj == null) {
                        C2578Fk c2578Fk = c3547lj.f25624c;
                        c2578Fk.getClass();
                        c2578Fk.M1(new C3216fa(null, false));
                        return;
                    }
                    return;
                }
            }
            R2.w.d("destroy must be called on the main UI thread.");
            c3547lj = this.f24736B;
            if (c3547lj == null) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // s2.K
    public final InterfaceC4964x B() {
        return this.f24740w.a();
    }

    @Override // s2.K
    public final synchronized void B0(s2.Y y7) {
        R2.w.d("setCorrelationIdProvider must be called on the main UI thread");
        this.f24742y.f30153x = y7;
    }

    @Override // s2.K
    public final synchronized InterfaceC4963w0 C() {
        C3547lj c3547lj;
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32802F7)).booleanValue() && (c3547lj = this.f24736B) != null) {
            return c3547lj.f25627f;
        }
        return null;
    }

    @Override // s2.K
    public final synchronized boolean D3(s2.c1 c1Var) {
        s2.f1 f1Var = this.f24741x;
        synchronized (this) {
            C3022bu c3022bu = this.f24742y;
            c3022bu.f30132b = f1Var;
            c3022bu.f30146q = this.f24741x.f40438G;
        }
        return U3(c1Var);
        return U3(c1Var);
    }

    @Override // s2.K
    public final synchronized void F2(s2.f1 f1Var) {
        InterfaceC4084vh interfaceC4084vh;
        R2.w.d("setAdSize must be called on the main UI thread.");
        this.f24742y.f30132b = f1Var;
        this.f24741x = f1Var;
        C3547lj c3547lj = this.f24736B;
        if (c3547lj != null) {
            FrameLayout frameLayout = this.f24738u.f33753f;
            if (frameLayout != null && (interfaceC4084vh = c3547lj.f32606n) != null) {
                interfaceC4084vh.f1(A3.r.a(f1Var));
                frameLayout.setMinimumHeight(f1Var.f40443v);
                frameLayout.setMinimumWidth(f1Var.f40446y);
                c3547lj.f32613u = f1Var;
            }
        }
    }

    @Override // s2.K
    public final void H1(InterfaceC4964x interfaceC4964x) {
        if (V3()) {
            R2.w.d("setAdListener must be called on the main UI thread.");
        }
        this.f24740w.f25237n.set(interfaceC4964x);
    }

    @Override // s2.K
    public final synchronized boolean L() {
        return this.f24738u.b();
    }

    @Override // s2.K
    public final void M2(String str) {
    }

    @Override // s2.K
    public final void M3(InterfaceC4953r0 interfaceC4953r0) {
        if (V3()) {
            R2.w.d("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!interfaceC4953r0.e()) {
                this.f24735A.b();
            }
        } catch (RemoteException e9) {
            int i = w2.z.f41712b;
            x2.i.b("Error in making CSI ping for reporting paid event callback", e9);
        }
        this.f24740w.f25239v.set(interfaceC4953r0);
    }

    @Override // s2.K
    public final synchronized String N() {
        return this.f24739v;
    }

    @Override // s2.K
    public final void P3(P8 p82) {
    }

    public final synchronized boolean U3(s2.c1 c1Var) {
        try {
            if (V3()) {
                R2.w.d("loadAd must be called on the main UI thread.");
            }
            w2.D d9 = C4906k.f40186C.f40191c;
            Context context = this.f24737n;
            if (!w2.D.h(context) || c1Var.f40406L != null) {
                AbstractC2991bG.r(context, c1Var.f40422y);
                return this.f24738u.a(c1Var, this.f24739v, null, new Ux(this));
            }
            int i = w2.z.f41712b;
            x2.i.c("Failed to load the ad because app ID is missing.");
            Dr dr = this.f24740w;
            if (dr != null) {
                dr.I(SK.F(4, null, null));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // s2.K
    public final synchronized s2.A0 V() {
        R2.w.d("getVideoController must be called from the main thread.");
        C3547lj c3547lj = this.f24736B;
        s2.A0 a02 = null;
        if (c3547lj == null) {
            return null;
        }
        try {
            a02 = c3547lj.f32608p.mo12c();
        } catch (C3290gu unused) {
        }
        return a02;
    }

    public final boolean V3() {
        boolean z6;
        if (((Boolean) AbstractC2704Na.f27281f.r()).booleanValue()) {
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Cc)).booleanValue()) {
                z6 = true;
                return this.f24743z.f41847v >= ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.Dc)).intValue() || !z6;
            }
        }
        z6 = false;
        if (this.f24743z.f41847v >= ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.Dc)).intValue()) {
        }
    }

    @Override // s2.K
    public final Y2.a c() {
        if (V3()) {
            R2.w.d("getAdFrame must be called on the main UI thread.");
        }
        return new Y2.b(this.f24738u.f33753f);
    }

    @Override // s2.K
    public final synchronized void c2(boolean z6) {
        try {
            if (V3()) {
                R2.w.d("setManualImpressionsEnabled must be called from the main thread.");
            }
            this.f24742y.f30135e = z6;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003d, B:12:0x0041, B:19:0x0038), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[DONT_GENERATE] */
    @Override // s2.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void d() {
        C3547lj c3547lj;
        try {
            if (((Boolean) AbstractC2704Na.f27282g.r()).booleanValue()) {
                C3324ha c3324ha = AbstractC3592ma.Ac;
                s2.r rVar = s2.r.f40506e;
                if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                    if (this.f24743z.f41847v < ((Integer) rVar.f40509c.a(AbstractC3592ma.Ec)).intValue()) {
                    }
                    c3547lj = this.f24736B;
                    if (c3547lj == null) {
                        C2578Fk c2578Fk = c3547lj.f25624c;
                        c2578Fk.getClass();
                        c2578Fk.M1(new C3538la(null, 1));
                        return;
                    }
                    return;
                }
            }
            R2.w.d("pause must be called on the main UI thread.");
            c3547lj = this.f24736B;
            if (c3547lj == null) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // s2.K
    public final void d2() {
        R2.w.d("setAdMetadataListener must be called on the main UI thread.");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003d, B:12:0x0041, B:19:0x0038), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[DONT_GENERATE] */
    @Override // s2.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void e() {
        C3547lj c3547lj;
        try {
            if (((Boolean) AbstractC2704Na.f27283h.r()).booleanValue()) {
                C3324ha c3324ha = AbstractC3592ma.yc;
                s2.r rVar = s2.r.f40506e;
                if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                    if (this.f24743z.f41847v < ((Integer) rVar.f40509c.a(AbstractC3592ma.Ec)).intValue()) {
                    }
                    c3547lj = this.f24736B;
                    if (c3547lj == null) {
                        C2578Fk c2578Fk = c3547lj.f25624c;
                        c2578Fk.getClass();
                        c2578Fk.M1(new C2572Fe(null, 1));
                        return;
                    }
                    return;
                }
            }
            R2.w.d("resume must be called on the main UI thread.");
            c3547lj = this.f24736B;
            if (c3547lj == null) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // s2.K
    public final synchronized long g0() {
        C3387ik c3387ik;
        C3547lj c3547lj = this.f24736B;
        return (c3547lj == null || (c3387ik = c3547lj.f25630j) == null) ? this.f24742y.f30150u.get() : c3387ik.f31884a.get();
    }

    @Override // s2.K
    public final boolean i() {
        return false;
    }

    @Override // s2.K
    public final Bundle j() {
        R2.w.d("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // s2.K
    public final void k() {
    }

    @Override // s2.K
    public final synchronized void l() {
        R2.w.d("recordManualImpression must be called on the main UI thread.");
        C3547lj c3547lj = this.f24736B;
        if (c3547lj != null) {
            C2596Gl c2596Gl = c3547lj.f32610r;
            synchronized (c2596Gl) {
                c2596Gl.M1(C3495kl.f32384F);
            }
        }
    }

    @Override // s2.K
    public final synchronized String m() {
        BinderC3871rk binderC3871rk;
        C3547lj c3547lj = this.f24736B;
        if (c3547lj == null || (binderC3871rk = c3547lj.f25627f) == null) {
            return null;
        }
        return binderC3871rk.f34470n;
    }

    @Override // s2.K
    public final synchronized void m2(C3915sa c3915sa) {
        R2.w.d("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f24738u.f33754g = c3915sa;
    }

    @Override // s2.K
    public final void n0(boolean z6) {
    }

    @Override // s2.K
    public final void o0(s2.V v9) {
        if (V3()) {
            R2.w.d("setAppEventListener must be called on the main UI thread.");
        }
        this.f24740w.n(v9);
    }

    @Override // s2.K
    public final synchronized void o2(s2.Z0 z02) {
        try {
            if (V3()) {
                R2.w.d("setVideoOptions must be called on the main UI thread.");
            }
            this.f24742y.f30134d = z02;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // s2.K
    public final void p3(InterfaceC4958u interfaceC4958u) {
        if (V3()) {
            R2.w.d("setAdListener must be called on the main UI thread.");
        }
        Fr fr = this.f24738u.f33752e;
        synchronized (fr) {
            fr.f25643n = interfaceC4958u;
        }
    }

    @Override // s2.K
    public final synchronized s2.f1 q() {
        R2.w.d("getAdSize must be called on the main UI thread.");
        C3547lj c3547lj = this.f24736B;
        if (c3547lj != null) {
            return AbstractC3066cl.k(this.f24737n, Collections.singletonList(c3547lj.c()));
        }
        return this.f24742y.f30132b;
    }

    @Override // s2.K
    public final synchronized boolean u() {
        C3547lj c3547lj = this.f24736B;
        if (c3547lj != null) {
            if (c3547lj.f25623b.f28420q0) {
                return true;
            }
        }
        return false;
    }

    @Override // s2.K
    public final synchronized String w() {
        BinderC3871rk binderC3871rk;
        C3547lj c3547lj = this.f24736B;
        if (c3547lj == null || (binderC3871rk = c3547lj.f25627f) == null) {
            return null;
        }
        return binderC3871rk.f34470n;
    }

    @Override // s2.K
    public final synchronized void w0(long j6) {
        C3387ik c3387ik;
        this.f24742y.f30150u.set(j6);
        C3547lj c3547lj = this.f24736B;
        if (c3547lj == null || (c3387ik = c3547lj.f25630j) == null) {
            return;
        }
        c3387ik.a(j6);
    }

    @Override // s2.K
    public final s2.V y() {
        s2.V v9;
        Dr dr = this.f24740w;
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
    public final void C0(C2892Ye c2892Ye) {
    }

    @Override // s2.K
    public final void E3(InterfaceC4920a0 interfaceC4920a0) {
    }

    @Override // s2.K
    public final void F3(s2.i1 i1Var) {
    }

    @Override // s2.K
    public final void x0(Y2.a aVar) {
    }

    @Override // s2.K
    public final void I3(s2.c1 c1Var, InterfaceC4917A interfaceC4917A) {
    }
}
