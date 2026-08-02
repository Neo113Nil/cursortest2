package androidx.camera.video;

import androidx.camera.core.SurfaceRequest;

/* loaded from: classes3.dex */
public final /* synthetic */ class VideoCapture$Defaults$$ExternalSyntheticLambda0 implements VideoOutput {
    @Override // androidx.camera.video.VideoOutput
    public final void onSurfaceRequested(SurfaceRequest surfaceRequest) {
        surfaceRequest.willNotProvideSurface();
    }
}
