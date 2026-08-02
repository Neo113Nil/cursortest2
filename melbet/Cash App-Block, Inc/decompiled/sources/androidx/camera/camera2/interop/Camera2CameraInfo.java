package androidx.camera.camera2.interop;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.impl.CameraPipeCameraProperties;
import androidx.camera.core.CameraInfo;
import androidx.core.view.WindowCompat$Api35Impl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaad;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes3.dex */
public final class Camera2CameraInfo {
    public final /* synthetic */ String cameraId;
    public final CameraPipeCameraProperties cameraProperties;

    public Camera2CameraInfo(CameraPipeCameraProperties cameraPipeCameraProperties) {
        this.cameraProperties = cameraPipeCameraProperties;
        this.cameraId = cameraPipeCameraProperties.cameraConfig.b;
    }

    public static final Camera2CameraInfo from(CameraInfo cameraInfo) {
        cameraInfo.getClass();
        Camera2CameraInfo camera2CameraInfo = (Camera2CameraInfo) zzaad.unwrapAs(cameraInfo, Reflection.factory.getOrCreateKotlinClass(Camera2CameraInfo.class));
        if (camera2CameraInfo != null) {
            return camera2CameraInfo;
        }
        a$$ExternalSyntheticBUOutline0.m("Could not unwrap ", cameraInfo, " as Camera2CameraInfo!");
        return null;
    }

    public final Object getCameraCharacteristic(CameraCharacteristics.Key key) {
        key.getClass();
        return WindowCompat$Api35Impl.getSafely(this.cameraProperties.metadata, key);
    }
}
