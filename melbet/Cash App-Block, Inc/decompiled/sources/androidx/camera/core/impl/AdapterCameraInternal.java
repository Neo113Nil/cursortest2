package androidx.camera.core.impl;

import androidx.camera.core.CameraInfo;
import androidx.camera.core.UseCase;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes3.dex */
public final class AdapterCameraInternal implements CameraInternal {
    public final AdapterCameraControl mAdapterCameraControl;
    public final AdapterCameraInfo mAdapterCameraInfo;
    public final CameraInternal mCameraInternal;

    public AdapterCameraInternal(CameraInternal cameraInternal, AdapterCameraInfo adapterCameraInfo) {
        this.mCameraInternal = cameraInternal;
        this.mAdapterCameraInfo = adapterCameraInfo;
        CameraConfig cameraConfig = adapterCameraInfo.mCameraConfig;
        CameraControlInternal cameraControlInternal = cameraInternal.getCameraControlInternal();
        cameraConfig.getSessionProcessor();
        this.mAdapterCameraControl = new AdapterCameraControl(cameraControlInternal);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void attachUseCases(Collection collection) {
        this.mCameraInternal.attachUseCases(collection);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void detachUseCases(ArrayList arrayList) {
        this.mCameraInternal.detachUseCases(arrayList);
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    public final CameraControlInternal getCameraControl() {
        return this.mAdapterCameraControl;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final CameraControlInternal getCameraControlInternal() {
        return this.mAdapterCameraControl;
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    public final CameraInfo getCameraInfo() {
        return this.mAdapterCameraInfo;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final CameraInfoInternal getCameraInfoInternal() {
        return this.mAdapterCameraInfo;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final Observable getCameraState() {
        return this.mCameraInternal.getCameraState();
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final CameraConfig getExtendedConfig() {
        return this.mCameraInternal.getExtendedConfig();
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final boolean getHasTransform() {
        return this.mCameraInternal.getHasTransform();
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final boolean isFrontFacing() {
        return this.mCameraInternal.isFrontFacing();
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final boolean isRemoved() {
        return this.mCameraInternal.isRemoved();
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public final void onUseCaseActive(UseCase useCase) {
        this.mCameraInternal.onUseCaseActive(useCase);
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public final void onUseCaseInactive(UseCase useCase) {
        this.mCameraInternal.onUseCaseInactive(useCase);
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public final void onUseCaseReset(UseCase useCase) {
        this.mCameraInternal.onUseCaseReset(useCase);
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public final void onUseCaseUpdated(UseCase useCase) {
        this.mCameraInternal.onUseCaseUpdated(useCase);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final ListenableFuture release() {
        return this.mCameraInternal.release();
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void setActiveResumingMode(boolean z) {
        this.mCameraInternal.setActiveResumingMode(z);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void setExtendedConfig(CameraConfig cameraConfig) {
        this.mCameraInternal.setExtendedConfig(cameraConfig);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void setPrimary(boolean z) {
        this.mCameraInternal.setPrimary(z);
    }
}
