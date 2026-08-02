package androidx.camera.camera2.pipe;

import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.pipe.core.DurationNs;
import androidx.camera.video.Recorder;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class CameraPipe$CameraInteropConfig {
    public final Recorder.AnonymousClass4 cameraCaptureSessionListener;
    public final CameraDevice.StateCallback cameraDeviceStateCallback;
    public final DurationNs cameraOpenRetryMaxTimeoutNs;

    public CameraPipe$CameraInteropConfig(CameraDevice.StateCallback stateCallback, Recorder.AnonymousClass4 anonymousClass4, DurationNs durationNs) {
        this.cameraDeviceStateCallback = stateCallback;
        this.cameraCaptureSessionListener = anonymousClass4;
        this.cameraOpenRetryMaxTimeoutNs = durationNs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPipe$CameraInteropConfig)) {
            return false;
        }
        CameraPipe$CameraInteropConfig cameraPipe$CameraInteropConfig = (CameraPipe$CameraInteropConfig) obj;
        return Intrinsics.areEqual(this.cameraDeviceStateCallback, cameraPipe$CameraInteropConfig.cameraDeviceStateCallback) && Intrinsics.areEqual(this.cameraCaptureSessionListener, cameraPipe$CameraInteropConfig.cameraCaptureSessionListener) && Intrinsics.areEqual(this.cameraOpenRetryMaxTimeoutNs, cameraPipe$CameraInteropConfig.cameraOpenRetryMaxTimeoutNs);
    }

    public final int hashCode() {
        CameraDevice.StateCallback stateCallback = this.cameraDeviceStateCallback;
        int hashCode = (stateCallback == null ? 0 : stateCallback.hashCode()) * 31;
        Recorder.AnonymousClass4 anonymousClass4 = this.cameraCaptureSessionListener;
        int hashCode2 = (hashCode + (anonymousClass4 == null ? 0 : anonymousClass4.hashCode())) * 31;
        DurationNs durationNs = this.cameraOpenRetryMaxTimeoutNs;
        return hashCode2 + (durationNs != null ? Long.hashCode(durationNs.value) : 0);
    }

    public final String toString() {
        return "CameraInteropConfig(cameraDeviceStateCallback=" + this.cameraDeviceStateCallback + ", cameraCaptureSessionListener=" + this.cameraCaptureSessionListener + ", cameraOpenRetryMaxTimeoutNs=" + this.cameraOpenRetryMaxTimeoutNs + ')';
    }
}
