package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.iP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3376iP extends AudioTrack$StreamEventCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3504ku f31815a;

    public C3376iP(C3504ku c3504ku) {
        Objects.requireNonNull(c3504ku);
        this.f31815a = c3504ku;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        C3553lp c3553lp = ((C3428jP) this.f31815a.f32447w).i;
        c3553lp.c(-1, C3107dP.f30545x);
        c3553lp.d();
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        C3553lp c3553lp = ((C3428jP) this.f31815a.f32447w).i;
        c3553lp.c(-1, C3107dP.f30543v);
        c3553lp.d();
    }

    public final void onTearDown(AudioTrack audioTrack) {
        C3553lp c3553lp = ((C3428jP) this.f31815a.f32447w).i;
        c3553lp.c(-1, C3107dP.f30544w);
        c3553lp.d();
    }
}
