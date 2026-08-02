package androidx.camera.viewfinder.core;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class TransformationInfo {
    public final float cropRectBottom;
    public final float cropRectLeft;
    public final float cropRectRight;
    public final float cropRectTop;
    public final boolean isSourceMirroredHorizontally;
    public final int sourceRotation;

    public TransformationInfo(float f, float f2, float f3, float f4, int i, boolean z) {
        this.sourceRotation = i;
        this.isSourceMirroredHorizontally = z;
        this.cropRectLeft = f;
        this.cropRectTop = f2;
        this.cropRectRight = f3;
        this.cropRectBottom = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransformationInfo)) {
            return false;
        }
        TransformationInfo transformationInfo = (TransformationInfo) obj;
        return this.sourceRotation == transformationInfo.sourceRotation && this.isSourceMirroredHorizontally == transformationInfo.isSourceMirroredHorizontally && this.cropRectLeft == transformationInfo.cropRectLeft && this.cropRectTop == transformationInfo.cropRectTop && this.cropRectRight == transformationInfo.cropRectRight && this.cropRectBottom == transformationInfo.cropRectBottom;
    }

    public final int hashCode() {
        return Float.hashCode(this.cropRectBottom) + CameraState$Type$EnumUnboxingLocalUtility.m(this.cropRectRight, CameraState$Type$EnumUnboxingLocalUtility.m(this.cropRectTop, CameraState$Type$EnumUnboxingLocalUtility.m(this.cropRectLeft, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.sourceRotation * 31, 31, this.isSourceMirroredHorizontally), 31, false), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformationInfo(sourceRotation=");
        sb.append(this.sourceRotation);
        sb.append(", isSourceMirroredHorizontally=");
        sb.append(this.isSourceMirroredHorizontally);
        sb.append(", isSourceMirroredVertically=false, cropRectLeft=");
        sb.append(this.cropRectLeft);
        sb.append(", cropRectTop=");
        sb.append(this.cropRectTop);
        sb.append(", cropRectRight=");
        sb.append(this.cropRectRight);
        sb.append(", cropRectBottom=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.cropRectBottom, ')');
    }
}
