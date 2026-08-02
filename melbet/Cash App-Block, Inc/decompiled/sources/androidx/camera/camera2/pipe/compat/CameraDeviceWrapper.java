package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import androidx.camera.camera2.pipe.UnsafeWrapper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public interface CameraDeviceWrapper extends UnsafeWrapper {
    /* renamed from: createCaptureRequest-2PPcXtw */
    CaptureRequest.Builder mo58createCaptureRequest2PPcXtw(int i);

    boolean createCaptureSession(SessionConfigData sessionConfigData);

    boolean createCaptureSession(List list, CaptureSessionState captureSessionState);

    boolean createCaptureSessionByOutputConfigurations(ArrayList arrayList, CaptureSessionState captureSessionState);

    boolean createConstrainedHighSpeedCaptureSession(ArrayList arrayList, CaptureSessionState captureSessionState);

    boolean createExtensionSession(ExtensionSessionConfigData extensionSessionConfigData);

    CaptureRequest.Builder createReprocessCaptureRequest(TotalCaptureResult totalCaptureResult);

    boolean createReprocessableCaptureSession(InputConfiguration inputConfiguration, ArrayList arrayList, CaptureSessionState captureSessionState);

    boolean createReprocessableCaptureSessionByConfigurations(InputConfigData inputConfigData, ArrayList arrayList, CaptureSessionState captureSessionState);

    /* renamed from: getCameraId-Dz_R5H8 */
    String mo59getCameraIdDz_R5H8();

    /* renamed from: onCameraAudioRestrictionUpdated-LwUUkyU */
    void mo60onCameraAudioRestrictionUpdatedLwUUkyU(int i);

    void onDeviceClosed();

    void onDeviceClosing();
}
