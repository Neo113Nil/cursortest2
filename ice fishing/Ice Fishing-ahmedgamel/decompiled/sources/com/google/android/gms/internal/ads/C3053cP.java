package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* renamed from: com.google.android.gms.internal.ads.cP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3053cP {

    /* renamed from: a, reason: collision with root package name */
    public final R4 f30271a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30272b;

    /* renamed from: c, reason: collision with root package name */
    public final C3128du f30273c;

    /* renamed from: d, reason: collision with root package name */
    public int f30274d;

    /* renamed from: e, reason: collision with root package name */
    public long f30275e;

    /* renamed from: f, reason: collision with root package name */
    public long f30276f;

    /* renamed from: g, reason: collision with root package name */
    public long f30277g;

    /* renamed from: h, reason: collision with root package name */
    public long f30278h;
    public long i;

    public C3053cP(AudioTrack audioTrack, C3128du c3128du) {
        this.f30271a = new R4(audioTrack);
        this.f30272b = audioTrack.getSampleRate();
        this.f30273c = c3128du;
        a(0);
    }

    public final void a(int i) {
        this.f30274d = i;
        long j6 = 10000;
        if (i == 0) {
            this.f30277g = 0L;
            this.f30278h = -1L;
            this.i = com.anythink.basead.exoplayer.b.f7168b;
            this.f30275e = System.nanoTime() / 1000;
        } else {
            if (i == 1) {
                this.f30276f = 10000L;
                return;
            }
            j6 = (i == 2 || i == 3) ? 10000000L : 500000L;
        }
        this.f30276f = j6;
    }
}
