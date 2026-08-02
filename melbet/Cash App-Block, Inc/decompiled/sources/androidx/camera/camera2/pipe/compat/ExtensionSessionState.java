package androidx.camera.camera2.pipe.compat;

/* loaded from: classes3.dex */
public final class ExtensionSessionState implements SessionStateCallback {
    public final CaptureSessionState captureSessionState;

    public ExtensionSessionState(CaptureSessionState captureSessionState) {
        captureSessionState.getClass();
        this.captureSessionState = captureSessionState;
    }

    @Override // androidx.camera.camera2.pipe.compat.SessionStateCallback
    public final void onSessionDisconnected() {
        this.captureSessionState.onSessionDisconnected();
    }

    @Override // androidx.camera.camera2.pipe.compat.SessionStateCallback
    public final void onSessionFinalized() {
        this.captureSessionState.onSessionFinalized();
    }
}
