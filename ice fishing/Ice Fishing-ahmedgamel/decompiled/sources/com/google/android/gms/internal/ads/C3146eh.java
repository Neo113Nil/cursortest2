package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.eh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3146eh implements YN {

    /* renamed from: a, reason: collision with root package name */
    public final C4242z f29958a = new C4242z();

    /* renamed from: b, reason: collision with root package name */
    public long f29959b = 15000000;

    /* renamed from: c, reason: collision with root package name */
    public long f29960c = 30000000;

    /* renamed from: d, reason: collision with root package name */
    public long f29961d = 2500000;

    /* renamed from: e, reason: collision with root package name */
    public long f29962e = 5000000;

    /* renamed from: f, reason: collision with root package name */
    public int f29963f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f29964g;

    @Override // com.google.android.gms.internal.ads.YN
    public final void a(XN xn, InterfaceC3757q[] interfaceC3757qArr) {
        int i;
        this.f29963f = 0;
        for (InterfaceC3757q interfaceC3757q : interfaceC3757qArr) {
            if (interfaceC3757q != null) {
                int i6 = this.f29963f;
                int i9 = interfaceC3757q.c().f23637c;
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
                this.f29963f = i6 + i;
            }
        }
        this.f29958a.C(this.f29963f);
    }

    @Override // com.google.android.gms.internal.ads.YN
    public final void b(IO io) {
        this.f29963f = 0;
        this.f29964g = false;
    }

    @Override // com.google.android.gms.internal.ads.YN
    public final boolean c(XN xn) {
        int i;
        long j6 = xn.f28519d;
        boolean z3 = true;
        char c9 = j6 > this.f29960c ? (char) 0 : j6 < this.f29959b ? (char) 2 : (char) 1;
        C4242z c4242z = this.f29958a;
        synchronized (c4242z) {
            i = c4242z.f35258u * com.anythink.basead.exoplayer.b.aX;
        }
        int i6 = this.f29963f;
        if (c9 != 2 && (c9 != 1 || !this.f29964g || i >= i6)) {
            z3 = false;
        }
        this.f29964g = z3;
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.YN
    public final void d(IO io) {
        this.f29963f = 0;
        this.f29964g = false;
        C4242z c4242z = this.f29958a;
        synchronized (c4242z) {
            c4242z.C(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.YN
    public final long e() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.YN
    public final void f(IO io) {
        this.f29963f = 0;
        this.f29964g = false;
        C4242z c4242z = this.f29958a;
        synchronized (c4242z) {
            c4242z.C(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.YN
    public final boolean g(XN xn) {
        long j6 = xn.f28521f ? this.f29962e : this.f29961d;
        return j6 <= 0 || xn.f28519d >= j6;
    }

    @Override // com.google.android.gms.internal.ads.YN
    public final InterfaceC4026v h(IO io) {
        return this.f29958a;
    }
}
