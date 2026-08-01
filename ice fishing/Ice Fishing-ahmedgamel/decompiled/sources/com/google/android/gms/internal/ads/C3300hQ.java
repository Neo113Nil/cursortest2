package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3300hQ implements InterfaceC3622nQ, InterfaceC3568mQ {

    /* renamed from: n, reason: collision with root package name */
    public final C3676oQ f30805n;

    /* renamed from: u, reason: collision with root package name */
    public final long f30806u;

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC4026v f30807v;

    /* renamed from: w, reason: collision with root package name */
    public XP f30808w;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC3622nQ f30809x;

    /* renamed from: y, reason: collision with root package name */
    public InterfaceC3568mQ f30810y;

    /* renamed from: z, reason: collision with root package name */
    public long f30811z = com.anythink.basead.exoplayer.b.f6382b;

    public C3300hQ(C3676oQ c3676oQ, InterfaceC4026v interfaceC4026v, long j6) {
        this.f30805n = c3676oQ;
        this.f30807v = interfaceC4026v;
        this.f30806u = j6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3622nQ
    public final void X(long j6) {
        InterfaceC3622nQ interfaceC3622nQ = this.f30809x;
        String str = AbstractC3159eu.f29993a;
        interfaceC3622nQ.X(j6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3622nQ
    public final long a(long j6) {
        InterfaceC3622nQ interfaceC3622nQ = this.f30809x;
        String str = AbstractC3159eu.f29993a;
        return interfaceC3622nQ.a(j6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3622nQ
    public final void b(InterfaceC3568mQ interfaceC3568mQ, long j6) {
        this.f30810y = interfaceC3568mQ;
        InterfaceC3622nQ interfaceC3622nQ = this.f30809x;
        if (interfaceC3622nQ != null) {
            long j9 = this.f30811z;
            if (j9 == com.anythink.basead.exoplayer.b.f6382b) {
                j9 = this.f30806u;
            }
            interfaceC3622nQ.b(this, j9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3622nQ
    public final long c(long j6, C3997uO c3997uO) {
        InterfaceC3622nQ interfaceC3622nQ = this.f30809x;
        String str = AbstractC3159eu.f29993a;
        return interfaceC3622nQ.c(j6, c3997uO);
    }

    @Override // com.google.android.gms.internal.ads.JQ
    public final boolean d() {
        InterfaceC3622nQ interfaceC3622nQ = this.f30809x;
        return interfaceC3622nQ != null && interfaceC3622nQ.d();
    }

    @Override // com.google.android.gms.internal.ads.JQ
    public final boolean e(C2922aO c2922aO) {
        InterfaceC3622nQ interfaceC3622nQ = this.f30809x;
        return interfaceC3622nQ != null && interfaceC3622nQ.e(c2922aO);
    }

    @Override // com.google.android.gms.internal.ads.JQ
    public final long f() {
        InterfaceC3622nQ interfaceC3622nQ = this.f30809x;
        String str = AbstractC3159eu.f29993a;
        return interfaceC3622nQ.f();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3568mQ
    public final void g(InterfaceC3622nQ interfaceC3622nQ) {
        InterfaceC3568mQ interfaceC3568mQ = this.f30810y;
        String str = AbstractC3159eu.f29993a;
        interfaceC3568mQ.g(this);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3622nQ
    public final long h(InterfaceC3757q[] interfaceC3757qArr, boolean[] zArr, IQ[] iqArr, boolean[] zArr2, long j6) {
        long j9 = this.f30811z;
        long j10 = (j9 == com.anythink.basead.exoplayer.b.f6382b || j6 != this.f30806u) ? j6 : j9;
        this.f30811z = com.anythink.basead.exoplayer.b.f6382b;
        InterfaceC3622nQ interfaceC3622nQ = this.f30809x;
        String str = AbstractC3159eu.f29993a;
        return interfaceC3622nQ.h(interfaceC3757qArr, zArr, iqArr, zArr2, j10);
    }

    @Override // com.google.android.gms.internal.ads.JQ
    public final long i() {
        InterfaceC3622nQ interfaceC3622nQ = this.f30809x;
        String str = AbstractC3159eu.f29993a;
        return interfaceC3622nQ.i();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3568mQ
    public final /* bridge */ /* synthetic */ void j(JQ jq) {
        InterfaceC3568mQ interfaceC3568mQ = this.f30810y;
        String str = AbstractC3159eu.f29993a;
        interfaceC3568mQ.j(this);
    }

    @Override // com.google.android.gms.internal.ads.JQ
    public final void k(long j6) {
        InterfaceC3622nQ interfaceC3622nQ = this.f30809x;
        String str = AbstractC3159eu.f29993a;
        interfaceC3622nQ.k(j6);
    }

    public final void l(C3676oQ c3676oQ) {
        long j6 = this.f30811z;
        if (j6 == com.anythink.basead.exoplayer.b.f6382b) {
            j6 = this.f30806u;
        }
        XP xp = this.f30808w;
        xp.getClass();
        InterfaceC3622nQ c9 = xp.c(c3676oQ, this.f30807v, j6);
        this.f30809x = c9;
        if (this.f30810y != null) {
            c9.b(this, j6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3622nQ
    public final PQ p() {
        InterfaceC3622nQ interfaceC3622nQ = this.f30809x;
        String str = AbstractC3159eu.f29993a;
        return interfaceC3622nQ.p();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3622nQ
    public final void q() {
        InterfaceC3622nQ interfaceC3622nQ = this.f30809x;
        if (interfaceC3622nQ != null) {
            interfaceC3622nQ.q();
            return;
        }
        XP xp = this.f30808w;
        if (xp != null) {
            xp.r();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3622nQ
    public final long w() {
        InterfaceC3622nQ interfaceC3622nQ = this.f30809x;
        String str = AbstractC3159eu.f29993a;
        return interfaceC3622nQ.w();
    }
}
