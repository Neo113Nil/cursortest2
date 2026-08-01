package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.ct, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3051ct implements Ps {

    /* renamed from: a, reason: collision with root package name */
    public final C3038cg f29615a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f29616b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f29617c;

    /* renamed from: d, reason: collision with root package name */
    public final C3360ig f29618d;

    /* renamed from: e, reason: collision with root package name */
    public final int f29619e;

    public C3051ct(C3038cg c3038cg, boolean z3, C3360ig c3360ig, ScheduledExecutorService scheduledExecutorService, int i) {
        this.f29615a = c3038cg;
        this.f29616b = z3;
        this.f29618d = c3360ig;
        this.f29617c = scheduledExecutorService;
        this.f29619e = i;
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final N3.a c() {
        C3301ha c3301ha = AbstractC3569ma.f32148U7;
        q2.r rVar = q2.r.f40207e;
        if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue() && this.f29616b) {
            return QC.c(new Tr(null, 6));
        }
        if (!Arrays.asList(((String) rVar.f40210c.a(AbstractC3569ma.f32166W7)).split(",")).contains(String.valueOf(this.f29619e))) {
            return QC.c(new Tr(null, 6));
        }
        ND nd = ND.f26473u;
        L2 l22 = L2.f26034p;
        C3360ig c3360ig = this.f29618d;
        return QC.q(QC.s(QC.u(nd, l22, c3360ig), ((Long) AbstractC3033cb.f29499b.r()).longValue(), TimeUnit.MILLISECONDS, this.f29617c), Exception.class, new C2722Pe(6, this), c3360ig);
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final int f() {
        return 50;
    }
}
