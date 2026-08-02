package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.fs, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3234fs implements Ps {

    /* renamed from: a, reason: collision with root package name */
    public final C3061cg f31225a;

    /* renamed from: b, reason: collision with root package name */
    public final S0.l f31226b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f31227c;

    /* renamed from: d, reason: collision with root package name */
    public final C3383ig f31228d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f31229e;

    public C3234fs(Context context, C3061cg c3061cg, ScheduledExecutorService scheduledExecutorService, C3383ig c3383ig) {
        if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32897R3)).booleanValue()) {
            this.f31226b = new S0.l(context);
        }
        this.f31229e = context;
        this.f31225a = c3061cg;
        this.f31227c = scheduledExecutorService;
        this.f31228d = c3383ig;
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final P3.a c() {
        l3.m j6;
        C3324ha c3324ha = AbstractC3592ma.f32862N3;
        s2.r rVar = s2.r.f40506e;
        int i = -1;
        String str = null;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
            if (!((Boolean) rVar.f40509c.a(AbstractC3592ma.f32906S3)).booleanValue()) {
                if (!((Boolean) rVar.f40509c.a(AbstractC3592ma.f32871O3)).booleanValue()) {
                    return QC.u(AbstractC2991bG.b(this.f31226b.j()), L2.f26831m, AbstractC3436jg.f32062h);
                }
                if (((Boolean) rVar.f40509c.a(AbstractC3592ma.f32897R3)).booleanValue()) {
                    AbstractC2659Kg.h(this.f31229e, false);
                    synchronized (AbstractC2659Kg.f26722G) {
                        j6 = AbstractC2659Kg.f26720E;
                    }
                } else {
                    j6 = this.f31226b.j();
                }
                if (j6 == null) {
                    return QC.c(new C3288gs(str, i, 0));
                }
                P3.a t6 = QC.t(AbstractC2991bG.b(j6), C2576Fi.f25616j, AbstractC3436jg.f32062h);
                if (((Boolean) rVar.f40509c.a(AbstractC3592ma.f32880P3)).booleanValue()) {
                    t6 = QC.s(t6, ((Long) rVar.f40509c.a(AbstractC3592ma.f32889Q3)).longValue(), TimeUnit.MILLISECONDS, this.f31227c);
                }
                return QC.q(t6, Exception.class, new C2742Pe(4, this), this.f31228d);
            }
        }
        return QC.c(new C3288gs(str, i, 0));
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final int f() {
        return 11;
    }
}
