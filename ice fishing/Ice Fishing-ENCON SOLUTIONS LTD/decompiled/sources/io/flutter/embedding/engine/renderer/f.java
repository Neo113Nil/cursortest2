package io.flutter.embedding.engine.renderer;

import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final long f7740a;

    /* renamed from: b, reason: collision with root package name */
    public final FlutterJNI f7741b;

    public f(long j2, FlutterJNI flutterJNI) {
        this.f7740a = j2;
        this.f7741b = flutterJNI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FlutterJNI flutterJNI = this.f7741b;
        if (flutterJNI.isAttached()) {
            flutterJNI.unregisterTexture(this.f7740a);
        }
    }
}
