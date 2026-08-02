package androidx.camera.core.imagecapture;

import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes3.dex */
public interface CameraCapturePipeline {
    ListenableFuture invokePostCapture();

    ListenableFuture invokePreCapture();
}
