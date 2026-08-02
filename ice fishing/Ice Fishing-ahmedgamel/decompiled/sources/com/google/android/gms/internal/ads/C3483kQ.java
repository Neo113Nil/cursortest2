package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.kQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3483kQ implements InterfaceC3807qQ, InterfaceC3753pQ {

    /* renamed from: n, reason: collision with root package name */
    public final C3860rQ f32228n;

    /* renamed from: u, reason: collision with root package name */
    public final long f32229u;

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC4049v f32230v;

    /* renamed from: w, reason: collision with root package name */
    public AbstractC2947aQ f32231w;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC3807qQ f32232x;

    /* renamed from: y, reason: collision with root package name */
    public InterfaceC3753pQ f32233y;

    /* renamed from: z, reason: collision with root package name */
    public long f32234z = com.anythink.basead.exoplayer.b.f7168b;

    public C3483kQ(C3860rQ c3860rQ, InterfaceC4049v interfaceC4049v, long j6) {
        this.f32228n = c3860rQ;
        this.f32230v = interfaceC4049v;
        this.f32229u = j6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3807qQ
    public final void X(long j6) {
        InterfaceC3807qQ interfaceC3807qQ = this.f32232x;
        String str = AbstractC3182eu.f30782a;
        interfaceC3807qQ.X(j6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3807qQ
    public final long a(long j6) {
        InterfaceC3807qQ interfaceC3807qQ = this.f32232x;
        String str = AbstractC3182eu.f30782a;
        return interfaceC3807qQ.a(j6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3807qQ
    public final void b(InterfaceC3753pQ interfaceC3753pQ, long j6) {
        this.f32233y = interfaceC3753pQ;
        InterfaceC3807qQ interfaceC3807qQ = this.f32232x;
        if (interfaceC3807qQ != null) {
            long j9 = this.f32234z;
            if (j9 == com.anythink.basead.exoplayer.b.f7168b) {
                j9 = this.f32229u;
            }
            interfaceC3807qQ.b(this, j9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3807qQ
    public final long c(long j6, C4020uO c4020uO) {
        InterfaceC3807qQ interfaceC3807qQ = this.f32232x;
        String str = AbstractC3182eu.f30782a;
        return interfaceC3807qQ.c(j6, c4020uO);
    }

    @Override // com.google.android.gms.internal.ads.MQ
    public final boolean d() {
        InterfaceC3807qQ interfaceC3807qQ = this.f32232x;
        return interfaceC3807qQ != null && interfaceC3807qQ.d();
    }

    @Override // com.google.android.gms.internal.ads.MQ
    public final boolean e(C2945aO c2945aO) {
        InterfaceC3807qQ interfaceC3807qQ = this.f32232x;
        return interfaceC3807qQ != null && interfaceC3807qQ.e(c2945aO);
    }

    @Override // com.google.android.gms.internal.ads.MQ
    public final long f() {
        InterfaceC3807qQ interfaceC3807qQ = this.f32232x;
        String str = AbstractC3182eu.f30782a;
        return interfaceC3807qQ.f();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3753pQ
    public final void g(InterfaceC3807qQ interfaceC3807qQ) {
        InterfaceC3753pQ interfaceC3753pQ = this.f32233y;
        String str = AbstractC3182eu.f30782a;
        interfaceC3753pQ.g(this);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3807qQ
    public final long h(InterfaceC3780q[] interfaceC3780qArr, boolean[] zArr, LQ[] lqArr, boolean[] zArr2, long j6) {
        long j9 = this.f32234z;
        long j10 = (j9 == com.anythink.basead.exoplayer.b.f7168b || j6 != this.f32229u) ? j6 : j9;
        this.f32234z = com.anythink.basead.exoplayer.b.f7168b;
        InterfaceC3807qQ interfaceC3807qQ = this.f32232x;
        String str = AbstractC3182eu.f30782a;
        return interfaceC3807qQ.h(interfaceC3780qArr, zArr, lqArr, zArr2, j10);
    }

    @Override // com.google.android.gms.internal.ads.MQ
    public final long i() {
        InterfaceC3807qQ interfaceC3807qQ = this.f32232x;
        String str = AbstractC3182eu.f30782a;
        return interfaceC3807qQ.i();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3753pQ
    public final /* bridge */ /* synthetic */ void j(MQ mq) {
        InterfaceC3753pQ interfaceC3753pQ = this.f32233y;
        String str = AbstractC3182eu.f30782a;
        interfaceC3753pQ.j(this);
    }

    @Override // com.google.android.gms.internal.ads.MQ
    public final void k(long j6) {
        InterfaceC3807qQ interfaceC3807qQ = this.f32232x;
        String str = AbstractC3182eu.f30782a;
        interfaceC3807qQ.k(j6);
    }

    public final void l(C3860rQ c3860rQ) {
        long j6 = this.f32234z;
        if (j6 == com.anythink.basead.exoplayer.b.f7168b) {
            j6 = this.f32229u;
        }
        AbstractC2947aQ abstractC2947aQ = this.f32231w;
        abstractC2947aQ.getClass();
        InterfaceC3807qQ c9 = abstractC2947aQ.c(c3860rQ, this.f32230v, j6);
        this.f32232x = c9;
        if (this.f32233y != null) {
            c9.b(this, j6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3807qQ
    public final SQ p() {
        InterfaceC3807qQ interfaceC3807qQ = this.f32232x;
        String str = AbstractC3182eu.f30782a;
        return interfaceC3807qQ.p();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3807qQ
    public final void q() {
        InterfaceC3807qQ interfaceC3807qQ = this.f32232x;
        if (interfaceC3807qQ != null) {
            interfaceC3807qQ.q();
            return;
        }
        AbstractC2947aQ abstractC2947aQ = this.f32231w;
        if (abstractC2947aQ != null) {
            abstractC2947aQ.r();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3807qQ
    public final long w() {
        InterfaceC3807qQ interfaceC3807qQ = this.f32232x;
        String str = AbstractC3182eu.f30782a;
        return interfaceC3807qQ.w();
    }
}
