package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.fs, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3211fs implements Ps {

    /* renamed from: a, reason: collision with root package name */
    public final C3038cg f30462a;

    /* renamed from: b, reason: collision with root package name */
    public final C2991bm f30463b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f30464c;

    /* renamed from: d, reason: collision with root package name */
    public final C3360ig f30465d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f30466e;

    public C3211fs(Context context, C3038cg c3038cg, ScheduledExecutorService scheduledExecutorService, C3360ig c3360ig) {
        if (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32118R3)).booleanValue()) {
            this.f30463b = new C2991bm(context, 5);
        }
        this.f30466e = context;
        this.f30462a = c3038cg;
        this.f30464c = scheduledExecutorService;
        this.f30465d = c3360ig;
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final N3.a c() {
        j3.m b9;
        C3301ha c3301ha = AbstractC3569ma.f32083N3;
        q2.r rVar = q2.r.f40204e;
        int i = -1;
        String str = null;
        if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
            if (!((Boolean) rVar.f40207c.a(AbstractC3569ma.f32127S3)).booleanValue()) {
                if (!((Boolean) rVar.f40207c.a(AbstractC3569ma.f32092O3)).booleanValue()) {
                    return QC.u(AbstractC2968bG.b(this.f30463b.b()), L2.f26031m, AbstractC3413jg.f31275h);
                }
                if (((Boolean) rVar.f40207c.a(AbstractC3569ma.f32118R3)).booleanValue()) {
                    AbstractC2639Kg.h(this.f30466e, false);
                    synchronized (AbstractC2639Kg.f25944G) {
                        b9 = AbstractC2639Kg.f25942E;
                    }
                } else {
                    b9 = this.f30463b.b();
                }
                if (b9 == null) {
                    return QC.c(new C3265gs(str, i, 0));
                }
                N3.a t6 = QC.t(AbstractC2968bG.b(b9), C2556Fi.f24827j, AbstractC3413jg.f31275h);
                if (((Boolean) rVar.f40207c.a(AbstractC3569ma.f32100P3)).booleanValue()) {
                    t6 = QC.s(t6, ((Long) rVar.f40207c.a(AbstractC3569ma.f32109Q3)).longValue(), TimeUnit.MILLISECONDS, this.f30464c);
                }
                return QC.q(t6, Exception.class, new C2722Pe(4, this), this.f30465d);
            }
        }
        return QC.c(new C3265gs(str, i, 0));
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final int f() {
        return 11;
    }
}
