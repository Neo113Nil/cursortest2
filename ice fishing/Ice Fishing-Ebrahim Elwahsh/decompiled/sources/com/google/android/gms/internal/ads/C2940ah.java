package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ah, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2940ah implements InterfaceC3525lO {

    /* renamed from: a, reason: collision with root package name */
    public final C4201y f29255a = new C4201y();

    /* renamed from: b, reason: collision with root package name */
    public long f29256b = 15000000;

    /* renamed from: c, reason: collision with root package name */
    public long f29257c = 30000000;

    /* renamed from: d, reason: collision with root package name */
    public long f29258d = 2500000;

    /* renamed from: e, reason: collision with root package name */
    public long f29259e = 5000000;

    /* renamed from: f, reason: collision with root package name */
    public int f29260f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f29261g;

    @Override // com.google.android.gms.internal.ads.InterfaceC3525lO
    public final void a(VO vo) {
        this.f29260f = 0;
        this.f29261g = false;
        C4201y c4201y = this.f29255a;
        synchronized (c4201y) {
            c4201y.C(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3525lO
    public final void b(VO vo) {
        this.f29260f = 0;
        this.f29261g = false;
        C4201y c4201y = this.f29255a;
        synchronized (c4201y) {
            c4201y.C(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3525lO
    public final void c(C3417jO c3417jO, InterfaceC3716p[] interfaceC3716pArr) {
        int i;
        this.f29260f = 0;
        for (InterfaceC3716p interfaceC3716p : interfaceC3716pArr) {
            if (interfaceC3716p != null) {
                int i4 = this.f29260f;
                int i9 = interfaceC3716p.a().f23999c;
                if (i9 == 0) {
                    i = 144310272;
                } else if (i9 == 1) {
                    i = com.anythink.basead.exoplayer.b.aY;
                } else if (i9 != 2) {
                    i = 131072;
                    if (i9 != 3 && i9 != 5 && i9 != 6) {
                        throw new IllegalArgumentException();
                    }
                } else {
                    i = 131072000;
                }
                this.f29260f = i4 + i;
            }
        }
        this.f29255a.C(this.f29260f);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3525lO
    public final InterfaceC3985u d(VO vo) {
        return this.f29255a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3525lO
    public final boolean e(C3417jO c3417jO) {
        long j9 = c3417jO.f32111f ? this.f29259e : this.f29258d;
        return j9 <= 0 || c3417jO.f32109d >= j9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3525lO
    public final long f() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3525lO
    public final boolean g(C3417jO c3417jO) {
        int i;
        long j9 = c3417jO.f32109d;
        boolean z8 = true;
        char c4 = j9 > this.f29257c ? (char) 0 : j9 < this.f29256b ? (char) 2 : (char) 1;
        C4201y c4201y = this.f29255a;
        synchronized (c4201y) {
            i = c4201y.f35293u * com.anythink.basead.exoplayer.b.aX;
        }
        int i4 = this.f29260f;
        if (c4 != 2 && (c4 != 1 || !this.f29261g || i >= i4)) {
            z8 = false;
        }
        this.f29261g = z8;
        return z8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3525lO
    public final void i(VO vo) {
        this.f29260f = 0;
        this.f29261g = false;
    }
}
