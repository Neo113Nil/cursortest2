package androidx.camera.core.internal;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.core.ImageInfo;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.utils.ExifData;

/* loaded from: classes3.dex */
public final class CameraCaptureResultImageInfo implements ImageInfo {
    public final CameraCaptureResult mCameraCaptureResult;

    public CameraCaptureResultImageInfo(CameraCaptureResult cameraCaptureResult) {
        this.mCameraCaptureResult = cameraCaptureResult;
    }

    @Override // androidx.camera.core.ImageInfo
    public final int getFlashState() {
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(this.mCameraCaptureResult.getFlashState());
        if (ordinal == 1) {
            return 2;
        }
        if (ordinal != 2) {
            return ordinal != 3 ? 0 : 1;
        }
        return 3;
    }

    @Override // androidx.camera.core.ImageInfo
    public final int getRotationDegrees() {
        return 0;
    }

    @Override // androidx.camera.core.ImageInfo
    public final TagBundle getTagBundle() {
        return this.mCameraCaptureResult.getTagBundle();
    }

    @Override // androidx.camera.core.ImageInfo
    public final long getTimestamp() {
        return this.mCameraCaptureResult.getTimestamp();
    }

    @Override // androidx.camera.core.ImageInfo
    public final void populateExifData(ExifData.Builder builder) {
        this.mCameraCaptureResult.populateExifData(builder);
    }
}
