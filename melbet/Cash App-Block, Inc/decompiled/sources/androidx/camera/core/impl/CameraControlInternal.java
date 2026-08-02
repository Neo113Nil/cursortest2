package androidx.camera.core.impl;

import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.imagecapture.CameraCapturePipeline;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.impl.utils.futures.ImmediateFuture$ImmediateFailedFuture;
import androidx.transition.Transition;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes3.dex */
public interface CameraControlInternal {
    public static final AnonymousClass2 DEFAULT_EMPTY_INSTANCE = new AnonymousClass2();

    /* renamed from: androidx.camera.core.impl.CameraControlInternal$1, reason: invalid class name */
    public final class AnonymousClass1 implements CameraCapturePipeline {
        @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
        public final ListenableFuture invokePostCapture() {
            return ImmediateFuture$ImmediateFailedFuture.NULL_FUTURE;
        }

        @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
        public final ListenableFuture invokePreCapture() {
            return ImmediateFuture$ImmediateFailedFuture.NULL_FUTURE;
        }
    }

    /* renamed from: androidx.camera.core.impl.CameraControlInternal$2, reason: invalid class name */
    public final class AnonymousClass2 implements CameraControlInternal {
        @Override // androidx.camera.core.impl.CameraControlInternal
        public final void addInteropConfig(Config config) {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public final void addZslConfig(SessionConfig.Builder builder) {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public final void clearInteropConfig() {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public final void clearZslConfig() {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public final ListenableFuture enableTorch(boolean z) {
            return ImmediateFuture$ImmediateFailedFuture.NULL_FUTURE;
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public final Config getInteropConfig() {
            return null;
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public final void setFlashMode(int i) {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public final ListenableFuture setZoomRatio(float f) {
            return ImmediateFuture$ImmediateFailedFuture.NULL_FUTURE;
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public final ListenableFuture startFocusAndMetering(FocusMeteringAction focusMeteringAction) {
            return Futures.immediateFuture(new Transition.AnonymousClass1());
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public final ListenableFuture submitStillCaptureRequests(ArrayList arrayList, int i, int i2) {
            return Futures.immediateFuture(Collections.EMPTY_LIST);
        }
    }

    public final class CameraControlException extends Exception {
    }

    void addInteropConfig(Config config);

    void addZslConfig(SessionConfig.Builder builder);

    void clearInteropConfig();

    void clearZslConfig();

    default void decrementVideoUsage() {
    }

    ListenableFuture enableTorch(boolean z);

    default ListenableFuture getCameraCapturePipelineAsync(int i) {
        return Futures.immediateFuture(new AnonymousClass1());
    }

    Config getInteropConfig();

    default void incrementVideoUsage() {
    }

    void setFlashMode(int i);

    default void setScreenFlash(ImageCapture.ScreenFlash screenFlash) {
    }

    ListenableFuture setZoomRatio(float f);

    ListenableFuture startFocusAndMetering(FocusMeteringAction focusMeteringAction);

    ListenableFuture submitStillCaptureRequests(ArrayList arrayList, int i, int i2);
}
