package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import q2.C4920z0;

/* renamed from: com.google.android.gms.internal.ads.gk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3257gk implements InterfaceC4010uk, InterfaceC4065vl, InterfaceC3312hl, InterfaceC2490Bk, InterfaceC3927t8 {

    /* renamed from: B, reason: collision with root package name */
    public final String f30618B;

    /* renamed from: n, reason: collision with root package name */
    public final C2507Ck f30619n;

    /* renamed from: u, reason: collision with root package name */
    public final C2811Uk f30620u;

    /* renamed from: v, reason: collision with root package name */
    public final St f30621v;

    /* renamed from: w, reason: collision with root package name */
    public final ScheduledExecutorService f30622w;

    /* renamed from: x, reason: collision with root package name */
    public final RD f30623x;

    /* renamed from: z, reason: collision with root package name */
    public ScheduledFuture f30625z;

    /* renamed from: y, reason: collision with root package name */
    public final XD f30624y = new XD();

    /* renamed from: A, reason: collision with root package name */
    public final AtomicBoolean f30617A = new AtomicBoolean();

    public C3257gk(C2507Ck c2507Ck, St st, ScheduledExecutorService scheduledExecutorService, RD rd, String str, C2811Uk c2811Uk) {
        this.f30619n = c2507Ck;
        this.f30621v = st;
        this.f30622w = scheduledExecutorService;
        this.f30623x = rd;
        this.f30618B = str;
        this.f30620u = c2811Uk;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void A() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void D() {
        St st = this.f30621v;
        if (st.f27614e == 3) {
            return;
        }
        int i = st.Y;
        if (i == 0 || i == 1) {
            if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.Uc)).booleanValue() && this.f30618B.equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                return;
            }
            this.f30619n.t();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2490Bk
    public final synchronized void b(C4920z0 c4920z0) {
        try {
            XD xd = this.f30624y;
            if (xd.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f30625z;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            xd.e(new Exception());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3927t8
    public final void f(C3873s8 c3873s8) {
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.Uc)).booleanValue() && this.f30618B.equals("com.google.ads.mediation.admob.AdMobAdapter") && c3873s8.f33899j && this.f30617A.compareAndSet(false, true) && this.f30621v.f27614e != 3) {
            u2.z.k("Full screen 1px impression occurred");
            this.f30619n.t();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4065vl
    public final void g() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4065vl
    public final void h() {
        St st = this.f30621v;
        int i = st.f27614e;
        if (i == 3) {
            return;
        }
        if (i == 4) {
            this.f30620u.t();
            return;
        }
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.d2)).booleanValue() && st.Y == 2) {
            int i6 = st.f27636q;
            if (i6 == 0) {
                this.f30619n.t();
                return;
            }
            Ux ux = new Ux(this);
            XD xd = this.f30624y;
            xd.a(new LD(0, xd, ux), this.f30623x);
            this.f30625z = this.f30622w.schedule(new RunnableC3470kj(3, this), i6, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3312hl
    public final synchronized void s() {
        if (this.f30621v.f27614e == 4) {
            this.f30619n.t();
            return;
        }
        XD xd = this.f30624y;
        if (xd.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f30625z;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        xd.d(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3312hl
    public final void v() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void z() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void t(BinderC2821Ve binderC2821Ve, String str, String str2) {
    }
}
