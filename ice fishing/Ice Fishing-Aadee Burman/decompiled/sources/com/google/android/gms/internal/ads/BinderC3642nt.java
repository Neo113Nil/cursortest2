package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p2.C4835j;
import q2.InterfaceC4868A;
import q2.InterfaceC4871a0;
import q2.InterfaceC4904r0;
import q2.InterfaceC4909u;
import q2.InterfaceC4914w0;
import q2.InterfaceC4915x;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.nt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3642nt extends q2.J implements t2.l, I8 {

    /* renamed from: A, reason: collision with root package name */
    public final C3153eo f32793A;

    /* renamed from: C, reason: collision with root package name */
    public C3202fj f32795C;

    /* renamed from: D, reason: collision with root package name */
    public C3256gj f32796D;

    /* renamed from: n, reason: collision with root package name */
    public final C3309hi f32797n;

    /* renamed from: u, reason: collision with root package name */
    public final Context f32798u;

    /* renamed from: w, reason: collision with root package name */
    public final String f32800w;

    /* renamed from: x, reason: collision with root package name */
    public final C3426jt f32801x;

    /* renamed from: y, reason: collision with root package name */
    public final C3266gt f32802y;

    /* renamed from: z, reason: collision with root package name */
    public final C5110a f32803z;

    /* renamed from: v, reason: collision with root package name */
    public AtomicBoolean f32799v = new AtomicBoolean();

    /* renamed from: B, reason: collision with root package name */
    public long f32794B = -1;

    public BinderC3642nt(C3309hi c3309hi, Context context, String str, C3426jt c3426jt, C3266gt c3266gt, C5110a c5110a, C3153eo c3153eo) {
        this.f32797n = c3309hi;
        this.f32798u = context;
        this.f32800w = str;
        this.f32801x = c3426jt;
        this.f32802y = c3266gt;
        this.f32803z = c5110a;
        this.f32793A = c3153eo;
        c3266gt.f30674y.set(this);
    }

    @Override // q2.K
    public final synchronized void A() {
        P2.w.d("destroy must be called on the main UI thread.");
        C3256gj c3256gj = this.f32796D;
        if (c3256gj != null) {
            c3256gj.d();
        }
    }

    @Override // q2.K
    public final void A0(long j6) {
    }

    @Override // q2.K
    public final InterfaceC4915x B() {
        return null;
    }

    @Override // q2.K
    public final synchronized InterfaceC4914w0 C() {
        return null;
    }

    @Override // t2.l
    public final void H3(int i) {
        if (i == 0) {
            throw null;
        }
        int i6 = i - 1;
        if (i6 == 0) {
            U3(2);
            return;
        }
        if (i6 == 1) {
            U3(4);
        } else if (i6 != 2) {
            U3(6);
        } else {
            U3(3);
        }
    }

    @Override // t2.l
    public final void L1() {
    }

    @Override // q2.K
    public final synchronized boolean M() {
        boolean z3;
        N3.a aVar = this.f32801x.f31343j;
        if (aVar != null) {
            z3 = aVar.isDone() ? false : true;
        }
        return z3;
    }

    @Override // t2.l
    public final void M0() {
    }

    @Override // q2.K
    public final synchronized String N() {
        return this.f32800w;
    }

    @Override // q2.K
    public final void O2(String str) {
    }

    @Override // q2.K
    public final void P3(P8 p82) {
        this.f32802y.f30670u.set(p82);
    }

    @Override // t2.l
    public final synchronized void Q2() {
        C3256gj c3256gj = this.f32796D;
        if (c3256gj != null) {
            C4835j.f39730C.f39742k.getClass();
            c3256gj.e(1, SystemClock.elapsedRealtime() - this.f32794B);
        }
    }

    @Override // t2.l
    public final void R1() {
    }

    @Override // t2.l
    public final void S1() {
    }

    @Override // q2.K
    public final synchronized void U0(q2.Z0 z02) {
    }

    @Override // q2.K
    public final synchronized void U1(q2.f1 f1Var) {
        P2.w.d("setAdSize must be called on the main UI thread.");
    }

    public final synchronized void U3(int i) {
        try {
            if (this.f32799v.compareAndSet(false, true)) {
                this.f32802y.d();
                C3202fj c3202fj = this.f32795C;
                if (c3202fj != null) {
                    C4835j.f39730C.f39739g.k(c3202fj);
                }
                if (this.f32796D != null) {
                    long j6 = -1;
                    if (this.f32794B != -1) {
                        C4835j.f39730C.f39742k.getClass();
                        j6 = SystemClock.elapsedRealtime() - this.f32794B;
                    }
                    this.f32796D.e(i, j6);
                }
                A();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // q2.K
    public final synchronized q2.A0 V() {
        return null;
    }

    @Override // q2.K
    public final void Y2(q2.i1 i1Var) {
        this.f32801x.i.i = i1Var;
    }

    @Override // q2.K
    public final W2.a c() {
        return null;
    }

    @Override // q2.K
    public final synchronized void d() {
        P2.w.d("pause must be called on the main UI thread.");
    }

    @Override // q2.K
    public final synchronized boolean d3(q2.c1 c1Var) {
        boolean z3;
        try {
            if (!c1Var.b()) {
                if (((Boolean) AbstractC2684Na.f26496d.r()).booleanValue()) {
                    if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.Cc)).booleanValue()) {
                        z3 = true;
                        if (this.f32803z.f41390v >= ((Integer) q2.r.f40204e.f40207c.a(AbstractC3569ma.Dc)).intValue() || !z3) {
                            P2.w.d("loadAd must be called on the main UI thread.");
                        }
                    }
                }
                z3 = false;
                if (this.f32803z.f41390v >= ((Integer) q2.r.f40204e.f40207c.a(AbstractC3569ma.Dc)).intValue()) {
                }
                P2.w.d("loadAd must be called on the main UI thread.");
            }
            u2.D d2 = C4835j.f39730C.f39735c;
            if (u2.D.h(this.f32798u) && c1Var.f40104L == null) {
                int i = u2.z.f41319b;
                v2.i.c("Failed to load the ad because app ID is missing.");
                this.f32802y.v(SK.F(4, null, null));
                return false;
            }
            if (M()) {
                return false;
            }
            this.f32799v = new AtomicBoolean();
            return this.f32801x.a(c1Var, this.f32800w, new C3480kt(23), new C3534lt(this));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // q2.K
    public final synchronized void e() {
        P2.w.d("resume must be called on the main UI thread.");
    }

    @Override // q2.K
    public final long f0() {
        return 0L;
    }

    @Override // t2.l
    public final void f1() {
    }

    @Override // q2.K
    public final synchronized void f2(boolean z3) {
    }

    @Override // t2.l
    public final synchronized void g() {
        if (this.f32796D != null) {
            C4835j c4835j = C4835j.f39730C;
            c4835j.f39742k.getClass();
            this.f32794B = SystemClock.elapsedRealtime();
            int i = this.f32796D.f30607m;
            if (i > 0) {
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f32797n.f30878d.f();
                T2.a aVar = c4835j.f39742k;
                C3202fj c3202fj = new C3202fj(scheduledExecutorService, aVar);
                this.f32795C = c3202fj;
                RunnableC3588mt runnableC3588mt = new RunnableC3588mt(this, 0);
                synchronized (c3202fj) {
                    c3202fj.f30414y = runnableC3588mt;
                    aVar.getClass();
                    long j6 = i;
                    c3202fj.f30412w = SystemClock.elapsedRealtime() + j6;
                    c3202fj.f30411v = scheduledExecutorService.schedule(runnableC3588mt, j6, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    @Override // t2.l
    public final void h1() {
    }

    @Override // q2.K
    public final boolean i() {
        return false;
    }

    @Override // q2.K
    public final Bundle j() {
        return new Bundle();
    }

    @Override // q2.K
    public final synchronized void k() {
    }

    @Override // q2.K
    public final synchronized void l() {
    }

    @Override // q2.K
    public final synchronized String m() {
        return null;
    }

    @Override // q2.K
    public final void o0(boolean z3) {
    }

    @Override // q2.K
    public final synchronized q2.f1 q() {
        return null;
    }

    @Override // q2.K
    public final synchronized void r2(C3892sa c3892sa) {
    }

    @Override // q2.K
    public final synchronized void r3(q2.Y y7) {
    }

    @Override // t2.l
    public final void t1() {
    }

    @Override // q2.K
    public final synchronized boolean u() {
        return false;
    }

    @Override // q2.K
    public final synchronized String w() {
        return null;
    }

    @Override // t2.l
    public final void w0() {
    }

    @Override // q2.K
    public final q2.V y() {
        return null;
    }

    @Override // q2.K
    public final void K() {
    }

    @Override // q2.K
    public final void e1() {
    }

    @Override // q2.K
    public final void k2() {
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
    public final void C1(W2.a aVar) {
    }

    @Override // q2.K
    public final void E0(C2869Ye c2869Ye) {
    }

    @Override // q2.K
    public final void X0(InterfaceC4871a0 interfaceC4871a0) {
    }

    @Override // q2.K
    public final void Z2(InterfaceC4915x interfaceC4915x) {
    }

    @Override // q2.K
    public final void s0(InterfaceC4904r0 interfaceC4904r0) {
    }

    @Override // q2.K
    public final void x1(q2.V v9) {
    }

    @Override // q2.K
    public final void m2(q2.c1 c1Var, InterfaceC4868A interfaceC4868A) {
    }
}
