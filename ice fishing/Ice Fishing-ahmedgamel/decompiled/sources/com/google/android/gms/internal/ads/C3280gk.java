package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import s2.C4969z0;

/* renamed from: com.google.android.gms.internal.ads.gk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3280gk implements InterfaceC4033uk, InterfaceC4142wl, InterfaceC3335hl, InterfaceC2510Bk, InterfaceC3950t8 {

    /* renamed from: B, reason: collision with root package name */
    public final String f31385B;

    /* renamed from: n, reason: collision with root package name */
    public final C2527Ck f31386n;

    /* renamed from: u, reason: collision with root package name */
    public final C2833Uk f31387u;

    /* renamed from: v, reason: collision with root package name */
    public final St f31388v;

    /* renamed from: w, reason: collision with root package name */
    public final ScheduledExecutorService f31389w;

    /* renamed from: x, reason: collision with root package name */
    public final RD f31390x;

    /* renamed from: z, reason: collision with root package name */
    public ScheduledFuture f31392z;

    /* renamed from: y, reason: collision with root package name */
    public final XD f31391y = new XD();

    /* renamed from: A, reason: collision with root package name */
    public final AtomicBoolean f31384A = new AtomicBoolean();

    public C3280gk(C2527Ck c2527Ck, St st, ScheduledExecutorService scheduledExecutorService, RD rd, String str, C2833Uk c2833Uk) {
        this.f31386n = c2527Ck;
        this.f31388v = st;
        this.f31389w = scheduledExecutorService;
        this.f31390x = rd;
        this.f31385B = str;
        this.f31387u = c2833Uk;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033uk
    public final void B() {
        St st = this.f31388v;
        if (st.f28397e == 3) {
            return;
        }
        int i = st.Y;
        if (i == 0 || i == 1) {
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Uc)).booleanValue() && this.f31385B.equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                return;
            }
            this.f31386n.t();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2510Bk
    public final synchronized void c(C4969z0 c4969z0) {
        try {
            XD xd = this.f31391y;
            if (xd.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f31392z;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            xd.e(new Exception());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033uk
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033uk
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3950t8
    public final void f(C3896s8 c3896s8) {
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Uc)).booleanValue() && this.f31385B.equals("com.google.ads.mediation.admob.AdMobAdapter") && c3896s8.f34667j && this.f31384A.compareAndSet(false, true) && this.f31388v.f28397e != 3) {
            w2.z.k("Full screen 1px impression occurred");
            this.f31386n.t();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4142wl
    public final void g() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4142wl
    public final void h() {
        St st = this.f31388v;
        int i = st.f28397e;
        if (i == 3) {
            return;
        }
        if (i == 4) {
            this.f31387u.t();
            return;
        }
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33004d2)).booleanValue() && st.Y == 2) {
            int i4 = st.f28419q;
            if (i4 == 0) {
                this.f31386n.t();
                return;
            }
            Ux ux = new Ux(this);
            XD xd = this.f31391y;
            xd.a(new LD(0, xd, ux), this.f31390x);
            this.f31392z = this.f31389w.schedule(new RunnableC3493kj(3, this), i4, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335hl
    public final synchronized void s() {
        if (this.f31388v.f28397e == 4) {
            this.f31386n.t();
            return;
        }
        XD xd = this.f31391y;
        if (xd.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f31392z;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        xd.d(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335hl
    public final void w() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033uk
    public final void y() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033uk
    public final void z() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033uk
    public final void t(BinderC2844Ve binderC2844Ve, String str, String str2) {
    }
}
