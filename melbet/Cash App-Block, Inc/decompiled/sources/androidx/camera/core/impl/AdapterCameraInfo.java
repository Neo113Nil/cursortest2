package androidx.camera.core.impl;

import androidx.lifecycle.LiveData;

/* loaded from: classes3.dex */
public final class AdapterCameraInfo extends ForwardingCameraInfo {
    public final CameraConfig mCameraConfig;
    public final CameraInfoInternal mCameraInfo;

    public AdapterCameraInfo(CameraInfoInternal cameraInfoInternal, CameraConfig cameraConfig) {
        super(cameraInfoInternal);
        this.mCameraInfo = cameraInfoInternal;
        this.mCameraConfig = cameraConfig;
        cameraConfig.getSessionProcessor();
        AutoValue_Config_Option autoValue_Config_Option = CameraConfig.OPTION_POSTVIEW_SUPPORTED;
        Boolean bool = Boolean.FALSE;
        ((Boolean) cameraConfig.retrieveOption(autoValue_Config_Option, bool)).getClass();
        ((Boolean) cameraConfig.retrieveOption(CameraConfig.OPTION_CAPTURE_PROCESS_PROGRESS_SUPPORTED, bool)).getClass();
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.impl.CameraInfoInternal
    public final CameraInfoInternal getImplementation() {
        return this.mCameraInfo;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    public final LiveData getTorchState() {
        return this.mCameraInfo.getTorchState();
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    public final LiveData getZoomState() {
        return this.mCameraInfo.getZoomState();
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    public final boolean hasFlashUnit() {
        return this.mCameraInfo.hasFlashUnit();
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.impl.CameraInfoInternal
    public final boolean isPreviewStabilizationSupported() {
        return this.mCameraInfoInternal.isPreviewStabilizationSupported();
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.impl.CameraInfoInternal
    public final boolean isVideoStabilizationSupported() {
        return this.mCameraInfoInternal.isVideoStabilizationSupported();
    }
}
