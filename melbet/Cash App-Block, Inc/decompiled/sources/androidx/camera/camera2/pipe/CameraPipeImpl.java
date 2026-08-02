package androidx.camera.camera2.pipe;

import android.os.Trace;
import androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent$CameraGraphComponentImpl;
import androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent$CameraPipeComponentImpl;
import androidx.camera.camera2.pipe.graph.CameraGraphImpl;
import androidx.camera.camera2.pipe.internal.CameraDevicesImpl;
import androidx.camera.video.Recorder;
import kotlinx.atomicfu.AtomicInt;

/* loaded from: classes3.dex */
public final class CameraPipeImpl {
    public final DaggerCameraPipeComponent$CameraPipeComponentImpl component;
    public final int debugId;
    public final Object lock;
    public boolean shutdown;

    public CameraPipeImpl(DaggerCameraPipeComponent$CameraPipeComponentImpl daggerCameraPipeComponent$CameraPipeComponentImpl) {
        this.component = daggerCameraPipeComponent$CameraPipeComponentImpl;
        AtomicInt atomicInt = CameraPipeKt.cameraPipeIds;
        atomicInt.getClass();
        this.debugId = AtomicInt.FU.incrementAndGet(atomicInt);
        this.lock = new Object();
    }

    public final CameraSurfaceManager cameraSurfaceManager() {
        CameraSurfaceManager cameraSurfaceManager;
        synchronized (this.lock) {
            if (this.shutdown) {
                throw new IllegalStateException("Check failed.");
            }
            cameraSurfaceManager = (CameraSurfaceManager) this.component.provideCameraSurfaceManagerProvider.get();
        }
        return cameraSurfaceManager;
    }

    public final CameraDevicesImpl cameras() {
        CameraDevicesImpl cameraDevicesImpl;
        synchronized (this.lock) {
            if (this.shutdown) {
                throw new IllegalStateException("Check failed.");
            }
            cameraDevicesImpl = (CameraDevicesImpl) this.component.cameraDevicesImplProvider.get();
        }
        return cameraDevicesImpl;
    }

    public final CameraGraphImpl createCameraGraphLocked(CameraGraph$Config cameraGraph$Config, CameraGraphId cameraGraphId) {
        try {
            Trace.beginSection("CXCP#CameraGraph-" + ((Object) CameraId.m46toStringimpl(cameraGraph$Config.camera)));
            return (CameraGraphImpl) new DaggerCameraPipeComponent$CameraGraphComponentImpl(this.component.cameraPipeComponentImpl, new Recorder.AnonymousClass4(cameraGraph$Config, cameraGraphId)).cameraGraphImplProvider.get();
        } finally {
            Trace.endSection();
        }
    }

    public final String toString() {
        return "CameraPipe-" + this.debugId;
    }
}
