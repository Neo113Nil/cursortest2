package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.os.Handler;
import android.util.Log;
import androidx.camera.camera2.impl.RejectOperationCameraCaptureSession;
import androidx.camera.video.Recorder;
import java.util.Iterator;
import java.util.List;
import kotlinx.atomicfu.AtomicFU;
import kotlinx.atomicfu.AtomicRef;

/* loaded from: classes3.dex */
public final class AndroidCaptureSessionStateCallback extends CameraCaptureSession.StateCallback {
    public final AtomicRef _lastStateCallback;
    public final Handler callbackHandler;
    public final Camera2ErrorProcessor cameraErrorListener;
    public final AtomicRef captureSession;
    public final AndroidCameraDevice device;
    public final Recorder.AnonymousClass4 interopCaptureSessionListener;
    public final CaptureSessionState stateCallback;

    public AndroidCaptureSessionStateCallback(AndroidCameraDevice androidCameraDevice, CaptureSessionState captureSessionState, SessionStateCallback sessionStateCallback, Camera2ErrorProcessor camera2ErrorProcessor, Recorder.AnonymousClass4 anonymousClass4, Handler handler) {
        captureSessionState.getClass();
        camera2ErrorProcessor.getClass();
        handler.getClass();
        this.device = androidCameraDevice;
        this.stateCallback = captureSessionState;
        this.cameraErrorListener = camera2ErrorProcessor;
        this.interopCaptureSessionListener = anonymousClass4;
        this.callbackHandler = handler;
        this._lastStateCallback = AtomicFU.atomic(sessionStateCallback);
        this.captureSession = AtomicFU.atomic((Object) null);
    }

    public final CameraCaptureSessionWrapper getWrapped(CameraCaptureSession cameraCaptureSession, Camera2ErrorProcessor camera2ErrorProcessor) {
        CameraCaptureSessionWrapper cameraCaptureSessionWrapper = (CameraCaptureSessionWrapper) this.captureSession.value;
        if (cameraCaptureSessionWrapper != null) {
            return cameraCaptureSessionWrapper;
        }
        Handler handler = this.callbackHandler;
        boolean z = cameraCaptureSession instanceof CameraConstrainedHighSpeedCaptureSession;
        AndroidCameraDevice androidCameraDevice = this.device;
        CameraCaptureSessionWrapper androidCameraConstrainedHighSpeedCaptureSession = z ? new AndroidCameraConstrainedHighSpeedCaptureSession(androidCameraDevice, (CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession, camera2ErrorProcessor, handler) : new AndroidCameraCaptureSession(androidCameraDevice, cameraCaptureSession, camera2ErrorProcessor, handler);
        if (this.captureSession.compareAndSet(null, androidCameraConstrainedHighSpeedCaptureSession)) {
            return androidCameraConstrainedHighSpeedCaptureSession;
        }
        Object obj = this.captureSession.value;
        obj.getClass();
        return (CameraCaptureSessionWrapper) obj;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        getWrapped(cameraCaptureSession, this.cameraErrorListener);
        CaptureSessionState captureSessionState = this.stateCallback;
        getWrapped(cameraCaptureSession, this.cameraErrorListener);
        captureSessionState.getClass();
        Log.d("CXCP", captureSessionState + " Active");
        Recorder.AnonymousClass4 anonymousClass4 = this.interopCaptureSessionListener;
        if (anonymousClass4 != null) {
            this.device.cameraId.getClass();
            Iterator it = ((List) ((AtomicRef) anonymousClass4.this$0).value).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onActive((RejectOperationCameraCaptureSession) anonymousClass4.val$audioErrorConsumer);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        getWrapped(cameraCaptureSession, this.cameraErrorListener);
        CaptureSessionState captureSessionState = this.stateCallback;
        getWrapped(cameraCaptureSession, this.cameraErrorListener);
        captureSessionState.getClass();
        Log.d("CXCP", captureSessionState + " CaptureQueueEmpty");
        Recorder.AnonymousClass4 anonymousClass4 = this.interopCaptureSessionListener;
        if (anonymousClass4 != null) {
            this.device.cameraId.getClass();
            RejectOperationCameraCaptureSession rejectOperationCameraCaptureSession = (RejectOperationCameraCaptureSession) anonymousClass4.val$audioErrorConsumer;
            AtomicRef atomicRef = (AtomicRef) anonymousClass4.this$0;
            rejectOperationCameraCaptureSession.getClass();
            atomicRef.getClass();
            Iterator it = ((List) atomicRef.value).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onCaptureQueueEmpty(rejectOperationCameraCaptureSession);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        Camera2ErrorProcessor camera2ErrorProcessor = this.cameraErrorListener;
        getWrapped(cameraCaptureSession, camera2ErrorProcessor);
        CameraCaptureSessionWrapper wrapped = getWrapped(cameraCaptureSession, camera2ErrorProcessor);
        CaptureSessionState captureSessionState = this.stateCallback;
        captureSessionState.onClosed(wrapped);
        AtomicRef atomicRef = this._lastStateCallback;
        atomicRef.getClass();
        SessionStateCallback sessionStateCallback = (SessionStateCallback) AtomicRef.FU.getAndSet(atomicRef, null);
        if (sessionStateCallback != null) {
            sessionStateCallback.onSessionFinalized();
        }
        captureSessionState.onSessionFinalized();
        Recorder.AnonymousClass4 anonymousClass4 = this.interopCaptureSessionListener;
        if (anonymousClass4 != null) {
            anonymousClass4.m114onClosedrphkYDA(this.device.cameraId);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        CameraCaptureSessionWrapper wrapped = getWrapped(cameraCaptureSession, this.cameraErrorListener);
        CaptureSessionState captureSessionState = this.stateCallback;
        captureSessionState.onConfigureFailed(wrapped);
        AtomicRef atomicRef = this._lastStateCallback;
        atomicRef.getClass();
        SessionStateCallback sessionStateCallback = (SessionStateCallback) AtomicRef.FU.getAndSet(atomicRef, null);
        if (sessionStateCallback != null) {
            sessionStateCallback.onSessionFinalized();
        }
        captureSessionState.onSessionFinalized();
        Recorder.AnonymousClass4 anonymousClass4 = this.interopCaptureSessionListener;
        if (anonymousClass4 != null) {
            anonymousClass4.m115onConfigureFailedrphkYDA(this.device.cameraId);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        this.stateCallback.onConfigured(getWrapped(cameraCaptureSession, this.cameraErrorListener));
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

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        getWrapped(cameraCaptureSession, this.cameraErrorListener);
        CaptureSessionState captureSessionState = this.stateCallback;
        getWrapped(cameraCaptureSession, this.cameraErrorListener);
        captureSessionState.getClass();
        Log.d("CXCP", captureSessionState + " Ready");
        Recorder.AnonymousClass4 anonymousClass4 = this.interopCaptureSessionListener;
        if (anonymousClass4 != null) {
            this.device.cameraId.getClass();
            Iterator it = ((List) ((AtomicRef) anonymousClass4.this$0).value).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onReady((RejectOperationCameraCaptureSession) anonymousClass4.val$audioErrorConsumer);
            }
        }
    }
}
