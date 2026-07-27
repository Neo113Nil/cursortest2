package com.google.android.gms.internal.ads;

import android.os.Looper;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class RQ extends AbstractC3473kQ {
    public final ZG i;

    /* renamed from: j, reason: collision with root package name */
    public final Mu f27363j;

    /* renamed from: k, reason: collision with root package name */
    public final T2 f27364k;

    /* renamed from: l, reason: collision with root package name */
    public final int f27365l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f27366m;

    /* renamed from: n, reason: collision with root package name */
    public long f27367n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f27368o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f27369p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f27370q;

    /* renamed from: r, reason: collision with root package name */
    public A f27371r;

    /* renamed from: s, reason: collision with root package name */
    public C3235g2 f27372s;

    public /* synthetic */ RQ(C3235g2 c3235g2, ZG zg, Mu mu, T2 t22, int i) {
        T2 t23 = T2.f27682D;
        this.f27372s = c3235g2;
        this.i = zg;
        this.f27363j = mu;
        this.f27364k = t23;
        this.f27365l = i;
        this.f27366m = true;
        this.f27367n = com.anythink.basead.exoplayer.b.f6539b;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3473kQ
    public final synchronized void a(C3235g2 c3235g2) {
        this.f27372s = c3235g2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3473kQ
    public final void b(AQ aq) {
        PQ pq = (PQ) aq;
        if (pq.f26943O) {
            for (UQ uq : pq.f26940L) {
                uq.o();
                if (uq.f28016g != null) {
                    uq.f28016g = null;
                    uq.f28015f = null;
                }
            }
        }
        C4017ue c4017ue = pq.f26932C;
        D d2 = (D) c4017ue.f34631v;
        if (d2 != null) {
            d2.a(true);
        }
        E e6 = new E(pq, 0);
        I i = (I) c4017ue.f34630u;
        i.execute(e6);
        ((ExecutorService) i.f25497u).shutdown();
        pq.f26937H.removeCallbacksAndMessages(null);
        pq.f26938I = null;
        pq.f26961t0 = true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3473kQ
    public final AQ c(BQ bq, InterfaceC3985u interfaceC3985u, long j9) {
        InterfaceC3572mH mo9a = this.i.mo9a();
        A a9 = this.f27371r;
        if (a9 != null) {
            mo9a.a(a9);
        }
        N0 n02 = f().f30939b;
        n02.getClass();
        this.f32305g.getClass();
        C4017ue c4017ue = new C4017ue(27, (R0) this.f27363j.f26395u);
        NP np = new NP(this.f32302d.f26544b, bq);
        NP np2 = new NP(this.f32301c.f26544b, bq);
        long u7 = AbstractC3548lu.u(com.anythink.basead.exoplayer.b.f6539b);
        return new PQ(n02.f26409a, mo9a, c4017ue, this.f27364k, np, np2, this, interfaceC3985u, this.f27365l, u7);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3473kQ
    public final synchronized C3235g2 f() {
        return this.f27372s;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3473kQ
    public final void h(A a9) {
        this.f27371r = a9;
        Looper.myLooper().getClass();
        this.f32305g.getClass();
        t();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3473kQ
    public final void j() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3473kQ
    public final void r() {
    }

    public final void s(long j9, InterfaceC3015c1 interfaceC3015c1, boolean z8) {
        if (this.f27370q && interfaceC3015c1.h()) {
            return;
        }
        this.f27370q = !interfaceC3015c1.h();
        if (j9 == com.anythink.basead.exoplayer.b.f6539b) {
            j9 = this.f27367n;
        }
        boolean d2 = interfaceC3015c1.d();
        if (!this.f27366m && this.f27367n == j9 && this.f27368o == d2 && this.f27369p == z8) {
            return;
        }
        this.f27367n = j9;
        this.f27368o = d2;
        this.f27369p = z8;
        this.f27366m = false;
        t();
    }

    public final void t() {
        long j9 = this.f27367n;
        boolean z8 = this.f27368o;
        boolean z9 = this.f27369p;
        C3235g2 f6 = f();
        AbstractC3832r8 yq = new YQ(j9, j9, z8, f6, z9 ? f6.f30940c : null);
        if (this.f27366m) {
            yq = new QQ(yq);
        }
        k(yq);
    }
}
