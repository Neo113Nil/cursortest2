package com.connectsdk.service.webos.lgcast.remotecamera.capture;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.ColorSpaceTransform;
import android.hardware.camera2.params.RggbChannelVector;
import android.view.Surface;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraUtility;

/* loaded from: classes.dex */
public class CameraCaptureBulder {
    private CameraCharacteristics mCameraCharacteristics;
    private CaptureRequest.Builder mCameraRequestBuilder;

    public CameraCaptureBulder(Context context, CameraDevice cameraDevice, String str) throws Exception {
        this.mCameraCharacteristics = CameraUtility.getCameraCharacteristics(context, str);
        CaptureRequest.Builder createCaptureRequest = cameraDevice != null ? cameraDevice.createCaptureRequest(1) : null;
        this.mCameraRequestBuilder = createCaptureRequest;
        if (this.mCameraCharacteristics == null || createCaptureRequest == null) {
            throw new Exception("Invalid arguments");
        }
        createCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, 4);
        this.mCameraRequestBuilder.set(CaptureRequest.CONTROL_MODE, 1);
    }

    public void addTarget(Surface surface) {
        if (surface != null) {
            this.mCameraRequestBuilder.addTarget(surface);
        }
    }

    public CaptureRequest build() {
        return this.mCameraRequestBuilder.build();
    }

    public boolean setAutoWhiteBalance(boolean z) {
        this.mCameraRequestBuilder.set(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(z ? 1 : 0));
        return true;
    }

    public boolean setBrightness(int i) {
        int calculateBrightness = CameraUtility.calculateBrightness(this.mCameraCharacteristics, i);
        if (calculateBrightness == -1) {
            return false;
        }
        this.mCameraRequestBuilder.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(calculateBrightness));
        return true;
    }

    public boolean setWhiteBalance(int i) {
        RggbChannelVector calculateWhiteBalance = CameraUtility.calculateWhiteBalance(i);
        if (calculateWhiteBalance == null) {
            return false;
        }
        this.mCameraRequestBuilder.set(CaptureRequest.CONTROL_AWB_MODE, 0);
        this.mCameraRequestBuilder.set(CaptureRequest.COLOR_CORRECTION_MODE, 0);
        this.mCameraRequestBuilder.set(CaptureRequest.COLOR_CORRECTION_TRANSFORM, new ColorSpaceTransform(new int[]{1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1}));
        this.mCameraRequestBuilder.set(CaptureRequest.COLOR_CORRECTION_GAINS, calculateWhiteBalance);
        return true;
    }
}
