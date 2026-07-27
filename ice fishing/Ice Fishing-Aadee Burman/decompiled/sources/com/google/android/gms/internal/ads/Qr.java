package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class Qr implements Ps {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27117a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final long f27118b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f27119c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f27120d;

    public Qr(T2.a aVar, C3052cu c3052cu, long j6) {
        this.f27119c = aVar;
        this.f27120d = c3052cu;
        this.f27118b = j6;
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final N3.a c() {
        switch (this.f27117a) {
            case 0:
                ((T2.a) this.f27119c).getClass();
                return QC.c(new Rr((C3052cu) this.f27120d, System.currentTimeMillis(), this.f27118b));
            default:
                N3.a c9 = ((Ps) this.f27119c).c();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32196a3)).booleanValue()) {
                    timeUnit = TimeUnit.MICROSECONDS;
                }
                long j6 = this.f27118b;
                if (j6 > 0) {
                    c9 = QC.s(c9, j6, timeUnit, (ScheduledExecutorService) this.f27120d);
                }
                return QC.r(c9, Throwable.class, new C4164xc(8, this), AbstractC3413jg.f31275h);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final int f() {
        switch (this.f27117a) {
            case 0:
                return 4;
            default:
                return ((Ps) this.f27119c).f();
        }
    }

    public Qr(Ps ps, long j6, ScheduledExecutorService scheduledExecutorService) {
        this.f27119c = ps;
        this.f27118b = j6;
        this.f27120d = scheduledExecutorService;
    }
}
