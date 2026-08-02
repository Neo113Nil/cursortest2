package androidx.camera.camera2.pipe.internal;

import android.content.Context;
import androidx.camera.camera2.adapter.ZslControlImpl$$ExternalSyntheticLambda1;
import androidx.camera.camera2.pipe.CameraBackendId;
import androidx.camera.camera2.pipe.compat.Camera2Backend;
import androidx.camera.camera2.pipe.config.CameraPipeModule$Companion$$ExternalSyntheticLambda0;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.internal.CameraPipeLifetime;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class CameraBackendsImpl {
    public final Map cameraBackends;

    /* renamed from: default, reason: not valid java name */
    public final Camera2Backend f1default;
    public final Object lock = new Object();
    public final LinkedHashMap activeCameraBackends = new LinkedHashMap();

    public CameraBackendsImpl(String str, Map map, Context context, Threads threads, CameraPipeLifetime cameraPipeLifetime) {
        this.cameraBackends = map;
        cameraPipeLifetime.addShutdownAction(CameraPipeLifetime.ShutdownType.CAMERA, new Preview$$ExternalSyntheticLambda0(this, 7));
        Camera2Backend m91getSG3A4s8 = m91getSG3A4s8(str);
        if (m91getSG3A4s8 != null) {
            this.f1default = m91getSG3A4s8;
            return;
        }
        StringBuilder sb = new StringBuilder("Failed to load the default backend for ");
        sb.append((Object) CameraBackendId.m41toStringimpl(str));
        ZslControlImpl$$ExternalSyntheticLambda1.m(sb, "! Available backends are ", map.keySet());
        throw null;
    }

    /* renamed from: get-SG3A4s8, reason: not valid java name */
    public final Camera2Backend m91getSG3A4s8(String str) {
        str.getClass();
        synchronized (this.lock) {
            try {
                Camera2Backend camera2Backend = (Camera2Backend) this.activeCameraBackends.get(new CameraBackendId(str));
                if (camera2Backend != null) {
                    return camera2Backend;
                }
                CameraPipeModule$Companion$$ExternalSyntheticLambda0 cameraPipeModule$Companion$$ExternalSyntheticLambda0 = (CameraPipeModule$Companion$$ExternalSyntheticLambda0) this.cameraBackends.get(new CameraBackendId(str));
                Camera2Backend camera2Backend2 = cameraPipeModule$Companion$$ExternalSyntheticLambda0 != null ? cameraPipeModule$Companion$$ExternalSyntheticLambda0.f$0 : null;
                if (camera2Backend2 != null) {
                    if (!str.equals("CXCP-Camera2")) {
                        throw new IllegalStateException(("Unexpected backend id! Expected " + ((Object) CameraBackendId.m41toStringimpl(str)) + " but it was actually " + ((Object) CameraBackendId.m41toStringimpl("CXCP-Camera2"))).toString());
                    }
                    this.activeCameraBackends.put(new CameraBackendId(str), camera2Backend2);
                }
                return camera2Backend2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
