package com.miteksystems.misnap.camera.requirements;

import androidx.camera.camera2.interop.Camera2CameraInfo;
import com.miteksystems.misnap.core.MiSnapCameraInfo;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public interface CameraSelectorFilter {
    ArrayList filterCameras(ArrayList arrayList);

    MiSnapCameraInfo getCameraInfo(Camera2CameraInfo camera2CameraInfo);
}
