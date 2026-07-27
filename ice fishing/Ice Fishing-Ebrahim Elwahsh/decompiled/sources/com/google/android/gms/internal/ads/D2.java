package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class D2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f24316a;

    /* renamed from: b, reason: collision with root package name */
    public int f24317b;

    /* renamed from: c, reason: collision with root package name */
    public int f24318c;

    /* renamed from: d, reason: collision with root package name */
    public long f24319d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f24320e;

    /* renamed from: f, reason: collision with root package name */
    public final Lr f24321f;

    /* renamed from: g, reason: collision with root package name */
    public final Lr f24322g;

    /* renamed from: h, reason: collision with root package name */
    public int f24323h;
    public int i;

    public D2(Lr lr, Lr lr2, boolean z8) {
        this.f24322g = lr;
        this.f24321f = lr2;
        this.f24320e = z8;
        lr2.E(12);
        this.f24316a = lr2.h();
        lr.E(12);
        this.i = lr.h();
        AbstractC2720Pd.k("first_chunk must be 1", lr.b() == 1);
        this.f24317b = -1;
    }

    public final boolean a() {
        int i = this.f24317b + 1;
        this.f24317b = i;
        if (i == this.f24316a) {
            return false;
        }
        boolean z8 = this.f24320e;
        Lr lr = this.f24321f;
        this.f24319d = z8 ? lr.j() : lr.P();
        if (this.f24317b == this.f24323h) {
            Lr lr2 = this.f24322g;
            this.f24318c = lr2.h();
            lr2.G(4);
            int i4 = this.i - 1;
            this.i = i4;
            this.f24323h = i4 > 0 ? (-1) + lr2.h() : -1;
        }
        return true;
    }
}
