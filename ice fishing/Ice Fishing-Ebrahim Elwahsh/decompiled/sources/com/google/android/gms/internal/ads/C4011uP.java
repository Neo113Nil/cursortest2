package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.uP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4011uP extends AudioTrack$StreamEventCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3602mu f34591a;

    public C4011uP(C3602mu c3602mu) {
        Objects.requireNonNull(c3602mu);
        this.f34591a = c3602mu;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        C3759pp c3759pp = ((C4119wP) this.f34591a.f32776w).i;
        c3759pp.c(-1, C3796qP.f33726x);
        c3759pp.d();
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        C3759pp c3759pp = ((C4119wP) this.f34591a.f32776w).i;
        c3759pp.c(-1, C3796qP.f33724v);
        c3759pp.d();
    }

    public final void onTearDown(AudioTrack audioTrack) {
        C3759pp c3759pp = ((C4119wP) this.f34591a.f32776w).i;
        c3759pp.c(-1, C3796qP.f33725w);
        c3759pp.d();
    }
}
