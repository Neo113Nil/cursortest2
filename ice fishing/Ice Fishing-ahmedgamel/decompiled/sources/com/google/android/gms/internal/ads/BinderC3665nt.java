package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import r2.C4906k;
import s2.InterfaceC4917A;
import s2.InterfaceC4920a0;
import s2.InterfaceC4953r0;
import s2.InterfaceC4958u;
import s2.InterfaceC4963w0;
import s2.InterfaceC4964x;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.nt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3665nt extends s2.J implements v2.l, I8 {

    /* renamed from: A, reason: collision with root package name */
    public final C3230fo f33580A;

    /* renamed from: C, reason: collision with root package name */
    public C3225fj f33582C;

    /* renamed from: D, reason: collision with root package name */
    public C3279gj f33583D;

    /* renamed from: n, reason: collision with root package name */
    public final C3332hi f33584n;

    /* renamed from: u, reason: collision with root package name */
    public final Context f33585u;

    /* renamed from: w, reason: collision with root package name */
    public final String f33587w;

    /* renamed from: x, reason: collision with root package name */
    public final C3449jt f33588x;

    /* renamed from: y, reason: collision with root package name */
    public final C3289gt f33589y;

    /* renamed from: z, reason: collision with root package name */
    public final C5189a f33590z;

    /* renamed from: v, reason: collision with root package name */
    public AtomicBoolean f33586v = new AtomicBoolean();

    /* renamed from: B, reason: collision with root package name */
    public long f33581B = -1;

    public BinderC3665nt(C3332hi c3332hi, Context context, String str, C3449jt c3449jt, C3289gt c3289gt, C5189a c5189a, C3230fo c3230fo) {
        this.f33584n = c3332hi;
        this.f33585u = context;
        this.f33587w = str;
        this.f33588x = c3449jt;
        this.f33589y = c3289gt;
        this.f33590z = c5189a;
        this.f33580A = c3230fo;
        c3289gt.f31443y.set(this);
    }

    @Override // s2.K
    public final synchronized void A() {
        R2.w.d("destroy must be called on the main UI thread.");
        C3279gj c3279gj = this.f33583D;
        if (c3279gj != null) {
            c3279gj.d();
        }
    }

    @Override // s2.K
    public final InterfaceC4964x B() {
        return null;
    }

    @Override // s2.K
    public final synchronized void B0(s2.Y y7) {
    }

    @Override // s2.K
    public final synchronized InterfaceC4963w0 C() {
        return null;
    }

    @Override // v2.l
    public final void C3(int i) {
        if (i == 0) {
            throw null;
        }
        int i4 = i - 1;
        if (i4 == 0) {
            U3(2);
            return;
        }
        if (i4 == 1) {
            U3(4);
        } else if (i4 != 2) {
            U3(6);
        } else {
            U3(3);
        }
    }

    @Override // s2.K
    public final synchronized boolean D3(s2.c1 c1Var) {
        boolean z6;
        try {
            if (!c1Var.b()) {
                if (((Boolean) AbstractC2704Na.f27279d.r()).booleanValue()) {
                    if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Cc)).booleanValue()) {
                        z6 = true;
                        if (this.f33590z.f41847v >= ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.Dc)).intValue() || !z6) {
                            R2.w.d("loadAd must be called on the main UI thread.");
                        }
                    }
                }
                z6 = false;
                if (this.f33590z.f41847v >= ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.Dc)).intValue()) {
                }
                R2.w.d("loadAd must be called on the main UI thread.");
            }
            w2.D d9 = C4906k.f40186C.f40191c;
            if (w2.D.h(this.f33585u) && c1Var.f40406L == null) {
                int i = w2.z.f41712b;
                x2.i.c("Failed to load the ad because app ID is missing.");
                this.f33589y.I(SK.F(4, null, null));
                return false;
            }
            if (L()) {
                return false;
            }
            this.f33586v = new AtomicBoolean();
            return this.f33588x.a(c1Var, this.f33587w, new C3503kt(23), new C3557lt(this));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // s2.K
    public final synchronized void F2(s2.f1 f1Var) {
        R2.w.d("setAdSize must be called on the main UI thread.");
    }

    @Override // s2.K
    public final void F3(s2.i1 i1Var) {
        this.f33588x.i.i = i1Var;
    }

    @Override // v2.l
    public final void G1() {
    }

    @Override // v2.l
    public final void K0() {
    }

    @Override // s2.K
    public final synchronized boolean L() {
        boolean z6;
        P3.a aVar = this.f33588x.f32122j;
        if (aVar != null) {
            z6 = aVar.isDone() ? false : true;
        }
        return z6;
    }

    @Override // s2.K
    public final void M2(String str) {
    }

    @Override // s2.K
    public final synchronized String N() {
        return this.f33587w;
    }

    @Override // v2.l
    public final synchronized void N2() {
        C3279gj c3279gj = this.f33583D;
        if (c3279gj != null) {
            C4906k.f40186C.f40198k.getClass();
            c3279gj.e(1, SystemClock.elapsedRealtime() - this.f33581B);
        }
    }

    @Override // s2.K
    public final void P3(P8 p82) {
        this.f33589y.f31439u.set(p82);
    }

    @Override // v2.l
    public final void Q1() {
    }

    @Override // v2.l
    public final void S1() {
    }

    public final synchronized void U3(int i) {
        try {
            if (this.f33586v.compareAndSet(false, true)) {
                this.f33589y.d();
                C3225fj c3225fj = this.f33582C;
                if (c3225fj != null) {
                    C4906k.f40186C.f40195g.k(c3225fj);
                }
                if (this.f33583D != null) {
                    long j6 = -1;
                    if (this.f33581B != -1) {
                        C4906k.f40186C.f40198k.getClass();
                        j6 = SystemClock.elapsedRealtime() - this.f33581B;
                    }
                    this.f33583D.e(i, j6);
                }
                A();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // s2.K
    public final synchronized s2.A0 V() {
        return null;
    }

    @Override // s2.K
    public final Y2.a c() {
        return null;
    }

    @Override // s2.K
    public final synchronized void c2(boolean z6) {
    }

    @Override // s2.K
    public final synchronized void d() {
        R2.w.d("pause must be called on the main UI thread.");
    }

    @Override // v2.l
    public final void d1() {
    }

    @Override // s2.K
    public final synchronized void e() {
        R2.w.d("resume must be called on the main UI thread.");
    }

    @Override // v2.l
    public final synchronized void g() {
        if (this.f33583D != null) {
            C4906k c4906k = C4906k.f40186C;
            c4906k.f40198k.getClass();
            this.f33581B = SystemClock.elapsedRealtime();
            int i = this.f33583D.f31374m;
            if (i > 0) {
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f33584n.f31639d.f();
                V2.a aVar = c4906k.f40198k;
                C3225fj c3225fj = new C3225fj(scheduledExecutorService, aVar);
                this.f33582C = c3225fj;
                RunnableC3611mt runnableC3611mt = new RunnableC3611mt(this, 0);
                synchronized (c3225fj) {
                    c3225fj.f31202y = runnableC3611mt;
                    aVar.getClass();
                    long j6 = i;
                    c3225fj.f31200w = SystemClock.elapsedRealtime() + j6;
                    c3225fj.f31199v = scheduledExecutorService.schedule(runnableC3611mt, j6, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    @Override // s2.K
    public final long g0() {
        return 0L;
    }

    @Override // v2.l
    public final void h1() {
    }

    @Override // s2.K
    public final boolean i() {
        return false;
    }

    @Override // s2.K
    public final Bundle j() {
        return new Bundle();
    }

    @Override // s2.K
    public final synchronized void k() {
    }

    @Override // s2.K
    public final synchronized void l() {
    }

    @Override // s2.K
    public final synchronized String m() {
        return null;
    }

    @Override // s2.K
    public final synchronized void m2(C3915sa c3915sa) {
    }

    @Override // s2.K
    public final void n0(boolean z6) {
    }

    @Override // s2.K
    public final synchronized void o2(s2.Z0 z02) {
    }

    @Override // s2.K
    public final synchronized s2.f1 q() {
        return null;
    }

    @Override // v2.l
    public final void r1() {
    }

    @Override // v2.l
    public final void t0() {
    }

    @Override // s2.K
    public final synchronized boolean u() {
        return false;
    }

    @Override // s2.K
    public final synchronized String w() {
        return null;
    }

    @Override // s2.K
    public final void w0(long j6) {
    }

    @Override // s2.K
    public final s2.V y() {
        return null;
    }

    @Override // s2.K
    public final void J() {
    }

    @Override // s2.K
    public final void c1() {
    }

    @Override // s2.K
    public final void d2() {
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
    public final void H1(InterfaceC4964x interfaceC4964x) {
    }

    @Override // s2.K
    public final void M3(InterfaceC4953r0 interfaceC4953r0) {
    }

    @Override // s2.K
    public final void o0(s2.V v9) {
    }

    @Override // s2.K
    public final void p3(InterfaceC4958u interfaceC4958u) {
    }

    @Override // s2.K
    public final void x0(Y2.a aVar) {
    }

    @Override // s2.K
    public final void I3(s2.c1 c1Var, InterfaceC4917A interfaceC4917A) {
    }
}
