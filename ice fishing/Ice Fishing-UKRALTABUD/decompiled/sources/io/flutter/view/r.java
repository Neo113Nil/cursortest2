package io.flutter.view;

import android.view.Choreographer;

/* loaded from: classes.dex */
public final class r implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public long f2621a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f2622b;

    public r(s sVar, long j2) {
        this.f2622b = sVar;
        this.f2621a = j2;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        long nanoTime = System.nanoTime() - j2;
        long j3 = nanoTime < 0 ? 0L : nanoTime;
        s sVar = this.f2622b;
        sVar.f2626b.onVsync(j3, sVar.f2625a, this.f2621a);
        sVar.f2627c = this;
    }
}
