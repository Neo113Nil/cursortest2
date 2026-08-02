package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import androidx.camera.camera2.pipe.UnsafeWrapper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public interface CameraCaptureSessionWrapper extends UnsafeWrapper, AutoCloseable {
    boolean abortCaptures();

    Integer capture(CaptureRequest captureRequest, Camera2CaptureSequence camera2CaptureSequence);

    Integer captureBurst(ArrayList arrayList, Camera2CaptureSequence camera2CaptureSequence);

    boolean finalizeOutputConfigurations(List list);

    CameraDeviceWrapper getDevice();

    Surface getInputSurface();

    Integer setRepeatingBurst(ArrayList arrayList, Camera2CaptureSequence camera2CaptureSequence);

    Integer setRepeatingRequest(CaptureRequest captureRequest, Camera2CaptureSequence camera2CaptureSequence);

    boolean stopRepeating();
}
