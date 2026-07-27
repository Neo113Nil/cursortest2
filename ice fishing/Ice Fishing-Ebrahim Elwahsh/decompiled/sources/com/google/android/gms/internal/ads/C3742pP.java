package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* renamed from: com.google.android.gms.internal.ads.pP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3742pP {

    /* renamed from: a, reason: collision with root package name */
    public final P4 f33400a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33401b;

    /* renamed from: c, reason: collision with root package name */
    public final Mu f33402c;

    /* renamed from: d, reason: collision with root package name */
    public int f33403d;

    /* renamed from: e, reason: collision with root package name */
    public long f33404e;

    /* renamed from: f, reason: collision with root package name */
    public long f33405f;

    /* renamed from: g, reason: collision with root package name */
    public long f33406g;

    /* renamed from: h, reason: collision with root package name */
    public long f33407h;
    public long i;

    public C3742pP(AudioTrack audioTrack, Mu mu) {
        this.f33400a = new P4(audioTrack);
        this.f33401b = audioTrack.getSampleRate();
        this.f33402c = mu;
        a(0);
    }

    public final void a(int i) {
        this.f33403d = i;
        long j9 = 10000;
        if (i == 0) {
            this.f33406g = 0L;
            this.f33407h = -1L;
            this.i = com.anythink.basead.exoplayer.b.f6539b;
            this.f33404e = System.nanoTime() / 1000;
        } else {
            if (i == 1) {
                this.f33405f = 10000L;
                return;
            }
            j9 = (i == 2 || i == 3) ? 10000000L : 500000L;
        }
        this.f33405f = j9;
    }
}
