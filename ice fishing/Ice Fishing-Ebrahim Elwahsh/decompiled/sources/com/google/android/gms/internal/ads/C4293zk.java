package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import q2.C4927z0;

/* renamed from: com.google.android.gms.internal.ads.zk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4293zk extends AbstractC2982bM implements InterfaceC4185xk {

    /* renamed from: v, reason: collision with root package name */
    public final ScheduledExecutorService f35599v;

    /* renamed from: w, reason: collision with root package name */
    public ScheduledFuture f35600w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f35601x;

    public C4293zk(C4239yk c4239yk, Set set, SD sd, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.f35601x = false;
        this.f35599v = scheduledExecutorService;
        s1(c4239yk, sd);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4185xk
    public final void U(C4927z0 c4927z0) {
        u1(new C4023uk(1, c4927z0));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4185xk
    public final void V(C2762Rl c2762Rl) {
        if (this.f35601x) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f35600w;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        u1(new Vx(18, c2762Rl));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4185xk
    public final void c() {
        u1(C2943ak.f29293v);
    }

    public final void v1() {
        this.f35600w = this.f35599v.schedule(new RunnableC3376ij(5, this), ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.dc)).intValue(), TimeUnit.MILLISECONDS);
    }
}
