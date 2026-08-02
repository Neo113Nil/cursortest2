package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.ct, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3074ct implements Ps {

    /* renamed from: a, reason: collision with root package name */
    public final C3061cg f30385a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f30386b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f30387c;

    /* renamed from: d, reason: collision with root package name */
    public final C3383ig f30388d;

    /* renamed from: e, reason: collision with root package name */
    public final int f30389e;

    public C3074ct(C3061cg c3061cg, boolean z6, C3383ig c3383ig, ScheduledExecutorService scheduledExecutorService, int i) {
        this.f30385a = c3061cg;
        this.f30386b = z6;
        this.f30388d = c3383ig;
        this.f30387c = scheduledExecutorService;
        this.f30389e = i;
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final P3.a c() {
        C3324ha c3324ha = AbstractC3592ma.f32928U7;
        s2.r rVar = s2.r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue() && this.f30386b) {
            return QC.c(new Tr(null, 6));
        }
        if (!Arrays.asList(((String) rVar.f40509c.a(AbstractC3592ma.f32945W7)).split(",")).contains(String.valueOf(this.f30389e))) {
            return QC.c(new Tr(null, 6));
        }
        ND nd = ND.f27257u;
        L2 l22 = L2.f26834p;
        C3383ig c3383ig = this.f30388d;
        return QC.q(QC.s(QC.u(nd, l22, c3383ig), ((Long) AbstractC3056cb.f30284b.r()).longValue(), TimeUnit.MILLISECONDS, this.f30387c), Exception.class, new C2742Pe(6, this), c3383ig);
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final int f() {
        return 50;
    }
}
