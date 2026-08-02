package androidx.camera.core;

/* loaded from: classes3.dex */
public final /* synthetic */ class SurfaceRequest$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SurfaceRequest f$0;

    public /* synthetic */ SurfaceRequest$$ExternalSyntheticLambda1(SurfaceRequest surfaceRequest, int i) {
        this.$r8$classId = i;
        this.f$0 = surfaceRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        SurfaceRequest surfaceRequest = this.f$0;
        switch (i) {
            case 0:
                surfaceRequest.mSurfaceFuture.cancel(true);
                break;
            default:
                surfaceRequest.willNotProvideSurface();
                break;
        }
    }
}
