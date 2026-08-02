package androidx.camera.camera2.pipe.compat;

/* loaded from: classes3.dex */
public final class CameraStateOpen extends CameraState {
    public final CameraDeviceWrapper cameraDevice;

    public CameraStateOpen(CameraDeviceWrapper cameraDeviceWrapper) {
        this.cameraDevice = cameraDeviceWrapper;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CameraStateOpen) && this.cameraDevice.equals(((CameraStateOpen) obj).cameraDevice);
    }

    public final int hashCode() {
        return this.cameraDevice.hashCode();
    }

    public final String toString() {
        return "CameraStateOpen(cameraDevice=" + this.cameraDevice + ')';
    }
}
