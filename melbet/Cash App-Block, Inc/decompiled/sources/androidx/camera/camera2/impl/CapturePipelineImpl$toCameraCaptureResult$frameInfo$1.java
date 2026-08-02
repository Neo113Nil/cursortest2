package androidx.camera.camera2.impl;

import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.compat.AndroidFrameMetadata;
import kotlin.reflect.KClass;

/* loaded from: classes3.dex */
public final class CapturePipelineImpl$toCameraCaptureResult$frameInfo$1 implements FrameInfo {
    public final AndroidFrameMetadata metadata;

    public CapturePipelineImpl$toCameraCaptureResult$frameInfo$1(AndroidFrameMetadata androidFrameMetadata, CapturePipelineImpl capturePipelineImpl) {
        this.metadata = androidFrameMetadata;
        androidFrameMetadata.getClass();
        androidFrameMetadata.captureResult.getFrameNumber();
    }

    @Override // androidx.camera.camera2.pipe.FrameInfo
    public final AndroidFrameMetadata getMetadata() {
        return this.metadata;
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public final Object unwrapAs(KClass kClass) {
        kClass.getClass();
        return null;
    }
}
