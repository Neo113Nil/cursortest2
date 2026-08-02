package androidx.camera.core.impl;

import android.graphics.Rect;
import android.util.Range;
import androidx.camera.core.CameraSelector;
import androidx.camera.view.PreviewStreamStateObserver;
import androidx.lifecycle.LiveData;
import com.fillr.n;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public abstract class ForwardingCameraInfo implements CameraInfoInternal {
    public final CameraInfoInternal mCameraInfoInternal;

    public ForwardingCameraInfo(CameraInfoInternal cameraInfoInternal) {
        this.mCameraInfoInternal = cameraInfoInternal;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final void addSessionCaptureCallback(Executor executor, PreviewStreamStateObserver.AnonymousClass2 anonymousClass2) {
        this.mCameraInfoInternal.addSessionCaptureCallback(executor, anonymousClass2);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final Set getAvailableCapabilities() {
        return this.mCameraInfoInternal.getAvailableCapabilities();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final Object getCameraCharacteristics() {
        return this.mCameraInfoInternal.getCameraCharacteristics();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public String getCameraId() {
        return this.mCameraInfoInternal.getCameraId();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final Quirks getCameraQuirks() {
        return this.mCameraInfoInternal.getCameraQuirks();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal, androidx.camera.core.CameraInfo
    public final CameraSelector getCameraSelector() {
        return this.mCameraInfoInternal.getCameraSelector();
    }

    @Override // androidx.camera.core.CameraInfo
    public final LiveData getCameraState() {
        return this.mCameraInfoInternal.getCameraState();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final EncoderProfilesProvider getEncoderProfilesProvider() {
        return this.mCameraInfoInternal.getEncoderProfilesProvider();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public CameraInfoInternal getImplementation() {
        return this.mCameraInfoInternal.getImplementation();
    }

    @Override // androidx.camera.core.CameraInfo
    public final String getImplementationType() {
        return this.mCameraInfoInternal.getImplementationType();
    }

    @Override // androidx.camera.core.CameraInfo
    public final int getLensFacing() {
        return this.mCameraInfoInternal.getLensFacing();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final Rect getSensorRect() {
        return this.mCameraInfoInternal.getSensorRect();
    }

    @Override // androidx.camera.core.CameraInfo
    public int getSensorRotationDegrees() {
        return this.mCameraInfoInternal.getSensorRotationDegrees();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final Set getSupportedDynamicRanges() {
        return this.mCameraInfoInternal.getSupportedDynamicRanges();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final List getSupportedHighSpeedResolutions() {
        return this.mCameraInfoInternal.getSupportedHighSpeedResolutions();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final List getSupportedHighSpeedResolutionsFor(Range range) {
        return this.mCameraInfoInternal.getSupportedHighSpeedResolutionsFor(range);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final Set getSupportedOutputFormats() {
        return this.mCameraInfoInternal.getSupportedOutputFormats();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final List getSupportedResolutions(int i) {
        return this.mCameraInfoInternal.getSupportedResolutions(i);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final Timebase getTimebase() {
        return this.mCameraInfoInternal.getTimebase();
    }

    @Override // androidx.camera.core.CameraInfo
    public LiveData getTorchState() {
        return this.mCameraInfoInternal.getTorchState();
    }

    @Override // androidx.camera.core.CameraInfo
    public LiveData getZoomState() {
        return this.mCameraInfoInternal.getZoomState();
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean hasFlashUnit() {
        return this.mCameraInfoInternal.hasFlashUnit();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final boolean isExternalCamera() {
        return this.mCameraInfoInternal.isExternalCamera();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final boolean isHighSpeedSupported() {
        return this.mCameraInfoInternal.isHighSpeedSupported();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public boolean isPreviewStabilizationSupported() {
        return this.mCameraInfoInternal.isPreviewStabilizationSupported();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public boolean isVideoStabilizationSupported() {
        return this.mCameraInfoInternal.isVideoStabilizationSupported();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final void removeSessionCaptureCallback(CameraCaptureCallback cameraCaptureCallback) {
        this.mCameraInfoInternal.removeSessionCaptureCallback(cameraCaptureCallback);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final void setCameraUseCaseAdapterProvider(n nVar) {
        this.mCameraInfoInternal.setCameraUseCaseAdapterProvider(nVar);
    }

    @Override // androidx.camera.core.CameraInfo
    public int getSensorRotationDegrees(int i) {
        return this.mCameraInfoInternal.getSensorRotationDegrees(i);
    }
}
