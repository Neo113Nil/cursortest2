package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import q2.C4920z0;

/* renamed from: com.google.android.gms.internal.ads.Ak, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2473Ak extends OK implements InterfaceC4226yk {

    /* renamed from: v, reason: collision with root package name */
    public final ScheduledExecutorService f23724v;

    /* renamed from: w, reason: collision with root package name */
    public ScheduledFuture f23725w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f23726x;

    public C2473Ak(C4280zk c4280zk, Set set, RD rd, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.f23726x = false;
        this.f23724v = scheduledExecutorService;
        H1(c4280zk, rd);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4226yk
    public final void G(C4920z0 c4920z0) {
        M1(new C4064vk(1, c4920z0));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4226yk
    public final void L(C2828Vl c2828Vl) {
        if (this.f23726x) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f23725w;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        M1(new Ux(18, c2828Vl));
    }

    public final void Q1() {
        this.f23725w = this.f23724v.schedule(new RunnableC3470kj(5, this), ((Integer) q2.r.f40204e.f40207c.a(AbstractC3569ma.dc)).intValue(), TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4226yk
    public final void d() {
        M1(C2935ak.f29111v);
    }
}
