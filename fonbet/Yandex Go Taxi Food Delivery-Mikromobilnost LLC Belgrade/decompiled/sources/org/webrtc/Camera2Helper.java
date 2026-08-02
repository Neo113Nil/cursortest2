package org.webrtc;

import android.hardware.camera2.CameraManager;
import java.util.ArrayList;
import java.util.List;
import org.webrtc.CameraEnumerationAndroid;

/* loaded from: classes4.dex */
public class Camera2Helper {
    public static Size findClosestCaptureFormat(CameraManager cameraManager, String str, int i, int i2) {
        List<CameraEnumerationAndroid.CaptureFormat> supportedFormats = getSupportedFormats(cameraManager, str);
        ArrayList arrayList = new ArrayList();
        if (supportedFormats != null) {
            for (CameraEnumerationAndroid.CaptureFormat captureFormat : supportedFormats) {
                arrayList.add(new Size(captureFormat.width, captureFormat.height));
            }
        }
        return CameraEnumerationAndroid.getClosestSupportedSize(arrayList, i, i2);
    }

    public static List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(CameraManager cameraManager, String str) {
        return Camera2Enumerator.getSupportedFormats(cameraManager, str);
    }
}
