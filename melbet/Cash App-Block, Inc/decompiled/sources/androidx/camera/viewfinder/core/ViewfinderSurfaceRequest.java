package androidx.camera.viewfinder.core;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class ViewfinderSurfaceRequest {
    public final int height;
    public final ImplementationMode implementationMode;
    public final String requestId;
    public final int width;

    public ViewfinderSurfaceRequest(int i, int i2, ImplementationMode implementationMode, String str) {
        this.width = i;
        this.height = i2;
        this.implementationMode = implementationMode;
        this.requestId = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewfinderSurfaceRequest)) {
            return false;
        }
        ViewfinderSurfaceRequest viewfinderSurfaceRequest = (ViewfinderSurfaceRequest) obj;
        return this.width == viewfinderSurfaceRequest.width && this.height == viewfinderSurfaceRequest.height && this.implementationMode == viewfinderSurfaceRequest.implementationMode && this.requestId.equals(viewfinderSurfaceRequest.requestId);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.height, Integer.hashCode(this.width) * 31, 31);
        ImplementationMode implementationMode = this.implementationMode;
        return this.requestId.hashCode() + ((m + (implementationMode != null ? implementationMode.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewfinderSurfaceRequest(width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", implementationMode=");
        sb.append(this.implementationMode);
        sb.append(", requestId=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.requestId, ')');
    }
}
