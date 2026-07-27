package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class NQ implements InterfaceC3622nQ, InterfaceC3568mQ {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC3622nQ f26490n;

    /* renamed from: u, reason: collision with root package name */
    public final long f26491u;

    /* renamed from: v, reason: collision with root package name */
    public Object f26492v;

    public NQ(InterfaceC3622nQ interfaceC3622nQ, long j6) {
        this.f26490n = interfaceC3622nQ;
        this.f26491u = j6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3622nQ
    public final void X(long j6) {
        this.f26490n.X(j6 - this.f26491u);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3622nQ
    public final long a(long j6) {
        InterfaceC3622nQ interfaceC3622nQ = this.f26490n;
        long j9 = this.f26491u;
        return interfaceC3622nQ.a(j6 - j9) + j9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3622nQ
    public final void b(InterfaceC3568mQ interfaceC3568mQ, long j6) {
        this.f26492v = interfaceC3568mQ;
        this.f26490n.b(this, j6 - this.f26491u);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3622nQ
    public final long c(long j6, C3997uO c3997uO) {
        InterfaceC3622nQ interfaceC3622nQ = this.f26490n;
        long j9 = this.f26491u;
        return interfaceC3622nQ.c(j6 - j9, c3997uO) + j9;
    }

    @Override // com.google.android.gms.internal.ads.JQ
    public final boolean d() {
        return this.f26490n.d();
    }

    @Override // com.google.android.gms.internal.ads.JQ
    public final boolean e(C2922aO c2922aO) {
        ZN zn = new ZN();
        zn.f28882b = c2922aO.f29053b;
        zn.f28883c = c2922aO.f29054c;
        zn.f28881a = c2922aO.f29052a - this.f26491u;
        return this.f26490n.e(new C2922aO(zn));
    }

    @Override // com.google.android.gms.internal.ads.JQ
    public final long f() {
        long f3 = this.f26490n.f();
        if (f3 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return f3 + this.f26491u;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.mQ, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3568mQ
    public final void g(InterfaceC3622nQ interfaceC3622nQ) {
        ?? r12 = this.f26492v;
        r12.getClass();
        r12.g(this);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3622nQ
    public final long h(InterfaceC3757q[] interfaceC3757qArr, boolean[] zArr, IQ[] iqArr, boolean[] zArr2, long j6) {
        IQ[] iqArr2 = new IQ[iqArr.length];
        int i = 0;
        while (true) {
            IQ iq = null;
            if (i >= iqArr.length) {
                break;
            }
            MQ mq = (MQ) iqArr[i];
            if (mq != null) {
                iq = mq.f26296a;
            }
            iqArr2[i] = iq;
            i++;
        }
        long j9 = this.f26491u;
        long h9 = this.f26490n.h(interfaceC3757qArr, zArr, iqArr2, zArr2, j6 - j9);
        for (int i6 = 0; i6 < iqArr.length; i6++) {
            IQ iq2 = iqArr2[i6];
            if (iq2 == null) {
                iqArr[i6] = null;
            } else {
                IQ iq3 = iqArr[i6];
                if (iq3 == null || ((MQ) iq3).f26296a != iq2) {
                    iqArr[i6] = new MQ(iq2, j9);
                }
            }
        }
        return h9 + j9;
    }

    @Override // com.google.android.gms.internal.ads.JQ
    public final long i() {
        long i = this.f26490n.i();
        if (i == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return i + this.f26491u;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.mQ, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3568mQ
    public final /* bridge */ /* synthetic */ void j(JQ jq) {
        ?? r12 = this.f26492v;
        r12.getClass();
        r12.j(this);
    }

    @Override // com.google.android.gms.internal.ads.JQ
    public final void k(long j6) {
        this.f26490n.k(j6 - this.f26491u);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3622nQ
    public final PQ p() {
        return this.f26490n.p();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3622nQ
    public final void q() {
        this.f26490n.q();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3622nQ
    public final long w() {
        long w6 = this.f26490n.w();
        return w6 == com.anythink.basead.exoplayer.b.f6382b ? com.anythink.basead.exoplayer.b.f6382b : w6 + this.f26491u;
    }
}
