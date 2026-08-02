package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.eh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3169eh implements YN {

    /* renamed from: a, reason: collision with root package name */
    public final C4265z f30749a = new C4265z();

    /* renamed from: b, reason: collision with root package name */
    public long f30750b = 15000000;

    /* renamed from: c, reason: collision with root package name */
    public long f30751c = 30000000;

    /* renamed from: d, reason: collision with root package name */
    public long f30752d = 2500000;

    /* renamed from: e, reason: collision with root package name */
    public long f30753e = 5000000;

    /* renamed from: f, reason: collision with root package name */
    public int f30754f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f30755g;

    @Override // com.google.android.gms.internal.ads.YN
    public final void a(XN xn, InterfaceC3780q[] interfaceC3780qArr) {
        int i;
        this.f30754f = 0;
        for (InterfaceC3780q interfaceC3780q : interfaceC3780qArr) {
            if (interfaceC3780q != null) {
                int i4 = this.f30754f;
                int i6 = interfaceC3780q.c().f24417c;
                if (i6 == 0) {
                    i = 144310272;
                } else if (i6 == 1) {
                    i = com.anythink.basead.exoplayer.b.aY;
                } else if (i6 != 2) {
                    i = 131072;
                    if (i6 != 3 && i6 != 5 && i6 != 6) {
                        throw new IllegalArgumentException();
                    }
                } else {
                    i = 131072000;
                }
                this.f30754f = i4 + i;
            }
        }
        this.f30749a.C(this.f30754f);
    }

    @Override // com.google.android.gms.internal.ads.YN
    public final void b(IO io) {
        this.f30754f = 0;
        this.f30755g = false;
    }

    @Override // com.google.android.gms.internal.ads.YN
    public final boolean c(XN xn) {
        int i;
        long j6 = xn.f29299d;
        boolean z6 = true;
        char c9 = j6 > this.f30751c ? (char) 0 : j6 < this.f30750b ? (char) 2 : (char) 1;
        C4265z c4265z = this.f30749a;
        synchronized (c4265z) {
            i = c4265z.f36042u * com.anythink.basead.exoplayer.b.aX;
        }
        int i4 = this.f30754f;
        if (c9 != 2 && (c9 != 1 || !this.f30755g || i >= i4)) {
            z6 = false;
        }
        this.f30755g = z6;
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.YN
    public final void d(IO io) {
        this.f30754f = 0;
        this.f30755g = false;
        C4265z c4265z = this.f30749a;
        synchronized (c4265z) {
            c4265z.C(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.YN
    public final long e() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.YN
    public final void f(IO io) {
        this.f30754f = 0;
        this.f30755g = false;
        C4265z c4265z = this.f30749a;
        synchronized (c4265z) {
            c4265z.C(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.YN
    public final boolean g(XN xn) {
        long j6 = xn.f29301f ? this.f30753e : this.f30752d;
        return j6 <= 0 || xn.f29299d >= j6;
    }

    @Override // com.google.android.gms.internal.ads.YN
    public final InterfaceC4049v h(IO io) {
        return this.f30749a;
    }
}
