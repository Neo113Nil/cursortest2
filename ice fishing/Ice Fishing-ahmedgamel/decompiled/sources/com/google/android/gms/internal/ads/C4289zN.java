package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4289zN {

    /* renamed from: a, reason: collision with root package name */
    public final long f36102a;

    /* renamed from: b, reason: collision with root package name */
    public final long f36103b;

    /* renamed from: c, reason: collision with root package name */
    public long f36104c = com.anythink.basead.exoplayer.b.f7168b;

    /* renamed from: d, reason: collision with root package name */
    public long f36105d = com.anythink.basead.exoplayer.b.f7168b;

    /* renamed from: f, reason: collision with root package name */
    public long f36107f = com.anythink.basead.exoplayer.b.f7168b;

    /* renamed from: g, reason: collision with root package name */
    public long f36108g = com.anythink.basead.exoplayer.b.f7168b;
    public float i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    public long f36110j = com.anythink.basead.exoplayer.b.f7168b;

    /* renamed from: e, reason: collision with root package name */
    public long f36106e = com.anythink.basead.exoplayer.b.f7168b;

    /* renamed from: h, reason: collision with root package name */
    public long f36109h = com.anythink.basead.exoplayer.b.f7168b;

    /* renamed from: k, reason: collision with root package name */
    public long f36111k = com.anythink.basead.exoplayer.b.f7168b;

    /* renamed from: l, reason: collision with root package name */
    public long f36112l = com.anythink.basead.exoplayer.b.f7168b;

    public /* synthetic */ C4289zN(long j6, long j9) {
        this.f36102a = j6;
        this.f36103b = j9;
    }

    public final void a() {
        long j6 = this.f36109h;
        if (j6 == com.anythink.basead.exoplayer.b.f7168b) {
            return;
        }
        long j9 = j6 + this.f36103b;
        this.f36109h = j9;
        long j10 = this.f36108g;
        if (j10 != com.anythink.basead.exoplayer.b.f7168b && j9 > j10) {
            this.f36109h = j10;
        }
        this.f36110j = com.anythink.basead.exoplayer.b.f7168b;
    }

    public final long b() {
        return this.f36109h;
    }

    public final void c() {
        long j6;
        long j9 = this.f36104c;
        if (j9 != com.anythink.basead.exoplayer.b.f7168b) {
            j6 = this.f36105d;
            if (j6 == com.anythink.basead.exoplayer.b.f7168b) {
                long j10 = this.f36107f;
                if (j10 != com.anythink.basead.exoplayer.b.f7168b && j9 < j10) {
                    j9 = j10;
                }
                j6 = this.f36108g;
                if (j6 == com.anythink.basead.exoplayer.b.f7168b || j9 <= j6) {
                    j6 = j9;
                }
            }
        } else {
            j6 = -9223372036854775807L;
        }
        if (this.f36106e == j6) {
            return;
        }
        this.f36106e = j6;
        this.f36109h = j6;
        this.f36111k = com.anythink.basead.exoplayer.b.f7168b;
        this.f36112l = com.anythink.basead.exoplayer.b.f7168b;
        this.f36110j = com.anythink.basead.exoplayer.b.f7168b;
    }
}
