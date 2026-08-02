package androidx.camera.core.streamsharing;

import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.ForwardingCameraInfo;
import androidx.camera.core.impl.utils.TransformUtils;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class VirtualCameraInfo extends ForwardingCameraInfo {
    public final String mVirtualCameraId;
    public int mVirtualCameraRotationDegrees;

    public VirtualCameraInfo(CameraInfoInternal cameraInfoInternal) {
        super(cameraInfoInternal);
        this.mVirtualCameraId = "virtual-" + cameraInfoInternal.getCameraId() + "-" + UUID.randomUUID().toString();
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.impl.CameraInfoInternal
    public final String getCameraId() {
        return this.mVirtualCameraId;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    public final int getSensorRotationDegrees(int i) {
        return TransformUtils.within360(super.getSensorRotationDegrees(i) - this.mVirtualCameraRotationDegrees);
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    public final int getSensorRotationDegrees() {
        return getSensorRotationDegrees(0);
    }
}
