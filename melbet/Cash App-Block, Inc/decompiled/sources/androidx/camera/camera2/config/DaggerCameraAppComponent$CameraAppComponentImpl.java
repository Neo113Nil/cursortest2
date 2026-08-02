package androidx.camera.camera2.config;

import androidx.camera.camera2.pipe.CameraPipeImpl;
import androidx.camera.camera2.pipe.internal.CameraDevicesImpl;
import com.fillr.e0;
import dagger.internal.Preconditions;

/* loaded from: classes3.dex */
public final class DaggerCameraAppComponent$CameraAppComponentImpl {
    public final DaggerCameraAppComponent$CameraAppComponentImpl cameraAppComponentImpl = this;
    public final e0 cameraAppConfig;

    public DaggerCameraAppComponent$CameraAppComponentImpl(e0 e0Var) {
        this.cameraAppConfig = e0Var;
    }

    public final CameraDevicesImpl getCameraDevices() {
        CameraPipeImpl cameraPipeImpl = (CameraPipeImpl) this.cameraAppConfig.c;
        Preconditions.checkNotNullFromProvides(cameraPipeImpl);
        CameraDevicesImpl cameras = cameraPipeImpl.cameras();
        Preconditions.checkNotNullFromProvides(cameras);
        return cameras;
    }
}
