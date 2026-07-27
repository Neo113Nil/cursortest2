package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Pm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2730Pm implements InterfaceC2524Dk {

    /* renamed from: n, reason: collision with root package name */
    public final C4012um f26856n;

    /* renamed from: u, reason: collision with root package name */
    public final C4066vm f26857u;

    /* renamed from: v, reason: collision with root package name */
    public final Executor f26858v;

    /* renamed from: w, reason: collision with root package name */
    public final RD f26859w;

    public C2730Pm(C4012um c4012um, C4066vm c4066vm, Executor executor, RD rd) {
        this.f26856n = c4012um;
        this.f26857u = c4066vm;
        this.f26858v = executor;
        this.f26859w = rd;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2524Dk
    public final void w() {
        N3.a aVar;
        N3.a aVar2;
        C3467kg c3467kg;
        if (this.f26857u.f34731e) {
            C4012um c4012um = this.f26856n;
            C3209fq k9 = c4012um.k();
            if (k9 == null) {
                synchronized (c4012um) {
                    aVar = c4012um.f34575m;
                }
                if (aVar != null && ((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.o6)).booleanValue()) {
                    synchronized (c4012um) {
                        aVar2 = c4012um.f34575m;
                    }
                    synchronized (c4012um) {
                        c3467kg = c4012um.f34576n;
                    }
                    if (aVar2 == null || c3467kg == null) {
                        return;
                    }
                    CD cd = new CD(RB.o(new N3.a[]{aVar2, c3467kg}), false);
                    cd.a(new LD(0, cd, new C3694or(this)), this.f26859w);
                    return;
                }
            }
            if (k9 != null) {
                InterfaceC4061vh j6 = c4012um.j();
                InterfaceC4061vh h9 = c4012um.h();
                if (j6 == null) {
                    j6 = h9 == null ? null : h9;
                }
                if (j6 != null) {
                    this.f26858v.execute(new RunnableC4009uj(j6, 3));
                }
            }
        }
    }
}
