package com.google.mlkit.vision.face;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.google.android.gms.common.api.OptionalModuleApi;
import java.io.Closeable;

/* loaded from: classes4.dex */
public interface FaceDetector extends Closeable, LifecycleObserver, OptionalModuleApi {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    void close();
}
