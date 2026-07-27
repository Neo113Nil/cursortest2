package io.flutter.view;

import android.view.Choreographer;

/* loaded from: classes.dex */
public final class r implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public long f2629a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f2630b;

    public r(s sVar, long j2) {
        this.f2630b = sVar;
        this.f2629a = j2;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        long nanoTime = System.nanoTime() - j2;
        long j3 = nanoTime < 0 ? 0L : nanoTime;
        s sVar = this.f2630b;
        sVar.f2634b.onVsync(j3, sVar.f2633a, this.f2629a);
        sVar.f2635c = this;
    }
}
