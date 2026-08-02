package androidx.camera.core.streamsharing;

import androidx.camera.core.UseCase;
import androidx.camera.core.impl.AdapterCameraControl;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.Threads;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes3.dex */
public final class VirtualCamera implements CameraInternal {
    public final CameraInternal mParentCamera;
    public final VirtualCameraAdapter mStateChangeCallback;
    public final AdapterCameraControl mVirtualCameraControl;
    public final VirtualCameraInfo mVirtualCameraInfo;

    public VirtualCamera(CameraInternal cameraInternal, VirtualCameraAdapter virtualCameraAdapter, StreamSharing$$ExternalSyntheticLambda1 streamSharing$$ExternalSyntheticLambda1) {
        this.mParentCamera = cameraInternal;
        this.mStateChangeCallback = virtualCameraAdapter;
        this.mVirtualCameraControl = new AdapterCameraControl(cameraInternal.getCameraControlInternal(), streamSharing$$ExternalSyntheticLambda1);
        this.mVirtualCameraInfo = new VirtualCameraInfo(cameraInternal.getCameraInfoInternal());
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void attachUseCases(Collection collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void detachUseCases(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final CameraControlInternal getCameraControlInternal() {
        return this.mVirtualCameraControl;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final CameraInfoInternal getCameraInfoInternal() {
        return this.mVirtualCameraInfo;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final Observable getCameraState() {
        return this.mParentCamera.getCameraState();
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final boolean getHasTransform() {
        return false;
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public final void onUseCaseActive(UseCase useCase) {
        Threads.checkMainThread();
        this.mStateChangeCallback.onUseCaseActive(useCase);
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public final void onUseCaseInactive(UseCase useCase) {
        Threads.checkMainThread();
        this.mStateChangeCallback.onUseCaseInactive(useCase);
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public final void onUseCaseReset(UseCase useCase) {
        Threads.checkMainThread();
        this.mStateChangeCallback.onUseCaseReset(useCase);
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public final void onUseCaseUpdated(UseCase useCase) {
        Threads.checkMainThread();
        this.mStateChangeCallback.onUseCaseUpdated(useCase);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final ListenableFuture release() {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }
}
