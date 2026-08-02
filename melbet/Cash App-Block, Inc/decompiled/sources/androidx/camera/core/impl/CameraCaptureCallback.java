package androidx.camera.core.impl;

import com.android.volley.toolbox.HurlStack;

/* loaded from: classes3.dex */
public abstract class CameraCaptureCallback {
    public void onCaptureCancelled(int i) {
    }

    public void onCaptureCompleted(int i, CameraCaptureResult cameraCaptureResult) {
    }

    public void onCaptureFailed(int i, HurlStack hurlStack) {
    }

    public void onCaptureProcessProgressed(int i, int i2) {
    }

    public void onCaptureStarted(int i) {
    }
}
