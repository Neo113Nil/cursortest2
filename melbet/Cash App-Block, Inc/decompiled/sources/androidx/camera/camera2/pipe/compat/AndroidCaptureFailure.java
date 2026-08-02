package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CaptureFailure;
import androidx.camera.camera2.pipe.RequestFailure;
import androidx.camera.camera2.pipe.RequestMetadata;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* loaded from: classes3.dex */
public final class AndroidCaptureFailure implements RequestFailure {
    public final CaptureFailure captureFailure;
    public final int reason;
    public final boolean wasImageCaptured;

    public AndroidCaptureFailure(RequestMetadata requestMetadata, CaptureFailure captureFailure) {
        requestMetadata.getClass();
        captureFailure.getClass();
        this.captureFailure = captureFailure;
        captureFailure.getFrameNumber();
        this.reason = captureFailure.getReason();
        this.wasImageCaptured = captureFailure.wasImageCaptured();
    }

    @Override // androidx.camera.camera2.pipe.RequestFailure
    public final int getReason() {
        return this.reason;
    }

    @Override // androidx.camera.camera2.pipe.RequestFailure
    public final boolean getWasImageCaptured() {
        return this.wasImageCaptured;
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public final Object unwrapAs(KClass kClass) {
        kClass.getClass();
        if (kClass.equals(Reflection.factory.getOrCreateKotlinClass(CaptureFailure.class))) {
            return this.captureFailure;
        }
        return null;
    }
}
