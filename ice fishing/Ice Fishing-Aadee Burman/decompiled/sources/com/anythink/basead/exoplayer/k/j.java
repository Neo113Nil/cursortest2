package com.anythink.basead.exoplayer.k;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f8406a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8407b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8408c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8409d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8410e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8411f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8412g;

    /* renamed from: h, reason: collision with root package name */
    public final long f8413h;

    private j(byte[] bArr, int i) {
        r rVar = new r(bArr);
        rVar.a(i * 8);
        this.f8406a = rVar.c(16);
        this.f8407b = rVar.c(16);
        this.f8408c = rVar.c(24);
        this.f8409d = rVar.c(24);
        this.f8410e = rVar.c(20);
        this.f8411f = rVar.c(3) + 1;
        this.f8412g = rVar.c(5) + 1;
        this.f8413h = ((rVar.c(4) & 15) << 32) | (rVar.c(32) & 4294967295L);
    }

    private int a() {
        return (this.f8412g / 8) * this.f8407b * this.f8411f;
    }

    private int b() {
        return this.f8412g * this.f8410e;
    }

    private long c() {
        return (this.f8413h * 1000000) / this.f8410e;
    }

    private long d() {
        long j6;
        long j9;
        int i = this.f8409d;
        if (i > 0) {
            j6 = (i + this.f8408c) / 2;
            j9 = 1;
        } else {
            int i6 = this.f8406a;
            j6 = ((((i6 != this.f8407b || i6 <= 0) ? 4096L : i6) * this.f8411f) * this.f8412g) / 8;
            j9 = 64;
        }
        return j6 + j9;
    }

    private long a(long j6) {
        return af.a((j6 * this.f8410e) / 1000000, this.f8413h - 1);
    }

    private j(int i, int i6, int i9, int i10, int i11, int i12, int i13, long j6) {
        this.f8406a = i;
        this.f8407b = i6;
        this.f8408c = i9;
        this.f8409d = i10;
        this.f8410e = i11;
        this.f8411f = i12;
        this.f8412g = i13;
        this.f8413h = j6;
    }
}
