package androidx.camera.camera2.impl;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;

/* loaded from: classes3.dex */
public final class RejectOperationCameraCaptureSession extends CameraCaptureSession {
    public static String createExceptionMessage(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Current capture session is running on extensions mode which isn't allowed to invoke the ", str, " function!");
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final void abortCaptures() {
        throw new IllegalArgumentException(createExceptionMessage("abortCaptures"));
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final int capture(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        captureRequest.getClass();
        throw new IllegalArgumentException(createExceptionMessage("capture"));
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final int captureBurst(List list, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        list.getClass();
        throw new IllegalArgumentException(createExceptionMessage("captureBurst"));
    }

    @Override // android.hardware.camera2.CameraCaptureSession, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalArgumentException(createExceptionMessage("close"));
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final void finalizeOutputConfigurations(List list) {
        throw new IllegalArgumentException(createExceptionMessage("finalizeOutputConfigurations"));
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final CameraDevice getDevice() {
        throw new IllegalArgumentException(createExceptionMessage("getDevice"));
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final Surface getInputSurface() {
        throw new IllegalArgumentException(createExceptionMessage("getInputSurface"));
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final boolean isReprocessable() {
        throw new IllegalArgumentException(createExceptionMessage("isReprocessable"));
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final void prepare(Surface surface) {
        surface.getClass();
        throw new IllegalArgumentException(createExceptionMessage("prepare"));
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final int setRepeatingBurst(List list, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        list.getClass();
        throw new IllegalArgumentException(createExceptionMessage("setRepeatingBurst"));
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final int setRepeatingRequest(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        captureRequest.getClass();
        throw new IllegalArgumentException(createExceptionMessage("setRepeatingRequest"));
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final void stopRepeating() {
        throw new IllegalArgumentException(createExceptionMessage("stopRepeating"));
    }
}
