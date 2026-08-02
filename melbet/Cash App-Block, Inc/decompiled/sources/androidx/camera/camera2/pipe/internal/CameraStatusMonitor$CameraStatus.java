package androidx.camera.camera2.pipe.internal;

import androidx.camera.camera2.pipe.CameraId;

/* loaded from: classes3.dex */
public abstract class CameraStatusMonitor$CameraStatus {

    public final class CameraAvailable extends CameraStatusMonitor$CameraStatus {
        public final String cameraId;

        public CameraAvailable(String str) {
            str.getClass();
            this.cameraId = str;
        }

        public final String toString() {
            return "CameraAvailable(camera=" + ((Object) CameraId.m46toStringimpl(this.cameraId)) + ')';
        }
    }

    public final class CameraPrioritiesChanged extends CameraStatusMonitor$CameraStatus {
        public static final CameraPrioritiesChanged INSTANCE = new CameraPrioritiesChanged();

        public final String toString() {
            return "CameraPrioritiesChanged";
        }
    }

    public final class CameraUnavailable extends CameraStatusMonitor$CameraStatus {
        public final String cameraId;

        public CameraUnavailable(String str) {
            str.getClass();
            this.cameraId = str;
        }

        public final String toString() {
            return "CameraUnavailable(camera=" + ((Object) CameraId.m46toStringimpl(this.cameraId)) + ')';
        }
    }

    public final class Unknown extends CameraStatusMonitor$CameraStatus {
        public static final Unknown INSTANCE = new Unknown();

        public final String toString() {
            return "UnknownCameraStatus";
        }
    }
}
