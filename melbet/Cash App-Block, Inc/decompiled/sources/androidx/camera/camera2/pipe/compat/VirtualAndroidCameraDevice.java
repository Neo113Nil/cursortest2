package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.KClass;

/* loaded from: classes3.dex */
public final class VirtualAndroidCameraDevice implements CameraDeviceWrapper {
    public final AndroidCameraDevice androidCameraDevice;
    public boolean disconnected;
    public final Object lock = new Object();

    public VirtualAndroidCameraDevice(AndroidCameraDevice androidCameraDevice) {
        this.androidCameraDevice = androidCameraDevice;
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    /* renamed from: createCaptureRequest-2PPcXtw */
    public final CaptureRequest.Builder mo58createCaptureRequest2PPcXtw(int i) {
        CaptureRequest.Builder mo58createCaptureRequest2PPcXtw;
        synchronized (this.lock) {
            try {
                if (this.disconnected) {
                    Log.w("CXCP", "createCaptureRequest failed: Virtual device disconnected");
                    mo58createCaptureRequest2PPcXtw = null;
                } else {
                    mo58createCaptureRequest2PPcXtw = this.androidCameraDevice.mo58createCaptureRequest2PPcXtw(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mo58createCaptureRequest2PPcXtw;
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    public final boolean createCaptureSession(List list, CaptureSessionState captureSessionState) {
        boolean createCaptureSession;
        list.getClass();
        captureSessionState.getClass();
        synchronized (this.lock) {
            try {
                if (this.disconnected) {
                    Log.w("CXCP", "createCaptureSession failed: Virtual device disconnected");
                    captureSessionState.onSessionFinalized();
                    createCaptureSession = false;
                } else {
                    createCaptureSession = this.androidCameraDevice.createCaptureSession(list, captureSessionState);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return createCaptureSession;
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    public final boolean createCaptureSessionByOutputConfigurations(ArrayList arrayList, CaptureSessionState captureSessionState) {
        boolean createCaptureSessionByOutputConfigurations;
        captureSessionState.getClass();
        synchronized (this.lock) {
            try {
                if (this.disconnected) {
                    Log.w("CXCP", "createCaptureSessionByOutputConfigurations failed: Virtual device disconnected");
                    captureSessionState.onSessionFinalized();
                    createCaptureSessionByOutputConfigurations = false;
                } else {
                    createCaptureSessionByOutputConfigurations = this.androidCameraDevice.createCaptureSessionByOutputConfigurations(arrayList, captureSessionState);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return createCaptureSessionByOutputConfigurations;
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    public final boolean createConstrainedHighSpeedCaptureSession(ArrayList arrayList, CaptureSessionState captureSessionState) {
        boolean createConstrainedHighSpeedCaptureSession;
        captureSessionState.getClass();
        synchronized (this.lock) {
            try {
                if (this.disconnected) {
                    Log.w("CXCP", "createConstrainedHighSpeedCaptureSession failed: Virtual device disconnected");
                    captureSessionState.onSessionFinalized();
                    createConstrainedHighSpeedCaptureSession = false;
                } else {
                    createConstrainedHighSpeedCaptureSession = this.androidCameraDevice.createConstrainedHighSpeedCaptureSession(arrayList, captureSessionState);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return createConstrainedHighSpeedCaptureSession;
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    public final boolean createExtensionSession(ExtensionSessionConfigData extensionSessionConfigData) {
        boolean createExtensionSession;
        synchronized (this.lock) {
            try {
                if (this.disconnected) {
                    Log.w("CXCP", "createExtensionSession failed: Virtual device disconnected");
                    extensionSessionConfigData.extensionStateCallback.onSessionFinalized();
                    createExtensionSession = false;
                } else {
                    createExtensionSession = this.androidCameraDevice.createExtensionSession(extensionSessionConfigData);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return createExtensionSession;
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    public final CaptureRequest.Builder createReprocessCaptureRequest(TotalCaptureResult totalCaptureResult) {
        CaptureRequest.Builder createReprocessCaptureRequest;
        synchronized (this.lock) {
            try {
                if (this.disconnected) {
                    Log.w("CXCP", "createReprocessCaptureRequest failed: Virtual device disconnected");
                    createReprocessCaptureRequest = null;
                } else {
                    createReprocessCaptureRequest = this.androidCameraDevice.createReprocessCaptureRequest(totalCaptureResult);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return createReprocessCaptureRequest;
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    public final boolean createReprocessableCaptureSession(InputConfiguration inputConfiguration, ArrayList arrayList, CaptureSessionState captureSessionState) {
        boolean createReprocessableCaptureSession;
        captureSessionState.getClass();
        synchronized (this.lock) {
            try {
                if (this.disconnected) {
                    Log.w("CXCP", "createReprocessableCaptureSession failed: Virtual device disconnected");
                    captureSessionState.onSessionFinalized();
                    createReprocessableCaptureSession = false;
                } else {
                    createReprocessableCaptureSession = this.androidCameraDevice.createReprocessableCaptureSession(inputConfiguration, arrayList, captureSessionState);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return createReprocessableCaptureSession;
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    public final boolean createReprocessableCaptureSessionByConfigurations(InputConfigData inputConfigData, ArrayList arrayList, CaptureSessionState captureSessionState) {
        boolean createReprocessableCaptureSessionByConfigurations;
        captureSessionState.getClass();
        synchronized (this.lock) {
            try {
                if (this.disconnected) {
                    Log.w("CXCP", "createReprocessableCaptureSessionByConfigurations failed: Virtual device disconnected");
                    captureSessionState.onSessionFinalized();
                    createReprocessableCaptureSessionByConfigurations = false;
                } else {
                    createReprocessableCaptureSessionByConfigurations = this.androidCameraDevice.createReprocessableCaptureSessionByConfigurations(inputConfigData, arrayList, captureSessionState);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return createReprocessableCaptureSessionByConfigurations;
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    /* renamed from: getCameraId-Dz_R5H8 */
    public final String mo59getCameraIdDz_R5H8() {
        return this.androidCameraDevice.cameraId;
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    /* renamed from: onCameraAudioRestrictionUpdated-LwUUkyU */
    public final void mo60onCameraAudioRestrictionUpdatedLwUUkyU(int i) {
        this.androidCameraDevice.mo60onCameraAudioRestrictionUpdatedLwUUkyU(i);
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    public final void onDeviceClosed() {
        this.androidCameraDevice.onDeviceClosed();
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    public final void onDeviceClosing() {
        this.androidCameraDevice.onDeviceClosing();
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public final Object unwrapAs(KClass kClass) {
        kClass.getClass();
        return this.androidCameraDevice.unwrapAs(kClass);
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    public final boolean createCaptureSession(SessionConfigData sessionConfigData) {
        boolean createCaptureSession;
        synchronized (this.lock) {
            try {
                if (this.disconnected) {
                    Log.w("CXCP", "createCaptureSession failed: Virtual device disconnected");
                    sessionConfigData.stateCallback.onSessionFinalized();
                    createCaptureSession = false;
                } else {
                    createCaptureSession = this.androidCameraDevice.createCaptureSession(sessionConfigData);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return createCaptureSession;
    }
}
