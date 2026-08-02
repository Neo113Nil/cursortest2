package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CameraExtensionSession$StateCallback;
import androidx.camera.video.Recorder;
import com.fillr.browsersdk.model.WebviewProxy;
import kotlinx.atomicfu.AtomicFU;
import kotlinx.atomicfu.AtomicRef;

/* loaded from: classes3.dex */
public final class AndroidExtensionSessionStateCallback extends CameraExtensionSession$StateCallback {
    public final AtomicRef _lastStateCallback;
    public final WebviewProxy.AnonymousClass1 callbackExecutor;
    public final Camera2ErrorProcessor cameraErrorListener;
    public final AndroidCameraDevice device;
    public final AtomicRef extensionSession;
    public final Recorder.AnonymousClass4 interopCaptureSessionListener;
    public final ExtensionSessionState stateCallback;

    public AndroidExtensionSessionStateCallback(AndroidCameraDevice androidCameraDevice, ExtensionSessionState extensionSessionState, SessionStateCallback sessionStateCallback, Camera2ErrorProcessor camera2ErrorProcessor, Recorder.AnonymousClass4 anonymousClass4, WebviewProxy.AnonymousClass1 anonymousClass1) {
        camera2ErrorProcessor.getClass();
        this.device = androidCameraDevice;
        this.stateCallback = extensionSessionState;
        this.cameraErrorListener = camera2ErrorProcessor;
        this.interopCaptureSessionListener = anonymousClass4;
        this.callbackExecutor = anonymousClass1;
        this._lastStateCallback = AtomicFU.atomic(sessionStateCallback);
        this.extensionSession = AtomicFU.atomic((Object) null);
    }

    public final CameraExtensionSessionWrapper getWrapped(CameraExtensionSession cameraExtensionSession, Camera2ErrorProcessor camera2ErrorProcessor) {
        CameraExtensionSessionWrapper cameraExtensionSessionWrapper = (CameraExtensionSessionWrapper) this.extensionSession.value;
        if (cameraExtensionSessionWrapper != null) {
            return cameraExtensionSessionWrapper;
        }
        AndroidCameraExtensionSession androidCameraExtensionSession = new AndroidCameraExtensionSession(this.device, cameraExtensionSession, camera2ErrorProcessor, this.callbackExecutor);
        if (this.extensionSession.compareAndSet(null, androidCameraExtensionSession)) {
            return androidCameraExtensionSession;
        }
        Object obj = this.extensionSession.value;
        obj.getClass();
        return (CameraExtensionSessionWrapper) obj;
    }

    public final void onClosed(CameraExtensionSession cameraExtensionSession) {
        cameraExtensionSession.getClass();
        Camera2ErrorProcessor camera2ErrorProcessor = this.cameraErrorListener;
        getWrapped(cameraExtensionSession, camera2ErrorProcessor);
        CameraExtensionSessionWrapper wrapped = getWrapped(cameraExtensionSession, camera2ErrorProcessor);
        ExtensionSessionState extensionSessionState = this.stateCallback;
        extensionSessionState.getClass();
        extensionSessionState.captureSessionState.onClosed(wrapped);
        AtomicRef atomicRef = this._lastStateCallback;
        atomicRef.getClass();
        SessionStateCallback sessionStateCallback = (SessionStateCallback) AtomicRef.FU.getAndSet(atomicRef, null);
        if (sessionStateCallback != null) {
            sessionStateCallback.onSessionFinalized();
        }
        extensionSessionState.onSessionFinalized();
        Recorder.AnonymousClass4 anonymousClass4 = this.interopCaptureSessionListener;
        if (anonymousClass4 != null) {
            anonymousClass4.m114onClosedrphkYDA(this.device.cameraId);
        }
    }

    public final void onConfigureFailed(CameraExtensionSession cameraExtensionSession) {
        cameraExtensionSession.getClass();
        CameraExtensionSessionWrapper wrapped = getWrapped(cameraExtensionSession, this.cameraErrorListener);
        ExtensionSessionState extensionSessionState = this.stateCallback;
        extensionSessionState.getClass();
        extensionSessionState.captureSessionState.onConfigureFailed(wrapped);
        AtomicRef atomicRef = this._lastStateCallback;
        atomicRef.getClass();
        SessionStateCallback sessionStateCallback = (SessionStateCallback) AtomicRef.FU.getAndSet(atomicRef, null);
        if (sessionStateCallback != null) {
            sessionStateCallback.onSessionFinalized();
        }
        extensionSessionState.onSessionFinalized();
        Recorder.AnonymousClass4 anonymousClass4 = this.interopCaptureSessionListener;
        if (anonymousClass4 != null) {
            anonymousClass4.m115onConfigureFailedrphkYDA(this.device.cameraId);
        }
    }

    public final void onConfigured(CameraExtensionSession cameraExtensionSession) {
        cameraExtensionSession.getClass();
        CameraExtensionSessionWrapper wrapped = getWrapped(cameraExtensionSession, this.cameraErrorListener);
        ExtensionSessionState extensionSessionState = this.stateCallback;
        extensionSessionState.getClass();
        extensionSessionState.captureSessionState.onConfigured(wrapped);
        AtomicRef atomicRef = this._lastStateCallback;
        atomicRef.getClass();
        SessionStateCallback sessionStateCallback = (SessionStateCallback) AtomicRef.FU.getAndSet(atomicRef, null);
        if (sessionStateCallback != null) {
            sessionStateCallback.onSessionFinalized();
        }
        Recorder.AnonymousClass4 anonymousClass4 = this.interopCaptureSessionListener;
        if (anonymousClass4 != null) {
            anonymousClass4.m116onConfiguredrphkYDA(this.device.cameraId);
        }
    }
}
