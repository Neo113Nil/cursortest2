package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.CameraInternal;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class AutoValue_SurfaceOutput_CameraInputInfo {
    public final CameraInternal cameraInternal;
    public final Rect inputCropRect;
    public final Size inputSize;
    public final boolean mirroring;
    public final int rotationDegrees;

    public AutoValue_SurfaceOutput_CameraInputInfo(Size size, Rect rect, CameraInternal cameraInternal, int i, boolean z) {
        if (size == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null inputSize");
            throw null;
        }
        this.inputSize = size;
        if (rect == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null inputCropRect");
            throw null;
        }
        this.inputCropRect = rect;
        this.cameraInternal = cameraInternal;
        this.rotationDegrees = i;
        this.mirroring = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutoValue_SurfaceOutput_CameraInputInfo) {
            AutoValue_SurfaceOutput_CameraInputInfo autoValue_SurfaceOutput_CameraInputInfo = (AutoValue_SurfaceOutput_CameraInputInfo) obj;
            if (this.inputSize.equals(autoValue_SurfaceOutput_CameraInputInfo.inputSize) && this.inputCropRect.equals(autoValue_SurfaceOutput_CameraInputInfo.inputCropRect)) {
                CameraInternal cameraInternal = autoValue_SurfaceOutput_CameraInputInfo.cameraInternal;
                CameraInternal cameraInternal2 = this.cameraInternal;
                if (cameraInternal2 != null ? cameraInternal2.equals(cameraInternal) : cameraInternal == null) {
                    if (this.rotationDegrees == autoValue_SurfaceOutput_CameraInputInfo.rotationDegrees && this.mirroring == autoValue_SurfaceOutput_CameraInputInfo.mirroring) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.inputSize.hashCode() ^ 1000003) * 1000003) ^ this.inputCropRect.hashCode()) * 1000003;
        CameraInternal cameraInternal = this.cameraInternal;
        return (this.mirroring ? 1231 : 1237) ^ ((((hashCode ^ (cameraInternal == null ? 0 : cameraInternal.hashCode())) * 1000003) ^ this.rotationDegrees) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraInputInfo{inputSize=");
        sb.append(this.inputSize);
        sb.append(", inputCropRect=");
        sb.append(this.inputCropRect);
        sb.append(", cameraInternal=");
        sb.append(this.cameraInternal);
        sb.append(", rotationDegrees=");
        sb.append(this.rotationDegrees);
        sb.append(", mirroring=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.mirroring, "}");
    }
}
