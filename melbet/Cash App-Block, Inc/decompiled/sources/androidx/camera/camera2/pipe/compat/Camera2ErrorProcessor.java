package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.GraphState;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class Camera2ErrorProcessor {
    public final Object lock = new Object();
    public final LinkedHashMap virtualCameraStateMap = new LinkedHashMap();

    /* renamed from: onCameraError-3M5Xam4, reason: not valid java name */
    public final void m69onCameraError3M5Xam4(String str, int i, boolean z) {
        VirtualCameraState virtualCameraState;
        str.getClass();
        synchronized (this.lock) {
            virtualCameraState = (VirtualCameraState) this.virtualCameraStateMap.get(new CameraId(str));
        }
        if (virtualCameraState == null) {
            return;
        }
        virtualCameraState.graphListener.onGraphError(new GraphState.GraphStateError(i, z));
    }
}
