package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraId;
import kotlinx.coroutines.CompletableDeferredImpl;

/* loaded from: classes3.dex */
public final class RequestCloseById extends CameraRequest {
    public final String activeCameraId;
    public final CompletableDeferredImpl deferred;

    public RequestCloseById(String str) {
        str.getClass();
        this.activeCameraId = str;
        this.deferred = new CompletableDeferredImpl();
    }

    public final String toString() {
        return "RequestCloseById(" + ((Object) CameraId.m46toStringimpl(this.activeCameraId)) + ')';
    }
}
