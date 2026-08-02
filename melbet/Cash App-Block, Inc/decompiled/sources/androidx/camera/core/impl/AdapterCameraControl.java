package androidx.camera.core.impl;

import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.impl.utils.futures.Futures$$ExternalSyntheticLambda0;
import androidx.camera.core.impl.utils.futures.ListFuture;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda1;
import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabp;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class AdapterCameraControl implements CameraControlInternal {
    public final /* synthetic */ int $r8$classId;
    public final Object mCameraControl;
    public final CameraControlInternal mCameraControlInternal;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdapterCameraControl(CameraControlInternal cameraControlInternal, StreamSharing$$ExternalSyntheticLambda1 streamSharing$$ExternalSyntheticLambda1) {
        this(cameraControlInternal, (byte) 0);
        this.$r8$classId = 1;
        this.mCameraControl = streamSharing$$ExternalSyntheticLambda1;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void addInteropConfig(Config config) {
        this.mCameraControlInternal.addInteropConfig(config);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void addZslConfig(SessionConfig.Builder builder) {
        this.mCameraControlInternal.addZslConfig(builder);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void clearInteropConfig() {
        this.mCameraControlInternal.clearInteropConfig();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void clearZslConfig() {
        this.mCameraControlInternal.clearZslConfig();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void decrementVideoUsage() {
        this.mCameraControlInternal.decrementVideoUsage();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public ListenableFuture enableTorch(boolean z) {
        switch (this.$r8$classId) {
            case 0:
                return ((CameraControlInternal) this.mCameraControl).enableTorch(z);
            default:
                return this.mCameraControlInternal.enableTorch(z);
        }
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final ListenableFuture getCameraCapturePipelineAsync(int i) {
        return this.mCameraControlInternal.getCameraCapturePipelineAsync(i);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final Config getInteropConfig() {
        return this.mCameraControlInternal.getInteropConfig();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void incrementVideoUsage() {
        this.mCameraControlInternal.incrementVideoUsage();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void setFlashMode(int i) {
        this.mCameraControlInternal.setFlashMode(i);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void setScreenFlash(ImageCapture.ScreenFlash screenFlash) {
        this.mCameraControlInternal.setScreenFlash(screenFlash);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public ListenableFuture setZoomRatio(float f) {
        switch (this.$r8$classId) {
            case 0:
                return ((CameraControlInternal) this.mCameraControl).setZoomRatio(f);
            default:
                return this.mCameraControlInternal.setZoomRatio(f);
        }
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public ListenableFuture startFocusAndMetering(FocusMeteringAction focusMeteringAction) {
        switch (this.$r8$classId) {
            case 0:
                return ((CameraControlInternal) this.mCameraControl).startFocusAndMetering(focusMeteringAction);
            default:
                return this.mCameraControlInternal.startFocusAndMetering(focusMeteringAction);
        }
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public ListenableFuture submitStillCaptureRequests(ArrayList arrayList, int i, int i2) {
        int i3 = this.$r8$classId;
        CameraControlInternal cameraControlInternal = this.mCameraControlInternal;
        switch (i3) {
            case 1:
                TransactorKt.checkArgument("Only support one capture config.", arrayList.size() == 1);
                ListenableFuture cameraCapturePipelineAsync = cameraControlInternal.getCameraCapturePipelineAsync(i);
                return new ListFuture(new ArrayList(Collections.singletonList(Futures.transformAsync(Futures.transformAsync(Futures.transformAsync(FutureChain.from(cameraCapturePipelineAsync), new Futures$$ExternalSyntheticLambda0(cameraCapturePipelineAsync, 1), zzabp.directExecutor()), new CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0(5, this, arrayList), zzabp.directExecutor()), new Futures$$ExternalSyntheticLambda0(cameraCapturePipelineAsync, 2), zzabp.directExecutor()))), true, zzabp.directExecutor());
            default:
                return cameraControlInternal.submitStillCaptureRequests(arrayList, i, i2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdapterCameraControl(CameraControlInternal cameraControlInternal) {
        this(cameraControlInternal, (byte) 0);
        this.$r8$classId = 0;
        this.mCameraControl = cameraControlInternal;
    }

    public AdapterCameraControl(CameraControlInternal cameraControlInternal, byte b) {
        this.mCameraControlInternal = cameraControlInternal;
    }
}
