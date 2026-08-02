package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Qm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2767Qm implements InterfaceC2544Dk {

    /* renamed from: n, reason: collision with root package name */
    public final C4089vm f27849n;

    /* renamed from: u, reason: collision with root package name */
    public final C4143wm f27850u;

    /* renamed from: v, reason: collision with root package name */
    public final Executor f27851v;

    /* renamed from: w, reason: collision with root package name */
    public final RD f27852w;

    public C2767Qm(C4089vm c4089vm, C4143wm c4143wm, Executor executor, RD rd) {
        this.f27849n = c4089vm;
        this.f27850u = c4143wm;
        this.f27851v = executor;
        this.f27852w = rd;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2544Dk
    public final void v() {
        P3.a aVar;
        P3.a aVar2;
        C3490kg c3490kg;
        if (this.f27850u.f35650e) {
            C4089vm c4089vm = this.f27849n;
            C3232fq k9 = c4089vm.k();
            if (k9 == null) {
                synchronized (c4089vm) {
                    aVar = c4089vm.f35496m;
                }
                if (aVar != null && ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.o6)).booleanValue()) {
                    synchronized (c4089vm) {
                        aVar2 = c4089vm.f35496m;
                    }
                    synchronized (c4089vm) {
                        c3490kg = c4089vm.f35497n;
                    }
                    if (aVar2 == null || c3490kg == null) {
                        return;
                    }
                    CD cd = new CD(RB.o(new P3.a[]{aVar2, c3490kg}), false);
                    cd.a(new LD(0, cd, new C3717or(this)), this.f27852w);
                    return;
                }
            }
            if (k9 != null) {
                InterfaceC4084vh j6 = c4089vm.j();
                InterfaceC4084vh h3 = c4089vm.h();
                if (j6 == null) {
                    j6 = h3 == null ? null : h3;
                }
                if (j6 != null) {
                    this.f27851v.execute(new RunnableC4032uj(j6, 3));
                }
            }
        }
    }
}
