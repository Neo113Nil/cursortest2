package io.flutter.view;

import android.view.Choreographer;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class r implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public long f8011a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N1.l f8012b;

    public r(N1.l lVar, long j2) {
        this.f8012b = lVar;
        this.f8011a = j2;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        long nanoTime = System.nanoTime() - j2;
        long j3 = nanoTime < 0 ? 0L : nanoTime;
        N1.l lVar = this.f8012b;
        ((FlutterJNI) lVar.f1218b).onVsync(j3, lVar.f1217a, this.f8011a);
        lVar.f1219c = this;
    }
}
