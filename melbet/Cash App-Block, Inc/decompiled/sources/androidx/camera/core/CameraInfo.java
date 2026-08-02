package androidx.camera.core;

import androidx.lifecycle.LiveData;

/* loaded from: classes3.dex */
public interface CameraInfo {
    CameraSelector getCameraSelector();

    LiveData getCameraState();

    String getImplementationType();

    int getLensFacing();

    int getSensorRotationDegrees();

    int getSensorRotationDegrees(int i);

    LiveData getTorchState();

    LiveData getZoomState();

    boolean hasFlashUnit();
}
