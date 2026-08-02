package defpackage;

import android.hardware.camera2.CaptureResult;
import androidx.camera.core.impl.CameraCaptureMetaData$AeState;
import androidx.camera.core.impl.CameraCaptureMetaData$AfState;
import androidx.camera.core.impl.CameraCaptureMetaData$AwbState;
import androidx.camera.core.impl.CameraCaptureMetaData$FlashState;

/* loaded from: classes10.dex */
public final class zo7 implements ap7 {
    @Override // defpackage.ap7
    public final q6x0 b() {
        return q6x0.b;
    }

    @Override // defpackage.ap7
    public final CameraCaptureMetaData$FlashState d() {
        return CameraCaptureMetaData$FlashState.UNKNOWN;
    }

    @Override // defpackage.ap7
    public final CameraCaptureMetaData$AfState f() {
        return CameraCaptureMetaData$AfState.UNKNOWN;
    }

    @Override // defpackage.ap7
    public final long getTimestamp() {
        return -1L;
    }

    @Override // defpackage.ap7
    public final CameraCaptureMetaData$AwbState i() {
        return CameraCaptureMetaData$AwbState.UNKNOWN;
    }

    @Override // defpackage.ap7
    public final CameraCaptureMetaData$AeState l() {
        return CameraCaptureMetaData$AeState.UNKNOWN;
    }

    @Override // defpackage.ap7
    public final CaptureResult m() {
        return null;
    }
}
