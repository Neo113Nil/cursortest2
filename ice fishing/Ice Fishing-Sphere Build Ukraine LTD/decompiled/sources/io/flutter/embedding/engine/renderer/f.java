package io.flutter.embedding.engine.renderer;

import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final long f2354e;

    /* renamed from: f, reason: collision with root package name */
    public final FlutterJNI f2355f;

    public f(long j2, FlutterJNI flutterJNI) {
        this.f2354e = j2;
        this.f2355f = flutterJNI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FlutterJNI flutterJNI = this.f2355f;
        if (flutterJNI.isAttached()) {
            flutterJNI.unregisterTexture(this.f2354e);
        }
    }
}
