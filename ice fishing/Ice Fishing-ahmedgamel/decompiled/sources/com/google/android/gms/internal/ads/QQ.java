package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class QQ implements InterfaceC3807qQ, InterfaceC3753pQ {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC3807qQ f27814n;

    /* renamed from: u, reason: collision with root package name */
    public final long f27815u;

    /* renamed from: v, reason: collision with root package name */
    public Object f27816v;

    public QQ(InterfaceC3807qQ interfaceC3807qQ, long j6) {
        this.f27814n = interfaceC3807qQ;
        this.f27815u = j6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3807qQ
    public final void X(long j6) {
        this.f27814n.X(j6 - this.f27815u);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3807qQ
    public final long a(long j6) {
        InterfaceC3807qQ interfaceC3807qQ = this.f27814n;
        long j9 = this.f27815u;
        return interfaceC3807qQ.a(j6 - j9) + j9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3807qQ
    public final void b(InterfaceC3753pQ interfaceC3753pQ, long j6) {
        this.f27816v = interfaceC3753pQ;
        this.f27814n.b(this, j6 - this.f27815u);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3807qQ
    public final long c(long j6, C4020uO c4020uO) {
        InterfaceC3807qQ interfaceC3807qQ = this.f27814n;
        long j9 = this.f27815u;
        return interfaceC3807qQ.c(j6 - j9, c4020uO) + j9;
    }

    @Override // com.google.android.gms.internal.ads.MQ
    public final boolean d() {
        return this.f27814n.d();
    }

    @Override // com.google.android.gms.internal.ads.MQ
    public final boolean e(C2945aO c2945aO) {
        ZN zn = new ZN();
        zn.f29662b = c2945aO.f29823b;
        zn.f29663c = c2945aO.f29824c;
        zn.f29661a = c2945aO.f29822a - this.f27815u;
        return this.f27814n.e(new C2945aO(zn));
    }

    @Override // com.google.android.gms.internal.ads.MQ
    public final long f() {
        long f2 = this.f27814n.f();
        if (f2 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return f2 + this.f27815u;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.pQ, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3753pQ
    public final void g(InterfaceC3807qQ interfaceC3807qQ) {
        ?? r1 = this.f27816v;
        r1.getClass();
        r1.g(this);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3807qQ
    public final long h(InterfaceC3780q[] interfaceC3780qArr, boolean[] zArr, LQ[] lqArr, boolean[] zArr2, long j6) {
        LQ[] lqArr2 = new LQ[lqArr.length];
        int i = 0;
        while (true) {
            LQ lq = null;
            if (i >= lqArr.length) {
                break;
            }
            PQ pq = (PQ) lqArr[i];
            if (pq != null) {
                lq = pq.f27608a;
            }
            lqArr2[i] = lq;
            i++;
        }
        long j9 = this.f27815u;
        long h3 = this.f27814n.h(interfaceC3780qArr, zArr, lqArr2, zArr2, j6 - j9);
        for (int i4 = 0; i4 < lqArr.length; i4++) {
            LQ lq2 = lqArr2[i4];
            if (lq2 == null) {
                lqArr[i4] = null;
            } else {
                LQ lq3 = lqArr[i4];
                if (lq3 == null || ((PQ) lq3).f27608a != lq2) {
                    lqArr[i4] = new PQ(lq2, j9);
                }
            }
        }
        return h3 + j9;
    }

    @Override // com.google.android.gms.internal.ads.MQ
    public final long i() {
        long i = this.f27814n.i();
        if (i == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return i + this.f27815u;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.pQ, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3753pQ
    public final /* bridge */ /* synthetic */ void j(MQ mq) {
        ?? r1 = this.f27816v;
        r1.getClass();
        r1.j(this);
    }

    @Override // com.google.android.gms.internal.ads.MQ
    public final void k(long j6) {
        this.f27814n.k(j6 - this.f27815u);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3807qQ
    public final SQ p() {
        return this.f27814n.p();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3807qQ
    public final void q() {
        this.f27814n.q();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3807qQ
    public final long w() {
        long w3 = this.f27814n.w();
        return w3 == com.anythink.basead.exoplayer.b.f7168b ? com.anythink.basead.exoplayer.b.f7168b : w3 + this.f27815u;
    }
}
