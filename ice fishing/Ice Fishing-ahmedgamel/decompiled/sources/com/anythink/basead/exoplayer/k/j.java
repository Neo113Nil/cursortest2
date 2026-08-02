package com.anythink.basead.exoplayer.k;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f9192a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9193b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9194c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9195d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9196e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9197f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9198g;

    /* renamed from: h, reason: collision with root package name */
    public final long f9199h;

    private j(byte[] bArr, int i) {
        r rVar = new r(bArr);
        rVar.a(i * 8);
        this.f9192a = rVar.c(16);
        this.f9193b = rVar.c(16);
        this.f9194c = rVar.c(24);
        this.f9195d = rVar.c(24);
        this.f9196e = rVar.c(20);
        this.f9197f = rVar.c(3) + 1;
        this.f9198g = rVar.c(5) + 1;
        this.f9199h = ((rVar.c(4) & 15) << 32) | (rVar.c(32) & 4294967295L);
    }

    private int a() {
        return (this.f9198g / 8) * this.f9193b * this.f9197f;
    }

    private int b() {
        return this.f9198g * this.f9196e;
    }

    private long c() {
        return (this.f9199h * 1000000) / this.f9196e;
    }

    private long d() {
        long j6;
        long j9;
        int i = this.f9195d;
        if (i > 0) {
            j6 = (i + this.f9194c) / 2;
            j9 = 1;
        } else {
            int i4 = this.f9192a;
            j6 = ((((i4 != this.f9193b || i4 <= 0) ? 4096L : i4) * this.f9197f) * this.f9198g) / 8;
            j9 = 64;
        }
        return j6 + j9;
    }

    private long a(long j6) {
        return af.a((j6 * this.f9196e) / 1000000, this.f9199h - 1);
    }

    private j(int i, int i4, int i6, int i9, int i10, int i11, int i12, long j6) {
        this.f9192a = i;
        this.f9193b = i4;
        this.f9194c = i6;
        this.f9195d = i9;
        this.f9196e = i10;
        this.f9197f = i11;
        this.f9198g = i12;
        this.f9199h = j6;
    }
}
