package androidx.camera.compose;

import androidx.camera.core.SurfaceRequest;
import androidx.camera.viewfinder.core.ImplementationMode;
import androidx.camera.viewfinder.core.TransformationInfo;

/* loaded from: classes3.dex */
public final class ViewfinderArgs {
    public final ImplementationMode implementationMode;
    public final SurfaceRequest surfaceRequest;
    public final TransformationInfo transformationInfo;

    public ViewfinderArgs(SurfaceRequest surfaceRequest, ImplementationMode implementationMode, TransformationInfo transformationInfo) {
        this.surfaceRequest = surfaceRequest;
        this.implementationMode = implementationMode;
        this.transformationInfo = transformationInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ViewfinderArgs) {
            ViewfinderArgs viewfinderArgs = (ViewfinderArgs) obj;
            if (this.surfaceRequest == viewfinderArgs.surfaceRequest && this.implementationMode == viewfinderArgs.implementationMode && this.transformationInfo.equals(viewfinderArgs.transformationInfo)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.transformationInfo.hashCode() + ((this.implementationMode.hashCode() + (this.surfaceRequest.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ViewfinderArgs(surfaceRequest=" + this.surfaceRequest + ", implementationMode=" + this.implementationMode + ", transformationInfo=" + this.transformationInfo + ')';
    }
}
