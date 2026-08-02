package androidx.camera.featurecombinationquery;

import android.content.Context;
import android.hardware.camera2.CameraManager;

/* loaded from: classes3.dex */
public final class Camera2CameraDeviceSetupCompatProvider {
    public final CameraManager mCameraManager;

    public Camera2CameraDeviceSetupCompatProvider(Context context) {
        this.mCameraManager = (CameraManager) context.getSystemService(CameraManager.class);
    }
}
