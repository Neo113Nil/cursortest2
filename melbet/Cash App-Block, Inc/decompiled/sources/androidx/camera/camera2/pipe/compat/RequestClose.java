package androidx.camera.camera2.pipe.compat;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class RequestClose extends CameraRequest {
    public final ActiveCamera activeCamera;

    public RequestClose(ActiveCamera activeCamera) {
        activeCamera.getClass();
        this.activeCamera = activeCamera;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RequestClose) && Intrinsics.areEqual(this.activeCamera, ((RequestClose) obj).activeCamera);
    }

    public final int hashCode() {
        return this.activeCamera.hashCode();
    }

    public final String toString() {
        return "RequestClose(activeCamera=" + this.activeCamera + ')';
    }
}
