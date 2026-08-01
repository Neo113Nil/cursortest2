package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* renamed from: com.google.android.gms.internal.ads.cP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3030cP {

    /* renamed from: a, reason: collision with root package name */
    public final R4 f29488a;

    /* renamed from: b, reason: collision with root package name */
    public final int f29489b;

    /* renamed from: c, reason: collision with root package name */
    public final C3105du f29490c;

    /* renamed from: d, reason: collision with root package name */
    public int f29491d;

    /* renamed from: e, reason: collision with root package name */
    public long f29492e;

    /* renamed from: f, reason: collision with root package name */
    public long f29493f;

    /* renamed from: g, reason: collision with root package name */
    public long f29494g;

    /* renamed from: h, reason: collision with root package name */
    public long f29495h;
    public long i;

    public C3030cP(AudioTrack audioTrack, C3105du c3105du) {
        this.f29488a = new R4(audioTrack);
        this.f29489b = audioTrack.getSampleRate();
        this.f29490c = c3105du;
        a(0);
    }

    public final void a(int i) {
        this.f29491d = i;
        long j6 = 10000;
        if (i == 0) {
            this.f29494g = 0L;
            this.f29495h = -1L;
            this.i = com.anythink.basead.exoplayer.b.f6382b;
            this.f29492e = System.nanoTime() / 1000;
        } else {
            if (i == 1) {
                this.f29493f = 10000L;
                return;
            }
            j6 = (i == 2 || i == 3) ? 10000000L : 500000L;
        }
        this.f29493f = j6;
    }
}
