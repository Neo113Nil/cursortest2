package androidx.camera.camera2.pipe.compat;

import kotlinx.coroutines.CompletableDeferredImpl;

/* loaded from: classes3.dex */
public final class RequestCloseAll extends CameraRequest {
    public final CompletableDeferredImpl deferred = new CompletableDeferredImpl();

    public final String toString() {
        return "RequestCloseAll";
    }
}
