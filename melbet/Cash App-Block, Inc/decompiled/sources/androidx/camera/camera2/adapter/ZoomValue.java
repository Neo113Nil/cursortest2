package androidx.camera.camera2.adapter;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;

/* loaded from: classes3.dex */
public final class ZoomValue {
    public final float maxZoomRatio;
    public final float minZoomRatio;
    public final float zoomRatio;

    public ZoomValue(float f, float f2, float f3) {
        this.zoomRatio = f;
        this.minZoomRatio = f2;
        this.maxZoomRatio = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZoomValue)) {
            return false;
        }
        ZoomValue zoomValue = (ZoomValue) obj;
        return Float.compare(this.zoomRatio, zoomValue.zoomRatio) == 0 && Float.compare(this.minZoomRatio, zoomValue.minZoomRatio) == 0 && Float.compare(this.maxZoomRatio, zoomValue.maxZoomRatio) == 0;
    }

    public final float getZoomRatio() {
        return this.zoomRatio;
    }

    public final int hashCode() {
        return Float.hashCode(this.maxZoomRatio) + CameraState$Type$EnumUnboxingLocalUtility.m(this.minZoomRatio, Float.hashCode(this.zoomRatio) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ZoomValue(zoomRatio=");
        sb.append(this.zoomRatio);
        sb.append(", minZoomRatio=");
        sb.append(this.minZoomRatio);
        sb.append(", maxZoomRatio=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.maxZoomRatio, ')');
    }
}
