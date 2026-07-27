package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.iP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3353iP extends AudioTrack$StreamEventCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3481ku f31042a;

    public C3353iP(C3481ku c3481ku) {
        Objects.requireNonNull(c3481ku);
        this.f31042a = c3481ku;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        C3530lp c3530lp = ((C3405jP) this.f31042a.f31665w).i;
        c3530lp.c(-1, C3084dP.f29773x);
        c3530lp.d();
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        C3530lp c3530lp = ((C3405jP) this.f31042a.f31665w).i;
        c3530lp.c(-1, C3084dP.f29771v);
        c3530lp.d();
    }

    public final void onTearDown(AudioTrack audioTrack) {
        C3530lp c3530lp = ((C3405jP) this.f31042a.f31665w).i;
        c3530lp.c(-1, C3084dP.f29772w);
        c3530lp.d();
    }
}
