package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4266zN {

    /* renamed from: a, reason: collision with root package name */
    public final long f35318a;

    /* renamed from: b, reason: collision with root package name */
    public final long f35319b;

    /* renamed from: c, reason: collision with root package name */
    public long f35320c = com.anythink.basead.exoplayer.b.f6382b;

    /* renamed from: d, reason: collision with root package name */
    public long f35321d = com.anythink.basead.exoplayer.b.f6382b;

    /* renamed from: f, reason: collision with root package name */
    public long f35323f = com.anythink.basead.exoplayer.b.f6382b;

    /* renamed from: g, reason: collision with root package name */
    public long f35324g = com.anythink.basead.exoplayer.b.f6382b;
    public float i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    public long f35326j = com.anythink.basead.exoplayer.b.f6382b;

    /* renamed from: e, reason: collision with root package name */
    public long f35322e = com.anythink.basead.exoplayer.b.f6382b;

    /* renamed from: h, reason: collision with root package name */
    public long f35325h = com.anythink.basead.exoplayer.b.f6382b;

    /* renamed from: k, reason: collision with root package name */
    public long f35327k = com.anythink.basead.exoplayer.b.f6382b;

    /* renamed from: l, reason: collision with root package name */
    public long f35328l = com.anythink.basead.exoplayer.b.f6382b;

    public /* synthetic */ C4266zN(long j6, long j9) {
        this.f35318a = j6;
        this.f35319b = j9;
    }

    public final void a() {
        long j6 = this.f35325h;
        if (j6 == com.anythink.basead.exoplayer.b.f6382b) {
            return;
        }
        long j9 = j6 + this.f35319b;
        this.f35325h = j9;
        long j10 = this.f35324g;
        if (j10 != com.anythink.basead.exoplayer.b.f6382b && j9 > j10) {
            this.f35325h = j10;
        }
        this.f35326j = com.anythink.basead.exoplayer.b.f6382b;
    }

    public final long b() {
        return this.f35325h;
    }

    public final void c() {
        long j6;
        long j9 = this.f35320c;
        if (j9 != com.anythink.basead.exoplayer.b.f6382b) {
            j6 = this.f35321d;
            if (j6 == com.anythink.basead.exoplayer.b.f6382b) {
                long j10 = this.f35323f;
                if (j10 != com.anythink.basead.exoplayer.b.f6382b && j9 < j10) {
                    j9 = j10;
                }
                j6 = this.f35324g;
                if (j6 == com.anythink.basead.exoplayer.b.f6382b || j9 <= j6) {
                    j6 = j9;
                }
            }
        } else {
            j6 = -9223372036854775807L;
        }
        if (this.f35322e == j6) {
            return;
        }
        this.f35322e = j6;
        this.f35325h = j6;
        this.f35327k = com.anythink.basead.exoplayer.b.f6382b;
        this.f35328l = com.anythink.basead.exoplayer.b.f6382b;
        this.f35326j = com.anythink.basead.exoplayer.b.f6382b;
    }
}
