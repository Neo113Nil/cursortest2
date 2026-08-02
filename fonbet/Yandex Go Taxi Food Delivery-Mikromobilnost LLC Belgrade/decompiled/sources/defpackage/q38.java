package defpackage;

import android.hardware.camera2.CameraCaptureSession;

/* loaded from: classes10.dex */
public final class q38 extends uo7 {
    public final CameraCaptureSession.CaptureCallback a;

    public q38(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback != null) {
            this.a = captureCallback;
        } else {
            ny61.t("captureCallback is null");
            throw null;
        }
    }
}
