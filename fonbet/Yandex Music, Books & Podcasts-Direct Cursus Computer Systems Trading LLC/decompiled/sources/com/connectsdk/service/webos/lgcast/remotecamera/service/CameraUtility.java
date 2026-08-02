package com.connectsdk.service.webos.lgcast.remotecamera.service;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.RggbChannelVector;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Size;
import com.connectsdk.service.webos.lgcast.common.utils.Logger;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class CameraUtility {
    public static int calculateBrightness(CameraCharacteristics cameraCharacteristics, int i) {
        if (cameraCharacteristics == null || i < 0 || i > 100) {
            return -1;
        }
        return (int) (((i / 100.0f) * (((Integer) r2.getUpper()).intValue() - r0)) + ((Integer) ((Range) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)).getLower()).intValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
    
        if (r1 > 255.0f) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        r1 = 255.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
    
        if (r10 < 66.0f) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0077, code lost:
    
        r3 = 255.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a0, code lost:
    
        r1 = r1 / 255.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ac, code lost:
    
        return new android.hardware.camera2.params.RggbChannelVector((r5 / 255.0f) * 2.0f, r1, r1, (r3 / 255.0f) * 2.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
    
        if (r10 > 19.0f) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
    
        r10 = (float) ((java.lang.Math.log(r10 - 10.0f) * 138.5177312231d) - 305.0447927307d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0097, code lost:
    
        if (r10 >= 0.0f) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009a, code lost:
    
        r3 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
    
        if (r3 <= 255.0f) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0070, code lost:
    
        if (r1 > 255.0f) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0034, code lost:
    
        if (r5 > 255.0f) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static RggbChannelVector calculateWhiteBalance(int i) {
        float pow;
        float pow2;
        if (i < 2300 || i > 10000) {
            return null;
        }
        float f = i / 100;
        float f2 = 0.0f;
        if (f > 66.0f) {
            pow = (float) (Math.pow(f - 60.0f, -0.1332047592d) * 329.698727446d);
            if (pow < 0.0f) {
                pow = 0.0f;
            }
        }
        pow = 255.0f;
        if (f <= 66.0f) {
            pow2 = (float) ((Math.log(f) * 99.4708025861d) - 161.1195681661d);
            if (pow2 < 0.0f) {
                pow2 = 0.0f;
            }
        } else {
            pow2 = (float) (Math.pow(f - 60.0f, -0.0755148492d) * 288.1221695283d);
            if (pow2 < 0.0f) {
                pow2 = 0.0f;
            }
        }
    }

    public static String findCameraId(Context context, int i) {
        CameraManager cameraManager;
        if (context != null) {
            try {
                cameraManager = (CameraManager) context.getSystemService("camera");
            } catch (Exception e) {
                Logger.error(e);
                return null;
            }
        } else {
            cameraManager = null;
        }
        if (cameraManager == null) {
            throw new Exception("Invalid argument");
        }
        for (String str : cameraManager.getCameraIdList()) {
            if (((Integer) cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING)).intValue() == i) {
                return str;
            }
        }
        throw new Exception("Not found camera: " + i);
    }

    public static CameraCharacteristics getCameraCharacteristics(Context context, String str) {
        CameraManager cameraManager;
        if (context != null) {
            try {
                cameraManager = (CameraManager) context.getSystemService("camera");
            } catch (Exception e) {
                Logger.error(e);
                return null;
            }
        } else {
            cameraManager = null;
        }
        if (cameraManager == null || str == null) {
            throw new Exception("Invalid arguments");
        }
        return cameraManager.getCameraCharacteristics(str);
    }

    public static List<Size> getSupportedPreviewSizes(Context context) {
        String findCameraId = findCameraId(context, 0);
        CameraCharacteristics cameraCharacteristics = findCameraId != null ? getCameraCharacteristics(context, findCameraId) : null;
        StreamConfigurationMap streamConfigurationMap = cameraCharacteristics != null ? (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP) : null;
        return streamConfigurationMap != null ? Arrays.asList(streamConfigurationMap.getOutputSizes(35)) : Arrays.asList(new Size[0]);
    }
}
