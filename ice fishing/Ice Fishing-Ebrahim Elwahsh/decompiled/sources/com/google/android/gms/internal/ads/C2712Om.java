package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Om, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2712Om implements InterfaceC2506Ck {

    /* renamed from: n, reason: collision with root package name */
    public final C3917sm f26757n;

    /* renamed from: u, reason: collision with root package name */
    public final C3971tm f26758u;

    /* renamed from: v, reason: collision with root package name */
    public final Executor f26759v;

    /* renamed from: w, reason: collision with root package name */
    public final SD f26760w;

    public C2712Om(C3917sm c3917sm, C3971tm c3971tm, Executor executor, SD sd) {
        this.f26757n = c3917sm;
        this.f26758u = c3971tm;
        this.f26759v = executor;
        this.f26760w = sd;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2506Ck
    public final void y() {
        J3.a aVar;
        J3.a aVar2;
        C3320hg c3320hg;
        int i = 0;
        if (this.f26758u.f34456e) {
            C3917sm c3917sm = this.f26757n;
            C3330hq k6 = c3917sm.k();
            if (k6 == null) {
                synchronized (c3917sm) {
                    aVar = c3917sm.f34286m;
                }
                if (aVar != null && ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31749o6)).booleanValue()) {
                    synchronized (c3917sm) {
                        aVar2 = c3917sm.f34286m;
                    }
                    synchronized (c3917sm) {
                        c3320hg = c3917sm.f34287n;
                    }
                    if (aVar2 == null || c3320hg == null) {
                        return;
                    }
                    DD dd = new DD(UB.o(new J3.a[]{aVar2, c3320hg}), false);
                    dd.c(new MD(i, dd, new C3761pr(this)), this.f26760w);
                    return;
                }
            }
            if (k6 != null) {
                InterfaceC3858rh j9 = c3917sm.j();
                InterfaceC3858rh h9 = c3917sm.h();
                if (j9 == null) {
                    j9 = h9 == null ? null : h9;
                }
                if (j9 != null) {
                    this.f26759v.execute(new RunnableC3968tj(j9, 3));
                }
            }
        }
    }
}
