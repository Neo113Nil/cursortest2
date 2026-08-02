package androidx.camera.core.impl;

import android.os.Handler;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class AutoValue_CameraThreadConfig {
    public final Executor cameraExecutor;
    public final Handler schedulerHandler;

    public AutoValue_CameraThreadConfig(Executor executor, Handler handler) {
        if (executor == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null cameraExecutor");
            throw null;
        }
        this.cameraExecutor = executor;
        if (handler != null) {
            this.schedulerHandler = handler;
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("Null schedulerHandler");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutoValue_CameraThreadConfig) {
            AutoValue_CameraThreadConfig autoValue_CameraThreadConfig = (AutoValue_CameraThreadConfig) obj;
            if (this.cameraExecutor.equals(autoValue_CameraThreadConfig.cameraExecutor) && this.schedulerHandler.equals(autoValue_CameraThreadConfig.schedulerHandler)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.schedulerHandler.hashCode() ^ ((this.cameraExecutor.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.cameraExecutor + ", schedulerHandler=" + this.schedulerHandler + "}";
    }
}
