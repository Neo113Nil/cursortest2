package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.graph.GraphProcessorImpl;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;

/* loaded from: classes3.dex */
public final class RequestOpen extends CameraRequest {
    public final GraphProcessorImpl graphListener;
    public final Camera2CameraController$$ExternalSyntheticLambda1 isForegroundObserver;
    public final List sharedCameraIds;
    public final VirtualCameraState virtualCamera;

    public RequestOpen(VirtualCameraState virtualCameraState, List list, GraphProcessorImpl graphProcessorImpl, Camera2CameraController$$ExternalSyntheticLambda1 camera2CameraController$$ExternalSyntheticLambda1) {
        this.virtualCamera = virtualCameraState;
        this.sharedCameraIds = list;
        this.graphListener = graphProcessorImpl;
        this.isForegroundObserver = camera2CameraController$$ExternalSyntheticLambda1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RequestOpen) {
            RequestOpen requestOpen = (RequestOpen) obj;
            return this.virtualCamera == requestOpen.virtualCamera && this.sharedCameraIds.equals(requestOpen.sharedCameraIds) && this.graphListener == requestOpen.graphListener && this.isForegroundObserver == requestOpen.isForegroundObserver;
        }
        return false;
    }

    public final int hashCode() {
        return this.isForegroundObserver.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.graphListener.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.virtualCamera.hashCode() * 31, 31, this.sharedCameraIds)) * 31, 31, false);
    }

    public final String toString() {
        return "RequestOpen(virtualCamera=" + this.virtualCamera + ", sharedCameraIds=" + this.sharedCameraIds + ", graphListener=" + this.graphListener + ", isPrewarm=false, isForegroundObserver=" + this.isForegroundObserver + ')';
    }
}
