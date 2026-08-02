package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class AutoValue_SurfaceRequest_TransformationInfo {
    public final Rect getCropRect;
    public final int getRotationDegrees;
    public final Matrix getSensorToBufferTransform;
    public final int getTargetRotation;
    public final boolean hasCameraTransform;
    public final boolean isMirroring;

    public AutoValue_SurfaceRequest_TransformationInfo(Rect rect, int i, int i2, boolean z, Matrix matrix, boolean z2) {
        if (rect == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null getCropRect");
            throw null;
        }
        this.getCropRect = rect;
        this.getRotationDegrees = i;
        this.getTargetRotation = i2;
        this.hasCameraTransform = z;
        if (matrix == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null getSensorToBufferTransform");
            throw null;
        }
        this.getSensorToBufferTransform = matrix;
        this.isMirroring = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutoValue_SurfaceRequest_TransformationInfo) {
            AutoValue_SurfaceRequest_TransformationInfo autoValue_SurfaceRequest_TransformationInfo = (AutoValue_SurfaceRequest_TransformationInfo) obj;
            if (this.getCropRect.equals(autoValue_SurfaceRequest_TransformationInfo.getCropRect) && this.getRotationDegrees == autoValue_SurfaceRequest_TransformationInfo.getRotationDegrees && this.getTargetRotation == autoValue_SurfaceRequest_TransformationInfo.getTargetRotation && this.hasCameraTransform == autoValue_SurfaceRequest_TransformationInfo.hasCameraTransform && this.getSensorToBufferTransform.equals(autoValue_SurfaceRequest_TransformationInfo.getSensorToBufferTransform) && this.isMirroring == autoValue_SurfaceRequest_TransformationInfo.isMirroring) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.getCropRect.hashCode() ^ 1000003) * 1000003) ^ this.getRotationDegrees) * 1000003) ^ this.getTargetRotation) * 1000003) ^ (this.hasCameraTransform ? 1231 : 1237)) * 1000003) ^ this.getSensorToBufferTransform.hashCode()) * 1000003) ^ (this.isMirroring ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformationInfo{getCropRect=");
        sb.append(this.getCropRect);
        sb.append(", getRotationDegrees=");
        sb.append(this.getRotationDegrees);
        sb.append(", getTargetRotation=");
        sb.append(this.getTargetRotation);
        sb.append(", hasCameraTransform=");
        sb.append(this.hasCameraTransform);
        sb.append(", getSensorToBufferTransform=");
        sb.append(this.getSensorToBufferTransform);
        sb.append(", isMirroring=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isMirroring, "}");
    }
}
