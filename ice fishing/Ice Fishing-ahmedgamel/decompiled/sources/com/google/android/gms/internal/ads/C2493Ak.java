package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import s2.C4969z0;

/* renamed from: com.google.android.gms.internal.ads.Ak, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2493Ak extends OK implements InterfaceC4249yk {

    /* renamed from: v, reason: collision with root package name */
    public final ScheduledExecutorService f24506v;

    /* renamed from: w, reason: collision with root package name */
    public ScheduledFuture f24507w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f24508x;

    public C2493Ak(C4303zk c4303zk, Set set, RD rd, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.f24508x = false;
        this.f24506v = scheduledExecutorService;
        I1(c4303zk, rd);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4249yk
    public final void K(C2867Wl c2867Wl) {
        if (this.f24508x) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f24507w;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        M1(new Ux(18, c2867Wl));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4249yk
    public final void M(C4969z0 c4969z0) {
        M1(new C4087vk(1, c4969z0));
    }

    public final void R1() {
        this.f24507w = this.f24506v.schedule(new RunnableC3493kj(5, this), ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.dc)).intValue(), TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4249yk
    public final void d() {
        M1(C2958ak.f29886v);
    }
}
