package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class Qr implements Ps {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27873a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final long f27874b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f27875c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f27876d;

    public Qr(V2.a aVar, C3075cu c3075cu, long j6) {
        this.f27875c = aVar;
        this.f27876d = c3075cu;
        this.f27874b = j6;
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final P3.a c() {
        switch (this.f27873a) {
            case 0:
                ((V2.a) this.f27875c).getClass();
                return QC.c(new Rr((C3075cu) this.f27876d, System.currentTimeMillis(), this.f27874b));
            default:
                P3.a c9 = ((Ps) this.f27875c).c();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32975a3)).booleanValue()) {
                    timeUnit = TimeUnit.MICROSECONDS;
                }
                long j6 = this.f27874b;
                if (j6 > 0) {
                    c9 = QC.s(c9, j6, timeUnit, (ScheduledExecutorService) this.f27876d);
                }
                return QC.r(c9, Throwable.class, new C4187xc(8, this), AbstractC3436jg.f32062h);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final int f() {
        switch (this.f27873a) {
            case 0:
                return 4;
            default:
                return ((Ps) this.f27875c).f();
        }
    }

    public Qr(Ps ps, long j6, ScheduledExecutorService scheduledExecutorService) {
        this.f27875c = ps;
        this.f27874b = j6;
        this.f27876d = scheduledExecutorService;
    }
}
