package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class NN {

    /* renamed from: a, reason: collision with root package name */
    public final long f26527a;

    /* renamed from: b, reason: collision with root package name */
    public final long f26528b;

    /* renamed from: c, reason: collision with root package name */
    public long f26529c = com.anythink.basead.exoplayer.b.f6539b;

    /* renamed from: d, reason: collision with root package name */
    public long f26530d = com.anythink.basead.exoplayer.b.f6539b;

    /* renamed from: f, reason: collision with root package name */
    public long f26532f = com.anythink.basead.exoplayer.b.f6539b;

    /* renamed from: g, reason: collision with root package name */
    public long f26533g = com.anythink.basead.exoplayer.b.f6539b;
    public float i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    public long f26535j = com.anythink.basead.exoplayer.b.f6539b;

    /* renamed from: e, reason: collision with root package name */
    public long f26531e = com.anythink.basead.exoplayer.b.f6539b;

    /* renamed from: h, reason: collision with root package name */
    public long f26534h = com.anythink.basead.exoplayer.b.f6539b;

    /* renamed from: k, reason: collision with root package name */
    public long f26536k = com.anythink.basead.exoplayer.b.f6539b;

    /* renamed from: l, reason: collision with root package name */
    public long f26537l = com.anythink.basead.exoplayer.b.f6539b;

    public /* synthetic */ NN(long j9, long j10) {
        this.f26527a = j9;
        this.f26528b = j10;
    }

    public final void a() {
        long j9 = this.f26534h;
        if (j9 == com.anythink.basead.exoplayer.b.f6539b) {
            return;
        }
        long j10 = j9 + this.f26528b;
        this.f26534h = j10;
        long j11 = this.f26533g;
        if (j11 != com.anythink.basead.exoplayer.b.f6539b && j10 > j11) {
            this.f26534h = j11;
        }
        this.f26535j = com.anythink.basead.exoplayer.b.f6539b;
    }

    public final long b() {
        return this.f26534h;
    }

    public final void c() {
        long j9;
        long j10 = this.f26529c;
        if (j10 != com.anythink.basead.exoplayer.b.f6539b) {
            j9 = this.f26530d;
            if (j9 == com.anythink.basead.exoplayer.b.f6539b) {
                long j11 = this.f26532f;
                if (j11 != com.anythink.basead.exoplayer.b.f6539b && j10 < j11) {
                    j10 = j11;
                }
                j9 = this.f26533g;
                if (j9 == com.anythink.basead.exoplayer.b.f6539b || j10 <= j9) {
                    j9 = j10;
                }
            }
        } else {
            j9 = -9223372036854775807L;
        }
        if (this.f26531e == j9) {
            return;
        }
        this.f26531e = j9;
        this.f26534h = j9;
        this.f26536k = com.anythink.basead.exoplayer.b.f6539b;
        this.f26537l = com.anythink.basead.exoplayer.b.f6539b;
        this.f26535j = com.anythink.basead.exoplayer.b.f6539b;
    }
}
